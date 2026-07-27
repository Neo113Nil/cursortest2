package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.g7;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f2943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2944c;

    public /* synthetic */ h(BannerStandard bannerStandard, String str, int i3) {
        this.f2942a = i3;
        this.f2943b = bannerStandard;
        this.f2944c = str;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        Void lambda$reload$2;
        Void lambda$onFailedToReceiveBanner$3;
        Boolean bool = (Boolean) obj;
        switch (this.f2942a) {
            case 0:
                lambda$reload$2 = this.f2943b.lambda$reload$2(this.f2944c, bool);
                return lambda$reload$2;
            default:
                lambda$onFailedToReceiveBanner$3 = this.f2943b.lambda$onFailedToReceiveBanner$3(this.f2944c, bool);
                return lambda$onFailedToReceiveBanner$3;
        }
    }
}
