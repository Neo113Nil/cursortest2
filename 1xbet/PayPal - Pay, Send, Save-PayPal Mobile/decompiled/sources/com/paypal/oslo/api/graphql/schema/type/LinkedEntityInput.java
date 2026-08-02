package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/LinkedEntityInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "tenant", "", "externalId", "", "formats", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/LinkedEntityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "getTenant", "Ljava/lang/String;", "getExternalId", "Ljava/util/List;", "getFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LinkedEntityInput {
    private final java.lang.String externalId;
    private final java.util.List<java.lang.Object> formats;
    private final com.paypal.oslo.api.graphql.schema.type.DSRDomain tenant;

    public LinkedEntityInput(com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain, java.lang.String str, java.util.List<? extends java.lang.Object> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dSRDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.tenant = dSRDomain;
        this.externalId = str;
        this.formats = list;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DSRDomain getTenant() {
        return this.tenant;
    }

    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public final java.util.List<java.lang.Object> getFormats() {
        return this.formats;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain = this.tenant;
        java.lang.String str = this.externalId;
        java.util.List<java.lang.Object> list = this.formats;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedEntityInput(tenant=");
        sb.append(dSRDomain);
        sb.append(", externalId=");
        sb.append(str);
        sb.append(", formats=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.tenant.hashCode() * 31) + this.externalId.hashCode()) * 31) + this.formats.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.LinkedEntityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.LinkedEntityInput linkedEntityInput = (com.paypal.oslo.api.graphql.schema.type.LinkedEntityInput) other;
        return this.tenant == linkedEntityInput.tenant && kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, linkedEntityInput.externalId) && kotlin.jvm.internal.Intrinsics.areEqual(this.formats, linkedEntityInput.formats);
    }

    public final com.paypal.oslo.api.graphql.schema.type.LinkedEntityInput copy(com.paypal.oslo.api.graphql.schema.type.DSRDomain tenant, java.lang.String externalId, java.util.List<? extends java.lang.Object> formats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formats, "");
        return new com.paypal.oslo.api.graphql.schema.type.LinkedEntityInput(tenant, externalId, formats);
    }

    public final java.util.List<java.lang.Object> component3() {
        return this.formats;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DSRDomain getTenant() {
        return this.tenant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.LinkedEntityInput copy$default(com.paypal.oslo.api.graphql.schema.type.LinkedEntityInput linkedEntityInput, com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dSRDomain = linkedEntityInput.tenant;
        }
        if ((i & 2) != 0) {
            str = linkedEntityInput.externalId;
        }
        if ((i & 4) != 0) {
            list = linkedEntityInput.formats;
        }
        return linkedEntityInput.copy(dSRDomain, str, list);
    }
}
