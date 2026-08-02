package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\tR(\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationSignUpWithGoogleInput;", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "googleOneTapToken", "Lcom/apollographql/apollo/api/Optional;", "authenticationContextId", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationSignUpWithGoogleInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCountry", "getGoogleOneTapToken", "Lcom/apollographql/apollo/api/Optional;", "getAuthenticationContextId", "getAuthenticationContextId$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardAccountCreationSignUpWithGoogleInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> authenticationContextId;
    private final java.lang.Object country;
    private final java.lang.Object googleOneTapToken;

    @kotlin.Deprecated(message = "This approach is deprecated in favor of having the onboard mutation perform passive login itself.")
    public static /* synthetic */ void getAuthenticationContextId$annotations() {
    }

    public OnboardAccountCreationSignUpWithGoogleInput(java.lang.Object obj, java.lang.Object obj2, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.country = obj;
        this.googleOneTapToken = obj2;
        this.authenticationContextId = optional;
    }

    public final java.lang.Object getCountry() {
        return this.country;
    }

    public final java.lang.Object getGoogleOneTapToken() {
        return this.googleOneTapToken;
    }

    public /* synthetic */ OnboardAccountCreationSignUpWithGoogleInput(java.lang.Object obj, java.lang.Object obj2, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getAuthenticationContextId() {
        return this.authenticationContextId;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.country;
        java.lang.Object obj2 = this.googleOneTapToken;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.authenticationContextId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardAccountCreationSignUpWithGoogleInput(country=");
        sb.append(obj);
        sb.append(", googleOneTapToken=");
        sb.append(obj2);
        sb.append(", authenticationContextId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.country.hashCode() * 31) + this.googleOneTapToken.hashCode()) * 31) + this.authenticationContextId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput onboardAccountCreationSignUpWithGoogleInput = (com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.country, onboardAccountCreationSignUpWithGoogleInput.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.googleOneTapToken, onboardAccountCreationSignUpWithGoogleInput.googleOneTapToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationContextId, onboardAccountCreationSignUpWithGoogleInput.authenticationContextId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput copy(java.lang.Object country, java.lang.Object googleOneTapToken, com.apollographql.apollo.api.Optional<? extends java.lang.Object> authenticationContextId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleOneTapToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContextId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput(country, googleOneTapToken, authenticationContextId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.authenticationContextId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getGoogleOneTapToken() {
        return this.googleOneTapToken;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCountry() {
        return this.country;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput onboardAccountCreationSignUpWithGoogleInput, java.lang.Object obj, java.lang.Object obj2, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = onboardAccountCreationSignUpWithGoogleInput.country;
        }
        if ((i & 2) != 0) {
            obj2 = onboardAccountCreationSignUpWithGoogleInput.googleOneTapToken;
        }
        if ((i & 4) != 0) {
            optional = onboardAccountCreationSignUpWithGoogleInput.authenticationContextId;
        }
        return onboardAccountCreationSignUpWithGoogleInput.copy(obj, obj2, optional);
    }
}
