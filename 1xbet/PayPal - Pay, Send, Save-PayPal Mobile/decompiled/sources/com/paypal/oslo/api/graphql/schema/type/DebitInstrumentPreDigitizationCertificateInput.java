package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJF\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPreDigitizationCertificateInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CertificateFormat;", "format", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/api/graphql/schema/type/CertificatePurpose;", "usage", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPreDigitizationCertificateInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getFormat", "getValue", "getUsage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DebitInstrumentPreDigitizationCertificateInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CertificateFormat> format;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CertificatePurpose> usage;
    private final com.apollographql.apollo.api.Optional<java.lang.String> value;

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentPreDigitizationCertificateInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CertificateFormat> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CertificatePurpose> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.format = optional;
        this.value = optional2;
        this.usage = optional3;
    }

    public /* synthetic */ DebitInstrumentPreDigitizationCertificateInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CertificateFormat> getFormat() {
        return this.format;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getValue() {
        return this.value;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CertificatePurpose> getUsage() {
        return this.usage;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CertificateFormat> optional = this.format;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.value;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CertificatePurpose> optional3 = this.usage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentPreDigitizationCertificateInput(format=");
        sb.append(optional);
        sb.append(", value=");
        sb.append(optional2);
        sb.append(", usage=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.format.hashCode() * 31) + this.value.hashCode()) * 31) + this.usage.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput debitInstrumentPreDigitizationCertificateInput = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.format, debitInstrumentPreDigitizationCertificateInput.format) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, debitInstrumentPreDigitizationCertificateInput.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.usage, debitInstrumentPreDigitizationCertificateInput.usage);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CertificateFormat> format, com.apollographql.apollo.api.Optional<java.lang.String> value, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CertificatePurpose> usage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usage, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput(format, value, usage);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CertificatePurpose> component3() {
        return this.usage;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.value;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CertificateFormat> component1() {
        return this.format;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput copy$default(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput debitInstrumentPreDigitizationCertificateInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = debitInstrumentPreDigitizationCertificateInput.format;
        }
        if ((i & 2) != 0) {
            optional2 = debitInstrumentPreDigitizationCertificateInput.value;
        }
        if ((i & 4) != 0) {
            optional3 = debitInstrumentPreDigitizationCertificateInput.usage;
        }
        return debitInstrumentPreDigitizationCertificateInput.copy(optional, optional2, optional3);
    }

    public DebitInstrumentPreDigitizationCertificateInput() {
        this(null, null, null, 7, null);
    }
}
