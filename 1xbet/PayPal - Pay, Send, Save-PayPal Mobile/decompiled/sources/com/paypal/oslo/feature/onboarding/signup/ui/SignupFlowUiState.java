package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState;", "", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState$Error;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState$Loading;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SignupFlowUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState$Loading;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Loading INSTANCE = new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Loading();

        public final int hashCode() {
            return 1871961983;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState$Success;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "pageConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "topBarConfig", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "copy", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;)Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "getPageConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "getTopBarConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig;
        private final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig;

        public Success(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
            this.pageConfig = pageConfig;
            this.topBarConfig = topBarConfig;
        }

        public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig getPageConfig() {
            return this.pageConfig;
        }

        public final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig getTopBarConfig() {
            return this.topBarConfig;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig = this.pageConfig;
            com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = this.topBarConfig;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(pageConfig=");
            sb.append(pageConfig);
            sb.append(", topBarConfig=");
            sb.append(topBarConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.pageConfig.hashCode() * 31) + this.topBarConfig.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success success = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.pageConfig, success.pageConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.topBarConfig, success.topBarConfig);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success copy(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success(pageConfig, topBarConfig);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig getTopBarConfig() {
            return this.topBarConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig getPageConfig() {
            return this.pageConfig;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success copy$default(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success success, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pageConfig = success.pageConfig;
            }
            if ((i & 2) != 0) {
                topBarConfig = success.topBarConfig;
            }
            return success.copy(pageConfig, topBarConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState$Error;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Error(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Error copy$default(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }
}
