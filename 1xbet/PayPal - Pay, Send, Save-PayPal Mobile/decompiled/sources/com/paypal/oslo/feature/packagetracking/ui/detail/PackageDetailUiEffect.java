package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0014\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0014\u001e\u001f !\"#$%&'()*+,-./01"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowToast", "NavigateToCarrierTracking", "ShowErrorDialog", "CopyToClipboard", "ShowPackageOptionsSheet", "ShowRemovePackageSheet", "ShowRenamePackageSheet", "ShowMarkAsDeliveredSheet", "ShowPackageRemovedSuccess", "NavigateBack", "HideRemovePackageSheet", "HideRenamePackageSheet", "NavigateToPackageSettings", "NavigateToPackageSettingsForRelink", "OpenTrackingUrl", "OpenOrderManagementUrl", "MarkAsDeliveredSuccess", "HideMarkAsDeliveredSheet", "ShowAmazonTrackingPreferencesSheet", "ShowAmazonEmailNotLinkedSheet", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$CopyToClipboard;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$HideMarkAsDeliveredSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$HideRemovePackageSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$HideRenamePackageSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$MarkAsDeliveredSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateToCarrierTracking;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateToPackageSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateToPackageSettingsForRelink;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$OpenOrderManagementUrl;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$OpenTrackingUrl;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowAmazonEmailNotLinkedSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowAmazonTrackingPreferencesSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowErrorDialog;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowMarkAsDeliveredSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowPackageOptionsSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowPackageRemovedSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowRemovePackageSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowRenamePackageSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PackageDetailUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PackageDetailUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowToast;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "message", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToast(com.paypal.oslo.feature.packagetracking.domain.UiString uiString) {
            super("ShowToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            this.message = uiString;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(message=");
            sb.append(uiString);
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
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowToast) other).message);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowToast copy(com.paypal.oslo.feature.packagetracking.domain.UiString message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowToast copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowToast showToast, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = showToast.message;
            }
            return showToast.copy(uiString);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateToCarrierTracking;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "", "trackingUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateToCarrierTracking;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTrackingUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCarrierTracking extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String trackingUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCarrierTracking(java.lang.String str) {
            super("NavigateToCarrierTracking", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.trackingUrl = str;
        }

        public final java.lang.String getTrackingUrl() {
            return this.trackingUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.trackingUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCarrierTracking(trackingUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.trackingUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToCarrierTracking) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingUrl, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToCarrierTracking) other).trackingUrl);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToCarrierTracking copy(java.lang.String trackingUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingUrl, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToCarrierTracking(trackingUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTrackingUrl() {
            return this.trackingUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToCarrierTracking copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToCarrierTracking navigateToCarrierTracking, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCarrierTracking.trackingUrl;
            }
            return navigateToCarrierTracking.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowErrorDialog;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowErrorDialog;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowErrorDialog extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowErrorDialog(java.lang.String str, java.lang.String str2) {
            super("ShowErrorDialog", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.message = str2;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowErrorDialog(title=");
            sb.append(str);
            sb.append(", message=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowErrorDialog)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowErrorDialog showErrorDialog = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowErrorDialog) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, showErrorDialog.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, showErrorDialog.message);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowErrorDialog copy(java.lang.String title, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowErrorDialog(title, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowErrorDialog copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowErrorDialog showErrorDialog, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showErrorDialog.title;
            }
            if ((i & 2) != 0) {
                str2 = showErrorDialog.message;
            }
            return showErrorDialog.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$CopyToClipboard;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "label", "", "text", "confirmationMessage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$CopyToClipboard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getLabel", "Ljava/lang/String;", "getText", "getConfirmationMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyToClipboard extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString confirmationMessage;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString label;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyToClipboard(com.paypal.oslo.feature.packagetracking.domain.UiString uiString, java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2) {
            super("CopyToClipboard", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
            this.label = uiString;
            this.text = str;
            this.confirmationMessage = uiString2;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getLabel() {
            return this.label;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getConfirmationMessage() {
            return this.confirmationMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.label;
            java.lang.String str = this.text;
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString2 = this.confirmationMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CopyToClipboard(label=");
            sb.append(uiString);
            sb.append(", text=");
            sb.append(str);
            sb.append(", confirmationMessage=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.label.hashCode() * 31) + this.text.hashCode()) * 31) + this.confirmationMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard copyToClipboard = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.label, copyToClipboard.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, copyToClipboard.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationMessage, copyToClipboard.confirmationMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard copy(com.paypal.oslo.feature.packagetracking.domain.UiString label, java.lang.String text, com.paypal.oslo.feature.packagetracking.domain.UiString confirmationMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationMessage, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard(label, text, confirmationMessage);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getConfirmationMessage() {
            return this.confirmationMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getLabel() {
            return this.label;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard copyToClipboard, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = copyToClipboard.label;
            }
            if ((i & 2) != 0) {
                str = copyToClipboard.text;
            }
            if ((i & 4) != 0) {
                uiString2 = copyToClipboard.confirmationMessage;
            }
            return copyToClipboard.copy(uiString, str, uiString2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowPackageOptionsSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPackageOptionsSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowPackageOptionsSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowPackageOptionsSheet();

        public final int hashCode() {
            return -462154765;
        }

        private ShowPackageOptionsSheet() {
            super("ShowPackageOptionsSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowPackageOptionsSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowPackageOptionsSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowRemovePackageSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowRemovePackageSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowRemovePackageSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowRemovePackageSheet();

        public final int hashCode() {
            return -1422779727;
        }

        private ShowRemovePackageSheet() {
            super("ShowRemovePackageSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowRemovePackageSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowRemovePackageSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowRenamePackageSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowRenamePackageSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowRenamePackageSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowRenamePackageSheet();

        public final int hashCode() {
            return -1309142421;
        }

        private ShowRenamePackageSheet() {
            super("ShowRenamePackageSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowRenamePackageSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowRenamePackageSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowMarkAsDeliveredSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowMarkAsDeliveredSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowMarkAsDeliveredSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowMarkAsDeliveredSheet();

        public final int hashCode() {
            return -861183154;
        }

        private ShowMarkAsDeliveredSheet() {
            super("ShowMarkAsDeliveredSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowMarkAsDeliveredSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowMarkAsDeliveredSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowPackageRemovedSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPackageRemovedSuccess extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowPackageRemovedSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowPackageRemovedSuccess();

        public final int hashCode() {
            return -1129188971;
        }

        private ShowPackageRemovedSuccess() {
            super("ShowPackageRemovedSuccess", null);
        }

        public final java.lang.String toString() {
            return "ShowPackageRemovedSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowPackageRemovedSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateBack();

        public final int hashCode() {
            return -879115217;
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
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$HideRemovePackageSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HideRemovePackageSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideRemovePackageSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideRemovePackageSheet();

        public final int hashCode() {
            return -2044922442;
        }

        private HideRemovePackageSheet() {
            super("HideRemovePackageSheet", null);
        }

        public final java.lang.String toString() {
            return "HideRemovePackageSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideRemovePackageSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$HideRenamePackageSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HideRenamePackageSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideRenamePackageSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideRenamePackageSheet();

        public final int hashCode() {
            return -1931285136;
        }

        private HideRenamePackageSheet() {
            super("HideRenamePackageSheet", null);
        }

        public final java.lang.String toString() {
            return "HideRenamePackageSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideRenamePackageSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateToPackageSettings;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPackageSettings extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettings INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettings();

        public final int hashCode() {
            return 1603438662;
        }

        private NavigateToPackageSettings() {
            super("NavigateToPackageSettings", null);
        }

        public final java.lang.String toString() {
            return "NavigateToPackageSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateToPackageSettingsForRelink;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$NavigateToPackageSettingsForRelink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPackageSettingsForRelink extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPackageSettingsForRelink(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            super("NavigateToPackageSettingsForRelink", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPackageSettingsForRelink(emailProvider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettingsForRelink) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettingsForRelink) other).emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettingsForRelink copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettingsForRelink(emailProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettingsForRelink copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettingsForRelink navigateToPackageSettingsForRelink, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = navigateToPackageSettingsForRelink.emailProvider;
            }
            return navigateToPackageSettingsForRelink.copy(emailProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$OpenTrackingUrl;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$OpenTrackingUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenTrackingUrl extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        public OpenTrackingUrl(java.lang.String str) {
            super("OpenTrackingUrl", null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenTrackingUrl(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenTrackingUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenTrackingUrl) other).url);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenTrackingUrl copy(java.lang.String url) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenTrackingUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenTrackingUrl copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenTrackingUrl openTrackingUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openTrackingUrl.url;
            }
            return openTrackingUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$OpenOrderManagementUrl;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$OpenOrderManagementUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenOrderManagementUrl extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        public OpenOrderManagementUrl(java.lang.String str) {
            super("OpenOrderManagementUrl", null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenOrderManagementUrl(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenOrderManagementUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenOrderManagementUrl) other).url);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenOrderManagementUrl copy(java.lang.String url) {
            return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenOrderManagementUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenOrderManagementUrl copy$default(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenOrderManagementUrl openOrderManagementUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openOrderManagementUrl.url;
            }
            return openOrderManagementUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$MarkAsDeliveredSuccess;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MarkAsDeliveredSuccess extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.MarkAsDeliveredSuccess INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.MarkAsDeliveredSuccess();

        public final int hashCode() {
            return 1599053397;
        }

        private MarkAsDeliveredSuccess() {
            super("MarkAsDeliveredSuccess", null);
        }

        public final java.lang.String toString() {
            return "MarkAsDeliveredSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.MarkAsDeliveredSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$HideMarkAsDeliveredSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HideMarkAsDeliveredSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideMarkAsDeliveredSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideMarkAsDeliveredSheet();

        public final int hashCode() {
            return -1739878125;
        }

        private HideMarkAsDeliveredSheet() {
            super("HideMarkAsDeliveredSheet", null);
        }

        public final java.lang.String toString() {
            return "HideMarkAsDeliveredSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideMarkAsDeliveredSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowAmazonTrackingPreferencesSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAmazonTrackingPreferencesSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowAmazonTrackingPreferencesSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowAmazonTrackingPreferencesSheet();

        public final int hashCode() {
            return -1778598506;
        }

        private ShowAmazonTrackingPreferencesSheet() {
            super("ShowAmazonTrackingPreferencesSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowAmazonTrackingPreferencesSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowAmazonTrackingPreferencesSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect$ShowAmazonEmailNotLinkedSheet;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAmazonEmailNotLinkedSheet extends com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowAmazonEmailNotLinkedSheet INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowAmazonEmailNotLinkedSheet();

        public final int hashCode() {
            return 1531184695;
        }

        private ShowAmazonEmailNotLinkedSheet() {
            super("ShowAmazonEmailNotLinkedSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowAmazonEmailNotLinkedSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowAmazonEmailNotLinkedSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PackageDetailUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
