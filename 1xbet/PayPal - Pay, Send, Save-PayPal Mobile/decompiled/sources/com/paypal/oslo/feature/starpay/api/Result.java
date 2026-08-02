package com.paypal.oslo.feature.starpay.api;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Result;", "SuccessType", "", "<init>", "()V", "Success", "Failure", "Lcom/paypal/oslo/feature/starpay/api/Result$Failure;", "Lcom/paypal/oslo/feature/starpay/api/Result$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class Result<SuccessType> {
    public static final int $stable = 0;

    private Result() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Result$Success;", "SuccessType", "Lcom/paypal/oslo/feature/starpay/api/Result;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/starpay/api/Result$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success<SuccessType> extends com.paypal.oslo.feature.starpay.api.Result<SuccessType> {
        public static final int $stable = 0;
        private final SuccessType data;

        public Success(SuccessType successtype) {
            super(null);
            this.data = successtype;
        }

        public final SuccessType getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            SuccessType successtype = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(successtype);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            SuccessType successtype = this.data;
            if (successtype == null) {
                return 0;
            }
            return successtype.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.starpay.api.Result.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.starpay.api.Result.Success) other).data);
        }

        public final com.paypal.oslo.feature.starpay.api.Result.Success<SuccessType> copy(SuccessType data) {
            return new com.paypal.oslo.feature.starpay.api.Result.Success<>(data);
        }

        public final SuccessType component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.starpay.api.Result.Success copy$default(com.paypal.oslo.feature.starpay.api.Result.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/Result$Failure;", "Lcom/paypal/oslo/feature/starpay/api/Result;", "", "Lcom/paypal/oslo/feature/starpay/api/Error;", "error", "<init>", "(Lcom/paypal/oslo/feature/starpay/api/Error;)V", "component1", "()Lcom/paypal/oslo/feature/starpay/api/Error;", "copy", "(Lcom/paypal/oslo/feature/starpay/api/Error;)Lcom/paypal/oslo/feature/starpay/api/Result$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/starpay/api/Error;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure extends com.paypal.oslo.feature.starpay.api.Result {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.starpay.api.Error error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.paypal.oslo.feature.starpay.api.Error error) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            this.error = error;
        }

        public final com.paypal.oslo.feature.starpay.api.Error getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.starpay.api.Error error = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(error=");
            sb.append(error);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.starpay.api.Result.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.starpay.api.Result.Failure) other).error);
        }

        public final com.paypal.oslo.feature.starpay.api.Result.Failure copy(com.paypal.oslo.feature.starpay.api.Error error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.starpay.api.Result.Failure(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.starpay.api.Error getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.starpay.api.Result.Failure copy$default(com.paypal.oslo.feature.starpay.api.Result.Failure failure, com.paypal.oslo.feature.starpay.api.Error error, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                error = failure.error;
            }
            return failure.copy(error);
        }
    }

    public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
