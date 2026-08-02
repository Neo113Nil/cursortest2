package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeleteAuthConsentInput;", "", "", "consentId", "appName", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;)Lcom/paypal/oslo/api/graphql/schema/type/DeleteAuthConsentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConsentId", "getAppName", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "getCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeleteAuthConsentInput {
    private final java.lang.String appName;
    private final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory category;
    private final java.lang.String consentId;

    public DeleteAuthConsentInput(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsAndSitesCategory, "");
        this.consentId = str;
        this.appName = str2;
        this.category = connectedAppsAndSitesCategory;
    }

    public final java.lang.String getConsentId() {
        return this.consentId;
    }

    public final java.lang.String getAppName() {
        return this.appName;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory getCategory() {
        return this.category;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.consentId;
        java.lang.String str2 = this.appName;
        com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory = this.category;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteAuthConsentInput(consentId=");
        sb.append(str);
        sb.append(", appName=");
        sb.append(str2);
        sb.append(", category=");
        sb.append(connectedAppsAndSitesCategory);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.consentId.hashCode() * 31) + this.appName.hashCode()) * 31) + this.category.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput deleteAuthConsentInput = (com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.consentId, deleteAuthConsentInput.consentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.appName, deleteAuthConsentInput.appName) && this.category == deleteAuthConsentInput.category;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput copy(java.lang.String consentId, java.lang.String appName, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory category) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput(consentId, appName, category);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory getCategory() {
        return this.category;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAppName() {
        return this.appName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getConsentId() {
        return this.consentId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput copy$default(com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput deleteAuthConsentInput, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deleteAuthConsentInput.consentId;
        }
        if ((i & 2) != 0) {
            str2 = deleteAuthConsentInput.appName;
        }
        if ((i & 4) != 0) {
            connectedAppsAndSitesCategory = deleteAuthConsentInput.category;
        }
        return deleteAuthConsentInput.copy(str, str2, connectedAppsAndSitesCategory);
    }
}
