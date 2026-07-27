package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0636l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f7730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7731b;

    public RunnableC0636l1(C0817s1 c0817s1, Activity activity) {
        this.f7731b = c0817s1;
        this.f7730a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0817s1 c0817s1 = this.f7731b;
        C0398bl c0398bl = c0817s1.f8277h;
        Activity activity = this.f7730a;
        Pa pa = c0817s1.d().f8150a;
        if (activity != null) {
            c0398bl.f.a(activity);
        }
        if (c0398bl.f7068e.a(activity, EnumC0738p.PAUSED)) {
            pa.b(activity);
        }
    }
}
