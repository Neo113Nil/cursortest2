package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘂ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0899 extends AbstractRunnableC0730 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2524;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0730 f2525;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0830 f2526;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ String f2527;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ String f2528;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0557 f2529;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2530;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f2531;

    public C0899(C0682 c0682, Context context, String str, AbstractC0557 abstractC0557, String str2, String str3, AbstractC0830 abstractC0830, AbstractRunnableC0730 abstractRunnableC0730) {
        this.f2524 = c0682;
        this.f2531 = context;
        this.f2530 = str;
        this.f2529 = abstractC0557;
        this.f2528 = str2;
        this.f2527 = str3;
        this.f2526 = abstractC0830;
        this.f2525 = abstractRunnableC0730;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0682 c0682 = this.f2524;
        Context context = this.f2531;
        String str = this.f2530;
        AbstractC0557 abstractC0557 = this.f2529;
        c0682.getClass();
        C0969 c0969 = TextUtils.isEmpty(str) ? null : new C0969(context, new C1042(str, c0682.f1862), c0682.f1856, c0682.f1863, abstractC0557);
        if (c0969 == null) {
            AbstractC1145.m5895(this.f2525);
            return;
        }
        C0682 c06822 = this.f2524;
        Context context2 = this.f2531;
        String str2 = this.f2528;
        String str3 = this.f2527;
        AbstractC0830 abstractC0830 = this.f2526;
        AbstractC0557 abstractC05572 = this.f2529;
        AbstractRunnableC0730 abstractRunnableC0730 = this.f2525;
        c06822.getClass();
        AbstractC1145.m5895(new C0816(c06822, c0969, abstractC0830, str3, true, abstractRunnableC0730, str2, abstractC05572, context2));
    }
}
