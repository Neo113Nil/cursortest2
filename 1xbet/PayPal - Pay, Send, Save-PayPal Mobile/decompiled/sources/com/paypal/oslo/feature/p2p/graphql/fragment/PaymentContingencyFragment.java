package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0003'()B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "action", "Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;", "status", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$Details;", "details", "", "__typename", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$Details;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$Details;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$Details;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "getAction", "Lcom/paypal/oslo/api/graphql/schema/type/ContingencyStatus;", "getStatus", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$Details;", "getDetails", "Ljava/lang/String;", "get__typename", "Details", "OnPaymentUserDataCollection", "OnScamWarningContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentContingencyFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction action;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details;
    private final com.paypal.oslo.api.graphql.schema.type.ContingencyStatus status;

    public PaymentContingencyFragment(com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction, com.paypal.oslo.api.graphql.schema.type.ContingencyStatus contingencyStatus, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentContingencyAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.action = paymentContingencyAction;
        this.status = contingencyStatus;
        this.details = details;
        this.__typename = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction getAction() {
        return this.action;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContingencyStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details getDetails() {
        return this.details;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$Details;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnPaymentUserDataCollection;", "onPaymentUserDataCollection", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnScamWarningContingency;", "onScamWarningContingency", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnPaymentUserDataCollection;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnScamWarningContingency;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnPaymentUserDataCollection;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnScamWarningContingency;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnPaymentUserDataCollection;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnScamWarningContingency;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$Details;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnPaymentUserDataCollection;", "getOnPaymentUserDataCollection", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnScamWarningContingency;", "getOnScamWarningContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Details {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection onPaymentUserDataCollection;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency;

        public Details(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection onPaymentUserDataCollection, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPaymentUserDataCollection = onPaymentUserDataCollection;
            this.onScamWarningContingency = onScamWarningContingency;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection getOnPaymentUserDataCollection() {
            return this.onPaymentUserDataCollection;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency getOnScamWarningContingency() {
            return this.onScamWarningContingency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection onPaymentUserDataCollection = this.onPaymentUserDataCollection;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency = this.onScamWarningContingency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Details(__typename=");
            sb.append(str);
            sb.append(", onPaymentUserDataCollection=");
            sb.append(onPaymentUserDataCollection);
            sb.append(", onScamWarningContingency=");
            sb.append(onScamWarningContingency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection onPaymentUserDataCollection = this.onPaymentUserDataCollection;
            int hashCode2 = onPaymentUserDataCollection == null ? 0 : onPaymentUserDataCollection.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency = this.onScamWarningContingency;
            return (((hashCode * 31) + hashCode2) * 31) + (onScamWarningContingency != null ? onScamWarningContingency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, details.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPaymentUserDataCollection, details.onPaymentUserDataCollection) && kotlin.jvm.internal.Intrinsics.areEqual(this.onScamWarningContingency, details.onScamWarningContingency);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection onPaymentUserDataCollection, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details(__typename, onPaymentUserDataCollection, onScamWarningContingency);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency getOnScamWarningContingency() {
            return this.onScamWarningContingency;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection getOnPaymentUserDataCollection() {
            return this.onPaymentUserDataCollection;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection onPaymentUserDataCollection, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = details.__typename;
            }
            if ((i & 2) != 0) {
                onPaymentUserDataCollection = details.onPaymentUserDataCollection;
            }
            if ((i & 4) != 0) {
                onScamWarningContingency = details.onScamWarningContingency;
            }
            return details.copy(str, onPaymentUserDataCollection, onScamWarningContingency);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnPaymentUserDataCollection;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentUserDataCollectionAttribute;", "requiredFields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnPaymentUserDataCollection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRequiredFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentUserDataCollection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute> requiredFields;

        /* JADX WARN: Multi-variable type inference failed */
        public OnPaymentUserDataCollection(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.requiredFields = list;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute> getRequiredFields() {
            return this.requiredFields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute> list = this.requiredFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentUserDataCollection(requiredFields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requiredFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection) && kotlin.jvm.internal.Intrinsics.areEqual(this.requiredFields, ((com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection) other).requiredFields);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute> requiredFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredFields, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection(requiredFields);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute> component1() {
            return this.requiredFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection onPaymentUserDataCollection, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onPaymentUserDataCollection.requiredFields;
            }
            return onPaymentUserDataCollection.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnScamWarningContingency;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentScamWarningType;", "riskLevel", "", "__typename", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentScamWarningType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentScamWarningType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentScamWarningType;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment$OnScamWarningContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentScamWarningType;", "getRiskLevel", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnScamWarningContingency {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType riskLevel;

        public OnScamWarningContingency(com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType paymentScamWarningType, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentScamWarningType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.riskLevel = paymentScamWarningType;
            this.__typename = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType getRiskLevel() {
            return this.riskLevel;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType paymentScamWarningType = this.riskLevel;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnScamWarningContingency(riskLevel=");
            sb.append(paymentScamWarningType);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.riskLevel.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency) other;
            return this.riskLevel == onScamWarningContingency.riskLevel && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onScamWarningContingency.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency copy(com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType riskLevel, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskLevel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency(riskLevel, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType getRiskLevel() {
            return this.riskLevel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency, com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType paymentScamWarningType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentScamWarningType = onScamWarningContingency.riskLevel;
            }
            if ((i & 2) != 0) {
                str = onScamWarningContingency.__typename;
            }
            return onScamWarningContingency.copy(paymentScamWarningType, str);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction = this.action;
        com.paypal.oslo.api.graphql.schema.type.ContingencyStatus contingencyStatus = this.status;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details = this.details;
        java.lang.String str = this.__typename;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentContingencyFragment(action=");
        sb.append(paymentContingencyAction);
        sb.append(", status=");
        sb.append(contingencyStatus);
        sb.append(", details=");
        sb.append(details);
        sb.append(", __typename=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode();
        int hashCode2 = this.status.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details = this.details;
        return (((((hashCode * 31) + hashCode2) * 31) + (details == null ? 0 : details.hashCode())) * 31) + this.__typename.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment paymentContingencyFragment = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment) other;
        return this.action == paymentContingencyFragment.action && this.status == paymentContingencyFragment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.details, paymentContingencyFragment.details) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentContingencyFragment.__typename);
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment copy(com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction action, com.paypal.oslo.api.graphql.schema.type.ContingencyStatus status, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details, java.lang.String __typename) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment(action, status, details, __typename);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details getDetails() {
        return this.details;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ContingencyStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction getAction() {
        return this.action;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment paymentContingencyFragment, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction, com.paypal.oslo.api.graphql.schema.type.ContingencyStatus contingencyStatus, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paymentContingencyAction = paymentContingencyFragment.action;
        }
        if ((i & 2) != 0) {
            contingencyStatus = paymentContingencyFragment.status;
        }
        if ((i & 4) != 0) {
            details = paymentContingencyFragment.details;
        }
        if ((i & 8) != 0) {
            str = paymentContingencyFragment.__typename;
        }
        return paymentContingencyFragment.copy(paymentContingencyAction, contingencyStatus, details, str);
    }
}
