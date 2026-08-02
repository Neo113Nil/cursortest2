package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/HelpTopicsInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "channel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "accountCategory", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;)Lcom/paypal/oslo/api/graphql/schema/type/HelpTopicsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "getChannel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "getAccountCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HelpTopicsInput {
    private final com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory;
    private final com.paypal.oslo.api.graphql.schema.type.HelpChannel channel;

    public HelpTopicsInput(com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        this.channel = helpChannel;
        this.accountCategory = accountCategory;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel = this.channel;
        com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory = this.accountCategory;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpTopicsInput(channel=");
        sb.append(helpChannel);
        sb.append(", accountCategory=");
        sb.append(accountCategory);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.channel.hashCode() * 31) + this.accountCategory.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.HelpTopicsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.HelpTopicsInput helpTopicsInput = (com.paypal.oslo.api.graphql.schema.type.HelpTopicsInput) other;
        return this.channel == helpTopicsInput.channel && this.accountCategory == helpTopicsInput.accountCategory;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpTopicsInput copy(com.paypal.oslo.api.graphql.schema.type.HelpChannel channel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        return new com.paypal.oslo.api.graphql.schema.type.HelpTopicsInput(channel, accountCategory);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.HelpTopicsInput copy$default(com.paypal.oslo.api.graphql.schema.type.HelpTopicsInput helpTopicsInput, com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            helpChannel = helpTopicsInput.channel;
        }
        if ((i & 2) != 0) {
            accountCategory = helpTopicsInput.accountCategory;
        }
        return helpTopicsInput.copy(helpChannel, accountCategory);
    }
}
