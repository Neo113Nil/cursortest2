package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f4286a;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e b;

    public c(com.fyber.inneractive.sdk.web.e eVar) {
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.getClass();
        com.fyber.inneractive.sdk.web.e eVar = this.b;
        boolean z = eVar.f;
        if (z) {
            return;
        }
        com.fyber.inneractive.sdk.util.d dVar = new com.fyber.inneractive.sdk.util.d(eVar);
        eVar.d = dVar;
        if (z) {
            return;
        }
        try {
            eVar.f4331a.execute(dVar);
        } catch (java.lang.NullPointerException e) {
            com.fyber.inneractive.sdk.util.IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the null task: %s", e.getMessage());
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            com.fyber.inneractive.sdk.util.IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the task: %s", e2.getMessage());
        }
    }
}
