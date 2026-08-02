package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1527rm implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15373k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1572sm f15374l;

    public /* synthetic */ RunnableC1527rm(C1572sm c1572sm, int i) {
        this.f15373k = i;
        this.f15374l = c1572sm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15373k) {
            case 0:
                this.f15374l.a();
                break;
            default:
                this.f15374l.a();
                break;
        }
    }
}
