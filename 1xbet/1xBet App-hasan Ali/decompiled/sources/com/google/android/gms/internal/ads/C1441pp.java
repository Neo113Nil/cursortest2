package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1441pp implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15051a;

    /* renamed from: b, reason: collision with root package name */
    public final C0606Hd f15052b;

    public /* synthetic */ C1441pp(C0606Hd c0606Hd, int i) {
        this.f15051a = i;
        this.f15052b = c0606Hd;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        switch (this.f15051a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 45;
            default:
                return 51;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        switch (this.f15051a) {
            case 0:
                return this.f15052b.d(new CallableC1819y7(1));
            case 1:
                return this.f15052b.d(new CallableC1819y7(2));
            case 2:
                return this.f15052b.d(new CallableC1819y7(3));
            case 3:
                return this.f15052b.d(new CallableC1819y7(4));
            default:
                return this.f15052b.d(new CallableC1819y7(5));
        }
    }
}
