package com.fyber.inneractive.sdk.config;

/* loaded from: classes4.dex */
public final class s implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5287a;

    public s(v vVar) {
        this.f5287a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        r rVar = (r) obj;
        if (rVar != null) {
            v vVar = this.f5287a;
            if (rVar.equals(vVar.b)) {
                return;
            }
            vVar.d = true;
            vVar.b = rVar;
            com.fyber.inneractive.sdk.util.r.f5965a.execute(new t(vVar));
        }
    }
}
