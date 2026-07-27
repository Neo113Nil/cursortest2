package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class A2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f5666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B2 f5667c;

    public A2(B2 b22, Context context, Intent intent) {
        this.f5667c = b22;
        this.f5665a = context;
        this.f5666b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5667c.f5748a.consume(this.f5665a, this.f5666b);
    }
}
