package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lio/ktor/http/HttpMethod;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lio/ktor/http/HttpMethod;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getValue", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HttpMethod {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.HttpMethod.Companion INSTANCE = new io.ktor.http.HttpMethod.Companion(null);
    private static final java.util.List<io.ktor.http.HttpMethod> DefaultMethods;
    private static final io.ktor.http.HttpMethod Delete;
    private static final io.ktor.http.HttpMethod Get;
    private static final io.ktor.http.HttpMethod Head;
    private static final io.ktor.http.HttpMethod Options;
    private static final io.ktor.http.HttpMethod Patch;
    private static final io.ktor.http.HttpMethod Post;
    private static final io.ktor.http.HttpMethod Put;
    private final java.lang.String value;

    public HttpMethod(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lio/ktor/http/HttpMethod$Companion;", "", "<init>", "()V", "", "method", "Lio/ktor/http/HttpMethod;", "parse", "(Ljava/lang/String;)Lio/ktor/http/HttpMethod;", "Get", "Lio/ktor/http/HttpMethod;", "getGet", "()Lio/ktor/http/HttpMethod;", "Post", "getPost", "Put", "getPut", "Patch", "getPatch", "Delete", "getDelete", "Head", "getHead", "Options", "getOptions", "", "DefaultMethods", "Ljava/util/List;", "getDefaultMethods", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.http.HttpMethod getGet() {
            return io.ktor.http.HttpMethod.Get;
        }

        public final io.ktor.http.HttpMethod getPost() {
            return io.ktor.http.HttpMethod.Post;
        }

        public final io.ktor.http.HttpMethod getPut() {
            return io.ktor.http.HttpMethod.Put;
        }

        public final io.ktor.http.HttpMethod getPatch() {
            return io.ktor.http.HttpMethod.Patch;
        }

        public final io.ktor.http.HttpMethod getDelete() {
            return io.ktor.http.HttpMethod.Delete;
        }

        public final io.ktor.http.HttpMethod getHead() {
            return io.ktor.http.HttpMethod.Head;
        }

        public final io.ktor.http.HttpMethod getOptions() {
            return io.ktor.http.HttpMethod.Options;
        }

        public final io.ktor.http.HttpMethod parse(java.lang.String method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            return kotlin.jvm.internal.Intrinsics.areEqual(method, getGet().getValue()) ? getGet() : kotlin.jvm.internal.Intrinsics.areEqual(method, getPost().getValue()) ? getPost() : kotlin.jvm.internal.Intrinsics.areEqual(method, getPut().getValue()) ? getPut() : kotlin.jvm.internal.Intrinsics.areEqual(method, getPatch().getValue()) ? getPatch() : kotlin.jvm.internal.Intrinsics.areEqual(method, getDelete().getValue()) ? getDelete() : kotlin.jvm.internal.Intrinsics.areEqual(method, getHead().getValue()) ? getHead() : kotlin.jvm.internal.Intrinsics.areEqual(method, getOptions().getValue()) ? getOptions() : new io.ktor.http.HttpMethod(method);
        }

        public final java.util.List<io.ktor.http.HttpMethod> getDefaultMethods() {
            return io.ktor.http.HttpMethod.DefaultMethods;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        io.ktor.http.HttpMethod httpMethod = new io.ktor.http.HttpMethod("GET");
        Get = httpMethod;
        io.ktor.http.HttpMethod httpMethod2 = new io.ktor.http.HttpMethod("POST");
        Post = httpMethod2;
        io.ktor.http.HttpMethod httpMethod3 = new io.ktor.http.HttpMethod(com.datadog.android.internal.network.HttpSpec.Method.PUT);
        Put = httpMethod3;
        io.ktor.http.HttpMethod httpMethod4 = new io.ktor.http.HttpMethod("PATCH");
        Patch = httpMethod4;
        io.ktor.http.HttpMethod httpMethod5 = new io.ktor.http.HttpMethod(com.datadog.android.internal.network.HttpSpec.Method.DELETE);
        Delete = httpMethod5;
        io.ktor.http.HttpMethod httpMethod6 = new io.ktor.http.HttpMethod(com.datadog.android.internal.network.HttpSpec.Method.HEAD);
        Head = httpMethod6;
        io.ktor.http.HttpMethod httpMethod7 = new io.ktor.http.HttpMethod("OPTIONS");
        Options = httpMethod7;
        DefaultMethods = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new io.ktor.http.HttpMethod[]{httpMethod, httpMethod2, httpMethod3, httpMethod4, httpMethod5, httpMethod6, httpMethod7});
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof io.ktor.http.HttpMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((io.ktor.http.HttpMethod) other).value);
    }

    public final io.ktor.http.HttpMethod copy(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new io.ktor.http.HttpMethod(value);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public static /* synthetic */ io.ktor.http.HttpMethod copy$default(io.ktor.http.HttpMethod httpMethod, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = httpMethod.value;
        }
        return httpMethod.copy(str);
    }
}
