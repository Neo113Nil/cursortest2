package com.paypal.oslo.core.telemetry.analytics.schema.context.operational;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/operational/TransitionTypeCategory;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "logValue", "Ljava/lang/String;", "getLogValue", "()Ljava/lang/String;", "LOGIN_SUCCESS", "LOGIN_INITIATED", "APP_SWITCH_CHECKOUT_START", "APP_SWITCH_CHECKOUT_REDIRECT_START", "APP_SWITCH_CHECKOUT_FOCUS_EXIT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransitionTypeCategory {
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory APP_SWITCH_CHECKOUT_FOCUS_EXIT;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory APP_SWITCH_CHECKOUT_REDIRECT_START;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory APP_SWITCH_CHECKOUT_START;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory LOGIN_INITIATED;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory LOGIN_SUCCESS;
    private static final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String logValue;

    private TransitionTypeCategory(java.lang.String str, int i, java.lang.String str2) {
        this.logValue = str2;
    }

    public final java.lang.String getLogValue() {
        return this.logValue;
    }

    static {
        com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory transitionTypeCategory = new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory("LOGIN_SUCCESS", 0, "login_success");
        LOGIN_SUCCESS = transitionTypeCategory;
        com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory transitionTypeCategory2 = new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory("LOGIN_INITIATED", 1, "login_initiated");
        LOGIN_INITIATED = transitionTypeCategory2;
        com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory transitionTypeCategory3 = new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory("APP_SWITCH_CHECKOUT_START", 2, "app_switch_checkout_start");
        APP_SWITCH_CHECKOUT_START = transitionTypeCategory3;
        com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory transitionTypeCategory4 = new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory("APP_SWITCH_CHECKOUT_REDIRECT_START", 3, "app_switch_checkout_redirect_start");
        APP_SWITCH_CHECKOUT_REDIRECT_START = transitionTypeCategory4;
        com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory transitionTypeCategory5 = new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory("APP_SWITCH_CHECKOUT_FOCUS_EXIT", 4, "app_switch_checkout_focus_exit");
        APP_SWITCH_CHECKOUT_FOCUS_EXIT = transitionTypeCategory5;
        com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory[] transitionTypeCategoryArr = {transitionTypeCategory, transitionTypeCategory2, transitionTypeCategory3, transitionTypeCategory4, transitionTypeCategory5};
        getHighResolutionOutputSizeshNQ4ISI = transitionTypeCategoryArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(transitionTypeCategoryArr);
    }

    public static com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory[] values() {
        return (com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory) java.lang.Enum.valueOf(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
