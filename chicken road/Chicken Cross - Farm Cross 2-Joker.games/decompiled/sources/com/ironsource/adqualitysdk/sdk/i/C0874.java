package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᕝ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0874 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object f2496 = new Object();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public volatile C0460 f2497;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2495 = StringFog.decrypt("0hRW1m8RsmnREwTRakyzPdNBUIE6QuJp0hFW3T5E5TnUQlCBaEKzPtETBNM6F+BlgRVW1WlF7z7X\nQlCGa0yyPdREVoZvQuFk1EJchzpM4D7WRl2FOk3nPdIYUIVjR7Vl00YBhm1CsmnXQQPQbxezONQT\nAIE5TbU4hBNQhWkV72/bFg==\n", "4iBl5Ft011w=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final C0874 f2494 = new C0874();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5688(Context context, String str) {
        synchronized (this.f2496) {
            if (this.f2497 != null) {
                return;
            }
            C0460 c0460 = new C0460(new C0972(IronSourceAdQuality.getSDKVersion(), AbstractC1191.m5910(str)));
            c0460.f856.f1544.put(1, C0604.m5556(f2495));
            c0460.m5451(context);
            this.f2497 = c0460;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5687() {
        synchronized (this.f2496) {
            this.f2497 = null;
            C1198.f3392.m5921();
        }
    }
}
