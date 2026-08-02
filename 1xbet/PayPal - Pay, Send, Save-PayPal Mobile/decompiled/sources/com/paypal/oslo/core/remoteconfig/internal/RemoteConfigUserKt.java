package com.paypal.oslo.core.remoteconfig.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/internal/RemoteConfigUser;", "Lcom/statsig/androidsdk/StatsigUser;", "toStatsigUser", "(Lcom/paypal/oslo/core/remoteconfig/internal/RemoteConfigUser;)Lcom/statsig/androidsdk/StatsigUser;", "Lcom/paypal/oslo/core/userstore/model/User;", "", "visitorId", "distributionChannel", "toRemoteConfigUser", "(Lcom/paypal/oslo/core/userstore/model/User;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/remoteconfig/internal/RemoteConfigUser;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RemoteConfigUserKt {
    public static final com.statsig.androidsdk.StatsigUser toStatsigUser(com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser remoteConfigUser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigUser, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String accountType = remoteConfigUser.getAccountType();
        if (accountType != null) {
            linkedHashMap.put("accountType", accountType);
        }
        java.lang.String accountCurrencyCode = remoteConfigUser.getAccountCurrencyCode();
        if (accountCurrencyCode != null) {
            linkedHashMap.put("currency", accountCurrencyCode);
        }
        java.lang.String distributionChannel = remoteConfigUser.getDistributionChannel();
        if (distributionChannel != null) {
            linkedHashMap.put(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAttributes.DISTRIBUTION_CHANNEL, distributionChannel);
        }
        java.util.List<java.lang.String> rpsAttributes = remoteConfigUser.getRpsAttributes();
        if (rpsAttributes != null) {
            java.util.Iterator<T> it = rpsAttributes.iterator();
            while (it.hasNext()) {
                linkedHashMap.put((java.lang.String) it.next(), "true");
            }
        }
        com.statsig.androidsdk.StatsigUser statsigUser = new com.statsig.androidsdk.StatsigUser(remoteConfigUser.getId());
        statsigUser.setCustomIDs(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("visitor_id", remoteConfigUser.getVisitorId())));
        statsigUser.setCountry(remoteConfigUser.getAccountCountryCode());
        statsigUser.setCustom(linkedHashMap);
        return statsigUser;
    }

    public static final com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser toRemoteConfigUser(com.paypal.oslo.core.userstore.model.User user, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser(str, user.getId(), user.getAccountCountryCode(), user.getAccountCurrencyCode(), user.getAccountType(), str2, user.getRpsAttributes());
    }
}
