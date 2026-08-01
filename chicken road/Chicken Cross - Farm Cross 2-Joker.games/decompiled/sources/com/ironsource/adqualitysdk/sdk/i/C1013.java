package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṟ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1013 implements InterfaceC0850 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f2979;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2980;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f2981;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f2982;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f2983;

    public C1013(C0900 c0900, C0623 c0623, C1074 c1074, C1226 c1226, List list) {
        this.f2979 = c0900;
        this.f2983 = c0623;
        this.f2982 = c1074;
        this.f2981 = c1226;
        this.f2980 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0850
    /* renamed from: ﾒ */
    public final boolean mo5386(ViewOnTouchListenerC0826 viewOnTouchListenerC0826, View view, MotionEvent motionEvent) {
        return this.f2983.m5583(this.f2982, this.f2981, C0900.m5707(this.f2979, this.f2980, new Object[]{this, viewOnTouchListenerC0826, view, motionEvent})).m5918();
    }
}
