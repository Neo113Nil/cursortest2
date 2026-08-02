package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Content", "Error", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState$Content;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState$Error;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PostOnboardingUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState$Loading;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState;", "", "retryCount", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "trigger", "<init>", "(ILcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "copy", "(ILcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "getTrigger"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState {
        public static final int $stable = 0;
        private final int retryCount;
        private final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent trigger;

        public Loading(int i, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent postOnboardingEvent) {
            super("Loading", null);
            this.retryCount = i;
            this.trigger = postOnboardingEvent;
        }

        public /* synthetic */ Loading(int i, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent postOnboardingEvent, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : postOnboardingEvent);
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent getTrigger() {
            return this.trigger;
        }

        public final java.lang.String toString() {
            int i = this.retryCount;
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent postOnboardingEvent = this.trigger;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(retryCount=");
            sb.append(i);
            sb.append(", trigger=");
            sb.append(postOnboardingEvent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.retryCount);
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent postOnboardingEvent = this.trigger;
            return (hashCode * 31) + (postOnboardingEvent == null ? 0 : postOnboardingEvent.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading loading = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading) other;
            return this.retryCount == loading.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.trigger, loading.trigger);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading copy(int retryCount, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent trigger) {
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading(retryCount, trigger);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent getTrigger() {
            return this.trigger;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading loading, int i, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent postOnboardingEvent, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = loading.retryCount;
            }
            if ((i2 & 2) != 0) {
                postOnboardingEvent = loading.trigger;
            }
            return loading.copy(i, postOnboardingEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }
    }

    private PostOnboardingUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState$Content;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Content INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Content();

        public final int hashCode() {
            return 546403160;
        }

        private Content() {
            super("Content", null);
        }

        public final java.lang.String toString() {
            return "Content";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Content)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState$Error;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;", "errorType", "", "retryCount", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "trigger", "<init>", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;ILcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;", "component2", "()I", "component3", "()Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "copy", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;ILcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;)Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingEvent;", "getTrigger"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType errorType;
        private final int retryCount;
        private final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent trigger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType postOnboardingErrorType, int i, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent postOnboardingEvent) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingEvent, "");
            this.errorType = postOnboardingErrorType;
            this.retryCount = i;
            this.trigger = postOnboardingEvent;
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent getTrigger() {
            return this.trigger;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType postOnboardingErrorType = this.errorType;
            int i = this.retryCount;
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent postOnboardingEvent = this.trigger;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(postOnboardingErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", trigger=");
            sb.append(postOnboardingEvent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorType.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount)) * 31) + this.trigger.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error error = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, error.errorType) && this.retryCount == error.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.trigger, error.trigger);
        }

        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error copy(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType errorType, int retryCount, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent trigger) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trigger, "");
            return new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error(errorType, retryCount, trigger);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent getTrigger() {
            return this.trigger;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error copy$default(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error error, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType postOnboardingErrorType, int i, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent postOnboardingEvent, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                postOnboardingErrorType = error.errorType;
            }
            if ((i2 & 2) != 0) {
                i = error.retryCount;
            }
            if ((i2 & 4) != 0) {
                postOnboardingEvent = error.trigger;
            }
            return error.copy(postOnboardingErrorType, i, postOnboardingEvent);
        }
    }

    public /* synthetic */ PostOnboardingUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
