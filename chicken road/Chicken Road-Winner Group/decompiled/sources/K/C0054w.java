package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* renamed from: K.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054w extends i2.g implements o2.l {

    /* renamed from: e, reason: collision with root package name */
    public int f904e;
    public final /* synthetic */ H f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054w(H h3, InterfaceC0319c interfaceC0319c) {
        super(1, interfaceC0319c);
        this.f = h3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f904e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
            return obj;
        }
        X0.a.L(obj);
        this.f904e = 1;
        Object invoke = this.f.invoke(this);
        return invoke == enumC0326a ? enumC0326a : invoke;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        return new C0054w(this.f, (InterfaceC0319c) obj).g(C0279i.f4852a);
    }
}
