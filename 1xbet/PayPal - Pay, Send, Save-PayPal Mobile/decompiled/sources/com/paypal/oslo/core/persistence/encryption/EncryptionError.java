package com.paypal.oslo.core.persistence.encryption;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/core/persistence/encryption/EncryptionError;", "", "<init>", "()V", "Failed", "FileIOError", "CryptoError", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$CryptoError;", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$Failed;", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$FileIOError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class EncryptionError {
    private EncryptionError() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$Failed;", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed extends com.paypal.oslo.core.persistence.encryption.EncryptionError {
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ Failed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.persistence.encryption.EncryptionError.Failed)) {
                return false;
            }
            com.paypal.oslo.core.persistence.encryption.EncryptionError.Failed failed = (com.paypal.oslo.core.persistence.encryption.EncryptionError.Failed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, failed.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, failed.cause);
        }

        public final com.paypal.oslo.core.persistence.encryption.EncryptionError.Failed copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.core.persistence.encryption.EncryptionError.Failed(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.core.persistence.encryption.EncryptionError.Failed copy$default(com.paypal.oslo.core.persistence.encryption.EncryptionError.Failed failed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            if ((i & 2) != 0) {
                th = failed.cause;
            }
            return failed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$FileIOError;", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$FileIOError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FileIOError extends com.paypal.oslo.core.persistence.encryption.EncryptionError {
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileIOError(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ FileIOError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FileIOError(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.persistence.encryption.EncryptionError.FileIOError)) {
                return false;
            }
            com.paypal.oslo.core.persistence.encryption.EncryptionError.FileIOError fileIOError = (com.paypal.oslo.core.persistence.encryption.EncryptionError.FileIOError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, fileIOError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, fileIOError.cause);
        }

        public final com.paypal.oslo.core.persistence.encryption.EncryptionError.FileIOError copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.core.persistence.encryption.EncryptionError.FileIOError(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.core.persistence.encryption.EncryptionError.FileIOError copy$default(com.paypal.oslo.core.persistence.encryption.EncryptionError.FileIOError fileIOError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fileIOError.message;
            }
            if ((i & 2) != 0) {
                th = fileIOError.cause;
            }
            return fileIOError.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$CryptoError;", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/core/persistence/encryption/EncryptionError$CryptoError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoError extends com.paypal.oslo.core.persistence.encryption.EncryptionError {
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoError(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ CryptoError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoError(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.persistence.encryption.EncryptionError.CryptoError)) {
                return false;
            }
            com.paypal.oslo.core.persistence.encryption.EncryptionError.CryptoError cryptoError = (com.paypal.oslo.core.persistence.encryption.EncryptionError.CryptoError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, cryptoError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, cryptoError.cause);
        }

        public final com.paypal.oslo.core.persistence.encryption.EncryptionError.CryptoError copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.core.persistence.encryption.EncryptionError.CryptoError(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.core.persistence.encryption.EncryptionError.CryptoError copy$default(com.paypal.oslo.core.persistence.encryption.EncryptionError.CryptoError cryptoError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoError.message;
            }
            if ((i & 2) != 0) {
                th = cryptoError.cause;
            }
            return cryptoError.copy(str, th);
        }
    }

    public /* synthetic */ EncryptionError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
