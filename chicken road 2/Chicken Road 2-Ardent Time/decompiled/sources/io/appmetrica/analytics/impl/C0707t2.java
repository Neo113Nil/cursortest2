package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707t2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.BiConsumer f6839a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f6840b;

    public C0707t2(io.appmetrica.analytics.impl.N2 n2, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor) {
        this.f6839a = n2;
        this.f6840b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.f6840b.execute(new io.appmetrica.analytics.impl.RunnableC0681s2(this, context, intent));
    }
}
