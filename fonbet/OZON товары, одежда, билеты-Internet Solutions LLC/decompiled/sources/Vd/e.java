package Vd;

import je.s0;
import ke.e;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9835a;
import td.InterfaceC9842h;
import td.i0;

/* loaded from: classes10.dex */
final class e implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28537a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9835a f28538b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9835a f28539c;

    public e(InterfaceC9835a interfaceC9835a, InterfaceC9835a interfaceC9835a2, boolean z11) {
        this.f28537a = z11;
        this.f28538b = interfaceC9835a;
        this.f28539c = interfaceC9835a2;
    }

    @Override // ke.e.a
    public final boolean a(s0 c12, s0 c22) {
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        if (Intrinsics.d(c12, c22)) {
            return true;
        }
        InterfaceC9842h p11 = c12.p();
        InterfaceC9842h p12 = c22.p();
        if (!(p11 instanceof i0) || !(p12 instanceof i0)) {
            return false;
        }
        return g.f28542a.b((i0) p11, (i0) p12, this.f28537a, new f(this.f28538b, this.f28539c));
    }
}
