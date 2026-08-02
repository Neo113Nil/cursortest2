package p000;

import java.util.EnumSet;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class it0 extends a90 {

    /* JADX INFO: renamed from: s */
    public static final C0326il f3644s;

    /* JADX INFO: renamed from: t */
    public static final jg0 f3645t;

    /* JADX INFO: renamed from: g */
    public final kl0 f3646g;

    /* JADX INFO: renamed from: k */
    public SSLSocketFactory f3650k;

    /* JADX INFO: renamed from: h */
    public final u90 f3647h = C0312i6.f3445p;

    /* JADX INFO: renamed from: i */
    public final jg0 f3648i = f3645t;

    /* JADX INFO: renamed from: j */
    public final jg0 f3649j = new jg0(13, ca0.f1197q);

    /* JADX INFO: renamed from: l */
    public final C0326il f3651l = f3644s;

    /* JADX INFO: renamed from: m */
    public final int f3652m = 1;

    /* JADX INFO: renamed from: n */
    public final long f3653n = Long.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public final long f3654o = ca0.f1192l;

    /* JADX INFO: renamed from: p */
    public final int f3655p = 65535;

    /* JADX INFO: renamed from: q */
    public final int f3656q = 4194304;

    /* JADX INFO: renamed from: r */
    public final int f3657r = Integer.MAX_VALUE;

    static {
        Logger.getLogger(it0.class.getName());
        C0290hl c0290hl = new C0290hl(C0326il.f3595e);
        c0290hl.m2290a(EnumC0506ng.f5412r, EnumC0506ng.f5414t, EnumC0506ng.f5413s, EnumC0506ng.f5415u, EnumC0506ng.f5417w, EnumC0506ng.f5416v);
        c0290hl.m2291b(pd1.f6096l);
        if (!c0290hl.f3253a) {
            C0270h1.m2191g("no TLS extensions for cleartext connections");
            return;
        }
        c0290hl.f3254b = true;
        f3644s = new C0326il(c0290hl);
        f3645t = new jg0(13, new u90(8));
        EnumSet.of(od1.f5702j, od1.f5703k);
    }

    public it0(String str) {
        this.f3646g = new kl0(str, new an0(4, this), new jg0(7, this));
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f3646g, "delegate");
        return c0809vnM5362k.toString();
    }
}
