package t;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f19428l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f19429m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InterfaceC2015a interfaceC2015a, boolean z3) {
        super(1);
        this.f19428l = z3;
        this.f19429m = interfaceC2015a;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        ((i0.G) obj).e(!this.f19428l && ((Boolean) this.f19429m.invoke()).booleanValue());
        return W3.o.f6046a;
    }
}
