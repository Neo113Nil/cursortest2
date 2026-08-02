package N0;

import S0.M;

/* loaded from: classes8.dex */
public final class b implements M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f18294a;

    public b(s sVar) {
        this.f18294a = sVar;
    }

    @Override // S0.M
    public final void dispose() {
        s sVar = this.f18294a;
        sVar.disposeComposition();
        sVar.a();
    }
}
