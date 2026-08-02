package com.paypal.oslo.feature.userprofile.ui.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "", "Idle", "Uploading", "DeletingInProgress", "Success", "Error", "UgcmError", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$DeletingInProgress;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Error;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Idle;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Success;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$UgcmError;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Uploading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PhotoUploadUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Idle;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Idle INSTANCE = new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Idle();

        public final int hashCode() {
            return -750924102;
        }

        private Idle() {
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Uploading;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Uploading implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Uploading INSTANCE = new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Uploading();

        public final int hashCode() {
            return 1458704155;
        }

        private Uploading() {
        }

        public final java.lang.String toString() {
            return "Uploading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Uploading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$DeletingInProgress;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeletingInProgress implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.DeletingInProgress INSTANCE = new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.DeletingInProgress();

        public final int hashCode() {
            return -1068035936;
        }

        private DeletingInProgress() {
        }

        public final java.lang.String toString() {
            return "DeletingInProgress";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.DeletingInProgress)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Success;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Success INSTANCE = new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Success();

        public final int hashCode() {
            return -1826717859;
        }

        private Success() {
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Error;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState {
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
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error copy$default(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$UgcmError;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "", "errorCode", "errorMessage", "Landroid/net/Uri;", "photoUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState$UgcmError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorMessage", "Landroid/net/Uri;", "getPhotoUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UgcmError implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState {
        public static final int $stable = 8;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final android.net.Uri photoUri;

        public UgcmError(java.lang.String str, java.lang.String str2, android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.errorCode = str;
            this.errorMessage = str2;
            this.photoUri = uri;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final android.net.Uri getPhotoUri() {
            return this.photoUri;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorMessage;
            android.net.Uri uri = this.photoUri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UgcmError(errorCode=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(", photoUri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorCode.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + this.photoUri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError ugcmError = (com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ugcmError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ugcmError.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.photoUri, ugcmError.photoUri);
        }

        public final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError copy(java.lang.String errorCode, java.lang.String errorMessage, android.net.Uri photoUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUri, "");
            return new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError(errorCode, errorMessage, photoUri);
        }

        /* renamed from: component3, reason: from getter */
        public final android.net.Uri getPhotoUri() {
            return this.photoUri;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError copy$default(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError ugcmError, java.lang.String str, java.lang.String str2, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ugcmError.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = ugcmError.errorMessage;
            }
            if ((i & 4) != 0) {
                uri = ugcmError.photoUri;
            }
            return ugcmError.copy(str, str2, uri);
        }
    }
}
