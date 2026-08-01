package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ｊ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC1259 implements View.OnAttachStateChangeListener {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f3553;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f3554;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f3555;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3556;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ List f3557;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f3558;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f3559;

    public ViewOnAttachStateChangeListenerC1259(C0900 c0900, C0623 c0623, C0623 c06232, List list, boolean z, C1074 c1074, C1226 c1226) {
        this.f3553 = c0900;
        this.f3559 = c0623;
        this.f3558 = c06232;
        this.f3557 = list;
        this.f3556 = z;
        this.f3555 = c1074;
        this.f3554 = c1226;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        m5941(this.f3559, view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m5941(this.f3558, view);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5941(C0623 c0623, View view) {
        try {
            ArrayList m5707 = C0900.m5707(this.f3553, this.f3557, new Object[]{this, view});
            if (this.f3556) {
                c0623.m5583(this.f3555, this.f3554, m5707);
            } else {
                AbstractC1145.m5892(new C1260(this, c0623, m5707));
            }
        } catch (Throwable th) {
            AbstractC1086.m5875(this.f3554.m5929(), StringFog.decrypt("DVyQEAPEFgBoYYw+BZAeDSB9lh4FgTwGKUCFGj2NDBotQIcNUY0RHSFKh18=\n", "SC7if3Hkf24=\n") + c0623.f1642, th, null);
        }
    }
}
