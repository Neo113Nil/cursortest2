package com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "", "<init>", "()V", "MobileDataDisabled", "NetworkTimeout", "NetworkUnavailable", "HttpError", "EvUrlVerificationFailed", "MissingVerifyId", "MissingEvUrl", "ValidationFailed", "UnknownError", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$EvUrlVerificationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$HttpError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$MissingEvUrl;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$MissingVerifyId;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$MobileDataDisabled;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$NetworkTimeout;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$NetworkUnavailable;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$UnknownError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$ValidationFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class SnaError {
    public static final int $stable = 0;

    private SnaError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$MobileDataDisabled;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MobileDataDisabled extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MobileDataDisabled INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MobileDataDisabled();

        public final int hashCode() {
            return 624261427;
        }

        private MobileDataDisabled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MobileDataDisabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MobileDataDisabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$NetworkTimeout;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkTimeout extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkTimeout INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkTimeout();

        public final int hashCode() {
            return 1740954622;
        }

        private NetworkTimeout() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NetworkTimeout";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkTimeout)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$NetworkUnavailable;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkUnavailable extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable();

        public final int hashCode() {
            return 1436078189;
        }

        private NetworkUnavailable() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NetworkUnavailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkUnavailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$HttpError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCode", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HttpError extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 0;
        private final int code;
        private final java.lang.String message;

        public HttpError(int i, java.lang.String str) {
            super(null);
            this.code = i;
            this.message = str;
        }

        public final int getCode() {
            return this.code;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(code=");
            sb.append(i);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.code);
            java.lang.String str = this.message;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.HttpError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.HttpError httpError = (com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.HttpError) other;
            return this.code == httpError.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, httpError.message);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.HttpError copy(int code, java.lang.String message) {
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.HttpError(code, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.HttpError copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.HttpError httpError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.code;
            }
            if ((i2 & 2) != 0) {
                str = httpError.message;
            }
            return httpError.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$EvUrlVerificationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "", "errorCode", "", "errorDescription", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$EvUrlVerificationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getErrorCode", "Ljava/lang/String;", "getErrorDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EvUrlVerificationFailed extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 0;
        private final java.lang.Integer errorCode;
        private final java.lang.String errorDescription;

        public EvUrlVerificationFailed(java.lang.Integer num, java.lang.String str) {
            super(null);
            this.errorCode = num;
            this.errorDescription = str;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.errorCode;
            java.lang.String str = this.errorDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EvUrlVerificationFailed(errorCode=");
            sb.append(num);
            sb.append(", errorDescription=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.errorCode;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.String str = this.errorDescription;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.EvUrlVerificationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.EvUrlVerificationFailed evUrlVerificationFailed = (com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.EvUrlVerificationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, evUrlVerificationFailed.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, evUrlVerificationFailed.errorDescription);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.EvUrlVerificationFailed copy(java.lang.Integer errorCode, java.lang.String errorDescription) {
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.EvUrlVerificationFailed(errorCode, errorDescription);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.EvUrlVerificationFailed copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.EvUrlVerificationFailed evUrlVerificationFailed, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = evUrlVerificationFailed.errorCode;
            }
            if ((i & 2) != 0) {
                str = evUrlVerificationFailed.errorDescription;
            }
            return evUrlVerificationFailed.copy(num, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$MissingVerifyId;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingVerifyId extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MissingVerifyId INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MissingVerifyId();

        public final int hashCode() {
            return 377162671;
        }

        private MissingVerifyId() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MissingVerifyId";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MissingVerifyId)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$MissingEvUrl;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingEvUrl extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MissingEvUrl INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MissingEvUrl();

        public final int hashCode() {
            return -888445789;
        }

        private MissingEvUrl() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MissingEvUrl";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MissingEvUrl)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationFailed extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.ValidationFailed INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.ValidationFailed();

        public final int hashCode() {
            return 199412737;
        }

        private ValidationFailed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ValidationFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.ValidationFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$UnknownError;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError {
        public static final int $stable = 8;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.throwable = th;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(throwable=");
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
            return (other instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.UnknownError) other).throwable);
        }

        public final com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.UnknownError copy(java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            return new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.UnknownError(throwable);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.UnknownError copy$default(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.UnknownError unknownError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = unknownError.throwable;
            }
            return unknownError.copy(th);
        }
    }

    public /* synthetic */ SnaError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
