package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0481f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f7268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7269b;

    public RunnableC0481f1(C0817s1 c0817s1, Activity activity) {
        this.f7269b = c0817s1;
        this.f7268a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1 c0817s1 = this.f7269b;
        C0398bl c0398bl = c0817s1.f8277h;
        Activity activity = this.f7268a;
        Pa pa = c0817s1.d().f8150a;
        if (activity != null) {
            c0398bl.f.a(activity);
        }
        if (c0398bl.f7068e.a(activity, EnumC0738p.RESUMED)) {
            pa.a(activity);
        }
    }
}
