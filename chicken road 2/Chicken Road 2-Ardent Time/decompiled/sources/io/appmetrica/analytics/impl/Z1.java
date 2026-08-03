package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z1 implements io.appmetrica.analytics.appsetid.internal.AppSetIdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0216a2 f5371a;

    public Z1(io.appmetrica.analytics.impl.C0216a2 c0216a2) {
        this.f5371a = c0216a2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onAppSetIdRetrieved(java.lang.String str, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope appSetIdScope) {
        this.f5371a.f5449c = new io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId(str, appSetIdScope);
        this.f5371a.f5450d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    public final void onFailure(java.lang.Throwable th) {
        this.f5371a.f5450d.countDown();
    }
}
