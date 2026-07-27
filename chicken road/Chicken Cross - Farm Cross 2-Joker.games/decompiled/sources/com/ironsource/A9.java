package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A9 implements Cb {

    /* renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f7551a;
    private final InterstitialAdLoaderListener b;
    private final InterfaceC4381e1 c;
    private final InterfaceC4578p1 d;

    public A9(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, InterfaceC4381e1 adapterConfigProvider, InterfaceC4578p1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f7551a = adRequest;
        this.b = publisherListener;
        this.c = adapterConfigProvider;
        this.d = analyticsFactory;
    }

    @Override // com.ironsource.Cb
    public InterfaceC4767zb a() throws Exception {
        IronSourceError b;
        String instanceId = this.f7551a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC4596q1 a2 = this.d.a(new C4488k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Ab a3 = new Bb(this.f7551a.getAdm(), this.f7551a.getProviderName$mediationsdk_release(), this.c, C4464ic.e.a().c().get()).a();
            new C4747y9(a3).a();
            C4678uc c4678uc = new C4678uc();
            C4525m2 c4525m2 = new C4525m2(this.f7551a.getAdm(), this.f7551a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f7551a;
            Intrinsics.checkNotNull(a3);
            O7 o7 = O7.f7826a;
            return new C4729x9(interstitialAdRequest, a3, new C4765z9(o7, this.b), c4525m2, c4678uc, a2, new C4657t9(a2, o7.d()), null, null, 384, null);
        } catch (Exception e) {
            C4491k4.d().a(e);
            if (e instanceof C4591pe) {
                b = ((C4591pe) e).a();
            } else {
                C4635s5 c4635s5 = C4635s5.f8523a;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                b = c4635s5.b(message);
            }
            return new C4653t5(this.f7551a, new C4765z9(O7.f7826a, this.b), a2, b);
        }
    }

    public /* synthetic */ A9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC4381e1 interfaceC4381e1, InterfaceC4578p1 interfaceC4578p1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC4381e1, (i & 8) != 0 ? new C4560o1(IronSource.a.INTERSTITIAL) : interfaceC4578p1);
    }
}
