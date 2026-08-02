package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Long f3335a;
    public int b = 0;
    public final /* synthetic */ com.dyneti.android.dyscan.t1 c;

    public r1(com.dyneti.android.dyscan.t1 t1Var) {
        this.c = t1Var;
    }

    public final void a() {
        if (this.f3335a == null) {
            this.f3335a = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.c.f3341a);
        }
        this.b++;
    }
}
