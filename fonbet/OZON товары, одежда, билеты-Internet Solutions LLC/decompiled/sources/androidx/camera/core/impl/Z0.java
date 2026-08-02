package androidx.camera.core.impl;

import C.a0;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Z0 implements C.a0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f38243b;

    /* renamed from: c, reason: collision with root package name */
    private final C.a0 f38244c;

    public Z0(long j11, @NonNull C.a0 a0Var) {
        x2.i.a("Timeout must be non-negative.", j11 >= 0);
        this.f38243b = j11;
        this.f38244c = a0Var;
    }

    @Override // C.a0
    public final long a() {
        return this.f38243b;
    }

    @Override // C.a0
    @NonNull
    public final a0.b c(@NonNull J j11) {
        a0.b c11 = this.f38244c.c(j11);
        long j12 = this.f38243b;
        return (j12 <= 0 || j11.b() < j12 - c11.a()) ? c11 : a0.b.f4156d;
    }
}
