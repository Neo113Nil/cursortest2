package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/payair/model/Response;", "", "<init>", "()V", "Error", "Success", "Lcom/payair/model/Response$Error;", "Lcom/payair/model/Response$Success;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Response {

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/payair/model/Response$Error;", "Lcom/payair/model/Response;", "", "errorCode", "", "Lcom/payair/model/NetworkError;", "networkErrors", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/payair/model/Response$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "Ljava/util/List;", "getNetworkErrors"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends com.payair.model.Response {
        private final int errorCode;
        private final java.util.List<com.payair.model.NetworkError> networkErrors;

        public /* synthetic */ Error(int i, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final java.util.List<com.payair.model.NetworkError> getNetworkErrors() {
            return this.networkErrors;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i, java.util.List<com.payair.model.NetworkError> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errorCode = i;
            this.networkErrors = list;
        }

        public final java.lang.String toString() {
            int i = this.errorCode;
            java.util.List<com.payair.model.NetworkError> list = this.networkErrors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
            sb.append(i);
            sb.append(", networkErrors=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.networkErrors.hashCode() + (java.lang.Integer.hashCode(this.errorCode) * 31);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.payair.model.Response.Error)) {
                return false;
            }
            com.payair.model.Response.Error error = (com.payair.model.Response.Error) other;
            return this.errorCode == error.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.networkErrors, error.networkErrors);
        }

        public final com.payair.model.Response.Error copy(int errorCode, java.util.List<com.payair.model.NetworkError> networkErrors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkErrors, "");
            return new com.payair.model.Response.Error(errorCode, networkErrors);
        }

        public final java.util.List<com.payair.model.NetworkError> component2() {
            return this.networkErrors;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.payair.model.Response.Error copy$default(com.payair.model.Response.Error error, int i, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = error.errorCode;
            }
            if ((i2 & 2) != 0) {
                list = error.networkErrors;
            }
            return error.copy(i, list);
        }
    }

    public /* synthetic */ Response(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Response() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/payair/model/Response$Success;", "T", "Lcom/payair/model/Response;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/payair/model/Response$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.payair.model.Response {
        private final T data;

        public Success(T t) {
            super(null);
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
            return (other instanceof com.payair.model.Response.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.payair.model.Response.Success) other).data);
        }

        public final com.payair.model.Response.Success<T> copy(T data) {
            return new com.payair.model.Response.Success<>(data);
        }

        public final T component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.payair.model.Response.Success copy$default(com.payair.model.Response.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }
    }
}
