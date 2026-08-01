package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0788 extends AbstractRunnableC0730 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0682 f2290;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0730 f2291;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0830 f2292;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2293;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2294;

    public C0788(C0682 c0682, String str, Context context, AbstractC0830 abstractC0830, AbstractRunnableC0730 abstractRunnableC0730) {
        this.f2290 = c0682;
        this.f2294 = str;
        this.f2293 = context;
        this.f2292 = abstractC0830;
        this.f2291 = abstractRunnableC0730;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (this.f2290.f1869.get()) {
            return;
        }
        String lowerCase = this.f2294.toLowerCase();
        C0651 c0651 = this.f2290.f1860;
        if (c0651 == null) {
            return;
        }
        c0651.f1790.put(lowerCase, new C0667(lowerCase));
        AbstractC1145.m5895(new C0789(this, lowerCase));
    }
}
