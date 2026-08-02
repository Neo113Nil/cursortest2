package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jp0 extends kp0 {

    /* JADX INFO: renamed from: e */
    public final x80 f4061e;

    public jp0(String str, x80 x80Var) {
        super(x80Var, str, false);
        if (str.endsWith("-bin")) {
            C0270h1.m2190f(o80.m3651s("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
            throw null;
        }
        a90.m127k(x80Var, "marshaller");
        this.f4061e = x80Var;
    }

    @Override // p000.kp0
    /* JADX INFO: renamed from: a */
    public final Object mo2949a(byte[] bArr) {
        Long lValueOf;
        String str = new String(bArr, AbstractC0358jg.f3919a);
        switch (this.f4061e.f8862j) {
            case 2:
                a90.m122f("empty timeout", str.length() > 0);
                a90.m122f("bad timeout format", str.length() <= 9);
                long j = Long.parseLong(str.substring(0, str.length() - 1));
                char cCharAt = str.charAt(str.length() - 1);
                if (cCharAt == 'H') {
                    lValueOf = Long.valueOf(TimeUnit.HOURS.toNanos(j));
                } else if (cCharAt == 'M') {
                    lValueOf = Long.valueOf(TimeUnit.MINUTES.toNanos(j));
                } else if (cCharAt == 'S') {
                    lValueOf = Long.valueOf(TimeUnit.SECONDS.toNanos(j));
                } else if (cCharAt == 'u') {
                    lValueOf = Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
                } else if (cCharAt == 'm') {
                    lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
                } else {
                    if (cCharAt != 'n') {
                        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
                    }
                    lValueOf = Long.valueOf(j);
                }
                return lValueOf;
            default:
                return str;
        }
    }

    @Override // p000.kp0
    /* JADX INFO: renamed from: b */
    public final byte[] mo2950b(Object obj) {
        String str;
        String str2;
        switch (this.f4061e.f8862j) {
            case 2:
                Long l = (Long) obj;
                if (l.longValue() < 0) {
                    C0270h1.m2190f("Timeout too small");
                    str = null;
                } else if (l.longValue() < 100000000) {
                    str = l + "n";
                } else if (l.longValue() < 100000000000L) {
                    str = (l.longValue() / 1000) + "u";
                } else if (l.longValue() < 100000000000000L) {
                    str = (l.longValue() / 1000000) + "m";
                } else if (l.longValue() < 100000000000000000L) {
                    str = (l.longValue() / 1000000000) + "S";
                } else if (l.longValue() < 6000000000000000000L) {
                    str = (l.longValue() / 60000000000L) + "M";
                } else {
                    str = (l.longValue() / 3600000000000L) + "H";
                }
                str2 = str;
                break;
            default:
                str2 = (String) obj;
                break;
        }
        a90.m127k(str2, "null marshaller.toAsciiString()");
        return str2.getBytes(AbstractC0358jg.f3919a);
    }
}
