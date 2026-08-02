package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RegistrationMetadataInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RegistrationMetadataName;", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RegistrationMetadataName;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RegistrationMetadataName;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RegistrationMetadataName;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/RegistrationMetadataInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RegistrationMetadataName;", "getName", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RegistrationMetadataInput {
    private final com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataName name;
    private final java.lang.String value;

    public RegistrationMetadataInput(com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataName registrationMetadataName, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registrationMetadataName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = registrationMetadataName;
        this.value = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataName getName() {
        return this.name;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataName registrationMetadataName = this.name;
        java.lang.String str = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RegistrationMetadataInput(name=");
        sb.append(registrationMetadataName);
        sb.append(", value=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataInput registrationMetadataInput = (com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataInput) other;
        return this.name == registrationMetadataInput.name && kotlin.jvm.internal.Intrinsics.areEqual(this.value, registrationMetadataInput.value);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataInput copy(com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataName name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataInput(name2, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataName getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataInput copy$default(com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataInput registrationMetadataInput, com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataName registrationMetadataName, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            registrationMetadataName = registrationMetadataInput.name;
        }
        if ((i & 2) != 0) {
            str = registrationMetadataInput.value;
        }
        return registrationMetadataInput.copy(registrationMetadataName, str);
    }
}
