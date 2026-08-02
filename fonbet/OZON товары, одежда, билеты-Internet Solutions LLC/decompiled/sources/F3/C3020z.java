package F3;

import F3.F;
import m3.InterfaceC8068j;

/* renamed from: F3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3020z implements InterfaceC8068j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F.a f8758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3013s f8759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3016v f8760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8761d;

    public /* synthetic */ C3020z(F.a aVar, C3013s c3013s, C3016v c3016v, int i11) {
        this.f8758a = aVar;
        this.f8759b = c3013s;
        this.f8760c = c3016v;
        this.f8761d = i11;
    }

    @Override // m3.InterfaceC8068j
    public final void accept(Object obj) {
        F f7 = (F) obj;
        F.a aVar = this.f8758a;
        f7.c0(aVar.f8405a, aVar.f8406b, this.f8759b, this.f8760c, this.f8761d);
    }
}
