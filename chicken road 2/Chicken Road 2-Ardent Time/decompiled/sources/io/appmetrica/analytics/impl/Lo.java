package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class Lo implements io.appmetrica.analytics.impl.H1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.J1 f4629b;

    public /* synthetic */ Lo(io.appmetrica.analytics.impl.J1 j12, int i2) {
        this.f4628a = i2;
        this.f4629b = j12;
    }

    @Override // io.appmetrica.analytics.impl.H1
    public final boolean a(android.content.Intent intent) {
        switch (this.f4628a) {
            case 0:
                return io.appmetrica.analytics.impl.J1.b(this.f4629b, intent);
            case 1:
                return io.appmetrica.analytics.impl.J1.a(this.f4629b, intent);
            default:
                return io.appmetrica.analytics.impl.J1.c(this.f4629b, intent);
        }
    }
}
