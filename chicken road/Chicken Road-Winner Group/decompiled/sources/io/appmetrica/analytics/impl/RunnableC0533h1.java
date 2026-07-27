package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0533h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f7396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f7397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0817s1 f7398d;

    public RunnableC0533h1(C0817s1 c0817s1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f7398d = c0817s1;
        this.f7395a = context;
        this.f7396b = startupParamsCallback;
        this.f7397c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0946x0 c0946x0 = this.f7398d.f8271a;
        Context applicationContext = this.f7395a.getApplicationContext();
        c0946x0.getClass();
        C0920w0 a3 = C0920w0.a(applicationContext);
        a3.f().a(this.f7396b, this.f7397c);
    }
}
