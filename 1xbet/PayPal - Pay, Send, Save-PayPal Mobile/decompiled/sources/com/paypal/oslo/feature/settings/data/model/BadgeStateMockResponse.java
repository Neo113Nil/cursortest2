package com.paypal.oslo.feature.settings.data.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/settings/data/model/BadgeStateMockResponse;", "", "<init>", "(Ljava/lang/String;I)V", "Positive", "Negative"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BadgeStateMockResponse {
    public static final com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse Negative;
    public static final com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse Positive;
    private static final /* synthetic */ com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private BadgeStateMockResponse(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse badgeStateMockResponse = new com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse("Positive", 0);
        Positive = badgeStateMockResponse;
        com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse badgeStateMockResponse2 = new com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse("Negative", 1);
        Negative = badgeStateMockResponse2;
        com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse[] badgeStateMockResponseArr = {badgeStateMockResponse, badgeStateMockResponse2};
        getHighSpeedVideoFpsRanges = badgeStateMockResponseArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(badgeStateMockResponseArr);
    }

    public static com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse[] values() {
        return (com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
