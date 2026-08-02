package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinInput;", "", "", "instrumentId", "cardVerificationCode", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/ClientChannel;", "clientChannel", "Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel;", "experienceChannel", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Ljava/lang/Object;", "getCardVerificationCode", "Lcom/apollographql/apollo/api/Optional;", "getClientChannel", "getExperienceChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DebitInstrumentPinInput {
    private final java.lang.Object cardVerificationCode;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> clientChannel;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> experienceChannel;
    private final java.lang.String instrumentId;

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentPinInput(java.lang.String str, java.lang.Object obj, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ClientChannel> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.instrumentId = str;
        this.cardVerificationCode = obj;
        this.clientChannel = optional;
        this.experienceChannel = optional2;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.Object getCardVerificationCode() {
        return this.cardVerificationCode;
    }

    public /* synthetic */ DebitInstrumentPinInput(java.lang.String str, java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> getClientChannel() {
        return this.clientChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> getExperienceChannel() {
        return this.experienceChannel;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        java.lang.Object obj = this.cardVerificationCode;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> optional = this.clientChannel;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> optional2 = this.experienceChannel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentPinInput(instrumentId=");
        sb.append(str);
        sb.append(", cardVerificationCode=");
        sb.append(obj);
        sb.append(", clientChannel=");
        sb.append(optional);
        sb.append(", experienceChannel=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.instrumentId.hashCode() * 31) + this.cardVerificationCode.hashCode()) * 31) + this.clientChannel.hashCode()) * 31) + this.experienceChannel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput debitInstrumentPinInput = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, debitInstrumentPinInput.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardVerificationCode, debitInstrumentPinInput.cardVerificationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientChannel, debitInstrumentPinInput.clientChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.experienceChannel, debitInstrumentPinInput.experienceChannel);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput copy(java.lang.String instrumentId, java.lang.Object cardVerificationCode, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ClientChannel> clientChannel, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> experienceChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardVerificationCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceChannel, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput(instrumentId, cardVerificationCode, clientChannel, experienceChannel);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> component4() {
        return this.experienceChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> component3() {
        return this.clientChannel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getCardVerificationCode() {
        return this.cardVerificationCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput copy$default(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput debitInstrumentPinInput, java.lang.String str, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = debitInstrumentPinInput.instrumentId;
        }
        if ((i & 2) != 0) {
            obj = debitInstrumentPinInput.cardVerificationCode;
        }
        if ((i & 4) != 0) {
            optional = debitInstrumentPinInput.clientChannel;
        }
        if ((i & 8) != 0) {
            optional2 = debitInstrumentPinInput.experienceChannel;
        }
        return debitInstrumentPinInput.copy(str, obj, optional, optional2);
    }
}
