package com.paypal.oslo.feature.userprofile.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "", "<init>", "()V", "InvalidFileFormat", "FileTooLarge", "DmsUploadFailed", "DownloadLinkNotFound", "ProfileUpdateFailed", "UgcmValidationFailed", "FileReadError", "UserNotAuthenticated", "UnknownError", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$DmsUploadFailed;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$DownloadLinkNotFound;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$FileReadError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$FileTooLarge;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$InvalidFileFormat;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$ProfileUpdateFailed;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$UgcmValidationFailed;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$UnknownError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$UserNotAuthenticated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class PhotoUploadError {
    public static final int $stable = 0;

    private PhotoUploadError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$InvalidFileFormat;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidFileFormat extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.InvalidFileFormat INSTANCE = new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.InvalidFileFormat();

        public final int hashCode() {
            return -652537153;
        }

        private InvalidFileFormat() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InvalidFileFormat";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.InvalidFileFormat)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$FileTooLarge;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "", "actualSizeMB", "<init>", "(D)V", "component1", "()D", "copy", "(D)Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$FileTooLarge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "getActualSizeMB"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FileTooLarge extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        private final double actualSizeMB;

        public FileTooLarge(double d) {
            super(null);
            this.actualSizeMB = d;
        }

        public final double getActualSizeMB() {
            return this.actualSizeMB;
        }

        public final java.lang.String toString() {
            double d = this.actualSizeMB;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FileTooLarge(actualSizeMB=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Double.hashCode(this.actualSizeMB);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileTooLarge) && java.lang.Double.compare(this.actualSizeMB, ((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileTooLarge) other).actualSizeMB) == 0;
        }

        public final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileTooLarge copy(double actualSizeMB) {
            return new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileTooLarge(actualSizeMB);
        }

        /* renamed from: component1, reason: from getter */
        public final double getActualSizeMB() {
            return this.actualSizeMB;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileTooLarge copy$default(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileTooLarge fileTooLarge, double d, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = fileTooLarge.actualSizeMB;
            }
            return fileTooLarge.copy(d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$DmsUploadFailed;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$DmsUploadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DmsUploadFailed extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DmsUploadFailed(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DmsUploadFailed(message=");
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
            return (other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed) other).message);
        }

        public final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed copy$default(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed dmsUploadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dmsUploadFailed.message;
            }
            return dmsUploadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$DownloadLinkNotFound;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadLinkNotFound extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DownloadLinkNotFound INSTANCE = new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DownloadLinkNotFound();

        public final int hashCode() {
            return -779459012;
        }

        private DownloadLinkNotFound() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DownloadLinkNotFound";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DownloadLinkNotFound)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$ProfileUpdateFailed;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$ProfileUpdateFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileUpdateFailed extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProfileUpdateFailed(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileUpdateFailed(message=");
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
            return (other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed) other).message);
        }

        public final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed copy$default(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed profileUpdateFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = profileUpdateFailed.message;
            }
            return profileUpdateFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$UgcmValidationFailed;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/FailureMessage;", "failureMessage", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/model/FailureMessage;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/domain/model/FailureMessage;", "copy", "(Lcom/paypal/oslo/feature/userprofile/domain/model/FailureMessage;)Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$UgcmValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/domain/model/FailureMessage;", "getFailureMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UgcmValidationFailed extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.userprofile.domain.model.FailureMessage failureMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UgcmValidationFailed(com.paypal.oslo.feature.userprofile.domain.model.FailureMessage failureMessage) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureMessage, "");
            this.failureMessage = failureMessage;
        }

        public final com.paypal.oslo.feature.userprofile.domain.model.FailureMessage getFailureMessage() {
            return this.failureMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.userprofile.domain.model.FailureMessage failureMessage = this.failureMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UgcmValidationFailed(failureMessage=");
            sb.append(failureMessage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.failureMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.failureMessage, ((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed) other).failureMessage);
        }

        public final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed copy(com.paypal.oslo.feature.userprofile.domain.model.FailureMessage failureMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureMessage, "");
            return new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed(failureMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.domain.model.FailureMessage getFailureMessage() {
            return this.failureMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed copy$default(com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed ugcmValidationFailed, com.paypal.oslo.feature.userprofile.domain.model.FailureMessage failureMessage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                failureMessage = ugcmValidationFailed.failureMessage;
            }
            return ugcmValidationFailed.copy(failureMessage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$FileReadError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FileReadError extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileReadError INSTANCE = new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileReadError();

        public final int hashCode() {
            return -770990261;
        }

        private FileReadError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "FileReadError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileReadError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$UserNotAuthenticated;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserNotAuthenticated extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UserNotAuthenticated INSTANCE = new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UserNotAuthenticated();

        public final int hashCode() {
            return -198019822;
        }

        private UserNotAuthenticated() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UserNotAuthenticated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UserNotAuthenticated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError$UnknownError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UnknownError INSTANCE = new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UnknownError();

        public final int hashCode() {
            return 1044914665;
        }

        private UnknownError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnknownError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UnknownError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PhotoUploadError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
