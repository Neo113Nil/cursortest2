package A;

import P.d1;
import m4.InterfaceC2099b;
import m4.InterfaceC2104g;

/* loaded from: classes.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.r implements InterfaceC2104g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i5, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f62l = i5;
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC2099b computeReflected() {
        kotlin.jvm.internal.x.f17625a.getClass();
        return this;
    }

    @Override // m4.InterfaceC2104g
    public final Object get() {
        switch (this.f62l) {
            case 0:
                return ((d1) this.receiver).getValue();
            case 1:
                return ((d1) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        return get();
    }
}
