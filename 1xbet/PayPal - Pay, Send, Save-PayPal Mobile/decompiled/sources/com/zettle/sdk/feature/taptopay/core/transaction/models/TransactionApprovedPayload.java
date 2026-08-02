package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b1\u0018\u00002\u00020\u0001Bã\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b.\u0010-R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b/\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b0\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b1\u0010-R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b2\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b3\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b4\u0010-R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b5\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b6\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b7\u0010-R\u001c\u0010%\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u001d\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b;\u0010*R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b<\u0010-R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b=\u0010-R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b>\u0010-R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u001f\u001a\u00020\u001e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\bH\u0010-R\u001a\u0010\u0004\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\bI\u0010-R\u001a\u0010\t\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\n\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bM\u0010LR\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bN\u0010LR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\bO\u0010-R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\bP\u0010-R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\bQ\u0010-R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\bR\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\bS\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\bT\u0010-"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionApprovedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;", "", "state", "result", "", "amount", "", "signatureRequired", "signatureOptional", "signaturePermissive", "cardHolderName", "cardLastDigits", "applicationIdentifier", "cardHash", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_REFERENCE_NUMBER, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "tsi", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, "cardholderVerificationMethod", "tvr", "cardIssuingBank", "maskedPan", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_APPLICATION_NAME, "authorizationCode", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_PAYMENT_UUID, "suggestionEmail", "suggestionPhone", "suggestionPhoneCountryCode", "installmentAmount", "", "nrOfInstallments", "mxFiid", "mxCardType", "mxPaymentMethodCode", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, "<init>", "(Ljava/lang/String;Ljava/lang/String;JZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;Ljava/lang/Long;)V", "J", "getAmount$core_publicRelease", "()J", "Ljava/lang/String;", "getApplicationIdentifier$core_publicRelease", "()Ljava/lang/String;", "getApplicationName$core_publicRelease", "getAuthorizationCode$core_publicRelease", "getCardHash$core_publicRelease", "getCardHolderName$core_publicRelease", "getCardIssuingBank$core_publicRelease", "getCardLastDigits$core_publicRelease", "getCardPaymentEntryMode$core_publicRelease", "getCardPaymentUUID$core_publicRelease", "getCardType$core_publicRelease", "getCardholderVerificationMethod$core_publicRelease", "Ljava/lang/Long;", "getGratuityAmount$core_publicRelease", "()Ljava/lang/Long;", "getInstallmentAmount$core_publicRelease", "getMaskedPan$core_publicRelease", "getMxCardType$core_publicRelease", "getMxFiid$core_publicRelease", "Ljava/lang/Integer;", "getMxPaymentMethodCode$core_publicRelease", "()Ljava/lang/Integer;", com.visa.cbp.getEncExpo.warmup, "getNrOfInstallments$core_publicRelease", "()I", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "getReference$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "getReferenceNumber$core_publicRelease", "getResult$core_publicRelease", "Z", "getSignatureOptional$core_publicRelease", "()Z", "getSignaturePermissive$core_publicRelease", "getSignatureRequired$core_publicRelease", "getState$core_publicRelease", "getSuggestionEmail$core_publicRelease", "getSuggestionPhone$core_publicRelease", "getSuggestionPhoneCountryCode$core_publicRelease", "getTsi$core_publicRelease", "getTvr$core_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionApprovedPayload extends com.zettle.sdk.feature.taptopay.core.transaction.models.Payload {
    private final long amount;
    private final java.lang.String applicationIdentifier;
    private final java.lang.String applicationName;
    private final java.lang.String authorizationCode;
    private final java.lang.String cardHash;
    private final java.lang.String cardHolderName;
    private final java.lang.String cardIssuingBank;
    private final java.lang.String cardLastDigits;
    private final java.lang.String cardPaymentEntryMode;
    private final java.lang.String cardPaymentUUID;
    private final java.lang.String cardType;
    private final java.lang.String cardholderVerificationMethod;
    private final java.lang.Long gratuityAmount;
    private final long installmentAmount;
    private final java.lang.String maskedPan;
    private final java.lang.String mxCardType;
    private final java.lang.String mxFiid;
    private final java.lang.Integer mxPaymentMethodCode;
    private final int nrOfInstallments;
    private final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference;
    private final java.lang.String referenceNumber;
    private final java.lang.String result;
    private final boolean signatureOptional;
    private final boolean signaturePermissive;
    private final boolean signatureRequired;
    private final java.lang.String state;
    private final java.lang.String suggestionEmail;
    private final java.lang.String suggestionPhone;
    private final java.lang.String suggestionPhoneCountryCode;
    private final java.lang.String tsi;
    private final java.lang.String tvr;

    public /* synthetic */ TransactionApprovedPayload(java.lang.String str, java.lang.String str2, long j, boolean z, boolean z2, boolean z3, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, long j2, int i, java.lang.String str21, java.lang.String str22, java.lang.Integer num, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapToPayReference, java.lang.Long l, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : str8, (i2 & 4096) != 0 ? null : str9, (i2 & 8192) != 0 ? null : str10, (i2 & 16384) != 0 ? null : str11, (32768 & i2) != 0 ? null : str12, (65536 & i2) != 0 ? null : str13, (131072 & i2) != 0 ? null : str14, (262144 & i2) != 0 ? null : str15, (524288 & i2) != 0 ? null : str16, (1048576 & i2) != 0 ? null : str17, (2097152 & i2) != 0 ? null : str18, (4194304 & i2) != 0 ? null : str19, (8388608 & i2) != 0 ? null : str20, (16777216 & i2) != 0 ? 0L : j2, (33554432 & i2) != 0 ? 0 : i, (67108864 & i2) != 0 ? null : str21, (134217728 & i2) != 0 ? null : str22, (268435456 & i2) != 0 ? null : num, (536870912 & i2) != 0 ? null : tapToPayReference, (i2 & 1073741824) != 0 ? null : l);
    }

    /* renamed from: getState$core_publicRelease, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    /* renamed from: getResult$core_publicRelease, reason: from getter */
    public final java.lang.String getResult() {
        return this.result;
    }

    /* renamed from: getAmount$core_publicRelease, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* renamed from: getSignatureRequired$core_publicRelease, reason: from getter */
    public final boolean getSignatureRequired() {
        return this.signatureRequired;
    }

    /* renamed from: getSignatureOptional$core_publicRelease, reason: from getter */
    public final boolean getSignatureOptional() {
        return this.signatureOptional;
    }

    /* renamed from: getSignaturePermissive$core_publicRelease, reason: from getter */
    public final boolean getSignaturePermissive() {
        return this.signaturePermissive;
    }

    /* renamed from: getCardHolderName$core_publicRelease, reason: from getter */
    public final java.lang.String getCardHolderName() {
        return this.cardHolderName;
    }

    /* renamed from: getCardLastDigits$core_publicRelease, reason: from getter */
    public final java.lang.String getCardLastDigits() {
        return this.cardLastDigits;
    }

    /* renamed from: getApplicationIdentifier$core_publicRelease, reason: from getter */
    public final java.lang.String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /* renamed from: getCardHash$core_publicRelease, reason: from getter */
    public final java.lang.String getCardHash() {
        return this.cardHash;
    }

    /* renamed from: getReferenceNumber$core_publicRelease, reason: from getter */
    public final java.lang.String getReferenceNumber() {
        return this.referenceNumber;
    }

    /* renamed from: getCardType$core_publicRelease, reason: from getter */
    public final java.lang.String getCardType() {
        return this.cardType;
    }

    /* renamed from: getTsi$core_publicRelease, reason: from getter */
    public final java.lang.String getTsi() {
        return this.tsi;
    }

    /* renamed from: getCardPaymentEntryMode$core_publicRelease, reason: from getter */
    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    /* renamed from: getCardholderVerificationMethod$core_publicRelease, reason: from getter */
    public final java.lang.String getCardholderVerificationMethod() {
        return this.cardholderVerificationMethod;
    }

    /* renamed from: getTvr$core_publicRelease, reason: from getter */
    public final java.lang.String getTvr() {
        return this.tvr;
    }

    /* renamed from: getCardIssuingBank$core_publicRelease, reason: from getter */
    public final java.lang.String getCardIssuingBank() {
        return this.cardIssuingBank;
    }

    /* renamed from: getMaskedPan$core_publicRelease, reason: from getter */
    public final java.lang.String getMaskedPan() {
        return this.maskedPan;
    }

    /* renamed from: getApplicationName$core_publicRelease, reason: from getter */
    public final java.lang.String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: getAuthorizationCode$core_publicRelease, reason: from getter */
    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* renamed from: getCardPaymentUUID$core_publicRelease, reason: from getter */
    public final java.lang.String getCardPaymentUUID() {
        return this.cardPaymentUUID;
    }

    /* renamed from: getSuggestionEmail$core_publicRelease, reason: from getter */
    public final java.lang.String getSuggestionEmail() {
        return this.suggestionEmail;
    }

    /* renamed from: getSuggestionPhone$core_publicRelease, reason: from getter */
    public final java.lang.String getSuggestionPhone() {
        return this.suggestionPhone;
    }

    /* renamed from: getSuggestionPhoneCountryCode$core_publicRelease, reason: from getter */
    public final java.lang.String getSuggestionPhoneCountryCode() {
        return this.suggestionPhoneCountryCode;
    }

    /* renamed from: getInstallmentAmount$core_publicRelease, reason: from getter */
    public final long getInstallmentAmount() {
        return this.installmentAmount;
    }

    /* renamed from: getNrOfInstallments$core_publicRelease, reason: from getter */
    public final int getNrOfInstallments() {
        return this.nrOfInstallments;
    }

    /* renamed from: getMxFiid$core_publicRelease, reason: from getter */
    public final java.lang.String getMxFiid() {
        return this.mxFiid;
    }

    /* renamed from: getMxCardType$core_publicRelease, reason: from getter */
    public final java.lang.String getMxCardType() {
        return this.mxCardType;
    }

    /* renamed from: getMxPaymentMethodCode$core_publicRelease, reason: from getter */
    public final java.lang.Integer getMxPaymentMethodCode() {
        return this.mxPaymentMethodCode;
    }

    /* renamed from: getReference$core_publicRelease, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getReference() {
        return this.reference;
    }

    /* renamed from: getGratuityAmount$core_publicRelease, reason: from getter */
    public final java.lang.Long getGratuityAmount() {
        return this.gratuityAmount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionApprovedPayload(java.lang.String str, java.lang.String str2, long j, boolean z, boolean z2, boolean z3, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, long j2, int i, java.lang.String str21, java.lang.String str22, java.lang.Integer num, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference tapToPayReference, java.lang.Long l) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.state = str;
        this.result = str2;
        this.amount = j;
        this.signatureRequired = z;
        this.signatureOptional = z2;
        this.signaturePermissive = z3;
        this.cardHolderName = str3;
        this.cardLastDigits = str4;
        this.applicationIdentifier = str5;
        this.cardHash = str6;
        this.referenceNumber = str7;
        this.cardType = str8;
        this.tsi = str9;
        this.cardPaymentEntryMode = str10;
        this.cardholderVerificationMethod = str11;
        this.tvr = str12;
        this.cardIssuingBank = str13;
        this.maskedPan = str14;
        this.applicationName = str15;
        this.authorizationCode = str16;
        this.cardPaymentUUID = str17;
        this.suggestionEmail = str18;
        this.suggestionPhone = str19;
        this.suggestionPhoneCountryCode = str20;
        this.installmentAmount = j2;
        this.nrOfInstallments = i;
        this.mxFiid = str21;
        this.mxCardType = str22;
        this.mxPaymentMethodCode = num;
        this.reference = tapToPayReference;
        this.gratuityAmount = l;
    }
}
