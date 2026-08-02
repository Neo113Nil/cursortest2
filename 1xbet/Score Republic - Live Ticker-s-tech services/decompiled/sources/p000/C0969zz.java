package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: zz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0969zz {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f9986c = 0;

    /* JADX INFO: renamed from: a */
    public final t81 f9987a = t81.m4764f();

    /* JADX INFO: renamed from: b */
    public boolean f9988b;

    static {
        new C0969zz(0);
    }

    public C0969zz(int i) {
        m6044a();
        m6044a();
    }

    /* JADX INFO: renamed from: b */
    public static void m6043b(C0360ji c0360ji, kk1 kk1Var, int i, Object obj) {
        if (kk1Var == kk1.f4405m) {
            c0360ji.m2876B(i, 3);
            ((AbstractC0379k0) obj).mo2976b(c0360ji);
            c0360ji.m2876B(i, 4);
        }
        c0360ji.m2876B(i, kk1Var.f4409k);
        switch (kk1Var.ordinal()) {
            case 0:
                c0360ji.m2896u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0360ji.m2894s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0360ji.m2880F(((Long) obj).longValue());
                break;
            case 3:
                c0360ji.m2880F(((Long) obj).longValue());
                break;
            case 4:
                c0360ji.m2898w(((Integer) obj).intValue());
                break;
            case 5:
                c0360ji.m2896u(((Long) obj).longValue());
                break;
            case 6:
                c0360ji.m2894s(((Integer) obj).intValue());
                break;
            case 7:
                c0360ji.m2888m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0799vd)) {
                    c0360ji.m2875A((String) obj);
                } else {
                    c0360ji.m2892q((C0799vd) obj);
                }
                break;
            case 9:
                ((AbstractC0379k0) obj).mo2976b(c0360ji);
                break;
            case 10:
                AbstractC0379k0 abstractC0379k0 = (AbstractC0379k0) obj;
                c0360ji.m2878D(((t70) abstractC0379k0).mo2975a(null));
                abstractC0379k0.mo2976b(c0360ji);
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof C0799vd)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0360ji.m2878D(length);
                    c0360ji.m2889n(bArr, 0, length);
                } else {
                    c0360ji.m2892q((C0799vd) obj);
                }
                break;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                c0360ji.m2878D(((Integer) obj).intValue());
                break;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                c0360ji.m2898w(((Integer) obj).intValue());
                break;
            case 14:
                c0360ji.m2894s(((Integer) obj).intValue());
                break;
            case 15:
                c0360ji.m2896u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0360ji.m2878D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0360ji.m2880F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6044a() {
        if (this.f9988b) {
            return;
        }
        t81 t81Var = this.f9987a;
        int size = t81Var.f7350j.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryM4767c = t81Var.m4767c(i);
            if (entryM4767c.getValue() instanceof t70) {
                t70 t70Var = (t70) entryM4767c.getValue();
                t70Var.getClass();
                fy0 fy0Var = fy0.f2536c;
                fy0Var.getClass();
                fy0Var.m1907a(t70Var.getClass()).mo4476b(t70Var);
                t70Var.m4756h();
            }
        }
        if (!t81Var.f7352l) {
            if (t81Var.f7350j.size() > 0) {
                t81Var.m4767c(0).getKey().getClass();
                dd0.m1158c();
                return;
            } else {
                Iterator it = t81Var.m4768d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    dd0.m1158c();
                    return;
                }
            }
        }
        if (!t81Var.f7352l) {
            t81Var.f7351k = t81Var.f7351k.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(t81Var.f7351k);
            t81Var.f7354n = t81Var.f7354n.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(t81Var.f7354n);
            t81Var.f7352l = true;
        }
        this.f9988b = true;
    }

    public final Object clone() {
        C0969zz c0969zz = new C0969zz();
        t81 t81Var = this.f9987a;
        if (t81Var.f7350j.size() > 0) {
            Map.Entry entryM4767c = t81Var.m4767c(0);
            if (entryM4767c.getKey() != null) {
                dd0.m1158c();
                return null;
            }
            entryM4767c.getValue();
            throw null;
        }
        Iterator it = t81Var.m4768d().iterator();
        if (!it.hasNext()) {
            return c0969zz;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            dd0.m1158c();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0969zz) {
            return this.f9987a.equals(((C0969zz) obj).f9987a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9987a.hashCode();
    }

    public C0969zz() {
    }
}
