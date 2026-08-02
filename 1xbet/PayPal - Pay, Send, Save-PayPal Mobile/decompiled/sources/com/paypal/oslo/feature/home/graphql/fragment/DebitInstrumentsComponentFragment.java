package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Wallet;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Wallet;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Wallet;)Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Wallet;", "getWallet", "Wallet", "DebitInstrument", "SmallImage", "Front"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DebitInstrumentsComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet;

    public DebitInstrumentsComponentFragment(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.wallet = wallet;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Wallet;", "", "", "__typename", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$DebitInstrument;", "debitInstruments", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/util/List;", "getDebitInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> debitInstruments;

        public Wallet(java.lang.String str, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.debitInstruments = list;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> getDebitInstruments() {
            return this.debitInstruments;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> list = this.debitInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(__typename=");
            sb.append(str);
            sb.append(", debitInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> list = this.debitInstruments;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet = (com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, wallet.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstruments, wallet.debitInstruments);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet copy(java.lang.String __typename, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet(__typename, debitInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> component2() {
            return this.debitInstruments;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet copy$default(com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.__typename;
            }
            if ((i & 2) != 0) {
                list = wallet.debitInstruments;
            }
            return wallet.copy(str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$DebitInstrument;", "", "", "__typename", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "displayState", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$SmallImage;", "smallImage", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$SmallImage;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "component4", "()Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$SmallImage;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$SmallImage;)Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$DebitInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "getDisplayState", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$SmallImage;", "getSmallImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState displayState;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;
        private final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage;

        public DebitInstrument(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.productName = debitInstrumentProductName;
            this.displayState = debitInstrumentDisplayState;
            this.smallImage = smallImage;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState getDisplayState() {
            return this.displayState;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage getSmallImage() {
            return this.smallImage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState = this.displayState;
            com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage = this.smallImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrument(__typename=");
            sb.append(str);
            sb.append(", productName=");
            sb.append(debitInstrumentProductName);
            sb.append(", displayState=");
            sb.append(debitInstrumentDisplayState);
            sb.append(", smallImage=");
            sb.append(smallImage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            int hashCode2 = debitInstrumentProductName == null ? 0 : debitInstrumentProductName.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState = this.displayState;
            int hashCode3 = debitInstrumentDisplayState == null ? 0 : debitInstrumentDisplayState.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage = this.smallImage;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (smallImage != null ? smallImage.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument debitInstrument = (com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, debitInstrument.__typename) && this.productName == debitInstrument.productName && this.displayState == debitInstrument.displayState && kotlin.jvm.internal.Intrinsics.areEqual(this.smallImage, debitInstrument.smallImage);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument copy(java.lang.String __typename, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState displayState, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument(__typename, productName, displayState, smallImage);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage getSmallImage() {
            return this.smallImage;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState getDisplayState() {
            return this.displayState;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument copy$default(com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument debitInstrument, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = debitInstrument.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentProductName = debitInstrument.productName;
            }
            if ((i & 4) != 0) {
                debitInstrumentDisplayState = debitInstrument.displayState;
            }
            if ((i & 8) != 0) {
                smallImage = debitInstrument.smallImage;
            }
            return debitInstrument.copy(str, debitInstrumentProductName, debitInstrumentDisplayState, smallImage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$SmallImage;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Front;", "front", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Front;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Front;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Front;)Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$SmallImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Front;", "getFront"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SmallImage {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front front;

        public SmallImage(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front front) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front, "");
            this.__typename = str;
            this.front = front;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front getFront() {
            return this.front;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front front = this.front;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SmallImage(__typename=");
            sb.append(str);
            sb.append(", front=");
            sb.append(front);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.front.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage = (com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, smallImage.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.front, smallImage.front);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front front) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage(__typename, front);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front getFront() {
            return this.front;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage copy$default(com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front front, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = smallImage.__typename;
            }
            if ((i & 2) != 0) {
                front = smallImage.front;
            }
            return smallImage.copy(str, front);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Front;", "", "", "__typename", "referenceUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$Front;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/lang/Object;", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Front {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object referenceUrl;

        public Front(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.__typename = str;
            this.referenceUrl = obj;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.Object obj = this.referenceUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Front(__typename=");
            sb.append(str);
            sb.append(", referenceUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.referenceUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front front = (com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, front.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, front.referenceUrl);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front copy(java.lang.String __typename, java.lang.Object referenceUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front(__typename, referenceUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front copy$default(com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front front, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = front.__typename;
            }
            if ((i & 2) != 0) {
                obj = front.referenceUrl;
            }
            return front.copy(str, obj);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet = this.wallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentsComponentFragment(__typename=");
        sb.append(str);
        sb.append(", wallet=");
        sb.append(wallet);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet = this.wallet;
        return (hashCode * 31) + (wallet == null ? 0 : wallet.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment debitInstrumentsComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, debitInstrumentsComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, debitInstrumentsComponentFragment.wallet);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment(__typename, wallet);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment debitInstrumentsComponentFragment, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitInstrumentsComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            wallet = debitInstrumentsComponentFragment.wallet;
        }
        return debitInstrumentsComponentFragment.copy(str, wallet);
    }
}
