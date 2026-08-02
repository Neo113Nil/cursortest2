package J1;

import A1.AbstractC0021h;
import C1.C0095a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends AbstractC0021h {

    /* renamed from: b, reason: collision with root package name */
    public long f3791b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f3792c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f3793d;

    public static Serializable q(int i7, C0095a c0095a) {
        if (i7 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c0095a.n()));
        }
        if (i7 == 1) {
            return Boolean.valueOf(c0095a.t() == 1);
        }
        if (i7 == 2) {
            return s(c0095a);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return r(c0095a);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c0095a.n()));
                c0095a.E(2);
                return date;
            }
            int w7 = c0095a.w();
            ArrayList arrayList = new ArrayList(w7);
            for (int i8 = 0; i8 < w7; i8++) {
                Serializable q7 = q(c0095a.t(), c0095a);
                if (q7 != null) {
                    arrayList.add(q7);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String s7 = s(c0095a);
            int t7 = c0095a.t();
            if (t7 == 9) {
                return hashMap;
            }
            Serializable q8 = q(t7, c0095a);
            if (q8 != null) {
                hashMap.put(s7, q8);
            }
        }
    }

    public static HashMap r(C0095a c0095a) {
        int w7 = c0095a.w();
        HashMap hashMap = new HashMap(w7);
        for (int i7 = 0; i7 < w7; i7++) {
            String s7 = s(c0095a);
            Serializable q7 = q(c0095a.t(), c0095a);
            if (q7 != null) {
                hashMap.put(s7, q7);
            }
        }
        return hashMap;
    }

    public static String s(C0095a c0095a) {
        int y4 = c0095a.y();
        int i7 = c0095a.f1463a;
        c0095a.E(y4);
        return new String((byte[]) c0095a.f1465c, i7, y4);
    }
}
