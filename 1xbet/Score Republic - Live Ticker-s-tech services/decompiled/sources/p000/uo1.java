package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f7876c = 0;

    /* JADX INFO: renamed from: a */
    public final jq1 f7877a = new jq1();

    /* JADX INFO: renamed from: b */
    public boolean f7878b;

    static {
        new uo1(0);
    }

    public uo1(int i) {
        m4938a();
        m4938a();
    }

    /* JADX INFO: renamed from: b */
    public static void m4937b(ro1 ro1Var, wq1 wq1Var, int i, Object obj) {
        if (wq1Var == wq1.f8640m) {
            ro1Var.mo3556d(i, 3);
            ((zo1) ((do1) obj)).m5964f(ro1Var);
            ro1Var.mo3556d(i, 4);
            return;
        }
        ro1Var.mo3556d(i, wq1Var.f8644k);
        xq1 xq1Var = xq1.f9031j;
        switch (wq1Var.ordinal()) {
            case 0:
                ro1Var.mo3573u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                ro1Var.mo3571s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                ro1Var.mo3572t(((Long) obj).longValue());
                break;
            case 3:
                ro1Var.mo3572t(((Long) obj).longValue());
                break;
            case 4:
                ro1Var.mo3569q(((Integer) obj).intValue());
                break;
            case 5:
                ro1Var.mo3573u(((Long) obj).longValue());
                break;
            case 6:
                ro1Var.mo3571s(((Integer) obj).intValue());
                break;
            case 7:
                ro1Var.mo3568p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ko1)) {
                    ro1Var.mo3574v((String) obj);
                } else {
                    ro1Var.mo3565m((ko1) obj);
                }
                break;
            case 9:
                ((zo1) ((do1) obj)).m5964f(ro1Var);
                break;
            case 10:
                ro1Var.mo3567o((do1) obj);
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof ko1)) {
                    byte[] bArr = (byte[]) obj;
                    ro1Var.mo3566n(bArr.length, bArr);
                } else {
                    ro1Var.mo3565m((ko1) obj);
                }
                break;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                ro1Var.mo3570r(((Integer) obj).intValue());
                break;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                if (!(obj instanceof bp1)) {
                    ro1Var.mo3569q(((Integer) obj).intValue());
                } else {
                    ro1Var.mo3569q(((bp1) obj).mo739a());
                }
                break;
            case 14:
                ro1Var.mo3571s(((Integer) obj).intValue());
                break;
            case 15:
                ro1Var.mo3573u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                ro1Var.mo3570r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                ro1Var.mo3572t((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4938a() {
        if (this.f7878b) {
            return;
        }
        jq1 jq1Var = this.f7877a;
        int i = jq1Var.f4066k;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = jq1Var.m2954a(i2).f4501k;
            if (obj instanceof zo1) {
                zo1 zo1Var = (zo1) obj;
                eq1.f2165c.m1495a(zo1Var.getClass()).mo472i(zo1Var);
                zo1Var.m5966h();
            }
        }
        Iterator it = jq1Var.m2955b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zo1) {
                zo1 zo1Var2 = (zo1) value;
                eq1.f2165c.m1495a(zo1Var2.getClass()).mo472i(zo1Var2);
                zo1Var2.m5966h();
            }
        }
        if (!jq1Var.f4068m) {
            if (jq1Var.f4066k > 0) {
                jq1Var.m2954a(0).f4500j.getClass();
                dd0.m1158c();
                return;
            } else {
                Iterator it2 = jq1Var.m2955b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    dd0.m1158c();
                    return;
                }
            }
        }
        if (!jq1Var.f4068m) {
            jq1Var.f4067l = jq1Var.f4067l.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(jq1Var.f4067l);
            jq1Var.f4070o = jq1Var.f4070o.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(jq1Var.f4070o);
            jq1Var.f4068m = true;
        }
        this.f7878b = true;
    }

    public final Object clone() {
        uo1 uo1Var = new uo1();
        jq1 jq1Var = this.f7877a;
        if (jq1Var.f4066k > 0) {
            jq1Var.m2954a(0).f4500j.getClass();
            dd0.m1158c();
            return null;
        }
        Iterator it = jq1Var.m2955b().iterator();
        if (!it.hasNext()) {
            return uo1Var;
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
        if (obj instanceof uo1) {
            return this.f7877a.equals(((uo1) obj).f7877a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7877a.hashCode();
    }

    public uo1() {
    }
}
