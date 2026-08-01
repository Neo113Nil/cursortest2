package com.digitalturbine.ignite.authenticator;

/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IgniteManager f5146a;

    public a(IgniteManager igniteManager) {
        this.f5146a = igniteManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5146a.f5145a.b();
    }
}
