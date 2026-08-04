package W5;

import U5.C0447n;
import U5.EnumC0446m;
import java.util.logging.Level;

/* JADX INFO: renamed from: W5.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0510i1 implements U5.M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0447n f7246a = C0447n.a(EnumC0446m.f6553d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0519l1 f7247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0522m1 f7248c;

    public C0510i1(C0522m1 c0522m1) {
        this.f7248c = c0522m1;
    }

    @Override // U5.M
    public final void a(C0447n c0447n) {
        C0522m1.f7281o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c0447n, this.f7247b.f7273a});
        this.f7246a = c0447n;
        C0522m1 c0522m1 = this.f7248c;
        if (c0522m1.f7284h.c() && ((C0519l1) c0522m1.f7283g.get(c0522m1.f7284h.a())).f7275c == this) {
            c0522m1.j(this.f7247b);
        }
    }
}
