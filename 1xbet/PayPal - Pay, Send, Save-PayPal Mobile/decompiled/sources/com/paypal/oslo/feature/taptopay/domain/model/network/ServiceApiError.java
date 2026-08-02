package com.paypal.oslo.feature.taptopay.domain.model.network;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError;", "", "Offline", "ResponseError", "DefaultError", "Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError$Offline;", "Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError$ResponseError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ServiceApiError {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError$Offline;", "Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Offline implements com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.Offline INSTANCE = new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.Offline();

        public final int hashCode() {
            return -848427076;
        }

        private Offline() {
        }

        public final java.lang.String toString() {
            return "Offline";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.Offline)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError$ResponseError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError;", "", "responseCode", "", "errorBody", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError$ResponseError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getResponseCode", "Ljava/lang/String;", "getErrorBody"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResponseError implements com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError {
        public static final int $stable = 0;
        private final java.lang.String errorBody;
        private final int responseCode;

        public ResponseError(int i, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.responseCode = i;
            this.errorBody = str;
        }

        public final java.lang.String getErrorBody() {
            return this.errorBody;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        public final java.lang.String toString() {
            int i = this.responseCode;
            java.lang.String str = this.errorBody;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseError(responseCode=");
            sb.append(i);
            sb.append(", errorBody=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.responseCode) * 31) + this.errorBody.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError responseError = (com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError) other;
            return this.responseCode == responseError.responseCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorBody, responseError.errorBody);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError copy(int responseCode, java.lang.String errorBody) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorBody, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError(responseCode, errorBody);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorBody() {
            return this.errorBody;
        }

        /* renamed from: component1, reason: from getter */
        public final int getResponseCode() {
            return this.responseCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError copy$default(com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError responseError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = responseError.responseCode;
            }
            if ((i2 & 2) != 0) {
                str = responseError.errorBody;
            }
            return responseError.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError$DefaultError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError$DefaultError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DefaultError implements com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError {
        public static final int $stable = 8;
        private final java.lang.Throwable throwable;

        public DefaultError(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.throwable = th;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultError(throwable=");
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
            return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError) other).throwable);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError copy(java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError(throwable);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError copy$default(com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError defaultError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = defaultError.throwable;
            }
            return defaultError.copy(th);
        }
    }
}
