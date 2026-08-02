package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u009a\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0018R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b/\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b0\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b1\u0010\u0016R\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b2\u0010\u0016R\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b4\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/apollographql/apollo/api/Optional;", "", "shippingAddressId", "", "primaryCard", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCardHolderInput;", "cardHolder", "cardVerificationCode", "pin", "customizationId", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentUserPreferenceInput;", "fundingPreferences", "shouldIssuePhysical", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/apollographql/apollo/api/Optional;ZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/apollographql/apollo/api/Optional;ZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Z)Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Lcom/apollographql/apollo/api/Optional;", "getShippingAddressId", "Z", "getPrimaryCard", "getCardHolder", "getCardVerificationCode", "getPin", "getCustomizationId", "getFundingPreferences", "getShouldIssuePhysical"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateDebitInstrumentInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardHolderInput> cardHolder;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> cardVerificationCode;
    private final com.apollographql.apollo.api.Optional<java.lang.String> customizationId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> fundingPreferences;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> pin;
    private final boolean primaryCard;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;
    private final com.apollographql.apollo.api.Optional<java.lang.String> shippingAddressId;
    private final boolean shouldIssuePhysical;

    public CreateDebitInstrumentInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional<java.lang.String> optional, boolean z, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardHolderInput> optional2, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional3, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional4, com.apollographql.apollo.api.Optional<java.lang.String> optional5, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> optional6, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        this.productName = debitInstrumentProductName;
        this.shippingAddressId = optional;
        this.primaryCard = z;
        this.cardHolder = optional2;
        this.cardVerificationCode = optional3;
        this.pin = optional4;
        this.customizationId = optional5;
        this.fundingPreferences = optional6;
        this.shouldIssuePhysical = z2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
        return this.productName;
    }

    public /* synthetic */ CreateDebitInstrumentInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional optional, boolean z, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitInstrumentProductName, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, z, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, z2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getShippingAddressId() {
        return this.shippingAddressId;
    }

    public final boolean getPrimaryCard() {
        return this.primaryCard;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardHolderInput> getCardHolder() {
        return this.cardHolder;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCardVerificationCode() {
        return this.cardVerificationCode;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getPin() {
        return this.pin;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCustomizationId() {
        return this.customizationId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> getFundingPreferences() {
        return this.fundingPreferences;
    }

    public final boolean getShouldIssuePhysical() {
        return this.shouldIssuePhysical;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.shippingAddressId;
        boolean z = this.primaryCard;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardHolderInput> optional2 = this.cardHolder;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional3 = this.cardVerificationCode;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional4 = this.pin;
        com.apollographql.apollo.api.Optional<java.lang.String> optional5 = this.customizationId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> optional6 = this.fundingPreferences;
        boolean z2 = this.shouldIssuePhysical;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateDebitInstrumentInput(productName=");
        sb.append(debitInstrumentProductName);
        sb.append(", shippingAddressId=");
        sb.append(optional);
        sb.append(", primaryCard=");
        sb.append(z);
        sb.append(", cardHolder=");
        sb.append(optional2);
        sb.append(", cardVerificationCode=");
        sb.append(optional3);
        sb.append(", pin=");
        sb.append(optional4);
        sb.append(", customizationId=");
        sb.append(optional5);
        sb.append(", fundingPreferences=");
        sb.append(optional6);
        sb.append(", shouldIssuePhysical=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((this.productName.hashCode() * 31) + this.shippingAddressId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primaryCard)) * 31) + this.cardHolder.hashCode()) * 31) + this.cardVerificationCode.hashCode()) * 31) + this.pin.hashCode()) * 31) + this.customizationId.hashCode()) * 31) + this.fundingPreferences.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldIssuePhysical);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentInput createDebitInstrumentInput = (com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentInput) other;
        return this.productName == createDebitInstrumentInput.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAddressId, createDebitInstrumentInput.shippingAddressId) && this.primaryCard == createDebitInstrumentInput.primaryCard && kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolder, createDebitInstrumentInput.cardHolder) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardVerificationCode, createDebitInstrumentInput.cardVerificationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, createDebitInstrumentInput.pin) && kotlin.jvm.internal.Intrinsics.areEqual(this.customizationId, createDebitInstrumentInput.customizationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPreferences, createDebitInstrumentInput.fundingPreferences) && this.shouldIssuePhysical == createDebitInstrumentInput.shouldIssuePhysical;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentInput copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, com.apollographql.apollo.api.Optional<java.lang.String> shippingAddressId, boolean primaryCard, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardHolderInput> cardHolder, com.apollographql.apollo.api.Optional<? extends java.lang.Object> cardVerificationCode, com.apollographql.apollo.api.Optional<? extends java.lang.Object> pin, com.apollographql.apollo.api.Optional<java.lang.String> customizationId, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> fundingPreferences, boolean shouldIssuePhysical) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddressId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardHolder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardVerificationCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customizationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingPreferences, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentInput(productName, shippingAddressId, primaryCard, cardHolder, cardVerificationCode, pin, customizationId, fundingPreferences, shouldIssuePhysical);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldIssuePhysical() {
        return this.shouldIssuePhysical;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> component8() {
        return this.fundingPreferences;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component7() {
        return this.customizationId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component6() {
        return this.pin;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component5() {
        return this.cardVerificationCode;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardHolderInput> component4() {
        return this.cardHolder;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPrimaryCard() {
        return this.primaryCard;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.shippingAddressId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
        return this.productName;
    }
}
