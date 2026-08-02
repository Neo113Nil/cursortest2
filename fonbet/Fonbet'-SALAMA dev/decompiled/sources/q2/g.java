package q2;

import H2.o;
import android.os.SystemClock;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g {
    public static o a(t2.c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = cVar.f16298c.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (cVar.j(i8, elapsedRealtime)) {
                i7++;
            }
        }
        return new o(1, 0, length, i7);
    }

    public static h b(h hVar, String[] strArr, Map map) {
        int i7 = 0;
        if (hVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (h) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                h hVar2 = new h();
                int length = strArr.length;
                while (i7 < length) {
                    hVar2.a((h) map.get(strArr[i7]));
                    i7++;
                }
                return hVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                hVar.a((h) map.get(strArr[0]));
                return hVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    hVar.a((h) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return hVar;
    }

    public static int c(double d7) {
        if (Double.isNaN(d7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d7 > 2.147483647E9d) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (d7 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d7);
    }

    public static int d(float f7) {
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f7);
    }

    public static z6.f e(int i7, int i8) {
        if (i8 > Integer.MIN_VALUE) {
            return new z6.f(i7, i8 - 1, 1);
        }
        z6.f fVar = z6.f.f18541d;
        return z6.f.f18541d;
    }
}
