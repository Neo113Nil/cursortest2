package com.startapp.sdk.adsbase;

import io.appmetrica.analytics.impl.Zb;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3289c;

    public /* synthetic */ n(Object obj, boolean z3, int i3) {
        this.f3287a = i3;
        this.f3289c = obj;
        this.f3288b = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3287a) {
            case 0:
                ((c) this.f3289c).b(this.f3288b);
                break;
            default:
                Zb.a((Zb) this.f3289c, this.f3288b);
                break;
        }
    }
}
