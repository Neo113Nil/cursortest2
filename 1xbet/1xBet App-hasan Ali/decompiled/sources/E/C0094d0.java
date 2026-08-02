package E;

import h0.C1988b;

/* renamed from: E.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094d0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1133l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1134m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0094d0(InterfaceC0104i0 interfaceC0104i0, int i) {
        super(1);
        this.f1133l = i;
        this.f1134m = interfaceC0104i0;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1133l) {
            case 0:
                this.f1134m.c(((C1988b) obj).f17191a);
                break;
            default:
                t0.s sVar = (t0.s) obj;
                this.f1134m.e(t0.q.e(sVar, false));
                sVar.a();
                break;
        }
        return W3.o.f6046a;
    }
}
