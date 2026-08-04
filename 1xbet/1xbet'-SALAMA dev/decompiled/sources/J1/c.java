package J1;

import A1.AbstractC0021h;
import C1.C0095a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0021h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f3792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
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
            int iW = c0095a.w();
            ArrayList arrayList = new ArrayList(iW);
            for (int i8 = 0; i8 < iW; i8++) {
                Serializable serializableQ = q(c0095a.t(), c0095a);
                if (serializableQ != null) {
                    arrayList.add(serializableQ);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strS = s(c0095a);
            int iT = c0095a.t();
            if (iT == 9) {
                return map;
            }
            Serializable serializableQ2 = q(iT, c0095a);
            if (serializableQ2 != null) {
                map.put(strS, serializableQ2);
            }
        }
    }

    public static HashMap r(C0095a c0095a) {
        int iW = c0095a.w();
        HashMap map = new HashMap(iW);
        for (int i7 = 0; i7 < iW; i7++) {
            String strS = s(c0095a);
            Serializable serializableQ = q(c0095a.t(), c0095a);
            if (serializableQ != null) {
                map.put(strS, serializableQ);
            }
        }
        return map;
    }

    public static String s(C0095a c0095a) {
        int iY = c0095a.y();
        int i7 = c0095a.f1463a;
        c0095a.E(iY);
        return new String((byte[]) c0095a.f1465c, i7, iY);
    }
}
