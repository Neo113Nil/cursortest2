package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943ek implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13328a;

    /* renamed from: b, reason: collision with root package name */
    public final C0905dr f13329b;

    public /* synthetic */ C0943ek(C0905dr c0905dr, int i) {
        this.f13328a = i;
        this.f13329b = c0905dr;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f13328a) {
            case 0:
                return (C0673Ra) this.f13329b.f13188n;
            case 1:
                return (C0680Sa) this.f13329b.f13187m;
            default:
                return (InterfaceC0694Ua) this.f13329b.f13186l;
        }
    }
}
