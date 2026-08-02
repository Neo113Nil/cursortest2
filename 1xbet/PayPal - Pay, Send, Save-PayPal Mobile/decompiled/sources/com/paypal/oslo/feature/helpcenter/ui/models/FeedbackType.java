package com.paypal.oslo.feature.helpcenter.ui.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/FeedbackType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "HELPFUL", "NOT_HELPFUL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeedbackType {
    public static final com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType HELPFUL;
    public static final com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType NONE;
    public static final com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType NOT_HELPFUL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType[] getHighSpeedVideoSizes;

    private FeedbackType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType feedbackType = new com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType("NONE", 0);
        NONE = feedbackType;
        com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType feedbackType2 = new com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType("HELPFUL", 1);
        HELPFUL = feedbackType2;
        com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType feedbackType3 = new com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType("NOT_HELPFUL", 2);
        NOT_HELPFUL = feedbackType3;
        com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType[] feedbackTypeArr = {feedbackType, feedbackType2, feedbackType3};
        getHighSpeedVideoSizes = feedbackTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(feedbackTypeArr);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType[] values() {
        return (com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType) java.lang.Enum.valueOf(com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.helpcenter.ui.models.FeedbackType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
