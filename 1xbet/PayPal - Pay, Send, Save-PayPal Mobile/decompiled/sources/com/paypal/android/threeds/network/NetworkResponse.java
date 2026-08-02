package com.paypal.android.threeds.network;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b"}, d2 = {"Lcom/paypal/android/threeds/network/NetworkResponse;", "T", "", "<init>", "()V", "Success", "Error", "Lcom/paypal/android/threeds/network/NetworkResponse$Error;", "Lcom/paypal/android/threeds/network/NetworkResponse$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class NetworkResponse<T> {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/network/NetworkResponse$Success;", "T", "Lcom/paypal/android/threeds/network/NetworkResponse;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isMockedResponse", "<init>", "(Ljava/lang/Object;Z)V", "component1", "()Ljava/lang/Object;", "component2", "()Z", "copy", "(Ljava/lang/Object;Z)Lcom/paypal/android/threeds/network/NetworkResponse$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.paypal.android.threeds.network.NetworkResponse<T> {
        public static final int $stable = 0;
        private final T data;
        private final boolean isMockedResponse;

        public Success(T t, boolean z) {
            super(null);
            this.data = t;
            this.isMockedResponse = z;
        }

        public /* synthetic */ Success(java.lang.Object obj, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? false : z);
        }

        public final T getData() {
            return this.data;
        }

        public final boolean isMockedResponse() {
            return this.isMockedResponse;
        }

        public final java.lang.String toString() {
            T t = this.data;
            boolean z = this.isMockedResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(t);
            sb.append(", isMockedResponse=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            T t = this.data;
            return ((t == null ? 0 : t.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isMockedResponse);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.android.threeds.network.NetworkResponse.Success)) {
                return false;
            }
            com.paypal.android.threeds.network.NetworkResponse.Success success = (com.paypal.android.threeds.network.NetworkResponse.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, success.data) && this.isMockedResponse == success.isMockedResponse;
        }

        public final com.paypal.android.threeds.network.NetworkResponse.Success<T> copy(T data, boolean isMockedResponse) {
            return new com.paypal.android.threeds.network.NetworkResponse.Success<>(data, isMockedResponse);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMockedResponse() {
            return this.isMockedResponse;
        }

        public final T component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.android.threeds.network.NetworkResponse.Success copy$default(com.paypal.android.threeds.network.NetworkResponse.Success success, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            if ((i & 2) != 0) {
                z = success.isMockedResponse;
            }
            return success.copy(obj, z);
        }
    }

    private NetworkResponse() {
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/android/threeds/network/NetworkResponse$Error;", "T", "Lcom/paypal/android/threeds/network/NetworkResponse;", "Lretrofit2/Response;", "errorResponse", "<init>", "(Lretrofit2/Response;)V", "component1", "()Lretrofit2/Response;", "copy", "(Lretrofit2/Response;)Lcom/paypal/android/threeds/network/NetworkResponse$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lretrofit2/Response;", "getErrorResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error<T> extends com.paypal.android.threeds.network.NetworkResponse<T> {
        public static final int $stable = 8;
        private final retrofit2.Response<T> errorResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(retrofit2.Response<T> response) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            this.errorResponse = response;
        }

        public final retrofit2.Response<T> getErrorResponse() {
            return this.errorResponse;
        }

        public final java.lang.String toString() {
            retrofit2.Response<T> response = this.errorResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorResponse=");
            sb.append(response);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorResponse.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.android.threeds.network.NetworkResponse.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorResponse, ((com.paypal.android.threeds.network.NetworkResponse.Error) other).errorResponse);
        }

        public final com.paypal.android.threeds.network.NetworkResponse.Error<T> copy(retrofit2.Response<T> errorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResponse, "");
            return new com.paypal.android.threeds.network.NetworkResponse.Error<>(errorResponse);
        }

        public final retrofit2.Response<T> component1() {
            return this.errorResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.android.threeds.network.NetworkResponse.Error copy$default(com.paypal.android.threeds.network.NetworkResponse.Error error, retrofit2.Response response, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                response = error.errorResponse;
            }
            return error.copy(response);
        }
    }

    public /* synthetic */ NetworkResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
