package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ƭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0369 extends RelativeLayout {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1312 f471;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0369(C1312 c1312, Context context) {
        super(context);
        this.f471 = c1312;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1312.m5945(this.f471, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
