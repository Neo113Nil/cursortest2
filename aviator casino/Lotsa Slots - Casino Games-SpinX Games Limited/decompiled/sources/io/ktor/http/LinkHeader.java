package io.ktor.http;

/* compiled from: LinkHeader.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\fB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/ktor/http/LinkHeader;", "Lio/ktor/http/HeaderValueWithParameters;", "", com.facebook.share.internal.ShareConstants.MEDIA_URI, "", "Lio/ktor/http/HeaderValueParam;", "params", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", io.ktor.http.LinkHeader.Parameters.Rel, "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Lio/ktor/http/ContentType;", "type", "(Ljava/lang/String;Ljava/util/List;Lio/ktor/http/ContentType;)V", "getUri", "()Ljava/lang/String;", "Parameters", "Rel", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkHeader extends io.ktor.http.HeaderValueWithParameters {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHeader(java.lang.String uri, java.util.List<io.ktor.http.HeaderValueParam> params) {
        super("<" + uri + kotlin.text.Typography.greater, params);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(java.lang.String uri, java.lang.String rel) {
        this(uri, (java.util.List<io.ktor.http.HeaderValueParam>) kotlin.collections.CollectionsKt.listOf(new io.ktor.http.HeaderValueParam(io.ktor.http.LinkHeader.Parameters.Rel, rel)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(java.lang.String uri, java.lang.String... rel) {
        this(uri, (java.util.List<io.ktor.http.HeaderValueParam>) kotlin.collections.CollectionsKt.listOf(new io.ktor.http.HeaderValueParam(io.ktor.http.LinkHeader.Parameters.Rel, kotlin.collections.ArraysKt.joinToString$default(rel, io.ktor.sse.ServerSentEventKt.SPACE, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null))));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(java.lang.String uri, java.util.List<java.lang.String> rel, io.ktor.http.ContentType type) {
        this(uri, (java.util.List<io.ktor.http.HeaderValueParam>) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new io.ktor.http.HeaderValueParam[]{new io.ktor.http.HeaderValueParam(io.ktor.http.LinkHeader.Parameters.Rel, kotlin.collections.CollectionsKt.joinToString$default(rel, io.ktor.sse.ServerSentEventKt.SPACE, null, null, 0, null, null, 62, null)), new io.ktor.http.HeaderValueParam("type", type.toString())}));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rel, "rel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
    }

    public final java.lang.String getUri() {
        return kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.removePrefix(getContent(), (java.lang.CharSequence) "<"), (java.lang.CharSequence) ">");
    }

    /* compiled from: LinkHeader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lio/ktor/http/LinkHeader$Parameters;", "", "<init>", "()V", "", "Rel", "Ljava/lang/String;", "Anchor", io.ktor.http.LinkHeader.Parameters.Rev, "HrefLang", "Media", "Title", "Type", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parameters {
        public static final java.lang.String Anchor = "anchor";
        public static final java.lang.String HrefLang = "hreflang";
        public static final io.ktor.http.LinkHeader.Parameters INSTANCE = new io.ktor.http.LinkHeader.Parameters();
        public static final java.lang.String Media = "media";
        public static final java.lang.String Rel = "rel";
        public static final java.lang.String Rev = "Rev";
        public static final java.lang.String Title = "title";
        public static final java.lang.String Type = "type";

        private Parameters() {
        }
    }

    /* compiled from: LinkHeader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lio/ktor/http/LinkHeader$Rel;", "", "<init>", "()V", "", "Stylesheet", "Ljava/lang/String;", "Prefetch", "DnsPrefetch", "PreConnect", "PreLoad", "PreRender", "Next", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Rel {
        public static final java.lang.String DnsPrefetch = "dns-prefetch";
        public static final io.ktor.http.LinkHeader.Rel INSTANCE = new io.ktor.http.LinkHeader.Rel();
        public static final java.lang.String Next = "next";
        public static final java.lang.String PreConnect = "preconnect";
        public static final java.lang.String PreLoad = "preload";
        public static final java.lang.String PreRender = "prerender";
        public static final java.lang.String Prefetch = "prefetch";
        public static final java.lang.String Stylesheet = "stylesheet";

        private Rel() {
        }
    }
}
