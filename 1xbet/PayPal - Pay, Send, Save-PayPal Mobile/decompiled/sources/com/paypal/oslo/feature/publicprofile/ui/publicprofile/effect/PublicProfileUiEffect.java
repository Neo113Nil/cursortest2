package com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowBottomSheet", "ShowToast", "NavigateBackWithResult", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$NavigateBackWithResult;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$ShowBottomSheet;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$ShowToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PublicProfileUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$ShowBottomSheet;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "sheetType", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$ShowBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/components/PublicProfileBottomSheetType;", "getSheetType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowBottomSheet extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType sheetType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowBottomSheet(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType publicProfileBottomSheetType) {
            super("ShowBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileBottomSheetType, "");
            this.sheetType = publicProfileBottomSheetType;
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType getSheetType() {
            return this.sheetType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType publicProfileBottomSheetType = this.sheetType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowBottomSheet(sheetType=");
            sb.append(publicProfileBottomSheetType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sheetType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.sheetType, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet) other).sheetType);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet copy(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType sheetType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sheetType, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet(sheetType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType getSheetType() {
            return this.sheetType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet showBottomSheet, com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType publicProfileBottomSheetType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfileBottomSheetType = showBottomSheet.sheetType;
            }
            return showBottomSheet.copy(publicProfileBottomSheetType);
        }
    }

    private PublicProfileUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$ShowToast;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "message", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToast(com.paypal.oslo.core.commonui.utils.RefText refText) {
            super("ShowToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.message = refText;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(message=");
            sb.append(refText);
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
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast) other).message);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast copy(com.paypal.oslo.core.commonui.utils.RefText message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast showToast, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = showToast.message;
            }
            return showToast.copy(refText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$NavigateBackWithResult;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "result", "<init>", "(Lcom/paypal/oslo/core/navigation/result/NavResult;)V", "component1", "()Lcom/paypal/oslo/core/navigation/result/NavResult;", "copy", "(Lcom/paypal/oslo/core/navigation/result/NavResult;)Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect$NavigateBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithResult extends com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.navigation.result.NavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBackWithResult(com.paypal.oslo.core.navigation.result.NavResult navResult) {
            super("NavigateBackWithResult", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResult, "");
            this.result = navResult;
        }

        public final com.paypal.oslo.core.navigation.result.NavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.navigation.result.NavResult navResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithResult(result=");
            sb.append(navResult);
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
            return (other instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult) other).result);
        }

        public final com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult copy(com.paypal.oslo.core.navigation.result.NavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.navigation.result.NavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult copy$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult navigateBackWithResult, com.paypal.oslo.core.navigation.result.NavResult navResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navResult = navigateBackWithResult.result;
            }
            return navigateBackWithResult.copy(navResult);
        }
    }

    public /* synthetic */ PublicProfileUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
