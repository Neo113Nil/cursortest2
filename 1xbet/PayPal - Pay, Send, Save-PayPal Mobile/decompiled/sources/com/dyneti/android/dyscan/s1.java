package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public long f3338a = 0;
    public long b = 0;
    public java.lang.Long c = null;
    public java.lang.Long d = null;
    public int e = 0;

    public final void a() {
        if (this.f3338a != 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f3338a;
            this.b += elapsedRealtime;
            this.e++;
            java.lang.Long l = this.c;
            if (l == null || elapsedRealtime > l.longValue()) {
                this.c = java.lang.Long.valueOf(elapsedRealtime);
            }
            java.lang.Long l2 = this.d;
            if (l2 == null || elapsedRealtime < l2.longValue()) {
                this.d = java.lang.Long.valueOf(elapsedRealtime);
            }
        }
    }
}
