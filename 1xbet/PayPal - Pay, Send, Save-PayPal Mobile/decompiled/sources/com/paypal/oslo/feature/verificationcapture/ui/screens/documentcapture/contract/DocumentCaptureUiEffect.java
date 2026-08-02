package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "NavigateBack", "NavigateToResult", "ShowToast", "HapticFeedback", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$HapticFeedback;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$NavigateToResult;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$ShowToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DocumentCaptureUiEffect extends com.paypal.oslo.core.mvi.UiEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateBack();
        private static final java.lang.String name = "DocumentCaptureUiEffect.NavigateBack";

        public final int hashCode() {
            return -1279996350;
        }

        private NavigateBack() {
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$NavigateToResult;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$NavigateToResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "getResult", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToResult implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult result;

        public NavigateToResult(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureResult, "");
            this.result = captureResult;
            this.name = "DocumentCaptureUiEffect.NavigateToResult";
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult getResult() {
            return this.result;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToResult(result=");
            sb.append(captureResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateToResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateToResult) other).result);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateToResult copy(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateToResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateToResult copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateToResult navigateToResult, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                captureResult = navigateToResult.result;
            }
            return navigateToResult.copy(captureResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$ShowToast;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String name;

        public ShowToast(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.name = "DocumentCaptureUiEffect.ShowToast";
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(message=");
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
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.ShowToast) other).message);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.ShowToast copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.ShowToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.ShowToast copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.ShowToast showToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showToast.message;
            }
            return showToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$HapticFeedback;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/HapticType;", "type", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/HapticType;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/HapticType;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/HapticType;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect$HapticFeedback;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/HapticType;", "getType", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HapticFeedback implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType type;

        public HapticFeedback(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType hapticType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hapticType, "");
            this.type = hapticType;
            this.name = "DocumentCaptureUiEffect.HapticFeedback";
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType getType() {
            return this.type;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType hapticType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HapticFeedback(type=");
            sb.append(hapticType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback) && this.type == ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback) other).type;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback copy(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback hapticFeedback, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType hapticType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                hapticType = hapticFeedback.type;
            }
            return hapticFeedback.copy(hapticType);
        }
    }
}
