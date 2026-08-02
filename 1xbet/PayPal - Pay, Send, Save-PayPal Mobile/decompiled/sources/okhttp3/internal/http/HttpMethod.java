package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\b"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "<init>", "()V", "", "method", "", "invalidatesCache", "(Ljava/lang/String;)Z", "requiresRequestBody", "permitsRequestBody", "redirectsWithBody", "redirectsToGet", "requestMethod", "isCacheable"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpMethod {
    public static final okhttp3.internal.http.HttpMethod INSTANCE = new okhttp3.internal.http.HttpMethod();

    private HttpMethod() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean invalidatesCache(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(method, "POST") || kotlin.jvm.internal.Intrinsics.areEqual(method, "PATCH") || kotlin.jvm.internal.Intrinsics.areEqual(method, com.datadog.android.internal.network.HttpSpec.Method.PUT) || kotlin.jvm.internal.Intrinsics.areEqual(method, com.datadog.android.internal.network.HttpSpec.Method.DELETE) || kotlin.jvm.internal.Intrinsics.areEqual(method, "MOVE");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean requiresRequestBody(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(method, "POST") || kotlin.jvm.internal.Intrinsics.areEqual(method, com.datadog.android.internal.network.HttpSpec.Method.PUT) || kotlin.jvm.internal.Intrinsics.areEqual(method, "PATCH") || kotlin.jvm.internal.Intrinsics.areEqual(method, "PROPPATCH") || kotlin.jvm.internal.Intrinsics.areEqual(method, "QUERY") || kotlin.jvm.internal.Intrinsics.areEqual(method, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REPORT);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean permitsRequestBody(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return (kotlin.jvm.internal.Intrinsics.areEqual(method, "GET") || kotlin.jvm.internal.Intrinsics.areEqual(method, com.datadog.android.internal.network.HttpSpec.Method.HEAD)) ? false : true;
    }

    public final boolean redirectsWithBody(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(method, "PROPFIND");
    }

    public final boolean redirectsToGet(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return !kotlin.jvm.internal.Intrinsics.areEqual(method, "PROPFIND");
    }

    public final boolean isCacheable(java.lang.String requestMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMethod, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(requestMethod, "GET") || kotlin.jvm.internal.Intrinsics.areEqual(requestMethod, "QUERY");
    }
}
