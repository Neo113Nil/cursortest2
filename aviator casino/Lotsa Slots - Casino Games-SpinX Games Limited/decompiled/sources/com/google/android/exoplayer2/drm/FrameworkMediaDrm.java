package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class FrameworkMediaDrm implements com.google.android.exoplayer2.drm.ExoMediaDrm {
    private static final java.lang.String CENC_SCHEME_MIME_TYPE = "cenc";
    public static final com.google.android.exoplayer2.drm.ExoMediaDrm.Provider DEFAULT_PROVIDER = new com.google.android.exoplayer2.drm.ExoMediaDrm.Provider() { // from class: com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda1
        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
        public final com.google.android.exoplayer2.drm.ExoMediaDrm acquireExoMediaDrm(java.util.UUID uuid) {
            return com.google.android.exoplayer2.drm.FrameworkMediaDrm.lambda$static$0(uuid);
        }
    };
    private static final java.lang.String MOCK_LA_URL = "<LA_URL>https://x</LA_URL>";
    private static final java.lang.String MOCK_LA_URL_VALUE = "https://x";
    private static final java.lang.String TAG = "FrameworkMediaDrm";
    private static final int UTF_16_BYTES_PER_CHARACTER = 2;
    private final android.media.MediaDrm mediaDrm;
    private int referenceCount;
    private final java.util.UUID uuid;

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public int getCryptoType() {
        return 2;
    }

    static /* synthetic */ com.google.android.exoplayer2.drm.ExoMediaDrm lambda$static$0(java.util.UUID uuid) {
        try {
            return newInstance(uuid);
        } catch (com.google.android.exoplayer2.drm.UnsupportedDrmException unused) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new com.google.android.exoplayer2.drm.DummyExoMediaDrm();
        }
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID uuid) {
        return android.media.MediaDrm.isCryptoSchemeSupported(adjustUuid(uuid));
    }

    public static com.google.android.exoplayer2.drm.FrameworkMediaDrm newInstance(java.util.UUID uuid) throws com.google.android.exoplayer2.drm.UnsupportedDrmException {
        try {
            return new com.google.android.exoplayer2.drm.FrameworkMediaDrm(uuid);
        } catch (android.media.UnsupportedSchemeException e) {
            throw new com.google.android.exoplayer2.drm.UnsupportedDrmException(1, e);
        } catch (java.lang.Exception e2) {
            throw new com.google.android.exoplayer2.drm.UnsupportedDrmException(2, e2);
        }
    }

    private FrameworkMediaDrm(java.util.UUID uuid) throws android.media.UnsupportedSchemeException {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(uuid);
        com.google.android.exoplayer2.util.Assertions.checkArgument(!com.google.android.exoplayer2.C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        android.media.MediaDrm mediaDrm = new android.media.MediaDrm(adjustUuid(uuid));
        this.mediaDrm = mediaDrm;
        this.referenceCount = 1;
        if (com.google.android.exoplayer2.C.WIDEVINE_UUID.equals(uuid) && needsForceWidevineL3Workaround()) {
            forceWidevineL3(mediaDrm);
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnEventListener(final com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener onEventListener) {
        this.mediaDrm.setOnEventListener(onEventListener == null ? null : new android.media.MediaDrm.OnEventListener() { // from class: com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda3
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                com.google.android.exoplayer2.drm.FrameworkMediaDrm.this.m5403x6bb92dcc(onEventListener, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    /* renamed from: lambda$setOnEventListener$1$com-google-android-exoplayer2-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m5403x6bb92dcc(com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener onEventListener, android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        onEventListener.onEvent(this, bArr, i, i2, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(final com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 23) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener == null ? null : new android.media.MediaDrm.OnKeyStatusChangeListener() { // from class: com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda0
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(android.media.MediaDrm mediaDrm, byte[] bArr, java.util.List list, boolean z) {
                com.google.android.exoplayer2.drm.FrameworkMediaDrm.this.m5405x8be3cdb4(onKeyStatusChangeListener, mediaDrm, bArr, list, z);
            }
        }, (android.os.Handler) null);
    }

    /* renamed from: lambda$setOnKeyStatusChangeListener$2$com-google-android-exoplayer2-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m5405x8be3cdb4(com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, android.media.MediaDrm mediaDrm, byte[] bArr, java.util.List list, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.media.MediaDrm.KeyStatus keyStatus = (android.media.MediaDrm.KeyStatus) it.next();
            arrayList.add(new com.google.android.exoplayer2.drm.ExoMediaDrm.KeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        onKeyStatusChangeListener.onKeyStatusChange(this, bArr, arrayList, z);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnExpirationUpdateListener(final com.google.android.exoplayer2.drm.ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 23) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.mediaDrm.setOnExpirationUpdateListener(onExpirationUpdateListener == null ? null : new android.media.MediaDrm.OnExpirationUpdateListener() { // from class: com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticLambda2
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(android.media.MediaDrm mediaDrm, byte[] bArr, long j) {
                com.google.android.exoplayer2.drm.FrameworkMediaDrm.this.m5404x78401754(onExpirationUpdateListener, mediaDrm, bArr, j);
            }
        }, (android.os.Handler) null);
    }

    /* renamed from: lambda$setOnExpirationUpdateListener$3$com-google-android-exoplayer2-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m5404x78401754(com.google.android.exoplayer2.drm.ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, android.media.MediaDrm mediaDrm, byte[] bArr, long j) {
        onExpirationUpdateListener.onExpirationUpdate(this, bArr, j);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] openSession() throws android.media.MediaDrmException {
        return this.mediaDrm.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
        this.mediaDrm.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPlayerIdForSession(byte[] bArr, com.google.android.exoplayer2.analytics.PlayerId playerId) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 31) {
            try {
                com.google.android.exoplayer2.drm.FrameworkMediaDrm.Api31.setLogSessionIdOnMediaDrmSession(this.mediaDrm, bArr, playerId);
            } catch (java.lang.UnsupportedOperationException unused) {
                com.google.android.exoplayer2.util.Log.w(TAG, "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> list, int i, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws android.media.NotProvisionedException {
        com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        java.lang.String str;
        if (list != null) {
            schemeData = getSchemeData(this.uuid, list);
            bArr2 = adjustRequestInitData(this.uuid, (byte[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(schemeData.data));
            str = adjustRequestMimeType(this.uuid, schemeData.mimeType);
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        android.media.MediaDrm.KeyRequest keyRequest = this.mediaDrm.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] adjustRequestData = adjustRequestData(this.uuid, keyRequest.getData());
        java.lang.String adjustLicenseServerUrl = adjustLicenseServerUrl(keyRequest.getDefaultUrl());
        if (android.text.TextUtils.isEmpty(adjustLicenseServerUrl) && schemeData != null && !android.text.TextUtils.isEmpty(schemeData.licenseServerUrl)) {
            adjustLicenseServerUrl = schemeData.licenseServerUrl;
        }
        return new com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest(adjustRequestData, adjustLicenseServerUrl, com.google.android.exoplayer2.util.Util.SDK_INT >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    private static java.lang.String adjustLicenseServerUrl(java.lang.String str) {
        return MOCK_LA_URL.equals(str) ? "" : (com.google.android.exoplayer2.util.Util.SDK_INT == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws android.media.NotProvisionedException, android.media.DeniedByServerException {
        if (com.google.android.exoplayer2.C.CLEARKEY_UUID.equals(this.uuid)) {
            bArr2 = com.google.android.exoplayer2.drm.ClearKeyUtil.adjustResponseData(bArr2);
        }
        return this.mediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        android.media.MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        return new com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) throws android.media.DeniedByServerException {
        this.mediaDrm.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus(byte[] bArr) {
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] bArr, java.lang.String str) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 31) {
            return com.google.android.exoplayer2.drm.FrameworkMediaDrm.Api31.requiresSecureDecoder(this.mediaDrm, str);
        }
        try {
            android.media.MediaCrypto mediaCrypto = new android.media.MediaCrypto(this.uuid, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (android.media.MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void acquire() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.referenceCount > 0);
        this.referenceCount++;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void release() {
        int i = this.referenceCount - 1;
        this.referenceCount = i;
        if (i == 0) {
            this.mediaDrm.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public android.os.PersistableBundle getMetrics() {
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 28) {
            return null;
        }
        return this.mediaDrm.getMetrics();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public java.lang.String getPropertyString(java.lang.String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(java.lang.String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyString(java.lang.String str, java.lang.String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyByteArray(java.lang.String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public com.google.android.exoplayer2.drm.FrameworkCryptoConfig createCryptoConfig(byte[] bArr) throws android.media.MediaCryptoException {
        return new com.google.android.exoplayer2.drm.FrameworkCryptoConfig(adjustUuid(this.uuid), bArr, com.google.android.exoplayer2.util.Util.SDK_INT < 21 && com.google.android.exoplayer2.C.WIDEVINE_UUID.equals(this.uuid) && "L3".equals(getPropertyString("securityLevel")));
    }

    private static com.google.android.exoplayer2.drm.DrmInitData.SchemeData getSchemeData(java.util.UUID uuid, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> list) {
        if (!com.google.android.exoplayer2.C.WIDEVINE_UUID.equals(uuid)) {
            return list.get(0);
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 28 && list.size() > 1) {
            com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData = list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData2 = list.get(i2);
                byte[] bArr = (byte[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(schemeData2.data);
                if (com.google.android.exoplayer2.util.Util.areEqual(schemeData2.mimeType, schemeData.mimeType) && com.google.android.exoplayer2.util.Util.areEqual(schemeData2.licenseServerUrl, schemeData.licenseServerUrl) && com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.isPsshAtom(bArr)) {
                    i += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                byte[] bArr3 = (byte[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(list.get(i4).data);
                int length = bArr3.length;
                java.lang.System.arraycopy(bArr3, 0, bArr2, i3, length);
                i3 += length;
            }
            return schemeData.copyWithData(bArr2);
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData3 = list.get(i5);
            int parseVersion = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseVersion((byte[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(schemeData3.data));
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 23 && parseVersion == 0) {
                return schemeData3;
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23 && parseVersion == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    private static java.util.UUID adjustUuid(java.util.UUID uuid) {
        return (com.google.android.exoplayer2.util.Util.SDK_INT >= 27 || !com.google.android.exoplayer2.C.CLEARKEY_UUID.equals(uuid)) ? uuid : com.google.android.exoplayer2.C.COMMON_PSSH_UUID;
    }

    private static byte[] adjustRequestInitData(java.util.UUID uuid, byte[] bArr) {
        byte[] parseSchemeSpecificData;
        if (com.google.android.exoplayer2.C.PLAYREADY_UUID.equals(uuid)) {
            byte[] parseSchemeSpecificData2 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(bArr, uuid);
            if (parseSchemeSpecificData2 != null) {
                bArr = parseSchemeSpecificData2;
            }
            bArr = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(com.google.android.exoplayer2.C.PLAYREADY_UUID, addLaUrlAttributeIfMissing(bArr));
        }
        return (((com.google.android.exoplayer2.util.Util.SDK_INT >= 23 || !com.google.android.exoplayer2.C.WIDEVINE_UUID.equals(uuid)) && !(com.google.android.exoplayer2.C.PLAYREADY_UUID.equals(uuid) && "Amazon".equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) && ("AFTB".equals(com.google.android.exoplayer2.util.Util.MODEL) || "AFTS".equals(com.google.android.exoplayer2.util.Util.MODEL) || "AFTM".equals(com.google.android.exoplayer2.util.Util.MODEL) || "AFTT".equals(com.google.android.exoplayer2.util.Util.MODEL)))) || (parseSchemeSpecificData = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(bArr, uuid)) == null) ? bArr : parseSchemeSpecificData;
    }

    private static java.lang.String adjustRequestMimeType(java.util.UUID uuid, java.lang.String str) {
        return (com.google.android.exoplayer2.util.Util.SDK_INT < 26 && com.google.android.exoplayer2.C.CLEARKEY_UUID.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static byte[] adjustRequestData(java.util.UUID uuid, byte[] bArr) {
        return com.google.android.exoplayer2.C.CLEARKEY_UUID.equals(uuid) ? com.google.android.exoplayer2.drm.ClearKeyUtil.adjustRequestData(bArr) : bArr;
    }

    private static void forceWidevineL3(android.media.MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static boolean needsForceWidevineL3Workaround() {
        return "ASUS_Z00AD".equals(com.google.android.exoplayer2.util.Util.MODEL);
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] bArr) {
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(bArr);
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        short readLittleEndianShort = parsableByteArray.readLittleEndianShort();
        short readLittleEndianShort2 = parsableByteArray.readLittleEndianShort();
        if (readLittleEndianShort != 1 || readLittleEndianShort2 != 1) {
            com.google.android.exoplayer2.util.Log.i(TAG, "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        java.lang.String readString = parsableByteArray.readString(parsableByteArray.readLittleEndianShort(), com.google.common.base.Charsets.UTF_16LE);
        if (readString.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = readString.indexOf("</DATA>");
        if (indexOf == -1) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        java.lang.String str = readString.substring(0, indexOf) + MOCK_LA_URL + readString.substring(indexOf);
        int i = readLittleEndianInt + 52;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i);
        allocate.putShort(readLittleEndianShort);
        allocate.putShort(readLittleEndianShort2);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(com.google.common.base.Charsets.UTF_16LE));
        return allocate.array();
    }

    private static class Api31 {
        private Api31() {
        }

        public static boolean requiresSecureDecoder(android.media.MediaDrm mediaDrm, java.lang.String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void setLogSessionIdOnMediaDrmSession(android.media.MediaDrm mediaDrm, byte[] bArr, com.google.android.exoplayer2.analytics.PlayerId playerId) {
            android.media.metrics.LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((android.media.MediaDrm.PlaybackComponent) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionId);
        }
    }
}
