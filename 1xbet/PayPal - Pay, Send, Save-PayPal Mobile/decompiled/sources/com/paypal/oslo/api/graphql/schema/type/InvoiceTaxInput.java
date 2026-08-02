package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceTaxInput;", "", "", "name", "percent", "Lcom/apollographql/apollo/api/Optional;", "taxNote", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceTaxInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getPercent", "Lcom/apollographql/apollo/api/Optional;", "getTaxNote"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InvoiceTaxInput {
    private final java.lang.String name;
    private final java.lang.Object percent;
    private final com.apollographql.apollo.api.Optional<java.lang.String> taxNote;

    public InvoiceTaxInput(java.lang.String str, java.lang.Object obj, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.name = str;
        this.percent = obj;
        this.taxNote = optional;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.Object getPercent() {
        return this.percent;
    }

    public /* synthetic */ InvoiceTaxInput(java.lang.String str, java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getTaxNote() {
        return this.taxNote;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.Object obj = this.percent;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.taxNote;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceTaxInput(name=");
        sb.append(str);
        sb.append(", percent=");
        sb.append(obj);
        sb.append(", taxNote=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + this.percent.hashCode()) * 31) + this.taxNote.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InvoiceTaxInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InvoiceTaxInput invoiceTaxInput = (com.paypal.oslo.api.graphql.schema.type.InvoiceTaxInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, invoiceTaxInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.percent, invoiceTaxInput.percent) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxNote, invoiceTaxInput.taxNote);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InvoiceTaxInput copy(java.lang.String name2, java.lang.Object percent, com.apollographql.apollo.api.Optional<java.lang.String> taxNote) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxNote, "");
        return new com.paypal.oslo.api.graphql.schema.type.InvoiceTaxInput(name2, percent, taxNote);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.taxNote;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getPercent() {
        return this.percent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoiceTaxInput copy$default(com.paypal.oslo.api.graphql.schema.type.InvoiceTaxInput invoiceTaxInput, java.lang.String str, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = invoiceTaxInput.name;
        }
        if ((i & 2) != 0) {
            obj = invoiceTaxInput.percent;
        }
        if ((i & 4) != 0) {
            optional = invoiceTaxInput.taxNote;
        }
        return invoiceTaxInput.copy(str, obj, optional);
    }
}
