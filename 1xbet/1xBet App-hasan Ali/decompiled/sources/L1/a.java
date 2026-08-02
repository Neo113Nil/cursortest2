package L1;

import A.C0006f;
import A.C0007g;
import A.C0008h;
import A.r;
import A0.V;
import G4.d;
import O3.l;
import P.C0315s;
import V0.b;
import V0.o;
import W0.c;
import W0.i;
import W0.p;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcel;
import b0.g;
import java.util.concurrent.ExecutorService;
import k4.AbstractC2036a;
import s3.BinderC2361b;
import s3.InterfaceC2360a;
import v3.e;
import z.AbstractC2685I;
import z.C2686J;
import z.C2703e;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static o a(o oVar, o oVar2) {
        boolean z3 = oVar2 instanceof b;
        if (!z3 || !(oVar instanceof b)) {
            return (!z3 || (oVar instanceof b)) ? (z3 || !(oVar instanceof b)) ? oVar2.c(new l(6, oVar)) : oVar : oVar2;
        }
        b bVar = (b) oVar2;
        float f = bVar.f5927b;
        if (Float.isNaN(f)) {
            f = ((b) oVar).f5927b;
        }
        return new b(bVar.f5926a, f);
    }

    public static int b(float f, c cVar) {
        float y5 = cVar.y(f);
        if (Float.isInfinite(y5)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(y5);
    }

    public static float c(long j5, c cVar) {
        float c5;
        float n5;
        if (!p.a(W0.o.b(j5), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = X0.b.f6065a;
        if (cVar.n() >= 1.03f) {
            X0.a a5 = X0.b.a(cVar.n());
            c5 = W0.o.c(j5);
            if (a5 != null) {
                return a5.b(c5);
            }
            n5 = cVar.n();
        } else {
            c5 = W0.o.c(j5);
            n5 = cVar.n();
        }
        return n5 * c5;
    }

    public static long d(long j5, c cVar) {
        if (j5 != 9205357640488583168L) {
            return d.b(cVar.i0(Float.intBitsToFloat((int) (j5 >> 32))), cVar.i0(Float.intBitsToFloat((int) (j5 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static float e(long j5, c cVar) {
        if (!p.a(W0.o.b(j5), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return cVar.y(cVar.D(j5));
    }

    public static long f(long j5, c cVar) {
        if (j5 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float y5 = cVar.y(Float.intBitsToFloat((int) (j5 >> 32)));
        float y6 = cVar.y(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        return (Float.floatToRawIntBits(y5) << 32) | (Float.floatToRawIntBits(y6) & 4294967295L);
    }

    public static long g(float f, c cVar) {
        float[] fArr = X0.b.f6065a;
        if (!(cVar.n() >= 1.03f)) {
            return AbstractC2036a.M(f / cVar.n(), 4294967296L);
        }
        X0.a a5 = X0.b.a(cVar.n());
        return AbstractC2036a.M(a5 != null ? a5.a(f) : f / cVar.n(), 4294967296L);
    }

    public static void h(C0008h c0008h, String str, X.d dVar, int i) {
        int i5 = 1;
        if ((i & 1) != 0) {
            str = null;
        }
        c0008h.getClass();
        c0008h.f51a.a(1, new e(str != null ? new C0006f(0, str) : null, new r(i5, 2), new X.d(-1010194746, new C0007g(0, dVar), true)));
    }

    public static int i(int i, int i5, String str) {
        return (str.hashCode() + i) * i5;
    }

    public static Object j(Bundle bundle, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.l.f(str, bundle);
        kotlin.jvm.internal.l.f(str3, str2);
        return bundle.get(str4);
    }

    public static String k(int i, int i5, String str, String str2) {
        return str + i + str2 + i5;
    }

    public static String l(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, char c5) {
        sb.append(str);
        sb.append(c5);
        return sb.toString();
    }

    public static InterfaceC2360a q(Parcel parcel) {
        InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
        parcel.recycle();
        return h1;
    }

    public static C2686J r(float f, g gVar, C0315s c0315s, int i) {
        return AbstractC2685I.a(new C2703e(f), gVar, c0315s, i);
    }

    public static /* synthetic */ void s(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            V.v((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
