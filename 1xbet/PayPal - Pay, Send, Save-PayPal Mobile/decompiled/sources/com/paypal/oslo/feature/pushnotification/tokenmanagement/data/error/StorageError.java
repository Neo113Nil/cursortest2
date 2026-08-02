package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError;", "", "<init>", "()V", "ReadError", "WriteError", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError$ReadError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError$WriteError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class StorageError {
    public static final int $stable = 0;

    private StorageError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError$ReadError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError$ReadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadError extends com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError {
        public static final int $stable = 8;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadError(java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.throwable = th;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadError(throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError) other).throwable);
        }

        public final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError copy(java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError(throwable);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError copy$default(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.ReadError readError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = readError.throwable;
            }
            return readError.copy(th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError$WriteError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/error/StorageError$WriteError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WriteError extends com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError {
        public static final int $stable = 8;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriteError(java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.throwable = th;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WriteError(throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError) other).throwable);
        }

        public final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError copy(java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError(throwable);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError copy$default(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.error.StorageError.WriteError writeError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = writeError.throwable;
            }
            return writeError.copy(th);
        }
    }

    public /* synthetic */ StorageError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
