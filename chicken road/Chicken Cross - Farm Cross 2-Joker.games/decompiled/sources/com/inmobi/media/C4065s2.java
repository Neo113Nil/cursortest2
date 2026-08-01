package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4065s2 extends AbstractC4037r2 {

    /* renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f7365a;

    public C4065s2(BannerAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f7365a = adEventListener;
    }

    @Override // com.inmobi.media.K
    public final void a(Object obj, Map params) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f7365a.onAdClicked(ad, params);
    }

    @Override // com.inmobi.media.K
    public final void b(Object obj, AdMetaInfo info) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f7365a.onAdLoadSucceeded(ad, info);
    }

    @Override // com.inmobi.media.K
    public final void a(Object obj, AdMetaInfo info) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f7365a.onAdFetchSuccessful(ad, info);
    }

    @Override // com.inmobi.media.K
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullExpressionValue("r2", "getSimpleName(...)");
        this.f7365a.onAdLoadFailed(ad, status);
    }

    @Override // com.inmobi.media.K
    public final void a(Object obj, String data) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f7365a, ad, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
