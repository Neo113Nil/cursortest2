package com.digitalturbine.ignite.authenticator.decorator;

/* loaded from: classes2.dex */
public abstract class f implements com.digitalturbine.ignite.authenticator.decorator.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.digitalturbine.ignite.authenticator.decorator.a f3506a;
    public com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener b;

    public f(com.digitalturbine.ignite.authenticator.decorator.a aVar, com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener authenticationServiceListener) {
        this.f3506a = aVar;
        this.b = authenticationServiceListener;
        aVar.b(this);
        aVar.a(this);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean a() {
        return this.f3506a.a();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void b() {
        this.f3506a.b();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean c() {
        return this.f3506a.c();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public java.lang.String d() {
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void destroy() {
        this.b = null;
        this.f3506a.destroy();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final java.lang.String e() {
        return this.f3506a.e();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean f() {
        return this.f3506a.f();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public android.content.Context g() {
        return this.f3506a.g();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean h() {
        return this.f3506a.h();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public java.lang.String i() {
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean j() {
        return false;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI k() {
        return this.f3506a.k();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void l() {
        this.f3506a.l();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestFailed(java.lang.String str) {
        this.f3506a.onCredentialsRequestFailed(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestSuccess(java.lang.String str, java.lang.String str2) {
        this.f3506a.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f3506a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f3506a.onServiceDisconnected(componentName);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void a(java.lang.String str) {
        com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener authenticationServiceListener = this.b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void b(java.lang.String str) {
        com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener authenticationServiceListener = this.b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void c(java.lang.String str) {
        com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener authenticationServiceListener = this.b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener authenticationServiceListener = this.b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void b(com.digitalturbine.ignite.authenticator.decorator.a aVar) {
        this.f3506a.b(aVar);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void a(com.digitalturbine.ignite.authenticator.decorator.a aVar) {
        this.f3506a.a(aVar);
    }
}
