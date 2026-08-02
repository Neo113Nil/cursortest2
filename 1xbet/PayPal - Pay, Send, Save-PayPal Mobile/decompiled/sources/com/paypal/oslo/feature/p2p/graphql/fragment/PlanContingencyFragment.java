package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\t#$%&'()*+B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "action", "Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;", "status", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;", "details", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "getAction", "Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;", "getStatus", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;", "getDetails", "Details", "OnThreeDSecureDataCollectionContingency", "OnThreeDSecureAuthenticationContingency", "RedirectRequestParameter", "OnPlanUserDataCollection", "OnRealTimeBalanceContingency", "OnTopUpInstrumentContingency", "MinimumAmount", "OnCardVerificationDataCollectionContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlanContingencyFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction action;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details;
    private final com.paypal.oslo.api.graphql.schema.type.ContingencyStatus status;

    public PlanContingencyFragment(com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction, com.paypal.oslo.api.graphql.schema.type.ContingencyStatus contingencyStatus, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planContingencyAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyStatus, "");
        this.action = planContingencyAction;
        this.status = contingencyStatus;
        this.details = details;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction getAction() {
        return this.action;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContingencyStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details getDetails() {
        return this.details;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;", "onThreeDSecureDataCollectionContingency", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;", "onThreeDSecureAuthenticationContingency", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;", "onPlanUserDataCollection", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;", "onRealTimeBalanceContingency", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;", "onTopUpInstrumentContingency", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;", "onCardVerificationDataCollectionContingency", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;", "component5", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;", "component6", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;", "component7", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;", "getOnThreeDSecureDataCollectionContingency", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;", "getOnThreeDSecureAuthenticationContingency", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;", "getOnPlanUserDataCollection", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;", "getOnRealTimeBalanceContingency", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;", "getOnTopUpInstrumentContingency", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;", "getOnCardVerificationDataCollectionContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Details {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency;

        public Details(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onThreeDSecureDataCollectionContingency = onThreeDSecureDataCollectionContingency;
            this.onThreeDSecureAuthenticationContingency = onThreeDSecureAuthenticationContingency;
            this.onPlanUserDataCollection = onPlanUserDataCollection;
            this.onRealTimeBalanceContingency = onRealTimeBalanceContingency;
            this.onTopUpInstrumentContingency = onTopUpInstrumentContingency;
            this.onCardVerificationDataCollectionContingency = onCardVerificationDataCollectionContingency;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency getOnThreeDSecureDataCollectionContingency() {
            return this.onThreeDSecureDataCollectionContingency;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency getOnThreeDSecureAuthenticationContingency() {
            return this.onThreeDSecureAuthenticationContingency;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection getOnPlanUserDataCollection() {
            return this.onPlanUserDataCollection;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency getOnRealTimeBalanceContingency() {
            return this.onRealTimeBalanceContingency;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency getOnTopUpInstrumentContingency() {
            return this.onTopUpInstrumentContingency;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency getOnCardVerificationDataCollectionContingency() {
            return this.onCardVerificationDataCollectionContingency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency = this.onThreeDSecureDataCollectionContingency;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency = this.onThreeDSecureAuthenticationContingency;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection = this.onPlanUserDataCollection;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency = this.onRealTimeBalanceContingency;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency = this.onTopUpInstrumentContingency;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency = this.onCardVerificationDataCollectionContingency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Details(__typename=");
            sb.append(str);
            sb.append(", onThreeDSecureDataCollectionContingency=");
            sb.append(onThreeDSecureDataCollectionContingency);
            sb.append(", onThreeDSecureAuthenticationContingency=");
            sb.append(onThreeDSecureAuthenticationContingency);
            sb.append(", onPlanUserDataCollection=");
            sb.append(onPlanUserDataCollection);
            sb.append(", onRealTimeBalanceContingency=");
            sb.append(onRealTimeBalanceContingency);
            sb.append(", onTopUpInstrumentContingency=");
            sb.append(onTopUpInstrumentContingency);
            sb.append(", onCardVerificationDataCollectionContingency=");
            sb.append(onCardVerificationDataCollectionContingency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency = this.onThreeDSecureDataCollectionContingency;
            int hashCode2 = onThreeDSecureDataCollectionContingency == null ? 0 : onThreeDSecureDataCollectionContingency.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency = this.onThreeDSecureAuthenticationContingency;
            int hashCode3 = onThreeDSecureAuthenticationContingency == null ? 0 : onThreeDSecureAuthenticationContingency.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection = this.onPlanUserDataCollection;
            int hashCode4 = onPlanUserDataCollection == null ? 0 : onPlanUserDataCollection.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency = this.onRealTimeBalanceContingency;
            int hashCode5 = onRealTimeBalanceContingency == null ? 0 : onRealTimeBalanceContingency.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency = this.onTopUpInstrumentContingency;
            int hashCode6 = onTopUpInstrumentContingency == null ? 0 : onTopUpInstrumentContingency.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency = this.onCardVerificationDataCollectionContingency;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (onCardVerificationDataCollectionContingency != null ? onCardVerificationDataCollectionContingency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, details.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onThreeDSecureDataCollectionContingency, details.onThreeDSecureDataCollectionContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.onThreeDSecureAuthenticationContingency, details.onThreeDSecureAuthenticationContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPlanUserDataCollection, details.onPlanUserDataCollection) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRealTimeBalanceContingency, details.onRealTimeBalanceContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTopUpInstrumentContingency, details.onTopUpInstrumentContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCardVerificationDataCollectionContingency, details.onCardVerificationDataCollectionContingency);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details(__typename, onThreeDSecureDataCollectionContingency, onThreeDSecureAuthenticationContingency, onPlanUserDataCollection, onRealTimeBalanceContingency, onTopUpInstrumentContingency, onCardVerificationDataCollectionContingency);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency getOnCardVerificationDataCollectionContingency() {
            return this.onCardVerificationDataCollectionContingency;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency getOnTopUpInstrumentContingency() {
            return this.onTopUpInstrumentContingency;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency getOnRealTimeBalanceContingency() {
            return this.onRealTimeBalanceContingency;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection getOnPlanUserDataCollection() {
            return this.onPlanUserDataCollection;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency getOnThreeDSecureAuthenticationContingency() {
            return this.onThreeDSecureAuthenticationContingency;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency getOnThreeDSecureDataCollectionContingency() {
            return this.onThreeDSecureDataCollectionContingency;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = details.__typename;
            }
            if ((i & 2) != 0) {
                onThreeDSecureDataCollectionContingency = details.onThreeDSecureDataCollectionContingency;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency2 = onThreeDSecureDataCollectionContingency;
            if ((i & 4) != 0) {
                onThreeDSecureAuthenticationContingency = details.onThreeDSecureAuthenticationContingency;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency2 = onThreeDSecureAuthenticationContingency;
            if ((i & 8) != 0) {
                onPlanUserDataCollection = details.onPlanUserDataCollection;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection2 = onPlanUserDataCollection;
            if ((i & 16) != 0) {
                onRealTimeBalanceContingency = details.onRealTimeBalanceContingency;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency2 = onRealTimeBalanceContingency;
            if ((i & 32) != 0) {
                onTopUpInstrumentContingency = details.onTopUpInstrumentContingency;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency2 = onTopUpInstrumentContingency;
            if ((i & 64) != 0) {
                onCardVerificationDataCollectionContingency = details.onCardVerificationDataCollectionContingency;
            }
            return details.copy(str, onThreeDSecureDataCollectionContingency2, onThreeDSecureAuthenticationContingency2, onPlanUserDataCollection2, onRealTimeBalanceContingency2, onTopUpInstrumentContingency2, onCardVerificationDataCollectionContingency);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0015Jt\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b1\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b6\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b9\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "version", "", "referenceId", "deviceDataCollectionUrl", com.paypal.android.threeds.utils.NetworkUtil.JWT, "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureDeviceDataCollectionMode;", "deviceDataCollectionMode", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;", "authenticationProvider", "returnUrl", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureContingencySource;", "source", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureDeviceDataCollectionMode;Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureContingencySource;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Object;", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureDeviceDataCollectionMode;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;", "component7", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureContingencySource;", "component9", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureDeviceDataCollectionMode;Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureContingencySource;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "getVersion", "Ljava/lang/String;", "getReferenceId", "Ljava/lang/Object;", "getDeviceDataCollectionUrl", "getJwt", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureDeviceDataCollectionMode;", "getDeviceDataCollectionMode", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;", "getAuthenticationProvider", "getReturnUrl", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureContingencySource;", "getSource", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnThreeDSecureDataCollectionContingency {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider authenticationProvider;
        private final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode deviceDataCollectionMode;
        private final java.lang.Object deviceDataCollectionUrl;
        private final java.lang.String jwt;
        private final java.lang.String reason;
        private final java.lang.String referenceId;
        private final java.lang.Object returnUrl;
        private final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource source;
        private final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion version;

        public OnThreeDSecureDataCollectionContingency(com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion, java.lang.String str, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode threeDSecureDeviceDataCollectionMode, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider threeDSecureAuthenticationProvider, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource threeDSecureContingencySource, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDSecureVersion, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.version = threeDSecureVersion;
            this.referenceId = str;
            this.deviceDataCollectionUrl = obj;
            this.jwt = str2;
            this.deviceDataCollectionMode = threeDSecureDeviceDataCollectionMode;
            this.authenticationProvider = threeDSecureAuthenticationProvider;
            this.returnUrl = obj2;
            this.source = threeDSecureContingencySource;
            this.reason = str3;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion getVersion() {
            return this.version;
        }

        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final java.lang.Object getDeviceDataCollectionUrl() {
            return this.deviceDataCollectionUrl;
        }

        public final java.lang.String getJwt() {
            return this.jwt;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode getDeviceDataCollectionMode() {
            return this.deviceDataCollectionMode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider getAuthenticationProvider() {
            return this.authenticationProvider;
        }

        public final java.lang.Object getReturnUrl() {
            return this.returnUrl;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource getSource() {
            return this.source;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion = this.version;
            java.lang.String str = this.referenceId;
            java.lang.Object obj = this.deviceDataCollectionUrl;
            java.lang.String str2 = this.jwt;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode threeDSecureDeviceDataCollectionMode = this.deviceDataCollectionMode;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider threeDSecureAuthenticationProvider = this.authenticationProvider;
            java.lang.Object obj2 = this.returnUrl;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource threeDSecureContingencySource = this.source;
            java.lang.String str3 = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnThreeDSecureDataCollectionContingency(version=");
            sb.append(threeDSecureVersion);
            sb.append(", referenceId=");
            sb.append(str);
            sb.append(", deviceDataCollectionUrl=");
            sb.append(obj);
            sb.append(", jwt=");
            sb.append(str2);
            sb.append(", deviceDataCollectionMode=");
            sb.append(threeDSecureDeviceDataCollectionMode);
            sb.append(", authenticationProvider=");
            sb.append(threeDSecureAuthenticationProvider);
            sb.append(", returnUrl=");
            sb.append(obj2);
            sb.append(", source=");
            sb.append(threeDSecureContingencySource);
            sb.append(", reason=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.version.hashCode();
            int hashCode2 = this.referenceId.hashCode();
            int hashCode3 = this.deviceDataCollectionUrl.hashCode();
            int hashCode4 = this.jwt.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode threeDSecureDeviceDataCollectionMode = this.deviceDataCollectionMode;
            int hashCode5 = threeDSecureDeviceDataCollectionMode == null ? 0 : threeDSecureDeviceDataCollectionMode.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider threeDSecureAuthenticationProvider = this.authenticationProvider;
            int hashCode6 = threeDSecureAuthenticationProvider == null ? 0 : threeDSecureAuthenticationProvider.hashCode();
            java.lang.Object obj = this.returnUrl;
            int hashCode7 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource threeDSecureContingencySource = this.source;
            int hashCode8 = threeDSecureContingencySource == null ? 0 : threeDSecureContingencySource.hashCode();
            java.lang.String str = this.reason;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency) other;
            return this.version == onThreeDSecureDataCollectionContingency.version && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, onThreeDSecureDataCollectionContingency.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceDataCollectionUrl, onThreeDSecureDataCollectionContingency.deviceDataCollectionUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.jwt, onThreeDSecureDataCollectionContingency.jwt) && this.deviceDataCollectionMode == onThreeDSecureDataCollectionContingency.deviceDataCollectionMode && this.authenticationProvider == onThreeDSecureDataCollectionContingency.authenticationProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, onThreeDSecureDataCollectionContingency.returnUrl) && this.source == onThreeDSecureDataCollectionContingency.source && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, onThreeDSecureDataCollectionContingency.reason);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency copy(com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion version, java.lang.String referenceId, java.lang.Object deviceDataCollectionUrl, java.lang.String jwt, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode deviceDataCollectionMode, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider authenticationProvider, java.lang.Object returnUrl, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource source, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceDataCollectionUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwt, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency(version, referenceId, deviceDataCollectionUrl, jwt, deviceDataCollectionMode, authenticationProvider, returnUrl, source, reason);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource getSource() {
            return this.source;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider getAuthenticationProvider() {
            return this.authenticationProvider;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode getDeviceDataCollectionMode() {
            return this.deviceDataCollectionMode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getJwt() {
            return this.jwt;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getDeviceDataCollectionUrl() {
            return this.deviceDataCollectionUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion getVersion() {
            return this.version;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0082\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b7\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b8\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b;\u0010\u0017R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "version", "", "referenceId", com.paypal.android.threeds.utils.NetworkUtil.JWT, "resolutionRedirectUrl", "Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;", "resolutionRedirectMethod", "transactionId", "externalTransactionId", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;", "authenticationProvider", "paymentAuthRequest", "", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$RedirectRequestParameter;", "redirectRequestParameters", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;", "component6", "component7", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;", "component9", "component10", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "getVersion", "Ljava/lang/String;", "getReferenceId", "getJwt", "Ljava/lang/Object;", "getResolutionRedirectUrl", "Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;", "getResolutionRedirectMethod", "getTransactionId", "getExternalTransactionId", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureAuthenticationProvider;", "getAuthenticationProvider", "getPaymentAuthRequest", "Ljava/util/List;", "getRedirectRequestParameters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnThreeDSecureAuthenticationContingency {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider authenticationProvider;
        private final java.lang.String externalTransactionId;
        private final java.lang.String jwt;
        private final java.lang.String paymentAuthRequest;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> redirectRequestParameters;
        private final java.lang.String referenceId;
        private final com.paypal.oslo.api.graphql.schema.type.HttpMethod resolutionRedirectMethod;
        private final java.lang.Object resolutionRedirectUrl;
        private final java.lang.String transactionId;
        private final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion version;

        public OnThreeDSecureAuthenticationContingency(com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion, java.lang.String str, java.lang.String str2, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.HttpMethod httpMethod, java.lang.String str3, java.lang.String str4, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider threeDSecureAuthenticationProvider, java.lang.String str5, java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDSecureVersion, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.version = threeDSecureVersion;
            this.referenceId = str;
            this.jwt = str2;
            this.resolutionRedirectUrl = obj;
            this.resolutionRedirectMethod = httpMethod;
            this.transactionId = str3;
            this.externalTransactionId = str4;
            this.authenticationProvider = threeDSecureAuthenticationProvider;
            this.paymentAuthRequest = str5;
            this.redirectRequestParameters = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion getVersion() {
            return this.version;
        }

        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final java.lang.String getJwt() {
            return this.jwt;
        }

        public final java.lang.Object getResolutionRedirectUrl() {
            return this.resolutionRedirectUrl;
        }

        public final com.paypal.oslo.api.graphql.schema.type.HttpMethod getResolutionRedirectMethod() {
            return this.resolutionRedirectMethod;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public final java.lang.String getExternalTransactionId() {
            return this.externalTransactionId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider getAuthenticationProvider() {
            return this.authenticationProvider;
        }

        public final java.lang.String getPaymentAuthRequest() {
            return this.paymentAuthRequest;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> getRedirectRequestParameters() {
            return this.redirectRequestParameters;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion = this.version;
            java.lang.String str = this.referenceId;
            java.lang.String str2 = this.jwt;
            java.lang.Object obj = this.resolutionRedirectUrl;
            com.paypal.oslo.api.graphql.schema.type.HttpMethod httpMethod = this.resolutionRedirectMethod;
            java.lang.String str3 = this.transactionId;
            java.lang.String str4 = this.externalTransactionId;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider threeDSecureAuthenticationProvider = this.authenticationProvider;
            java.lang.String str5 = this.paymentAuthRequest;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> list = this.redirectRequestParameters;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnThreeDSecureAuthenticationContingency(version=");
            sb.append(threeDSecureVersion);
            sb.append(", referenceId=");
            sb.append(str);
            sb.append(", jwt=");
            sb.append(str2);
            sb.append(", resolutionRedirectUrl=");
            sb.append(obj);
            sb.append(", resolutionRedirectMethod=");
            sb.append(httpMethod);
            sb.append(", transactionId=");
            sb.append(str3);
            sb.append(", externalTransactionId=");
            sb.append(str4);
            sb.append(", authenticationProvider=");
            sb.append(threeDSecureAuthenticationProvider);
            sb.append(", paymentAuthRequest=");
            sb.append(str5);
            sb.append(", redirectRequestParameters=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.version.hashCode();
            int hashCode2 = this.referenceId.hashCode();
            int hashCode3 = this.jwt.hashCode();
            int hashCode4 = this.resolutionRedirectUrl.hashCode();
            int hashCode5 = this.resolutionRedirectMethod.hashCode();
            int hashCode6 = this.transactionId.hashCode();
            java.lang.String str = this.externalTransactionId;
            int hashCode7 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider threeDSecureAuthenticationProvider = this.authenticationProvider;
            int hashCode8 = threeDSecureAuthenticationProvider == null ? 0 : threeDSecureAuthenticationProvider.hashCode();
            java.lang.String str2 = this.paymentAuthRequest;
            int hashCode9 = str2 == null ? 0 : str2.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> list = this.redirectRequestParameters;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency) other;
            return this.version == onThreeDSecureAuthenticationContingency.version && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, onThreeDSecureAuthenticationContingency.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.jwt, onThreeDSecureAuthenticationContingency.jwt) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolutionRedirectUrl, onThreeDSecureAuthenticationContingency.resolutionRedirectUrl) && this.resolutionRedirectMethod == onThreeDSecureAuthenticationContingency.resolutionRedirectMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, onThreeDSecureAuthenticationContingency.transactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalTransactionId, onThreeDSecureAuthenticationContingency.externalTransactionId) && this.authenticationProvider == onThreeDSecureAuthenticationContingency.authenticationProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAuthRequest, onThreeDSecureAuthenticationContingency.paymentAuthRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectRequestParameters, onThreeDSecureAuthenticationContingency.redirectRequestParameters);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency copy(com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion version, java.lang.String referenceId, java.lang.String jwt, java.lang.Object resolutionRedirectUrl, com.paypal.oslo.api.graphql.schema.type.HttpMethod resolutionRedirectMethod, java.lang.String transactionId, java.lang.String externalTransactionId, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider authenticationProvider, java.lang.String paymentAuthRequest, java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> redirectRequestParameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwt, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolutionRedirectUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolutionRedirectMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency(version, referenceId, jwt, resolutionRedirectUrl, resolutionRedirectMethod, transactionId, externalTransactionId, authenticationProvider, paymentAuthRequest, redirectRequestParameters);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getPaymentAuthRequest() {
            return this.paymentAuthRequest;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider getAuthenticationProvider() {
            return this.authenticationProvider;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getExternalTransactionId() {
            return this.externalTransactionId;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.HttpMethod getResolutionRedirectMethod() {
            return this.resolutionRedirectMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getResolutionRedirectUrl() {
            return this.resolutionRedirectUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getJwt() {
            return this.jwt;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> component10() {
            return this.redirectRequestParameters;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion getVersion() {
            return this.version;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$RedirectRequestParameter;", "", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$RedirectRequestParameter;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedirectRequestParameter {
        public static final int $stable = 0;
        private final java.lang.String key;
        private final java.lang.String value;

        public RedirectRequestParameter(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.key = str;
            this.value = str2;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.key;
            java.lang.String str2 = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedirectRequestParameter(key=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter redirectRequestParameter = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, redirectRequestParameter.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, redirectRequestParameter.value);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter copy(java.lang.String key, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter(key, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter redirectRequestParameter, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = redirectRequestParameter.key;
            }
            if ((i & 2) != 0) {
                str2 = redirectRequestParameter.value;
            }
            return redirectRequestParameter.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ2\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/PlanUserDataCollectionAttribute;", "requiredFields", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "identityDocuments", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRequiredFields", "getIdentityDocuments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPlanUserDataCollection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> identityDocuments;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute> requiredFields;

        /* JADX WARN: Multi-variable type inference failed */
        public OnPlanUserDataCollection(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute> list, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.requiredFields = list;
            this.identityDocuments = list2;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute> getRequiredFields() {
            return this.requiredFields;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> getIdentityDocuments() {
            return this.identityDocuments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute> list = this.requiredFields;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> list2 = this.identityDocuments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPlanUserDataCollection(requiredFields=");
            sb.append(list);
            sb.append(", identityDocuments=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.requiredFields.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> list = this.identityDocuments;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requiredFields, onPlanUserDataCollection.requiredFields) && kotlin.jvm.internal.Intrinsics.areEqual(this.identityDocuments, onPlanUserDataCollection.identityDocuments);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute> requiredFields, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> identityDocuments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredFields, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection(requiredFields, identityDocuments);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> component2() {
            return this.identityDocuments;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute> component1() {
            return this.requiredFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onPlanUserDataCollection.requiredFields;
            }
            if ((i & 2) != 0) {
                list2 = onPlanUserDataCollection.identityDocuments;
            }
            return onPlanUserDataCollection.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;", "", "confirmationUrl", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getConfirmationUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRealTimeBalanceContingency {
        public static final int $stable = 8;
        private final java.lang.Object confirmationUrl;

        public OnRealTimeBalanceContingency(java.lang.Object obj) {
            this.confirmationUrl = obj;
        }

        public final java.lang.Object getConfirmationUrl() {
            return this.confirmationUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.confirmationUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRealTimeBalanceContingency(confirmationUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.confirmationUrl;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationUrl, ((com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency) other).confirmationUrl);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency copy(java.lang.Object confirmationUrl) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency(confirmationUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getConfirmationUrl() {
            return this.confirmationUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onRealTimeBalanceContingency.confirmationUrl;
            }
            return onRealTimeBalanceContingency.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;", "", "Lcom/paypal/oslo/api/graphql/schema/type/TopUpInstrumentProvider;", "provider", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;", "minimumAmount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/TopUpInstrumentProvider;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/TopUpInstrumentProvider;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/TopUpInstrumentProvider;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/TopUpInstrumentProvider;", "getProvider", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;", "getMinimumAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTopUpInstrumentContingency {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount minimumAmount;
        private final com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentProvider provider;

        public OnTopUpInstrumentContingency(com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentProvider topUpInstrumentProvider, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount minimumAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topUpInstrumentProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
            this.provider = topUpInstrumentProvider;
            this.minimumAmount = minimumAmount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentProvider getProvider() {
            return this.provider;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount getMinimumAmount() {
            return this.minimumAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentProvider topUpInstrumentProvider = this.provider;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount minimumAmount = this.minimumAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTopUpInstrumentContingency(provider=");
            sb.append(topUpInstrumentProvider);
            sb.append(", minimumAmount=");
            sb.append(minimumAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.provider.hashCode() * 31) + this.minimumAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency) other;
            return this.provider == onTopUpInstrumentContingency.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, onTopUpInstrumentContingency.minimumAmount);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency copy(com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentProvider provider, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount minimumAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency(provider, minimumAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount getMinimumAmount() {
            return this.minimumAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentProvider getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency, com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentProvider topUpInstrumentProvider, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount minimumAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                topUpInstrumentProvider = onTopUpInstrumentContingency.provider;
            }
            if ((i & 2) != 0) {
                minimumAmount = onTopUpInstrumentContingency.minimumAmount;
            }
            return onTopUpInstrumentContingency.copy(topUpInstrumentProvider, minimumAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "p2PMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "getP2PMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MinimumAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment;

        public MinimumAmount(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PMoneyFragment, "");
            this.__typename = str;
            this.p2PMoneyFragment = p2PMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MinimumAmount(__typename=");
            sb.append(str);
            sb.append(", p2PMoneyFragment=");
            sb.append(p2PMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.p2PMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount minimumAmount = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, minimumAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.p2PMoneyFragment, minimumAmount.p2PMoneyFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PMoneyFragment, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount(__typename, p2PMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount minimumAmount, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = minimumAmount.__typename;
            }
            if ((i & 2) != 0) {
                p2PMoneyFragment = minimumAmount.p2PMoneyFragment;
            }
            return minimumAmount.copy(str, p2PMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;", "", "", "cvvLength", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getCvvLength"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCardVerificationDataCollectionContingency {
        public static final int $stable = 0;
        private final java.lang.Integer cvvLength;

        public OnCardVerificationDataCollectionContingency(java.lang.Integer num) {
            this.cvvLength = num;
        }

        public final java.lang.Integer getCvvLength() {
            return this.cvvLength;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.cvvLength;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCardVerificationDataCollectionContingency(cvvLength=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.cvvLength;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvvLength, ((com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency) other).cvvLength);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency copy(java.lang.Integer cvvLength) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency(cvvLength);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getCvvLength() {
            return this.cvvLength;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = onCardVerificationDataCollectionContingency.cvvLength;
            }
            return onCardVerificationDataCollectionContingency.copy(num);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction = this.action;
        com.paypal.oslo.api.graphql.schema.type.ContingencyStatus contingencyStatus = this.status;
        com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details = this.details;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanContingencyFragment(action=");
        sb.append(planContingencyAction);
        sb.append(", status=");
        sb.append(contingencyStatus);
        sb.append(", details=");
        sb.append(details);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode();
        int hashCode2 = this.status.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details = this.details;
        return (((hashCode * 31) + hashCode2) * 31) + (details == null ? 0 : details.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment planContingencyFragment = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment) other;
        return this.action == planContingencyFragment.action && this.status == planContingencyFragment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.details, planContingencyFragment.details);
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment copy(com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction action, com.paypal.oslo.api.graphql.schema.type.ContingencyStatus status, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment(action, status, details);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details getDetails() {
        return this.details;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ContingencyStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction getAction() {
        return this.action;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment planContingencyFragment, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction, com.paypal.oslo.api.graphql.schema.type.ContingencyStatus contingencyStatus, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planContingencyAction = planContingencyFragment.action;
        }
        if ((i & 2) != 0) {
            contingencyStatus = planContingencyFragment.status;
        }
        if ((i & 4) != 0) {
            details = planContingencyFragment.details;
        }
        return planContingencyFragment.copy(planContingencyAction, contingencyStatus, details);
    }
}
