package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Vo implements io.appmetrica.analytics.impl.InterfaceC0228ae {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Wk f5179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f5180c;

    public /* synthetic */ Vo(io.appmetrica.analytics.impl.Wk wk, android.app.Activity activity, int i2) {
        this.f5178a = i2;
        this.f5179b = wk;
        this.f5180c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0228ae
    public final void consume(java.lang.Object obj) {
        switch (this.f5178a) {
            case 0:
                this.f5179b.a(this.f5180c, (io.appmetrica.analytics.impl.C0407hc) obj);
                break;
            default:
                this.f5179b.b(this.f5180c, (io.appmetrica.analytics.impl.C0407hc) obj);
                break;
        }
    }
}
