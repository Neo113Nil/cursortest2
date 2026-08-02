package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Ah, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556Ah implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7699a;

    /* renamed from: b, reason: collision with root package name */
    public final C1119ih f7700b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f7701c;

    public C0556Ah(C1119ih c1119ih, CD cd) {
        this.f7699a = 1;
        this.f7700b = c1119ih;
        this.f7701c = cd;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f7699a) {
            case 0:
                return new C1882zh(this.f7700b.a());
            case 1:
                return new Xi(this.f7700b.a(), (C1041gs) this.f7701c.d());
            case 2:
                return new Ti((Context) this.f7701c.d(), new HashSet(), this.f7700b.a());
            default:
                return new Pk((Yh) this.f7701c.d(), this.f7700b.a());
        }
    }

    public /* synthetic */ C0556Ah(CD cd, C1119ih c1119ih, int i) {
        this.f7699a = i;
        this.f7701c = cd;
        this.f7700b = c1119ih;
    }
}
