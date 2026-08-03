package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class AdvIdWithLimitedAppender implements io.appmetrica.analytics.networktasks.internal.IParamsAppender<io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder> {
    private static void a(android.net.Uri.Builder builder, java.lang.String str, java.lang.String str2, io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo) {
        if (adTrackingInfo == null) {
            builder.appendQueryParameter(str, "");
            builder.appendQueryParameter(str2, "");
        } else {
            builder.appendQueryParameter(str, io.appmetrica.analytics.coreutils.internal.StringUtils.emptyIfNull(adTrackingInfo.advId));
            java.lang.Boolean bool = adTrackingInfo.limitedAdTracking;
            builder.appendQueryParameter(str2, bool != null ? bool.booleanValue() ? "1" : io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER : "");
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    public void appendParams(android.net.Uri.Builder builder, io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder advertisingIdsHolder) {
        a(builder, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.ADV_ID, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.LIMIT_AD_TRACKING, advertisingIdsHolder == null ? null : advertisingIdsHolder.getGoogle().mAdTrackingInfo);
        a(builder, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.HUAWEI_OAID, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.HUAWEI_OAID_LIMIT_TRACKING, advertisingIdsHolder == null ? null : advertisingIdsHolder.getHuawei().mAdTrackingInfo);
        a(builder, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.YANDEX_ADV_ID, io.appmetrica.analytics.networktasks.internal.CommonUrlParts.YANDEX_ADV_ID_LIMIT_TRACKING, advertisingIdsHolder != null ? advertisingIdsHolder.getYandex().mAdTrackingInfo : null);
    }
}
