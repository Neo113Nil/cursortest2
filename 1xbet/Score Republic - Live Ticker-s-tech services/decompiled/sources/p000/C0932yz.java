package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: yz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0932yz {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f9547c = 0;

    /* JADX INFO: renamed from: a */
    public final s81 f9548a = new s81(16);

    /* JADX INFO: renamed from: b */
    public boolean f9549b;

    static {
        new C0932yz(0);
    }

    public C0932yz(int i) {
        m5855a();
        m5855a();
    }

    /* JADX INFO: renamed from: b */
    public static void m5854b(AbstractC0397ki abstractC0397ki, jk1 jk1Var, int i, Object obj) {
        if (jk1Var == jk1.f3954m) {
            abstractC0397ki.mo2075w(i, 3);
            ((AbstractC0342j0) obj).mo2756c(abstractC0397ki);
            abstractC0397ki.mo2075w(i, 4);
        }
        abstractC0397ki.mo2075w(i, jk1Var.f3958k);
        switch (jk1Var.ordinal()) {
            case 0:
                abstractC0397ki.mo2067o(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC0397ki.mo2065m(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC0397ki.mo2056A(((Long) obj).longValue());
                break;
            case 3:
                abstractC0397ki.mo2056A(((Long) obj).longValue());
                break;
            case 4:
                abstractC0397ki.mo2069q(((Integer) obj).intValue());
                break;
            case 5:
                abstractC0397ki.mo2067o(((Long) obj).longValue());
                break;
            case 6:
                abstractC0397ki.mo2065m(((Integer) obj).intValue());
                break;
            case 7:
                abstractC0397ki.mo2059g(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0762ud)) {
                    abstractC0397ki.mo2074v((String) obj);
                } else {
                    abstractC0397ki.mo2063k((C0762ud) obj);
                }
                break;
            case 9:
                ((AbstractC0342j0) obj).mo2756c(abstractC0397ki);
                break;
            case 10:
                abstractC0397ki.mo2072t((AbstractC0342j0) obj);
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof C0762ud)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC0397ki.mo2061i(bArr.length, bArr);
                } else {
                    abstractC0397ki.mo2063k((C0762ud) obj);
                }
                break;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                abstractC0397ki.mo2077y(((Integer) obj).intValue());
                break;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                if (!(obj instanceof ce0)) {
                    abstractC0397ki.mo2069q(((Integer) obj).intValue());
                } else {
                    abstractC0397ki.mo2069q(((ce0) obj).mo555a());
                }
                break;
            case 14:
                abstractC0397ki.mo2065m(((Integer) obj).intValue());
                break;
            case 15:
                abstractC0397ki.mo2067o(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC0397ki.mo2077y((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC0397ki.mo2056A((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5855a() {
        s81 s81Var;
        if (this.f9549b) {
            return;
        }
        int i = 0;
        while (true) {
            s81Var = this.f9548a;
            if (i >= s81Var.f7053k.size()) {
                break;
            }
            Map.Entry entryM4501c = s81Var.m4501c(i);
            if (entryM4501c.getValue() instanceof s70) {
                s70 s70Var = (s70) entryM4501c.getValue();
                s70Var.getClass();
                ey0 ey0Var = ey0.f2207c;
                ey0Var.getClass();
                ey0Var.m1525a(s70Var.getClass()).mo4249b(s70Var);
                s70Var.m4496j();
            }
            i++;
        }
        if (!s81Var.f7055m) {
            if (s81Var.f7053k.size() > 0) {
                s81Var.m4501c(0).getKey().getClass();
                dd0.m1158c();
                return;
            } else {
                Iterator it = s81Var.m4502d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    dd0.m1158c();
                    return;
                }
            }
        }
        if (!s81Var.f7055m) {
            s81Var.f7054l = s81Var.f7054l.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(s81Var.f7054l);
            s81Var.f7057o = s81Var.f7057o.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(s81Var.f7057o);
            s81Var.f7055m = true;
        }
        this.f9549b = true;
    }

    public final Object clone() {
        C0932yz c0932yz = new C0932yz();
        s81 s81Var = this.f9548a;
        if (s81Var.f7053k.size() > 0) {
            Map.Entry entryM4501c = s81Var.m4501c(0);
            if (entryM4501c.getKey() != null) {
                dd0.m1158c();
                return null;
            }
            entryM4501c.getValue();
            throw null;
        }
        Iterator it = s81Var.m4502d().iterator();
        if (!it.hasNext()) {
            return c0932yz;
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
        if (obj instanceof C0932yz) {
            return this.f9548a.equals(((C0932yz) obj).f9548a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9548a.hashCode();
    }

    public C0932yz() {
    }
}
