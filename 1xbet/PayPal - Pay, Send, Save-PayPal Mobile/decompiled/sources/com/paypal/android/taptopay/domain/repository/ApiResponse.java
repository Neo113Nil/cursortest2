package com.paypal.android.taptopay.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/ApiResponse;", "T", "", "Error", "Failure", "Success", "Lcom/paypal/android/taptopay/domain/repository/ApiResponse$Error;", "Lcom/paypal/android/taptopay/domain/repository/ApiResponse$Failure;", "Lcom/paypal/android/taptopay/domain/repository/ApiResponse$Success;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ApiResponse<T> {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/ApiResponse$Success;", "T", "Lcom/paypal/android/taptopay/domain/repository/ApiResponse;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/android/taptopay/domain/repository/ApiResponse$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success<T> implements com.paypal.android.taptopay.domain.repository.ApiResponse<T> {
        private final T data;

        public Success(T t) {
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            T t = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.android.taptopay.domain.repository.ApiResponse.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.android.taptopay.domain.repository.ApiResponse.Success) other).data);
        }

        public final com.paypal.android.taptopay.domain.repository.ApiResponse.Success<T> copy(T data) {
            return new com.paypal.android.taptopay.domain.repository.ApiResponse.Success<>(data);
        }

        public final T component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.android.taptopay.domain.repository.ApiResponse.Success copy$default(com.paypal.android.taptopay.domain.repository.ApiResponse.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/ApiResponse$Failure;", "Lcom/paypal/android/taptopay/domain/repository/ApiResponse;", "", "", "failureMessage", "", "httpExceptionCode", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/android/taptopay/domain/repository/ApiResponse$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getFailureMessage", com.visa.cbp.getEncExpo.warmup, "getHttpExceptionCode"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure implements com.paypal.android.taptopay.domain.repository.ApiResponse {
        private final java.lang.String failureMessage;
        private final int httpExceptionCode;

        public Failure(java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.failureMessage = str;
            this.httpExceptionCode = i;
        }

        public /* synthetic */ Failure(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? -1 : i);
        }

        public final java.lang.String getFailureMessage() {
            return this.failureMessage;
        }

        public final int getHttpExceptionCode() {
            return this.httpExceptionCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.failureMessage;
            int i = this.httpExceptionCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(failureMessage=");
            sb.append(str);
            sb.append(", httpExceptionCode=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.failureMessage.hashCode() * 31) + java.lang.Integer.hashCode(this.httpExceptionCode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.taptopay.domain.repository.ApiResponse.Failure)) {
                return false;
            }
            com.paypal.android.taptopay.domain.repository.ApiResponse.Failure failure = (com.paypal.android.taptopay.domain.repository.ApiResponse.Failure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.failureMessage, failure.failureMessage) && this.httpExceptionCode == failure.httpExceptionCode;
        }

        public final com.paypal.android.taptopay.domain.repository.ApiResponse.Failure copy(java.lang.String failureMessage, int httpExceptionCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureMessage, "");
            return new com.paypal.android.taptopay.domain.repository.ApiResponse.Failure(failureMessage, httpExceptionCode);
        }

        /* renamed from: component2, reason: from getter */
        public final int getHttpExceptionCode() {
            return this.httpExceptionCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFailureMessage() {
            return this.failureMessage;
        }

        public static /* synthetic */ com.paypal.android.taptopay.domain.repository.ApiResponse.Failure copy$default(com.paypal.android.taptopay.domain.repository.ApiResponse.Failure failure, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = failure.failureMessage;
            }
            if ((i2 & 2) != 0) {
                i = failure.httpExceptionCode;
            }
            return failure.copy(str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/ApiResponse$Error;", "Lcom/paypal/android/taptopay/domain/repository/ApiResponse;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.android.taptopay.domain.repository.ApiResponse {
        public static final com.paypal.android.taptopay.domain.repository.ApiResponse.Error INSTANCE = new com.paypal.android.taptopay.domain.repository.ApiResponse.Error();

        public final int hashCode() {
            return 1650730692;
        }

        private Error() {
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.taptopay.domain.repository.ApiResponse.Error)) {
                return false;
            }
            return true;
        }
    }
}
