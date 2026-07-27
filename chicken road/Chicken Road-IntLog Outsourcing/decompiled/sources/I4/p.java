package I4;

import D4.AbstractC0024y;
import k4.InterfaceC1223i;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1441l f1317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1223i f1319g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC1441l interfaceC1441l, Object obj, InterfaceC1223i interfaceC1223i) {
        super(1);
        this.f1317e = interfaceC1441l;
        this.f1318f = obj;
        this.f1319g = interfaceC1223i;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        C1.b a6 = a.a(this.f1317e, this.f1318f, null);
        if (a6 != null) {
            AbstractC0024y.j(a6, this.f1319g);
        }
        return f4.v.f5689a;
    }
}
