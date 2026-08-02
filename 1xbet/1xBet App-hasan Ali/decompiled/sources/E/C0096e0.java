package E;

import i4.InterfaceC2015a;

/* renamed from: E.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096e0 extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1136l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1137m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0096e0(InterfaceC0104i0 interfaceC0104i0, int i) {
        super(0);
        this.f1136l = i;
        this.f1137m = interfaceC0104i0;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f1136l) {
            case 0:
                this.f1137m.a();
                break;
            default:
                this.f1137m.onCancel();
                break;
        }
        return W3.o.f6046a;
    }
}
