package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\"#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b!\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceID;", "id", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationChannel;", "channels", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Attribute;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceID;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceID;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceID;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceID;", "getId", "Ljava/util/List;", "getChannels", "getAttributes", "Attribute", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RevolvingCreditNotificationPreferencesFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute> attributes;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> channels;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID id;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditNotificationPreferencesFragment(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID revolvingCreditNotificationPreferenceID, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditNotificationPreferenceID, "");
        this.id = revolvingCreditNotificationPreferenceID;
        this.channels = list;
        this.attributes = list2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID getId() {
        return this.id;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> getChannels() {
        return this.channels;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute> getAttributes() {
        return this.attributes;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Attribute;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;", "name", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Amount;", "amount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Amount;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Amount;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Amount;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Attribute;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;", "getName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Attribute {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount amount;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName name;

        public Attribute(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName revolvingCreditNotificationPreferenceAttributeName, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditNotificationPreferenceAttributeName, "");
            this.name = revolvingCreditNotificationPreferenceAttributeName;
            this.amount = amount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName revolvingCreditNotificationPreferenceAttributeName = this.name;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attribute(name=");
            sb.append(revolvingCreditNotificationPreferenceAttributeName);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount amount = this.amount;
            return (hashCode * 31) + (amount == null ? 0 : amount.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute attribute = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute) other;
            return this.name == attribute.name && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, attribute.amount);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName name2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute(name2, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute attribute, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName revolvingCreditNotificationPreferenceAttributeName, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                revolvingCreditNotificationPreferenceAttributeName = attribute.name;
            }
            if ((i & 2) != 0) {
                amount = attribute.amount;
            }
            return attribute.copy(revolvingCreditNotificationPreferenceAttributeName, amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "revolvingCreditMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "getRevolvingCreditMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            this.__typename = str;
            this.revolvingCreditMoneyFragment = revolvingCreditMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment = this.revolvingCreditMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditMoneyFragment=");
            sb.append(revolvingCreditMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount amount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditMoneyFragment, amount.revolvingCreditMoneyFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount(__typename, revolvingCreditMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditMoneyFragment = amount.revolvingCreditMoneyFragment;
            }
            return amount.copy(str, revolvingCreditMoneyFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID revolvingCreditNotificationPreferenceID = this.id;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> list = this.channels;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute> list2 = this.attributes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditNotificationPreferencesFragment(id=");
        sb.append(revolvingCreditNotificationPreferenceID);
        sb.append(", channels=");
        sb.append(list);
        sb.append(", attributes=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> list = this.channels;
        int hashCode2 = list == null ? 0 : list.hashCode();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute> list2 = this.attributes;
        return (((hashCode * 31) + hashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment) other;
        return this.id == revolvingCreditNotificationPreferencesFragment.id && kotlin.jvm.internal.Intrinsics.areEqual(this.channels, revolvingCreditNotificationPreferencesFragment.channels) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, revolvingCreditNotificationPreferencesFragment.attributes);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID id, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> channels, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment(id, channels, attributes);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment.Attribute> component3() {
        return this.attributes;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> component2() {
        return this.channels;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID revolvingCreditNotificationPreferenceID, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditNotificationPreferenceID = revolvingCreditNotificationPreferencesFragment.id;
        }
        if ((i & 2) != 0) {
            list = revolvingCreditNotificationPreferencesFragment.channels;
        }
        if ((i & 4) != 0) {
            list2 = revolvingCreditNotificationPreferencesFragment.attributes;
        }
        return revolvingCreditNotificationPreferencesFragment.copy(revolvingCreditNotificationPreferenceID, list, list2);
    }
}
