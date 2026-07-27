package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.k1;
import com.startapp.sdk.internal.n1;

/* loaded from: classes.dex */
public final class b implements BannerCreator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2888b;

    public b(c cVar) {
        this.f2888b = cVar;
    }

    @Override // com.startapp.sdk.ads.banner.BannerCreator
    public final View create(Context context, BannerListener bannerListener) {
        BannerStandard mrec;
        if (this.f2887a) {
            throw new IllegalStateException();
        }
        int i3 = n1.f4082a[this.f2888b.f2952b.ordinal()];
        if (i3 == 1) {
            c cVar = this.f2888b;
            mrec = new Mrec(context, false, cVar.f2953c, cVar.f2954d);
        } else if (i3 != 2) {
            c cVar2 = this.f2888b;
            mrec = new Banner(context, false, cVar2.f2953c, cVar2.f2954d);
        } else {
            c cVar3 = this.f2888b;
            mrec = new Cover(context, false, cVar3.f2953c, cVar3.f2954d);
        }
        mrec.setBannerListener(bannerListener);
        mrec.addOnAttachStateChangeListener(new k1(this, mrec));
        this.f2887a = true;
        return mrec;
    }
}
