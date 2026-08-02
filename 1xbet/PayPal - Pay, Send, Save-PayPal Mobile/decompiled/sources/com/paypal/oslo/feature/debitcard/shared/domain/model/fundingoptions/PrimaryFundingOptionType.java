package com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes12.dex */
public final class PrimaryFundingOptionType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType BALANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType UNKNOWN;
    private final java.lang.String value;

    private PrimaryFundingOptionType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOptionType = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);
        BALANCE = primaryFundingOptionType;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOptionType2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType("UNKNOWN", 1, "UNKNOWN");
        UNKNOWN = primaryFundingOptionType2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType[] primaryFundingOptionTypeArr = {primaryFundingOptionType, primaryFundingOptionType2};
        $VALUES = primaryFundingOptionTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(primaryFundingOptionTypeArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType", com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType fromValue(java.lang.String value) {
            java.lang.Object obj = null;
            if (value == null) {
                return null;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType) next).getValue(), value)) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOptionType = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType) obj;
            return primaryFundingOptionType == null ? com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.UNKNOWN : primaryFundingOptionType;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType> getEntries() {
        return $ENTRIES;
    }
}
