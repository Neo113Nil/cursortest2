package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713Wf implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12062a;

    /* renamed from: b, reason: collision with root package name */
    public final C1476qf f12063b;

    public /* synthetic */ C0713Wf(C1476qf c1476qf, int i) {
        this.f12062a = i;
        this.f12063b = c1476qf;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f12062a) {
            case 0:
                return new C0706Vf(this.f12063b.a(), 0);
            default:
                return new C0706Vf(this.f12063b.a(), 1);
        }
    }
}
