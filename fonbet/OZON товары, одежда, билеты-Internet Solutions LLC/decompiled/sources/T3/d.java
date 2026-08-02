package T3;

import N3.C3663n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m3.C8050C;

/* loaded from: classes.dex */
final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    private long f26589b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f26590c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f26591d;

    public d() {
        super(new C3663n());
        this.f26589b = -9223372036854775807L;
        this.f26590c = new long[0];
        this.f26591d = new long[0];
    }

    private static Serializable e(int i11, C8050C c8050c) {
        if (i11 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c8050c.y()));
        }
        if (i11 == 1) {
            return Boolean.valueOf(c8050c.E() == 1);
        }
        if (i11 == 2) {
            return g(c8050c);
        }
        if (i11 != 3) {
            if (i11 == 8) {
                return f(c8050c);
            }
            if (i11 != 10) {
                if (i11 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c8050c.y()));
                c8050c.S(2);
                return date;
            }
            int I11 = c8050c.I();
            ArrayList arrayList = new ArrayList(I11);
            for (int i12 = 0; i12 < I11; i12++) {
                Serializable e11 = e(c8050c.E(), c8050c);
                if (e11 != null) {
                    arrayList.add(e11);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String g10 = g(c8050c);
            int E11 = c8050c.E();
            if (E11 == 9) {
                return hashMap;
            }
            Serializable e12 = e(E11, c8050c);
            if (e12 != null) {
                hashMap.put(g10, e12);
            }
        }
    }

    private static HashMap<String, Object> f(C8050C c8050c) {
        int I11 = c8050c.I();
        HashMap<String, Object> hashMap = new HashMap<>(I11);
        for (int i11 = 0; i11 < I11; i11++) {
            String g10 = g(c8050c);
            Serializable e11 = e(c8050c.E(), c8050c);
            if (e11 != null) {
                hashMap.put(g10, e11);
            }
        }
        return hashMap;
    }

    private static String g(C8050C c8050c) {
        int L11 = c8050c.L();
        int f7 = c8050c.f();
        c8050c.S(L11);
        return new String(c8050c.e(), f7, L11);
    }

    public final long a() {
        return this.f26589b;
    }

    public final long[] b() {
        return this.f26591d;
    }

    public final long[] c() {
        return this.f26590c;
    }

    protected final boolean d(long j11, C8050C c8050c) {
        if (c8050c.E() != 2 || !"onMetaData".equals(g(c8050c)) || c8050c.a() == 0 || c8050c.E() != 8) {
            return false;
        }
        HashMap<String, Object> f7 = f(c8050c);
        Object obj = f7.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f26589b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = f7.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f26590c = new long[size];
                this.f26591d = new long[size];
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj5 = list.get(i11);
                    Object obj6 = list2.get(i11);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f26590c = new long[0];
                        this.f26591d = new long[0];
                        break;
                    }
                    this.f26590c[i11] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f26591d[i11] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
