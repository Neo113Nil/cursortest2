package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698Ue implements S2.m {

    /* renamed from: k, reason: collision with root package name */
    public final C0733Ze f11773k;

    /* renamed from: l, reason: collision with root package name */
    public final S2.m f11774l;

    public C0698Ue(C0733Ze c0733Ze, S2.m mVar) {
        this.f11773k = c0733Ze;
        this.f11774l = mVar;
    }

    @Override // S2.m
    public final void N2() {
        S2.m mVar = this.f11774l;
        if (mVar != null) {
            mVar.N2();
        }
        this.f11773k.X();
    }

    @Override // S2.m
    public final void Q1() {
        S2.m mVar = this.f11774l;
        if (mVar != null) {
            mVar.Q1();
        }
    }

    @Override // S2.m
    public final void Z2() {
    }

    @Override // S2.m
    public final void d1(int i) {
        S2.m mVar = this.f11774l;
        if (mVar != null) {
            mVar.d1(i);
        }
        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = this.f11773k.f12501k;
        AbstractC1803xs.m((L7) viewTreeObserverOnGlobalLayoutListenerC0805bf.f12868V.f14828m, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12866T, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", viewTreeObserverOnGlobalLayoutListenerC0805bf.f12885o.f5852k);
        viewTreeObserverOnGlobalLayoutListenerC0805bf.a("onhide", hashMap);
    }

    @Override // S2.m
    public final void h1() {
        S2.m mVar = this.f11774l;
        if (mVar != null) {
            mVar.h1();
        }
    }

    @Override // S2.m
    public final void t1() {
    }
}
