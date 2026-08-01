package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4437h3 implements InterfaceC4381e1 {

    /* renamed from: a, reason: collision with root package name */
    private final K3 f8222a;
    private final Kd b;
    private final IronSource.a c;

    /* renamed from: com.ironsource.h3$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8223a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8223a = iArr;
        }
    }

    public C4437h3(K3 adFormatConfigurations, Kd kd, IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f8222a = adFormatConfigurations;
        this.b = kd;
        this.c = adFormat;
    }

    @Override // com.ironsource.InterfaceC4381e1
    public InterfaceC4532m9 a(Dd providerName) {
        NetworkSettings b;
        C4376de f;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Kd kd = this.b;
        if (kd == null || (b = kd.b(providerName.value())) == null) {
            return null;
        }
        int i = a.f8223a[this.c.ordinal()];
        if (i == 1) {
            S2 c = this.f8222a.c();
            if (c != null) {
                return new X2(new C4345c1(b, b.getBannerSettings(), this.c), c);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (f = this.f8222a.f()) != null) {
                return new Ud(new C4345c1(b, b.getRewardedVideoSettings(), this.c), f);
            }
            return null;
        }
        D9 d = this.f8222a.d();
        if (d != null) {
            return new G9(new C4345c1(b, b.getInterstitialSettings(), this.c), d);
        }
        return null;
    }
}
