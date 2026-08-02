package F3;

import F3.F;
import m3.InterfaceC8068j;

/* loaded from: classes8.dex */
public final /* synthetic */ class C implements InterfaceC8068j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F.a f8397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3013s f8398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3016v f8399c;

    public /* synthetic */ C(F.a aVar, C3013s c3013s, C3016v c3016v) {
        this.f8397a = aVar;
        this.f8398b = c3013s;
        this.f8399c = c3016v;
    }

    @Override // m3.InterfaceC8068j
    public final void accept(Object obj) {
        F.a aVar = this.f8397a;
        ((F) obj).X(aVar.f8405a, aVar.f8406b, this.f8398b, this.f8399c);
    }
}
