package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0608k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f7676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0660m f7677b;

    public RunnableC0608k(C0660m c0660m, Activity activity) {
        this.f7677b = c0660m;
        this.f7676a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7677b.a(this.f7676a);
    }
}
