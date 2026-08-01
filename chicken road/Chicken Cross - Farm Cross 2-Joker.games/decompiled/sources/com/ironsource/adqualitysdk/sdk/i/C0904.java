package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘢ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0904 implements InterfaceC0823 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2534;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0730 f2535;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0830 f2536;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2537;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2538;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0557 f2539;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Context f2540;

    public C0904(C0682 c0682, Context context, AbstractC0557 abstractC0557, String str, String str2, AbstractC0830 abstractC0830, AbstractRunnableC0730 abstractRunnableC0730) {
        this.f2534 = c0682;
        this.f2540 = context;
        this.f2539 = abstractC0557;
        this.f2538 = str;
        this.f2537 = str2;
        this.f2536 = abstractC0830;
        this.f2535 = abstractRunnableC0730;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0823
    /* renamed from: ﾒ */
    public final void mo5675(String str) {
        C0682 c0682 = this.f2534;
        Context context = this.f2540;
        AbstractC0557 abstractC0557 = this.f2539;
        c0682.getClass();
        C0969 c0969 = TextUtils.isEmpty(str) ? null : new C0969(context, new C1042(str, c0682.f1862), c0682.f1856, c0682.f1863, abstractC0557);
        C0682 c06822 = this.f2534;
        Context context2 = this.f2540;
        String str2 = this.f2538;
        String str3 = this.f2537;
        AbstractC0830 abstractC0830 = this.f2536;
        AbstractC0557 abstractC05572 = this.f2539;
        AbstractRunnableC0730 abstractRunnableC0730 = this.f2535;
        c06822.getClass();
        AbstractC1145.m5895(new C0816(c06822, c0969, abstractC0830, str3, false, abstractRunnableC0730, str2, abstractC05572, context2));
    }
}
