package okhttp3.internal.http2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lokhttp3/internal/http2/ErrorCode;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "httpCode", com.visa.cbp.getEncExpo.warmup, "getHttpCode", "()I", "Companion", "NO_ERROR", "PROTOCOL_ERROR", "INTERNAL_ERROR", "FLOW_CONTROL_ERROR", "SETTINGS_TIMEOUT", "STREAM_CLOSED", "FRAME_SIZE_ERROR", "REFUSED_STREAM", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCEL, "COMPRESSION_ERROR", "CONNECT_ERROR", "ENHANCE_YOUR_CALM", "INADEQUATE_SECURITY", "HTTP_1_1_REQUIRED"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorCode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ okhttp3.internal.http2.ErrorCode[] $VALUES;
    public static final okhttp3.internal.http2.ErrorCode CANCEL;
    public static final okhttp3.internal.http2.ErrorCode COMPRESSION_ERROR;
    public static final okhttp3.internal.http2.ErrorCode CONNECT_ERROR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http2.ErrorCode.Companion INSTANCE;
    public static final okhttp3.internal.http2.ErrorCode ENHANCE_YOUR_CALM;
    public static final okhttp3.internal.http2.ErrorCode FLOW_CONTROL_ERROR;
    public static final okhttp3.internal.http2.ErrorCode FRAME_SIZE_ERROR;
    public static final okhttp3.internal.http2.ErrorCode HTTP_1_1_REQUIRED;
    public static final okhttp3.internal.http2.ErrorCode INADEQUATE_SECURITY;
    public static final okhttp3.internal.http2.ErrorCode INTERNAL_ERROR;
    public static final okhttp3.internal.http2.ErrorCode NO_ERROR;
    public static final okhttp3.internal.http2.ErrorCode PROTOCOL_ERROR;
    public static final okhttp3.internal.http2.ErrorCode REFUSED_STREAM;
    public static final okhttp3.internal.http2.ErrorCode SETTINGS_TIMEOUT;
    public static final okhttp3.internal.http2.ErrorCode STREAM_CLOSED;
    private final int httpCode;

    private ErrorCode(java.lang.String str, int i, int i2) {
        this.httpCode = i2;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    static {
        okhttp3.internal.http2.ErrorCode errorCode = new okhttp3.internal.http2.ErrorCode("NO_ERROR", 0, 0);
        NO_ERROR = errorCode;
        okhttp3.internal.http2.ErrorCode errorCode2 = new okhttp3.internal.http2.ErrorCode("PROTOCOL_ERROR", 1, 1);
        PROTOCOL_ERROR = errorCode2;
        okhttp3.internal.http2.ErrorCode errorCode3 = new okhttp3.internal.http2.ErrorCode("INTERNAL_ERROR", 2, 2);
        INTERNAL_ERROR = errorCode3;
        okhttp3.internal.http2.ErrorCode errorCode4 = new okhttp3.internal.http2.ErrorCode("FLOW_CONTROL_ERROR", 3, 3);
        FLOW_CONTROL_ERROR = errorCode4;
        okhttp3.internal.http2.ErrorCode errorCode5 = new okhttp3.internal.http2.ErrorCode("SETTINGS_TIMEOUT", 4, 4);
        SETTINGS_TIMEOUT = errorCode5;
        okhttp3.internal.http2.ErrorCode errorCode6 = new okhttp3.internal.http2.ErrorCode("STREAM_CLOSED", 5, 5);
        STREAM_CLOSED = errorCode6;
        okhttp3.internal.http2.ErrorCode errorCode7 = new okhttp3.internal.http2.ErrorCode("FRAME_SIZE_ERROR", 6, 6);
        FRAME_SIZE_ERROR = errorCode7;
        okhttp3.internal.http2.ErrorCode errorCode8 = new okhttp3.internal.http2.ErrorCode("REFUSED_STREAM", 7, 7);
        REFUSED_STREAM = errorCode8;
        okhttp3.internal.http2.ErrorCode errorCode9 = new okhttp3.internal.http2.ErrorCode(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCEL, 8, 8);
        CANCEL = errorCode9;
        okhttp3.internal.http2.ErrorCode errorCode10 = new okhttp3.internal.http2.ErrorCode("COMPRESSION_ERROR", 9, 9);
        COMPRESSION_ERROR = errorCode10;
        okhttp3.internal.http2.ErrorCode errorCode11 = new okhttp3.internal.http2.ErrorCode("CONNECT_ERROR", 10, 10);
        CONNECT_ERROR = errorCode11;
        okhttp3.internal.http2.ErrorCode errorCode12 = new okhttp3.internal.http2.ErrorCode("ENHANCE_YOUR_CALM", 11, 11);
        ENHANCE_YOUR_CALM = errorCode12;
        okhttp3.internal.http2.ErrorCode errorCode13 = new okhttp3.internal.http2.ErrorCode("INADEQUATE_SECURITY", 12, 12);
        INADEQUATE_SECURITY = errorCode13;
        okhttp3.internal.http2.ErrorCode errorCode14 = new okhttp3.internal.http2.ErrorCode("HTTP_1_1_REQUIRED", 13, 13);
        HTTP_1_1_REQUIRED = errorCode14;
        okhttp3.internal.http2.ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, errorCode9, errorCode10, errorCode11, errorCode12, errorCode13, errorCode14};
        $VALUES = errorCodeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(errorCodeArr);
        INSTANCE = new okhttp3.internal.http2.ErrorCode.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/internal/http2/ErrorCode$Companion;", "", "<init>", "()V", "", "code", "Lokhttp3/internal/http2/ErrorCode;", "fromHttp2", "(I)Lokhttp3/internal/http2/ErrorCode;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.http2.ErrorCode fromHttp2(int code) {
            for (okhttp3.internal.http2.ErrorCode errorCode : okhttp3.internal.http2.ErrorCode.values()) {
                if (errorCode.getHttpCode() == code) {
                    return errorCode;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static okhttp3.internal.http2.ErrorCode[] values() {
        return (okhttp3.internal.http2.ErrorCode[]) $VALUES.clone();
    }

    public static okhttp3.internal.http2.ErrorCode valueOf(java.lang.String str) {
        return (okhttp3.internal.http2.ErrorCode) java.lang.Enum.valueOf(okhttp3.internal.http2.ErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<okhttp3.internal.http2.ErrorCode> getEntries() {
        return $ENTRIES;
    }
}
