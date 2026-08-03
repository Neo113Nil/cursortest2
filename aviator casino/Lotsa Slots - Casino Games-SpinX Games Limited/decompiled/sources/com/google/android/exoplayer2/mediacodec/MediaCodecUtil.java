package com.google.android.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public final class MediaCodecUtil {
    private static final java.lang.String CODEC_ID_AV01 = "av01";
    private static final java.lang.String CODEC_ID_AVC1 = "avc1";
    private static final java.lang.String CODEC_ID_AVC2 = "avc2";
    private static final java.lang.String CODEC_ID_HEV1 = "hev1";
    private static final java.lang.String CODEC_ID_HVC1 = "hvc1";
    private static final java.lang.String CODEC_ID_MP4A = "mp4a";
    private static final java.lang.String CODEC_ID_VP09 = "vp09";
    private static final java.lang.String TAG = "MediaCodecUtil";
    private static final java.util.regex.Pattern PROFILE_PATTERN = java.util.regex.Pattern.compile("^\\D?(\\d+)$");
    private static final java.util.HashMap<com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey, java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo>> decoderInfosCache = new java.util.HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    private interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i);

        boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface ScoreProvider<T> {
        int getScore(T t);
    }

    private static int av1LevelNumberToConst(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcLevelToMaxFrameSize(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int avcProfileNumberToConst(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    private static int mp4aAudioObjectTypeToProfile(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    private static int vp9LevelNumberToConst(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    public static class DecoderQueryException extends java.lang.Exception {
        private DecoderQueryException(java.lang.Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private MediaCodecUtil() {
    }

    public static void warmDecoderInfoCache(java.lang.String str, boolean z, boolean z2) {
        try {
            getDecoderInfos(str, z, z2);
        } catch (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException e) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Codec warming failed", e);
        }
    }

    public static synchronized void clearDecoderInfoCache() {
        synchronized (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.class) {
            decoderInfosCache.clear();
        }
    }

    public static com.google.android.exoplayer2.mediacodec.MediaCodecInfo getDecryptOnlyDecoderInfo() throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        return getDecoderInfo("audio/raw", false, false);
    }

    public static com.google.android.exoplayer2.mediacodec.MediaCodecInfo getDecoderInfo(java.lang.String str, boolean z, boolean z2) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(str, z, z2);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfos(java.lang.String str, boolean z, boolean z2) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat mediaCodecListCompatV16;
        synchronized (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.class) {
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey codecKey = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey(str, z, z2);
            java.util.HashMap<com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey, java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo>> hashMap = decoderInfosCache;
            java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> list = hashMap.get(codecKey);
            if (list != null) {
                return list;
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21) {
                mediaCodecListCompatV16 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompatV21(z, z2);
            } else {
                mediaCodecListCompatV16 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompatV16();
            }
            java.util.ArrayList<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV16);
            if (z && decoderInfosInternal.isEmpty() && 21 <= com.google.android.exoplayer2.util.Util.SDK_INT && com.google.android.exoplayer2.util.Util.SDK_INT <= 23) {
                decoderInfosInternal = getDecoderInfosInternal(codecKey, new com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompatV16());
                if (!decoderInfosInternal.isEmpty()) {
                    com.google.android.exoplayer2.util.Log.w(TAG, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
                }
            }
            applyWorkarounds(str, decoderInfosInternal);
            com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) decoderInfosInternal);
            hashMap.put(codecKey, copyOf);
            return copyOf;
        }
    }

    public static java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfosSortedByFormatSupport(java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> list, final com.google.android.exoplayer2.Format format) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        sortByScore(arrayList, new com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda3
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
            public final int getScore(java.lang.Object obj) {
                return com.google.android.exoplayer2.mediacodec.MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(com.google.android.exoplayer2.Format.this, (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        try {
            return mediaCodecInfo.isFormatSupported(format) ? 1 : 0;
        } catch (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }

    public static int maxH264DecodableFrameSize() throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        if (maxH264DecodableFrameSize == -1) {
            int i = 0;
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int i2 = 0;
                while (i < length) {
                    i2 = java.lang.Math.max(avcLevelToMaxFrameSize(profileLevels[i].level), i2);
                    i++;
                }
                i = java.lang.Math.max(i2, com.google.android.exoplayer2.util.Util.SDK_INT >= 21 ? 345600 : com.inmobi.media.core.config.models.AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            maxH264DecodableFrameSize = i;
        }
        return maxH264DecodableFrameSize;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
    
        if (r3.equals(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CODEC_ID_AV01) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(com.google.android.exoplayer2.Format format) {
        if (format.codecs == null) {
            return null;
        }
        java.lang.String[] split = format.codecs.split("\\.");
        if ("video/dolby-vision".equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, split);
        }
        char c = 0;
        java.lang.String str = split[0];
        str.hashCode();
        switch (str.hashCode()) {
            case 3004662:
                break;
            case 3006243:
                if (str.equals(CODEC_ID_AVC1)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str.equals(CODEC_ID_AVC2)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str.equals(CODEC_ID_HEV1)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str.equals(CODEC_ID_HVC1)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3356560:
                if (str.equals(CODEC_ID_MP4A)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3624515:
                if (str.equals(CODEC_ID_VP09)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return getAv1ProfileAndLevel(format.codecs, split, format.colorInfo);
            case 1:
            case 2:
                return getAvcProfileAndLevel(format.codecs, split);
            case 3:
            case 4:
                return getHevcProfileAndLevel(format.codecs, split);
            case 5:
                return getAacCodecProfileAndLevel(format.codecs, split);
            case 6:
                return getVp9ProfileAndLevel(format.codecs, split);
            default:
                return null;
        }
    }

    public static java.lang.String getAlternativeCodecMimeType(com.google.android.exoplayer2.Format format) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel;
        if ("audio/eac3-joc".equals(format.sampleMimeType)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(format.sampleMimeType) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int intValue = ((java.lang.Integer) codecProfileAndLevel.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:30|(4:(2:75|76)|56|(9:59|60|61|62|63|64|65|67|68)|9)|34|35|36|38|9) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0083, code lost:
    
        if (r1.secure == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106 A[Catch: Exception -> 0x0154, TRY_ENTER, TryCatch #4 {Exception -> 0x0154, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0125, B:10:0x002d, B:13:0x0038, B:42:0x00fe, B:45:0x0106, B:47:0x010c, B:50:0x012f, B:51:0x0152), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfosInternal(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey codecKey, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat mediaCodecListCompat) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.lang.String codecMimeType;
        java.lang.String str;
        java.lang.String str2;
        int i;
        boolean z;
        int i2;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean isFeatureSupported;
        boolean isFeatureRequired;
        java.lang.String str3;
        com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey codecKey2 = codecKey;
        try {
            java.util.ArrayList<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> arrayList = new java.util.ArrayList<>();
            java.lang.String str4 = codecKey2.mimeType;
            int codecCount = mediaCodecListCompat.getCodecCount();
            boolean secureDecodersExplicit = mediaCodecListCompat.secureDecodersExplicit();
            int i3 = 0;
            while (i3 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat.getCodecInfoAt(i3);
                if (!isAlias(codecInfoAt)) {
                    java.lang.String name = codecInfoAt.getName();
                    if (isCodecUsableDecoder(codecInfoAt, name, secureDecodersExplicit, str4) && (codecMimeType = getCodecMimeType(codecInfoAt, name, str4)) != null) {
                        try {
                            capabilitiesForType = codecInfoAt.getCapabilitiesForType(codecMimeType);
                            isFeatureSupported = mediaCodecListCompat.isFeatureSupported("tunneled-playback", codecMimeType, capabilitiesForType);
                            isFeatureRequired = mediaCodecListCompat.isFeatureRequired("tunneled-playback", codecMimeType, capabilitiesForType);
                        } catch (java.lang.Exception e) {
                            e = e;
                            str = codecMimeType;
                            str2 = name;
                            i = i3;
                            z = secureDecodersExplicit;
                            i2 = codecCount;
                        }
                        if ((codecKey2.tunneling || !isFeatureRequired) && (!codecKey2.tunneling || isFeatureSupported)) {
                            boolean isFeatureSupported2 = mediaCodecListCompat.isFeatureSupported("secure-playback", codecMimeType, capabilitiesForType);
                            boolean isFeatureRequired2 = mediaCodecListCompat.isFeatureRequired("secure-playback", codecMimeType, capabilitiesForType);
                            if ((codecKey2.secure || !isFeatureRequired2) && (!codecKey2.secure || isFeatureSupported2)) {
                                boolean isHardwareAccelerated = isHardwareAccelerated(codecInfoAt, str4);
                                boolean isSoftwareOnly = isSoftwareOnly(codecInfoAt, str4);
                                boolean isVendor = isVendor(codecInfoAt);
                                if (!secureDecodersExplicit || codecKey2.secure != isFeatureSupported2) {
                                    if (!secureDecodersExplicit) {
                                        try {
                                        } catch (java.lang.Exception e2) {
                                            e = e2;
                                            str = codecMimeType;
                                            str3 = name;
                                            i = i3;
                                            z = secureDecodersExplicit;
                                            i2 = codecCount;
                                            str2 = str3;
                                            if (com.google.android.exoplayer2.util.Util.SDK_INT <= 23) {
                                            }
                                            com.google.android.exoplayer2.util.Log.e(TAG, "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                    str = codecMimeType;
                                    i = i3;
                                    z = secureDecodersExplicit;
                                    i2 = codecCount;
                                    if (!z && isFeatureSupported2) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        try {
                                            sb.append(name);
                                            sb.append(".secure");
                                            str2 = name;
                                            try {
                                                arrayList.add(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.newInstance(sb.toString(), str4, str, capabilitiesForType, isHardwareAccelerated, isSoftwareOnly, isVendor, false, true));
                                                return arrayList;
                                            } catch (java.lang.Exception e3) {
                                                e = e3;
                                                if (com.google.android.exoplayer2.util.Util.SDK_INT <= 23 && !arrayList.isEmpty()) {
                                                    com.google.android.exoplayer2.util.Log.e(TAG, "Skipping codec " + str2 + " (failed to query capabilities)");
                                                    i3 = i + 1;
                                                    codecKey2 = codecKey;
                                                    codecCount = i2;
                                                    secureDecodersExplicit = z;
                                                } else {
                                                    com.google.android.exoplayer2.util.Log.e(TAG, "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } catch (java.lang.Exception e4) {
                                            e = e4;
                                            str2 = name;
                                        }
                                    }
                                    i3 = i + 1;
                                    codecKey2 = codecKey;
                                    codecCount = i2;
                                    secureDecodersExplicit = z;
                                }
                                str = codecMimeType;
                                str3 = name;
                                i = i3;
                                z = secureDecodersExplicit;
                                i2 = codecCount;
                                arrayList.add(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.newInstance(name, str4, codecMimeType, capabilitiesForType, isHardwareAccelerated, isSoftwareOnly, isVendor, false, false));
                                i3 = i + 1;
                                codecKey2 = codecKey;
                                codecCount = i2;
                                secureDecodersExplicit = z;
                            }
                        }
                    }
                }
                i = i3;
                z = secureDecodersExplicit;
                i2 = codecCount;
                i3 = i + 1;
                codecKey2 = codecKey;
                codecCount = i2;
                secureDecodersExplicit = z;
            }
            return arrayList;
        } catch (java.lang.Exception e5) {
            throw new com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException(e5);
        }
    }

    private static java.lang.String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, java.lang.String str2) {
        for (java.lang.String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, boolean z, java.lang.String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(com.google.android.exoplayer2.util.Util.DEVICE) || ("Xiaomi".equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) && com.google.android.exoplayer2.util.Util.DEVICE.startsWith("HM")))) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "protou".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "ville".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "villeplus".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "villec2".equals(com.google.android.exoplayer2.util.Util.DEVICE) || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("gee") || "C6602".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "C6603".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "C6606".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "C6616".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "L36h".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "SO-02E".equals(com.google.android.exoplayer2.util.Util.DEVICE))) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "C1505".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "C1604".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "C1605".equals(com.google.android.exoplayer2.util.Util.DEVICE))) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) && (com.google.android.exoplayer2.util.Util.DEVICE.startsWith("zeroflte") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("zerolte") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("zenlte") || "SC-05G".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "marinelteatt".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "404SC".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "SC-04G".equals(com.google.android.exoplayer2.util.Util.DEVICE) || "SCV31".equals(com.google.android.exoplayer2.util.Util.DEVICE)))) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT <= 19 && "OMX.SEC.vp8.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) && (com.google.android.exoplayer2.util.Util.DEVICE.startsWith("d2") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("serrano") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("jflte") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("santos") || com.google.android.exoplayer2.util.Util.DEVICE.startsWith("t0"))) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT <= 19 && com.google.android.exoplayer2.util.Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (com.google.android.exoplayer2.util.Util.SDK_INT <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void applyWorkarounds(java.lang.String str, java.util.List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> list) {
        if ("audio/raw".equals(str)) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 26 && com.google.android.exoplayer2.util.Util.DEVICE.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.newInstance("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            sortByScore(list, new com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda1
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
                public final int getScore(java.lang.Object obj) {
                    return com.google.android.exoplayer2.mediacodec.MediaCodecUtil.lambda$applyWorkarounds$1((com.google.android.exoplayer2.mediacodec.MediaCodecInfo) obj);
                }
            });
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 21 && list.size() > 1) {
            java.lang.String str2 = list.get(0).name;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                sortByScore(list, new com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda2
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
                    public final int getScore(java.lang.Object obj) {
                        return com.google.android.exoplayer2.mediacodec.MediaCodecUtil.lambda$applyWorkarounds$2((com.google.android.exoplayer2.mediacodec.MediaCodecInfo) obj);
                    }
                });
            }
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
            return;
        }
        list.add(list.remove(0));
    }

    static /* synthetic */ int lambda$applyWorkarounds$1(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        java.lang.String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (com.google.android.exoplayer2.util.Util.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    static /* synthetic */ int lambda$applyWorkarounds$2(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.name.startsWith("OMX.google") ? 1 : 0;
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return com.google.android.exoplayer2.util.Util.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (com.google.android.exoplayer2.util.MimeTypes.isAudio(str)) {
            return true;
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getDolbyVisionProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        if (strArr.length < 3) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        java.util.regex.Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        java.lang.String group = matcher.group(1);
        java.lang.Integer dolbyVisionStringToProfile = dolbyVisionStringToProfile(group);
        if (dolbyVisionStringToProfile == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        java.lang.String str2 = strArr[2];
        java.lang.Integer dolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (dolbyVisionStringToLevel == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new android.util.Pair<>(dolbyVisionStringToProfile, dolbyVisionStringToLevel);
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getHevcProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        if (strArr.length < 4) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        java.util.regex.Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        java.lang.String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown HEVC profile string: " + group);
                return null;
            }
            i = 2;
        }
        java.lang.String str2 = strArr[3];
        java.lang.Integer hevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (hevcCodecStringToProfileLevel == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Unknown HEVC level string: " + str2);
            return null;
        }
        return new android.util.Pair<>(java.lang.Integer.valueOf(i), hevcCodecStringToProfileLevel);
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAvcProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        int parseInt;
        int i;
        if (strArr.length < 2) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i = java.lang.Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = java.lang.Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = java.lang.Integer.parseInt(strArr[1]);
                parseInt = java.lang.Integer.parseInt(strArr[2]);
                i = parseInt2;
            } else {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int avcProfileNumberToConst = avcProfileNumberToConst(i);
            if (avcProfileNumberToConst == -1) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown AVC profile: " + i);
                return null;
            }
            int avcLevelNumberToConst = avcLevelNumberToConst(parseInt);
            if (avcLevelNumberToConst == -1) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown AVC level: " + parseInt);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(avcProfileNumberToConst), java.lang.Integer.valueOf(avcLevelNumberToConst));
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getVp9ProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        if (strArr.length < 3) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1]);
            int parseInt2 = java.lang.Integer.parseInt(strArr[2]);
            int vp9ProfileNumberToConst = vp9ProfileNumberToConst(parseInt);
            if (vp9ProfileNumberToConst == -1) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int vp9LevelNumberToConst = vp9LevelNumberToConst(parseInt2);
            if (vp9LevelNumberToConst == -1) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown VP9 level: " + parseInt2);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(vp9ProfileNumberToConst), java.lang.Integer.valueOf(vp9LevelNumberToConst));
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAv1ProfileAndLevel(java.lang.String str, java.lang.String[] strArr, com.google.android.exoplayer2.video.ColorInfo colorInfo) {
        if (strArr.length < 4) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i = 1;
        try {
            int parseInt = java.lang.Integer.parseInt(strArr[1]);
            int parseInt2 = java.lang.Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = java.lang.Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
            if (parseInt3 != 8) {
                i = (colorInfo == null || !(colorInfo.hdrStaticInfo != null || colorInfo.colorTransfer == 7 || colorInfo.colorTransfer == 6)) ? 2 : 4096;
            }
            int av1LevelNumberToConst = av1LevelNumberToConst(parseInt2);
            if (av1LevelNumberToConst == -1) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown AV1 level: " + parseInt2);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(av1LevelNumberToConst));
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getAacCodecProfileAndLevel(java.lang.String str, java.lang.String[] strArr) {
        int mp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(com.google.android.exoplayer2.util.MimeTypes.getMimeTypeFromMp4ObjectType(java.lang.Integer.parseInt(strArr[1], 16))) && (mp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(java.lang.Integer.parseInt(strArr[2]))) != -1) {
                return new android.util.Pair<>(java.lang.Integer.valueOf(mp4aAudioObjectTypeToProfile), 0);
            }
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    static /* synthetic */ int lambda$sortByScore$3(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider scoreProvider, java.lang.Object obj, java.lang.Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    private static <T> void sortByScore(java.util.List<T> list, final com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider<T> scoreProvider) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.android.exoplayer2.mediacodec.MediaCodecUtil.lambda$sortByScore$3(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider.this, obj, obj2);
            }
        });
    }

    private static final class MediaCodecListCompatV21 implements com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }

        public MediaCodecListCompatV21(boolean z, boolean z2) {
            this.codecKind = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new android.media.MediaCodecList(this.codecKind).getCodecInfos();
            }
        }
    }

    private static final class MediaCodecListCompatV16 implements com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat {
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }

        private MediaCodecListCompatV16() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return android.media.MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            return android.media.MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    private static final class CodecKey {
        public final java.lang.String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(java.lang.String str, boolean z, boolean z2) {
            this.mimeType = str;
            this.secure = z;
            this.tunneling = z2;
        }

        public int hashCode() {
            return ((((this.mimeType.hashCode() + 31) * 31) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey.class) {
                return false;
            }
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey codecKey = (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey) obj;
            return android.text.TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling;
        }
    }

    private static java.lang.Integer hevcCodecStringToProfileLevel(java.lang.String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }

    private static java.lang.Integer dolbyVisionStringToProfile(java.lang.String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }

    private static java.lang.Integer dolbyVisionStringToLevel(java.lang.String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
        }
        return null;
    }
}
