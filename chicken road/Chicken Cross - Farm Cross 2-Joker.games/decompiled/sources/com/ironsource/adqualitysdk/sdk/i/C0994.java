package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵩ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0994 implements InterfaceC0850 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0850 f2917;

    public C0994(InterfaceC0850 interfaceC0850) {
        this.f2917 = interfaceC0850;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0850
    /* renamed from: ﾒ */
    public final boolean mo5386(ViewOnTouchListenerC0826 viewOnTouchListenerC0826, View view, MotionEvent motionEvent) {
        AbstractC1145.m5892(new C1007(this, viewOnTouchListenerC0826, view, motionEvent));
        return false;
    }
}
