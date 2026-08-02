package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InProductSupportHelpArticlesInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "channel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "accountCategory", "", "productReferenceId", "pageReferenceId", "fieldReferenceId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InProductSupportHelpArticlesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "getChannel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "getAccountCategory", "Ljava/lang/String;", "getProductReferenceId", "getPageReferenceId", "getFieldReferenceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InProductSupportHelpArticlesInput {
    private final com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory;
    private final com.paypal.oslo.api.graphql.schema.type.HelpChannel channel;
    private final java.lang.String fieldReferenceId;
    private final java.lang.String pageReferenceId;
    private final java.lang.String productReferenceId;

    public InProductSupportHelpArticlesInput(com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.channel = helpChannel;
        this.accountCategory = accountCategory;
        this.productReferenceId = str;
        this.pageReferenceId = str2;
        this.fieldReferenceId = str3;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    public final java.lang.String getProductReferenceId() {
        return this.productReferenceId;
    }

    public final java.lang.String getPageReferenceId() {
        return this.pageReferenceId;
    }

    public final java.lang.String getFieldReferenceId() {
        return this.fieldReferenceId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel = this.channel;
        com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory = this.accountCategory;
        java.lang.String str = this.productReferenceId;
        java.lang.String str2 = this.pageReferenceId;
        java.lang.String str3 = this.fieldReferenceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InProductSupportHelpArticlesInput(channel=");
        sb.append(helpChannel);
        sb.append(", accountCategory=");
        sb.append(accountCategory);
        sb.append(", productReferenceId=");
        sb.append(str);
        sb.append(", pageReferenceId=");
        sb.append(str2);
        sb.append(", fieldReferenceId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.channel.hashCode() * 31) + this.accountCategory.hashCode()) * 31) + this.productReferenceId.hashCode()) * 31) + this.pageReferenceId.hashCode()) * 31) + this.fieldReferenceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput inProductSupportHelpArticlesInput = (com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput) other;
        return this.channel == inProductSupportHelpArticlesInput.channel && this.accountCategory == inProductSupportHelpArticlesInput.accountCategory && kotlin.jvm.internal.Intrinsics.areEqual(this.productReferenceId, inProductSupportHelpArticlesInput.productReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.pageReferenceId, inProductSupportHelpArticlesInput.pageReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fieldReferenceId, inProductSupportHelpArticlesInput.fieldReferenceId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput copy(com.paypal.oslo.api.graphql.schema.type.HelpChannel channel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, java.lang.String productReferenceId, java.lang.String pageReferenceId, java.lang.String fieldReferenceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldReferenceId, "");
        return new com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput(channel, accountCategory, productReferenceId, pageReferenceId, fieldReferenceId);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFieldReferenceId() {
        return this.fieldReferenceId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPageReferenceId() {
        return this.pageReferenceId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getProductReferenceId() {
        return this.productReferenceId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput copy$default(com.paypal.oslo.api.graphql.schema.type.InProductSupportHelpArticlesInput inProductSupportHelpArticlesInput, com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            helpChannel = inProductSupportHelpArticlesInput.channel;
        }
        if ((i & 2) != 0) {
            accountCategory = inProductSupportHelpArticlesInput.accountCategory;
        }
        com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory2 = accountCategory;
        if ((i & 4) != 0) {
            str = inProductSupportHelpArticlesInput.productReferenceId;
        }
        java.lang.String str4 = str;
        if ((i & 8) != 0) {
            str2 = inProductSupportHelpArticlesInput.pageReferenceId;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = inProductSupportHelpArticlesInput.fieldReferenceId;
        }
        return inProductSupportHelpArticlesInput.copy(helpChannel, accountCategory2, str4, str5, str3);
    }
}
