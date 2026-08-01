package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒲ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0793 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0790 f2304;

    public C0793(C0790 c0790) {
        this.f2304 = c0790;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.ironsource.adqualitysdk.sdk.i.ᒯ] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0790 c0790 = this.f2304;
        C0682 c0682 = c0790.f2297;
        Context context = c0790.f2301;
        ArrayList arrayList = c0790.f2300;
        ArrayList arrayList2 = c0790.f2299;
        C0798 c0798 = c0790.f2298;
        String str = C0682.f1855;
        c0682.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC0830 abstractC0830 = (AbstractC0830) arrayList.remove(0);
        String str2 = (String) arrayList2.remove(0);
        if (!arrayList.isEmpty()) {
            c0798 = new C0790(c0682, context, arrayList, arrayList2, c0798);
        }
        AbstractC1145.m5891(new C0788(c0682, str2, context, abstractC0830, c0798));
    }
}
