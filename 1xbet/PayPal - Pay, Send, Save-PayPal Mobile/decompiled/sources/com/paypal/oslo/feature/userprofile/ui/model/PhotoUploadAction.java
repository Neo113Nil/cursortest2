package com.paypal.oslo.feature.userprofile.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;", "", "UploadPhoto", "DeletePhoto", "CancelOperation", "Reset", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$CancelOperation;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$DeletePhoto;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$Reset;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$UploadPhoto;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PhotoUploadAction {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$UploadPhoto;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;", "Landroid/net/Uri;", "photoUri", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$UploadPhoto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getPhotoUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UploadPhoto implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction {
        public static final int $stable = 8;
        private final android.net.Uri photoUri;

        public UploadPhoto(android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.photoUri = uri;
        }

        public final android.net.Uri getPhotoUri() {
            return this.photoUri;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.photoUri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadPhoto(photoUri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.photoUri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto) && kotlin.jvm.internal.Intrinsics.areEqual(this.photoUri, ((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto) other).photoUri);
        }

        public final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto copy(android.net.Uri photoUri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUri, "");
            return new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto(photoUri);
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getPhotoUri() {
            return this.photoUri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto copy$default(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto uploadPhoto, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = uploadPhoto.photoUri;
            }
            return uploadPhoto.copy(uri);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$DeletePhoto;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeletePhoto implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.DeletePhoto INSTANCE = new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.DeletePhoto();

        public final int hashCode() {
            return -1854925436;
        }

        private DeletePhoto() {
        }

        public final java.lang.String toString() {
            return "DeletePhoto";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.DeletePhoto)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$CancelOperation;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelOperation implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.CancelOperation INSTANCE = new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.CancelOperation();

        public final int hashCode() {
            return -10779702;
        }

        private CancelOperation() {
        }

        public final java.lang.String toString() {
            return "CancelOperation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.CancelOperation)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction$Reset;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Reset implements com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.Reset INSTANCE = new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.Reset();

        public final int hashCode() {
            return -274708148;
        }

        private Reset() {
        }

        public final java.lang.String toString() {
            return "Reset";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.Reset)) {
                return false;
            }
            return true;
        }
    }
}
