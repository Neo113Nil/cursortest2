package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.b0 f4181a;

    public c0(com.fyber.inneractive.sdk.protobuf.b0 b0Var) {
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        if (b0Var == null) {
            throw new java.lang.NullPointerException("output");
        }
        this.f4181a = b0Var;
        b0Var.f4178a = this;
    }

    public final void a(int i, float f) {
        com.fyber.inneractive.sdk.protobuf.b0 b0Var = this.f4181a;
        b0Var.getClass();
        b0Var.a(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d) {
        com.fyber.inneractive.sdk.protobuf.b0 b0Var = this.f4181a;
        b0Var.getClass();
        b0Var.a(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void a(int i, int i2) {
        this.f4181a.d(i, com.fyber.inneractive.sdk.protobuf.b0.d(i2));
    }

    public final void a(int i, long j) {
        this.f4181a.b(i, com.fyber.inneractive.sdk.protobuf.b0.b(j));
    }

    public final void a(int i, java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.t2 t2Var) {
        com.fyber.inneractive.sdk.protobuf.b0 b0Var = this.f4181a;
        b0Var.c(i, 3);
        t2Var.a(obj, b0Var.f4178a);
        b0Var.c(i, 4);
    }
}
