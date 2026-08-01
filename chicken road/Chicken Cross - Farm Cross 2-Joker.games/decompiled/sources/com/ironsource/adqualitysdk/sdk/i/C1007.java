package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ḻ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1007 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0994 f2931;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f2932;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f2933;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC0826 f2934;

    public C1007(C0994 c0994, ViewOnTouchListenerC0826 viewOnTouchListenerC0826, View view, MotionEvent motionEvent) {
        this.f2931 = c0994;
        this.f2934 = viewOnTouchListenerC0826;
        this.f2933 = view;
        this.f2932 = motionEvent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f2931.f2917.mo5386(this.f2934, this.f2933, this.f2932);
    }
}
