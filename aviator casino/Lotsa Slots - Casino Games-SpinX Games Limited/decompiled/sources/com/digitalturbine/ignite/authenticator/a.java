package com.digitalturbine.ignite.authenticator;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.digitalturbine.ignite.authenticator.IgniteManager f3497a;

    public a(com.digitalturbine.ignite.authenticator.IgniteManager igniteManager) {
        this.f3497a = igniteManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3497a.f3496a.b();
    }
}
