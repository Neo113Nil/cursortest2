package androidx.media3.exoplayer.drm;

/* loaded from: classes2.dex */
public final class FrameworkMediaDrm implements androidx.media3.exoplayer.drm.ExoMediaDrm {
    private static final java.lang.String CENC_SCHEME_MIME_TYPE = "cenc";
    public static final androidx.media3.exoplayer.drm.ExoMediaDrm.Provider DEFAULT_PROVIDER = new androidx.media3.exoplayer.drm.ExoMediaDrm.Provider() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda0
        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
        public final androidx.media3.exoplayer.drm.ExoMediaDrm acquireExoMediaDrm(java.util.UUID uuid) {
            return androidx.media3.exoplayer.drm.FrameworkMediaDrm.lambda$static$0(uuid);
        }
    };
    private static final java.lang.String MOCK_LA_URL = "<LA_URL>https://x</LA_URL>";
    private static final java.lang.String MOCK_LA_URL_VALUE = "https://x";
    private static final java.lang.String TAG = "FrameworkMediaDrm";
    private static final int UTF_16_BYTES_PER_CHARACTER = 2;
    private final android.media.MediaDrm mediaDrm;
    private int referenceCount;
    private final java.util.UUID uuid;

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public int getCryptoType() {
        return 2;
    }

    static /* synthetic */ androidx.media3.exoplayer.drm.ExoMediaDrm lambda$static$0(java.util.UUID uuid) {
        try {
            return newInstance(uuid);
        } catch (androidx.media3.exoplayer.drm.UnsupportedDrmException unused) {
            androidx.media3.common.util.Log.e(TAG, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new androidx.media3.exoplayer.drm.DummyExoMediaDrm();
        }
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID uuid) {
        return android.media.MediaDrm.isCryptoSchemeSupported(adjustUuid(uuid));
    }

    public static androidx.media3.exoplayer.drm.FrameworkMediaDrm newInstance(java.util.UUID uuid) throws androidx.media3.exoplayer.drm.UnsupportedDrmException {
        try {
            return new androidx.media3.exoplayer.drm.FrameworkMediaDrm(uuid);
        } catch (android.media.UnsupportedSchemeException e) {
            throw new androidx.media3.exoplayer.drm.UnsupportedDrmException(1, e);
        } catch (java.lang.Exception e2) {
            throw new androidx.media3.exoplayer.drm.UnsupportedDrmException(2, e2);
        }
    }

    private FrameworkMediaDrm(java.util.UUID uuid) throws android.media.UnsupportedSchemeException {
        androidx.media3.common.util.Assertions.checkNotNull(uuid);
        androidx.media3.common.util.Assertions.checkArgument(!androidx.media3.common.C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        android.media.MediaDrm mediaDrm = new android.media.MediaDrm(adjustUuid(uuid));
        this.mediaDrm = mediaDrm;
        this.referenceCount = 1;
        if (androidx.media3.common.C.WIDEVINE_UUID.equals(uuid) && needsForceWidevineL3Workaround()) {
            forceWidevineL3(mediaDrm);
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnEventListener(final androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener onEventListener) {
        this.mediaDrm.setOnEventListener(onEventListener == null ? null : new android.media.MediaDrm.OnEventListener() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda2
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                androidx.media3.exoplayer.drm.FrameworkMediaDrm.this.m4846x5e84e274(onEventListener, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    /* renamed from: lambda$setOnEventListener$1$androidx-media3-exoplayer-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m4846x5e84e274(androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener onEventListener, android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        onEventListener.onEvent(this, bArr, i, i2, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(final androidx.media3.exoplayer.drm.ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        if (androidx.media3.common.util.Util.SDK_INT < 23) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener == null ? null : new android.media.MediaDrm.OnKeyStatusChangeListener() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda3
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(android.media.MediaDrm mediaDrm, byte[] bArr, java.util.List list, boolean z) {
                androidx.media3.exoplayer.drm.FrameworkMediaDrm.this.m4848xc78bb65c(onKeyStatusChangeListener, mediaDrm, bArr, list, z);
            }
        }, (android.os.Handler) null);
    }

    /* renamed from: lambda$setOnKeyStatusChangeListener$2$androidx-media3-exoplayer-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m4848xc78bb65c(androidx.media3.exoplayer.drm.ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, android.media.MediaDrm mediaDrm, byte[] bArr, java.util.List list, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.media.MediaDrm.KeyStatus keyStatus = (android.media.MediaDrm.KeyStatus) it.next();
            arrayList.add(new androidx.media3.exoplayer.drm.ExoMediaDrm.KeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        onKeyStatusChangeListener.onKeyStatusChange(this, bArr, arrayList, z);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnExpirationUpdateListener(final androidx.media3.exoplayer.drm.ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
        if (androidx.media3.common.util.Util.SDK_INT < 23) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.mediaDrm.setOnExpirationUpdateListener(onExpirationUpdateListener == null ? null : new android.media.MediaDrm.OnExpirationUpdateListener() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda1
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(android.media.MediaDrm mediaDrm, byte[] bArr, long j) {
                androidx.media3.exoplayer.drm.FrameworkMediaDrm.this.m4847x3bcdcffc(onExpirationUpdateListener, mediaDrm, bArr, j);
            }
        }, (android.os.Handler) null);
    }

    /* renamed from: lambda$setOnExpirationUpdateListener$3$androidx-media3-exoplayer-drm-FrameworkMediaDrm, reason: not valid java name */
    /* synthetic */ void m4847x3bcdcffc(androidx.media3.exoplayer.drm.ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, android.media.MediaDrm mediaDrm, byte[] bArr, long j) {
        onExpirationUpdateListener.onExpirationUpdate(this, bArr, j);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] openSession() throws android.media.MediaDrmException {
        return this.mediaDrm.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
        this.mediaDrm.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPlayerIdForSession(byte[] bArr, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            try {
                androidx.media3.exoplayer.drm.FrameworkMediaDrm.Api31.setLogSessionIdOnMediaDrmSession(this.mediaDrm, bArr, playerId);
            } catch (java.lang.UnsupportedOperationException unused) {
                androidx.media3.common.util.Log.w(TAG, "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, int i, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws android.media.NotProvisionedException {
        androidx.media3.common.DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        java.lang.String str;
        if (list != null) {
            schemeData = getSchemeData(this.uuid, list);
            bArr2 = adjustRequestInitData(this.uuid, (byte[]) androidx.media3.common.util.Assertions.checkNotNull(schemeData.data));
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
        return new androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest(adjustRequestData, adjustLicenseServerUrl, androidx.media3.common.util.Util.SDK_INT >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    private java.lang.String adjustLicenseServerUrl(java.lang.String str) {
        if (MOCK_LA_URL.equals(str)) {
            return "";
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 33 && "https://default.url".equals(str)) {
            java.lang.String propertyString = getPropertyString("version");
            if (java.util.Objects.equals(propertyString, "1.2") || java.util.Objects.equals(propertyString, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws android.media.NotProvisionedException, android.media.DeniedByServerException {
        if (androidx.media3.common.C.CLEARKEY_UUID.equals(this.uuid)) {
            bArr2 = androidx.media3.exoplayer.drm.ClearKeyUtil.adjustResponseData(bArr2);
        }
        return this.mediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        android.media.MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        return new androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) throws android.media.DeniedByServerException {
        this.mediaDrm.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus(byte[] bArr) {
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r4 != false) goto L23;
     */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean requiresSecureDecoder(byte[] bArr, java.lang.String str) {
        boolean requiresSecureDecoderComponent;
        if (androidx.media3.common.util.Util.SDK_INT >= 31 && isMediaDrmRequiresSecureDecoderImplemented()) {
            requiresSecureDecoderComponent = androidx.media3.exoplayer.drm.FrameworkMediaDrm.Api31.requiresSecureDecoder(this.mediaDrm, str);
        } else {
            android.media.MediaCrypto mediaCrypto = null;
            try {
                android.media.MediaCrypto mediaCrypto2 = new android.media.MediaCrypto(this.uuid, bArr);
                try {
                    requiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (android.media.MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return !shouldForceAllowInsecureDecoderComponents();
                } catch (java.lang.Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (android.media.MediaCryptoException unused2) {
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public synchronized void acquire() {
        androidx.media3.common.util.Assertions.checkState(this.referenceCount > 0);
        this.referenceCount++;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public synchronized void release() {
        int i = this.referenceCount - 1;
        this.referenceCount = i;
        if (i == 0) {
            this.mediaDrm.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void removeOfflineLicense(byte[] bArr) {
        if (androidx.media3.common.util.Util.SDK_INT < 29) {
            throw new java.lang.UnsupportedOperationException();
        }
        this.mediaDrm.removeOfflineLicense(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public java.util.List<byte[]> getOfflineLicenseKeySetIds() {
        if (androidx.media3.common.util.Util.SDK_INT < 29) {
            throw new java.lang.UnsupportedOperationException();
        }
        return this.mediaDrm.getOfflineLicenseKeySetIds();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public android.os.PersistableBundle getMetrics() {
        if (androidx.media3.common.util.Util.SDK_INT < 28) {
            return null;
        }
        return this.mediaDrm.getMetrics();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public java.lang.String getPropertyString(java.lang.String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(java.lang.String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyString(java.lang.String str, java.lang.String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyByteArray(java.lang.String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public androidx.media3.exoplayer.drm.FrameworkCryptoConfig createCryptoConfig(byte[] bArr) throws android.media.MediaCryptoException {
        return new androidx.media3.exoplayer.drm.FrameworkCryptoConfig(adjustUuid(this.uuid), bArr, shouldForceAllowInsecureDecoderComponents());
    }

    private boolean shouldForceAllowInsecureDecoderComponents() {
        return androidx.media3.common.util.Util.SDK_INT < 21 && androidx.media3.common.C.WIDEVINE_UUID.equals(this.uuid) && "L3".equals(getPropertyString("securityLevel"));
    }

    private boolean isMediaDrmRequiresSecureDecoderImplemented() {
        if (this.uuid.equals(androidx.media3.common.C.WIDEVINE_UUID)) {
            java.lang.String propertyString = getPropertyString("version");
            return (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
        }
        return this.uuid.equals(androidx.media3.common.C.CLEARKEY_UUID);
    }

    private static androidx.media3.common.DrmInitData.SchemeData getSchemeData(java.util.UUID uuid, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list) {
        if (!androidx.media3.common.C.WIDEVINE_UUID.equals(uuid)) {
            return list.get(0);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 28 && list.size() > 1) {
            androidx.media3.common.DrmInitData.SchemeData schemeData = list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                androidx.media3.common.DrmInitData.SchemeData schemeData2 = list.get(i2);
                byte[] bArr = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(schemeData2.data);
                if (androidx.media3.common.util.Util.areEqual(schemeData2.mimeType, schemeData.mimeType) && androidx.media3.common.util.Util.areEqual(schemeData2.licenseServerUrl, schemeData.licenseServerUrl) && androidx.media3.extractor.mp4.PsshAtomUtil.isPsshAtom(bArr)) {
                    i += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                byte[] bArr3 = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(list.get(i4).data);
                int length = bArr3.length;
                java.lang.System.arraycopy(bArr3, 0, bArr2, i3, length);
                i3 += length;
            }
            return schemeData.copyWithData(bArr2);
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            androidx.media3.common.DrmInitData.SchemeData schemeData3 = list.get(i5);
            int parseVersion = androidx.media3.extractor.mp4.PsshAtomUtil.parseVersion((byte[]) androidx.media3.common.util.Assertions.checkNotNull(schemeData3.data));
            if (androidx.media3.common.util.Util.SDK_INT < 23 && parseVersion == 0) {
                return schemeData3;
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 23 && parseVersion == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    private static java.util.UUID adjustUuid(java.util.UUID uuid) {
        return (androidx.media3.common.util.Util.SDK_INT >= 27 || !androidx.media3.common.C.CLEARKEY_UUID.equals(uuid)) ? uuid : androidx.media3.common.C.COMMON_PSSH_UUID;
    }

    private static byte[] adjustRequestInitData(java.util.UUID uuid, byte[] bArr) {
        byte[] parseSchemeSpecificData;
        if (androidx.media3.common.C.PLAYREADY_UUID.equals(uuid)) {
            byte[] parseSchemeSpecificData2 = androidx.media3.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(bArr, uuid);
            if (parseSchemeSpecificData2 != null) {
                bArr = parseSchemeSpecificData2;
            }
            bArr = androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(androidx.media3.common.C.PLAYREADY_UUID, addLaUrlAttributeIfMissing(bArr));
        }
        return (((androidx.media3.common.util.Util.SDK_INT >= 23 || !androidx.media3.common.C.WIDEVINE_UUID.equals(uuid)) && !(androidx.media3.common.C.PLAYREADY_UUID.equals(uuid) && "Amazon".equals(androidx.media3.common.util.Util.MANUFACTURER) && ("AFTB".equals(androidx.media3.common.util.Util.MODEL) || "AFTS".equals(androidx.media3.common.util.Util.MODEL) || "AFTM".equals(androidx.media3.common.util.Util.MODEL) || "AFTT".equals(androidx.media3.common.util.Util.MODEL)))) || (parseSchemeSpecificData = androidx.media3.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(bArr, uuid)) == null) ? bArr : parseSchemeSpecificData;
    }

    private static java.lang.String adjustRequestMimeType(java.util.UUID uuid, java.lang.String str) {
        return (androidx.media3.common.util.Util.SDK_INT < 26 && androidx.media3.common.C.CLEARKEY_UUID.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static byte[] adjustRequestData(java.util.UUID uuid, byte[] bArr) {
        return androidx.media3.common.C.CLEARKEY_UUID.equals(uuid) ? androidx.media3.exoplayer.drm.ClearKeyUtil.adjustRequestData(bArr) : bArr;
    }

    private static void forceWidevineL3(android.media.MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static boolean needsForceWidevineL3Workaround() {
        return "ASUS_Z00AD".equals(androidx.media3.common.util.Util.MODEL);
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] bArr) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        short readLittleEndianShort = parsableByteArray.readLittleEndianShort();
        short readLittleEndianShort2 = parsableByteArray.readLittleEndianShort();
        if (readLittleEndianShort != 1 || readLittleEndianShort2 != 1) {
            androidx.media3.common.util.Log.i(TAG, "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        java.lang.String readString = parsableByteArray.readString(parsableByteArray.readLittleEndianShort(), com.google.common.base.Charsets.UTF_16LE);
        if (readString.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = readString.indexOf("</DATA>");
        if (indexOf == -1) {
            androidx.media3.common.util.Log.w(TAG, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
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

        public static void setLogSessionIdOnMediaDrmSession(android.media.MediaDrm mediaDrm, byte[] bArr, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            android.media.metrics.LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((android.media.MediaDrm.PlaybackComponent) androidx.media3.common.util.Assertions.checkNotNull(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionId);
        }
    }
}
