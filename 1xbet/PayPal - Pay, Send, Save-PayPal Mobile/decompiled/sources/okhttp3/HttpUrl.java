package okhttp3;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b\u001d\u0018\u0000 ]2\u00020\u0001:\u0002^]Bc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b%\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u0010 J\u000f\u00100\u001a\u00020\u0010H\u0007¢\u0006\u0004\b0\u0010\u0012J\u000f\u00101\u001a\u00020\u0013H\u0007¢\u0006\u0004\b1\u0010\u0015J\u000f\u00102\u001a\u00020\u0002H\u0007¢\u0006\u0004\b2\u0010 J\u000f\u00103\u001a\u00020\u0002H\u0007¢\u0006\u0004\b3\u0010 J\u000f\u00104\u001a\u00020\u0002H\u0007¢\u0006\u0004\b4\u0010 J\u000f\u00105\u001a\u00020\u0002H\u0007¢\u0006\u0004\b5\u0010 J\u000f\u00106\u001a\u00020\u0002H\u0007¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\u0002H\u0007¢\u0006\u0004\b7\u0010 J\u000f\u00108\u001a\u00020\u0007H\u0007¢\u0006\u0004\b8\u0010-J\u000f\u00109\u001a\u00020\u0007H\u0007¢\u0006\u0004\b9\u0010-J\u000f\u0010:\u001a\u00020\u0002H\u0007¢\u0006\u0004\b:\u0010 J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b=\u0010<J\u0011\u0010>\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b>\u0010 J\u0011\u0010?\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b?\u0010 J\u000f\u0010@\u001a\u00020\u0007H\u0007¢\u0006\u0004\b@\u0010-J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020AH\u0007¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\bD\u0010 J\u0011\u0010E\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\bE\u0010 R\u0017\u0010F\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010 R\u001a\u0010H\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010G\u001a\u0004\bH\u0010 R\u001a\u0010I\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bI\u0010 R\u001a\u0010J\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bJ\u0010 R\u001a\u0010K\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bK\u0010-R \u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010<R\u001e\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bP\u0010 R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0011\u0010Q\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010S\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bS\u0010 R\u0011\u0010T\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bT\u0010 R\u0011\u0010U\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bU\u0010-R\u0011\u0010V\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bV\u0010 R\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\bW\u0010<R\u0013\u0010X\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\bX\u0010 R\u0013\u0010Y\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\bY\u0010 R\u0011\u0010Z\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bZ\u0010-R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00020A8G¢\u0006\u0006\u001a\u0004\b[\u0010CR\u0013\u0010\\\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\\\u0010 "}, d2 = {"Lokhttp3/HttpUrl;", "", "", "p0", "p1", "p2", "p3", "", "p4", "", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "url", "()Ljava/net/URL;", "Ljava/net/URI;", "uri", "()Ljava/net/URI;", "name", "queryParameter", "(Ljava/lang/String;)Ljava/lang/String;", "queryParameterValues", "(Ljava/lang/String;)Ljava/util/List;", "index", "queryParameterName", "(I)Ljava/lang/String;", "queryParameterValue", "redact", "()Ljava/lang/String;", "link", "resolve", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "()Lokhttp3/HttpUrl$Builder;", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "-deprecated_encodedUsername", "-deprecated_username", "-deprecated_encodedPassword", "-deprecated_password", "-deprecated_host", "-deprecated_port", "-deprecated_pathSize", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "-deprecated_pathSegments", "-deprecated_encodedQuery", "-deprecated_query", "-deprecated_querySize", "", "-deprecated_queryParameterNames", "()Ljava/util/Set;", "-deprecated_encodedFragment", "-deprecated_fragment", "scheme", "Ljava/lang/String;", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "password", com.datadog.android.log.LogAttributes.HOST, "port", com.visa.cbp.getEncExpo.warmup, "pathSegments", "Ljava/util/List;", "queryNamesAndValues", "fragment", "isHttps", "()Z", "encodedUsername", "encodedPassword", "pathSize", "encodedPath", "encodedPathSegments", "encodedQuery", "query", "querySize", "queryParameterNames", "encodedFragment", "Companion", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpUrl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.HttpUrl.Companion INSTANCE = new okhttp3.HttpUrl.Companion(null);
    private final java.lang.String fragment;
    private final java.lang.String host;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    private final int port;
    private final java.util.List<java.lang.String> queryNamesAndValues;
    private final java.lang.String scheme;
    private final java.lang.String url;
    private final java.lang.String username;

    private HttpUrl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str5, java.lang.String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }

    public final java.lang.String scheme() {
        return this.scheme;
    }

    public final java.lang.String username() {
        return this.username;
    }

    public final java.lang.String password() {
        return this.password;
    }

    public final java.lang.String host() {
        return this.host;
    }

    public final int port() {
        return this.port;
    }

    public final java.util.List<java.lang.String> pathSegments() {
        return this.pathSegments;
    }

    public final java.lang.String fragment() {
        return this.fragment;
    }

    public final boolean isHttps() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.scheme, "https");
    }

    public final java.net.URL url() {
        try {
            return new java.net.URL(this.url);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final java.net.URI uri() {
        java.lang.String obj = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new java.net.URI(obj);
        } catch (java.net.URISyntaxException e) {
            try {
                java.net.URI create = java.net.URI.create(new kotlin.text.Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(obj, ""));
                kotlin.jvm.internal.Intrinsics.checkNotNull(create);
                return create;
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    public final java.lang.String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        java.lang.String str = this.url;
        java.lang.String substring = this.url.substring(length, okhttp3.internal._UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public final java.lang.String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, this.scheme.length() + 3, false, 4, (java.lang.Object) null);
        java.lang.String substring = this.url.substring(indexOf$default + 1, kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '@', 0, false, 6, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final java.lang.String encodedPath() {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, kotlinx.io.files.FileSystemKt.UnixPathSeparator, this.scheme.length() + 3, false, 4, (java.lang.Object) null);
        java.lang.String str = this.url;
        java.lang.String substring = this.url.substring(indexOf$default, okhttp3.internal._UtilCommonKt.delimiterOffset(str, "?#", indexOf$default, str.length()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public final java.util.List<java.lang.String> encodedPathSegments() {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, kotlinx.io.files.FileSystemKt.UnixPathSeparator, this.scheme.length() + 3, false, 4, (java.lang.Object) null);
        java.lang.String str = this.url;
        int delimiterOffset = okhttp3.internal._UtilCommonKt.delimiterOffset(str, "?#", indexOf$default, str.length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (indexOf$default < delimiterOffset) {
            int i = indexOf$default + 1;
            int delimiterOffset2 = okhttp3.internal._UtilCommonKt.delimiterOffset(this.url, kotlinx.io.files.FileSystemKt.UnixPathSeparator, i, delimiterOffset);
            java.lang.String substring = this.url.substring(i, delimiterOffset2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            arrayList.add(substring);
            indexOf$default = delimiterOffset2;
        }
        return arrayList;
    }

    public final java.lang.String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '?', 0, false, 6, (java.lang.Object) null) + 1;
        java.lang.String str = this.url;
        java.lang.String substring = this.url.substring(indexOf$default, okhttp3.internal._UtilCommonKt.delimiterOffset(str, '#', indexOf$default, str.length()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public final java.lang.String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        okhttp3.HttpUrl.Companion.access$toQueryString(INSTANCE, this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final int querySize() {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final java.lang.String queryParameter(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, list.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!kotlin.jvm.internal.Intrinsics.areEqual(name2, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    public final java.util.Set<java.lang.String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.queryNamesAndValues.size() / 2, 1.0f);
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                java.lang.String str = this.queryNamesAndValues.get(first);
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        java.util.Set<java.lang.String> unmodifiableSet = java.util.Collections.unmodifiableSet(linkedHashSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "");
        return unmodifiableSet;
    }

    public final java.util.List<java.lang.String> queryParameterValues(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (this.queryNamesAndValues == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(name2, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        java.util.List<java.lang.String> unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "");
        return unmodifiableList;
    }

    public final java.lang.String queryParameterName(int index) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        java.lang.String str = list.get(index * 2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        return str;
    }

    public final java.lang.String queryParameterValue(int index) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return list.get((index * 2) + 1);
    }

    public final java.lang.String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        java.lang.String substring = this.url.substring(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '#', 0, false, 6, (java.lang.Object) null) + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public final java.lang.String redact() {
        okhttp3.HttpUrl.Builder newBuilder = newBuilder("/...");
        kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    public final okhttp3.HttpUrl resolve(java.lang.String link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        okhttp3.HttpUrl.Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final okhttp3.HttpUrl.Builder newBuilder() {
        okhttp3.HttpUrl.Builder builder = new okhttp3.HttpUrl.Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final okhttp3.HttpUrl.Builder newBuilder(java.lang.String link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        try {
            return new okhttp3.HttpUrl.Builder().parse$okhttp(this, link);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof okhttp3.HttpUrl) && kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.HttpUrl) other).url, this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String topPrivateDomain() {
        if (okhttp3.internal._HostnamesCommonKt.canParseAsIpAddress(this.host)) {
            return null;
        }
        return okhttp3.internal.publicsuffix.PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @kotlin.ReplaceWith(expression = "toUrl()", imports = {}))
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final java.net.URL m24344deprecated_url() {
        return url();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @kotlin.ReplaceWith(expression = "toUri()", imports = {}))
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final java.net.URI m24343deprecated_uri() {
        return uri();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final java.lang.String getScheme() {
        return this.scheme;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedUsername", imports = {}))
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final java.lang.String m24332deprecated_encodedUsername() {
        return encodedUsername();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, imports = {}))
    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPassword", imports = {}))
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final java.lang.String m24328deprecated_encodedPassword() {
        return encodedPassword();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "password", imports = {}))
    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.datadog.android.log.LogAttributes.HOST, imports = {}))
    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final java.lang.String getHost() {
        return this.host;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "port", imports = {}))
    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSize", imports = {}))
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m24337deprecated_pathSize() {
        return pathSize();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPath", imports = {}))
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final java.lang.String m24329deprecated_encodedPath() {
        return encodedPath();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPathSegments", imports = {}))
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m24330deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSegments", imports = {}))
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m24336deprecated_pathSegments() {
        return this.pathSegments;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedQuery", imports = {}))
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final java.lang.String m24331deprecated_encodedQuery() {
        return encodedQuery();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "query", imports = {}))
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final java.lang.String m24339deprecated_query() {
        return query();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "querySize", imports = {}))
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m24341deprecated_querySize() {
        return querySize();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "queryParameterNames", imports = {}))
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final java.util.Set<java.lang.String> m24340deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedFragment", imports = {}))
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final java.lang.String m24327deprecated_encodedFragment() {
        return encodedFragment();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "fragment", imports = {}))
    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final java.lang.String getFragment() {
        return this.fragment;
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0006J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0006J\u0017\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u0006J\u0017\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010\u0006J\u001f\u0010&\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010'J\u001f\u0010+\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010'J\u001f\u0010,\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b,\u0010'J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b-\u0010\u0006J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\u0006J\u0017\u00100\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u0010\u0006J\u0017\u00103\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b3\u0010\u0006J\u000f\u00104\u001a\u00020\u0000H\u0000¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u0001062\u0006\u0010>\u001a\u00020\u0004H\u0000¢\u0006\u0004\b?\u0010@J'\u0010\u001a\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010BJ7\u0010\u001a\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010C\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010EJ\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u0010\u0003J\u0017\u00109\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010FJ\u001b\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040G*\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010IJ'\u00100\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010JR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010<\"\u0004\bM\u00101R\"\u0010\b\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\b\u0010K\u001a\u0004\bN\u0010<\"\u0004\bO\u00101R\"\u0010\n\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\n\u0010K\u001a\u0004\bP\u0010<\"\u0004\bQ\u00101R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010K\u001a\u0004\bR\u0010<\"\u0004\bS\u00101R\"\u0010\r\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\r\u0010T\u001a\u0004\bU\u0010:\"\u0004\bV\u0010WR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040G8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u0010ZR,\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010G8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010Z\"\u0004\b]\u0010^R$\u00103\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b3\u0010K\u001a\u0004\b_\u0010<\"\u0004\b`\u00101"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "encodedUsername", "password", "encodedPassword", com.datadog.android.log.LogAttributes.HOST, "", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "p0", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "index", "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)V", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "getHighSpeedVideoSizes", "()I", "toString", "()Ljava/lang/String;", "base", "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "p2", "(Ljava/lang/String;II)V", "p3", "p4", "(Ljava/lang/String;IIZZ)V", "(Ljava/lang/String;)Z", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;II)I", "Ljava/lang/String;", "getScheme$okhttp", "setScheme$okhttp", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", com.visa.cbp.getEncExpo.warmup, "getPort$okhttp", "setPort$okhttp", "(I)V", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String encodedFragment;
        private java.util.List<java.lang.String> encodedQueryNamesAndValues;
        private java.lang.String host;
        private java.lang.String scheme;
        private java.lang.String encodedUsername = "";
        private java.lang.String encodedPassword = "";
        private int port = -1;
        private final java.util.List<java.lang.String> encodedPathSegments = kotlin.collections.CollectionsKt.mutableListOf("");

        /* renamed from: getScheme$okhttp, reason: from getter */
        public final java.lang.String getScheme() {
            return this.scheme;
        }

        public final void setScheme$okhttp(java.lang.String str) {
            this.scheme = str;
        }

        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final java.lang.String getEncodedUsername() {
            return this.encodedUsername;
        }

        public final void setEncodedUsername$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.encodedUsername = str;
        }

        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final java.lang.String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final void setEncodedPassword$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.encodedPassword = str;
        }

        /* renamed from: getHost$okhttp, reason: from getter */
        public final java.lang.String getHost() {
            return this.host;
        }

        public final void setHost$okhttp(java.lang.String str) {
            this.host = str;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final java.util.List<java.lang.String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final java.util.List<java.lang.String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(java.util.List<java.lang.String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final java.lang.String getEncodedFragment() {
            return this.encodedFragment;
        }

        public final void setEncodedFragment$okhttp(java.lang.String str) {
            this.encodedFragment = str;
        }

        public final okhttp3.HttpUrl.Builder scheme(java.lang.String scheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
            if (kotlin.text.StringsKt.equals(scheme, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (kotlin.text.StringsKt.equals(scheme, "https", true)) {
                this.scheme = "https";
                return this;
            }
            throw new java.lang.IllegalArgumentException("unexpected scheme: ".concat(java.lang.String.valueOf(scheme)));
        }

        public final okhttp3.HttpUrl.Builder username(java.lang.String username) {
            java.lang.String canonicalize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "");
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(username, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? username.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            this.encodedUsername = canonicalize;
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedUsername(java.lang.String encodedUsername) {
            java.lang.String canonicalize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedUsername, "");
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(encodedUsername, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? encodedUsername.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            this.encodedUsername = canonicalize;
            return this;
        }

        public final okhttp3.HttpUrl.Builder password(java.lang.String password) {
            java.lang.String canonicalize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(password, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? password.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            this.encodedPassword = canonicalize;
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedPassword(java.lang.String encodedPassword) {
            java.lang.String canonicalize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPassword, "");
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(encodedPassword, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? encodedPassword.length() : 0, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            this.encodedPassword = canonicalize;
            return this;
        }

        public final okhttp3.HttpUrl.Builder host(java.lang.String host) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "");
            java.lang.String canonicalHost = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(okhttp3.internal.url._UrlKt.percentDecode$default(host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new java.lang.IllegalArgumentException("unexpected host: ".concat(java.lang.String.valueOf(host)));
            }
            this.host = canonicalHost;
            return this;
        }

        public final okhttp3.HttpUrl.Builder port(int port) {
            if (port <= 0 || port >= 65536) {
                throw new java.lang.IllegalArgumentException("unexpected port: ".concat(java.lang.String.valueOf(port)).toString());
            }
            this.port = port;
            return this;
        }

        public final okhttp3.HttpUrl.Builder addPathSegment(java.lang.String pathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegment, "");
            getHighSpeedVideoFpsRangesFor(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String pathSegments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegments, "");
            return getHighSpeedVideoFpsRangesFor(pathSegments, false);
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegment(java.lang.String encodedPathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegment, "");
            getHighSpeedVideoFpsRangesFor(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegments(java.lang.String encodedPathSegments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegments, "");
            return getHighSpeedVideoFpsRangesFor(encodedPathSegments, true);
        }

        private final okhttp3.HttpUrl.Builder getHighSpeedVideoFpsRangesFor(java.lang.String p0, boolean p1) {
            int i = 0;
            do {
                int delimiterOffset = okhttp3.internal._UtilCommonKt.delimiterOffset(p0, "/\\", i, p0.length());
                getHighSpeedVideoFpsRangesFor(p0, i, delimiterOffset, delimiterOffset < p0.length(), p1);
                i = delimiterOffset + 1;
            } while (i <= p0.length());
            return this;
        }

        public final okhttp3.HttpUrl.Builder setPathSegment(int index, java.lang.String pathSegment) {
            java.lang.String canonicalize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegment, "");
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(pathSegment, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? pathSegment.length() : 0, okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET, (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            if (kotlin.jvm.internal.Intrinsics.areEqual(canonicalize, ".") || kotlin.text.StringsKt.equals(canonicalize, "%2e", true) || getHighSpeedVideoSizes(canonicalize)) {
                throw new java.lang.IllegalArgumentException("unexpected path segment: ".concat(java.lang.String.valueOf(pathSegment)).toString());
            }
            this.encodedPathSegments.set(index, canonicalize);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setEncodedPathSegment(int index, java.lang.String encodedPathSegment) {
            java.lang.String canonicalize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegment, "");
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(encodedPathSegment, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? encodedPathSegment.length() : 0, okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            this.encodedPathSegments.set(index, canonicalize);
            if (kotlin.jvm.internal.Intrinsics.areEqual(canonicalize, ".") || kotlin.text.StringsKt.equals(canonicalize, "%2e", true) || getHighSpeedVideoSizes(canonicalize)) {
                throw new java.lang.IllegalArgumentException("unexpected path segment: ".concat(java.lang.String.valueOf(encodedPathSegment)).toString());
            }
            return this;
        }

        public final okhttp3.HttpUrl.Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedPath(java.lang.String encodedPath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPath, "");
            if (!kotlin.text.StringsKt.startsWith$default(encodedPath, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
                throw new java.lang.IllegalArgumentException("unexpected encodedPath: ".concat(java.lang.String.valueOf(encodedPath)).toString());
            }
            getHighSpeedVideoFpsRangesFor(encodedPath, 0, encodedPath.length());
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r12 = okhttp3.internal.url._UrlKt.canonicalize(r12, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? r12.length() : 0, okhttp3.internal.url._UrlKt.QUERY_ENCODE_SET, (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final okhttp3.HttpUrl.Builder query(java.lang.String query) {
            java.lang.String canonicalize;
            java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI = (query == null || canonicalize == null) ? null : getHighResolutionOutputSizeshNQ4ISI(canonicalize);
            this.encodedQueryNamesAndValues = highResolutionOutputSizeshNQ4ISI;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r12 = okhttp3.internal.url._UrlKt.canonicalize(r12, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? r12.length() : 0, okhttp3.internal.url._UrlKt.QUERY_ENCODE_SET, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final okhttp3.HttpUrl.Builder encodedQuery(java.lang.String encodedQuery) {
            java.lang.String canonicalize;
            java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI = (encodedQuery == null || canonicalize == null) ? null : getHighResolutionOutputSizeshNQ4ISI(canonicalize);
            this.encodedQueryNamesAndValues = highResolutionOutputSizeshNQ4ISI;
            return this;
        }

        public final okhttp3.HttpUrl.Builder addQueryParameter(java.lang.String name2, java.lang.String value) {
            java.lang.String canonicalize;
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new java.util.ArrayList();
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(name2, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? name2.length() : 0, okhttp3.internal.url._UrlKt.QUERY_COMPONENT_ENCODE_SET, (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
            list.add(canonicalize);
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
            if (value != null) {
                str = okhttp3.internal.url._UrlKt.canonicalize(value, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? value.length() : 0, okhttp3.internal.url._UrlKt.QUERY_COMPONENT_ENCODE_SET, (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addEncodedQueryParameter(java.lang.String encodedName, java.lang.String encodedValue) {
            java.lang.String canonicalize;
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new java.util.ArrayList();
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(encodedName, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? encodedName.length() : 0, okhttp3.internal.url._UrlKt.QUERY_COMPONENT_REENCODE_SET, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
            list.add(canonicalize);
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
            if (encodedValue != null) {
                str = okhttp3.internal.url._UrlKt.canonicalize(encodedValue, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? encodedValue.length() : 0, okhttp3.internal.url._UrlKt.QUERY_COMPONENT_REENCODE_SET, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setQueryParameter(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            removeAllQueryParameters(name2);
            addQueryParameter(name2, value);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setEncodedQueryParameter(java.lang.String encodedName, java.lang.String encodedValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final okhttp3.HttpUrl.Builder removeAllQueryParameters(java.lang.String name2) {
            java.lang.String canonicalize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(name2, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? name2.length() : 0, okhttp3.internal.url._UrlKt.QUERY_COMPONENT_ENCODE_SET, (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
            Camera2StreamConfigurationMap(canonicalize);
            return this;
        }

        public final okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(java.lang.String encodedName) {
            java.lang.String canonicalize;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(encodedName, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? encodedName.length() : 0, okhttp3.internal.url._UrlKt.QUERY_COMPONENT_REENCODE_SET, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
            Camera2StreamConfigurationMap(canonicalize);
            return this;
        }

        private final void Camera2StreamConfigurationMap(java.lang.String p0) {
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
                kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                if (kotlin.jvm.internal.Intrinsics.areEqual(p0, list2.get(size))) {
                    java.util.List<java.lang.String> list3 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    java.util.List<java.lang.String> list4 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    java.util.List<java.lang.String> list5 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final okhttp3.HttpUrl.Builder fragment(java.lang.String fragment) {
            java.lang.String str;
            if (fragment != null) {
                str = okhttp3.internal.url._UrlKt.canonicalize(fragment, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? fragment.length() : 0, "", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : true);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedFragment(java.lang.String encodedFragment) {
            java.lang.String str;
            if (encodedFragment != null) {
                str = okhttp3.internal.url._UrlKt.canonicalize(encodedFragment, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? encodedFragment.length() : 0, "", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : true);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        public final okhttp3.HttpUrl.Builder reencodeForUri$okhttp() {
            java.lang.String str;
            java.lang.String canonicalize;
            java.lang.String str2 = this.host;
            java.lang.String str3 = null;
            this.host = str2 != null ? new kotlin.text.Regex("[\"<>^`{|}]").replace(str2, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                java.util.List<java.lang.String> list = this.encodedPathSegments;
                canonicalize = okhttp3.internal.url._UrlKt.canonicalize(r7, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? list.get(i).length() : 0, okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : true, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                list.set(i, canonicalize);
            }
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    java.lang.String str4 = list2.get(i2);
                    if (str4 != null) {
                        str = okhttp3.internal.url._UrlKt.canonicalize(str4, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? str4.length() : 0, okhttp3.internal.url._UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : true, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
                    } else {
                        str = null;
                    }
                    list2.set(i2, str);
                }
            }
            java.lang.String str5 = this.encodedFragment;
            if (str5 != null) {
                str3 = okhttp3.internal.url._UrlKt.canonicalize(str5, (r18 & 1) != 0 ? 0 : 0, (r18 & 2) != 0 ? str5.length() : 0, okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET_URI, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : true, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : true);
            }
            this.encodedFragment = str3;
            return this;
        }

        public final okhttp3.HttpUrl build() {
            java.util.ArrayList arrayList;
            java.lang.String str = this.scheme;
            if (str == null) {
                throw new java.lang.IllegalStateException("scheme == null");
            }
            java.lang.String percentDecode$default = okhttp3.internal.url._UrlKt.percentDecode$default(this.encodedUsername, 0, 0, false, 7, null);
            java.lang.String percentDecode$default2 = okhttp3.internal.url._UrlKt.percentDecode$default(this.encodedPassword, 0, 0, false, 7, null);
            java.lang.String str2 = this.host;
            if (str2 == null) {
                throw new java.lang.IllegalStateException("host == null");
            }
            int highSpeedVideoSizes = getHighSpeedVideoSizes();
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(okhttp3.internal.url._UrlKt.percentDecode$default((java.lang.String) it.next(), 0, 0, false, 7, null));
            }
            java.util.ArrayList arrayList3 = arrayList2;
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                java.util.List<java.lang.String> list3 = list2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (java.lang.String str3 : list3) {
                    arrayList4.add(str3 != null ? okhttp3.internal.url._UrlKt.percentDecode$default(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            java.lang.String str4 = this.encodedFragment;
            return new okhttp3.HttpUrl(str, percentDecode$default, percentDecode$default2, str2, highSpeedVideoSizes, arrayList3, arrayList, str4 != null ? okhttp3.internal.url._UrlKt.percentDecode$default(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        private final int getHighSpeedVideoSizes() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
            java.lang.String str = this.scheme;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            return companion.defaultPort(str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
        
            if (r1 != r4.defaultPort(r5)) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            java.lang.String str2 = this.host;
            if (str2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, false, 2, (java.lang.Object) null)) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.host);
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int highSpeedVideoSizes = getHighSpeedVideoSizes();
                if (this.scheme != null) {
                    okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
                    java.lang.String str3 = this.scheme;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                }
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                sb.append(highSpeedVideoSizes);
            }
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                sb.append(list.get(i));
            }
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                okhttp3.HttpUrl.Companion companion2 = okhttp3.HttpUrl.INSTANCE;
                java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
                kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                okhttp3.HttpUrl.Companion.access$toQueryString(companion2, list2, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        
            if (r6 == ':') goto L37;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final okhttp3.HttpUrl.Builder parse$okhttp(okhttp3.HttpUrl base, java.lang.String input) {
            int i;
            java.lang.String str;
            char c;
            char c2;
            int delimiterOffset;
            int i2;
            int i3;
            int i4;
            int i5;
            char c3;
            char c4;
            boolean z;
            int i6;
            char c5;
            java.lang.String canonicalize;
            java.lang.String canonicalize2;
            boolean z2;
            java.lang.String canonicalize3;
            char c6;
            java.lang.String canonicalize4;
            java.lang.String canonicalize5;
            char charAt;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            int indexOfFirstNonAsciiWhitespace$default = okhttp3.internal._UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = okhttp3.internal._UtilCommonKt.indexOfLastNonAsciiWhitespace$default(input, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            int i7 = indexOfLastNonAsciiWhitespace$default - indexOfFirstNonAsciiWhitespace$default;
            char c7 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
            char c8 = 65535;
            boolean z3 = true;
            if (i7 >= 2) {
                char charAt2 = input.charAt(indexOfFirstNonAsciiWhitespace$default);
                if ((kotlin.jvm.internal.Intrinsics.compare((int) charAt2, 97) >= 0 && kotlin.jvm.internal.Intrinsics.compare((int) charAt2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) <= 0) || (kotlin.jvm.internal.Intrinsics.compare((int) charAt2, 65) >= 0 && kotlin.jvm.internal.Intrinsics.compare((int) charAt2, 90) <= 0)) {
                    i = indexOfFirstNonAsciiWhitespace$default;
                    while (true) {
                        i++;
                        if (i >= indexOfLastNonAsciiWhitespace$default) {
                            break;
                        }
                        char charAt3 = input.charAt(i);
                        if ('a' > charAt3 || charAt3 >= '{') {
                            if ('A' > charAt3 || charAt3 >= '[') {
                                if ('0' > charAt3 || charAt3 >= ':') {
                                    if (charAt3 != '+' && charAt3 != '-' && charAt3 != '.') {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i = -1;
            if (i != -1) {
                if (kotlin.text.StringsKt.startsWith(input, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (kotlin.text.StringsKt.startsWith(input, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    java.lang.String substring = input.substring(0, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    sb.append(substring);
                    sb.append('\'');
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                if (input.length() > 6) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(kotlin.text.StringsKt.take(input, 6));
                    sb2.append("...");
                    str = sb2.toString();
                } else {
                    str = input;
                }
                throw new java.lang.IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(java.lang.String.valueOf(str)));
            }
            int i8 = 0;
            int i9 = indexOfFirstNonAsciiWhitespace$default;
            while (true) {
                c = '\\';
                c2 = kotlinx.io.files.FileSystemKt.UnixPathSeparator;
                if (i9 >= indexOfLastNonAsciiWhitespace$default || !((charAt = input.charAt(i9)) == '/' || charAt == '\\')) {
                    break;
                }
                i8++;
                i9++;
            }
            char c9 = '?';
            char c10 = '#';
            if (i8 >= 2 || base == null || !kotlin.jvm.internal.Intrinsics.areEqual(base.scheme(), this.scheme)) {
                int i10 = indexOfFirstNonAsciiWhitespace$default + i8;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    delimiterOffset = okhttp3.internal._UtilCommonKt.delimiterOffset(input, "@/\\?#", i10, indexOfLastNonAsciiWhitespace$default);
                    char charAt4 = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? input.charAt(delimiterOffset) : c8;
                    if (charAt4 == c8 || charAt4 == c10 || charAt4 == c2 || charAt4 == c || charAt4 == c9) {
                        break;
                    }
                    if (charAt4 == '@') {
                        if (!z4) {
                            int delimiterOffset2 = okhttp3.internal._UtilCommonKt.delimiterOffset(input, c7, i10, delimiterOffset);
                            i5 = delimiterOffset;
                            c3 = c2;
                            c4 = c;
                            z = z3;
                            i6 = indexOfLastNonAsciiWhitespace$default;
                            c5 = c8;
                            canonicalize2 = okhttp3.internal.url._UrlKt.canonicalize(input, (r18 & 1) != 0 ? 0 : i10, (r18 & 2) != 0 ? input.length() : delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                            if (z5) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                sb3.append(this.encodedUsername);
                                sb3.append("%40");
                                sb3.append(canonicalize2);
                                canonicalize2 = sb3.toString();
                            }
                            this.encodedUsername = canonicalize2;
                            if (delimiterOffset2 != i5) {
                                canonicalize3 = okhttp3.internal.url._UrlKt.canonicalize(input, (r18 & 1) != 0 ? 0 : delimiterOffset2 + 1, (r18 & 2) != 0 ? input.length() : i5, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                                this.encodedPassword = canonicalize3;
                                z2 = z;
                            } else {
                                z2 = z4;
                            }
                            z4 = z2;
                            z5 = z;
                        } else {
                            i5 = delimiterOffset;
                            c3 = c2;
                            c4 = c;
                            z = z3;
                            i6 = indexOfLastNonAsciiWhitespace$default;
                            c5 = c8;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            sb4.append(this.encodedPassword);
                            sb4.append("%40");
                            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(input, (r18 & 1) != 0 ? 0 : i10, (r18 & 2) != 0 ? input.length() : i5, " \"':;<=>@[]^`{}|/\\?#", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                            sb4.append(canonicalize);
                            this.encodedPassword = sb4.toString();
                        }
                        i10 = i5 + 1;
                        c8 = c5;
                        c2 = c3;
                        c = c4;
                        z3 = z;
                        indexOfLastNonAsciiWhitespace$default = i6;
                        c10 = '#';
                        c9 = '?';
                        c7 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                    }
                }
                i2 = indexOfLastNonAsciiWhitespace$default;
                char c11 = c8;
                int i11 = i10;
                while (true) {
                    if (i11 < delimiterOffset) {
                        char charAt5 = input.charAt(i11);
                        if (charAt5 == ':') {
                            i3 = i11;
                            break;
                        }
                        if (charAt5 == '[') {
                            do {
                                i11++;
                                if (i11 < delimiterOffset) {
                                }
                            } while (input.charAt(i11) != ']');
                        }
                        i11++;
                    } else {
                        i3 = delimiterOffset;
                        break;
                    }
                }
                int i12 = i3 + 1;
                if (i12 < delimiterOffset) {
                    i4 = i10;
                    this.host = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(okhttp3.internal.url._UrlKt.percentDecode$default(input, i10, i3, false, 4, null));
                    int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(input, i12, delimiterOffset);
                    this.port = Camera2StreamConfigurationMap;
                    if (Camera2StreamConfigurationMap == c11) {
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Invalid URL port: \"");
                        java.lang.String substring2 = input.substring(i12, delimiterOffset);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                        sb5.append(substring2);
                        sb5.append('\"');
                        throw new java.lang.IllegalArgumentException(sb5.toString().toString());
                    }
                } else {
                    i4 = i10;
                    this.host = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(okhttp3.internal.url._UrlKt.percentDecode$default(input, i4, i3, false, 4, null));
                    okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
                    java.lang.String str2 = this.scheme;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                    this.port = companion.defaultPort(str2);
                }
                if (this.host == null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Invalid URL host: \"");
                    java.lang.String substring3 = input.substring(i4, i3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
                    sb6.append(substring3);
                    sb6.append('\"');
                    throw new java.lang.IllegalArgumentException(sb6.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i2 = indexOfLastNonAsciiWhitespace$default;
            }
            int i13 = i2;
            int delimiterOffset3 = okhttp3.internal._UtilCommonKt.delimiterOffset(input, "?#", indexOfFirstNonAsciiWhitespace$default, i13);
            getHighSpeedVideoFpsRangesFor(input, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 >= i13 || input.charAt(delimiterOffset3) != '?') {
                c6 = '#';
            } else {
                c6 = '#';
                int delimiterOffset4 = okhttp3.internal._UtilCommonKt.delimiterOffset(input, '#', delimiterOffset3, i13);
                canonicalize5 = okhttp3.internal.url._UrlKt.canonicalize(input, (r18 & 1) != 0 ? 0 : delimiterOffset3 + 1, (r18 & 2) != 0 ? input.length() : delimiterOffset4, okhttp3.internal.url._UrlKt.QUERY_ENCODE_SET, (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : true, (r18 & 64) != 0 ? false : false);
                this.encodedQueryNamesAndValues = getHighResolutionOutputSizeshNQ4ISI(canonicalize5);
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i13 && input.charAt(delimiterOffset3) == c6) {
                canonicalize4 = okhttp3.internal.url._UrlKt.canonicalize(input, (r18 & 1) != 0 ? 0 : delimiterOffset3 + 1, (r18 & 2) != 0 ? input.length() : i13, "", (r18 & 8) != 0 ? false : true, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : true);
                this.encodedFragment = canonicalize4;
            }
            return this;
        }

        private final void getHighSpeedVideoFpsRangesFor(java.lang.String p0, int p1, int p2) {
            if (p1 != p2) {
                char charAt = p0.charAt(p1);
                if (charAt == '/' || charAt == '\\') {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    p1++;
                } else {
                    java.util.List<java.lang.String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, "");
                }
                while (true) {
                    int i = p1;
                    while (i < p2) {
                        p1 = okhttp3.internal._UtilCommonKt.delimiterOffset(p0, "/\\", i, p2);
                        boolean z = p1 < p2;
                        getHighSpeedVideoFpsRangesFor(p0, i, p1, z, true);
                        if (z) {
                            i = p1 + 1;
                        }
                    }
                    return;
                }
            }
        }

        private final void getHighSpeedVideoFpsRangesFor(java.lang.String p0, int p1, int p2, boolean p3, boolean p4) {
            java.lang.String canonicalize;
            canonicalize = okhttp3.internal.url._UrlKt.canonicalize(p0, (r18 & 1) != 0 ? 0 : p1, (r18 & 2) != 0 ? p0.length() : p2, okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET, (r18 & 8) != 0 ? false : p4, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
            if (kotlin.jvm.internal.Intrinsics.areEqual(canonicalize, ".") || kotlin.text.StringsKt.equals(canonicalize, "%2e", true)) {
                return;
            }
            if (getHighSpeedVideoSizes(canonicalize)) {
                Camera2StreamConfigurationMap();
                return;
            }
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                java.util.List<java.lang.String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize);
            } else {
                this.encodedPathSegments.add(canonicalize);
            }
            if (p3) {
                this.encodedPathSegments.add("");
            }
        }

        private final void Camera2StreamConfigurationMap() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r0.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private static boolean getHighSpeedVideoSizes(java.lang.String p0) {
            return kotlin.jvm.internal.Intrinsics.areEqual(p0, "..") || kotlin.text.StringsKt.equals(p0, "%2e.", true) || kotlin.text.StringsKt.equals(p0, ".%2e", true) || kotlin.text.StringsKt.equals(p0, "%2e%2e", true);
        }

        private static java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            while (i <= str.length()) {
                java.lang.String str2 = str;
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, kotlin.text.Typography.amp, i, false, 4, (java.lang.Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = str.length();
                }
                int i2 = indexOf$default;
                int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, '=', i, false, 4, (java.lang.Object) null);
                if (indexOf$default2 == -1 || indexOf$default2 > i2) {
                    java.lang.String substring = str.substring(i, i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    java.lang.String substring2 = str.substring(i, indexOf$default2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                    arrayList.add(substring2);
                    java.lang.String substring3 = str.substring(indexOf$default2 + 1, i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        private static int Camera2StreamConfigurationMap(java.lang.String p0, int p1, int p2) {
            java.lang.String canonicalize;
            try {
                canonicalize = okhttp3.internal.url._UrlKt.canonicalize(p0, (r18 & 1) != 0 ? 0 : p1, (r18 & 2) != 0 ? p0.length() : p2, "", (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
                int parseInt = java.lang.Integer.parseInt(canonicalize);
                if (parseInt <= 0 || parseInt >= 65536) {
                    return -1;
                }
                return parseInt;
            } catch (java.lang.NumberFormatException unused) {
                return -1;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\rH\u0007¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u000fH\u0007¢\u0006\u0004\b\n\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0010"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "", "scheme", "", "defaultPort", "(Ljava/lang/String;)I", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "parse", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final int defaultPort(java.lang.String scheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return new okhttp3.HttpUrl.Builder().parse$okhttp(null, str).build();
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl parse(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            try {
                return get(str);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.net.URL url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            java.lang.String obj = url.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return parse(obj);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.net.URI uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            java.lang.String obj = uri.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return parse(obj);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m24346deprecated_get(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return get(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.HttpUrl m24349deprecated_parse(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return parse(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m24348deprecated_get(java.net.URL url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return get(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m24347deprecated_get(java.net.URI uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            return get(uri);
        }

        public static final /* synthetic */ void access$toQueryString(okhttp3.HttpUrl.Companion companion, java.util.List list, java.lang.StringBuilder sb) {
            kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, list.size()), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
                return;
            }
            while (true) {
                java.lang.String str = (java.lang.String) list.get(first);
                java.lang.String str2 = (java.lang.String) list.get(first + 1);
                if (first > 0) {
                    sb.append(kotlin.text.Typography.amp);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step2;
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl parse(java.lang.String str) {
        return INSTANCE.parse(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.net.URL url) {
        return INSTANCE.get(url);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.net.URI uri) {
        return INSTANCE.get(uri);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.lang.String str) {
        return INSTANCE.get(str);
    }

    @kotlin.jvm.JvmStatic
    public static final int defaultPort(java.lang.String str) {
        return INSTANCE.defaultPort(str);
    }

    public /* synthetic */ HttpUrl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.util.List list, java.util.List list2, java.lang.String str5, java.lang.String str6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, list, list2, str5, str6);
    }
}
