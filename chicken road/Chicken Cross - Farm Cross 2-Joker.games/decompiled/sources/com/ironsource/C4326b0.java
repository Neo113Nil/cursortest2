package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4326b0 implements InterfaceC4283a0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4660tc f8088a;

    /* renamed from: com.ironsource.b0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8089a = new a();
        public static final int b = 1000;

        private a() {
        }
    }

    public C4326b0(InterfaceC4660tc networkLoadApi) {
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.f8088a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC4283a0
    public String a() {
        return this.f8088a.a();
    }

    @Override // com.ironsource.InterfaceC4283a0
    public void a(J9 adInstance, Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.f8088a.a(adInstance, new C4696vc(null, false, 3, null));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
            String str = "1000: loadAd failed: " + e.getMessage();
            Gc b = adInstance.b();
            if (b instanceof Y5) {
                Gc b2 = adInstance.b();
                Intrinsics.checkNotNull(b2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((Y5) b2).onInterstitialLoadFailed(str);
            } else if (b instanceof Ic) {
                Gc b3 = adInstance.b();
                Intrinsics.checkNotNull(b3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Ic) b3).onBannerLoadFail(str);
            }
        }
    }
}
