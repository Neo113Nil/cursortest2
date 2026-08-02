package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ConsentType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "CREDIT_SCORE_DISCLOSURE", "CREDIT_SOFT_INQUIRY", "ESIGN", "LOAN_AGREEMENT", "PAYMENT_AUTHORIZATION", "PRIVACY_NOTICE", "STATE_DISCLOSURE", "CARD_AGREEMENT", "CREDIT_CHECK", "INSTALLMENT_AGREEMENT", "INSTALLMENT_AGREEMENT_AND_CARD_AGREEMENT", "STATE_DISCLOSURES", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConsentType {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType CARD_AGREEMENT;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType CREDIT_CHECK;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType CREDIT_SCORE_DISCLOSURE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType CREDIT_SOFT_INQUIRY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType ESIGN;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType INSTALLMENT_AGREEMENT;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType INSTALLMENT_AGREEMENT_AND_CARD_AGREEMENT;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType LOAN_AGREEMENT;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType PAYMENT_AUTHORIZATION;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType PRIVACY_NOTICE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType STATE_DISCLOSURE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType STATE_DISCLOSURES;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private ConsentType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("CREDIT_SCORE_DISCLOSURE", 0, "CREDIT_SCORE_DISCLOSURE");
        CREDIT_SCORE_DISCLOSURE = consentType;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("CREDIT_SOFT_INQUIRY", 1, "CREDIT_SOFT_INQUIRY");
        CREDIT_SOFT_INQUIRY = consentType2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("ESIGN", 2, "ESIGN");
        ESIGN = consentType3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType4 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("LOAN_AGREEMENT", 3, "LOAN_AGREEMENT");
        LOAN_AGREEMENT = consentType4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType5 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("PAYMENT_AUTHORIZATION", 4, "PAYMENT_AUTHORIZATION");
        PAYMENT_AUTHORIZATION = consentType5;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType6 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("PRIVACY_NOTICE", 5, "PRIVACY_NOTICE");
        PRIVACY_NOTICE = consentType6;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType7 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("STATE_DISCLOSURE", 6, "STATE_DISCLOSURE");
        STATE_DISCLOSURE = consentType7;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType8 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("CARD_AGREEMENT", 7, "CARD_AGREEMENT");
        CARD_AGREEMENT = consentType8;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType9 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("CREDIT_CHECK", 8, "CREDIT_CHECK");
        CREDIT_CHECK = consentType9;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType10 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("INSTALLMENT_AGREEMENT", 9, "INSTALLMENT_AGREEMENT");
        INSTALLMENT_AGREEMENT = consentType10;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType11 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("INSTALLMENT_AGREEMENT_AND_CARD_AGREEMENT", 10, "INSTALLMENT_AGREEMENT_AND_CARD_AGREEMENT");
        INSTALLMENT_AGREEMENT_AND_CARD_AGREEMENT = consentType11;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType12 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("STATE_DISCLOSURES", 11, "STATE_DISCLOSURES");
        STATE_DISCLOSURES = consentType12;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType13 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType("UNKNOWN", 12, "UNKNOWN");
        UNKNOWN = consentType13;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType[] consentTypeArr = {consentType, consentType2, consentType3, consentType4, consentType5, consentType6, consentType7, consentType8, consentType9, consentType10, consentType11, consentType12, consentType13};
        getHighResolutionOutputSizeshNQ4ISI = consentTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(consentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ConsentType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ConsentType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/ConsentType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType) obj).getValue(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType consentType = (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType) obj;
            return consentType == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType.UNKNOWN : consentType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
