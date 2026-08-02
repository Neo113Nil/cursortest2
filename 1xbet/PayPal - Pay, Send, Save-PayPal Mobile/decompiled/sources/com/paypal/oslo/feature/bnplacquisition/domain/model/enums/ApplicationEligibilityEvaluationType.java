package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ApplicationEligibilityEvaluationType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ACCOUNT_TAKEOVER_ASSESSMENT", "PRODUCT_OFFERS_EVALUATION", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApplicationEligibilityEvaluationType {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType ACCOUNT_TAKEOVER_ASSESSMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType PRODUCT_OFFERS_EVALUATION;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private ApplicationEligibilityEvaluationType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType applicationEligibilityEvaluationType = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType("ACCOUNT_TAKEOVER_ASSESSMENT", 0, "ACCOUNT_TAKEOVER_ASSESSMENT");
        ACCOUNT_TAKEOVER_ASSESSMENT = applicationEligibilityEvaluationType;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType applicationEligibilityEvaluationType2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType("PRODUCT_OFFERS_EVALUATION", 1, "PRODUCT_OFFERS_EVALUATION");
        PRODUCT_OFFERS_EVALUATION = applicationEligibilityEvaluationType2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType applicationEligibilityEvaluationType3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType("UNKNOWN", 2, "UNKNOWN");
        UNKNOWN = applicationEligibilityEvaluationType3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType[] applicationEligibilityEvaluationTypeArr = {applicationEligibilityEvaluationType, applicationEligibilityEvaluationType2, applicationEligibilityEvaluationType3};
        getHighResolutionOutputSizeshNQ4ISI = applicationEligibilityEvaluationTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(applicationEligibilityEvaluationTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ApplicationEligibilityEvaluationType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ApplicationEligibilityEvaluationType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ApplicationEligibilityEvaluationType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType) obj).getValue(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType applicationEligibilityEvaluationType = (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType) obj;
            return applicationEligibilityEvaluationType == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType.UNKNOWN : applicationEligibilityEvaluationType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
