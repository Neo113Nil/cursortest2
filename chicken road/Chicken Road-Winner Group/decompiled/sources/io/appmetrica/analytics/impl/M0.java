package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6265b;

    public M0(C0817s1 c0817s1, Intent intent) {
        this.f6265b = c0817s1;
        this.f6264a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G7 g7 = this.f6265b.d().f8151b;
        Intent intent = this.f6264a;
        g7.getClass();
        if (intent != null) {
            g7.a(intent.getDataString(), false);
        }
    }
}
