package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῒ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1058 implements InterfaceC1029 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f3155;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f3156;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f3157;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f3158;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f3159;

    public C1058(C0900 c0900, C0623 c0623, C1074 c1074, C1226 c1226, List list) {
        this.f3155 = c0900;
        this.f3159 = c0623;
        this.f3158 = c1074;
        this.f3157 = c1226;
        this.f3156 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1029
    /* renamed from: ﾒ */
    public final void mo5806(ViewOnClickListenerC1011 viewOnClickListenerC1011, View view) {
        this.f3159.m5583(this.f3158, this.f3157, C0900.m5707(this.f3155, this.f3156, new Object[]{this, viewOnClickListenerC1011, view}));
    }
}
