package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ItemInput;", "", "", "item", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ItemInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getItem", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ItemInput {
    private final java.lang.String fields;
    private final java.lang.String item;

    public ItemInput(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.item = str;
        this.fields = str2;
    }

    public final java.lang.String getItem() {
        return this.item;
    }

    public final java.lang.String getFields() {
        return this.fields;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.item;
        java.lang.String str2 = this.fields;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ItemInput(item=");
        sb.append(str);
        sb.append(", fields=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.item.hashCode() * 31) + this.fields.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ItemInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ItemInput itemInput = (com.paypal.oslo.api.graphql.schema.type.ItemInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.item, itemInput.item) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, itemInput.fields);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ItemInput copy(java.lang.String item, java.lang.String fields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
        return new com.paypal.oslo.api.graphql.schema.type.ItemInput(item, fields);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFields() {
        return this.fields;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getItem() {
        return this.item;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ItemInput copy$default(com.paypal.oslo.api.graphql.schema.type.ItemInput itemInput, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = itemInput.item;
        }
        if ((i & 2) != 0) {
            str2 = itemInput.fields;
        }
        return itemInput.copy(str, str2);
    }
}
