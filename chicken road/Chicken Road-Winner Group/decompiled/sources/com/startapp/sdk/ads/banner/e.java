package com.startapp.sdk.ads.banner;

import com.startapp.sdk.ads.banner.BannerRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements BannerRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f2966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f2967c;

    public /* synthetic */ e(BannerRequest bannerRequest, BannerRequest.Callback callback, int i3) {
        this.f2965a = i3;
        this.f2966b = bannerRequest;
        this.f2967c = callback;
    }

    @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
    public final void onFinished(BannerCreator bannerCreator, String str) {
        switch (this.f2965a) {
            case 0:
                this.f2966b.lambda$loadInnerAd$2(this.f2967c, bannerCreator, str);
                break;
            default:
                this.f2966b.lambda$load$0(this.f2967c, bannerCreator, str);
                break;
        }
    }
}
