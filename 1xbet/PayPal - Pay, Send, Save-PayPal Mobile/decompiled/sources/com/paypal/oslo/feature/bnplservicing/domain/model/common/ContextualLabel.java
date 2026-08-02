package com.paypal.oslo.feature.bnplservicing.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/ContextualLabel;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ALMOST_COMPLETE", "DELINQUENT", "HARDSHIP", "PAST_DUE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "PENDING_FRAUD", "SNOOZE_PENDING", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContextualLabel {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel ALMOST_COMPLETE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel DELINQUENT;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel HARDSHIP;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel PAST_DUE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel PENDING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel PENDING_FRAUD;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel SNOOZE_PENDING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel[] getHighSpeedVideoSizes;
    private final java.lang.String rawValue;

    private ContextualLabel(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel("ALMOST_COMPLETE", 0, "ALMOST_COMPLETE");
        ALMOST_COMPLETE = contextualLabel;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel("DELINQUENT", 1, "DELINQUENT");
        DELINQUENT = contextualLabel2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel("HARDSHIP", 2, "HARDSHIP");
        HARDSHIP = contextualLabel3;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel("PAST_DUE", 3, "PAST_DUE");
        PAST_DUE = contextualLabel4;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel5 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 4, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = contextualLabel5;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel6 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel("PENDING_FRAUD", 5, "PENDING_FRAUD");
        PENDING_FRAUD = contextualLabel6;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel7 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel("SNOOZE_PENDING", 6, "SNOOZE_PENDING");
        SNOOZE_PENDING = contextualLabel7;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel8 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel("UNKNOWN", 7, "UNKNOWN__");
        UNKNOWN = contextualLabel8;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel[] contextualLabelArr = {contextualLabel, contextualLabel2, contextualLabel3, contextualLabel4, contextualLabel5, contextualLabel6, contextualLabel7, contextualLabel8};
        getHighSpeedVideoSizes = contextualLabelArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(contextualLabelArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/ContextualLabel$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/ContextualLabel;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/ContextualLabel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel from(java.lang.String value) {
            java.lang.Object obj;
            if (value != null) {
                java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel) obj).name(), value)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel contextualLabel = (com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel) obj;
                if (contextualLabel != null) {
                    return contextualLabel;
                }
            }
            return com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
