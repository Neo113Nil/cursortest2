package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0630f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f8163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8164b;

    public RunnableC0630f1(C0966s1 c0966s1, Activity activity) {
        this.f8164b = c0966s1;
        this.f8163a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1 c0966s1 = this.f8164b;
        C0547bl c0547bl = c0966s1.f9223h;
        Activity activity = this.f8163a;
        Pa pa = c0966s1.d().f9092a;
        if (activity != null) {
            c0547bl.f7955f.a(activity);
        }
        if (c0547bl.f7954e.a(activity, EnumC0887p.RESUMED)) {
            pa.a(activity);
        }
    }
}
