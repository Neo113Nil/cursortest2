package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u001e\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u001e\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJÀ\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00042\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00042\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b-\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0018R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u001aR(\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b3\u0010\u001aR\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b4\u0010\u001aR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b5\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u0010 R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b8\u0010\u001aR\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b9\u0010\u001aR(\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b:\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentDigitizationDataInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "tokenProductName", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/ClientChannel;", "clientChannel", "Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel;", "experienceChannel", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPreDigitizationCertificateInput;", "certificates", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPreDigitizationWalletInput;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "", "nonceSignature", "fundingCardId", "nonce", "tokenRequestorId", "Lcom/paypal/oslo/api/graphql/schema/type/MetadataItemInput;", "additionalAttributes", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/String;", "component8", "component9", "component10", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentDigitizationDataInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getTokenProductName", "Lcom/apollographql/apollo/api/Optional;", "getClientChannel", "getExperienceChannel", "getCertificates", "getWallet", "getNonceSignature", "Ljava/lang/String;", "getFundingCardId", "getNonce", "getTokenRequestorId", "getAdditionalAttributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateDebitInstrumentDigitizationDataInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> additionalAttributes;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput>> certificates;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> clientChannel;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> experienceChannel;
    private final java.lang.String fundingCardId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> nonce;
    private final com.apollographql.apollo.api.Optional<java.lang.String> nonceSignature;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName tokenProductName;
    private final com.apollographql.apollo.api.Optional<java.lang.String> tokenRequestorId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationWalletInput> wallet;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateDebitInstrumentDigitizationDataInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ClientChannel> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> optional2, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput>> optional3, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationWalletInput> optional4, com.apollographql.apollo.api.Optional<java.lang.String> optional5, java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional6, com.apollographql.apollo.api.Optional<java.lang.String> optional7, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> optional8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional8, "");
        this.tokenProductName = debitInstrumentProductName;
        this.clientChannel = optional;
        this.experienceChannel = optional2;
        this.certificates = optional3;
        this.wallet = optional4;
        this.nonceSignature = optional5;
        this.fundingCardId = str;
        this.nonce = optional6;
        this.tokenRequestorId = optional7;
        this.additionalAttributes = optional8;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getTokenProductName() {
        return this.tokenProductName;
    }

    public /* synthetic */ CreateDebitInstrumentDigitizationDataInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, java.lang.String str, com.apollographql.apollo.api.Optional optional6, com.apollographql.apollo.api.Optional optional7, com.apollographql.apollo.api.Optional optional8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitInstrumentProductName, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, str, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, (i & 256) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional7, (i & 512) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional8);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> getClientChannel() {
        return this.clientChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> getExperienceChannel() {
        return this.experienceChannel;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput>> getCertificates() {
        return this.certificates;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationWalletInput> getWallet() {
        return this.wallet;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getNonceSignature() {
        return this.nonceSignature;
    }

    public final java.lang.String getFundingCardId() {
        return this.fundingCardId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getNonce() {
        return this.nonce;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getTokenRequestorId() {
        return this.tokenRequestorId;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.tokenProductName;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> optional = this.clientChannel;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> optional2 = this.experienceChannel;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput>> optional3 = this.certificates;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationWalletInput> optional4 = this.wallet;
        com.apollographql.apollo.api.Optional<java.lang.String> optional5 = this.nonceSignature;
        java.lang.String str = this.fundingCardId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional6 = this.nonce;
        com.apollographql.apollo.api.Optional<java.lang.String> optional7 = this.tokenRequestorId;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> optional8 = this.additionalAttributes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateDebitInstrumentDigitizationDataInput(tokenProductName=");
        sb.append(debitInstrumentProductName);
        sb.append(", clientChannel=");
        sb.append(optional);
        sb.append(", experienceChannel=");
        sb.append(optional2);
        sb.append(", certificates=");
        sb.append(optional3);
        sb.append(", wallet=");
        sb.append(optional4);
        sb.append(", nonceSignature=");
        sb.append(optional5);
        sb.append(", fundingCardId=");
        sb.append(str);
        sb.append(", nonce=");
        sb.append(optional6);
        sb.append(", tokenRequestorId=");
        sb.append(optional7);
        sb.append(", additionalAttributes=");
        sb.append(optional8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((this.tokenProductName.hashCode() * 31) + this.clientChannel.hashCode()) * 31) + this.experienceChannel.hashCode()) * 31) + this.certificates.hashCode()) * 31) + this.wallet.hashCode()) * 31) + this.nonceSignature.hashCode()) * 31) + this.fundingCardId.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.tokenRequestorId.hashCode()) * 31) + this.additionalAttributes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput createDebitInstrumentDigitizationDataInput = (com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput) other;
        return this.tokenProductName == createDebitInstrumentDigitizationDataInput.tokenProductName && kotlin.jvm.internal.Intrinsics.areEqual(this.clientChannel, createDebitInstrumentDigitizationDataInput.clientChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.experienceChannel, createDebitInstrumentDigitizationDataInput.experienceChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.certificates, createDebitInstrumentDigitizationDataInput.certificates) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, createDebitInstrumentDigitizationDataInput.wallet) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonceSignature, createDebitInstrumentDigitizationDataInput.nonceSignature) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingCardId, createDebitInstrumentDigitizationDataInput.fundingCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, createDebitInstrumentDigitizationDataInput.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenRequestorId, createDebitInstrumentDigitizationDataInput.tokenRequestorId) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalAttributes, createDebitInstrumentDigitizationDataInput.additionalAttributes);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName tokenProductName, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ClientChannel> clientChannel, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> experienceChannel, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput>> certificates, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationWalletInput> wallet, com.apollographql.apollo.api.Optional<java.lang.String> nonceSignature, java.lang.String fundingCardId, com.apollographql.apollo.api.Optional<java.lang.String> nonce, com.apollographql.apollo.api.Optional<java.lang.String> tokenRequestorId, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> additionalAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificates, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wallet, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonceSignature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRequestorId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalAttributes, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput(tokenProductName, clientChannel, experienceChannel, certificates, wallet, nonceSignature, fundingCardId, nonce, tokenRequestorId, additionalAttributes);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component9() {
        return this.tokenRequestorId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component8() {
        return this.nonce;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getFundingCardId() {
        return this.fundingCardId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component6() {
        return this.nonceSignature;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationWalletInput> component5() {
        return this.wallet;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPreDigitizationCertificateInput>> component4() {
        return this.certificates;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> component3() {
        return this.experienceChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> component2() {
        return this.clientChannel;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.MetadataItemInput>> component10() {
        return this.additionalAttributes;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getTokenProductName() {
        return this.tokenProductName;
    }
}
