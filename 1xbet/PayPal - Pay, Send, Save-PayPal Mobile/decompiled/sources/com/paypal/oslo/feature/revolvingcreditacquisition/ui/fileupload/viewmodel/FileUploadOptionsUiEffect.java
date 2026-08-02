package com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "RequestCameraPermission", "LaunchCamera", "LaunchPhotoPicker", "LaunchDocumentPicker", "NavigateToSettings", "ReturnResult", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$LaunchCamera;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$LaunchDocumentPicker;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$LaunchPhotoPicker;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$NavigateToSettings;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$RequestCameraPermission;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$ReturnResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class FileUploadOptionsUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private FileUploadOptionsUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$RequestCameraPermission;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestCameraPermission extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.RequestCameraPermission INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.RequestCameraPermission();

        public final int hashCode() {
            return -1108050395;
        }

        private RequestCameraPermission() {
            super("RequestCameraPermission", null);
        }

        public final java.lang.String toString() {
            return "RequestCameraPermission";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.RequestCameraPermission)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$LaunchCamera;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchCamera extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchCamera INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchCamera();

        public final int hashCode() {
            return -1528395946;
        }

        private LaunchCamera() {
            super("LaunchCamera", null);
        }

        public final java.lang.String toString() {
            return "LaunchCamera";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchCamera)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$LaunchPhotoPicker;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchPhotoPicker extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchPhotoPicker INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchPhotoPicker();

        public final int hashCode() {
            return 846297039;
        }

        private LaunchPhotoPicker() {
            super("LaunchPhotoPicker", null);
        }

        public final java.lang.String toString() {
            return "LaunchPhotoPicker";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchPhotoPicker)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$LaunchDocumentPicker;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchDocumentPicker extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchDocumentPicker INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchDocumentPicker();

        public final int hashCode() {
            return -402634566;
        }

        private LaunchDocumentPicker() {
            super("LaunchDocumentPicker", null);
        }

        public final java.lang.String toString() {
            return "LaunchDocumentPicker";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchDocumentPicker)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$NavigateToSettings;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSettings extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.NavigateToSettings INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.NavigateToSettings();

        public final int hashCode() {
            return -2110118867;
        }

        private NavigateToSettings() {
            super("NavigateToSettings", null);
        }

        public final java.lang.String toString() {
            return "NavigateToSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.NavigateToSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$ReturnResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect$ReturnResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReturnResult extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect {
        public static final int $stable = 8;
        private final android.net.Uri uri;

        public ReturnResult(android.net.Uri uri) {
            super("ReturnResult", null);
            this.uri = uri;
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.uri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReturnResult(uri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            android.net.Uri uri = this.uri;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult) other).uri);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult copy(android.net.Uri uri) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult returnResult, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = returnResult.uri;
            }
            return returnResult.copy(uri);
        }
    }

    public /* synthetic */ FileUploadOptionsUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
