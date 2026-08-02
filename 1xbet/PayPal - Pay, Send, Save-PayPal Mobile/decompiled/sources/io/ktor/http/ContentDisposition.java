package io.ktor.http;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a"}, d2 = {"Lio/ktor/http/ContentDisposition;", "Lio/ktor/http/HeaderValueWithParameters;", "", "disposition", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "encodeValue", "withParameter", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/ktor/http/ContentDisposition;", "newParameters", "withParameters", "(Ljava/util/List;)Lio/ktor/http/ContentDisposition;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getDisposition", "()Ljava/lang/String;", "getName", "name", "Companion", "Parameters"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContentDisposition extends io.ktor.http.HeaderValueWithParameters {
    private static final io.ktor.http.ContentDisposition Attachment;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.ContentDisposition.Companion INSTANCE = new io.ktor.http.ContentDisposition.Companion(null);
    private static final io.ktor.http.ContentDisposition File;
    private static final io.ktor.http.ContentDisposition Inline;
    private static final io.ktor.http.ContentDisposition Mixed;

    public /* synthetic */ ContentDisposition(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentDisposition(java.lang.String str, java.util.List<io.ktor.http.HeaderValueParam> list) {
        super(str, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    public final java.lang.String getDisposition() {
        return getContent();
    }

    public final java.lang.String getName() {
        return parameter("name");
    }

    public static /* synthetic */ io.ktor.http.ContentDisposition withParameter$default(io.ktor.http.ContentDisposition contentDisposition, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return contentDisposition.withParameter(str, str2, z);
    }

    public final io.ktor.http.ContentDisposition withParameter(java.lang.String key, java.lang.String value, boolean encodeValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (encodeValue) {
            value = io.ktor.http.ContentDispositionKt.access$encodeContentDispositionAttribute(key, value);
        }
        return new io.ktor.http.ContentDisposition(getDisposition(), kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends io.ktor.http.HeaderValueParam>) getParameters(), new io.ktor.http.HeaderValueParam(key, value)));
    }

    public final io.ktor.http.ContentDisposition withParameters(java.util.List<io.ktor.http.HeaderValueParam> newParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newParameters, "");
        return new io.ktor.http.ContentDisposition(getDisposition(), kotlin.collections.CollectionsKt.plus((java.util.Collection) getParameters(), (java.lang.Iterable) newParameters));
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof io.ktor.http.ContentDisposition)) {
            return false;
        }
        io.ktor.http.ContentDisposition contentDisposition = (io.ktor.http.ContentDisposition) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getDisposition(), contentDisposition.getDisposition()) && kotlin.jvm.internal.Intrinsics.areEqual(getParameters(), contentDisposition.getParameters());
    }

    public final int hashCode() {
        return (getDisposition().hashCode() * 31) + getParameters().hashCode();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f"}, d2 = {"Lio/ktor/http/ContentDisposition$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lio/ktor/http/ContentDisposition;", "parse", "(Ljava/lang/String;)Lio/ktor/http/ContentDisposition;", "File", "Lio/ktor/http/ContentDisposition;", "getFile", "()Lio/ktor/http/ContentDisposition;", "Mixed", "getMixed", "Attachment", "getAttachment", "Inline", "getInline"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.http.ContentDisposition getFile() {
            return io.ktor.http.ContentDisposition.File;
        }

        public final io.ktor.http.ContentDisposition getMixed() {
            return io.ktor.http.ContentDisposition.Mixed;
        }

        public final io.ktor.http.ContentDisposition getAttachment() {
            return io.ktor.http.ContentDisposition.Attachment;
        }

        public final io.ktor.http.ContentDisposition getInline() {
            return io.ktor.http.ContentDisposition.Inline;
        }

        public final io.ktor.http.ContentDisposition parse(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            io.ktor.http.HeaderValueWithParameters.Companion companion = io.ktor.http.HeaderValueWithParameters.INSTANCE;
            io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) kotlin.collections.CollectionsKt.last((java.util.List) io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(value));
            return new io.ktor.http.ContentDisposition(headerValue.getValue(), headerValue.getParams());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 2;
        File = new io.ktor.http.ContentDisposition("file", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Mixed = new io.ktor.http.ContentDisposition("mixed", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Attachment = new io.ktor.http.ContentDisposition("attachment", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Inline = new io.ktor.http.ContentDisposition("inline", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lio/ktor/http/ContentDisposition$Parameters;", "", "<init>", "()V", "", "FileName", "Ljava/lang/String;", "FileNameAsterisk", "Name", "CreationDate", "ModificationDate", "ReadDate", "Size", "Handling"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parameters {
        public static final java.lang.String CreationDate = "creation-date";
        public static final java.lang.String FileName = "filename";
        public static final java.lang.String FileNameAsterisk = "filename*";
        public static final java.lang.String Handling = "handling";
        public static final io.ktor.http.ContentDisposition.Parameters INSTANCE = new io.ktor.http.ContentDisposition.Parameters();
        public static final java.lang.String ModificationDate = "modification-date";
        public static final java.lang.String Name = "name";
        public static final java.lang.String ReadDate = "read-date";
        public static final java.lang.String Size = "size";

        private Parameters() {
        }
    }
}
