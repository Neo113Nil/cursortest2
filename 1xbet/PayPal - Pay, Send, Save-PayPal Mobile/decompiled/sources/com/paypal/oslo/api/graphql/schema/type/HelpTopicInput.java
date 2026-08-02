package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/HelpTopicInput;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "channel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "accountCategory", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;)Lcom/paypal/oslo/api/graphql/schema/type/HelpTopicInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "getChannel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "getAccountCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HelpTopicInput {
    private final com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory;
    private final com.paypal.oslo.api.graphql.schema.type.HelpChannel channel;
    private final java.lang.String id;

    public HelpTopicInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        this.id = str;
        this.channel = helpChannel;
        this.accountCategory = accountCategory;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel = this.channel;
        com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory = this.accountCategory;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpTopicInput(id=");
        sb.append(str);
        sb.append(", channel=");
        sb.append(helpChannel);
        sb.append(", accountCategory=");
        sb.append(accountCategory);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.channel.hashCode()) * 31) + this.accountCategory.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.HelpTopicInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.HelpTopicInput helpTopicInput = (com.paypal.oslo.api.graphql.schema.type.HelpTopicInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, helpTopicInput.id) && this.channel == helpTopicInput.channel && this.accountCategory == helpTopicInput.accountCategory;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpTopicInput copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.HelpChannel channel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        return new com.paypal.oslo.api.graphql.schema.type.HelpTopicInput(id, channel, accountCategory);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.HelpTopicInput copy$default(com.paypal.oslo.api.graphql.schema.type.HelpTopicInput helpTopicInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = helpTopicInput.id;
        }
        if ((i & 2) != 0) {
            helpChannel = helpTopicInput.channel;
        }
        if ((i & 4) != 0) {
            accountCategory = helpTopicInput.accountCategory;
        }
        return helpTopicInput.copy(str, helpChannel, accountCategory);
    }
}
