package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅴ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1088 extends BroadcastReceiver {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f3202;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f3203;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f3204;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f3205;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f3206;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3207;

    public C1088(C0900 c0900, C0623 c0623, C1226 c1226, C1074 c1074, List list, boolean z) {
        this.f3202 = c0900;
        this.f3207 = z;
        this.f3206 = c0623;
        this.f3205 = c1074;
        this.f3204 = c1226;
        this.f3203 = list;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.f3207) {
            AbstractC1145.m5892(new C1104(this, context, intent));
            return;
        }
        this.f3206.m5583(this.f3205, this.f3204, C0900.m5707(this.f3202, this.f3203, new Object[]{this, context, intent}));
    }
}
