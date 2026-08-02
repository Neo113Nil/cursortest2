package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToDialer", "CopyToClipboard", "ShowCancelPaymentBottomSheet", "DismissCancelPaymentBottomSheet", "NavigateBackWithCancelResult", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$CopyToClipboard;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$DismissCancelPaymentBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$NavigateBackWithCancelResult;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$NavigateToDialer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$ShowCancelPaymentBottomSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ActivityDetailUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBack();

        public final int hashCode() {
            return 765352815;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private ActivityDetailUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$NavigateToDialer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$NavigateToDialer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDialer extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToDialer(java.lang.String str) {
            super("NavigateToDialer", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDialer(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer navigateToDialer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToDialer.phoneNumber;
            }
            return navigateToDialer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$CopyToClipboard;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$CopyToClipboard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyToClipboard extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyToClipboard(java.lang.String str) {
            super("CopyToClipboard", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CopyToClipboard(text=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard) other).text);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard copy(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard(text);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard copyToClipboard, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = copyToClipboard.text;
            }
            return copyToClipboard.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$ShowCancelPaymentBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCancelPaymentBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.ShowCancelPaymentBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.ShowCancelPaymentBottomSheet();

        public final int hashCode() {
            return 1203262396;
        }

        private ShowCancelPaymentBottomSheet() {
            super("ShowCancelPaymentBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowCancelPaymentBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.ShowCancelPaymentBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$DismissCancelPaymentBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissCancelPaymentBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.DismissCancelPaymentBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.DismissCancelPaymentBottomSheet();

        public final int hashCode() {
            return 1679289851;
        }

        private DismissCancelPaymentBottomSheet() {
            super("DismissCancelPaymentBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissCancelPaymentBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.DismissCancelPaymentBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect$NavigateBackWithCancelResult;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithCancelResult extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBackWithCancelResult INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBackWithCancelResult();

        public final int hashCode() {
            return -380597076;
        }

        private NavigateBackWithCancelResult() {
            super("NavigateBackWithCancelResult", null);
        }

        public final java.lang.String toString() {
            return "NavigateBackWithCancelResult";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBackWithCancelResult)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ActivityDetailUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
