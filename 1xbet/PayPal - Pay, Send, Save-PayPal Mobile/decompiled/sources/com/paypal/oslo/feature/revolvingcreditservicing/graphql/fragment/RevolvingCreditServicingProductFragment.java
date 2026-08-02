package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u0002BCBg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0082\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b=\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010$R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductTier;", "tier", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;", "cardNetwork", "", "cardDisplayName", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;", "tokenServiceProvider", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;", "cardDisplayLogo", "", "locale", "currencyCode", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "capabilities", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductValueProposition;", "valuePropositions", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductTier;Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductTier;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;", "component6", "()Ljava/lang/Object;", "component7", "component8", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "component9", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductTier;Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductTier;", "getTier", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;", "getCardNetwork", "Ljava/lang/String;", "getCardDisplayName", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;", "getTokenServiceProvider", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;", "getCardDisplayLogo", "Ljava/lang/Object;", "getLocale", "getCurrencyCode", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "getCapabilities", "Ljava/util/List;", "getValuePropositions", "CardDisplayLogo", "Capabilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RevolvingCreditServicingProductFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo;
    private final java.lang.String cardDisplayName;
    private final com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork cardNetwork;
    private final java.lang.Object currencyCode;
    private final java.lang.Object locale;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier tier;
    private final com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider tokenServiceProvider;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> valuePropositions;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditServicingProductFragment(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier revolvingCreditProductTier, com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider issuanceNetworkTokenServiceProvider, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> list) {
        this.tier = revolvingCreditProductTier;
        this.cardNetwork = issuanceCardNetwork;
        this.cardDisplayName = str;
        this.tokenServiceProvider = issuanceNetworkTokenServiceProvider;
        this.cardDisplayLogo = cardDisplayLogo;
        this.locale = obj;
        this.currencyCode = obj2;
        this.capabilities = capabilities;
        this.valuePropositions = list;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier getTier() {
        return this.tier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork getCardNetwork() {
        return this.cardNetwork;
    }

    public final java.lang.String getCardDisplayName() {
        return this.cardDisplayName;
    }

    public final com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo getCardDisplayLogo() {
        return this.cardDisplayLogo;
    }

    public final java.lang.Object getLocale() {
        return this.locale;
    }

    public final java.lang.Object getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities getCapabilities() {
        return this.capabilities;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> getValuePropositions() {
        return this.valuePropositions;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "revolvingCreditImageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "getRevolvingCreditImageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardDisplayLogo {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;

        public CardDisplayLogo(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            this.__typename = str;
            this.revolvingCreditImageFragment = revolvingCreditImageFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment = this.revolvingCreditImageFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDisplayLogo(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditImageFragment=");
            sb.append(revolvingCreditImageFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditImageFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardDisplayLogo.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditImageFragment, cardDisplayLogo.revolvingCreditImageFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo(__typename, revolvingCreditImageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardDisplayLogo.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditImageFragment = cardDisplayLogo.revolvingCreditImageFragment;
            }
            return cardDisplayLogo.copy(str, revolvingCreditImageFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJF\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingCardCapability;", "card", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingLineCapability;", "creditLine", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentCapability;", "payment", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCard", "getCreditLine", "getPayment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Capabilities {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability> card;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability> creditLine;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> payment;

        /* JADX WARN: Multi-variable type inference failed */
        public Capabilities(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability> list, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability> list2, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> list3) {
            this.card = list;
            this.creditLine = list2;
            this.payment = list3;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability> getCard() {
            return this.card;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability> getCreditLine() {
            return this.creditLine;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> getPayment() {
            return this.payment;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability> list = this.card;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability> list2 = this.creditLine;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> list3 = this.payment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Capabilities(card=");
            sb.append(list);
            sb.append(", creditLine=");
            sb.append(list2);
            sb.append(", payment=");
            sb.append(list3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability> list = this.card;
            int hashCode = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability> list2 = this.creditLine;
            int hashCode2 = list2 == null ? 0 : list2.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> list3 = this.payment;
            return (((hashCode * 31) + hashCode2) * 31) + (list3 != null ? list3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.card, capabilities.card) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditLine, capabilities.creditLine) && kotlin.jvm.internal.Intrinsics.areEqual(this.payment, capabilities.payment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability> card, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability> creditLine, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> payment) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities(card, creditLine, payment);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> component3() {
            return this.payment;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingLineCapability> component2() {
            return this.creditLine;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingCardCapability> component1() {
            return this.card;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = capabilities.card;
            }
            if ((i & 2) != 0) {
                list2 = capabilities.creditLine;
            }
            if ((i & 4) != 0) {
                list3 = capabilities.payment;
            }
            return capabilities.copy(list, list2, list3);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier revolvingCreditProductTier = this.tier;
        com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork = this.cardNetwork;
        java.lang.String str = this.cardDisplayName;
        com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider issuanceNetworkTokenServiceProvider = this.tokenServiceProvider;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo = this.cardDisplayLogo;
        java.lang.Object obj = this.locale;
        java.lang.Object obj2 = this.currencyCode;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities = this.capabilities;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> list = this.valuePropositions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingProductFragment(tier=");
        sb.append(revolvingCreditProductTier);
        sb.append(", cardNetwork=");
        sb.append(issuanceCardNetwork);
        sb.append(", cardDisplayName=");
        sb.append(str);
        sb.append(", tokenServiceProvider=");
        sb.append(issuanceNetworkTokenServiceProvider);
        sb.append(", cardDisplayLogo=");
        sb.append(cardDisplayLogo);
        sb.append(", locale=");
        sb.append(obj);
        sb.append(", currencyCode=");
        sb.append(obj2);
        sb.append(", capabilities=");
        sb.append(capabilities);
        sb.append(", valuePropositions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier revolvingCreditProductTier = this.tier;
        int hashCode = revolvingCreditProductTier == null ? 0 : revolvingCreditProductTier.hashCode();
        com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork = this.cardNetwork;
        int hashCode2 = issuanceCardNetwork == null ? 0 : issuanceCardNetwork.hashCode();
        java.lang.String str = this.cardDisplayName;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider issuanceNetworkTokenServiceProvider = this.tokenServiceProvider;
        int hashCode4 = issuanceNetworkTokenServiceProvider == null ? 0 : issuanceNetworkTokenServiceProvider.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo = this.cardDisplayLogo;
        int hashCode5 = cardDisplayLogo == null ? 0 : cardDisplayLogo.hashCode();
        java.lang.Object obj = this.locale;
        int hashCode6 = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.currencyCode;
        int hashCode7 = obj2 == null ? 0 : obj2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities = this.capabilities;
        int hashCode8 = capabilities == null ? 0 : capabilities.hashCode();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> list = this.valuePropositions;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment) other;
        return this.tier == revolvingCreditServicingProductFragment.tier && this.cardNetwork == revolvingCreditServicingProductFragment.cardNetwork && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDisplayName, revolvingCreditServicingProductFragment.cardDisplayName) && this.tokenServiceProvider == revolvingCreditServicingProductFragment.tokenServiceProvider && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDisplayLogo, revolvingCreditServicingProductFragment.cardDisplayLogo) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, revolvingCreditServicingProductFragment.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, revolvingCreditServicingProductFragment.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, revolvingCreditServicingProductFragment.capabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.valuePropositions, revolvingCreditServicingProductFragment.valuePropositions);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier tier, com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork cardNetwork, java.lang.String cardDisplayName, com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider tokenServiceProvider, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo, java.lang.Object locale, java.lang.Object currencyCode, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> valuePropositions) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment(tier, cardNetwork, cardDisplayName, tokenServiceProvider, cardDisplayLogo, locale, currencyCode, capabilities, valuePropositions);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> component9() {
        return this.valuePropositions;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities getCapabilities() {
        return this.capabilities;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Object getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Object getLocale() {
        return this.locale;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo getCardDisplayLogo() {
        return this.cardDisplayLogo;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardDisplayName() {
        return this.cardDisplayName;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork getCardNetwork() {
        return this.cardNetwork;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier getTier() {
        return this.tier;
    }
}
