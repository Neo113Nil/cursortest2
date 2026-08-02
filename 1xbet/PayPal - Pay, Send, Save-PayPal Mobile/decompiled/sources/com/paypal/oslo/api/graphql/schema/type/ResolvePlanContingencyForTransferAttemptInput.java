package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0006\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0018\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u009a\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b/\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0019R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001bR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b4\u0010\u001bR\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b5\u0010\u001bR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b6\u0010\u001bR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b7\u0010\u001bR\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b8\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;", "", "id", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "action", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureDataCollectionResolutionInput;", "threeDSecureDataCollectionResolution", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationResolutionInput;", "threeDSecureAuthenticationResolution", "Lcom/paypal/oslo/api/graphql/schema/type/PlanUserDataCollectionResolutionInput;", "userDataCollectionResolution", "Lcom/paypal/oslo/api/graphql/schema/type/TopUpInstrumentResolutionInput;", "topUpInstrumentResolution", "Lcom/paypal/oslo/api/graphql/schema/type/CardVerificationDataCollectionResolutionInput;", "cardVerificationDataCollectionResolution", "Lcom/paypal/oslo/api/graphql/schema/type/RealTimeBalanceResolutionInput;", "realTimeBalanceResolution", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "component4", "()Lcom/apollographql/apollo/api/Optional;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "getFundingOptionId", "Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "getAction", "Lcom/apollographql/apollo/api/Optional;", "getThreeDSecureDataCollectionResolution", "getThreeDSecureAuthenticationResolution", "getUserDataCollectionResolution", "getTopUpInstrumentResolution", "getCardVerificationDataCollectionResolution", "getRealTimeBalanceResolution"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ResolvePlanContingencyForTransferAttemptInput {
    private final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction action;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CardVerificationDataCollectionResolutionInput> cardVerificationDataCollectionResolution;
    private final java.lang.Object fundingOptionId;
    private final java.lang.Object id;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput> realTimeBalanceResolution;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationResolutionInput> threeDSecureAuthenticationResolution;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput> threeDSecureDataCollectionResolution;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentResolutionInput> topUpInstrumentResolution;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput> userDataCollectionResolution;

    public ResolvePlanContingencyForTransferAttemptInput(java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationResolutionInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput> optional3, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentResolutionInput> optional4, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CardVerificationDataCollectionResolutionInput> optional5, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput> optional6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planContingencyAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        this.id = obj;
        this.fundingOptionId = obj2;
        this.action = planContingencyAction;
        this.threeDSecureDataCollectionResolution = optional;
        this.threeDSecureAuthenticationResolution = optional2;
        this.userDataCollectionResolution = optional3;
        this.topUpInstrumentResolution = optional4;
        this.cardVerificationDataCollectionResolution = optional5;
        this.realTimeBalanceResolution = optional6;
    }

    public final java.lang.Object getId() {
        return this.id;
    }

    public final java.lang.Object getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction getAction() {
        return this.action;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput> getThreeDSecureDataCollectionResolution() {
        return this.threeDSecureDataCollectionResolution;
    }

    public /* synthetic */ ResolvePlanContingencyForTransferAttemptInput(java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, planContingencyAction, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 256) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationResolutionInput> getThreeDSecureAuthenticationResolution() {
        return this.threeDSecureAuthenticationResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput> getUserDataCollectionResolution() {
        return this.userDataCollectionResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentResolutionInput> getTopUpInstrumentResolution() {
        return this.topUpInstrumentResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CardVerificationDataCollectionResolutionInput> getCardVerificationDataCollectionResolution() {
        return this.cardVerificationDataCollectionResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput> getRealTimeBalanceResolution() {
        return this.realTimeBalanceResolution;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        java.lang.Object obj2 = this.fundingOptionId;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction = this.action;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput> optional = this.threeDSecureDataCollectionResolution;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationResolutionInput> optional2 = this.threeDSecureAuthenticationResolution;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput> optional3 = this.userDataCollectionResolution;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentResolutionInput> optional4 = this.topUpInstrumentResolution;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CardVerificationDataCollectionResolutionInput> optional5 = this.cardVerificationDataCollectionResolution;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput> optional6 = this.realTimeBalanceResolution;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvePlanContingencyForTransferAttemptInput(id=");
        sb.append(obj);
        sb.append(", fundingOptionId=");
        sb.append(obj2);
        sb.append(", action=");
        sb.append(planContingencyAction);
        sb.append(", threeDSecureDataCollectionResolution=");
        sb.append(optional);
        sb.append(", threeDSecureAuthenticationResolution=");
        sb.append(optional2);
        sb.append(", userDataCollectionResolution=");
        sb.append(optional3);
        sb.append(", topUpInstrumentResolution=");
        sb.append(optional4);
        sb.append(", cardVerificationDataCollectionResolution=");
        sb.append(optional5);
        sb.append(", realTimeBalanceResolution=");
        sb.append(optional6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((this.id.hashCode() * 31) + this.fundingOptionId.hashCode()) * 31) + this.action.hashCode()) * 31) + this.threeDSecureDataCollectionResolution.hashCode()) * 31) + this.threeDSecureAuthenticationResolution.hashCode()) * 31) + this.userDataCollectionResolution.hashCode()) * 31) + this.topUpInstrumentResolution.hashCode()) * 31) + this.cardVerificationDataCollectionResolution.hashCode()) * 31) + this.realTimeBalanceResolution.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput resolvePlanContingencyForTransferAttemptInput = (com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, resolvePlanContingencyForTransferAttemptInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, resolvePlanContingencyForTransferAttemptInput.fundingOptionId) && this.action == resolvePlanContingencyForTransferAttemptInput.action && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDSecureDataCollectionResolution, resolvePlanContingencyForTransferAttemptInput.threeDSecureDataCollectionResolution) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDSecureAuthenticationResolution, resolvePlanContingencyForTransferAttemptInput.threeDSecureAuthenticationResolution) && kotlin.jvm.internal.Intrinsics.areEqual(this.userDataCollectionResolution, resolvePlanContingencyForTransferAttemptInput.userDataCollectionResolution) && kotlin.jvm.internal.Intrinsics.areEqual(this.topUpInstrumentResolution, resolvePlanContingencyForTransferAttemptInput.topUpInstrumentResolution) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardVerificationDataCollectionResolution, resolvePlanContingencyForTransferAttemptInput.cardVerificationDataCollectionResolution) && kotlin.jvm.internal.Intrinsics.areEqual(this.realTimeBalanceResolution, resolvePlanContingencyForTransferAttemptInput.realTimeBalanceResolution);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput copy(java.lang.Object id, java.lang.Object fundingOptionId, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction action, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput> threeDSecureDataCollectionResolution, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationResolutionInput> threeDSecureAuthenticationResolution, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput> userDataCollectionResolution, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentResolutionInput> topUpInstrumentResolution, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CardVerificationDataCollectionResolutionInput> cardVerificationDataCollectionResolution, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput> realTimeBalanceResolution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDSecureDataCollectionResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDSecureAuthenticationResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDataCollectionResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topUpInstrumentResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardVerificationDataCollectionResolution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeBalanceResolution, "");
        return new com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput(id, fundingOptionId, action, threeDSecureDataCollectionResolution, threeDSecureAuthenticationResolution, userDataCollectionResolution, topUpInstrumentResolution, cardVerificationDataCollectionResolution, realTimeBalanceResolution);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput> component9() {
        return this.realTimeBalanceResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CardVerificationDataCollectionResolutionInput> component8() {
        return this.cardVerificationDataCollectionResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentResolutionInput> component7() {
        return this.topUpInstrumentResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput> component6() {
        return this.userDataCollectionResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationResolutionInput> component5() {
        return this.threeDSecureAuthenticationResolution;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput> component4() {
        return this.threeDSecureDataCollectionResolution;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getFundingOptionId() {
        return this.fundingOptionId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }
}
