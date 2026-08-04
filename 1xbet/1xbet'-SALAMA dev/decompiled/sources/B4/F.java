package B4;

import E4.C0169b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0169b f1078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E4.t f1079b;

    public /* synthetic */ F(C0169b c0169b, E4.t tVar) {
        this.f1078a = c0169b;
        this.f1079b = tVar;
    }

    @Override // B4.O
    public final void remove() {
        C0169b c0169b = this.f1078a;
        E4.t tVar = this.f1079b;
        c0169b.f2168c = true;
        tVar.getClass();
        tVar.f2232d.a(new A0.f(9, tVar, c0169b));
    }
}
