package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJH\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantTaxInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "id", "name", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "percent", "<init>", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/MerchantTaxInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getId", "Ljava/lang/String;", "getName", "getNote", "getPercent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MerchantTaxInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> id;
    private final java.lang.String name;
    private final com.apollographql.apollo.api.Optional<java.lang.String> note;
    private final java.lang.String percent;

    public MerchantTaxInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional2, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = optional;
        this.name = str;
        this.note = optional2;
        this.percent = str2;
    }

    public /* synthetic */ MerchantTaxInput(com.apollographql.apollo.api.Optional.Absent absent, java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent2, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, str, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, str2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getNote() {
        return this.note;
    }

    public final java.lang.String getPercent() {
        return this.percent;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.id;
        java.lang.String str = this.name;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.note;
        java.lang.String str2 = this.percent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantTaxInput(id=");
        sb.append(optional);
        sb.append(", name=");
        sb.append(str);
        sb.append(", note=");
        sb.append(optional2);
        sb.append(", percent=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.note.hashCode()) * 31) + this.percent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput merchantTaxInput = (com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchantTaxInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchantTaxInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, merchantTaxInput.note) && kotlin.jvm.internal.Intrinsics.areEqual(this.percent, merchantTaxInput.percent);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput copy(com.apollographql.apollo.api.Optional<java.lang.String> id, java.lang.String name2, com.apollographql.apollo.api.Optional<java.lang.String> note, java.lang.String percent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(note, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percent, "");
        return new com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput(id, name2, note, percent);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPercent() {
        return this.percent;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.note;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput copy$default(com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput merchantTaxInput, com.apollographql.apollo.api.Optional optional, java.lang.String str, com.apollographql.apollo.api.Optional optional2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = merchantTaxInput.id;
        }
        if ((i & 2) != 0) {
            str = merchantTaxInput.name;
        }
        if ((i & 4) != 0) {
            optional2 = merchantTaxInput.note;
        }
        if ((i & 8) != 0) {
            str2 = merchantTaxInput.percent;
        }
        return merchantTaxInput.copy(optional, str, optional2, str2);
    }
}
