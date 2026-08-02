package okhttp3;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\u000fR(\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0014"}, d2 = {"Lokhttp3/Challenge;", "", "", "scheme", "", "authParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", io.ktor.http.auth.HttpAuthHeader.Parameters.Realm, "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "withCharset", "(Ljava/nio/charset/Charset;)Lokhttp3/Challenge;", "-deprecated_scheme", "()Ljava/lang/String;", "-deprecated_authParams", "()Ljava/util/Map;", "-deprecated_realm", "-deprecated_charset", "()Ljava/nio/charset/Charset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Challenge {
    private final java.util.Map<java.lang.String, java.lang.String> authParams;
    private final java.lang.String scheme;

    public Challenge(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.scheme = str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key != null) {
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                str2 = key.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        java.util.Map<java.lang.String, java.lang.String> unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "");
        this.authParams = unmodifiableMap;
    }

    public final java.lang.String scheme() {
        return this.scheme;
    }

    public final java.util.Map<java.lang.String, java.lang.String> authParams() {
        return this.authParams;
    }

    public final java.lang.String realm() {
        return this.authParams.get(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm);
    }

    public final java.nio.charset.Charset charset() {
        java.lang.String str = this.authParams.get(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset);
        if (str != null) {
            try {
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName(str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "");
                return forName;
            } catch (java.lang.Exception unused) {
            }
        }
        return kotlin.text.Charsets.ISO_8859_1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Challenge(java.lang.String str, java.lang.String str2) {
        this(str, (java.util.Map<java.lang.String, java.lang.String>) r4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.util.Map singletonMap = java.util.Collections.singletonMap(io.ktor.http.auth.HttpAuthHeader.Parameters.Realm, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singletonMap, "");
    }

    public final okhttp3.Challenge withCharset(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(this.authParams);
        mutableMap.put(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, charset.name());
        return new okhttp3.Challenge(this.scheme, (java.util.Map<java.lang.String, java.lang.String>) mutableMap);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final java.lang.String getScheme() {
        return this.scheme;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "authParams", imports = {}))
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final java.util.Map<java.lang.String, java.lang.String> m24297deprecated_authParams() {
        return this.authParams;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = io.ktor.http.auth.HttpAuthHeader.Parameters.Realm, imports = {}))
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final java.lang.String m24299deprecated_realm() {
        return realm();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, imports = {}))
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final java.nio.charset.Charset m24298deprecated_charset() {
        return charset();
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof okhttp3.Challenge)) {
            return false;
        }
        okhttp3.Challenge challenge = (okhttp3.Challenge) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(challenge.scheme, this.scheme) && kotlin.jvm.internal.Intrinsics.areEqual(challenge.authParams, this.authParams);
    }

    public final int hashCode() {
        return ((this.scheme.hashCode() + 899) * 31) + this.authParams.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.scheme);
        sb.append(" authParams=");
        sb.append(this.authParams);
        return sb.toString();
    }
}
