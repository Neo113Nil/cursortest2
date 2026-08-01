package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* loaded from: classes5.dex */
public class a2 extends x1 {
    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        super(bVar, activity, lVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.c.o(), (this.c.v0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.d.addView(kVar, this.e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.d);
        } else {
            this.b.setContentView(this.d);
        }
    }
}
