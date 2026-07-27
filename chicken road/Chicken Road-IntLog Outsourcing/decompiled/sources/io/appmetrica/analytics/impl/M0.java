package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f7119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7120b;

    public M0(C0966s1 c0966s1, Intent intent) {
        this.f7120b = c0966s1;
        this.f7119a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G7 g7 = this.f7120b.d().f9093b;
        Intent intent = this.f7119a;
        g7.getClass();
        if (intent != null) {
            g7.a(intent.getDataString(), false);
        }
    }
}
