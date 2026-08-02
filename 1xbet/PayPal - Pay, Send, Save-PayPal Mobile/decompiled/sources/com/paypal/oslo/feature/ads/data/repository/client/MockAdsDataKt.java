package com.paypal.oslo.feature.ads.data.repository.client;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsResponse;", "createMockResponse", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsResponse;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockAdsDataKt {
    public static final com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse createMockResponse() {
        final com.paypal.oslo.feature.ads.data.models.smithy.Ad invoke = com.paypal.oslo.feature.ads.data.models.smithy.Ad.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt.$r8$lambda$sRUbIT_mMGYa5nYk9JVgIPqqAwc((com.paypal.oslo.feature.ads.data.models.smithy.Ad.Builder) obj);
            }
        });
        return com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt.m11970$r8$lambda$zIHmY1mjRgHRUK3CW72H73cRP4(com.paypal.oslo.feature.ads.data.models.smithy.Ad.this, (com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse.Builder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CFWxGVdPG89hOrbIGF4JpQ32mgo(com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setUrlX1("https://cdn.joinhoney.com/oslo-lifestyle-images/HomeDemoContent_121025/Target_Circle.png");
        builder.setUrlX2("https://cdn.joinhoney.com/oslo-lifestyle-images/HomeDemoContent_121025/Target_Circle.png");
        builder.setAltText("Target Advertisement");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oAdAP6PwzdsZKOuofnfH8n_rPIg(com.paypal.oslo.feature.ads.data.models.smithy.Cta.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setText("Shop");
        builder.setClickThroughUrl("https://example.com/ad-click");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sRUbIT_mMGYa5nYk9JVgIPqqAwc(com.paypal.oslo.feature.ads.data.models.smithy.Ad.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setClickUrls(kotlin.collections.CollectionsKt.listOf("https://example.com/click-tracking"));
        builder.setImpressionUrls(kotlin.collections.CollectionsKt.listOf("https://example.com/impression-tracking"));
        builder.setThirdPartyClickTrackers(kotlin.collections.CollectionsKt.emptyList());
        builder.setThirdPartyImpressionTrackers(kotlin.collections.CollectionsKt.emptyList());
        builder.setResponse(new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd(com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt.$r8$lambda$wPWxrPCYD8VEG5q33TlLr1tElO8((com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse.Builder) obj);
            }
        })));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wPWxrPCYD8VEG5q33TlLr1tElO8(com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setTitle("Circle Week starts\nNovember 20");
        builder.setAdvertiserName("Target");
        builder.setAdvertiserLogoImageUrl("https://cdn.joinhoney.com/images/rewards-hub/target-logo.png");
        builder.setSubtitle("Sponsored");
        builder.setImpressionStrategy(null);
        builder.setRawClickUrl("https://example.com/ad-click");
        builder.setCta(com.paypal.oslo.feature.ads.data.models.smithy.Cta.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt.$r8$lambda$oAdAP6PwzdsZKOuofnfH8n_rPIg((com.paypal.oslo.feature.ads.data.models.smithy.Cta.Builder) obj);
            }
        }));
        builder.setImage(com.paypal.oslo.feature.ads.data.models.smithy.Image.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt.$r8$lambda$CFWxGVdPG89hOrbIGF4JpQ32mgo((com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder) obj);
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zIHmY1mjRgH-RUK3CW72H73cRP4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11970$r8$lambda$zIHmY1mjRgHRUK3CW72H73cRP4(com.paypal.oslo.feature.ads.data.models.smithy.Ad ad, com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setAds(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.ads.data.models.smithy.Placement.Hero.INSTANCE, kotlin.collections.CollectionsKt.listOf(ad))));
        return kotlin.Unit.INSTANCE;
    }
}
