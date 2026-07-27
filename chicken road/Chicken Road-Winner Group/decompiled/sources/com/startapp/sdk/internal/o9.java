package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class o9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f4142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4144c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t9 f4145d;

    public o9(t9 t9Var, d9 d9Var, int i3, long j3) {
        this.f4145d = t9Var;
        this.f4142a = d9Var;
        this.f4143b = i3;
        this.f4144c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4145d.a(this.f4142a, this.f4143b, this.f4144c);
        } catch (Throwable unused) {
        }
    }
}
