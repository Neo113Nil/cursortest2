package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/PersonalInfoUiState;", "", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PersonalData;", "personalData", "", "showAddressModal", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "componentStates", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PersonalData;ZLcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PersonalData;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "copy", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PersonalData;ZLcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;)Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/PersonalInfoUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PersonalData;", "getPersonalData", "Z", "getShowAddressModal", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "getComponentStates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PersonalInfoUiState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStates;
    private final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData personalData;
    private final boolean showAddressModal;

    public PersonalInfoUiState(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData personalData, boolean z, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentStateMap, "");
        this.personalData = personalData;
        this.showAddressModal = z;
        this.componentStates = componentStateMap;
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData getPersonalData() {
        return this.personalData;
    }

    public final boolean getShowAddressModal() {
        return this.showAddressModal;
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap getComponentStates() {
        return this.componentStates;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData personalData = this.personalData;
        boolean z = this.showAddressModal;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap = this.componentStates;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalInfoUiState(personalData=");
        sb.append(personalData);
        sb.append(", showAddressModal=");
        sb.append(z);
        sb.append(", componentStates=");
        sb.append(componentStateMap);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.personalData.hashCode() * 31) + java.lang.Boolean.hashCode(this.showAddressModal)) * 31) + this.componentStates.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState personalInfoUiState = (com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.personalData, personalInfoUiState.personalData) && this.showAddressModal == personalInfoUiState.showAddressModal && kotlin.jvm.internal.Intrinsics.areEqual(this.componentStates, personalInfoUiState.componentStates);
    }

    public final com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState copy(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData personalData, boolean showAddressModal, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentStates, "");
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState(personalData, showAddressModal, componentStates);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap getComponentStates() {
        return this.componentStates;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowAddressModal() {
        return this.showAddressModal;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData getPersonalData() {
        return this.personalData;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState copy$default(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState personalInfoUiState, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData personalData, boolean z, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            personalData = personalInfoUiState.personalData;
        }
        if ((i & 2) != 0) {
            z = personalInfoUiState.showAddressModal;
        }
        if ((i & 4) != 0) {
            componentStateMap = personalInfoUiState.componentStates;
        }
        return personalInfoUiState.copy(personalData, z, componentStateMap);
    }
}
