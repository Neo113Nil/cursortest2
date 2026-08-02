package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "UNKNOWN", "BANK", "CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddFundingInstrumentType {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType[] getHighSpeedVideoSizes;

    private AddFundingInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType("UNKNOWN", 0);
        UNKNOWN = addFundingInstrumentType;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType("BANK", 1);
        BANK = addFundingInstrumentType2;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType("CARD", 2);
        CARD = addFundingInstrumentType3;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType[] addFundingInstrumentTypeArr = {addFundingInstrumentType, addFundingInstrumentType2, addFundingInstrumentType3};
        getHighSpeedVideoSizes = addFundingInstrumentTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(addFundingInstrumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType) obj).name(), value, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType) obj;
            return addFundingInstrumentType == null ? com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.UNKNOWN : addFundingInstrumentType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
