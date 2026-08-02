package com.paypal.oslo.feature.onboarding.signup.data.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/model/StepRequirement;", "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "stepId", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "requiredForCountries", "<init>", "(Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "isRequiredFor-tgPz1l0", "(Ljava/lang/String;)Z", "isRequiredFor", "component1-eVUBM90", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/Set;", "copy-4HgBkxg", "(Ljava/lang/String;Ljava/util/Set;)Lcom/paypal/oslo/feature/onboarding/signup/data/model/StepRequirement;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getStepId-eVUBM90", "Ljava/util/Set;", "getRequiredForCountries"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StepRequirement {
    public static final int $stable = 8;
    private final java.util.Set<com.paypal.oslo.core.i18n.domain.model.CountryCode> requiredForCountries;
    private final java.lang.String stepId;

    private StepRequirement(java.lang.String str, java.util.Set<com.paypal.oslo.core.i18n.domain.model.CountryCode> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.stepId = str;
        this.requiredForCountries = set;
    }

    /* renamed from: getStepId-eVUBM90, reason: not valid java name */
    public final java.lang.String m16228getStepIdeVUBM90() {
        return this.stepId;
    }

    public /* synthetic */ StepRequirement(java.lang.String str, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.SetsKt.emptySet() : set, null);
    }

    public final java.util.Set<com.paypal.oslo.core.i18n.domain.model.CountryCode> getRequiredForCountries() {
        return this.requiredForCountries;
    }

    /* renamed from: isRequiredFor-tgPz1l0, reason: not valid java name */
    public final boolean m16229isRequiredFortgPz1l0(java.lang.String country) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        return this.requiredForCountries.isEmpty() || this.requiredForCountries.contains(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(country));
    }

    public final java.lang.String toString() {
        java.lang.String m16034toStringimpl = com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16034toStringimpl(this.stepId);
        java.util.Set<com.paypal.oslo.core.i18n.domain.model.CountryCode> set = this.requiredForCountries;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepRequirement(stepId=");
        sb.append(m16034toStringimpl);
        sb.append(", requiredForCountries=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16033hashCodeimpl(this.stepId) * 31) + this.requiredForCountries.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement stepRequirement = (com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement) other;
        return com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(this.stepId, stepRequirement.stepId) && kotlin.jvm.internal.Intrinsics.areEqual(this.requiredForCountries, stepRequirement.requiredForCountries);
    }

    /* renamed from: copy-4HgBkxg, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement m16227copy4HgBkxg(java.lang.String stepId, java.util.Set<com.paypal.oslo.core.i18n.domain.model.CountryCode> requiredForCountries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredForCountries, "");
        return new com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement(stepId, requiredForCountries, null);
    }

    public final java.util.Set<com.paypal.oslo.core.i18n.domain.model.CountryCode> component2() {
        return this.requiredForCountries;
    }

    /* renamed from: component1-eVUBM90, reason: not valid java name and from getter */
    public final java.lang.String getStepId() {
        return this.stepId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-4HgBkxg$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement m16225copy4HgBkxg$default(com.paypal.oslo.feature.onboarding.signup.data.model.StepRequirement stepRequirement, java.lang.String str, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stepRequirement.stepId;
        }
        if ((i & 2) != 0) {
            set = stepRequirement.requiredForCountries;
        }
        return stepRequirement.m16227copy4HgBkxg(str, set);
    }

    public /* synthetic */ StepRequirement(java.lang.String str, java.util.Set set, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set);
    }
}
