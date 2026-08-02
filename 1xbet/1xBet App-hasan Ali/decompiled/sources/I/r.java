package I;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0160m f2519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2520m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0160m c0160m, int i) {
        super(0);
        this.f2519l = c0160m;
        this.f2520m = i;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        return Integer.valueOf(((K0.L) this.f2519l.f2501e).e(this.f2520m));
    }
}
