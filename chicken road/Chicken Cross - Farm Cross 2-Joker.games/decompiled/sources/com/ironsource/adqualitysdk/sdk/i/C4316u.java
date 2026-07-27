package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4316u extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C4319x f285;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f286;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f287;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f288;

    public C4316u(C4319x c4319x, WebView webView, String str, boolean z) {
        this.f285 = c4319x;
        this.f288 = webView;
        this.f287 = str;
        this.f286 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        AbstractViewOnLayoutChangeListenerC4320y abstractViewOnLayoutChangeListenerC4320y = this.f285.f296;
        if (abstractViewOnLayoutChangeListenerC4320y.f302) {
            List list = abstractViewOnLayoutChangeListenerC4320y.f305;
            if (list == null || list.isEmpty()) {
                C4319x c4319x = this.f285;
                WebView webView = this.f288;
                String str = this.f287;
                boolean z = this.f286;
                c4319x.getClass();
                AbstractC1145.m5893(new C4318w(c4319x, webView, str, z));
                return;
            }
            Iterator it = this.f285.f296.f305.iterator();
            while (it.hasNext()) {
                if (this.f287.startsWith((String) it.next())) {
                    C4319x c4319x2 = this.f285;
                    WebView webView2 = this.f288;
                    String str2 = this.f287;
                    boolean z2 = this.f286;
                    c4319x2.getClass();
                    AbstractC1145.m5893(new C4318w(c4319x2, webView2, str2, z2));
                    return;
                }
            }
        }
    }
}
