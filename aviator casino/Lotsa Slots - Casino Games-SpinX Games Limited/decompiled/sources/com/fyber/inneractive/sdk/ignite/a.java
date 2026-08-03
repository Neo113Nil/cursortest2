package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class a extends com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.r0 f3770a;

    public a(com.fyber.inneractive.sdk.web.r0 r0Var) {
        this.f3770a = r0Var;
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("CancelTaskCallback onError %s", str);
        this.f3770a.a(false);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("CancelTaskCallback onProgress %s", str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("CancelTaskCallback onScheduled %s", str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("CancelTaskCallback onStart %s", str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("CancelTaskCallback onSuccess %s", str);
        this.f3770a.a(true);
    }
}
