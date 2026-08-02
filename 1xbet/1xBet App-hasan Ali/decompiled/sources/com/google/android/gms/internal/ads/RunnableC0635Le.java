package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0635Le implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10335k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0642Me f10336l;

    public /* synthetic */ RunnableC0635Le(C0642Me c0642Me, int i) {
        this.f10335k = i;
        this.f10336l = c0642Me;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10335k) {
            case 0:
                C0711Wd c0711Wd = this.f10336l.f10638o;
                if (c0711Wd != null) {
                    c0711Wd.g();
                    break;
                }
                break;
            case 1:
                C0642Me c0642Me = this.f10336l;
                C0711Wd c0711Wd2 = c0642Me.f10638o;
                if (c0711Wd2 != null) {
                    if (!c0642Me.f10639p) {
                        c0711Wd2.h();
                        c0642Me.f10639p = true;
                    }
                    c0642Me.f10638o.f();
                    break;
                }
                break;
            default:
                C0711Wd c0711Wd3 = this.f10336l.f10638o;
                if (c0711Wd3 != null) {
                    c0711Wd3.e();
                    break;
                }
                break;
        }
    }
}
