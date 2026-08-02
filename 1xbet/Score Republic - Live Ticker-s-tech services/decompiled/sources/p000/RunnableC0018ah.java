package p000;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: ah */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0018ah implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f178j = 0;

    /* JADX INFO: renamed from: k */
    public final long f179k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f180l;

    public RunnableC0018ah(qv1 qv1Var, long j) {
        this.f179k = j;
        Objects.requireNonNull(qv1Var);
        this.f180l = qv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f178j;
        long j = this.f179k;
        Object obj = this.f180l;
        switch (i) {
            case 0:
                xd0 xd0Var = new xd0(0);
                C0062bh c0062bh = (C0062bh) obj;
                c0062bh.f868m.mo1327s(xd0Var);
                long jAbs = Math.abs(j) / 1000000000;
                long jAbs2 = Math.abs(j) % 1000000000;
                StringBuilder sb = new StringBuilder("deadline exceeded after ");
                if (j < 0) {
                    sb.append('-');
                }
                sb.append(jAbs);
                Locale locale = Locale.US;
                sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
                sb.append("s. ");
                Long l = (Long) c0062bh.f867l.m920a(o80.f5662j);
                sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(l == null ? 0.0d : l.longValue() / C0062bh.f859u)));
                sb.append(xd0Var);
                c0062bh.f868m.mo1604G(ja1.f3878h.m2837b(sb.toString()));
                break;
            case 1:
                ((qv1) obj).m4205G(j);
                break;
            default:
                l32 l32Var = (l32) obj;
                qv1 qv1Var = ((f02) l32Var.f7192j).f2255w;
                f02.m1557j(qv1Var);
                qv1Var.m4202D(j);
                l32Var.f4660n = null;
                break;
        }
    }

    public RunnableC0018ah(l32 l32Var, long j) {
        this.f179k = j;
        Objects.requireNonNull(l32Var);
        this.f180l = l32Var;
    }

    public RunnableC0018ah(C0062bh c0062bh, long j) {
        this.f180l = c0062bh;
        this.f179k = j;
    }
}
