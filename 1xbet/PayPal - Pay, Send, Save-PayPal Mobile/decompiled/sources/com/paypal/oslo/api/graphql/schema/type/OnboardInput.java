package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0098\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b\u0006\u0010\u0018R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0018R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b.\u0010\u0018R(\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0018R(\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010,\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0018R\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b4\u0010\u0018R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b5\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;", "intent", "Lcom/apollographql/apollo/api/Optional;", "", "isFlowStart", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationInput;", "accountCreationInput", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationSignUpWithGoogleInput;", "accountCreationSignUpWithGoogleInput", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationInitialInput;", "accountCreationInitialInput", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationSignUpWithGoogleInitialInput;", "accountCreationSignUpWithGoogleInitialInput", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;", "componentsInput", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardJourneyContextInput;", "journeyContext", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;", "getIntent", "Lcom/apollographql/apollo/api/Optional;", "getAccountCreationInput", "getAccountCreationSignUpWithGoogleInput", "getAccountCreationInitialInput", "getAccountCreationInitialInput$annotations", "()V", "getAccountCreationSignUpWithGoogleInitialInput", "getAccountCreationSignUpWithGoogleInitialInput$annotations", "getComponentsInput", "getJourneyContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput> accountCreationInitialInput;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInput> accountCreationInput;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput> accountCreationSignUpWithGoogleInitialInput;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput> accountCreationSignUpWithGoogleInput;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput> componentsInput;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardIntent intent;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> isFlowStart;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput> journeyContext;

    @kotlin.Deprecated(message = "Use `accountCreationInput` instead.")
    public static /* synthetic */ void getAccountCreationInitialInput$annotations() {
    }

    @kotlin.Deprecated(message = "Use `accountCreationSignUpWithGoogleInput` instead.")
    public static /* synthetic */ void getAccountCreationSignUpWithGoogleInitialInput$annotations() {
    }

    public OnboardInput(com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput> optional3, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput> optional4, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput> optional5, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput> optional6, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput> optional7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional7, "");
        this.intent = onboardIntent;
        this.isFlowStart = optional;
        this.accountCreationInput = optional2;
        this.accountCreationSignUpWithGoogleInput = optional3;
        this.accountCreationInitialInput = optional4;
        this.accountCreationSignUpWithGoogleInitialInput = optional5;
        this.componentsInput = optional6;
        this.journeyContext = optional7;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardIntent getIntent() {
        return this.intent;
    }

    public /* synthetic */ OnboardInput(com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, com.apollographql.apollo.api.Optional optional7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(onboardIntent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional7);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> isFlowStart() {
        return this.isFlowStart;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInput> getAccountCreationInput() {
        return this.accountCreationInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput> getAccountCreationSignUpWithGoogleInput() {
        return this.accountCreationSignUpWithGoogleInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput> getAccountCreationInitialInput() {
        return this.accountCreationInitialInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput> getAccountCreationSignUpWithGoogleInitialInput() {
        return this.accountCreationSignUpWithGoogleInitialInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput> getComponentsInput() {
        return this.componentsInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput> getJourneyContext() {
        return this.journeyContext;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent = this.intent;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.isFlowStart;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInput> optional2 = this.accountCreationInput;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput> optional3 = this.accountCreationSignUpWithGoogleInput;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput> optional4 = this.accountCreationInitialInput;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput> optional5 = this.accountCreationSignUpWithGoogleInitialInput;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput> optional6 = this.componentsInput;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput> optional7 = this.journeyContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardInput(intent=");
        sb.append(onboardIntent);
        sb.append(", isFlowStart=");
        sb.append(optional);
        sb.append(", accountCreationInput=");
        sb.append(optional2);
        sb.append(", accountCreationSignUpWithGoogleInput=");
        sb.append(optional3);
        sb.append(", accountCreationInitialInput=");
        sb.append(optional4);
        sb.append(", accountCreationSignUpWithGoogleInitialInput=");
        sb.append(optional5);
        sb.append(", componentsInput=");
        sb.append(optional6);
        sb.append(", journeyContext=");
        sb.append(optional7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((this.intent.hashCode() * 31) + this.isFlowStart.hashCode()) * 31) + this.accountCreationInput.hashCode()) * 31) + this.accountCreationSignUpWithGoogleInput.hashCode()) * 31) + this.accountCreationInitialInput.hashCode()) * 31) + this.accountCreationSignUpWithGoogleInitialInput.hashCode()) * 31) + this.componentsInput.hashCode()) * 31) + this.journeyContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardInput onboardInput = (com.paypal.oslo.api.graphql.schema.type.OnboardInput) other;
        return this.intent == onboardInput.intent && kotlin.jvm.internal.Intrinsics.areEqual(this.isFlowStart, onboardInput.isFlowStart) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountCreationInput, onboardInput.accountCreationInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountCreationSignUpWithGoogleInput, onboardInput.accountCreationSignUpWithGoogleInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountCreationInitialInput, onboardInput.accountCreationInitialInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountCreationSignUpWithGoogleInitialInput, onboardInput.accountCreationSignUpWithGoogleInitialInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.componentsInput, onboardInput.componentsInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.journeyContext, onboardInput.journeyContext);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardInput copy(com.paypal.oslo.api.graphql.schema.type.OnboardIntent intent, com.apollographql.apollo.api.Optional<java.lang.Boolean> isFlowStart, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInput> accountCreationInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput> accountCreationSignUpWithGoogleInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput> accountCreationInitialInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput> accountCreationSignUpWithGoogleInitialInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput> componentsInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput> journeyContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isFlowStart, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationSignUpWithGoogleInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationInitialInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationSignUpWithGoogleInitialInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journeyContext, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardInput(intent, isFlowStart, accountCreationInput, accountCreationSignUpWithGoogleInput, accountCreationInitialInput, accountCreationSignUpWithGoogleInitialInput, componentsInput, journeyContext);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput> component8() {
        return this.journeyContext;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput> component7() {
        return this.componentsInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput> component6() {
        return this.accountCreationSignUpWithGoogleInitialInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput> component5() {
        return this.accountCreationInitialInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput> component4() {
        return this.accountCreationSignUpWithGoogleInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInput> component3() {
        return this.accountCreationInput;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component2() {
        return this.isFlowStart;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardIntent getIntent() {
        return this.intent;
    }
}
