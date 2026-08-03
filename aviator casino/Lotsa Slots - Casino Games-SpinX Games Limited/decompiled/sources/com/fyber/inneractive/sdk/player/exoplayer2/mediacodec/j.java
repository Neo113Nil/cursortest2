package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f4039a;
    public static final java.util.HashMap b;
    public static final android.util.SparseIntArray c;
    public static final android.util.SparseIntArray d;
    public static final java.util.HashMap e;
    public static int f;

    public static com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(boolean z, java.lang.String str) {
        java.util.List list;
        synchronized (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.class) {
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e eVar = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e(z, str);
            list = (java.util.List) b.get(eVar);
            if (list == null) {
                int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
                java.util.ArrayList a2 = a(eVar, i >= 21 ? new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.i(z) : new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.h());
                if (z && a2.isEmpty() && 21 <= i && i <= 23) {
                    a2 = a(eVar, new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.h());
                    if (!a2.isEmpty()) {
                        android.util.Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a) a2.get(0)).f4035a);
                    }
                }
                if (i < 26) {
                    int i2 = 1;
                    if (a2.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a) a2.get(0)).f4035a)) {
                        while (true) {
                            if (i2 >= a2.size()) {
                                break;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a) a2.get(i2);
                            if ("OMX.google.raw.decoder".equals(aVar.f4035a)) {
                                a2.remove(i2);
                                a2.add(0, aVar);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                list = java.util.Collections.unmodifiableList(a2);
                b.put(eVar, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a) list.get(0);
    }

    static {
        new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a("OMX.google.raw.decoder", null, null, false);
        f4039a = java.util.regex.Pattern.compile("^\\D?(\\d+)$");
        b = new java.util.HashMap();
        f = -1;
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        android.util.SparseIntArray sparseIntArray2 = new android.util.SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        java.util.HashMap hashMap = new java.util.HashMap();
        e = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static int a() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f == -1) {
            int i2 = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a2 = a(false, "video/avc");
            if (a2 != null) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = a2.e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = java.lang.Math.max(i, i3);
                    i2++;
                }
                i2 = java.lang.Math.max(i3, com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 21 ? 345600 : com.inmobi.media.core.config.models.AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f = i2;
        }
        return f;
    }

    public static java.util.ArrayList a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e eVar, com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g gVar) {
        boolean z;
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g gVar2 = gVar;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str = eVar.f4037a;
            int a2 = gVar.a();
            boolean b2 = gVar.b();
            int i = 0;
            while (i < a2) {
                android.media.MediaCodecInfo a3 = gVar2.a(i);
                java.lang.String name = a3.getName();
                if (a(a3, name, b2)) {
                    java.lang.String[] supportedTypes = a3.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        java.lang.String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = a3.getCapabilitiesForType(str2);
                                boolean a4 = gVar2.a(str, capabilitiesForType);
                                if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a <= 22) {
                                    java.lang.String str3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.d;
                                    if ((str3.equals("ODROID-XU3") || str3.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                        z = true;
                                        if ((!b2 && eVar.b == a4) || (!b2 && !eVar.b)) {
                                            arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name, str, capabilitiesForType, z));
                                        } else if (!b2 && a4) {
                                            arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name + ".secure", str, capabilitiesForType, z));
                                            return arrayList;
                                        }
                                    }
                                }
                                z = false;
                                if (!b2) {
                                }
                                if (!b2) {
                                    arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name + ".secure", str, capabilitiesForType, z));
                                    return arrayList;
                                }
                                continue;
                            } catch (java.lang.Exception e2) {
                                if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a <= 23 && !arrayList.isEmpty()) {
                                    android.util.Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                } else {
                                    android.util.Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                    throw e2;
                                }
                            }
                        }
                        i2++;
                        gVar2 = gVar;
                    }
                }
                i++;
                gVar2 = gVar;
            }
            return arrayList;
        } catch (java.lang.Exception e3) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f(e3);
        }
    }

    public static boolean a(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.b)) {
            return false;
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            java.lang.String str2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            java.lang.String str3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.c)) {
            java.lang.String str4 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        return (i <= 19 && com.fyber.inneractive.sdk.player.exoplayer2.util.z.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
    }
}
