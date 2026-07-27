package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class X0 {
    public static void a(AdResponse adResponse, Z9 z9, Function1 onFetchEvent) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(onFetchEvent, "onFetchEvent");
        String str = "validateAdResponse: " + adResponse;
        AdSet adSet = (AdSet) CollectionsKt.getOrNull(adResponse.getAdSets(), 0);
        if (StringsKt.trim((CharSequence) adResponse.getRequestId()).toString().length() == 0) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2208))));
        }
        if (adResponse.getAdSets().isEmpty()) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C4248yk((short) 54));
        }
        if (adSet == null) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4248yk((short) 2364));
        }
        if (adSet.getAds().isEmpty()) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C4248yk((short) 54));
        }
        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.getOrNull(adSet.getAds(), 0);
        String creativeType = (ad == null || (metaInfo = ad.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("isRewarded", Boolean.valueOf(adSet.getIsRewarded())));
        if (creativeType != null) {
            mutableMapOf.put("creativeType", creativeType);
        }
        onFetchEvent.invoke(new C4221xk(mutableMapOf));
        a(adSet.getAdSetId(), adSet.getIsRewarded());
        a(adSet, z9);
    }

    public static void a(String str, boolean z) {
        String str2 = "validateAdSetId: " + str;
        if (str.length() == 0) {
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2231), TuplesKt.to("isRewarded", Boolean.valueOf(z)))));
        }
    }

    public static void a(AdSet adSet, Z9 z9) {
        String str = "validateAdObjects: " + adSet;
        int i = 0;
        if (adSet.getAds().peekFirst() != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : adSet.getAds()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                if (i == 0) {
                    a(ad);
                } else {
                    try {
                        a(ad);
                        Unit unit = Unit.INSTANCE;
                    } catch (Z e) {
                        if (z9 != null) {
                            z9.b("AdResponseValidator", "validateAdObjects Exception: (Index: " + i + ") - " + e);
                        }
                        linkedHashSet.add(ad);
                    }
                }
                i = i2;
            }
            adSet.getAds().removeAll(linkedHashSet);
            return;
        }
        throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2116), TuplesKt.to("isRewarded", Boolean.valueOf(adSet.getIsRewarded())))));
    }

    public static void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        String str = "validateAdObject: " + ad;
        if (ad.getImpressionId().length() != 0) {
            String type = ad.getMarkupType();
            Intrinsics.checkNotNullParameter(type, "type");
            if ((Intrinsics.areEqual(type, "html") || Intrinsics.areEqual(type, "inmobiJson") || Intrinsics.areEqual(type, "htmlUrl")) && !Intrinsics.areEqual(ad.getMarkupType(), "unknown")) {
                try {
                    ad.getPubContent().a();
                    return;
                } catch (IllegalArgumentException unused) {
                    throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
                }
            }
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2230);
        throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(hashMap));
    }
}
