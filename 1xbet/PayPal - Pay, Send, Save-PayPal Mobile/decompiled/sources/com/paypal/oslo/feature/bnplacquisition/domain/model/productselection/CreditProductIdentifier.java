package com.paypal.oslo.feature.bnplacquisition.domain.model.productselection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion", "PAY_LATER_US", "PAY_LATER_LONG_TERM_US", "PAY_LATER_DE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreditProductIdentifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier PAY_LATER_DE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier PAY_LATER_LONG_TERM_US;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier PAY_LATER_US;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final int value;

    private CreditProductIdentifier(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier = new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier("PAY_LATER_US", 0, 1);
        PAY_LATER_US = creditProductIdentifier;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier("PAY_LATER_LONG_TERM_US", 1, 2);
        PAY_LATER_LONG_TERM_US = creditProductIdentifier2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier("PAY_LATER_DE", 2, 3);
        PAY_LATER_DE = creditProductIdentifier3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier4 = new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier("UNKNOWN", 3, 0);
        UNKNOWN = creditProductIdentifier4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier[] creditProductIdentifierArr = {creditProductIdentifier, creditProductIdentifier2, creditProductIdentifier3, creditProductIdentifier4};
        getHighSpeedVideoFpsRanges = creditProductIdentifierArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(creditProductIdentifierArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier = (com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier) obj;
            return creditProductIdentifier == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.UNKNOWN : creditProductIdentifier;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
