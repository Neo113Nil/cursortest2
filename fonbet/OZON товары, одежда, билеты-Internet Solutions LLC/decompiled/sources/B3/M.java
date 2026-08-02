package B3;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m3.C8065g;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<a, List<t>> f2299a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2300b = 0;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2301a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2302b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2303c;

        public a(String str, boolean z11, boolean z12) {
            this.f2301a = str;
            this.f2302b = z11;
            this.f2303c = z12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f2301a, aVar.f2301a) && this.f2302b == aVar.f2302b && this.f2303c == aVar.f2303c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((G.g.a(31, 31, this.f2301a) + (this.f2302b ? 1231 : 1237)) * 31) + (this.f2303c ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f2304a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f2305b;

        public c(boolean z11, boolean z12, boolean z13) {
            this.f2304a = (z11 || z12 || z13) ? 1 : 0;
        }

        public final int a() {
            if (this.f2305b == null) {
                this.f2305b = new MediaCodecList(this.f2304a).getCodecInfos();
            }
            return this.f2305b.length;
        }

        public final MediaCodecInfo b(int i11) {
            if (this.f2305b == null) {
                this.f2305b = new MediaCodecList(this.f2304a).getCodecInfos();
            }
            return this.f2305b[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d<T> {
        int a(T t2);
    }

    private static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new L(new J()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((t) arrayList.get(0)).f2369a)) {
            return;
        }
        arrayList.add((t) arrayList.remove(0));
    }

    public static String b(C7272n c7272n) {
        Pair<Integer, Integer> c11;
        if ("audio/eac3-joc".equals(c7272n.f69127o)) {
            return "audio/eac3";
        }
        String str = c7272n.f69127o;
        if ("video/dolby-vision".equals(str) && (c11 = C8065g.c(c7272n)) != null) {
            int intValue = ((Integer) c11.first).intValue();
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

    private static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
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
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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

    public static synchronized List<t> d(String str, boolean z11, boolean z12) throws b {
        synchronized (M.class) {
            try {
                a aVar = new a(str, z11, z12);
                HashMap<a, List<t>> hashMap = f2299a;
                List<t> list = hashMap.get(aVar);
                if (list != null) {
                    return list;
                }
                ArrayList e11 = e(aVar, new c(z11, z12, str.equals("video/mv-hevc")));
                if (z11) {
                    e11.isEmpty();
                }
                a(str, e11);
                AbstractC5880y n11 = AbstractC5880y.n(e11);
                hashMap.put(aVar, n11);
                return n11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static ArrayList e(a aVar, c cVar) throws b {
        String c11;
        String str;
        String str2;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean z11;
        boolean isVendor;
        boolean isAlias;
        a aVar2 = aVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = aVar2.f2301a;
            int a11 = cVar.a();
            int i11 = 0;
            while (i11 < a11) {
                MediaCodecInfo b11 = cVar.b(i11);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                    isAlias = b11.isAlias();
                    if (isAlias) {
                        i11++;
                        aVar2 = aVar;
                    }
                }
                String name = b11.getName();
                if (!b11.isEncoder() && (c11 = c(b11, name, str3)) != null) {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = b11.getCapabilitiesForType(c11);
                        boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                        boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                        boolean z12 = aVar2.f2303c;
                        if ((z12 || !isFeatureRequired) && (!z12 || isFeatureSupported)) {
                            boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                            boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                            boolean z13 = aVar2.f2302b;
                            if ((z13 || !isFeatureRequired2) && (!z13 || isFeatureSupported2)) {
                                boolean isHardwareAccelerated = i12 >= 29 ? b11.isHardwareAccelerated() : !h(b11, str3);
                                try {
                                    boolean h11 = h(b11, str3);
                                    if (i12 >= 29) {
                                        isVendor = b11.isVendor();
                                        z11 = isVendor;
                                        codecCapabilities = capabilitiesForType;
                                    } else {
                                        String b12 = O7.b.b(b11.getName());
                                        if (b12.startsWith("omx.google.") || b12.startsWith("c2.android.") || b12.startsWith("c2.google.")) {
                                            codecCapabilities = capabilitiesForType;
                                            z11 = false;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            z11 = true;
                                        }
                                    }
                                    if (z13 != isFeatureSupported2) {
                                        continue;
                                    } else {
                                        str = name;
                                        str2 = c11;
                                        try {
                                            arrayList.add(t.k(str, str3, str2, codecCapabilities, isHardwareAccelerated, h11, z11, false));
                                        } catch (Exception e11) {
                                            e = e11;
                                            m3.s.c("MediaCodecUtil", "Failed to query codec " + str + " (" + str2 + ")");
                                            throw e;
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    str = name;
                                    str2 = c11;
                                }
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                        str = name;
                        str2 = c11;
                    }
                }
                i11++;
                aVar2 = aVar;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new b("Failed to query underlying media codecs", e14);
        }
    }

    public static List<t> f(E e11, C7272n c7272n, boolean z11, boolean z12) throws b {
        List<t> a11 = e11.a(c7272n.f69127o, z11, z12);
        String b11 = b(c7272n);
        List<t> v11 = b11 == null ? AbstractC5880y.v() : e11.a(b11, z11, z12);
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        aVar.h(a11);
        aVar.h(v11);
        return aVar.j();
    }

    public static ArrayList g(List list, final C7272n c7272n) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new L(new d() { // from class: B3.K
            @Override // B3.M.d
            public final int a(Object obj) {
                return ((t) obj).f(C7272n.this) ? 1 : 0;
            }
        }));
        return arrayList;
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (j3.u.i(str)) {
            return true;
        }
        String b11 = O7.b.b(mediaCodecInfo.getName());
        if (b11.startsWith("arc.")) {
            return false;
        }
        if (b11.startsWith("omx.google.") || b11.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((b11.startsWith("omx.sec.") && b11.contains(".sw.")) || b11.equals("omx.qcom.video.decoder.hevcswvdec") || b11.startsWith("c2.android.") || b11.startsWith("c2.google.")) {
            return true;
        }
        return (b11.startsWith("omx.") || b11.startsWith("c2.")) ? false : true;
    }
}
