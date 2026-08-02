package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011Jb\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\u0011R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ReportDebitCardLostInput;", "", "", "instrumentId", "Lcom/apollographql/apollo/api/Optional;", "shippingAddressId", "Lcom/paypal/oslo/api/graphql/schema/type/ClientChannel;", "clientChannel", "Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel;", "experienceChannel", "", "replaceCard", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ReportDebitCardLostInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Lcom/apollographql/apollo/api/Optional;", "getShippingAddressId", "getClientChannel", "getExperienceChannel", "getReplaceCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReportDebitCardLostInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> clientChannel;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> experienceChannel;
    private final java.lang.String instrumentId;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> replaceCard;
    private final com.apollographql.apollo.api.Optional<java.lang.String> shippingAddressId;

    /* JADX WARN: Multi-variable type inference failed */
    public ReportDebitCardLostInput(java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ClientChannel> optional2, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> optional3, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        this.instrumentId = str;
        this.shippingAddressId = optional;
        this.clientChannel = optional2;
        this.experienceChannel = optional3;
        this.replaceCard = optional4;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public /* synthetic */ ReportDebitCardLostInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, com.apollographql.apollo.api.Optional.Absent absent4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent4);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getShippingAddressId() {
        return this.shippingAddressId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> getClientChannel() {
        return this.clientChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> getExperienceChannel() {
        return this.experienceChannel;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getReplaceCard() {
        return this.replaceCard;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.shippingAddressId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> optional2 = this.clientChannel;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> optional3 = this.experienceChannel;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional4 = this.replaceCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportDebitCardLostInput(instrumentId=");
        sb.append(str);
        sb.append(", shippingAddressId=");
        sb.append(optional);
        sb.append(", clientChannel=");
        sb.append(optional2);
        sb.append(", experienceChannel=");
        sb.append(optional3);
        sb.append(", replaceCard=");
        sb.append(optional4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.instrumentId.hashCode() * 31) + this.shippingAddressId.hashCode()) * 31) + this.clientChannel.hashCode()) * 31) + this.experienceChannel.hashCode()) * 31) + this.replaceCard.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ReportDebitCardLostInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ReportDebitCardLostInput reportDebitCardLostInput = (com.paypal.oslo.api.graphql.schema.type.ReportDebitCardLostInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, reportDebitCardLostInput.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAddressId, reportDebitCardLostInput.shippingAddressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientChannel, reportDebitCardLostInput.clientChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.experienceChannel, reportDebitCardLostInput.experienceChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.replaceCard, reportDebitCardLostInput.replaceCard);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ReportDebitCardLostInput copy(java.lang.String instrumentId, com.apollographql.apollo.api.Optional<java.lang.String> shippingAddressId, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ClientChannel> clientChannel, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> experienceChannel, com.apollographql.apollo.api.Optional<java.lang.Boolean> replaceCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddressId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceCard, "");
        return new com.paypal.oslo.api.graphql.schema.type.ReportDebitCardLostInput(instrumentId, shippingAddressId, clientChannel, experienceChannel, replaceCard);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component5() {
        return this.replaceCard;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> component4() {
        return this.experienceChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> component3() {
        return this.clientChannel;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.shippingAddressId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ReportDebitCardLostInput copy$default(com.paypal.oslo.api.graphql.schema.type.ReportDebitCardLostInput reportDebitCardLostInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = reportDebitCardLostInput.instrumentId;
        }
        if ((i & 2) != 0) {
            optional = reportDebitCardLostInput.shippingAddressId;
        }
        com.apollographql.apollo.api.Optional optional5 = optional;
        if ((i & 4) != 0) {
            optional2 = reportDebitCardLostInput.clientChannel;
        }
        com.apollographql.apollo.api.Optional optional6 = optional2;
        if ((i & 8) != 0) {
            optional3 = reportDebitCardLostInput.experienceChannel;
        }
        com.apollographql.apollo.api.Optional optional7 = optional3;
        if ((i & 16) != 0) {
            optional4 = reportDebitCardLostInput.replaceCard;
        }
        return reportDebitCardLostInput.copy(str, optional5, optional6, optional7, optional4);
    }
}
