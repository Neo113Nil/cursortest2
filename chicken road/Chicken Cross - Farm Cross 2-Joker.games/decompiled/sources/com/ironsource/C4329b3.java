package com.ironsource;

import com.google.android.material.internal.ViewUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4329b3 implements Cb {

    /* renamed from: a, reason: collision with root package name */
    private final BannerAdRequest f8091a;
    private final BannerAdLoaderListener b;
    private final InterfaceC4381e1 c;
    private final InterfaceC4578p1 d;

    public C4329b3(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, InterfaceC4381e1 adapterConfigProvider, InterfaceC4578p1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f8091a = adRequest;
        this.b = publisherListener;
        this.c = adapterConfigProvider;
        this.d = analyticsFactory;
    }

    @Override // com.ironsource.Cb
    public InterfaceC4767zb a() throws Exception {
        IronSourceError a2;
        String instanceId = this.f8091a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC4596q1 a3 = this.d.a(new C4488k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Ab a4 = new Bb(this.f8091a.getAdm(), this.f8091a.getProviderName$mediationsdk_release(), this.c, C4464ic.e.a().c().get()).a();
            new Z2(a4, this.f8091a.getSize()).a();
            C4678uc c4678uc = new C4678uc();
            C4525m2 c4525m2 = new C4525m2(this.f8091a.getAdm(), this.f8091a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f8091a;
            AdSize size = bannerAdRequest.getSize();
            Intrinsics.checkNotNull(a4);
            O7 o7 = O7.f7826a;
            return new Y2(bannerAdRequest, size, c4525m2, a4, c4678uc, a3, new C4286a3(o7, this.b), new G2(a3, o7.d()), null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        } catch (Exception e) {
            C4491k4.d().a(e);
            if (e instanceof C4591pe) {
                a2 = ((C4591pe) e).a();
            } else {
                C4635s5 c4635s5 = C4635s5.f8523a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                a2 = c4635s5.a(message);
            }
            return new C4617r5(a2, new C4286a3(O7.f7826a, this.b), a3);
        }
    }

    public /* synthetic */ C4329b3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC4381e1 interfaceC4381e1, InterfaceC4578p1 interfaceC4578p1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC4381e1, (i & 8) != 0 ? new C4560o1(IronSource.a.BANNER) : interfaceC4578p1);
    }
}
