package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RemoveProviderConsentWithDataInput;", "", "", "consentId", "provider", "", "deleteImportedData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/api/graphql/schema/type/RemoveProviderConsentWithDataInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConsentId", "getProvider", "Z", "getDeleteImportedData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RemoveProviderConsentWithDataInput {
    private final java.lang.String consentId;
    private final boolean deleteImportedData;
    private final java.lang.String provider;

    public RemoveProviderConsentWithDataInput(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.consentId = str;
        this.provider = str2;
        this.deleteImportedData = z;
    }

    public final java.lang.String getConsentId() {
        return this.consentId;
    }

    public final java.lang.String getProvider() {
        return this.provider;
    }

    public final boolean getDeleteImportedData() {
        return this.deleteImportedData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.consentId;
        java.lang.String str2 = this.provider;
        boolean z = this.deleteImportedData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveProviderConsentWithDataInput(consentId=");
        sb.append(str);
        sb.append(", provider=");
        sb.append(str2);
        sb.append(", deleteImportedData=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.consentId.hashCode() * 31) + this.provider.hashCode()) * 31) + java.lang.Boolean.hashCode(this.deleteImportedData);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput removeProviderConsentWithDataInput = (com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.consentId, removeProviderConsentWithDataInput.consentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.provider, removeProviderConsentWithDataInput.provider) && this.deleteImportedData == removeProviderConsentWithDataInput.deleteImportedData;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput copy(java.lang.String consentId, java.lang.String provider, boolean deleteImportedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return new com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput(consentId, provider, deleteImportedData);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDeleteImportedData() {
        return this.deleteImportedData;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProvider() {
        return this.provider;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getConsentId() {
        return this.consentId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput copy$default(com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput removeProviderConsentWithDataInput, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = removeProviderConsentWithDataInput.consentId;
        }
        if ((i & 2) != 0) {
            str2 = removeProviderConsentWithDataInput.provider;
        }
        if ((i & 4) != 0) {
            z = removeProviderConsentWithDataInput.deleteImportedData;
        }
        return removeProviderConsentWithDataInput.copy(str, str2, z);
    }
}
