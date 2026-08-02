package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u00012BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011JZ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b1\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;", "type", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentFeature;", "allowedFeatures", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;", "status", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment$Card;", "card", "lastNChars", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment$Card;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment$Card;", "component6", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment$Card;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentType;", "getType", "Ljava/util/List;", "getAllowedFeatures", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentStatus;", "getStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment$Card;", "getCard", "getLastNChars", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RevolvingCreditInstrumentsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentFeature> allowedFeatures;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card;
    private final java.lang.Object id;
    private final java.lang.Object lastNChars;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus status;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType type;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditInstrumentsFragment(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentFeature> list, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditInstrumentType, "");
        this.id = obj;
        this.type = revolvingCreditInstrumentType;
        this.allowedFeatures = list;
        this.status = revolvingCreditInstrumentStatus;
        this.card = card;
        this.lastNChars = obj2;
    }

    public final java.lang.Object getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentFeature> getAllowedFeatures() {
        return this.allowedFeatures;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card getCard() {
        return this.card;
    }

    public final java.lang.Object getLastNChars() {
        return this.lastNChars;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment$Card;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentCardActivationStatus;", "activationStatus", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentCardActivationStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentCardActivationStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentCardActivationStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment$Card;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditInstrumentCardActivationStatus;", "getActivationStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus activationStatus;

        public Card(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus revolvingCreditInstrumentCardActivationStatus) {
            this.activationStatus = revolvingCreditInstrumentCardActivationStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus getActivationStatus() {
            return this.activationStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus revolvingCreditInstrumentCardActivationStatus = this.activationStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(activationStatus=");
            sb.append(revolvingCreditInstrumentCardActivationStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus revolvingCreditInstrumentCardActivationStatus = this.activationStatus;
            if (revolvingCreditInstrumentCardActivationStatus == null) {
                return 0;
            }
            return revolvingCreditInstrumentCardActivationStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card) && this.activationStatus == ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card) other).activationStatus;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus activationStatus) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card(activationStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus getActivationStatus() {
            return this.activationStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentCardActivationStatus revolvingCreditInstrumentCardActivationStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                revolvingCreditInstrumentCardActivationStatus = card.activationStatus;
            }
            return card.copy(revolvingCreditInstrumentCardActivationStatus);
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType = this.type;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentFeature> list = this.allowedFeatures;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus = this.status;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card = this.card;
        java.lang.Object obj2 = this.lastNChars;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditInstrumentsFragment(id=");
        sb.append(obj);
        sb.append(", type=");
        sb.append(revolvingCreditInstrumentType);
        sb.append(", allowedFeatures=");
        sb.append(list);
        sb.append(", status=");
        sb.append(revolvingCreditInstrumentStatus);
        sb.append(", card=");
        sb.append(card);
        sb.append(", lastNChars=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentFeature> list = this.allowedFeatures;
        int hashCode3 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus = this.status;
        int hashCode4 = revolvingCreditInstrumentStatus == null ? 0 : revolvingCreditInstrumentStatus.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card = this.card;
        int hashCode5 = card == null ? 0 : card.hashCode();
        java.lang.Object obj = this.lastNChars;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment revolvingCreditInstrumentsFragment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, revolvingCreditInstrumentsFragment.id) && this.type == revolvingCreditInstrumentsFragment.type && kotlin.jvm.internal.Intrinsics.areEqual(this.allowedFeatures, revolvingCreditInstrumentsFragment.allowedFeatures) && this.status == revolvingCreditInstrumentsFragment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.card, revolvingCreditInstrumentsFragment.card) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, revolvingCreditInstrumentsFragment.lastNChars);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment copy(java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType type, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentFeature> allowedFeatures, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus status, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card, java.lang.Object lastNChars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment(id, type, allowedFeatures, status, card, lastNChars);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Object getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card getCard() {
        return this.card;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus getStatus() {
        return this.status;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentFeature> component3() {
        return this.allowedFeatures;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment revolvingCreditInstrumentsFragment, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType, java.util.List list, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = revolvingCreditInstrumentsFragment.id;
        }
        if ((i & 2) != 0) {
            revolvingCreditInstrumentType = revolvingCreditInstrumentsFragment.type;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentType revolvingCreditInstrumentType2 = revolvingCreditInstrumentType;
        if ((i & 4) != 0) {
            list = revolvingCreditInstrumentsFragment.allowedFeatures;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            revolvingCreditInstrumentStatus = revolvingCreditInstrumentsFragment.status;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditInstrumentStatus revolvingCreditInstrumentStatus2 = revolvingCreditInstrumentStatus;
        if ((i & 16) != 0) {
            card = revolvingCreditInstrumentsFragment.card;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment.Card card2 = card;
        if ((i & 32) != 0) {
            obj2 = revolvingCreditInstrumentsFragment.lastNChars;
        }
        return revolvingCreditInstrumentsFragment.copy(obj, revolvingCreditInstrumentType2, list2, revolvingCreditInstrumentStatus2, card2, obj2);
    }
}
