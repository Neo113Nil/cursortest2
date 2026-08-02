package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailUiState;", "", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;", "emailData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "componentStates", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;", "emailModalState", "", "isLoading", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;Z)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;", "component2", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "component3", "()Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;Z)Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$EmailData;", "getEmailData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "getComponentStates", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;", "getEmailModalState", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmailUiState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap componentStates;
    private final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData;
    private final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState emailModalState;
    private final boolean isLoading;

    public EmailUiState(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData, com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState emailModalState, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableComponentStateMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailModalState, "");
        this.emailData = emailData;
        this.componentStates = mutableComponentStateMap;
        this.emailModalState = emailModalState;
        this.isLoading = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EmailUiState(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData, com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.None none, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(emailData, mutableComponentStateMap, (i & 4) != 0 ? com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.None.INSTANCE : none, (i & 8) != 0 ? false : z);
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        int i2 = 1;
        emailData = (i & 1) != 0 ? new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData(null, i2, 0 == true ? 1 : 0) : emailData;
        if ((i & 2) != 0) {
            mutableComponentStateMap = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.mutableComponentStateMap();
            mutableComponentStateMap.register(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.EMAIL, new com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
        }
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData getEmailData() {
        return this.emailData;
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap getComponentStates() {
        return this.componentStates;
    }

    public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState getEmailModalState() {
        return this.emailModalState;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData = this.emailData;
        com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap = this.componentStates;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState emailModalState = this.emailModalState;
        boolean z = this.isLoading;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailUiState(emailData=");
        sb.append(emailData);
        sb.append(", componentStates=");
        sb.append(mutableComponentStateMap);
        sb.append(", emailModalState=");
        sb.append(emailModalState);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.emailData.hashCode() * 31) + this.componentStates.hashCode()) * 31) + this.emailModalState.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isLoading);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState emailUiState = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.emailData, emailUiState.emailData) && kotlin.jvm.internal.Intrinsics.areEqual(this.componentStates, emailUiState.componentStates) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailModalState, emailUiState.emailModalState) && this.isLoading == emailUiState.isLoading;
    }

    public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState copy(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData, com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap componentStates, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState emailModalState, boolean isLoading) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentStates, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailModalState, "");
        return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState(emailData, componentStates, emailModalState, isLoading);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState getEmailModalState() {
        return this.emailModalState;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap getComponentStates() {
        return this.componentStates;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData getEmailData() {
        return this.emailData;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState copy$default(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState emailUiState, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData, com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState emailModalState, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            emailData = emailUiState.emailData;
        }
        if ((i & 2) != 0) {
            mutableComponentStateMap = emailUiState.componentStates;
        }
        if ((i & 4) != 0) {
            emailModalState = emailUiState.emailModalState;
        }
        if ((i & 8) != 0) {
            z = emailUiState.isLoading;
        }
        return emailUiState.copy(emailData, mutableComponentStateMap, emailModalState, z);
    }

    public EmailUiState() {
        this(null, null, null, false, 15, null);
    }
}
