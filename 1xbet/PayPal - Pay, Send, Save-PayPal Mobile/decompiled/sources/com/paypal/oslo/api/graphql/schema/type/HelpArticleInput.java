package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/HelpArticleInput;", "", "", "articleId", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "channel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "accountCategory", "", "trackCustomerIntent", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;Z)Lcom/paypal/oslo/api/graphql/schema/type/HelpArticleInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getArticleId", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "getChannel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "getAccountCategory", "Z", "getTrackCustomerIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HelpArticleInput {
    private final com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory;
    private final java.lang.String articleId;
    private final com.paypal.oslo.api.graphql.schema.type.HelpChannel channel;
    private final boolean trackCustomerIntent;

    public HelpArticleInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        this.articleId = str;
        this.channel = helpChannel;
        this.accountCategory = accountCategory;
        this.trackCustomerIntent = z;
    }

    public final java.lang.String getArticleId() {
        return this.articleId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    public final boolean getTrackCustomerIntent() {
        return this.trackCustomerIntent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.articleId;
        com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel = this.channel;
        com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory = this.accountCategory;
        boolean z = this.trackCustomerIntent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpArticleInput(articleId=");
        sb.append(str);
        sb.append(", channel=");
        sb.append(helpChannel);
        sb.append(", accountCategory=");
        sb.append(accountCategory);
        sb.append(", trackCustomerIntent=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.articleId.hashCode() * 31) + this.channel.hashCode()) * 31) + this.accountCategory.hashCode()) * 31) + java.lang.Boolean.hashCode(this.trackCustomerIntent);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.HelpArticleInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.HelpArticleInput helpArticleInput = (com.paypal.oslo.api.graphql.schema.type.HelpArticleInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.articleId, helpArticleInput.articleId) && this.channel == helpArticleInput.channel && this.accountCategory == helpArticleInput.accountCategory && this.trackCustomerIntent == helpArticleInput.trackCustomerIntent;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpArticleInput copy(java.lang.String articleId, com.paypal.oslo.api.graphql.schema.type.HelpChannel channel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, boolean trackCustomerIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(articleId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        return new com.paypal.oslo.api.graphql.schema.type.HelpArticleInput(articleId, channel, accountCategory, trackCustomerIntent);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getTrackCustomerIntent() {
        return this.trackCustomerIntent;
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
    public final java.lang.String getArticleId() {
        return this.articleId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.HelpArticleInput copy$default(com.paypal.oslo.api.graphql.schema.type.HelpArticleInput helpArticleInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = helpArticleInput.articleId;
        }
        if ((i & 2) != 0) {
            helpChannel = helpArticleInput.channel;
        }
        if ((i & 4) != 0) {
            accountCategory = helpArticleInput.accountCategory;
        }
        if ((i & 8) != 0) {
            z = helpArticleInput.trackCustomerIntent;
        }
        return helpArticleInput.copy(str, helpChannel, accountCategory, z);
    }
}
