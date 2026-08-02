package F3;

import F3.F;
import m3.InterfaceC8068j;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC8068j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F.a f8389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3013s f8390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3016v f8391c;

    public /* synthetic */ A(F.a aVar, C3013s c3013s, C3016v c3016v) {
        this.f8389a = aVar;
        this.f8390b = c3013s;
        this.f8391c = c3016v;
    }

    @Override // m3.InterfaceC8068j
    public final void accept(Object obj) {
        F.a aVar = this.f8389a;
        ((F) obj).I(aVar.f8405a, aVar.f8406b, this.f8390b, this.f8391c);
    }
}
