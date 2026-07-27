package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f6172b;

    public K0(C0817s1 c0817s1, Intent intent) {
        this.f6172b = c0817s1;
        this.f6171a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G7 g7 = this.f6172b.d().f8151b;
        Intent intent = this.f6171a;
        g7.getClass();
        if (intent != null) {
            g7.a(intent.getDataString(), false);
        }
    }
}
