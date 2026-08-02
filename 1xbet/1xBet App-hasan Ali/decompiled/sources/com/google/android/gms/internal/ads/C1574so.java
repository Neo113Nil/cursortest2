package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.so, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1574so implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15600a;

    /* renamed from: b, reason: collision with root package name */
    public final C1529ro f15601b;

    public /* synthetic */ C1574so(C1529ro c1529ro, int i) {
        this.f15600a = i;
        this.f15601b = c1529ro;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f15600a) {
            case 0:
                return (N7) this.f15601b.f15382l;
            default:
                return this.f15601b;
        }
    }
}
