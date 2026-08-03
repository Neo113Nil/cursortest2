package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f4633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0706t1 f4634b;

    public M0(io.appmetrica.analytics.impl.C0706t1 c0706t1, android.content.Intent intent) {
        this.f4634b = c0706t1;
        this.f4633a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.appmetrica.analytics.impl.C0842y7 c0842y7 = this.f4634b.d().f6187b;
        android.content.Intent intent = this.f4633a;
        c0842y7.getClass();
        if (intent != null) {
            c0842y7.a(intent.getDataString(), false);
        }
    }
}
