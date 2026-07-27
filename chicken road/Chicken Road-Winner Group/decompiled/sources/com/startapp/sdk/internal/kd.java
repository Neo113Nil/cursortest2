package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f3957b;

    public kd(ld ldVar, String str) {
        this.f3957b = ldVar;
        this.f3956a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3957b;
        String str = this.f3956a;
        if (ldVar.f3993g || ldVar.f4001o || !ldVar.f3992e.equals(str) || g0.a(str)) {
            return;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            ldVar.f4002p = true;
            Float f = (Float) ldVar.f4003q.get(str);
            if (f == null || f.floatValue() < 0.0f) {
                ldVar.f4003q.put(str, Float.valueOf((System.currentTimeMillis() - ldVar.f4004r) / 1000.0f));
            }
            synchronized (ldVar.f3991d) {
                ldVar.f3991d.removeCallbacks(ldVar.f4007u);
                ldVar.f3991d.postDelayed(ldVar.f4007u, ldVar.f3996j);
            }
        }
    }
}
