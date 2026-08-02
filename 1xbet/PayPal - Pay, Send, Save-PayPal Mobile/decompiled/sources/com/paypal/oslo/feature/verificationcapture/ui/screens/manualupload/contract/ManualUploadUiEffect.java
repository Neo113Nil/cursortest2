package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "ShowUploadMethodDialog", "ShowDeleteConfirmDialog", "ShowPermissionDialog", "RequestPermission", "OpenCamera", "OpenGallery", "OpenFilePicker", "LaunchSdkCapture", "NavigateToSettings", "ShowToast", "NotifyListener", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$LaunchSdkCapture;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$NavigateToSettings;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$NotifyListener;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$OpenCamera;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$OpenFilePicker;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$OpenGallery;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$RequestPermission;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowDeleteConfirmDialog;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowPermissionDialog;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowToast;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowUploadMethodDialog;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ManualUploadUiEffect extends com.paypal.oslo.core.mvi.UiEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowUploadMethodDialog;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowUploadMethodDialog implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowUploadMethodDialog INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowUploadMethodDialog();
        private static final java.lang.String name = "ManualUploadUiEffect.ShowUploadMethodDialog";

        public final int hashCode() {
            return -634389305;
        }

        private ShowUploadMethodDialog() {
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "ShowUploadMethodDialog";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowUploadMethodDialog)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowDeleteConfirmDialog;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "", "documentId", "documentName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowDeleteConfirmDialog;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId", "getDocumentName", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDeleteConfirmDialog implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        private final java.lang.String documentId;
        private final java.lang.String documentName;
        private final java.lang.String name;

        public ShowDeleteConfirmDialog(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.documentId = str;
            this.documentName = str2;
            this.name = "ManualUploadUiEffect.ShowDeleteConfirmDialog";
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final java.lang.String getDocumentName() {
            return this.documentName;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.String str2 = this.documentName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowDeleteConfirmDialog(documentId=");
            sb.append(str);
            sb.append(", documentName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.documentId.hashCode() * 31) + this.documentName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog showDeleteConfirmDialog = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, showDeleteConfirmDialog.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentName, showDeleteConfirmDialog.documentName);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog copy(java.lang.String documentId, java.lang.String documentName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentName, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog(documentId, documentName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDocumentName() {
            return this.documentName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog showDeleteConfirmDialog, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showDeleteConfirmDialog.documentId;
            }
            if ((i & 2) != 0) {
                str2 = showDeleteConfirmDialog.documentName;
            }
            return showDeleteConfirmDialog.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowPermissionDialog;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowPermissionDialog;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPermission", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPermissionDialog implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String permission;

        public ShowPermissionDialog(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.permission = str;
            this.name = "ManualUploadUiEffect.ShowPermissionDialog";
        }

        public final java.lang.String getPermission() {
            return this.permission;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.permission;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowPermissionDialog(permission=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.permission.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowPermissionDialog) && kotlin.jvm.internal.Intrinsics.areEqual(this.permission, ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowPermissionDialog) other).permission);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowPermissionDialog copy(java.lang.String permission) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowPermissionDialog(permission);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPermission() {
            return this.permission;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowPermissionDialog copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowPermissionDialog showPermissionDialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showPermissionDialog.permission;
            }
            return showPermissionDialog.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$RequestPermission;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$RequestPermission;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPermission", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestPermission implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String permission;

        public RequestPermission(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.permission = str;
            this.name = "ManualUploadUiEffect.RequestPermission";
        }

        public final java.lang.String getPermission() {
            return this.permission;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.permission;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestPermission(permission=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.permission.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.RequestPermission) && kotlin.jvm.internal.Intrinsics.areEqual(this.permission, ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.RequestPermission) other).permission);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.RequestPermission copy(java.lang.String permission) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.RequestPermission(permission);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPermission() {
            return this.permission;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.RequestPermission copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.RequestPermission requestPermission, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = requestPermission.permission;
            }
            return requestPermission.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$OpenCamera;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenCamera implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenCamera INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenCamera();
        private static final java.lang.String name = "ManualUploadUiEffect.OpenCamera";

        public final int hashCode() {
            return -2097501489;
        }

        private OpenCamera() {
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "OpenCamera";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenCamera)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$OpenGallery;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "", "maxFiles", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$OpenGallery;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenGallery implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        private final int maxFiles;
        private final java.lang.String name = "ManualUploadUiEffect.OpenGallery";

        public OpenGallery(int i) {
            this.maxFiles = i;
        }

        public final int getMaxFiles() {
            return this.maxFiles;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            int i = this.maxFiles;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenGallery(maxFiles=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.maxFiles);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenGallery) && this.maxFiles == ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenGallery) other).maxFiles;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenGallery copy(int maxFiles) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenGallery(maxFiles);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxFiles() {
            return this.maxFiles;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenGallery copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenGallery openGallery, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = openGallery.maxFiles;
            }
            return openGallery.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$OpenFilePicker;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "", "", "mimeTypes", "", "maxFiles", "<init>", "(Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$OpenFilePicker;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMimeTypes", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenFilePicker implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 8;
        private final int maxFiles;
        private final java.util.List<java.lang.String> mimeTypes;
        private final java.lang.String name;

        public OpenFilePicker(java.util.List<java.lang.String> list, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.mimeTypes = list;
            this.maxFiles = i;
            this.name = "ManualUploadUiEffect.OpenFilePicker";
        }

        public final java.util.List<java.lang.String> getMimeTypes() {
            return this.mimeTypes;
        }

        public final int getMaxFiles() {
            return this.maxFiles;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.mimeTypes;
            int i = this.maxFiles;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenFilePicker(mimeTypes=");
            sb.append(list);
            sb.append(", maxFiles=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.mimeTypes.hashCode() * 31) + java.lang.Integer.hashCode(this.maxFiles);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker openFilePicker = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.mimeTypes, openFilePicker.mimeTypes) && this.maxFiles == openFilePicker.maxFiles;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker copy(java.util.List<java.lang.String> mimeTypes, int maxFiles) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeTypes, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker(mimeTypes, maxFiles);
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxFiles() {
            return this.maxFiles;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.mimeTypes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker openFilePicker, java.util.List list, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = openFilePicker.mimeTypes;
            }
            if ((i2 & 2) != 0) {
                i = openFilePicker.maxFiles;
            }
            return openFilePicker.copy(list, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$LaunchSdkCapture;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "", "maxFiles", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$LaunchSdkCapture;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchSdkCapture implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        private final int maxFiles;
        private final java.lang.String name = "ManualUploadUiEffect.LaunchSdkCapture";

        public LaunchSdkCapture(int i) {
            this.maxFiles = i;
        }

        public final int getMaxFiles() {
            return this.maxFiles;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            int i = this.maxFiles;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchSdkCapture(maxFiles=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.maxFiles);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture) && this.maxFiles == ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture) other).maxFiles;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture copy(int maxFiles) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture(maxFiles);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxFiles() {
            return this.maxFiles;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture launchSdkCapture, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = launchSdkCapture.maxFiles;
            }
            return launchSdkCapture.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$NavigateToSettings;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSettings implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NavigateToSettings INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NavigateToSettings();
        private static final java.lang.String name = "ManualUploadUiEffect.NavigateToSettings";

        public final int hashCode() {
            return -965541681;
        }

        private NavigateToSettings() {
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "NavigateToSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NavigateToSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowToast;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String name;

        public ShowToast(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.name = "ManualUploadUiEffect.ShowToast";
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
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowToast) other).message);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowToast copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowToast copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowToast showToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showToast.message;
            }
            return showToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00158\u0017X\u0097D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$NotifyListener;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ListenerStatus;", "status", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ListenerStatus;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ListenerStatus;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ListenerStatus;Ljava/lang/Object;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect$NotifyListener;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ListenerStatus;", "getStatus", "Ljava/lang/Object;", "getData", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotifyListener implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect {
        public static final int $stable = 8;
        private final java.lang.Object data;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus status;

        public NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listenerStatus, "");
            this.status = listenerStatus;
            this.data = obj;
            this.name = "ManualUploadUiEffect.NotifyListener";
        }

        public /* synthetic */ NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(listenerStatus, (i & 2) != 0 ? null : obj);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getData() {
            return this.data;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus = this.status;
            java.lang.Object obj = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifyListener(status=");
            sb.append(listenerStatus);
            sb.append(", data=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            java.lang.Object obj = this.data;
            return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener notifyListener = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener) other;
            return this.status == notifyListener.status && kotlin.jvm.internal.Intrinsics.areEqual(this.data, notifyListener.data);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener copy(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus status, java.lang.Object data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(status, data);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getData() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener notifyListener, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                listenerStatus = notifyListener.status;
            }
            if ((i & 2) != 0) {
                obj = notifyListener.data;
            }
            return notifyListener.copy(listenerStatus, obj);
        }
    }
}
