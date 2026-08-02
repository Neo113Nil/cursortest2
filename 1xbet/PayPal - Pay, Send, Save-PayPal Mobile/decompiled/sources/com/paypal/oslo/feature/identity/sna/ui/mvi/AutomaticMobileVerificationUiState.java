package com.paypal.oslo.feature.identity.sna.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Error;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Initial;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AutomaticMobileVerificationUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutomaticMobileVerificationUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Initial;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Initial INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Initial();

        public final int hashCode() {
            return -1824764340;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading();

        public final int hashCode() {
            return 858511428;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Success;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState;", "", "isEnabled", "", "Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;", "mobileNumbers", "showDisableConfirmation", "<init>", "(ZLjava/util/List;Z)V", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "copy", "(ZLjava/util/List;Z)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/util/List;", "getMobileNumbers", "getShowDisableConfirmation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState {
        public static final int $stable = 8;
        private final boolean isEnabled;
        private final java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> mobileNumbers;
        private final boolean showDisableConfirmation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(boolean z, java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> list, boolean z2) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.isEnabled = z;
            this.mobileNumbers = list;
            this.showDisableConfirmation = z2;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public /* synthetic */ Success(boolean z, java.util.List list, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z2);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> getMobileNumbers() {
            return this.mobileNumbers;
        }

        public final boolean getShowDisableConfirmation() {
            return this.showDisableConfirmation;
        }

        public final java.lang.String toString() {
            boolean z = this.isEnabled;
            java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> list = this.mobileNumbers;
            boolean z2 = this.showDisableConfirmation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(isEnabled=");
            sb.append(z);
            sb.append(", mobileNumbers=");
            sb.append(list);
            sb.append(", showDisableConfirmation=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Boolean.hashCode(this.isEnabled) * 31) + this.mobileNumbers.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showDisableConfirmation);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success success = (com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success) other;
            return this.isEnabled == success.isEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.mobileNumbers, success.mobileNumbers) && this.showDisableConfirmation == success.showDisableConfirmation;
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success copy(boolean isEnabled, java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> mobileNumbers, boolean showDisableConfirmation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileNumbers, "");
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success(isEnabled, mobileNumbers, showDisableConfirmation);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowDisableConfirmation() {
            return this.showDisableConfirmation;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData> component2() {
            return this.mobileNumbers;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success success, boolean z, java.util.List list, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = success.isEnabled;
            }
            if ((i & 2) != 0) {
                list = success.mobileNumbers;
            }
            if ((i & 4) != 0) {
                z2 = success.showDisableConfirmation;
            }
            return success.copy(z, list, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Error;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super("Error", null);
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
            return (other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ AutomaticMobileVerificationUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
