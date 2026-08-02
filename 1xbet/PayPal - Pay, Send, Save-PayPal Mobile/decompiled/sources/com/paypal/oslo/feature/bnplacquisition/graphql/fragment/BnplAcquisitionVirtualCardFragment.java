package com.paypal.oslo.feature.bnplacquisition.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ:\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment$CardArt;", "cardArt", "", "createTime", "expirationDuration", "lastNChars", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment$CardArt;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment$CardArt;", "component2", "()Ljava/lang/Object;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment$CardArt;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment$CardArt;", "getCardArt", "Ljava/lang/Object;", "getCreateTime", "getExpirationDuration", "getLastNChars", "CardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplAcquisitionVirtualCardFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt;
    private final java.lang.Object createTime;
    private final java.lang.Object expirationDuration;
    private final java.lang.Object lastNChars;

    public BnplAcquisitionVirtualCardFragment(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "");
        this.cardArt = cardArt;
        this.createTime = obj;
        this.expirationDuration = obj2;
        this.lastNChars = obj3;
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt getCardArt() {
        return this.cardArt;
    }

    public final java.lang.Object getCreateTime() {
        return this.createTime;
    }

    public final java.lang.Object getExpirationDuration() {
        return this.expirationDuration;
    }

    public final java.lang.Object getLastNChars() {
        return this.lastNChars;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment$CardArt;", "", "url", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment$CardArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardArt {
        public static final int $stable = 8;
        private final java.lang.Object url;

        public CardArt(java.lang.Object obj) {
            this.url = obj;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt(url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt) other).url);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt copy(java.lang.Object url) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = cardArt.url;
            }
            return cardArt.copy(obj);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt = this.cardArt;
        java.lang.Object obj = this.createTime;
        java.lang.Object obj2 = this.expirationDuration;
        java.lang.Object obj3 = this.lastNChars;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplAcquisitionVirtualCardFragment(cardArt=");
        sb.append(cardArt);
        sb.append(", createTime=");
        sb.append(obj);
        sb.append(", expirationDuration=");
        sb.append(obj2);
        sb.append(", lastNChars=");
        sb.append(obj3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt = this.cardArt;
        return ((((((cardArt == null ? 0 : cardArt.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.expirationDuration.hashCode()) * 31) + this.lastNChars.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, bnplAcquisitionVirtualCardFragment.cardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, bnplAcquisitionVirtualCardFragment.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDuration, bnplAcquisitionVirtualCardFragment.expirationDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bnplAcquisitionVirtualCardFragment.lastNChars);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment copy(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt, java.lang.Object createTime, java.lang.Object expirationDuration, java.lang.Object lastNChars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment(cardArt, createTime, expirationDuration, lastNChars);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Object getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getExpirationDuration() {
        return this.expirationDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt getCardArt() {
        return this.cardArt;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, java.lang.Object obj4) {
        if ((i & 1) != 0) {
            cardArt = bnplAcquisitionVirtualCardFragment.cardArt;
        }
        if ((i & 2) != 0) {
            obj = bnplAcquisitionVirtualCardFragment.createTime;
        }
        if ((i & 4) != 0) {
            obj2 = bnplAcquisitionVirtualCardFragment.expirationDuration;
        }
        if ((i & 8) != 0) {
            obj3 = bnplAcquisitionVirtualCardFragment.lastNChars;
        }
        return bnplAcquisitionVirtualCardFragment.copy(cardArt, obj, obj2, obj3);
    }
}
