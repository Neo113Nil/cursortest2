package io.ktor.http;

/* compiled from: Headers.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/Headers;", "Lio/ktor/util/StringValues;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Headers extends io.ktor.util.StringValues {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.Headers.Companion INSTANCE = io.ktor.http.Headers.Companion.$$INSTANCE;

    /* compiled from: Headers.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean contains(io.ktor.http.Headers headers, java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            return io.ktor.util.StringValues.DefaultImpls.contains(headers, name);
        }

        public static boolean contains(io.ktor.http.Headers headers, java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return io.ktor.util.StringValues.DefaultImpls.contains(headers, name, value);
        }

        public static void forEach(io.ktor.http.Headers headers, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            io.ktor.util.StringValues.DefaultImpls.forEach(headers, body);
        }

        public static java.lang.String get(io.ktor.http.Headers headers, java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            return io.ktor.util.StringValues.DefaultImpls.get(headers, name);
        }
    }

    /* compiled from: Headers.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lio/ktor/http/Headers$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Lio/ktor/http/Headers;", "build", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/http/Headers;", "Empty", "Lio/ktor/http/Headers;", "getEmpty", "()Lio/ktor/http/Headers;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ io.ktor.http.Headers.Companion $$INSTANCE = new io.ktor.http.Headers.Companion();
        private static final io.ktor.http.Headers Empty = io.ktor.http.EmptyHeaders.INSTANCE;

        private Companion() {
        }

        public final io.ktor.http.Headers getEmpty() {
            return Empty;
        }

        public final io.ktor.http.Headers build(kotlin.jvm.functions.Function1<? super io.ktor.http.HeadersBuilder, kotlin.Unit> builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
            io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
            builder.invoke(headersBuilder);
            return headersBuilder.build();
        }
    }
}
