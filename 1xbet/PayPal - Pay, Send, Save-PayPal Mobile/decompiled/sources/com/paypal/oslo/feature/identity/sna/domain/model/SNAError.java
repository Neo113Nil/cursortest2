package com.paypal.oslo.feature.identity.sna.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError;", "", "<init>", "()V", "Api", "InvalidOperation", "Unauthorized", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError$Api;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError$InvalidOperation;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError$Unauthorized;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SNAError {
    public static final int $stable = 0;

    private SNAError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError$Api;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError$Api;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Api extends com.paypal.oslo.feature.identity.sna.domain.model.SNAError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.ApiError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiError, "");
            this.error = apiError;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Api(error=");
            sb.append(apiError);
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
            return (other instanceof com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Api) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Api) other).error);
        }

        public final com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Api copy(com.paypal.oslo.feature.identity.shared.domain.model.ApiError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Api(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Api copy$default(com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Api api, com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                apiError = api.error;
            }
            return api.copy(apiError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError$InvalidOperation;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError$InvalidOperation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidOperation extends com.paypal.oslo.feature.identity.sna.domain.model.SNAError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidOperation(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidOperation(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.sna.domain.model.SNAError.InvalidOperation) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.sna.domain.model.SNAError.InvalidOperation) other).message);
        }

        public final com.paypal.oslo.feature.identity.sna.domain.model.SNAError.InvalidOperation copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.sna.domain.model.SNAError.InvalidOperation(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.domain.model.SNAError.InvalidOperation copy$default(com.paypal.oslo.feature.identity.sna.domain.model.SNAError.InvalidOperation invalidOperation, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidOperation.message;
            }
            return invalidOperation.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError$Unauthorized;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unauthorized extends com.paypal.oslo.feature.identity.sna.domain.model.SNAError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Unauthorized INSTANCE = new com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Unauthorized();

        public final int hashCode() {
            return 671080024;
        }

        private Unauthorized() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unauthorized";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.domain.model.SNAError.Unauthorized)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SNAError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
