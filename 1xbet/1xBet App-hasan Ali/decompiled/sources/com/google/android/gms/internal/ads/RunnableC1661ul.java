package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1661ul implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15895k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1616tl f15896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15897m;

    public /* synthetic */ RunnableC1661ul(C1616tl c1616tl, String str, int i) {
        this.f15895k = i;
        this.f15896l = c1616tl;
        this.f15897m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15895k) {
            case 0:
                this.f15896l.f15717d.d(this.f15897m);
                break;
            default:
                this.f15896l.f15717d.d(this.f15897m);
                break;
        }
    }
}
