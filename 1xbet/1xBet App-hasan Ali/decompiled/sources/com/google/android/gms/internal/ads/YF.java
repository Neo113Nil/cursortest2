package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class YF {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f12311a = new HashMap();

    public static String a(C1407p c1407p) {
        Pair a5;
        if ("audio/eac3-joc".equals(c1407p.f14904m)) {
            return "audio/eac3";
        }
        String str = c1407p.f14904m;
        if ("video/dolby-vision".equals(str) && (a5 = AbstractC1120ii.a(c1407p)) != null) {
            int intValue = ((Integer) a5.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static synchronized List b(String str, boolean z3, boolean z5) {
        synchronized (YF.class) {
            try {
                TF tf = new TF(str, z3, z5);
                HashMap hashMap = f12311a;
                List list = (List) hashMap.get(tf);
                if (list != null) {
                    return list;
                }
                ArrayList d5 = d(tf, new C2.h(z3, z5));
                if (z3 && d5.isEmpty() && AbstractC1260lo.f14419a <= 23) {
                    d5 = d(tf, new RE(9));
                    if (!d5.isEmpty()) {
                        JB.l("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((NF) d5.get(0)).f10788a);
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (AbstractC1260lo.f14419a < 26 && AbstractC1260lo.f14420b.equals("R9") && d5.size() == 1 && ((NF) d5.get(0)).f10788a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        d5.add(NF.b("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
                    }
                    Collections.sort(d5, new SF(new RE(8)));
                }
                if (AbstractC1260lo.f14419a < 32 && d5.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((NF) d5.get(0)).f10788a)) {
                    d5.add((NF) d5.remove(0));
                }
                AbstractC1044gv l5 = AbstractC1044gv.l(d5);
                hashMap.put(tf, l5);
                return l5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1761wv c(C1543s1 c1543s1, C1407p c1407p, boolean z3, boolean z5) {
        Iterable b3;
        String str = c1407p.f14904m;
        c1543s1.getClass();
        List b5 = b(str, z3, z5);
        String a5 = a(c1407p);
        if (a5 == null) {
            b3 = C1761wv.f16184o;
        } else {
            c1543s1.getClass();
            b3 = b(a5, z3, z5);
        }
        C0909dv c0909dv = new C0909dv(4);
        c0909dv.c(b5);
        c0909dv.c(b3);
        return c0909dv.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if ("SCV31".equals(r11) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0199 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:61:0x0150, B:65:0x015b, B:69:0x016d, B:71:0x0173, B:72:0x018c, B:74:0x0195, B:77:0x01be, B:108:0x0199, B:110:0x01a9, B:112:0x01b1, B:113:0x0181), top: B:60:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0181 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:61:0x0150, B:65:0x015b, B:69:0x016d, B:71:0x0173, B:72:0x018c, B:74:0x0195, B:77:0x01be, B:108:0x0199, B:110:0x01a9, B:112:0x01b1, B:113:0x0181), top: B:60:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:61:0x0150, B:65:0x015b, B:69:0x016d, B:71:0x0173, B:72:0x018c, B:74:0x0195, B:77:0x01be, B:108:0x0199, B:110:0x01a9, B:112:0x01b1, B:113:0x0181), top: B:60:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:61:0x0150, B:65:0x015b, B:69:0x016d, B:71:0x0173, B:72:0x018c, B:74:0x0195, B:77:0x01be, B:108:0x0199, B:110:0x01a9, B:112:0x01b1, B:113:0x0181), top: B:60:0x0150 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(TF tf, VF vf) {
        String str;
        String str2;
        String str3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean c5;
        boolean d5;
        boolean z3;
        int i;
        String str4;
        boolean z5;
        boolean isHardwareAccelerated;
        boolean isAlias;
        TF tf2 = tf;
        String str5 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = tf2.f11642a;
            int a5 = vf.a();
            boolean b3 = vf.b();
            int i5 = 0;
            while (i5 < a5) {
                MediaCodecInfo z6 = vf.z(i5);
                int i6 = AbstractC1260lo.f14419a;
                if (i6 >= 29) {
                    isAlias = z6.isAlias();
                }
                String name = z6.getName();
                if (!z6.isEncoder() && (b3 || !name.endsWith(".secure"))) {
                    if (i6 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(AbstractC1260lo.f14421c))) {
                        String str7 = AbstractC1260lo.f14420b;
                        if (!str7.startsWith("zeroflte")) {
                            if (!str7.startsWith("zerolte")) {
                                if (!str7.startsWith("zenlte")) {
                                    if (!"SC-05G".equals(str7)) {
                                        if (!"marinelteatt".equals(str7)) {
                                            if (!"404SC".equals(str7)) {
                                                if (!"SC-04G".equals(str7)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i6 > 23 || !"audio/eac3-joc".equals(str6) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                        String[] supportedTypes = z6.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 < length) {
                                str = supportedTypes[i7];
                                if (str.equalsIgnoreCase(str6)) {
                                    break;
                                }
                                i7++;
                            } else {
                                str = null;
                                if (str6.equals("video/dolby-vision")) {
                                    if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        str = "video/hevcdv";
                                    } else if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = "video/dv_hevc";
                                    }
                                } else if (str6.equals("video/mv-hevc")) {
                                    if ("c2.qti.mvhevc.decoder".equals(name)) {
                                        str = "video/x-mvhevc";
                                    }
                                } else if (str6.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                    str = "audio/x-lg-alac";
                                } else if (str6.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                    str = "audio/x-lg-flac";
                                } else if (str6.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                            }
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = z6.getCapabilitiesForType(str);
                                c5 = vf.c(str5, str, capabilitiesForType);
                                d5 = vf.d(str5, capabilitiesForType);
                                str2 = str5;
                                try {
                                } catch (Exception e3) {
                                    e = e3;
                                    str3 = name;
                                    if (AbstractC1260lo.f14419a <= 23 || arrayList.isEmpty()) {
                                        JB.f("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str + ")");
                                        throw e;
                                    }
                                    JB.f("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                    i5++;
                                    tf2 = tf;
                                    str5 = str2;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                str2 = str5;
                            }
                            if (tf2.f11644c) {
                                if (!c5) {
                                    i5++;
                                    tf2 = tf;
                                    str5 = str2;
                                }
                                boolean c6 = vf.c("secure-playback", str, capabilitiesForType);
                                boolean d6 = vf.d("secure-playback", capabilitiesForType);
                                z3 = tf2.f11643b;
                                if (z3) {
                                }
                            } else if (d5) {
                                continue;
                                i5++;
                                tf2 = tf;
                                str5 = str2;
                            } else {
                                boolean c62 = vf.c("secure-playback", str, capabilitiesForType);
                                boolean d62 = vf.d("secure-playback", capabilitiesForType);
                                z3 = tf2.f11643b;
                                if (z3) {
                                    if (d62) {
                                        continue;
                                        i5++;
                                        tf2 = tf;
                                        str5 = str2;
                                    }
                                    i = AbstractC1260lo.f14419a;
                                    if (i < 29) {
                                        isHardwareAccelerated = z6.isHardwareAccelerated();
                                        z5 = isHardwareAccelerated;
                                        str4 = ".secure";
                                    } else if (e(z6, str6)) {
                                        str4 = ".secure";
                                        z5 = false;
                                    } else {
                                        str4 = ".secure";
                                        z5 = true;
                                    }
                                    e(z6, str6);
                                    if (i < 29) {
                                        z6.isVendor();
                                    } else {
                                        String n5 = AbstractC0952et.n(z6.getName());
                                        if (!n5.startsWith("omx.google.") && !n5.startsWith("c2.android.")) {
                                            n5.startsWith("c2.google.");
                                        }
                                    }
                                    if ((b3 || z3 != c62) && (b3 || z3)) {
                                        str3 = name;
                                        if (!b3 && c62) {
                                            arrayList.add(NF.b(str3 + str4, str6, str, capabilitiesForType, z5, true));
                                            break;
                                        }
                                        i5++;
                                        tf2 = tf;
                                        str5 = str2;
                                    } else {
                                        str3 = name;
                                        try {
                                            arrayList.add(NF.b(name, str6, str, capabilitiesForType, z5, false));
                                        } catch (Exception e6) {
                                            e = e6;
                                            if (AbstractC1260lo.f14419a <= 23) {
                                            }
                                            JB.f("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str + ")");
                                            throw e;
                                        }
                                        i5++;
                                        tf2 = tf;
                                        str5 = str2;
                                    }
                                } else if (c62) {
                                    c62 = true;
                                    i = AbstractC1260lo.f14419a;
                                    if (i < 29) {
                                    }
                                    e(z6, str6);
                                    if (i < 29) {
                                    }
                                    if (b3) {
                                    }
                                    str3 = name;
                                    if (!b3) {
                                        arrayList.add(NF.b(str3 + str4, str6, str, capabilitiesForType, z5, true));
                                        break;
                                        break;
                                    }
                                    continue;
                                    i5++;
                                    tf2 = tf;
                                    str5 = str2;
                                } else {
                                    continue;
                                    i5++;
                                    tf2 = tf;
                                    str5 = str2;
                                }
                            }
                        }
                    }
                }
                str2 = str5;
                i5++;
                tf2 = tf;
                str5 = str2;
            }
            return arrayList;
        } catch (Exception e7) {
            throw new UF("Failed to query underlying media codecs", e7);
        }
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (AbstractC1260lo.f14419a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if ("audio".equals(AbstractC1593t6.h(str))) {
            return true;
        }
        String n5 = AbstractC0952et.n(mediaCodecInfo.getName());
        if (n5.startsWith("arc.")) {
            return false;
        }
        if (n5.startsWith("omx.google.") || n5.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((n5.startsWith("omx.sec.") && n5.contains(".sw.")) || n5.equals("omx.qcom.video.decoder.hevcswvdec") || n5.startsWith("c2.android.") || n5.startsWith("c2.google.")) {
            return true;
        }
        return (n5.startsWith("omx.") || n5.startsWith("c2.")) ? false : true;
    }
}
