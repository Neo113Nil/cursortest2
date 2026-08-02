package com.paypal.oslo.feature.onboarding.signup.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FirstName;", "firstName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/LastName;", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-w8YRmDk", "()Ljava/lang/String;", "component1", "component2-i7KAUmI", "component2", "copy-RV_4-7s", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getFirstName-w8YRmDk", "getLastName-i7KAUmI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Name {
    public static final int $stable = 0;
    private final java.lang.String firstName;
    private final java.lang.String lastName;

    private Name(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.firstName = str;
        this.lastName = str2;
    }

    /* renamed from: getFirstName-w8YRmDk, reason: not valid java name */
    public final java.lang.String m16304getFirstNamew8YRmDk() {
        return this.firstName;
    }

    /* renamed from: getLastName-i7KAUmI, reason: not valid java name */
    public final java.lang.String m16305getLastNamei7KAUmI() {
        return this.lastName;
    }

    public final java.lang.String toString() {
        java.lang.String m15935toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15935toStringimpl(this.firstName);
        java.lang.String m15974toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15974toStringimpl(this.lastName);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(firstName=");
        sb.append(m15935toStringimpl);
        sb.append(", lastName=");
        sb.append(m15974toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15934hashCodeimpl(this.firstName) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15973hashCodeimpl(this.lastName);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.domain.model.Name)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2 = (com.paypal.oslo.feature.onboarding.signup.domain.model.Name) other;
        return com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15933equalsimpl0(this.firstName, name2.firstName) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15972equalsimpl0(this.lastName, name2.lastName);
    }

    /* renamed from: copy-RV_4-7s, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.signup.domain.model.Name m16303copyRV_47s(java.lang.String firstName, java.lang.String lastName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
        return new com.paypal.oslo.feature.onboarding.signup.domain.model.Name(firstName, lastName, null);
    }

    /* renamed from: component2-i7KAUmI, reason: not valid java name and from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component1-w8YRmDk, reason: not valid java name and from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    /* renamed from: copy-RV_4-7s$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.domain.model.Name m16300copyRV_47s$default(com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = name2.firstName;
        }
        if ((i & 2) != 0) {
            str2 = name2.lastName;
        }
        return name2.m16303copyRV_47s(str, str2);
    }

    public /* synthetic */ Name(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
