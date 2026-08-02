package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e"}, d2 = {"Lcom/paypal/android/threeds/utils/NetworkUtil;", "", "<init>", "()V", "", "text", "Lokhttp3/RequestBody;", "getRequestBodyFromString", "(Ljava/lang/String;)Lokhttp3/RequestBody;", "", "TIMEOUT_HTTP_CODE", com.visa.cbp.getEncExpo.warmup, "SERVICE_UNAVAILABLE_CODE", "USER_AGENT", "Ljava/lang/String;", "JWT", "WEB_VIEW_USER_AGENT", "CONTENT_TYPE", "SOMETHING_WENT_WRONG", "TIMEOUT_ERROR", "MOCK_MESSAGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NetworkUtil {
    public static final int $stable = 0;
    public static final java.lang.String CONTENT_TYPE = "Content-Type";
    public static final com.paypal.android.threeds.utils.NetworkUtil INSTANCE = new com.paypal.android.threeds.utils.NetworkUtil();
    public static final java.lang.String JWT = "jwt";
    public static final java.lang.String MOCK_MESSAGE = "Mock message";
    public static final int SERVICE_UNAVAILABLE_CODE = 503;
    public static final java.lang.String SOMETHING_WENT_WRONG = "Something went wrong. Please try again later";
    public static final java.lang.String TIMEOUT_ERROR = "Socket timeout error";
    public static final int TIMEOUT_HTTP_CODE = 408;
    public static final java.lang.String USER_AGENT = "User-Agent";
    public static final java.lang.String WEB_VIEW_USER_AGENT = "WEBVIEW_USER_AGENT";

    private NetworkUtil() {
    }

    public final okhttp3.RequestBody getRequestBodyFromString(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        return okhttp3.RequestBody.INSTANCE.create(text, okhttp3.MediaType.INSTANCE.parse("text/plain"));
    }
}
