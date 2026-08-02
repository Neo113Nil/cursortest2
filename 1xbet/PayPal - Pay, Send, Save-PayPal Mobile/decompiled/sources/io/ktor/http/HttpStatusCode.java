package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\tJ$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lio/ktor/http/HttpStatusCode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "(Ljava/lang/String;)Lio/ktor/http/HttpStatusCode;", "compareTo", "(Lio/ktor/http/HttpStatusCode;)I", "component1", "component2", "copy", "(ILjava/lang/String;)Lio/ktor/http/HttpStatusCode;", com.visa.cbp.getEncExpo.warmup, "getValue", "Ljava/lang/String;", "getDescription", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HttpStatusCode implements java.lang.Comparable<io.ktor.http.HttpStatusCode> {
    private static final java.util.List<io.ktor.http.HttpStatusCode> allStatusCodes;
    private static final java.util.Map<java.lang.Integer, io.ktor.http.HttpStatusCode> getHighSpeedVideoFpsRanges;
    private final java.lang.String description;
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.HttpStatusCode.Companion INSTANCE = new io.ktor.http.HttpStatusCode.Companion(null);
    private static final io.ktor.http.HttpStatusCode Continue = new io.ktor.http.HttpStatusCode(100, "Continue");
    private static final io.ktor.http.HttpStatusCode SwitchingProtocols = new io.ktor.http.HttpStatusCode(101, "Switching Protocols");
    private static final io.ktor.http.HttpStatusCode Processing = new io.ktor.http.HttpStatusCode(102, "Processing");
    private static final io.ktor.http.HttpStatusCode OK = new io.ktor.http.HttpStatusCode(200, com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton);
    private static final io.ktor.http.HttpStatusCode Created = new io.ktor.http.HttpStatusCode(201, "Created");
    private static final io.ktor.http.HttpStatusCode Accepted = new io.ktor.http.HttpStatusCode(202, "Accepted");
    private static final io.ktor.http.HttpStatusCode NonAuthoritativeInformation = new io.ktor.http.HttpStatusCode(203, "Non-Authoritative Information");
    private static final io.ktor.http.HttpStatusCode NoContent = new io.ktor.http.HttpStatusCode(204, "No Content");
    private static final io.ktor.http.HttpStatusCode ResetContent = new io.ktor.http.HttpStatusCode(205, "Reset Content");
    private static final io.ktor.http.HttpStatusCode PartialContent = new io.ktor.http.HttpStatusCode(206, "Partial Content");
    private static final io.ktor.http.HttpStatusCode MultiStatus = new io.ktor.http.HttpStatusCode(207, "Multi-Status");
    private static final io.ktor.http.HttpStatusCode MultipleChoices = new io.ktor.http.HttpStatusCode(300, "Multiple Choices");
    private static final io.ktor.http.HttpStatusCode MovedPermanently = new io.ktor.http.HttpStatusCode(301, "Moved Permanently");
    private static final io.ktor.http.HttpStatusCode Found = new io.ktor.http.HttpStatusCode(302, "Found");
    private static final io.ktor.http.HttpStatusCode SeeOther = new io.ktor.http.HttpStatusCode(303, "See Other");
    private static final io.ktor.http.HttpStatusCode NotModified = new io.ktor.http.HttpStatusCode(304, "Not Modified");
    private static final io.ktor.http.HttpStatusCode UseProxy = new io.ktor.http.HttpStatusCode(305, "Use Proxy");
    private static final io.ktor.http.HttpStatusCode SwitchProxy = new io.ktor.http.HttpStatusCode(306, "Switch Proxy");
    private static final io.ktor.http.HttpStatusCode TemporaryRedirect = new io.ktor.http.HttpStatusCode(307, "Temporary Redirect");
    private static final io.ktor.http.HttpStatusCode PermanentRedirect = new io.ktor.http.HttpStatusCode(308, "Permanent Redirect");
    private static final io.ktor.http.HttpStatusCode BadRequest = new io.ktor.http.HttpStatusCode(400, "Bad Request");
    private static final io.ktor.http.HttpStatusCode Unauthorized = new io.ktor.http.HttpStatusCode(401, "Unauthorized");
    private static final io.ktor.http.HttpStatusCode PaymentRequired = new io.ktor.http.HttpStatusCode(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY, "Payment Required");
    private static final io.ktor.http.HttpStatusCode Forbidden = new io.ktor.http.HttpStatusCode(403, "Forbidden");
    private static final io.ktor.http.HttpStatusCode NotFound = new io.ktor.http.HttpStatusCode(404, "Not Found");
    private static final io.ktor.http.HttpStatusCode MethodNotAllowed = new io.ktor.http.HttpStatusCode(com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED, "Method Not Allowed");
    private static final io.ktor.http.HttpStatusCode NotAcceptable = new io.ktor.http.HttpStatusCode(406, "Not Acceptable");
    private static final io.ktor.http.HttpStatusCode ProxyAuthenticationRequired = new io.ktor.http.HttpStatusCode(407, "Proxy Authentication Required");
    private static final io.ktor.http.HttpStatusCode RequestTimeout = new io.ktor.http.HttpStatusCode(408, "Request Timeout");
    private static final io.ktor.http.HttpStatusCode Conflict = new io.ktor.http.HttpStatusCode(409, "Conflict");
    private static final io.ktor.http.HttpStatusCode Gone = new io.ktor.http.HttpStatusCode(410, "Gone");
    private static final io.ktor.http.HttpStatusCode LengthRequired = new io.ktor.http.HttpStatusCode(411, "Length Required");
    private static final io.ktor.http.HttpStatusCode PreconditionFailed = new io.ktor.http.HttpStatusCode(412, "Precondition Failed");
    private static final io.ktor.http.HttpStatusCode PayloadTooLarge = new io.ktor.http.HttpStatusCode(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE, "Payload Too Large");
    private static final io.ktor.http.HttpStatusCode RequestURITooLong = new io.ktor.http.HttpStatusCode(414, "Request-URI Too Long");
    private static final io.ktor.http.HttpStatusCode UnsupportedMediaType = new io.ktor.http.HttpStatusCode(415, "Unsupported Media Type");
    private static final io.ktor.http.HttpStatusCode RequestedRangeNotSatisfiable = new io.ktor.http.HttpStatusCode(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE, "Requested Range Not Satisfiable");
    private static final io.ktor.http.HttpStatusCode ExpectationFailed = new io.ktor.http.HttpStatusCode(417, "Expectation Failed");
    private static final io.ktor.http.HttpStatusCode UnprocessableEntity = new io.ktor.http.HttpStatusCode(422, "Unprocessable Entity");
    private static final io.ktor.http.HttpStatusCode Locked = new io.ktor.http.HttpStatusCode(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked");
    private static final io.ktor.http.HttpStatusCode FailedDependency = new io.ktor.http.HttpStatusCode(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency");
    private static final io.ktor.http.HttpStatusCode TooEarly = new io.ktor.http.HttpStatusCode(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, "Too Early");
    private static final io.ktor.http.HttpStatusCode UpgradeRequired = new io.ktor.http.HttpStatusCode(426, "Upgrade Required");
    private static final io.ktor.http.HttpStatusCode TooManyRequests = new io.ktor.http.HttpStatusCode(429, "Too Many Requests");
    private static final io.ktor.http.HttpStatusCode RequestHeaderFieldTooLarge = new io.ktor.http.HttpStatusCode(431, "Request Header Fields Too Large");
    private static final io.ktor.http.HttpStatusCode InternalServerError = new io.ktor.http.HttpStatusCode(500, "Internal Server Error");
    private static final io.ktor.http.HttpStatusCode NotImplemented = new io.ktor.http.HttpStatusCode(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING, "Not Implemented");
    private static final io.ktor.http.HttpStatusCode BadGateway = new io.ktor.http.HttpStatusCode(502, "Bad Gateway");
    private static final io.ktor.http.HttpStatusCode ServiceUnavailable = new io.ktor.http.HttpStatusCode(503, "Service Unavailable");
    private static final io.ktor.http.HttpStatusCode GatewayTimeout = new io.ktor.http.HttpStatusCode(504, "Gateway Timeout");
    private static final io.ktor.http.HttpStatusCode VersionNotSupported = new io.ktor.http.HttpStatusCode(505, "HTTP Version Not Supported");
    private static final io.ktor.http.HttpStatusCode VariantAlsoNegotiates = new io.ktor.http.HttpStatusCode(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X, "Variant Also Negotiates");
    private static final io.ktor.http.HttpStatusCode InsufficientStorage = new io.ktor.http.HttpStatusCode(507, "Insufficient Storage");

    public HttpStatusCode(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = i;
        this.description = str;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.value);
        sb.append(' ');
        sb.append(this.description);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof io.ktor.http.HttpStatusCode) && ((io.ktor.http.HttpStatusCode) other).value == this.value;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.value);
    }

    public final io.ktor.http.HttpStatusCode description(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return copy$default(this, 0, value, 1, null);
    }

    @Override // java.lang.Comparable
    public final int compareTo(io.ktor.http.HttpStatusCode other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return this.value - other.value;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u001a\u0010'\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u001a\u0010+\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u0010-\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u001a\u0010/\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u001a\u00101\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u001a\u00103\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR\u001a\u00105\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR\u001a\u00107\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR\u001a\u00109\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\fR\u001a\u0010;\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u001a\u0010=\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\fR\u001a\u0010?\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b@\u0010\fR\u001a\u0010A\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u001a\u0010C\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\fR\u001a\u0010E\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\fR\u001a\u0010G\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR\u001a\u0010I\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u001a\u0010K\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\n\u001a\u0004\bL\u0010\fR\u001a\u0010M\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u001a\u0010O\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\bP\u0010\fR\u001a\u0010Q\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\fR\u001a\u0010S\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010\fR\u001a\u0010U\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\n\u001a\u0004\bV\u0010\fR\u001a\u0010W\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\fR\u001a\u0010Y\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\fR\u001a\u0010[\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\n\u001a\u0004\b\\\u0010\fR\u001a\u0010]\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u0010\fR\u001a\u0010_\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u001a\u0010a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010\n\u001a\u0004\bb\u0010\fR\u001a\u0010c\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\fR\u001a\u0010e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010\n\u001a\u0004\bf\u0010\fR\u001a\u0010g\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010\n\u001a\u0004\bh\u0010\fR\u001a\u0010i\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010\n\u001a\u0004\bj\u0010\fR\u001a\u0010k\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010\fR\u001a\u0010m\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010\n\u001a\u0004\bn\u0010\fR\u001a\u0010o\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010\n\u001a\u0004\bp\u0010\fR\u001a\u0010q\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010\fR\u001a\u0010s\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010\n\u001a\u0004\bt\u0010\fR \u0010v\u001a\b\u0012\u0004\u0012\u00020\u00060u8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR \u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b{\u0010|"}, d2 = {"Lio/ktor/http/HttpStatusCode$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lio/ktor/http/HttpStatusCode;", "fromValue", "(I)Lio/ktor/http/HttpStatusCode;", "Continue", "Lio/ktor/http/HttpStatusCode;", "getContinue", "()Lio/ktor/http/HttpStatusCode;", "SwitchingProtocols", "getSwitchingProtocols", "Processing", "getProcessing", com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, "getOK", "Created", "getCreated", "Accepted", "getAccepted", "NonAuthoritativeInformation", "getNonAuthoritativeInformation", "NoContent", "getNoContent", "ResetContent", "getResetContent", "PartialContent", "getPartialContent", "MultiStatus", "getMultiStatus", "MultipleChoices", "getMultipleChoices", "MovedPermanently", "getMovedPermanently", "Found", "getFound", "SeeOther", "getSeeOther", "NotModified", "getNotModified", "UseProxy", "getUseProxy", "SwitchProxy", "getSwitchProxy", "TemporaryRedirect", "getTemporaryRedirect", "PermanentRedirect", "getPermanentRedirect", "BadRequest", "getBadRequest", "Unauthorized", "getUnauthorized", "PaymentRequired", "getPaymentRequired", "Forbidden", "getForbidden", "NotFound", "getNotFound", "MethodNotAllowed", "getMethodNotAllowed", "NotAcceptable", "getNotAcceptable", "ProxyAuthenticationRequired", "getProxyAuthenticationRequired", "RequestTimeout", "getRequestTimeout", "Conflict", "getConflict", "Gone", "getGone", "LengthRequired", "getLengthRequired", "PreconditionFailed", "getPreconditionFailed", "PayloadTooLarge", "getPayloadTooLarge", "RequestURITooLong", "getRequestURITooLong", "UnsupportedMediaType", "getUnsupportedMediaType", "RequestedRangeNotSatisfiable", "getRequestedRangeNotSatisfiable", "ExpectationFailed", "getExpectationFailed", "UnprocessableEntity", "getUnprocessableEntity", "Locked", "getLocked", "FailedDependency", "getFailedDependency", "TooEarly", "getTooEarly", "UpgradeRequired", "getUpgradeRequired", "TooManyRequests", "getTooManyRequests", "RequestHeaderFieldTooLarge", "getRequestHeaderFieldTooLarge", "InternalServerError", "getInternalServerError", "NotImplemented", "getNotImplemented", "BadGateway", "getBadGateway", "ServiceUnavailable", "getServiceUnavailable", "GatewayTimeout", "getGatewayTimeout", "VersionNotSupported", "getVersionNotSupported", "VariantAlsoNegotiates", "getVariantAlsoNegotiates", "InsufficientStorage", "getInsufficientStorage", "", "allStatusCodes", "Ljava/util/List;", "getAllStatusCodes", "()Ljava/util/List;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.http.HttpStatusCode getContinue() {
            return io.ktor.http.HttpStatusCode.Continue;
        }

        public final io.ktor.http.HttpStatusCode getSwitchingProtocols() {
            return io.ktor.http.HttpStatusCode.SwitchingProtocols;
        }

        public final io.ktor.http.HttpStatusCode getProcessing() {
            return io.ktor.http.HttpStatusCode.Processing;
        }

        public final io.ktor.http.HttpStatusCode getOK() {
            return io.ktor.http.HttpStatusCode.OK;
        }

        public final io.ktor.http.HttpStatusCode getCreated() {
            return io.ktor.http.HttpStatusCode.Created;
        }

        public final io.ktor.http.HttpStatusCode getAccepted() {
            return io.ktor.http.HttpStatusCode.Accepted;
        }

        public final io.ktor.http.HttpStatusCode getNonAuthoritativeInformation() {
            return io.ktor.http.HttpStatusCode.NonAuthoritativeInformation;
        }

        public final io.ktor.http.HttpStatusCode getNoContent() {
            return io.ktor.http.HttpStatusCode.NoContent;
        }

        public final io.ktor.http.HttpStatusCode getResetContent() {
            return io.ktor.http.HttpStatusCode.ResetContent;
        }

        public final io.ktor.http.HttpStatusCode getPartialContent() {
            return io.ktor.http.HttpStatusCode.PartialContent;
        }

        public final io.ktor.http.HttpStatusCode getMultiStatus() {
            return io.ktor.http.HttpStatusCode.MultiStatus;
        }

        public final io.ktor.http.HttpStatusCode getMultipleChoices() {
            return io.ktor.http.HttpStatusCode.MultipleChoices;
        }

        public final io.ktor.http.HttpStatusCode getMovedPermanently() {
            return io.ktor.http.HttpStatusCode.MovedPermanently;
        }

        public final io.ktor.http.HttpStatusCode getFound() {
            return io.ktor.http.HttpStatusCode.Found;
        }

        public final io.ktor.http.HttpStatusCode getSeeOther() {
            return io.ktor.http.HttpStatusCode.SeeOther;
        }

        public final io.ktor.http.HttpStatusCode getNotModified() {
            return io.ktor.http.HttpStatusCode.NotModified;
        }

        public final io.ktor.http.HttpStatusCode getUseProxy() {
            return io.ktor.http.HttpStatusCode.UseProxy;
        }

        public final io.ktor.http.HttpStatusCode getSwitchProxy() {
            return io.ktor.http.HttpStatusCode.SwitchProxy;
        }

        public final io.ktor.http.HttpStatusCode getTemporaryRedirect() {
            return io.ktor.http.HttpStatusCode.TemporaryRedirect;
        }

        public final io.ktor.http.HttpStatusCode getPermanentRedirect() {
            return io.ktor.http.HttpStatusCode.PermanentRedirect;
        }

        public final io.ktor.http.HttpStatusCode getBadRequest() {
            return io.ktor.http.HttpStatusCode.BadRequest;
        }

        public final io.ktor.http.HttpStatusCode getUnauthorized() {
            return io.ktor.http.HttpStatusCode.Unauthorized;
        }

        public final io.ktor.http.HttpStatusCode getPaymentRequired() {
            return io.ktor.http.HttpStatusCode.PaymentRequired;
        }

        public final io.ktor.http.HttpStatusCode getForbidden() {
            return io.ktor.http.HttpStatusCode.Forbidden;
        }

        public final io.ktor.http.HttpStatusCode getNotFound() {
            return io.ktor.http.HttpStatusCode.NotFound;
        }

        public final io.ktor.http.HttpStatusCode getMethodNotAllowed() {
            return io.ktor.http.HttpStatusCode.MethodNotAllowed;
        }

        public final io.ktor.http.HttpStatusCode getNotAcceptable() {
            return io.ktor.http.HttpStatusCode.NotAcceptable;
        }

        public final io.ktor.http.HttpStatusCode getProxyAuthenticationRequired() {
            return io.ktor.http.HttpStatusCode.ProxyAuthenticationRequired;
        }

        public final io.ktor.http.HttpStatusCode getRequestTimeout() {
            return io.ktor.http.HttpStatusCode.RequestTimeout;
        }

        public final io.ktor.http.HttpStatusCode getConflict() {
            return io.ktor.http.HttpStatusCode.Conflict;
        }

        public final io.ktor.http.HttpStatusCode getGone() {
            return io.ktor.http.HttpStatusCode.Gone;
        }

        public final io.ktor.http.HttpStatusCode getLengthRequired() {
            return io.ktor.http.HttpStatusCode.LengthRequired;
        }

        public final io.ktor.http.HttpStatusCode getPreconditionFailed() {
            return io.ktor.http.HttpStatusCode.PreconditionFailed;
        }

        public final io.ktor.http.HttpStatusCode getPayloadTooLarge() {
            return io.ktor.http.HttpStatusCode.PayloadTooLarge;
        }

        public final io.ktor.http.HttpStatusCode getRequestURITooLong() {
            return io.ktor.http.HttpStatusCode.RequestURITooLong;
        }

        public final io.ktor.http.HttpStatusCode getUnsupportedMediaType() {
            return io.ktor.http.HttpStatusCode.UnsupportedMediaType;
        }

        public final io.ktor.http.HttpStatusCode getRequestedRangeNotSatisfiable() {
            return io.ktor.http.HttpStatusCode.RequestedRangeNotSatisfiable;
        }

        public final io.ktor.http.HttpStatusCode getExpectationFailed() {
            return io.ktor.http.HttpStatusCode.ExpectationFailed;
        }

        public final io.ktor.http.HttpStatusCode getUnprocessableEntity() {
            return io.ktor.http.HttpStatusCode.UnprocessableEntity;
        }

        public final io.ktor.http.HttpStatusCode getLocked() {
            return io.ktor.http.HttpStatusCode.Locked;
        }

        public final io.ktor.http.HttpStatusCode getFailedDependency() {
            return io.ktor.http.HttpStatusCode.FailedDependency;
        }

        public final io.ktor.http.HttpStatusCode getTooEarly() {
            return io.ktor.http.HttpStatusCode.TooEarly;
        }

        public final io.ktor.http.HttpStatusCode getUpgradeRequired() {
            return io.ktor.http.HttpStatusCode.UpgradeRequired;
        }

        public final io.ktor.http.HttpStatusCode getTooManyRequests() {
            return io.ktor.http.HttpStatusCode.TooManyRequests;
        }

        public final io.ktor.http.HttpStatusCode getRequestHeaderFieldTooLarge() {
            return io.ktor.http.HttpStatusCode.RequestHeaderFieldTooLarge;
        }

        public final io.ktor.http.HttpStatusCode getInternalServerError() {
            return io.ktor.http.HttpStatusCode.InternalServerError;
        }

        public final io.ktor.http.HttpStatusCode getNotImplemented() {
            return io.ktor.http.HttpStatusCode.NotImplemented;
        }

        public final io.ktor.http.HttpStatusCode getBadGateway() {
            return io.ktor.http.HttpStatusCode.BadGateway;
        }

        public final io.ktor.http.HttpStatusCode getServiceUnavailable() {
            return io.ktor.http.HttpStatusCode.ServiceUnavailable;
        }

        public final io.ktor.http.HttpStatusCode getGatewayTimeout() {
            return io.ktor.http.HttpStatusCode.GatewayTimeout;
        }

        public final io.ktor.http.HttpStatusCode getVersionNotSupported() {
            return io.ktor.http.HttpStatusCode.VersionNotSupported;
        }

        public final io.ktor.http.HttpStatusCode getVariantAlsoNegotiates() {
            return io.ktor.http.HttpStatusCode.VariantAlsoNegotiates;
        }

        public final io.ktor.http.HttpStatusCode getInsufficientStorage() {
            return io.ktor.http.HttpStatusCode.InsufficientStorage;
        }

        public final java.util.List<io.ktor.http.HttpStatusCode> getAllStatusCodes() {
            return io.ktor.http.HttpStatusCode.allStatusCodes;
        }

        public final io.ktor.http.HttpStatusCode fromValue(int value) {
            io.ktor.http.HttpStatusCode httpStatusCode = (io.ktor.http.HttpStatusCode) io.ktor.http.HttpStatusCode.getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(value));
            return httpStatusCode == null ? new io.ktor.http.HttpStatusCode(value, "Unknown Status Code") : httpStatusCode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.List<io.ktor.http.HttpStatusCode> allStatusCodes2 = io.ktor.http.HttpStatusCodeKt.allStatusCodes();
        allStatusCodes = allStatusCodes2;
        java.util.List<io.ktor.http.HttpStatusCode> list = allStatusCodes2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(java.lang.Integer.valueOf(((io.ktor.http.HttpStatusCode) obj).value), obj);
        }
        getHighSpeedVideoFpsRanges = linkedHashMap;
    }

    public final io.ktor.http.HttpStatusCode copy(int value, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new io.ktor.http.HttpStatusCode(value, description);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public static /* synthetic */ io.ktor.http.HttpStatusCode copy$default(io.ktor.http.HttpStatusCode httpStatusCode, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = httpStatusCode.value;
        }
        if ((i2 & 2) != 0) {
            str = httpStatusCode.description;
        }
        return httpStatusCode.copy(i, str);
    }
}
