package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0090\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b-\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b/\u0010\u0015R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b0\u0010\u0015R\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b1\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramName;", "name", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramEnrollmentReason;", "reason", "Lcom/apollographql/apollo/api/Optional;", "defermentDuration", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "enrollmentFee", "outstandingBalance", "centralBankRate", "legalLimitRate", "legalLimitRateThreshold", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramName;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramEnrollmentReason;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramName;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramEnrollmentReason;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramName;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramEnrollmentReason;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramName;", "getName", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramEnrollmentReason;", "getReason", "Lcom/apollographql/apollo/api/Optional;", "getDefermentDuration", "getEnrollmentFee", "getOutstandingBalance", "getCentralBankRate", "getLegalLimitRate", "getLegalLimitRateThreshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLPlanProgramInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> centralBankRate;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> defermentDuration;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> enrollmentFee;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> legalLimitRate;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> legalLimitRateThreshold;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName name;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> outstandingBalance;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason reason;

    public BNPLPlanProgramInput(com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName bNPLPlanProgramName, com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason bNPLPlanProgramEnrollmentReason, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional3, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional4, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional5, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPlanProgramName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPlanProgramEnrollmentReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        this.name = bNPLPlanProgramName;
        this.reason = bNPLPlanProgramEnrollmentReason;
        this.defermentDuration = optional;
        this.enrollmentFee = optional2;
        this.outstandingBalance = optional3;
        this.centralBankRate = optional4;
        this.legalLimitRate = optional5;
        this.legalLimitRateThreshold = optional6;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName getName() {
        return this.name;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason getReason() {
        return this.reason;
    }

    public /* synthetic */ BNPLPlanProgramInput(com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName bNPLPlanProgramName, com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason bNPLPlanProgramEnrollmentReason, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bNPLPlanProgramName, bNPLPlanProgramEnrollmentReason, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getDefermentDuration() {
        return this.defermentDuration;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getEnrollmentFee() {
        return this.enrollmentFee;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getOutstandingBalance() {
        return this.outstandingBalance;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCentralBankRate() {
        return this.centralBankRate;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getLegalLimitRate() {
        return this.legalLimitRate;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getLegalLimitRateThreshold() {
        return this.legalLimitRateThreshold;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName bNPLPlanProgramName = this.name;
        com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason bNPLPlanProgramEnrollmentReason = this.reason;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.defermentDuration;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2 = this.enrollmentFee;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional3 = this.outstandingBalance;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional4 = this.centralBankRate;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional5 = this.legalLimitRate;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional6 = this.legalLimitRateThreshold;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLPlanProgramInput(name=");
        sb.append(bNPLPlanProgramName);
        sb.append(", reason=");
        sb.append(bNPLPlanProgramEnrollmentReason);
        sb.append(", defermentDuration=");
        sb.append(optional);
        sb.append(", enrollmentFee=");
        sb.append(optional2);
        sb.append(", outstandingBalance=");
        sb.append(optional3);
        sb.append(", centralBankRate=");
        sb.append(optional4);
        sb.append(", legalLimitRate=");
        sb.append(optional5);
        sb.append(", legalLimitRateThreshold=");
        sb.append(optional6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((this.name.hashCode() * 31) + this.reason.hashCode()) * 31) + this.defermentDuration.hashCode()) * 31) + this.enrollmentFee.hashCode()) * 31) + this.outstandingBalance.hashCode()) * 31) + this.centralBankRate.hashCode()) * 31) + this.legalLimitRate.hashCode()) * 31) + this.legalLimitRateThreshold.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput bNPLPlanProgramInput = (com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput) other;
        return this.name == bNPLPlanProgramInput.name && this.reason == bNPLPlanProgramInput.reason && kotlin.jvm.internal.Intrinsics.areEqual(this.defermentDuration, bNPLPlanProgramInput.defermentDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentFee, bNPLPlanProgramInput.enrollmentFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.outstandingBalance, bNPLPlanProgramInput.outstandingBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.centralBankRate, bNPLPlanProgramInput.centralBankRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalLimitRate, bNPLPlanProgramInput.legalLimitRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalLimitRateThreshold, bNPLPlanProgramInput.legalLimitRateThreshold);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput copy(com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName name2, com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason reason, com.apollographql.apollo.api.Optional<? extends java.lang.Object> defermentDuration, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> enrollmentFee, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> outstandingBalance, com.apollographql.apollo.api.Optional<? extends java.lang.Object> centralBankRate, com.apollographql.apollo.api.Optional<? extends java.lang.Object> legalLimitRate, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> legalLimitRateThreshold) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defermentDuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentFee, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outstandingBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(centralBankRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalLimitRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalLimitRateThreshold, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput(name2, reason, defermentDuration, enrollmentFee, outstandingBalance, centralBankRate, legalLimitRate, legalLimitRateThreshold);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component8() {
        return this.legalLimitRateThreshold;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component7() {
        return this.legalLimitRate;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component6() {
        return this.centralBankRate;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component5() {
        return this.outstandingBalance;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component4() {
        return this.enrollmentFee;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.defermentDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramEnrollmentReason getReason() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramName getName() {
        return this.name;
    }
}
