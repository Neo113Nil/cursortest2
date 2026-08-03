package io.ktor.http;

/* compiled from: ContentTypes.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 $2\u00020\u0001:\t$%&'()*+,B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b#\u0010\"¨\u0006-"}, d2 = {"Lio/ktor/http/ContentType;", "Lio/ktor/http/HeaderValueWithParameters;", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "contentSubtype", "existingContent", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "name", "value", "withParameter", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/ContentType;", "", "hasParameter", "(Ljava/lang/String;Ljava/lang/String;)Z", "withoutParameters", "()Lio/ktor/http/ContentType;", "pattern", "match", "(Lio/ktor/http/ContentType;)Z", "(Ljava/lang/String;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "getContentSubtype", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Application", "Audio", "Image", "Message", "MultiPart", "Text", "Video", "Font", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentType extends io.ktor.http.HeaderValueWithParameters {
    private final java.lang.String contentSubtype;
    private final java.lang.String contentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.ContentType.Companion INSTANCE = new io.ktor.http.ContentType.Companion(null);
    private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("*", "*", null, 4, null);

    public final java.lang.String getContentType() {
        return this.contentType;
    }

    public final java.lang.String getContentSubtype() {
        return this.contentSubtype;
    }

    /* synthetic */ ContentType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    private ContentType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<io.ktor.http.HeaderValueParam> list) {
        super(str3, list);
        this.contentType = str;
        this.contentSubtype = str2;
    }

    public /* synthetic */ ContentType(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentType(java.lang.String contentType, java.lang.String contentSubtype, java.util.List<io.ktor.http.HeaderValueParam> parameters) {
        this(contentType, contentSubtype, contentType + kotlinx.io.files.FileSystemKt.UnixPathSeparator + contentSubtype, parameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    public final io.ktor.http.ContentType withParameter(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return hasParameter(name, value) ? this : new io.ktor.http.ContentType(this.contentType, this.contentSubtype, getContent(), kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends io.ktor.http.HeaderValueParam>) getParameters(), new io.ktor.http.HeaderValueParam(name, value)));
    }

    private final boolean hasParameter(java.lang.String name, java.lang.String value) {
        int size = getParameters().size();
        if (size == 0) {
            return false;
        }
        if (size == 1) {
            io.ktor.http.HeaderValueParam headerValueParam = getParameters().get(0);
            if (!kotlin.text.StringsKt.equals(headerValueParam.getName(), name, true) || !kotlin.text.StringsKt.equals(headerValueParam.getValue(), value, true)) {
                return false;
            }
        } else {
            java.util.List<io.ktor.http.HeaderValueParam> parameters = getParameters();
            if ((parameters instanceof java.util.Collection) && parameters.isEmpty()) {
                return false;
            }
            for (io.ktor.http.HeaderValueParam headerValueParam2 : parameters) {
                if (!kotlin.text.StringsKt.equals(headerValueParam2.getName(), name, true) || !kotlin.text.StringsKt.equals(headerValueParam2.getValue(), value, true)) {
                }
            }
            return false;
        }
        return true;
    }

    public final io.ktor.http.ContentType withoutParameters() {
        if (getParameters().isEmpty()) {
            return this;
        }
        return new io.ktor.http.ContentType(this.contentType, this.contentSubtype, null, 4, null);
    }

    public final boolean match(io.ktor.http.ContentType pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(pattern.contentType, "*") && !kotlin.text.StringsKt.equals(pattern.contentType, this.contentType, true)) {
            return false;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(pattern.contentSubtype, "*") && !kotlin.text.StringsKt.equals(pattern.contentSubtype, this.contentSubtype, true)) {
            return false;
        }
        for (io.ktor.http.HeaderValueParam headerValueParam : pattern.getParameters()) {
            java.lang.String name = headerValueParam.getName();
            java.lang.String value = headerValueParam.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(name, "*")) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(value, "*")) {
                    java.util.List<io.ktor.http.HeaderValueParam> parameters = getParameters();
                    if (!(parameters instanceof java.util.Collection) || !parameters.isEmpty()) {
                        java.util.Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            if (kotlin.text.StringsKt.equals(((io.ktor.http.HeaderValueParam) it.next()).getValue(), value, true)) {
                                break;
                            }
                        }
                    }
                    return false;
                }
                continue;
            } else {
                java.lang.String parameter = parameter(name);
                if (kotlin.jvm.internal.Intrinsics.areEqual(value, "*")) {
                    if (parameter == null) {
                        return false;
                    }
                } else if (!kotlin.text.StringsKt.equals(parameter, value, true)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean match(java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        return match(INSTANCE.parse(pattern));
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof io.ktor.http.ContentType) {
            io.ktor.http.ContentType contentType = (io.ktor.http.ContentType) other;
            if (kotlin.text.StringsKt.equals(this.contentType, contentType.contentType, true) && kotlin.text.StringsKt.equals(this.contentSubtype, contentType.contentSubtype, true) && kotlin.jvm.internal.Intrinsics.areEqual(getParameters(), contentType.getParameters())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String lowerCase = this.contentType.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        java.lang.String lowerCase2 = this.contentSubtype.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode() + (getParameters().hashCode() * 31);
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "", "<init>", "()V", "", "value", "Lio/ktor/http/ContentType;", "parse", "(Ljava/lang/String;)Lio/ktor/http/ContentType;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final io.ktor.http.ContentType parse(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            if (kotlin.text.StringsKt.isBlank(value)) {
                return getAny();
            }
            io.ktor.http.HeaderValueWithParameters.Companion companion = io.ktor.http.HeaderValueWithParameters.INSTANCE;
            io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) kotlin.collections.CollectionsKt.last((java.util.List) io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(value));
            java.lang.String value2 = headerValue.getValue();
            java.util.List<io.ktor.http.HeaderValueParam> params = headerValue.getParams();
            java.lang.String str = value2;
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlinx.io.files.FileSystemKt.UnixPathSeparator, 0, false, 6, (java.lang.Object) null);
            if (indexOf$default == -1) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim((java.lang.CharSequence) str).toString(), "*")) {
                    return io.ktor.http.ContentType.INSTANCE.getAny();
                }
                throw new io.ktor.http.BadContentTypeFormatException(value);
            }
            java.lang.String substring = value2.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) substring).toString();
            java.lang.String str2 = obj;
            if (str2.length() == 0) {
                throw new io.ktor.http.BadContentTypeFormatException(value);
            }
            java.lang.String substring2 = value2.substring(indexOf$default + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            java.lang.String obj2 = kotlin.text.StringsKt.trim((java.lang.CharSequence) substring2).toString();
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, ' ', false, 2, (java.lang.Object) null)) {
                java.lang.String str3 = obj2;
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, ' ', false, 2, (java.lang.Object) null)) {
                    if (str3.length() == 0 || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 2, (java.lang.Object) null)) {
                        throw new io.ktor.http.BadContentTypeFormatException(value);
                    }
                    return new io.ktor.http.ContentType(obj, obj2, params);
                }
            }
            throw new io.ktor.http.BadContentTypeFormatException(value);
        }

        public final io.ktor.http.ContentType getAny() {
            return io.ktor.http.ContentType.Any;
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\u0017\u0010$\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010\u0011R\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010\u0011R\u0017\u0010(\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b+\u0010\u0011R\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010\u000f\u001a\u0004\b-\u0010\u0011R\u0017\u0010.\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010\u000f\u001a\u0004\b/\u0010\u0011R\u0017\u00100\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b1\u0010\u0011R\u0017\u00102\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b3\u0010\u0011R\u0017\u00104\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011R\u0017\u00106\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b7\u0010\u0011R\u0017\u00108\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b9\u0010\u0011R\u0017\u0010:\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010\u000f\u001a\u0004\b;\u0010\u0011R\u0017\u0010<\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010\u000f\u001a\u0004\b=\u0010\u0011¨\u0006>"}, d2 = {"Lio/ktor/http/ContentType$Application;", "", "<init>", "()V", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Atom", "getAtom", "Cbor", "getCbor", "Json", "getJson", "HalJson", "getHalJson", "JavaScript", "getJavaScript", "OctetStream", "getOctetStream", "Rss", "getRss", "Soap", "getSoap", "Xml", "getXml", "Xml_Dtd", "getXml_Dtd", "Yaml", "getYaml", "Zip", "getZip", "GZip", "getGZip", "FormUrlEncoded", "getFormUrlEncoded", "Pdf", "getPdf", "Xlsx", "getXlsx", "Docx", "getDocx", "Pptx", "getPptx", "ProtoBuf", "getProtoBuf", "Wasm", "getWasm", "ProblemJson", "getProblemJson", "ProblemXml", "getProblemXml", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Application {
        private static final io.ktor.http.ContentType Any;
        private static final io.ktor.http.ContentType Atom;
        private static final io.ktor.http.ContentType Cbor;
        private static final io.ktor.http.ContentType Docx;
        private static final io.ktor.http.ContentType FormUrlEncoded;
        private static final io.ktor.http.ContentType GZip;
        private static final io.ktor.http.ContentType HalJson;
        public static final io.ktor.http.ContentType.Application INSTANCE = new io.ktor.http.ContentType.Application();
        private static final io.ktor.http.ContentType JavaScript;
        private static final io.ktor.http.ContentType Json;
        private static final io.ktor.http.ContentType OctetStream;
        private static final io.ktor.http.ContentType Pdf;
        private static final io.ktor.http.ContentType Pptx;
        private static final io.ktor.http.ContentType ProblemJson;
        private static final io.ktor.http.ContentType ProblemXml;
        private static final io.ktor.http.ContentType ProtoBuf;
        private static final io.ktor.http.ContentType Rss;
        private static final io.ktor.http.ContentType Soap;
        public static final java.lang.String TYPE = "application";
        private static final io.ktor.http.ContentType Wasm;
        private static final io.ktor.http.ContentType Xlsx;
        private static final io.ktor.http.ContentType Xml;
        private static final io.ktor.http.ContentType Xml_Dtd;
        private static final io.ktor.http.ContentType Yaml;
        private static final io.ktor.http.ContentType Zip;

        private Application() {
        }

        static {
            int i = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            java.util.List list = null;
            Any = new io.ktor.http.ContentType("application", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            java.util.List list2 = null;
            Atom = new io.ktor.http.ContentType("application", "atom+xml", list2, i2, defaultConstructorMarker2);
            Cbor = new io.ktor.http.ContentType("application", "cbor", list, i, defaultConstructorMarker);
            Json = new io.ktor.http.ContentType("application", "json", list2, i2, defaultConstructorMarker2);
            HalJson = new io.ktor.http.ContentType("application", "hal+json", list, i, defaultConstructorMarker);
            JavaScript = new io.ktor.http.ContentType("application", "javascript", list2, i2, defaultConstructorMarker2);
            OctetStream = new io.ktor.http.ContentType("application", "octet-stream", list, i, defaultConstructorMarker);
            Rss = new io.ktor.http.ContentType("application", "rss+xml", list2, i2, defaultConstructorMarker2);
            Soap = new io.ktor.http.ContentType("application", "soap+xml", list, i, defaultConstructorMarker);
            Xml = new io.ktor.http.ContentType("application", "xml", list2, i2, defaultConstructorMarker2);
            Xml_Dtd = new io.ktor.http.ContentType("application", "xml-dtd", list, i, defaultConstructorMarker);
            Yaml = new io.ktor.http.ContentType("application", "yaml", list2, i2, defaultConstructorMarker2);
            Zip = new io.ktor.http.ContentType("application", "zip", list, i, defaultConstructorMarker);
            GZip = new io.ktor.http.ContentType("application", "gzip", list2, i2, defaultConstructorMarker2);
            FormUrlEncoded = new io.ktor.http.ContentType("application", "x-www-form-urlencoded", list, i, defaultConstructorMarker);
            Pdf = new io.ktor.http.ContentType("application", "pdf", list2, i2, defaultConstructorMarker2);
            Xlsx = new io.ktor.http.ContentType("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", list, i, defaultConstructorMarker);
            Docx = new io.ktor.http.ContentType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", list2, i2, defaultConstructorMarker2);
            Pptx = new io.ktor.http.ContentType("application", "vnd.openxmlformats-officedocument.presentationml.presentation", list, i, defaultConstructorMarker);
            ProtoBuf = new io.ktor.http.ContentType("application", "protobuf", list2, i2, defaultConstructorMarker2);
            Wasm = new io.ktor.http.ContentType("application", "wasm", list, i, defaultConstructorMarker);
            ProblemJson = new io.ktor.http.ContentType("application", "problem+json", list2, i2, defaultConstructorMarker2);
            ProblemXml = new io.ktor.http.ContentType("application", "problem+xml", list, i, defaultConstructorMarker);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getAtom() {
            return Atom;
        }

        public final io.ktor.http.ContentType getCbor() {
            return Cbor;
        }

        public final io.ktor.http.ContentType getJson() {
            return Json;
        }

        public final io.ktor.http.ContentType getHalJson() {
            return HalJson;
        }

        public final io.ktor.http.ContentType getJavaScript() {
            return JavaScript;
        }

        public final io.ktor.http.ContentType getOctetStream() {
            return OctetStream;
        }

        public final io.ktor.http.ContentType getRss() {
            return Rss;
        }

        public final io.ktor.http.ContentType getSoap() {
            return Soap;
        }

        public final io.ktor.http.ContentType getXml() {
            return Xml;
        }

        public final io.ktor.http.ContentType getXml_Dtd() {
            return Xml_Dtd;
        }

        public final io.ktor.http.ContentType getYaml() {
            return Yaml;
        }

        public final io.ktor.http.ContentType getZip() {
            return Zip;
        }

        public final io.ktor.http.ContentType getGZip() {
            return GZip;
        }

        public final io.ktor.http.ContentType getFormUrlEncoded() {
            return FormUrlEncoded;
        }

        public final io.ktor.http.ContentType getPdf() {
            return Pdf;
        }

        public final io.ktor.http.ContentType getXlsx() {
            return Xlsx;
        }

        public final io.ktor.http.ContentType getDocx() {
            return Docx;
        }

        public final io.ktor.http.ContentType getPptx() {
            return Pptx;
        }

        public final io.ktor.http.ContentType getProtoBuf() {
            return ProtoBuf;
        }

        public final io.ktor.http.ContentType getWasm() {
            return Wasm;
        }

        public final io.ktor.http.ContentType getProblemJson() {
            return ProblemJson;
        }

        public final io.ktor.http.ContentType getProblemXml() {
            return ProblemXml;
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return kotlin.text.StringsKt.startsWith(contentType, (java.lang.CharSequence) "application/", true);
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lio/ktor/http/ContentType$Audio;", "", "<init>", "()V", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "MP4", "getMP4", "MPEG", "getMPEG", "OGG", "getOGG", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Audio {
        private static final io.ktor.http.ContentType Any;
        public static final io.ktor.http.ContentType.Audio INSTANCE = new io.ktor.http.ContentType.Audio();
        private static final io.ktor.http.ContentType MP4;
        private static final io.ktor.http.ContentType MPEG;
        private static final io.ktor.http.ContentType OGG;
        public static final java.lang.String TYPE = "audio";

        private Audio() {
        }

        static {
            int i = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            java.util.List list = null;
            Any = new io.ktor.http.ContentType("audio", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            java.util.List list2 = null;
            MP4 = new io.ktor.http.ContentType("audio", "mp4", list2, i2, defaultConstructorMarker2);
            MPEG = new io.ktor.http.ContentType("audio", "mpeg", list, i, defaultConstructorMarker);
            OGG = new io.ktor.http.ContentType("audio", "ogg", list2, i2, defaultConstructorMarker2);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getMP4() {
            return MP4;
        }

        public final io.ktor.http.ContentType getMPEG() {
            return MPEG;
        }

        public final io.ktor.http.ContentType getOGG() {
            return OGG;
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return kotlin.text.StringsKt.startsWith(contentType, (java.lang.CharSequence) "audio/", true);
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lio/ktor/http/ContentType$Image;", "", "<init>", "()V", "", "contentSubtype", "", "contains", "(Ljava/lang/String;)Z", "Lio/ktor/http/ContentType;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "(Lio/ktor/http/ContentType;)Z", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "GIF", "getGIF", "JPEG", "getJPEG", "PNG", "getPNG", "SVG", "getSVG", "XIcon", "getXIcon", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image {
        private static final io.ktor.http.ContentType Any;
        private static final io.ktor.http.ContentType GIF;
        public static final io.ktor.http.ContentType.Image INSTANCE = new io.ktor.http.ContentType.Image();
        private static final io.ktor.http.ContentType JPEG;
        private static final io.ktor.http.ContentType PNG;
        private static final io.ktor.http.ContentType SVG;
        public static final java.lang.String TYPE = "image";
        private static final io.ktor.http.ContentType XIcon;

        private Image() {
        }

        static {
            int i = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            java.util.List list = null;
            Any = new io.ktor.http.ContentType("image", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            java.util.List list2 = null;
            GIF = new io.ktor.http.ContentType("image", "gif", list2, i2, defaultConstructorMarker2);
            JPEG = new io.ktor.http.ContentType("image", "jpeg", list, i, defaultConstructorMarker);
            PNG = new io.ktor.http.ContentType("image", "png", list2, i2, defaultConstructorMarker2);
            SVG = new io.ktor.http.ContentType("image", "svg+xml", list, i, defaultConstructorMarker);
            XIcon = new io.ktor.http.ContentType("image", "x-icon", list2, i2, defaultConstructorMarker2);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getGIF() {
            return GIF;
        }

        public final io.ktor.http.ContentType getJPEG() {
            return JPEG;
        }

        public final io.ktor.http.ContentType getPNG() {
            return PNG;
        }

        public final io.ktor.http.ContentType getSVG() {
            return SVG;
        }

        public final io.ktor.http.ContentType getXIcon() {
            return XIcon;
        }

        public final boolean contains(java.lang.String contentSubtype) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
            return kotlin.text.StringsKt.startsWith(contentSubtype, "image/", true);
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/ktor/http/ContentType$Message;", "", "<init>", "()V", "", "contentSubtype", "", "contains", "(Ljava/lang/String;)Z", "Lio/ktor/http/ContentType;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "(Lio/ktor/http/ContentType;)Z", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Http", "getHttp", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message {
        public static final java.lang.String TYPE = "message";
        public static final io.ktor.http.ContentType.Message INSTANCE = new io.ktor.http.ContentType.Message();
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("message", "*", null, 4, null);
        private static final io.ktor.http.ContentType Http = new io.ktor.http.ContentType("message", androidx.webkit.ProxyConfig.MATCH_HTTP, null, 4, null);

        private Message() {
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getHttp() {
            return Http;
        }

        public final boolean contains(java.lang.String contentSubtype) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
            return kotlin.text.StringsKt.startsWith(contentSubtype, "message/", true);
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lio/ktor/http/ContentType$MultiPart;", "", "<init>", "()V", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Mixed", "getMixed", "Alternative", "getAlternative", "Related", "getRelated", "FormData", "getFormData", "Signed", "getSigned", "Encrypted", "getEncrypted", "ByteRanges", "getByteRanges", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultiPart {
        private static final io.ktor.http.ContentType Alternative;
        private static final io.ktor.http.ContentType Any;
        private static final io.ktor.http.ContentType ByteRanges;
        private static final io.ktor.http.ContentType Encrypted;
        private static final io.ktor.http.ContentType FormData;
        public static final io.ktor.http.ContentType.MultiPart INSTANCE = new io.ktor.http.ContentType.MultiPart();
        private static final io.ktor.http.ContentType Mixed;
        private static final io.ktor.http.ContentType Related;
        private static final io.ktor.http.ContentType Signed;
        public static final java.lang.String TYPE = "multipart";

        private MultiPart() {
        }

        static {
            int i = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            java.util.List list = null;
            Any = new io.ktor.http.ContentType(TYPE, "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            java.util.List list2 = null;
            Mixed = new io.ktor.http.ContentType(TYPE, "mixed", list2, i2, defaultConstructorMarker2);
            Alternative = new io.ktor.http.ContentType(TYPE, "alternative", list, i, defaultConstructorMarker);
            Related = new io.ktor.http.ContentType(TYPE, "related", list2, i2, defaultConstructorMarker2);
            FormData = new io.ktor.http.ContentType(TYPE, "form-data", list, i, defaultConstructorMarker);
            Signed = new io.ktor.http.ContentType(TYPE, "signed", list2, i2, defaultConstructorMarker2);
            Encrypted = new io.ktor.http.ContentType(TYPE, "encrypted", list, i, defaultConstructorMarker);
            ByteRanges = new io.ktor.http.ContentType(TYPE, "byteranges", list2, i2, defaultConstructorMarker2);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getMixed() {
            return Mixed;
        }

        public final io.ktor.http.ContentType getAlternative() {
            return Alternative;
        }

        public final io.ktor.http.ContentType getRelated() {
            return Related;
        }

        public final io.ktor.http.ContentType getFormData() {
            return FormData;
        }

        public final io.ktor.http.ContentType getSigned() {
            return Signed;
        }

        public final io.ktor.http.ContentType getEncrypted() {
            return Encrypted;
        }

        public final io.ktor.http.ContentType getByteRanges() {
            return ByteRanges;
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return kotlin.text.StringsKt.startsWith(contentType, (java.lang.CharSequence) "multipart/", true);
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lio/ktor/http/ContentType$Text;", "", "<init>", "()V", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Plain", "getPlain", "CSS", "getCSS", "CSV", "getCSV", "Html", "getHtml", "JavaScript", "getJavaScript", "VCard", "getVCard", "Xml", "getXml", "EventStream", "getEventStream", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text {
        private static final io.ktor.http.ContentType Any;
        private static final io.ktor.http.ContentType CSS;
        private static final io.ktor.http.ContentType CSV;
        private static final io.ktor.http.ContentType EventStream;
        private static final io.ktor.http.ContentType Html;
        public static final io.ktor.http.ContentType.Text INSTANCE = new io.ktor.http.ContentType.Text();
        private static final io.ktor.http.ContentType JavaScript;
        private static final io.ktor.http.ContentType Plain;
        public static final java.lang.String TYPE = "text";
        private static final io.ktor.http.ContentType VCard;
        private static final io.ktor.http.ContentType Xml;

        private Text() {
        }

        static {
            int i = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            java.util.List list = null;
            Any = new io.ktor.http.ContentType("text", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            java.util.List list2 = null;
            Plain = new io.ktor.http.ContentType("text", "plain", list2, i2, defaultConstructorMarker2);
            CSS = new io.ktor.http.ContentType("text", "css", list, i, defaultConstructorMarker);
            CSV = new io.ktor.http.ContentType("text", "csv", list2, i2, defaultConstructorMarker2);
            Html = new io.ktor.http.ContentType("text", "html", list, i, defaultConstructorMarker);
            JavaScript = new io.ktor.http.ContentType("text", "javascript", list2, i2, defaultConstructorMarker2);
            VCard = new io.ktor.http.ContentType("text", "vcard", list, i, defaultConstructorMarker);
            Xml = new io.ktor.http.ContentType("text", "xml", list2, i2, defaultConstructorMarker2);
            EventStream = new io.ktor.http.ContentType("text", "event-stream", list, i, defaultConstructorMarker);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getPlain() {
            return Plain;
        }

        public final io.ktor.http.ContentType getCSS() {
            return CSS;
        }

        public final io.ktor.http.ContentType getCSV() {
            return CSV;
        }

        public final io.ktor.http.ContentType getHtml() {
            return Html;
        }

        public final io.ktor.http.ContentType getJavaScript() {
            return JavaScript;
        }

        public final io.ktor.http.ContentType getVCard() {
            return VCard;
        }

        public final io.ktor.http.ContentType getXml() {
            return Xml;
        }

        public final io.ktor.http.ContentType getEventStream() {
            return EventStream;
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return kotlin.text.StringsKt.startsWith(contentType, (java.lang.CharSequence) "text/", true);
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lio/ktor/http/ContentType$Video;", "", "<init>", "()V", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "MPEG", "getMPEG", "MP4", "getMP4", "OGG", "getOGG", "QuickTime", "getQuickTime", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Video {
        private static final io.ktor.http.ContentType Any;
        public static final io.ktor.http.ContentType.Video INSTANCE = new io.ktor.http.ContentType.Video();
        private static final io.ktor.http.ContentType MP4;
        private static final io.ktor.http.ContentType MPEG;
        private static final io.ktor.http.ContentType OGG;
        private static final io.ktor.http.ContentType QuickTime;
        public static final java.lang.String TYPE = "video";

        private Video() {
        }

        static {
            int i = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            java.util.List list = null;
            Any = new io.ktor.http.ContentType("video", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            java.util.List list2 = null;
            MPEG = new io.ktor.http.ContentType("video", "mpeg", list2, i2, defaultConstructorMarker2);
            MP4 = new io.ktor.http.ContentType("video", "mp4", list, i, defaultConstructorMarker);
            OGG = new io.ktor.http.ContentType("video", "ogg", list2, i2, defaultConstructorMarker2);
            QuickTime = new io.ktor.http.ContentType("video", "quicktime", list, i, defaultConstructorMarker);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getMPEG() {
            return MPEG;
        }

        public final io.ktor.http.ContentType getMP4() {
            return MP4;
        }

        public final io.ktor.http.ContentType getOGG() {
            return OGG;
        }

        public final io.ktor.http.ContentType getQuickTime() {
            return QuickTime;
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return kotlin.text.StringsKt.startsWith(contentType, (java.lang.CharSequence) "video/", true);
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/ktor/http/ContentType$Font;", "", "<init>", "()V", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Collection", "getCollection", "Otf", "getOtf", "Sfnt", "getSfnt", "Ttf", "getTtf", "Woff", "getWoff", "Woff2", "getWoff2", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Font {
        private static final io.ktor.http.ContentType Any;
        private static final io.ktor.http.ContentType Collection;
        public static final io.ktor.http.ContentType.Font INSTANCE = new io.ktor.http.ContentType.Font();
        private static final io.ktor.http.ContentType Otf;
        private static final io.ktor.http.ContentType Sfnt;
        public static final java.lang.String TYPE = "font";
        private static final io.ktor.http.ContentType Ttf;
        private static final io.ktor.http.ContentType Woff;
        private static final io.ktor.http.ContentType Woff2;

        private Font() {
        }

        static {
            int i = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            java.util.List list = null;
            Any = new io.ktor.http.ContentType(TYPE, "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
            java.util.List list2 = null;
            Collection = new io.ktor.http.ContentType(TYPE, "collection", list2, i2, defaultConstructorMarker2);
            Otf = new io.ktor.http.ContentType(TYPE, "otf", list, i, defaultConstructorMarker);
            Sfnt = new io.ktor.http.ContentType(TYPE, "sfnt", list2, i2, defaultConstructorMarker2);
            Ttf = new io.ktor.http.ContentType(TYPE, "ttf", list, i, defaultConstructorMarker);
            Woff = new io.ktor.http.ContentType(TYPE, "woff", list2, i2, defaultConstructorMarker2);
            Woff2 = new io.ktor.http.ContentType(TYPE, "woff2", list, i, defaultConstructorMarker);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getCollection() {
            return Collection;
        }

        public final io.ktor.http.ContentType getOtf() {
            return Otf;
        }

        public final io.ktor.http.ContentType getSfnt() {
            return Sfnt;
        }

        public final io.ktor.http.ContentType getTtf() {
            return Ttf;
        }

        public final io.ktor.http.ContentType getWoff() {
            return Woff;
        }

        public final io.ktor.http.ContentType getWoff2() {
            return Woff2;
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return kotlin.text.StringsKt.startsWith(contentType, (java.lang.CharSequence) "font/", true);
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
            return contentType.match(Any);
        }
    }
}
