package com.digitalturbine.ignite.authenticator;

/* loaded from: classes2.dex */
public class IgniteManager implements com.digitalturbine.ignite.authenticator.listeners.api.a {

    /* renamed from: a, reason: collision with root package name */
    public com.digitalturbine.ignite.authenticator.decorator.f f3496a;
    public com.digitalturbine.ignite.authenticator.b b;

    public IgniteManager(com.digitalturbine.ignite.authenticator.logger.ILogger iLogger, com.digitalturbine.ignite.authenticator.events.a aVar) {
        com.digitalturbine.ignite.authenticator.logger.a.b.f3510a = iLogger;
        com.digitalturbine.ignite.authenticator.events.b.b.f3508a = aVar;
    }

    public void authenticate() {
        com.digitalturbine.ignite.authenticator.utils.concurency.c.f3513a.execute(new com.digitalturbine.ignite.authenticator.a(this));
    }

    public void destroy() {
        this.b = null;
        this.f3496a.destroy();
    }

    public java.lang.String getOdt() {
        com.digitalturbine.ignite.authenticator.b bVar = this.b;
        return bVar != null ? bVar.f3498a : "";
    }

    public boolean isAuthenticated() {
        return this.f3496a.h();
    }

    public boolean isConnected() {
        return this.f3496a.a();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestFailed(java.lang.String str) {
        this.f3496a.onCredentialsRequestFailed(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestSuccess(java.lang.String str, java.lang.String str2) {
        this.f3496a.onCredentialsRequestSuccess(str, str2);
    }

    public IgniteManager(android.content.Context context, com.digitalturbine.ignite.authenticator.logger.ILogger iLogger, boolean z, com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener authenticationServiceListener) {
        this(iLogger, null);
        this.f3496a = new com.digitalturbine.ignite.authenticator.decorator.h(new com.digitalturbine.ignite.authenticator.decorator.e(context), false, z, authenticationServiceListener, this);
    }
}
