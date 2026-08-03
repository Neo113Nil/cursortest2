package com.fyber.inneractive.sdk.measurement;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.measurement.e f3782a;

    public a(com.fyber.inneractive.sdk.measurement.e eVar) {
        this.f3782a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            this.f3782a.b = str;
        }
    }
}
