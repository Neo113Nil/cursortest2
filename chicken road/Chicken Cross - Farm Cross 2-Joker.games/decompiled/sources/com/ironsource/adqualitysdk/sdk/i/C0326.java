package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ĩ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0326 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1312 f309;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0381 f310;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0343 f311;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f312;

    public C0326(C1312 c1312, ViewGroup viewGroup, C0343 c0343, ViewOnLayoutChangeListenerC0381 viewOnLayoutChangeListenerC0381) {
        this.f309 = c1312;
        this.f312 = viewGroup;
        this.f311 = c0343;
        this.f310 = viewOnLayoutChangeListenerC0381;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1312 c1312 = this.f309;
        ViewGroup viewGroup = this.f312;
        C0343 c0343 = this.f311;
        c1312.getClass();
        View.OnTouchListener m5740 = AbstractC0931.m5740(viewGroup);
        if (!(m5740 instanceof ViewOnTouchListenerC0826)) {
            viewGroup.setOnTouchListener(new ViewOnTouchListenerC0826(m5740, c0343));
        }
        for (int i = 0; i < this.f312.getChildCount(); i++) {
            View childAt = this.f312.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                C1312 c13122 = this.f309;
                ViewOnLayoutChangeListenerC0381 viewOnLayoutChangeListenerC0381 = this.f310;
                c13122.getClass();
                new Handler(Looper.getMainLooper()).post(new C0326(c13122, (ViewGroup) childAt, new C0343(c13122), viewOnLayoutChangeListenerC0381));
            } else {
                C1312 c13123 = this.f309;
                C0343 c03432 = this.f311;
                c13123.getClass();
                View.OnTouchListener m57402 = AbstractC0931.m5740(childAt);
                if (!(m57402 instanceof ViewOnTouchListenerC0826)) {
                    childAt.setOnTouchListener(new ViewOnTouchListenerC0826(m57402, c03432));
                }
            }
        }
        this.f312.removeOnLayoutChangeListener(this.f310);
        this.f312.addOnLayoutChangeListener(this.f310);
    }
}
