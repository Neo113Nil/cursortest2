package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0785l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f8651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8652b;

    public RunnableC0785l1(C0966s1 c0966s1, Activity activity) {
        this.f8652b = c0966s1;
        this.f8651a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1 c0966s1 = this.f8652b;
        C0547bl c0547bl = c0966s1.f9223h;
        Activity activity = this.f8651a;
        Pa pa = c0966s1.d().f9092a;
        if (activity != null) {
            c0547bl.f7955f.a(activity);
        }
        if (c0547bl.f7954e.a(activity, EnumC0887p.PAUSED)) {
            pa.b(activity);
        }
    }
}
