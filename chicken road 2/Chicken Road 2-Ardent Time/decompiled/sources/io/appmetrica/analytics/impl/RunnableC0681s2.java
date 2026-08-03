package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0681s2 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f6786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f6787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0707t2 f6788c;

    public RunnableC0681s2(io.appmetrica.analytics.impl.C0707t2 c0707t2, android.content.Context context, android.content.Intent intent) {
        this.f6788c = c0707t2;
        this.f6786a = context;
        this.f6787b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6788c.f6839a.consume(this.f6786a, this.f6787b);
    }
}
