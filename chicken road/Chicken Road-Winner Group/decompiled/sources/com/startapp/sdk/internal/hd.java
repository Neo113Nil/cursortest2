package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class hd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f3834b;

    public hd(ld ldVar, String str) {
        this.f3834b = ldVar;
        this.f3833a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3834b;
        String str = this.f3833a;
        if (!ldVar.f3994h) {
            ldVar.f4004r = System.currentTimeMillis();
            ldVar.f4003q.put(str, Float.valueOf(-1.0f));
            ldVar.f3991d.postDelayed(ldVar.f4005s, ldVar.f3995i);
            ldVar.f3994h = true;
        }
        ldVar.f4002p = false;
        ldVar.a();
    }
}
