package okhttp3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 ;2\u00020\u0001:\u0002<;B[\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0007¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\u0002H\u0007¢\u0006\u0004\b$\u0010\u001cJ\u000f\u0010%\u001a\u00020\u0002H\u0007¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\tH\u0007¢\u0006\u0004\b&\u0010 J\u000f\u0010'\u001a\u00020\tH\u0007¢\u0006\u0004\b'\u0010 J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\tH\u0000¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-R\u0017\u0010.\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u0010\u001cR\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b0\u0010\u001cR\u001a\u00101\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\"R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b3\u0010\u001cR\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b4\u0010\u001cR\u001a\u00105\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u0010 R\u001a\u00107\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b7\u0010 R\u001a\u00108\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b8\u0010 R\u001a\u00109\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b9\u0010 R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b:\u0010\u001c"}, d2 = {"Lokhttp3/Cookie;", "", "", "p0", "p1", "", "p2", "p3", "p4", "", "p5", "p6", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "Lokhttp3/HttpUrl;", "url", "matches", "(Lokhttp3/HttpUrl;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "-deprecated_name", "-deprecated_value", "-deprecated_persistent", "()Z", "-deprecated_expiresAt", "()J", "-deprecated_hostOnly", "-deprecated_domain", "-deprecated_path", "-deprecated_httpOnly", "-deprecated_secure", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "Lokhttp3/Cookie$Builder;", "newBuilder", "()Lokhttp3/Cookie$Builder;", "name", "Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "expiresAt", "J", "domain", "path", "secure", "Z", "httpOnly", "persistent", "hostOnly", "sameSite", "Companion", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cookie {
    private final java.lang.String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final java.lang.String name;
    private final java.lang.String path;
    private final boolean persistent;
    private final java.lang.String sameSite;
    private final boolean secure;
    private final java.lang.String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Cookie.Companion INSTANCE = new okhttp3.Cookie.Companion(null);
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRangesFor = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final java.util.regex.Pattern Camera2StreamConfigurationMap = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final java.util.regex.Pattern getHighResolutionOutputSizeshNQ4ISI = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    private Cookie(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
        this.sameSite = str5;
    }

    public final java.lang.String name() {
        return this.name;
    }

    public final java.lang.String value() {
        return this.value;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public final java.lang.String domain() {
        return this.domain;
    }

    public final java.lang.String path() {
        return this.path;
    }

    public final boolean secure() {
        return this.secure;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: sameSite, reason: from getter */
    public final java.lang.String getSameSite() {
        return this.sameSite;
    }

    public final boolean matches(okhttp3.HttpUrl url) {
        boolean access$domainMatch;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        if (this.hostOnly) {
            access$domainMatch = kotlin.jvm.internal.Intrinsics.areEqual(url.host(), this.domain);
        } else {
            access$domainMatch = okhttp3.Cookie.Companion.access$domainMatch(INSTANCE, url.host(), this.domain);
        }
        if (access$domainMatch && okhttp3.Cookie.Companion.access$pathMatch(INSTANCE, url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof okhttp3.Cookie)) {
            return false;
        }
        okhttp3.Cookie cookie = (okhttp3.Cookie) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(cookie.name, this.name) && kotlin.jvm.internal.Intrinsics.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && kotlin.jvm.internal.Intrinsics.areEqual(cookie.domain, this.domain) && kotlin.jvm.internal.Intrinsics.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly && kotlin.jvm.internal.Intrinsics.areEqual(cookie.sameSite, this.sameSite);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.value.hashCode();
        int hashCode3 = java.lang.Long.hashCode(this.expiresAt);
        int hashCode4 = this.domain.hashCode();
        int hashCode5 = this.path.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.secure);
        int hashCode7 = java.lang.Boolean.hashCode(this.httpOnly);
        int hashCode8 = java.lang.Boolean.hashCode(this.persistent);
        int hashCode9 = java.lang.Boolean.hashCode(this.hostOnly);
        java.lang.String str = this.sameSite;
        return ((((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return toString$okhttp(false);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "name", imports = {}))
    /* renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, imports = {}))
    /* renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "persistent", imports = {}))
    /* renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "expiresAt", imports = {}))
    /* renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostOnly", imports = {}))
    /* renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "domain", imports = {}))
    /* renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "path", imports = {}))
    /* renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "httpOnly", imports = {}))
    /* renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "secure", imports = {}))
    /* renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    public final java.lang.String toString$okhttp(boolean forObsoleteRfc2965) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(okhttp3.internal.http.DateFormattingKt.toHttpDateString(new java.util.Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (forObsoleteRfc2965) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        if (this.sameSite != null) {
            sb.append("; samesite=");
            sb.append(this.sameSite);
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final okhttp3.Cookie.Builder newBuilder() {
        return new okhttp3.Cookie.Builder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R\u0018\u0010#\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001d"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "Lokhttp3/Cookie;", "cookie", "(Lokhttp3/Cookie;)V", "", "name", "(Ljava/lang/String;)Lokhttp3/Cookie$Builder;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "expiresAt", "(J)Lokhttp3/Cookie$Builder;", "domain", "hostOnlyDomain", "p0", "", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Z)Lokhttp3/Cookie$Builder;", "path", "secure", "()Lokhttp3/Cookie$Builder;", "httpOnly", "sameSite", "build", "()Lokhttp3/Cookie;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "getOutputMinFrameDuration", "Z", "getInputFormats", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getOutputMinFrameDuration;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private boolean getInputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private java.lang.String getOutputFormats;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizesFor;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.String Camera2StreamConfigurationMap;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private boolean getInputFormats;

        public Builder() {
            this.getHighResolutionOutputSizeshNQ4ISI = okhttp3.internal.http.DateFormattingKt.MAX_DATE;
            this.getHighSpeedVideoSizes = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(okhttp3.Cookie cookie) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
            this.getHighSpeedVideoFpsRanges = cookie.name();
            this.Camera2StreamConfigurationMap = cookie.value();
            this.getHighResolutionOutputSizeshNQ4ISI = cookie.expiresAt();
            this.getHighSpeedVideoFpsRangesFor = cookie.domain();
            this.getHighSpeedVideoSizes = cookie.path();
            this.getInputFormats = cookie.secure();
            this.getOutputMinFrameDuration = cookie.httpOnly();
            this.getHighSpeedVideoSizesFor = cookie.persistent();
            this.getInputSizeshNQ4ISI = cookie.hostOnly();
            this.getOutputFormats = cookie.getSameSite();
        }

        public final okhttp3.Cookie.Builder name(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(name2).toString(), name2)) {
                throw new java.lang.IllegalArgumentException("name is not trimmed".toString());
            }
            this.getHighSpeedVideoFpsRanges = name2;
            return this;
        }

        public final okhttp3.Cookie.Builder value(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(value).toString(), value)) {
                throw new java.lang.IllegalArgumentException("value is not trimmed".toString());
            }
            this.Camera2StreamConfigurationMap = value;
            return this;
        }

        public final okhttp3.Cookie.Builder expiresAt(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > okhttp3.internal.http.DateFormattingKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = expiresAt;
            this.getHighSpeedVideoSizesFor = true;
            return this;
        }

        public final okhttp3.Cookie.Builder domain(java.lang.String domain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
            return Camera2StreamConfigurationMap(domain, false);
        }

        public final okhttp3.Cookie.Builder hostOnlyDomain(java.lang.String domain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
            return Camera2StreamConfigurationMap(domain, true);
        }

        private final okhttp3.Cookie.Builder Camera2StreamConfigurationMap(java.lang.String p0, boolean p1) {
            java.lang.String canonicalHost = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(p0);
            if (canonicalHost == null) {
                throw new java.lang.IllegalArgumentException("unexpected domain: ".concat(java.lang.String.valueOf(p0)));
            }
            this.getHighSpeedVideoFpsRangesFor = canonicalHost;
            this.getInputSizeshNQ4ISI = p1;
            return this;
        }

        public final okhttp3.Cookie.Builder path(java.lang.String path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            if (!kotlin.text.StringsKt.startsWith$default(path, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
                throw new java.lang.IllegalArgumentException("path must start with '/'".toString());
            }
            this.getHighSpeedVideoSizes = path;
            return this;
        }

        public final okhttp3.Cookie.Builder secure() {
            this.getInputFormats = true;
            return this;
        }

        public final okhttp3.Cookie.Builder httpOnly() {
            this.getOutputMinFrameDuration = true;
            return this;
        }

        public final okhttp3.Cookie.Builder sameSite(java.lang.String sameSite) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sameSite, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(sameSite).toString(), sameSite)) {
                throw new java.lang.IllegalArgumentException("sameSite is not trimmed".toString());
            }
            this.getOutputFormats = sameSite;
            return this;
        }

        public final okhttp3.Cookie build() {
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str == null) {
                throw new java.lang.NullPointerException("builder.name == null");
            }
            java.lang.String str2 = this.Camera2StreamConfigurationMap;
            if (str2 == null) {
                throw new java.lang.NullPointerException("builder.value == null");
            }
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
            if (str3 != null) {
                return new okhttp3.Cookie(str, str2, j, str3, this.getHighSpeedVideoSizes, this.getInputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getOutputFormats, null);
            }
            throw new java.lang.NullPointerException("builder.domain == null");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\b\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0019J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0006*\u00020\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010\"\u001a\u0006*\u00020\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010\b\u001a\u0006*\u00020\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0018\u0010\u0017\u001a\u0006*\u00020\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 "}, d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "", "p0", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lokhttp3/HttpUrl;", "url", "setCookie", "Lokhttp3/Cookie;", "parse", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "", "currentTimeMillis", "parse$okhttp", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;IIZ)I", "(Ljava/lang/String;)J", "Lokhttp3/Headers;", "headers", "", "parseAll", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ boolean access$domainMatch(okhttp3.Cookie.Companion companion, java.lang.String str, java.lang.String str2) {
            return getHighSpeedVideoFpsRangesFor(str, str2);
        }

        private static boolean getHighSpeedVideoFpsRangesFor(java.lang.String p0, java.lang.String p1) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(p0, p1)) {
                return true;
            }
            return kotlin.text.StringsKt.endsWith$default(p0, p1, false, 2, (java.lang.Object) null) && p0.charAt((p0.length() - p1.length()) - 1) == '.' && !okhttp3.internal._HostnamesCommonKt.canParseAsIpAddress(p0);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Cookie parse(okhttp3.HttpUrl url, java.lang.String setCookie) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setCookie, "");
            return parse$okhttp(java.lang.System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
        public final okhttp3.Cookie parse$okhttp(long currentTimeMillis, okhttp3.HttpUrl url, java.lang.String setCookie) {
            long j;
            java.lang.String str;
            int i;
            char c;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            java.lang.String str2 = setCookie;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            int delimiterOffset$default = okhttp3.internal._UtilCommonKt.delimiterOffset$default(setCookie, ';', 0, 0, 6, (java.lang.Object) null);
            int delimiterOffset$default2 = okhttp3.internal._UtilCommonKt.delimiterOffset$default(setCookie, '=', 0, delimiterOffset$default, 2, (java.lang.Object) null);
            if (delimiterOffset$default2 == delimiterOffset$default) {
                return null;
            }
            ?? r2 = 0;
            boolean z = true;
            java.lang.String trimSubstring$default = okhttp3.internal._UtilCommonKt.trimSubstring$default(str2, 0, delimiterOffset$default2, 1, null);
            if (trimSubstring$default.length() != 0) {
                char c2 = 65535;
                if (okhttp3.internal._UtilCommonKt.indexOfControlOrNonAscii(trimSubstring$default) == -1) {
                    java.lang.String trimSubstring = okhttp3.internal._UtilCommonKt.trimSubstring(str2, delimiterOffset$default2 + 1, delimiterOffset$default);
                    if (okhttp3.internal._UtilCommonKt.indexOfControlOrNonAscii(trimSubstring) != -1) {
                        return null;
                    }
                    int i12 = delimiterOffset$default + 1;
                    int length = setCookie.length();
                    java.lang.String str3 = null;
                    java.lang.String str4 = null;
                    java.lang.String str5 = null;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = true;
                    long j2 = 253402300799999L;
                    long j3 = -1;
                    while (i12 < length) {
                        int delimiterOffset = okhttp3.internal._UtilCommonKt.delimiterOffset(str2, ';', i12, length);
                        int delimiterOffset2 = okhttp3.internal._UtilCommonKt.delimiterOffset(str2, '=', i12, delimiterOffset);
                        java.lang.String trimSubstring2 = okhttp3.internal._UtilCommonKt.trimSubstring(str2, i12, delimiterOffset2);
                        java.lang.String trimSubstring3 = delimiterOffset2 < delimiterOffset ? okhttp3.internal._UtilCommonKt.trimSubstring(str2, delimiterOffset2 + 1, delimiterOffset) : "";
                        if (kotlin.text.StringsKt.equals(trimSubstring2, "expires", z)) {
                            try {
                                int length2 = trimSubstring3.length();
                                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(trimSubstring3, r2, length2, r2);
                                try {
                                    java.util.regex.Matcher matcher = okhttp3.Cookie.getHighResolutionOutputSizeshNQ4ISI.matcher(trimSubstring3);
                                    i2 = -1;
                                    int i13 = -1;
                                    int i14 = -1;
                                    int i15 = -1;
                                    i3 = -1;
                                    i4 = -1;
                                    while (highResolutionOutputSizeshNQ4ISI < length2) {
                                        i = length;
                                        try {
                                            int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(trimSubstring3, highResolutionOutputSizeshNQ4ISI + 1, length2, z);
                                            matcher.region(highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2);
                                            int i16 = i13;
                                            if (i16 != -1) {
                                                i8 = -1;
                                                i9 = i15;
                                            } else if (matcher.usePattern(okhttp3.Cookie.getHighResolutionOutputSizeshNQ4ISI).matches()) {
                                                java.lang.String group = matcher.group(1);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "");
                                                int parseInt = java.lang.Integer.parseInt(group);
                                                java.lang.String group2 = matcher.group(2);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group2, "");
                                                int parseInt2 = java.lang.Integer.parseInt(group2);
                                                java.lang.String group3 = matcher.group(3);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group3, "");
                                                i4 = java.lang.Integer.parseInt(group3);
                                                i16 = parseInt;
                                                i3 = parseInt2;
                                                i13 = i16;
                                                z = true;
                                                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(trimSubstring3, highResolutionOutputSizeshNQ4ISI2 + 1, length2, false);
                                                length = i;
                                            } else {
                                                i9 = i15;
                                                i8 = -1;
                                            }
                                            if (i9 != i8) {
                                                i10 = i8;
                                                i11 = i14;
                                            } else if (matcher.usePattern(okhttp3.Cookie.Camera2StreamConfigurationMap).matches()) {
                                                java.lang.String group4 = matcher.group(1);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group4, "");
                                                i15 = java.lang.Integer.parseInt(group4);
                                                i13 = i16;
                                                z = true;
                                                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(trimSubstring3, highResolutionOutputSizeshNQ4ISI2 + 1, length2, false);
                                                length = i;
                                            } else {
                                                i11 = i14;
                                                i10 = -1;
                                            }
                                            if (i11 == i10) {
                                                if (matcher.usePattern(okhttp3.Cookie.getHighSpeedVideoFpsRanges).matches()) {
                                                    java.lang.String group5 = matcher.group(1);
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group5, "");
                                                    java.util.Locale locale = java.util.Locale.US;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                                                    java.lang.String lowerCase = group5.toLowerCase(locale);
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                                    java.lang.String pattern = okhttp3.Cookie.getHighSpeedVideoFpsRanges.pattern();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "");
                                                    i14 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) pattern, lowerCase, 0, false, 6, (java.lang.Object) null) / 4;
                                                    i15 = i9;
                                                    i13 = i16;
                                                    z = true;
                                                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(trimSubstring3, highResolutionOutputSizeshNQ4ISI2 + 1, length2, false);
                                                    length = i;
                                                } else {
                                                    i10 = -1;
                                                }
                                            }
                                            if (i2 == i10 && matcher.usePattern(okhttp3.Cookie.getHighSpeedVideoFpsRangesFor).matches()) {
                                                java.lang.String group6 = matcher.group(1);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group6, "");
                                                i2 = java.lang.Integer.parseInt(group6);
                                            }
                                            i15 = i9;
                                            i14 = i11;
                                            i13 = i16;
                                            z = true;
                                            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(trimSubstring3, highResolutionOutputSizeshNQ4ISI2 + 1, length2, false);
                                            length = i;
                                        } catch (java.lang.IllegalArgumentException unused) {
                                            c = 65535;
                                            z = true;
                                            i12 = delimiterOffset + 1;
                                            str2 = setCookie;
                                            c2 = c;
                                            length = i;
                                            r2 = 0;
                                        }
                                    }
                                    i = length;
                                    i5 = i13;
                                    i6 = i14;
                                    i7 = i15;
                                    if (70 <= i2 && i2 < 100) {
                                        i2 += 1900;
                                    }
                                    if (i2 >= 0 && i2 < 70) {
                                        i2 += 2000;
                                    }
                                } catch (java.lang.IllegalArgumentException unused2) {
                                    i = length;
                                }
                            } catch (java.lang.IllegalArgumentException unused3) {
                                i = length;
                                c = c2;
                            }
                            if (i2 < 1601) {
                                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                            }
                            c = 65535;
                            if (i6 == -1) {
                                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                            }
                            if (i7 <= 0 || i7 >= 32) {
                                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                            }
                            if (i5 < 0 || i5 >= 24) {
                                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                            }
                            int i17 = i3;
                            if (i17 < 0 || i17 >= 60) {
                                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                            }
                            int i18 = i4;
                            if (i18 < 0 || i18 >= 60) {
                                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                            }
                            try {
                                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(okhttp3.internal._UtilJvmKt.UTC);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i2);
                                gregorianCalendar.set(2, i6 - 1);
                                gregorianCalendar.set(5, i7);
                                gregorianCalendar.set(11, i5);
                                gregorianCalendar.set(12, i17);
                                gregorianCalendar.set(13, i18);
                                gregorianCalendar.set(14, 0);
                                j2 = gregorianCalendar.getTimeInMillis();
                                z = true;
                                z4 = z;
                            } catch (java.lang.NumberFormatException | java.lang.IllegalArgumentException unused4) {
                                z = true;
                                i12 = delimiterOffset + 1;
                                str2 = setCookie;
                                c2 = c;
                                length = i;
                                r2 = 0;
                            }
                            i12 = delimiterOffset + 1;
                            str2 = setCookie;
                            c2 = c;
                            length = i;
                            r2 = 0;
                        } else {
                            i = length;
                            c = c2;
                            z = true;
                            if (kotlin.text.StringsKt.equals(trimSubstring2, io.ktor.client.utils.CacheControl.MAX_AGE, true)) {
                                j3 = getHighSpeedVideoFpsRangesFor(trimSubstring3);
                                z4 = z;
                                i12 = delimiterOffset + 1;
                                str2 = setCookie;
                                c2 = c;
                                length = i;
                                r2 = 0;
                            } else {
                                if (!kotlin.text.StringsKt.equals(trimSubstring2, "domain", true)) {
                                    z = true;
                                    if (kotlin.text.StringsKt.equals(trimSubstring2, "path", true)) {
                                        str4 = trimSubstring3;
                                    } else if (kotlin.text.StringsKt.equals(trimSubstring2, "secure", true)) {
                                        z2 = true;
                                    } else if (kotlin.text.StringsKt.equals(trimSubstring2, "httponly", true)) {
                                        z3 = true;
                                    } else if (kotlin.text.StringsKt.equals(trimSubstring2, "samesite", true)) {
                                        str5 = trimSubstring3;
                                    }
                                } else {
                                    if (kotlin.text.StringsKt.endsWith$default(trimSubstring3, ".", false, 2, (java.lang.Object) null)) {
                                        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                                    }
                                    java.lang.String canonicalHost = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(kotlin.text.StringsKt.removePrefix(trimSubstring3, (java.lang.CharSequence) "."));
                                    if (canonicalHost == null) {
                                        throw new java.lang.IllegalArgumentException();
                                    }
                                    str3 = canonicalHost;
                                    z = true;
                                    z5 = false;
                                }
                                i12 = delimiterOffset + 1;
                                str2 = setCookie;
                                c2 = c;
                                length = i;
                                r2 = 0;
                            }
                        }
                    }
                    if (j3 == Long.MIN_VALUE) {
                        j = Long.MIN_VALUE;
                    } else {
                        if (j3 != -1) {
                            j2 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                            if (j2 < currentTimeMillis || j2 > okhttp3.internal.http.DateFormattingKt.MAX_DATE) {
                                j = 253402300799999L;
                            }
                        }
                        j = j2;
                    }
                    java.lang.String host = url.host();
                    if (str3 == null) {
                        str3 = host;
                    } else if (!getHighSpeedVideoFpsRangesFor(host, str3)) {
                        return null;
                    }
                    if (host.length() != str3.length() && okhttp3.internal.publicsuffix.PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str3) == null) {
                        return null;
                    }
                    java.lang.String str6 = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
                    if (str4 == null || !kotlin.text.StringsKt.startsWith$default(str4, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
                        java.lang.String encodedPath = url.encodedPath();
                        int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) encodedPath, kotlinx.io.files.FileSystemKt.UnixPathSeparator, 0, false, 6, (java.lang.Object) null);
                        if (lastIndexOf$default != 0) {
                            str6 = encodedPath.substring(0, lastIndexOf$default);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                        }
                        str = str6;
                    } else {
                        str = str4;
                    }
                    return new okhttp3.Cookie(trimSubstring$default, trimSubstring, j, str3, str, z2, z3, z4, z5, str5, null);
                }
            }
            return null;
        }

        private static int getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, int p1, int p2, boolean p3) {
            while (p1 < p2) {
                char charAt = p0.charAt(p1);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!p3)) {
                    return p1;
                }
                p1++;
            }
            return p2;
        }

        private static long getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
            try {
                long parseLong = java.lang.Long.parseLong(p0);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (java.lang.NumberFormatException e) {
                if (new kotlin.text.Regex("-?\\d+").matches(p0)) {
                    return !kotlin.text.StringsKt.startsWith$default(p0, "-", false, 2, (java.lang.Object) null) ? Long.MAX_VALUE : Long.MIN_VALUE;
                }
                throw e;
            }
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl url, okhttp3.Headers headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            java.util.List<java.lang.String> values = headers.values("Set-Cookie");
            int size = values.size();
            java.util.List<okhttp3.Cookie> list = null;
            java.util.ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                okhttp3.Cookie parse = parse(url, values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                list = java.util.Collections.unmodifiableList(arrayList);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
            }
            return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
        }

        public static final /* synthetic */ boolean access$pathMatch(okhttp3.Cookie.Companion companion, okhttp3.HttpUrl httpUrl, java.lang.String str) {
            java.lang.String encodedPath = httpUrl.encodedPath();
            if (kotlin.jvm.internal.Intrinsics.areEqual(encodedPath, str)) {
                return true;
            }
            return kotlin.text.StringsKt.startsWith$default(encodedPath, str, false, 2, (java.lang.Object) null) && (kotlin.text.StringsKt.endsWith$default(str, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null) || encodedPath.charAt(str.length()) == '/');
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<okhttp3.Cookie> parseAll(okhttp3.HttpUrl httpUrl, okhttp3.Headers headers) {
        return INSTANCE.parseAll(httpUrl, headers);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Cookie parse(okhttp3.HttpUrl httpUrl, java.lang.String str) {
        return INSTANCE.parse(httpUrl, str);
    }

    public /* synthetic */ Cookie(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4, str5);
    }
}
