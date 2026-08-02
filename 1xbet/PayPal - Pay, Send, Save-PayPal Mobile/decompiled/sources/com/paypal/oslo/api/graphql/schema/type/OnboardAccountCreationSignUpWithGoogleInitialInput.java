package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationSignUpWithGoogleInitialInput;", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "googleOneTapToken", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationSignUpWithGoogleInitialInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCountry", "getGoogleOneTapToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardAccountCreationSignUpWithGoogleInitialInput {
    private final java.lang.Object country;
    private final java.lang.Object googleOneTapToken;

    public OnboardAccountCreationSignUpWithGoogleInitialInput(java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        this.country = obj;
        this.googleOneTapToken = obj2;
    }

    public final java.lang.Object getCountry() {
        return this.country;
    }

    public final java.lang.Object getGoogleOneTapToken() {
        return this.googleOneTapToken;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.country;
        java.lang.Object obj2 = this.googleOneTapToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardAccountCreationSignUpWithGoogleInitialInput(country=");
        sb.append(obj);
        sb.append(", googleOneTapToken=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.country.hashCode() * 31) + this.googleOneTapToken.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput onboardAccountCreationSignUpWithGoogleInitialInput = (com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.country, onboardAccountCreationSignUpWithGoogleInitialInput.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.googleOneTapToken, onboardAccountCreationSignUpWithGoogleInitialInput.googleOneTapToken);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput copy(java.lang.Object country, java.lang.Object googleOneTapToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleOneTapToken, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput(country, googleOneTapToken);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getGoogleOneTapToken() {
        return this.googleOneTapToken;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCountry() {
        return this.country;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInitialInput onboardAccountCreationSignUpWithGoogleInitialInput, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = onboardAccountCreationSignUpWithGoogleInitialInput.country;
        }
        if ((i & 2) != 0) {
            obj2 = onboardAccountCreationSignUpWithGoogleInitialInput.googleOneTapToken;
        }
        return onboardAccountCreationSignUpWithGoogleInitialInput.copy(obj, obj2);
    }
}
