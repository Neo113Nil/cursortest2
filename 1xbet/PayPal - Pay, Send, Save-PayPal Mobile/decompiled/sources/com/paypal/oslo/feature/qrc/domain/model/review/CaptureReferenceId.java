package com.paypal.oslo.feature.qrc.domain.model.review;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId;", "", "<init>", "()V", "QrCodeReferenceId", "SessionId", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId$QrCodeReferenceId;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId$SessionId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CaptureReferenceId {
    public static final int $stable = 0;

    private CaptureReferenceId() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId$QrCodeReferenceId;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId;", "", "qrCodeReferenceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId$QrCodeReferenceId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQrCodeReferenceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QrCodeReferenceId extends com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId {
        public static final int $stable = 0;
        private final java.lang.String qrCodeReferenceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QrCodeReferenceId(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.qrCodeReferenceId = str;
        }

        public final java.lang.String getQrCodeReferenceId() {
            return this.qrCodeReferenceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.qrCodeReferenceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QrCodeReferenceId(qrCodeReferenceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.qrCodeReferenceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.QrCodeReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeReferenceId, ((com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.QrCodeReferenceId) other).qrCodeReferenceId);
        }

        public final com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.QrCodeReferenceId copy(java.lang.String qrCodeReferenceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeReferenceId, "");
            return new com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.QrCodeReferenceId(qrCodeReferenceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQrCodeReferenceId() {
            return this.qrCodeReferenceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.QrCodeReferenceId copy$default(com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.QrCodeReferenceId qrCodeReferenceId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = qrCodeReferenceId.qrCodeReferenceId;
            }
            return qrCodeReferenceId.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId$SessionId;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId;", "", "sessionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId$SessionId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SessionId extends com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId {
        public static final int $stable = 0;
        private final java.lang.String sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionId(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.sessionId = str;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sessionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionId(sessionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, ((com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId) other).sessionId);
        }

        public final com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId copy(java.lang.String sessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            return new com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId(sessionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId copy$default(com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId sessionId, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sessionId.sessionId;
            }
            return sessionId.copy(str);
        }
    }

    public /* synthetic */ CaptureReferenceId(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
