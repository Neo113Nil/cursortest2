package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreditCardIdentityChallengeValidationInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "type", "", "challengeId", "cardNumber", "Lcom/apollographql/apollo/api/Optional;", "expiry", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CreditCardIdentityChallengeValidationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getType", "Ljava/lang/String;", "getChallengeId", "getCardNumber", "Lcom/apollographql/apollo/api/Optional;", "getExpiry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreditCardIdentityChallengeValidationInput {
    private final java.lang.String cardNumber;
    private final java.lang.String challengeId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> expiry;
    private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod type;

    public CreditCardIdentityChallengeValidationInput(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.type = stepUpIdentityChallengeMethod;
        this.challengeId = str;
        this.cardNumber = str2;
        this.expiry = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getType() {
        return this.type;
    }

    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public /* synthetic */ CreditCardIdentityChallengeValidationInput(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(stepUpIdentityChallengeMethod, str, str2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getExpiry() {
        return this.expiry;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.type;
        java.lang.String str = this.challengeId;
        java.lang.String str2 = this.cardNumber;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.expiry;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditCardIdentityChallengeValidationInput(type=");
        sb.append(stepUpIdentityChallengeMethod);
        sb.append(", challengeId=");
        sb.append(str);
        sb.append(", cardNumber=");
        sb.append(str2);
        sb.append(", expiry=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.type.hashCode() * 31) + this.challengeId.hashCode()) * 31) + this.cardNumber.hashCode()) * 31) + this.expiry.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput creditCardIdentityChallengeValidationInput = (com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput) other;
        return this.type == creditCardIdentityChallengeValidationInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, creditCardIdentityChallengeValidationInput.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, creditCardIdentityChallengeValidationInput.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiry, creditCardIdentityChallengeValidationInput.expiry);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput copy(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod type, java.lang.String challengeId, java.lang.String cardNumber, com.apollographql.apollo.api.Optional<java.lang.String> expiry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiry, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput(type, challengeId, cardNumber, expiry);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.expiry;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getChallengeId() {
        return this.challengeId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput creditCardIdentityChallengeValidationInput, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stepUpIdentityChallengeMethod = creditCardIdentityChallengeValidationInput.type;
        }
        if ((i & 2) != 0) {
            str = creditCardIdentityChallengeValidationInput.challengeId;
        }
        if ((i & 4) != 0) {
            str2 = creditCardIdentityChallengeValidationInput.cardNumber;
        }
        if ((i & 8) != 0) {
            optional = creditCardIdentityChallengeValidationInput.expiry;
        }
        return creditCardIdentityChallengeValidationInput.copy(stepUpIdentityChallengeMethod, str, str2, optional);
    }
}
