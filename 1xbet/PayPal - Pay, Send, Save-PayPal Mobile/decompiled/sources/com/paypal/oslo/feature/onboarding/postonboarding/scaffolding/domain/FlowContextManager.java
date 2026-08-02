package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager;", "", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager$ContextKey;", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager$ContextKey;Ljava/lang/String;)V", "get", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager$ContextKey;)Ljava/lang/String;", "ContextKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FlowContextManager {
    java.lang.String get(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey key);

    void set(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey key, java.lang.String value);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager$ContextKey;", "", "", "p0", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "SELECTED_INTENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ContextKey {
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey SELECTED_INTENT;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey[] getHighSpeedVideoFpsRangesFor;
        private final java.lang.String key;

        private ContextKey(java.lang.String str, java.lang.String str2) {
            this.key = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        static {
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey contextKey = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey("SELECTED_INTENT", "selected_intent");
            SELECTED_INTENT = contextKey;
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey[] contextKeyArr = {contextKey};
            getHighSpeedVideoFpsRangesFor = contextKeyArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(contextKeyArr);
        }

        public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey[] values() {
            return (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
