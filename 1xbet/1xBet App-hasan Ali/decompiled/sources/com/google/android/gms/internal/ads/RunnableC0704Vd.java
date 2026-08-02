package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0704Vd implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11886k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11887l;

    /* renamed from: m, reason: collision with root package name */
    public final C0711Wd f11888m;

    public RunnableC0704Vd(C0711Wd c0711Wd) {
        this.f11886k = 2;
        this.f11887l = false;
        this.f11888m = c0711Wd;
    }

    public void a() {
        this.f11887l = true;
        this.f11888m.l();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11886k) {
            case 0:
                C0711Wd c0711Wd = this.f11888m;
                c0711Wd.getClass();
                c0711Wd.c("windowFocusChanged", "hasWindowFocus", String.valueOf(this.f11887l));
                break;
            case 1:
                this.f11888m.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f11887l));
                break;
            default:
                if (!this.f11887l) {
                    this.f11888m.l();
                    T2.H h3 = T2.L.f5672l;
                    h3.removeCallbacks(this);
                    h3.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0704Vd(C0711Wd c0711Wd, boolean z3, int i) {
        this.f11886k = i;
        this.f11888m = c0711Wd;
        this.f11887l = z3;
    }
}
