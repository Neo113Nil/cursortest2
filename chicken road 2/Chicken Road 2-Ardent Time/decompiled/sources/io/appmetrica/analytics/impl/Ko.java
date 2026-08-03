package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Ko implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4564e;

    public /* synthetic */ Ko(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int i2) {
        this.f4560a = i2;
        this.f4563d = obj;
        this.f4561b = str;
        this.f4562c = str2;
        this.f4564e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4560a) {
            case 0:
                io.appmetrica.analytics.impl.F0.a((io.appmetrica.analytics.impl.F0) this.f4563d, this.f4561b, this.f4562c, (java.lang.String) this.f4564e);
                break;
            default:
                io.appmetrica.analytics.impl.L0.a((io.appmetrica.analytics.impl.L0) this.f4563d, this.f4561b, this.f4562c, (io.appmetrica.analytics.plugins.PluginErrorDetails) this.f4564e);
                break;
        }
    }
}
