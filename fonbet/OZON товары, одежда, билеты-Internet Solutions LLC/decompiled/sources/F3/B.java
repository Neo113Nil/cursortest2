package F3;

import F3.F;
import java.io.IOException;
import m3.InterfaceC8068j;

/* loaded from: classes8.dex */
public final /* synthetic */ class B implements InterfaceC8068j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F.a f8392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3013s f8393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3016v f8394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f8395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f8396e;

    public /* synthetic */ B(F.a aVar, C3013s c3013s, C3016v c3016v, IOException iOException, boolean z11) {
        this.f8392a = aVar;
        this.f8393b = c3013s;
        this.f8394c = c3016v;
        this.f8395d = iOException;
        this.f8396e = z11;
    }

    @Override // m3.InterfaceC8068j
    public final void accept(Object obj) {
        F f7 = (F) obj;
        F.a aVar = this.f8392a;
        f7.U(aVar.f8405a, aVar.f8406b, this.f8393b, this.f8394c, this.f8395d, this.f8396e);
    }
}
