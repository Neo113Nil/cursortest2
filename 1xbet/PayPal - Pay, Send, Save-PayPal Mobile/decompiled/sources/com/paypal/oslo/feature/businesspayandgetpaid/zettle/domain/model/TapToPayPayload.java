package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002ABB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ~\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ'\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b9\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b:\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b;\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b<\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b=\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b>\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b?\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b@\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "", "", "amount", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, "", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, "cardIssuingBank", "maskedPan", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_APPLICATION_NAME, "applicationIdentifier", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_REFERENCE_NUMBER, "transactionId", "referenceId", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "J", "getAmount", "getGratuityAmount", "Ljava/lang/String;", "getCardType", "getCardPaymentEntryMode", "getCardIssuingBank", "getMaskedPan", "getApplicationName", "getApplicationIdentifier", "getReferenceNumber", "getTransactionId", "getReferenceId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class TapToPayPayload {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload.Companion(null);
    private final long amount;
    private final java.lang.String applicationIdentifier;
    private final java.lang.String applicationName;
    private final java.lang.String cardIssuingBank;
    private final java.lang.String cardPaymentEntryMode;
    private final java.lang.String cardType;
    private final long gratuityAmount;
    private final java.lang.String maskedPan;
    private final java.lang.String referenceId;
    private final java.lang.String referenceNumber;
    private final java.lang.String transactionId;

    public /* synthetic */ TapToPayPayload(int i, long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2047, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = j;
        this.gratuityAmount = j2;
        this.cardType = str;
        this.cardPaymentEntryMode = str2;
        this.cardIssuingBank = str3;
        this.maskedPan = str4;
        this.applicationName = str5;
        this.applicationIdentifier = str6;
        this.referenceNumber = str7;
        this.transactionId = str8;
        this.referenceId = str9;
    }

    public TapToPayPayload(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
        this.amount = j;
        this.gratuityAmount = j2;
        this.cardType = str;
        this.cardPaymentEntryMode = str2;
        this.cardIssuingBank = str3;
        this.maskedPan = str4;
        this.applicationName = str5;
        this.applicationIdentifier = str6;
        this.referenceNumber = str7;
        this.transactionId = str8;
        this.referenceId = str9;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.amount);
        output.encodeLongElement(serialDesc, 1, self.gratuityAmount);
        output.encodeStringElement(serialDesc, 2, self.cardType);
        output.encodeStringElement(serialDesc, 3, self.cardPaymentEntryMode);
        output.encodeStringElement(serialDesc, 4, self.cardIssuingBank);
        output.encodeStringElement(serialDesc, 5, self.maskedPan);
        output.encodeStringElement(serialDesc, 6, self.applicationName);
        output.encodeStringElement(serialDesc, 7, self.applicationIdentifier);
        output.encodeStringElement(serialDesc, 8, self.referenceNumber);
        output.encodeStringElement(serialDesc, 9, self.transactionId);
        output.encodeStringElement(serialDesc, 10, self.referenceId);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final long getGratuityAmount() {
        return this.gratuityAmount;
    }

    public final java.lang.String getCardType() {
        return this.cardType;
    }

    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    public final java.lang.String getCardIssuingBank() {
        return this.cardIssuingBank;
    }

    public final java.lang.String getMaskedPan() {
        return this.maskedPan;
    }

    public final java.lang.String getApplicationName() {
        return this.applicationName;
    }

    public final java.lang.String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    public final java.lang.String getReferenceNumber() {
        return this.referenceNumber;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;", "cardPayment", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "fromResultPayload", "(Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload$$serializer.INSTANCE;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload fromResultPayload(com.zettle.sdk.feature.taptopay.ui.models.ResultPayload cardPayment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPayment, "");
            long amount = cardPayment.getAmount();
            java.lang.Long gratuityAmount = cardPayment.getGratuityAmount();
            long longValue = gratuityAmount != null ? gratuityAmount.longValue() : 0L;
            java.lang.String cardType = cardPayment.getCardType();
            if (cardType == null) {
                cardType = "";
            }
            java.lang.String cardPaymentEntryMode = cardPayment.getCardPaymentEntryMode();
            if (cardPaymentEntryMode == null) {
                cardPaymentEntryMode = "";
            }
            java.lang.String cardIssuingBank = cardPayment.getCardIssuingBank();
            if (cardIssuingBank == null) {
                cardIssuingBank = "";
            }
            java.lang.String maskedPan = cardPayment.getMaskedPan();
            if (maskedPan == null) {
                maskedPan = "";
            }
            java.lang.String applicationName = cardPayment.getApplicationName();
            if (applicationName == null) {
                applicationName = "";
            }
            java.lang.String applicationIdentifier = cardPayment.getApplicationIdentifier();
            if (applicationIdentifier == null) {
                applicationIdentifier = "";
            }
            java.lang.String referenceNumber = cardPayment.getReferenceNumber();
            if (referenceNumber == null) {
                referenceNumber = "";
            }
            java.lang.String transactionId = cardPayment.getTransactionId();
            if (transactionId == null) {
                transactionId = "";
            }
            java.lang.String referenceId = cardPayment.getReferenceId();
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload(amount, longValue, cardType, cardPaymentEntryMode, cardIssuingBank, maskedPan, applicationName, applicationIdentifier, referenceNumber, transactionId, referenceId == null ? "" : referenceId);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        long j = this.amount;
        long j2 = this.gratuityAmount;
        java.lang.String str = this.cardType;
        java.lang.String str2 = this.cardPaymentEntryMode;
        java.lang.String str3 = this.cardIssuingBank;
        java.lang.String str4 = this.maskedPan;
        java.lang.String str5 = this.applicationName;
        java.lang.String str6 = this.applicationIdentifier;
        java.lang.String str7 = this.referenceNumber;
        java.lang.String str8 = this.transactionId;
        java.lang.String str9 = this.referenceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TapToPayPayload(amount=");
        sb.append(j);
        sb.append(", gratuityAmount=");
        sb.append(j2);
        sb.append(", cardType=");
        sb.append(str);
        sb.append(", cardPaymentEntryMode=");
        sb.append(str2);
        sb.append(", cardIssuingBank=");
        sb.append(str3);
        sb.append(", maskedPan=");
        sb.append(str4);
        sb.append(", applicationName=");
        sb.append(str5);
        sb.append(", applicationIdentifier=");
        sb.append(str6);
        sb.append(", referenceNumber=");
        sb.append(str7);
        sb.append(", transactionId=");
        sb.append(str8);
        sb.append(", referenceId=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((java.lang.Long.hashCode(this.amount) * 31) + java.lang.Long.hashCode(this.gratuityAmount)) * 31) + this.cardType.hashCode()) * 31) + this.cardPaymentEntryMode.hashCode()) * 31) + this.cardIssuingBank.hashCode()) * 31) + this.maskedPan.hashCode()) * 31) + this.applicationName.hashCode()) * 31) + this.applicationIdentifier.hashCode()) * 31) + this.referenceNumber.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.referenceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload = (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload) other;
        return this.amount == tapToPayPayload.amount && this.gratuityAmount == tapToPayPayload.gratuityAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.cardType, tapToPayPayload.cardType) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardPaymentEntryMode, tapToPayPayload.cardPaymentEntryMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardIssuingBank, tapToPayPayload.cardIssuingBank) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPan, tapToPayPayload.maskedPan) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationName, tapToPayPayload.applicationName) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationIdentifier, tapToPayPayload.applicationIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceNumber, tapToPayPayload.referenceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, tapToPayPayload.transactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, tapToPayPayload.referenceId);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload copy(long amount, long gratuityAmount, java.lang.String cardType, java.lang.String cardPaymentEntryMode, java.lang.String cardIssuingBank, java.lang.String maskedPan, java.lang.String applicationName, java.lang.String applicationIdentifier, java.lang.String referenceNumber, java.lang.String transactionId, java.lang.String referenceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentEntryMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardIssuingBank, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPan, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload(amount, gratuityAmount, cardType, cardPaymentEntryMode, cardIssuingBank, maskedPan, applicationName, applicationIdentifier, referenceNumber, transactionId, referenceId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getReferenceNumber() {
        return this.referenceNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMaskedPan() {
        return this.maskedPan;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCardIssuingBank() {
        return this.cardIssuingBank;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardType() {
        return this.cardType;
    }

    /* renamed from: component2, reason: from getter */
    public final long getGratuityAmount() {
        return this.gratuityAmount;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }
}
