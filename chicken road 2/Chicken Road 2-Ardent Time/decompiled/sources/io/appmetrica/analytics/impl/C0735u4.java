package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735u4 implements io.appmetrica.analytics.impl.InterfaceC0347f4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6875a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0813x4 f6876b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.ResultReceiver f6877c;

    public C0735u4(android.content.Context context, io.appmetrica.analytics.impl.C0813x4 c0813x4, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        this.f6875a = context;
        this.f6876b = c0813x4;
        this.f6877c = c0606p4.f6631c;
        c0813x4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0347f4
    public final void a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        this.f6876b.a(c0606p4.f6630b);
        this.f6876b.a(p5, this);
    }

    public final io.appmetrica.analytics.impl.C0813x4 b() {
        return this.f6876b;
    }

    public final android.content.Context c() {
        return this.f6875a;
    }

    public final android.os.ResultReceiver d() {
        return this.f6877c;
    }

    public final void a(io.appmetrica.analytics.impl.S3 s3) {
        io.appmetrica.analytics.impl.B6.a(this.f6877c, s3);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0347f4
    public final void a() {
        this.f6876b.b(this);
    }
}
