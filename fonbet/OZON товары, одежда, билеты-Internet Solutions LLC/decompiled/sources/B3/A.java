package B3;

import B3.M;
import android.media.MediaCodecInfo;
import android.os.Build;
import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import java.util.List;

/* loaded from: classes.dex */
final class A {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f2220a;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
            List supportedPerformancePoints;
            boolean z11;
            int i13;
            boolean covers;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                y.b();
                MediaCodecInfo.VideoCapabilities.PerformancePoint b11 = z.b(i11, i12, (int) d11);
                int i14 = 0;
                while (true) {
                    z11 = true;
                    if (i14 >= supportedPerformancePoints.size()) {
                        i13 = 1;
                        break;
                    }
                    covers = v.c(supportedPerformancePoints.get(i14)).covers(b11);
                    if (covers) {
                        i13 = 2;
                        break;
                    }
                    i14++;
                }
                if (i13 == 1 && A.f2220a == null) {
                    if (Build.VERSION.SDK_INT < 35) {
                        int b12 = b(false);
                        int b13 = b(true);
                        if (b12 != 0) {
                            if (b13 == 0) {
                            }
                        }
                        A.f2220a = Boolean.valueOf(z11);
                        if (!A.f2220a.booleanValue()) {
                        }
                    }
                    z11 = false;
                    A.f2220a = Boolean.valueOf(z11);
                    if (!A.f2220a.booleanValue()) {
                    }
                }
                return i13;
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        
            r2 = r2.getSupportedPerformancePoints();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int b(boolean z11) {
            List supportedPerformancePoints;
            boolean covers;
            try {
                C7272n.a aVar = new C7272n.a();
                aVar.y0("video/avc");
                C7272n P11 = aVar.P();
                String str = P11.f69127o;
                if (str != null) {
                    List<t> d11 = M.d(str, z11, false);
                    String b11 = M.b(P11);
                    List v11 = b11 == null ? AbstractC5880y.v() : M.d(b11, z11, false);
                    AbstractC5880y.a aVar2 = new AbstractC5880y.a();
                    aVar2.h(d11);
                    aVar2.h(v11);
                    AbstractC5880y j11 = aVar2.j();
                    for (int i11 = 0; i11 < j11.size(); i11++) {
                        if (((t) j11.get(i11)).f2372d != null && (r2 = ((t) j11.get(i11)).f2372d.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                            y.b();
                            MediaCodecInfo.VideoCapabilities.PerformancePoint e11 = x.e();
                            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                                covers = v.c(supportedPerformancePoints.get(i12)).covers(e11);
                                if (covers) {
                                    return 2;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } catch (M.b unused) {
            }
            return 0;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f2220a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i11, i12, d11);
        }
        return 0;
    }
}
