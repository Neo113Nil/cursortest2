package io.ktor.http;

/* compiled from: URLBuilderJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/http/Url$Companion;", "", "fullUrl", "Lio/ktor/http/Url;", "invoke", "(Lio/ktor/http/Url$Companion;Ljava/lang/String;)Lio/ktor/http/Url;", "Lio/ktor/http/URLBuilder$Companion;", "getOrigin", "(Lio/ktor/http/URLBuilder$Companion;)Ljava/lang/String;", "origin", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class URLBuilderJvmKt {
    public static final io.ktor.http.Url invoke(io.ktor.http.Url.Companion companion, java.lang.String fullUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullUrl, "fullUrl");
        io.ktor.http.URLBuilder uRLBuilder = new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, null);
        io.ktor.http.URLUtilsJvmKt.takeFrom(uRLBuilder, new java.net.URI(fullUrl));
        return uRLBuilder.build();
    }

    public static final java.lang.String getOrigin(io.ktor.http.URLBuilder.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        return "http://localhost";
    }
}
