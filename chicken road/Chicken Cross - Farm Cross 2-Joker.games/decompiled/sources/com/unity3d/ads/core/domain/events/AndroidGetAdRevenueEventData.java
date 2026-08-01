package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.AdRevenueAdFormat;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRevenueDataKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidGetAdRevenueEventData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AndroidGetAdRevenueEventData;", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "<init>", "()V", "invoke", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "data", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidGetAdRevenueEventData implements GetAdRevenueEventData {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r4 = com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventDataKt.toProto(r4);
     */
    @Override // com.unity3d.ads.core.domain.events.GetAdRevenueEventData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdRevenueEventRequestOuterClass.AdRevenueData invoke(AdRevenueData data) {
        AdFormatOuterClass.AdFormat adFormat;
        Intrinsics.checkNotNullParameter(data, "data");
        AdRevenueDataKt.Dsl.Companion companion = AdRevenueDataKt.Dsl.INSTANCE;
        AdRevenueEventRequestOuterClass.AdRevenueData.Builder newBuilder = AdRevenueEventRequestOuterClass.AdRevenueData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AdRevenueDataKt.Dsl _create = companion._create(newBuilder);
        _create.setEventId(ProtobufExtensionsKt.toByteString(data.getEventId()));
        Double revenue = data.getRevenue();
        if (revenue != null) {
            _create.setRevenue(revenue.doubleValue());
        }
        String countryCode = data.getCountryCode();
        if (countryCode != null) {
            _create.setCountryCode(countryCode);
        }
        String networkName = data.getNetworkName();
        if (networkName != null) {
            _create.setNetworkName(networkName);
        }
        String adUnitId = data.getAdUnitId();
        if (adUnitId != null) {
            _create.setAdUnitId(adUnitId);
        }
        String thirdPartyAdPlacementId = data.getThirdPartyAdPlacementId();
        if (thirdPartyAdPlacementId != null) {
            _create.setThirdPartyAdPlacementId(thirdPartyAdPlacementId);
        }
        AdRevenueAdFormat adFormat2 = data.getAdFormat();
        if (adFormat2 == null || adFormat == null) {
            adFormat = AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        _create.setAdFormat(adFormat);
        return _create._build();
    }
}
