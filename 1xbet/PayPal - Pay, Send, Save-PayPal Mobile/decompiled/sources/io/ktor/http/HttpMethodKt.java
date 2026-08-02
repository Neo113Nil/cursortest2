package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00018G¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lio/ktor/http/HttpMethod;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "", "getSupportsRequestBody", "(Lio/ktor/http/HttpMethod;)Z", "getSupportsRequestBody$annotations", "(Lio/ktor/http/HttpMethod;)V", "supportsRequestBody"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpMethodKt {
    private static final java.util.Set<io.ktor.http.HttpMethod> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new io.ktor.http.HttpMethod[]{io.ktor.http.HttpMethod.INSTANCE.getGet(), io.ktor.http.HttpMethod.INSTANCE.getHead(), io.ktor.http.HttpMethod.INSTANCE.getOptions(), new io.ktor.http.HttpMethod(com.datadog.android.internal.network.HttpSpec.Method.TRACE)});

    public static /* synthetic */ void getSupportsRequestBody$annotations(io.ktor.http.HttpMethod httpMethod) {
    }

    public static final boolean getSupportsRequestBody(io.ktor.http.HttpMethod httpMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        return !getHighSpeedVideoSizes.contains(httpMethod);
    }
}
