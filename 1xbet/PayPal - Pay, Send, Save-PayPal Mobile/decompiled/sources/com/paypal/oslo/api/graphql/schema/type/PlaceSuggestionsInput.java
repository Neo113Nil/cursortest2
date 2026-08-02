package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PlaceSuggestionsInput;", "", "", "input", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/PlaceSuggestionsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInput", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PlaceSuggestionsInput {
    private final java.lang.Object countryCode;
    private final java.lang.String input;

    public PlaceSuggestionsInput(java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.input = str;
        this.countryCode = obj;
    }

    public final java.lang.String getInput() {
        return this.input;
    }

    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.input;
        java.lang.Object obj = this.countryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaceSuggestionsInput(input=");
        sb.append(str);
        sb.append(", countryCode=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.input.hashCode() * 31) + this.countryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput placeSuggestionsInput = (com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.input, placeSuggestionsInput.input) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, placeSuggestionsInput.countryCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput copy(java.lang.String input, java.lang.Object countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput(input, countryCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput copy$default(com.paypal.oslo.api.graphql.schema.type.PlaceSuggestionsInput placeSuggestionsInput, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = placeSuggestionsInput.input;
        }
        if ((i & 2) != 0) {
            obj = placeSuggestionsInput.countryCode;
        }
        return placeSuggestionsInput.copy(str, obj);
    }
}
