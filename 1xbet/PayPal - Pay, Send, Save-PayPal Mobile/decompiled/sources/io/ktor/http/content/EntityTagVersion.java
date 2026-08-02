package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u000e\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u000e\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001dR\u0014\u0010,\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010'"}, d2 = {"Lio/ktor/http/content/EntityTagVersion;", "Lio/ktor/http/content/Version;", "", "etag", "", "weak", "<init>", "(Ljava/lang/String;Z)V", "Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/VersionCheckResult;", "check", "(Lio/ktor/http/Headers;)Lio/ktor/http/content/VersionCheckResult;", "other", "match", "(Lio/ktor/http/content/EntityTagVersion;)Z", "", "givenNoneMatchEtags", "noneMatch", "(Ljava/util/List;)Lio/ktor/http/content/VersionCheckResult;", "givenMatchEtags", "Lio/ktor/http/HeadersBuilder;", "builder", "", "appendHeadersTo", "(Lio/ktor/http/HeadersBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lio/ktor/http/content/EntityTagVersion;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEtag", "Z", "getWeak", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EntityTagVersion implements io.ktor.http.content.Version {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.content.EntityTagVersion.Companion INSTANCE = new io.ktor.http.content.EntityTagVersion.Companion(null);
    private static final io.ktor.http.content.EntityTagVersion STAR = new io.ktor.http.content.EntityTagVersion("*", false);
    private final java.lang.String etag;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final boolean weak;

    public EntityTagVersion(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.etag = str;
        this.weak = z;
        this.getHighSpeedVideoSizes = (kotlin.jvm.internal.Intrinsics.areEqual(str, "*") || kotlin.text.StringsKt.startsWith$default(str, "\"", false, 2, (java.lang.Object) null)) ? str : io.ktor.http.HeaderValueWithParametersKt.quote(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = this.etag.charAt(i);
            if ((kotlin.jvm.internal.Intrinsics.compare((int) charAt, 32) <= 0 || charAt == '\"') && i != 0 && i != kotlin.text.StringsKt.getLastIndex(this.etag)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Character '");
                sb.append(charAt);
                sb.append("' is not allowed in entity-tag.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public final java.lang.String getEtag() {
        return this.etag;
    }

    public final boolean getWeak() {
        return this.weak;
    }

    @Override // io.ktor.http.content.Version
    public final io.ktor.http.content.VersionCheckResult check(io.ktor.http.Headers requestHeaders) {
        java.util.List<io.ktor.http.content.EntityTagVersion> parse;
        io.ktor.http.content.VersionCheckResult match;
        java.util.List<io.ktor.http.content.EntityTagVersion> parse2;
        io.ktor.http.content.VersionCheckResult noneMatch;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeaders, "");
        java.lang.String str = requestHeaders.get(io.ktor.http.HttpHeaders.INSTANCE.getIfNoneMatch());
        if (str != null && (parse2 = INSTANCE.parse(str)) != null && (noneMatch = noneMatch(parse2)) != io.ktor.http.content.VersionCheckResult.OK) {
            return noneMatch;
        }
        java.lang.String str2 = requestHeaders.get(io.ktor.http.HttpHeaders.INSTANCE.getIfMatch());
        return (str2 == null || (parse = INSTANCE.parse(str2)) == null || (match = match(parse)) == io.ktor.http.content.VersionCheckResult.OK) ? io.ktor.http.content.VersionCheckResult.OK : match;
    }

    public final boolean match(io.ktor.http.content.EntityTagVersion other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        io.ktor.http.content.EntityTagVersion entityTagVersion = STAR;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, entityTagVersion) || kotlin.jvm.internal.Intrinsics.areEqual(other, entityTagVersion)) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, other.getHighSpeedVideoSizes);
    }

    public final io.ktor.http.content.VersionCheckResult noneMatch(java.util.List<io.ktor.http.content.EntityTagVersion> givenNoneMatchEtags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(givenNoneMatchEtags, "");
        if (givenNoneMatchEtags.contains(STAR)) {
            return io.ktor.http.content.VersionCheckResult.OK;
        }
        java.util.List<io.ktor.http.content.EntityTagVersion> list = givenNoneMatchEtags;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (match((io.ktor.http.content.EntityTagVersion) it.next())) {
                    return io.ktor.http.content.VersionCheckResult.NOT_MODIFIED;
                }
            }
        }
        return io.ktor.http.content.VersionCheckResult.OK;
    }

    public final io.ktor.http.content.VersionCheckResult match(java.util.List<io.ktor.http.content.EntityTagVersion> givenMatchEtags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(givenMatchEtags, "");
        if (!givenMatchEtags.isEmpty() && !givenMatchEtags.contains(STAR)) {
            java.util.Iterator<io.ktor.http.content.EntityTagVersion> it = givenMatchEtags.iterator();
            while (it.hasNext()) {
                if (match(it.next())) {
                    return io.ktor.http.content.VersionCheckResult.OK;
                }
            }
            return io.ktor.http.content.VersionCheckResult.PRECONDITION_FAILED;
        }
        return io.ktor.http.content.VersionCheckResult.OK;
    }

    @Override // io.ktor.http.content.Version
    public final void appendHeadersTo(io.ktor.http.HeadersBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        io.ktor.http.ApplicationResponsePropertiesKt.etag(builder, this.getHighSpeedVideoSizes);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/http/content/EntityTagVersion$Companion;", "", "<init>", "()V", "", "headerValue", "", "Lio/ktor/http/content/EntityTagVersion;", "parse", "(Ljava/lang/String;)Ljava/util/List;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "parseSingle", "(Ljava/lang/String;)Lio/ktor/http/content/EntityTagVersion;", "STAR", "Lio/ktor/http/content/EntityTagVersion;", "getSTAR", "()Lio/ktor/http/content/EntityTagVersion;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.http.content.EntityTagVersion getSTAR() {
            return io.ktor.http.content.EntityTagVersion.STAR;
        }

        public final java.util.List<io.ktor.http.content.EntityTagVersion> parse(java.lang.String headerValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValue, "");
            java.util.List<io.ktor.http.HeaderValue> parseHeaderValue = io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(headerValue);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parseHeaderValue, 10));
            for (io.ktor.http.HeaderValue headerValue2 : parseHeaderValue) {
                if (headerValue2.getQuality() != 1.0d) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("entity-tag quality parameter is not allowed: ");
                    sb.append(headerValue2.getQuality());
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                if (!headerValue2.getParams().isEmpty()) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("entity-tag parameters are not allowed: ");
                    sb2.append(headerValue2.getParams());
                    sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    throw new java.lang.IllegalStateException(sb2.toString().toString());
                }
                arrayList.add(io.ktor.http.content.EntityTagVersion.INSTANCE.parseSingle(headerValue2.getValue()));
            }
            return arrayList;
        }

        public final io.ktor.http.content.EntityTagVersion parseSingle(java.lang.String value) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, "*")) {
                return getSTAR();
            }
            if (kotlin.text.StringsKt.startsWith$default(value, "W/", false, 2, (java.lang.Object) null)) {
                value = kotlin.text.StringsKt.drop(value, 2);
                z = true;
            } else {
                z = false;
            }
            if (!kotlin.text.StringsKt.startsWith$default(value, "\"", false, 2, (java.lang.Object) null)) {
                value = io.ktor.http.HeaderValueWithParametersKt.quote(value);
            }
            return new io.ktor.http.content.EntityTagVersion(value, z);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EntityTagVersion(etag=");
        sb.append(this.etag);
        sb.append(", weak=");
        sb.append(this.weak);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.etag.hashCode() * 31) + java.lang.Boolean.hashCode(this.weak);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.content.EntityTagVersion)) {
            return false;
        }
        io.ktor.http.content.EntityTagVersion entityTagVersion = (io.ktor.http.content.EntityTagVersion) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.etag, entityTagVersion.etag) && this.weak == entityTagVersion.weak;
    }

    public final io.ktor.http.content.EntityTagVersion copy(java.lang.String etag, boolean weak) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(etag, "");
        return new io.ktor.http.content.EntityTagVersion(etag, weak);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWeak() {
        return this.weak;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEtag() {
        return this.etag;
    }

    public static /* synthetic */ io.ktor.http.content.EntityTagVersion copy$default(io.ktor.http.content.EntityTagVersion entityTagVersion, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = entityTagVersion.etag;
        }
        if ((i & 2) != 0) {
            z = entityTagVersion.weak;
        }
        return entityTagVersion.copy(str, z);
    }
}
