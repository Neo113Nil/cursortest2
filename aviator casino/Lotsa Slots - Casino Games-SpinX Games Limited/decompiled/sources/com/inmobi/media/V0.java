package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class V0 {
    public static void a(com.inmobi.media.ads.network.common.model.AdResponse adResponse, com.inmobi.media.C2799u9 c2799u9, kotlin.jvm.functions.Function1 onFetchEvent) {
        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFetchEvent, "onFetchEvent");
        java.util.Objects.toString(adResponse);
        com.inmobi.media.ads.network.common.model.AdSet adSet = (com.inmobi.media.ads.network.common.model.AdSet) kotlin.collections.CollectionsKt.getOrNull(adResponse.getAdSets(), 0);
        if (kotlin.text.StringsKt.trim((java.lang.CharSequence) adResponse.getRequestId()).toString().length() == 0) {
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2208))));
        }
        if (adResponse.getAdSets().isEmpty()) {
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NO_FILL), new com.inmobi.media.C2360dj((short) 54));
        }
        if (adSet == null) {
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2360dj((short) 2364));
        }
        if (adSet.getAds().isEmpty()) {
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NO_FILL), new com.inmobi.media.C2360dj((short) 54));
        }
        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) kotlin.collections.CollectionsKt.getOrNull(adSet.getAds(), 0);
        java.lang.String creativeType = (ad == null || (metaInfo = ad.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("isRewarded", java.lang.Boolean.valueOf(adSet.getIsRewarded())));
        if (creativeType != null) {
            mutableMapOf.put("creativeType", creativeType);
        }
        onFetchEvent.invoke(new com.inmobi.media.C2334cj(mutableMapOf));
        a(adSet.getAdSetId(), adSet.getIsRewarded());
        a(adSet, c2799u9);
    }

    public static void a(java.lang.String str, boolean z) {
        if (str.length() == 0) {
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2231), kotlin.TuplesKt.to("isRewarded", java.lang.Boolean.valueOf(z)))));
        }
    }

    public static void a(com.inmobi.media.ads.network.common.model.AdSet adSet, com.inmobi.media.C2799u9 c2799u9) {
        java.util.Objects.toString(adSet);
        int i = 0;
        if (adSet.getAds().peekFirst() != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (java.lang.Object obj : adSet.getAds()) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                if (i == 0) {
                    a(ad);
                } else {
                    try {
                        a(ad);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } catch (com.inmobi.media.Y e) {
                        if (c2799u9 != null) {
                            c2799u9.b("AdResponseValidator", "validateAdObjects Exception: (Index: " + i + ") - " + e);
                        }
                        linkedHashSet.add(ad);
                    }
                }
                i = i2;
            }
            adSet.getAds().removeAll(linkedHashSet);
            return;
        }
        throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2116), kotlin.TuplesKt.to("isRewarded", java.lang.Boolean.valueOf(adSet.getIsRewarded())))));
    }

    public static void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        java.util.Objects.toString(ad);
        if (ad.getImpressionId().length() != 0) {
            java.lang.String type = ad.getMarkupType();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            if ((kotlin.jvm.internal.Intrinsics.areEqual(type, "html") || kotlin.jvm.internal.Intrinsics.areEqual(type, "inmobiJson") || kotlin.jvm.internal.Intrinsics.areEqual(type, "htmlUrl")) && !kotlin.jvm.internal.Intrinsics.areEqual(ad.getMarkupType(), "unknown")) {
                try {
                    ad.getPubContent().a();
                    return;
                } catch (java.lang.IllegalArgumentException unused) {
                    throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2163))));
                }
            }
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2163))));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", (short) 2230);
        throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(hashMap));
    }
}
