package com.paypal.oslo.feature.qrc.domain.error;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "", "<init>", "()V", "", "isRecoverable", "()Z", "HttpError", "NoInternet", "Unknown", "AcquisitionDataError", "RiskDecline", "InternalServerError", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$AcquisitionDataError;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$HttpError;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$InternalServerError;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$NoInternet;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$RiskDecline;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class QrcDataResultError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$HttpError;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "", "code", "", "message", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCode", "Ljava/lang/String;", "getMessage", "getBody"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HttpError extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError {
        public static final int $stable = 0;
        private final java.lang.String body;
        private final int code;
        private final java.lang.String message;

        public HttpError(int i, java.lang.String str, java.lang.String str2) {
            super(null);
            this.code = i;
            this.message = str;
            this.body = str2;
        }

        public /* synthetic */ HttpError(int i, java.lang.String str, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2);
        }

        public final int getCode() {
            return this.code;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getBody() {
            return this.body;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.String str = this.message;
            java.lang.String str2 = this.body;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(code=");
            sb.append(i);
            sb.append(", message=");
            sb.append(str);
            sb.append(", body=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.code);
            java.lang.String str = this.message;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.body;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError httpError = (com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError) other;
            return this.code == httpError.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, httpError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpError.body);
        }

        public final com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError copy(int code, java.lang.String message, java.lang.String body) {
            return new com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError(code, message, body);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBody() {
            return this.body;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError copy$default(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError httpError, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.code;
            }
            if ((i2 & 2) != 0) {
                str = httpError.message;
            }
            if ((i2 & 4) != 0) {
                str2 = httpError.body;
            }
            return httpError.copy(i, str, str2);
        }
    }

    private QrcDataResultError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$NoInternet;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoInternet extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.NoInternet INSTANCE = new com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.NoInternet();

        public final int hashCode() {
            return 1017414718;
        }

        private NoInternet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoInternet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.NoInternet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$Unknown;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown INSTANCE = new com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown();

        public final int hashCode() {
            return -1909660242;
        }

        private Unknown() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$AcquisitionDataError;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AcquisitionDataError extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.AcquisitionDataError INSTANCE = new com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.AcquisitionDataError();

        public final int hashCode() {
            return -1398270835;
        }

        private AcquisitionDataError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AcquisitionDataError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.AcquisitionDataError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$RiskDecline;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RiskDecline extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.RiskDecline INSTANCE = new com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.RiskDecline();

        public final int hashCode() {
            return 559775883;
        }

        private RiskDecline() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RiskDecline";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.RiskDecline)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError$InternalServerError;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InternalServerError extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.InternalServerError INSTANCE = new com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.InternalServerError();

        public final int hashCode() {
            return -1246019348;
        }

        private InternalServerError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InternalServerError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.InternalServerError)) {
                return false;
            }
            return true;
        }
    }

    public final boolean isRecoverable() {
        return this instanceof com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.NoInternet;
    }

    public /* synthetic */ QrcDataResultError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
