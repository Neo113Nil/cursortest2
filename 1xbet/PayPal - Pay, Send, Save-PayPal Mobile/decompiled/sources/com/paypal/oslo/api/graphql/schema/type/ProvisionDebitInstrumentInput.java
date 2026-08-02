package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0004\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0018\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J´\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0017R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0019R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u0019R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b3\u0010\u0019R(\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0019R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010\u001fR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b:\u0010\u0019R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b;\u0010\u0019R\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b<\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProvisionDebitInstrumentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentUserDataInput;", "userData", "Lcom/paypal/oslo/api/graphql/schema/type/ClientChannel;", "clientChannel", "Lcom/paypal/oslo/api/graphql/schema/type/ExperienceChannel;", "experienceChannel", "entryPointUri", "entrypointUri", "", "shouldIssuePhysical", "shouldProvisionBalance", "Lcom/paypal/oslo/api/graphql/schema/type/TokenProductName;", "tokenProductName", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentUserPreferenceInput;", "fundingPreference", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "component10", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;ZLcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ProvisionDebitInstrumentInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Lcom/apollographql/apollo/api/Optional;", "getUserData", "getClientChannel", "getExperienceChannel", "getEntryPointUri", "getEntryPointUri$annotations", "()V", "getEntrypointUri", "Z", "getShouldIssuePhysical", "getShouldProvisionBalance", "getTokenProductName", "getFundingPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProvisionDebitInstrumentInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> clientChannel;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> entryPointUri;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> entrypointUri;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> experienceChannel;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> fundingPreference;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;
    private final boolean shouldIssuePhysical;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> shouldProvisionBalance;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TokenProductName> tokenProductName;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserDataInput> userData;

    @kotlin.Deprecated(message = "Use 'entrypointUri' field instead.")
    public static /* synthetic */ void getEntryPointUri$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProvisionDebitInstrumentInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserDataInput> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ClientChannel> optional2, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> optional3, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional4, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional5, boolean z, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional6, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.TokenProductName> optional7, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> optional8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional8, "");
        this.productName = debitInstrumentProductName;
        this.userData = optional;
        this.clientChannel = optional2;
        this.experienceChannel = optional3;
        this.entryPointUri = optional4;
        this.entrypointUri = optional5;
        this.shouldIssuePhysical = z;
        this.shouldProvisionBalance = optional6;
        this.tokenProductName = optional7;
        this.fundingPreference = optional8;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
        return this.productName;
    }

    public /* synthetic */ ProvisionDebitInstrumentInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, boolean z, com.apollographql.apollo.api.Optional optional6, com.apollographql.apollo.api.Optional optional7, com.apollographql.apollo.api.Optional optional8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitInstrumentProductName, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, z, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, (i & 256) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional7, (i & 512) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional8);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserDataInput> getUserData() {
        return this.userData;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> getClientChannel() {
        return this.clientChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> getExperienceChannel() {
        return this.experienceChannel;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getEntryPointUri() {
        return this.entryPointUri;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getEntrypointUri() {
        return this.entrypointUri;
    }

    public final boolean getShouldIssuePhysical() {
        return this.shouldIssuePhysical;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getShouldProvisionBalance() {
        return this.shouldProvisionBalance;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TokenProductName> getTokenProductName() {
        return this.tokenProductName;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> getFundingPreference() {
        return this.fundingPreference;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserDataInput> optional = this.userData;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> optional2 = this.clientChannel;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> optional3 = this.experienceChannel;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional4 = this.entryPointUri;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional5 = this.entrypointUri;
        boolean z = this.shouldIssuePhysical;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional6 = this.shouldProvisionBalance;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TokenProductName> optional7 = this.tokenProductName;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> optional8 = this.fundingPreference;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionDebitInstrumentInput(productName=");
        sb.append(debitInstrumentProductName);
        sb.append(", userData=");
        sb.append(optional);
        sb.append(", clientChannel=");
        sb.append(optional2);
        sb.append(", experienceChannel=");
        sb.append(optional3);
        sb.append(", entryPointUri=");
        sb.append(optional4);
        sb.append(", entrypointUri=");
        sb.append(optional5);
        sb.append(", shouldIssuePhysical=");
        sb.append(z);
        sb.append(", shouldProvisionBalance=");
        sb.append(optional6);
        sb.append(", tokenProductName=");
        sb.append(optional7);
        sb.append(", fundingPreference=");
        sb.append(optional8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((this.productName.hashCode() * 31) + this.userData.hashCode()) * 31) + this.clientChannel.hashCode()) * 31) + this.experienceChannel.hashCode()) * 31) + this.entryPointUri.hashCode()) * 31) + this.entrypointUri.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldIssuePhysical)) * 31) + this.shouldProvisionBalance.hashCode()) * 31) + this.tokenProductName.hashCode()) * 31) + this.fundingPreference.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput provisionDebitInstrumentInput = (com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput) other;
        return this.productName == provisionDebitInstrumentInput.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.userData, provisionDebitInstrumentInput.userData) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientChannel, provisionDebitInstrumentInput.clientChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.experienceChannel, provisionDebitInstrumentInput.experienceChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.entryPointUri, provisionDebitInstrumentInput.entryPointUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.entrypointUri, provisionDebitInstrumentInput.entrypointUri) && this.shouldIssuePhysical == provisionDebitInstrumentInput.shouldIssuePhysical && kotlin.jvm.internal.Intrinsics.areEqual(this.shouldProvisionBalance, provisionDebitInstrumentInput.shouldProvisionBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenProductName, provisionDebitInstrumentInput.tokenProductName) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPreference, provisionDebitInstrumentInput.fundingPreference);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserDataInput> userData, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ClientChannel> clientChannel, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> experienceChannel, com.apollographql.apollo.api.Optional<? extends java.lang.Object> entryPointUri, com.apollographql.apollo.api.Optional<? extends java.lang.Object> entrypointUri, boolean shouldIssuePhysical, com.apollographql.apollo.api.Optional<java.lang.Boolean> shouldProvisionBalance, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.TokenProductName> tokenProductName, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> fundingPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPointUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entrypointUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldProvisionBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingPreference, "");
        return new com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput(productName, userData, clientChannel, experienceChannel, entryPointUri, entrypointUri, shouldIssuePhysical, shouldProvisionBalance, tokenProductName, fundingPreference);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TokenProductName> component9() {
        return this.tokenProductName;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component8() {
        return this.shouldProvisionBalance;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldIssuePhysical() {
        return this.shouldIssuePhysical;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component6() {
        return this.entrypointUri;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component5() {
        return this.entryPointUri;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ExperienceChannel> component4() {
        return this.experienceChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ClientChannel> component3() {
        return this.clientChannel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserDataInput> component2() {
        return this.userData;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> component10() {
        return this.fundingPreference;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
        return this.productName;
    }
}
