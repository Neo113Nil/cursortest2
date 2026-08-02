package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 S2\u00020\u0001:\u0001SBm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R$\u00103\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u001fR(\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u001fR$\u00108\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001c\u001a\u0004\b9\u0010\u0014\"\u0004\b:\u0010\u001fR(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010\u001fR\"\u0010=\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u0014\"\u0004\b?\u0010\u001fR$\u0010\u000e\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u0010\u001fR(\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010E\"\u0004\bI\u0010GR*\u0010K\u001a\u00020J2\u0006\u0010%\u001a\u00020J8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\r\u001a\u00020J2\u0006\u0010Q\u001a\u00020J8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bR\u0010N"}, d2 = {"Lio/ktor/http/URLBuilder;", "", "Lio/ktor/http/URLProtocol;", "protocol", "", com.datadog.android.log.LogAttributes.HOST, "", "port", "user", "password", "", "pathSegments", "Lio/ktor/http/Parameters;", "parameters", "fragment", "", "trailingQuery", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Z)V", "buildString", "()Ljava/lang/String;", "toString", "Lio/ktor/http/Url;", "build", "()Lio/ktor/http/Url;", "", "getHighSpeedVideoFpsRangesFor", "()V", "Ljava/lang/String;", "getHost", "setHost", "(Ljava/lang/String;)V", "Z", "getTrailingQuery", "()Z", "setTrailingQuery", "(Z)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getPort", "()I", "setPort", "(I)V", "protocolOrNull", "Lio/ktor/http/URLProtocol;", "getProtocolOrNull", "()Lio/ktor/http/URLProtocol;", "setProtocolOrNull", "(Lio/ktor/http/URLProtocol;)V", "getProtocol", "setProtocol", "encodedUser", "getEncodedUser", "setEncodedUser", "getUser", "setUser", "encodedPassword", "getEncodedPassword", "setEncodedPassword", "getPassword", "setPassword", "encodedFragment", "getEncodedFragment", "setEncodedFragment", "getFragment", "setFragment", "encodedPathSegments", "Ljava/util/List;", "getEncodedPathSegments", "()Ljava/util/List;", "setEncodedPathSegments", "(Ljava/util/List;)V", "getPathSegments", "setPathSegments", "Lio/ktor/http/ParametersBuilder;", "encodedParameters", "Lio/ktor/http/ParametersBuilder;", "getEncodedParameters", "()Lio/ktor/http/ParametersBuilder;", "setEncodedParameters", "(Lio/ktor/http/ParametersBuilder;)V", "p0", "getParameters", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class URLBuilder {
    private static final io.ktor.http.Url getHighSpeedVideoSizes;
    private java.lang.String encodedFragment;
    private io.ktor.http.ParametersBuilder encodedParameters;
    private java.lang.String encodedPassword;
    private java.util.List<java.lang.String> encodedPathSegments;
    private java.lang.String encodedUser;
    private java.lang.String host;
    private io.ktor.http.ParametersBuilder parameters;
    private int port;
    private io.ktor.http.URLProtocol protocolOrNull;
    private boolean trailingQuery;

    public URLBuilder(io.ktor.http.URLProtocol uRLProtocol, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, io.ktor.http.Parameters parameters, java.lang.String str4, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.host = str;
        this.trailingQuery = z;
        this.port = i;
        this.protocolOrNull = uRLProtocol;
        this.encodedUser = str2 != null ? io.ktor.http.CodecsKt.encodeURLParameter$default(str2, false, 1, null) : null;
        this.encodedPassword = str3 != null ? io.ktor.http.CodecsKt.encodeURLParameter$default(str3, false, 1, null) : null;
        this.encodedFragment = io.ktor.http.CodecsKt.encodeURLQueryComponent$default(str4, false, false, null, 7, null);
        java.util.List<java.lang.String> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.encodeURLPathPart((java.lang.String) it.next()));
        }
        this.encodedPathSegments = arrayList;
        this.encodedParameters = io.ktor.http.UrlDecodedParametersBuilderKt.encodeParameters(parameters);
        this.parameters = new io.ktor.http.UrlDecodedParametersBuilder(this.encodedParameters);
    }

    public /* synthetic */ URLBuilder(io.ktor.http.URLProtocol uRLProtocol, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.util.List list, io.ktor.http.Parameters parameters, java.lang.String str4, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uRLProtocol, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? str3 : null, (i2 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? io.ktor.http.Parameters.INSTANCE.getEmpty() : parameters, (i2 & 128) == 0 ? str4 : "", (i2 & 256) == 0 ? z : false);
    }

    public final java.lang.String getHost() {
        return this.host;
    }

    public final void setHost(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.host = str;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final void setTrailingQuery(boolean z) {
        this.trailingQuery = z;
    }

    public final int getPort() {
        return this.port;
    }

    public final void setPort(int i) {
        if (i < 0 || i >= 65536) {
            throw new java.lang.IllegalArgumentException("Port must be between 0 and 65535, or 0 if not set. Provided: ".concat(java.lang.String.valueOf(i)).toString());
        }
        this.port = i;
    }

    public final io.ktor.http.URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final void setProtocolOrNull(io.ktor.http.URLProtocol uRLProtocol) {
        this.protocolOrNull = uRLProtocol;
    }

    public final io.ktor.http.URLProtocol getProtocol() {
        io.ktor.http.URLProtocol uRLProtocol = this.protocolOrNull;
        return uRLProtocol == null ? io.ktor.http.URLProtocol.INSTANCE.getHTTP() : uRLProtocol;
    }

    public final void setProtocol(io.ktor.http.URLProtocol uRLProtocol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLProtocol, "");
        this.protocolOrNull = uRLProtocol;
    }

    public final java.lang.String getEncodedUser() {
        return this.encodedUser;
    }

    public final void setEncodedUser(java.lang.String str) {
        this.encodedUser = str;
    }

    public final java.lang.String getUser() {
        java.lang.String str = this.encodedUser;
        if (str != null) {
            return io.ktor.http.CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void setUser(java.lang.String str) {
        this.encodedUser = str != null ? io.ktor.http.CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    public final java.lang.String getEncodedPassword() {
        return this.encodedPassword;
    }

    public final void setEncodedPassword(java.lang.String str) {
        this.encodedPassword = str;
    }

    public final java.lang.String getPassword() {
        java.lang.String str = this.encodedPassword;
        if (str != null) {
            return io.ktor.http.CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void setPassword(java.lang.String str) {
        this.encodedPassword = str != null ? io.ktor.http.CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    public final java.lang.String getEncodedFragment() {
        return this.encodedFragment;
    }

    public final void setEncodedFragment(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.encodedFragment = str;
    }

    public final java.lang.String getFragment() {
        return io.ktor.http.CodecsKt.decodeURLQueryComponent$default(this.encodedFragment, 0, 0, false, null, 15, null);
    }

    public final void setFragment(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.encodedFragment = io.ktor.http.CodecsKt.encodeURLQueryComponent$default(str, false, false, null, 7, null);
    }

    public final java.util.List<java.lang.String> getEncodedPathSegments() {
        return this.encodedPathSegments;
    }

    public final void setEncodedPathSegments(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.encodedPathSegments = list;
    }

    public final java.util.List<java.lang.String> getPathSegments() {
        java.util.List<java.lang.String> list = this.encodedPathSegments;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.decodeURLPart$default((java.lang.String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final void setPathSegments(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<java.lang.String> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CodecsKt.encodeURLPathPart((java.lang.String) it.next()));
        }
        this.encodedPathSegments = arrayList;
    }

    public final io.ktor.http.ParametersBuilder getEncodedParameters() {
        return this.encodedParameters;
    }

    public final void setEncodedParameters(io.ktor.http.ParametersBuilder parametersBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parametersBuilder, "");
        this.encodedParameters = parametersBuilder;
        this.parameters = new io.ktor.http.UrlDecodedParametersBuilder(parametersBuilder);
    }

    public final io.ktor.http.ParametersBuilder getParameters() {
        return this.parameters;
    }

    public final java.lang.String buildString() {
        getHighSpeedVideoFpsRangesFor();
        java.lang.String obj = ((java.lang.StringBuilder) io.ktor.http.URLBuilderKt.access$appendTo(this, new java.lang.StringBuilder(256))).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String toString() {
        java.lang.String obj = ((java.lang.StringBuilder) io.ktor.http.URLBuilderKt.access$appendTo(this, new java.lang.StringBuilder(256))).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final io.ktor.http.Url build() {
        getHighSpeedVideoFpsRangesFor();
        return new io.ktor.http.Url(this.protocolOrNull, this.host, this.port, getPathSegments(), this.parameters.build(), getFragment(), getUser(), getPassword(), this.trailingQuery, buildString());
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (this.host.length() <= 0 && !kotlin.jvm.internal.Intrinsics.areEqual(getProtocol().getName(), "file")) {
            io.ktor.http.Url url = getHighSpeedVideoSizes;
            this.host = url.getHost();
            if (this.protocolOrNull == null) {
                this.protocolOrNull = url.getProtocolOrNull();
            }
            if (this.port == 0) {
                setPort(url.getSpecifiedPort());
            }
        }
    }

    static {
        io.ktor.http.URLBuilder.Companion companion = new io.ktor.http.URLBuilder.Companion(null);
        INSTANCE = companion;
        getHighSpeedVideoSizes = io.ktor.http.URLUtilsKt.Url(io.ktor.http.URLBuilderJvmKt.getOrigin(companion));
    }

    public URLBuilder() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }
}
