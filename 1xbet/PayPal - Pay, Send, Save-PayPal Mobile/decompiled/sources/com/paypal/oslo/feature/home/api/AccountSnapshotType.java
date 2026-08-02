package com.paypal.oslo.feature.home.api;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u000f!\"#$%&'()*+,-./"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "PayPalBalance", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_CRYPTO, "CashbackMastercard", "PayLater", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_REWARDS, com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS, "Disabled", "PyUsd", "AddPaymentMethod", "PayPalMastercard", "CreditCardUS", "PayPalCredit", "EbayMastercard", "PayPalConsumerRewards", "SmartConnect", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$AddPaymentMethod;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$CashbackMastercard;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$CreditCardUS;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Crypto;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Disabled;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$EbayMastercard;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayLater;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayPalBalance;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayPalConsumerRewards;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayPalCredit;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayPalMastercard;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PyUsd;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Rewards;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Savings;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$SmartConnect;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class AccountSnapshotType {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.Companion INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.api.AccountSnapshotType$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.home.api.AccountSnapshotType.$r8$lambda$xcR3T2zYbEOgu5818FsxzSFVAg4();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.home.api.AccountSnapshotType self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.api.AccountSnapshotType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.home.api.AccountSnapshotType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AccountSnapshotType() {
    }

    public /* synthetic */ AccountSnapshotType(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayPalBalance;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class PayPalBalance extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalBalance INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalBalance();

        public final int hashCode() {
            return -1356863020;
        }

        private PayPalBalance() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PayPalBalance";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalBalance)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Crypto;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Crypto extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.Crypto INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.Crypto();

        public final int hashCode() {
            return 1867575766;
        }

        private Crypto() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_CRYPTO;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.Crypto)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$CashbackMastercard;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class CashbackMastercard extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.CashbackMastercard INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.CashbackMastercard();

        public final int hashCode() {
            return -2076360639;
        }

        private CashbackMastercard() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CashbackMastercard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.CashbackMastercard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayLater;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class PayLater extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater();

        public final int hashCode() {
            return -1610786151;
        }

        private PayLater() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PayLater";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayLater)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Rewards;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Rewards extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.Rewards INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.Rewards();

        public final int hashCode() {
            return 2113452207;
        }

        private Rewards() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_REWARDS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.Rewards)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Savings;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Savings extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.Savings INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.Savings();

        public final int hashCode() {
            return -1409216956;
        }

        private Savings() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.Savings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$Disabled;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Disabled extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.Disabled INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.Disabled();

        public final int hashCode() {
            return 1603029585;
        }

        private Disabled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Disabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.Disabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PyUsd;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class PyUsd extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.PyUsd INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.PyUsd();

        public final int hashCode() {
            return 1180802824;
        }

        private PyUsd() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PyUsd";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PyUsd)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$AddPaymentMethod;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class AddPaymentMethod extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.AddPaymentMethod INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.AddPaymentMethod();

        public final int hashCode() {
            return 793952827;
        }

        private AddPaymentMethod() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AddPaymentMethod";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.AddPaymentMethod)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayPalMastercard;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class PayPalMastercard extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalMastercard INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalMastercard();

        public final int hashCode() {
            return -1481988486;
        }

        private PayPalMastercard() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PayPalMastercard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalMastercard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$CreditCardUS;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CreditCardUS extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.CreditCardUS INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.CreditCardUS();

        public final int hashCode() {
            return -1437673636;
        }

        private CreditCardUS() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CreditCardUS";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.CreditCardUS)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayPalCredit;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class PayPalCredit extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalCredit INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalCredit();

        public final int hashCode() {
            return -969477887;
        }

        private PayPalCredit() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PayPalCredit";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalCredit)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$EbayMastercard;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class EbayMastercard extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.EbayMastercard INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.EbayMastercard();

        public final int hashCode() {
            return -565392388;
        }

        private EbayMastercard() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EbayMastercard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.EbayMastercard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$PayPalConsumerRewards;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class PayPalConsumerRewards extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalConsumerRewards INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalConsumerRewards();

        public final int hashCode() {
            return -779391674;
        }

        private PayPalConsumerRewards() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PayPalConsumerRewards";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalConsumerRewards)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotType$SmartConnect;", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class SmartConnect extends com.paypal.oslo.feature.home.api.AccountSnapshotType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.api.AccountSnapshotType.SmartConnect INSTANCE = new com.paypal.oslo.feature.home.api.AccountSnapshotType.SmartConnect();

        public final int hashCode() {
            return 703607862;
        }

        private SmartConnect() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SmartConnect";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.api.AccountSnapshotType.SmartConnect)) {
                return false;
            }
            return true;
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$xcR3T2zYbEOgu5818FsxzSFVAg4() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.home.api.AccountSnapshotType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.home.api.AccountSnapshotType.class), new kotlin.reflect.KClass[0], new kotlinx.serialization.KSerializer[0], new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ AccountSnapshotType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
