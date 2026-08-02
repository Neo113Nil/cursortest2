package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceError;", "", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceError$ErrorCode;", "code", "", "message", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceError$ErrorCode;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceError$ErrorCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceError$ErrorCode;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceError$ErrorCode;", "getCode", "Ljava/lang/String;", "getMessage", "ErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DaonFaceError {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode code;
    private final java.lang.String message;

    public DaonFaceError(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode errorCode, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.code = errorCode;
        this.message = str;
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode getCode() {
        return this.code;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceError$ErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZATION_FAILED", "TIMEOUT", com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, "SDK_FAILURE", "UPLOAD_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorCode {
        private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode[] Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode INITIALIZATION_FAILED;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode SDK_FAILURE;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode TIMEOUT;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode UPLOAD_FAILED;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode USER_CANCELLED;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private ErrorCode(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode errorCode = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode("INITIALIZATION_FAILED", 0);
            INITIALIZATION_FAILED = errorCode;
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode errorCode2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode("TIMEOUT", 1);
            TIMEOUT = errorCode2;
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode errorCode3 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, 2);
            USER_CANCELLED = errorCode3;
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode errorCode4 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode("SDK_FAILURE", 3);
            SDK_FAILURE = errorCode4;
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode errorCode5 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode("UPLOAD_FAILED", 4);
            UPLOAD_FAILED = errorCode5;
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5};
            Camera2StreamConfigurationMap = errorCodeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(errorCodeArr);
        }

        public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode[] values() {
            return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode[]) Camera2StreamConfigurationMap.clone();
        }

        public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode errorCode = this.code;
        java.lang.String str = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DaonFaceError(code=");
        sb.append(errorCode);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.code.hashCode() * 31) + this.message.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError daonFaceError = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError) other;
        return this.code == daonFaceError.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, daonFaceError.message);
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError copy(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode code, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError(code, message);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode getCode() {
        return this.code;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError daonFaceError, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceError.ErrorCode errorCode, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            errorCode = daonFaceError.code;
        }
        if ((i & 2) != 0) {
            str = daonFaceError.message;
        }
        return daonFaceError.copy(errorCode, str);
    }
}
