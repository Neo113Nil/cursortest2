package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements o2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2.l f3419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o7 f3420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f3421d;

    public /* synthetic */ H(o2.l lVar, o7 o7Var, AdUnitConfig adUnitConfig, int i3) {
        this.f3418a = i3;
        this.f3419b = lVar;
        this.f3420c = o7Var;
        this.f3421d = adUnitConfig;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        int i3 = this.f3418a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i3) {
            case 0:
                return o7.b(this.f3419b, this.f3420c, this.f3421d, booleanValue);
            default:
                return o7.a(this.f3419b, this.f3420c, this.f3421d, booleanValue);
        }
    }
}
