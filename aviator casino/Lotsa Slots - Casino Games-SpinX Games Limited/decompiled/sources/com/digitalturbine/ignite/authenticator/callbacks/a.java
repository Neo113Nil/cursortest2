package com.digitalturbine.ignite.authenticator.callbacks;

/* loaded from: classes2.dex */
public final class a extends com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final com.digitalturbine.ignite.authenticator.decorator.a f3500a;

    public a(com.digitalturbine.ignite.authenticator.decorator.a aVar) {
        this.f3500a = aVar;
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(java.lang.String str) {
        this.f3500a.a(str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(java.lang.String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(java.lang.String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(java.lang.String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = new org.json.JSONObject(str).getJSONObject("data").getString("token");
        } catch (java.lang.Exception e) {
            com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e);
            com.digitalturbine.ignite.authenticator.logger.a.b("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e.toString());
            str2 = null;
        }
        this.f3500a.c(str2);
    }
}
