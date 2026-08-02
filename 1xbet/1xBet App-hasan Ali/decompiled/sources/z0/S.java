package z0;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f21697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f21698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u5, long j5) {
        super(0);
        this.f21697l = u5;
        this.f21698m = j5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        AbstractC2740P G02 = this.f21697l.f21709p.a().G0();
        kotlin.jvm.internal.l.c(G02);
        G02.e(this.f21698m);
        return W3.o.f6046a;
    }
}
