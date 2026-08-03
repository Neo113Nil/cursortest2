package io.ktor.http;

/* compiled from: Url.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b:\b\u0007\u0018\u0000 P2\u00060\u0001j\u0002`\u0002:\u0001PBe\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010.R\u0019\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b;\u0010:R\u0011\u0010=\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b<\u0010\u001cR\u001b\u0010@\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u0010\u0016R\u001b\u0010C\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u0010\u0016R\u001b\u0010F\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u0010\u0016R\u001d\u0010I\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u0010\u0016R\u001d\u0010L\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u00104\u001a\u0004\bK\u0010\u0016R\u001b\u0010O\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u00104\u001a\u0004\bN\u0010\u0016¨\u0006Q"}, d2 = {"Lio/ktor/http/Url;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "Lio/ktor/http/URLProtocol;", "protocol", "", "host", "", "specifiedPort", "", "pathSegments", "Lio/ktor/http/Parameters;", "parameters", "fragment", "user", androidx.autofill.HintConstants.AUTOFILL_HINT_PASSWORD, "", "trailingQuery", "urlString", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "Ljava/lang/String;", "getHost", "I", "getSpecifiedPort", "Lio/ktor/http/Parameters;", "getParameters", "()Lio/ktor/http/Parameters;", "getFragment", "getUser", "getPassword", "Z", "getTrailingQuery", "()Z", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "getPathSegments$annotations", "()V", "rawSegments", "getRawSegments", "segments$delegate", "Lkotlin/Lazy;", "getSegments", "segments", "protocolOrNull", "Lio/ktor/http/URLProtocol;", "getProtocolOrNull", "()Lio/ktor/http/URLProtocol;", "getProtocol", "getPort", "port", "encodedPath$delegate", "getEncodedPath", "encodedPath", "encodedQuery$delegate", "getEncodedQuery", "encodedQuery", "encodedPathAndQuery$delegate", "getEncodedPathAndQuery", "encodedPathAndQuery", "encodedUser$delegate", "getEncodedUser", "encodedUser", "encodedPassword$delegate", "getEncodedPassword", "encodedPassword", "encodedFragment$delegate", "getEncodedFragment", "encodedFragment", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = io.ktor.http.UrlSerializer.class)
/* loaded from: classes6.dex */
public final class Url implements java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.Url.Companion INSTANCE = new io.ktor.http.Url.Companion(null);

    /* renamed from: encodedFragment$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy encodedFragment;

    /* renamed from: encodedPassword$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy encodedPassword;

    /* renamed from: encodedPath$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy encodedPath;

    /* renamed from: encodedPathAndQuery$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy encodedPathAndQuery;

    /* renamed from: encodedQuery$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy encodedQuery;

    /* renamed from: encodedUser$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy encodedUser;
    private final java.lang.String fragment;
    private final java.lang.String host;
    private final io.ktor.http.Parameters parameters;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    private final io.ktor.http.URLProtocol protocol;
    private final io.ktor.http.URLProtocol protocolOrNull;
    private final java.util.List<java.lang.String> rawSegments;

    /* renamed from: segments$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy segments;
    private final int specifiedPort;
    private final boolean trailingQuery;
    private final java.lang.String urlString;
    private final java.lang.String user;

    @kotlin.Deprecated(message = "\n        `pathSegments` is deprecated.\n\n        This property will contain an empty path segment at the beginning for URLs with a hostname,\n        and an empty path segment at the end for the URLs with a trailing slash. If you need to keep this behaviour please\n        use [rawSegments]. If you only need to access the meaningful parts of the path, consider using [segments] instead.\n             \n        Please decide if you need [rawSegments] or [segments] explicitly.\n        ", replaceWith = @kotlin.ReplaceWith(expression = "rawSegments", imports = {}))
    public static /* synthetic */ void getPathSegments$annotations() {
    }

    public Url(io.ktor.http.URLProtocol uRLProtocol, java.lang.String host, int i, final java.util.List<java.lang.String> pathSegments, io.ktor.http.Parameters parameters, java.lang.String fragment, java.lang.String str, java.lang.String str2, boolean z, java.lang.String urlString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.host = host;
        this.specifiedPort = i;
        this.parameters = parameters;
        this.fragment = fragment;
        this.user = str;
        this.password = str2;
        this.trailingQuery = z;
        this.urlString = urlString;
        if (i < 0 || i >= 65536) {
            throw new java.lang.IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i).toString());
        }
        this.pathSegments = pathSegments;
        this.rawSegments = pathSegments;
        this.segments = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.List segments_delegate$lambda$1;
                segments_delegate$lambda$1 = io.ktor.http.Url.segments_delegate$lambda$1(pathSegments);
                return segments_delegate$lambda$1;
            }
        });
        this.protocolOrNull = uRLProtocol;
        this.protocol = uRLProtocol == null ? io.ktor.http.URLProtocol.INSTANCE.getHTTP() : uRLProtocol;
        this.encodedPath = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String encodedPath_delegate$lambda$3;
                encodedPath_delegate$lambda$3 = io.ktor.http.Url.encodedPath_delegate$lambda$3(pathSegments, this);
                return encodedPath_delegate$lambda$3;
            }
        });
        this.encodedQuery = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String encodedQuery_delegate$lambda$4;
                encodedQuery_delegate$lambda$4 = io.ktor.http.Url.encodedQuery_delegate$lambda$4(io.ktor.http.Url.this);
                return encodedQuery_delegate$lambda$4;
            }
        });
        this.encodedPathAndQuery = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String encodedPathAndQuery_delegate$lambda$5;
                encodedPathAndQuery_delegate$lambda$5 = io.ktor.http.Url.encodedPathAndQuery_delegate$lambda$5(io.ktor.http.Url.this);
                return encodedPathAndQuery_delegate$lambda$5;
            }
        });
        this.encodedUser = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String encodedUser_delegate$lambda$6;
                encodedUser_delegate$lambda$6 = io.ktor.http.Url.encodedUser_delegate$lambda$6(io.ktor.http.Url.this);
                return encodedUser_delegate$lambda$6;
            }
        });
        this.encodedPassword = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String encodedPassword_delegate$lambda$7;
                encodedPassword_delegate$lambda$7 = io.ktor.http.Url.encodedPassword_delegate$lambda$7(io.ktor.http.Url.this);
                return encodedPassword_delegate$lambda$7;
            }
        });
        this.encodedFragment = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Url$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String encodedFragment_delegate$lambda$8;
                encodedFragment_delegate$lambda$8 = io.ktor.http.Url.encodedFragment_delegate$lambda$8(io.ktor.http.Url.this);
                return encodedFragment_delegate$lambda$8;
            }
        });
    }

    public final java.lang.String getHost() {
        return this.host;
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final io.ktor.http.Parameters getParameters() {
        return this.parameters;
    }

    public final java.lang.String getFragment() {
        return this.fragment;
    }

    public final java.lang.String getUser() {
        return this.user;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final java.util.List<java.lang.String> getPathSegments() {
        return this.pathSegments;
    }

    public final java.util.List<java.lang.String> getRawSegments() {
        return this.rawSegments;
    }

    public final java.util.List<java.lang.String> getSegments() {
        return (java.util.List) this.segments.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List segments_delegate$lambda$1(java.util.List list) {
        if (list.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return list.subList((((java.lang.CharSequence) kotlin.collections.CollectionsKt.first(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((java.lang.CharSequence) kotlin.collections.CollectionsKt.last(list)).length() == 0 ? kotlin.collections.CollectionsKt.getLastIndex(list) : 1 + kotlin.collections.CollectionsKt.getLastIndex(list));
    }

    public final io.ktor.http.URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final io.ktor.http.URLProtocol getProtocol() {
        return this.protocol;
    }

    public final int getPort() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.specifiedPort);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.protocol.getDefaultPort();
    }

    public final java.lang.String getEncodedPath() {
        return (java.lang.String) this.encodedPath.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedPath_delegate$lambda$3(java.util.List list, io.ktor.http.Url url) {
        int indexOf$default;
        if (list.isEmpty() || (indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) url.urlString, kotlinx.io.files.FileSystemKt.UnixPathSeparator, url.protocol.getName().length() + 3, false, 4, (java.lang.Object) null)) == -1) {
            return "";
        }
        int indexOfAny$default = kotlin.text.StringsKt.indexOfAny$default((java.lang.CharSequence) url.urlString, new char[]{'?', '#'}, indexOf$default, false, 4, (java.lang.Object) null);
        if (indexOfAny$default == -1) {
            java.lang.String substring = url.urlString.substring(indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        java.lang.String substring2 = url.urlString.substring(indexOf$default, indexOfAny$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    public final java.lang.String getEncodedQuery() {
        return (java.lang.String) this.encodedQuery.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedQuery_delegate$lambda$4(io.ktor.http.Url url) {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) url.urlString, '?', 0, false, 6, (java.lang.Object) null) + 1;
        if (indexOf$default == 0) {
            return "";
        }
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) url.urlString, '#', indexOf$default, false, 4, (java.lang.Object) null);
        if (indexOf$default2 == -1) {
            java.lang.String substring = url.urlString.substring(indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        java.lang.String substring2 = url.urlString.substring(indexOf$default, indexOf$default2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    public final java.lang.String getEncodedPathAndQuery() {
        return (java.lang.String) this.encodedPathAndQuery.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedPathAndQuery_delegate$lambda$5(io.ktor.http.Url url) {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) url.urlString, kotlinx.io.files.FileSystemKt.UnixPathSeparator, url.protocol.getName().length() + 3, false, 4, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return "";
        }
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) url.urlString, '#', indexOf$default, false, 4, (java.lang.Object) null);
        if (indexOf$default2 == -1) {
            java.lang.String substring = url.urlString.substring(indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        java.lang.String substring2 = url.urlString.substring(indexOf$default, indexOf$default2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    public final java.lang.String getEncodedUser() {
        return (java.lang.String) this.encodedUser.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedUser_delegate$lambda$6(io.ktor.http.Url url) {
        java.lang.String str = url.user;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = url.protocol.getName().length() + 3;
        java.lang.String substring = url.urlString.substring(length, kotlin.text.StringsKt.indexOfAny$default((java.lang.CharSequence) url.urlString, new char[]{kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, '@'}, length, false, 4, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final java.lang.String getEncodedPassword() {
        return (java.lang.String) this.encodedPassword.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedPassword_delegate$lambda$7(io.ktor.http.Url url) {
        java.lang.String str = url.password;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        java.lang.String substring = url.urlString.substring(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) url.urlString, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, url.protocol.getName().length() + 3, false, 4, (java.lang.Object) null) + 1, kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) url.urlString, '@', 0, false, 6, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final java.lang.String getEncodedFragment() {
        return (java.lang.String) this.encodedFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodedFragment_delegate$lambda$8(io.ktor.http.Url url) {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) url.urlString, '#', 0, false, 6, (java.lang.Object) null) + 1;
        if (indexOf$default == 0) {
            return "";
        }
        java.lang.String substring = url.urlString.substring(indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    /* renamed from: toString, reason: from getter */
    public java.lang.String getUrlString() {
        return this.urlString;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.urlString, ((io.ktor.http.Url) other).urlString);
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    private final java.lang.Object writeReplace() {
        return io.ktor.utils.io.JvmSerializable_jvmKt.JvmSerializerReplacement(io.ktor.http.UrlJvmSerializer.INSTANCE, this);
    }

    /* compiled from: Url.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/Url$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Url;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<io.ktor.http.Url> serializer() {
            return io.ktor.http.UrlSerializer.INSTANCE;
        }
    }
}
