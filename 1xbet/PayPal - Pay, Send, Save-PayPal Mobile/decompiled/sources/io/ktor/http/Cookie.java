package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 L2\u00060\u0001j\u0002`\u0002:\u0002MLB}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b)\u0010(J\u001e\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u008a\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b3\u0010\u001dJ'\u0010:\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b>\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8GX\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bE\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bF\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010(R\u001a\u0010\u0010\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bI\u0010(R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010+"}, d2 = {"Lio/ktor/http/Cookie;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/getHighSpeedVideoFpsRangesFor;", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lio/ktor/http/CookieEncoding;", "encoding", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "", "secure", "httpOnly", "", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "writeReplace", "()Ljava/lang/Object;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/ktor/http/CookieEncoding;", "component4", "()Ljava/lang/Integer;", "component5", "()Lio/ktor/util/date/GMTDate;", "component6", "component7", "component8", "()Z", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)Lio/ktor/http/Cookie;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ktor_http", "(Lio/ktor/http/Cookie;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "getValue", "Lio/ktor/http/CookieEncoding;", "getEncoding", "Ljava/lang/Integer;", "getMaxAgeInt", "Lio/ktor/util/date/GMTDate;", "getExpires", "getDomain", "getPath", "Z", "getSecure", "getHttpOnly", "Ljava/util/Map;", "getExtensions", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class Cookie implements java.io.Serializable {
    private final java.lang.String domain;
    private final io.ktor.http.CookieEncoding encoding;
    private final io.ktor.util.date.GMTDate expires;
    private final java.util.Map<java.lang.String, java.lang.String> extensions;
    private final boolean httpOnly;
    private final java.lang.Integer maxAge;
    private final java.lang.String name;
    private final java.lang.String path;
    private final boolean secure;
    private final java.lang.String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.Cookie.Companion INSTANCE = new io.ktor.http.Cookie.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Cookie$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("io.ktor.http.CookieEncoding", io.ktor.http.CookieEncoding.values());
            return createSimpleEnumSerializer;
        }
    }), null, null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.Cookie$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return io.ktor.http.Cookie.$r8$lambda$Z0e24UV8y8B9sJsCtVQoga6_jSQ();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/http/Cookie$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Cookie;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<io.ktor.http.Cookie> serializer() {
            return io.ktor.http.Cookie$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(int i, java.lang.String str, java.lang.String str2, io.ktor.http.CookieEncoding cookieEncoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, java.util.Map map, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, io.ktor.http.Cookie$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.encoding = io.ktor.http.CookieEncoding.URI_ENCODING;
        } else {
            this.encoding = cookieEncoding;
        }
        if ((i & 8) == 0) {
            this.maxAge = null;
        } else {
            this.maxAge = num;
        }
        if ((i & 16) == 0) {
            this.expires = null;
        } else {
            this.expires = gMTDate;
        }
        if ((i & 32) == 0) {
            this.domain = null;
        } else {
            this.domain = str3;
        }
        if ((i & 64) == 0) {
            this.path = null;
        } else {
            this.path = str4;
        }
        if ((i & 128) == 0) {
            this.secure = false;
        } else {
            this.secure = z;
        }
        if ((i & 256) == 0) {
            this.httpOnly = false;
        } else {
            this.httpOnly = z2;
        }
        if ((i & 512) == 0) {
            this.extensions = kotlin.collections.MapsKt.emptyMap();
        } else {
            this.extensions = map;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$ktor_http(io.ktor.http.Cookie self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeStringElement(serialDesc, 1, self.value);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.encoding != io.ktor.http.CookieEncoding.URI_ENCODING) {
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.encoding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.maxAge != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.maxAge);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.expires != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, io.ktor.util.date.GMTDate$$serializer.INSTANCE, self.expires);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.domain != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.domain);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.path != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.path);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.secure) {
            output.encodeBooleanElement(serialDesc, 7, self.secure);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.httpOnly) {
            output.encodeBooleanElement(serialDesc, 8, self.httpOnly);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !kotlin.jvm.internal.Intrinsics.areEqual(self.extensions, kotlin.collections.MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.extensions);
        }
    }

    public Cookie(java.lang.String str, java.lang.String str2, io.ktor.http.CookieEncoding cookieEncoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieEncoding, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.name = str;
        this.value = str2;
        this.encoding = cookieEncoding;
        this.maxAge = num;
        this.expires = gMTDate;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.extensions = map;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public /* synthetic */ Cookie(java.lang.String str, java.lang.String str2, io.ktor.http.CookieEncoding cookieEncoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? io.ktor.http.CookieEncoding.URI_ENCODING : cookieEncoding, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : gMTDate, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final io.ktor.http.CookieEncoding getEncoding() {
        return this.encoding;
    }

    public final java.lang.Integer getMaxAgeInt() {
        return this.maxAge;
    }

    public final io.ktor.util.date.GMTDate getExpires() {
        return this.expires;
    }

    public final java.lang.String getDomain() {
        return this.domain;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtensions() {
        return this.extensions;
    }

    private final java.lang.Object writeReplace() {
        return io.ktor.utils.io.JvmSerializable_jvmKt.JvmSerializerReplacement(io.ktor.http.CookieJvmSerializer.INSTANCE, this);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Z0e24UV8y8B9sJsCtVQoga6_jSQ() {
        return new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cookie(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", encoding=");
        sb.append(this.encoding);
        sb.append(", maxAge=");
        sb.append(this.maxAge);
        sb.append(", expires=");
        sb.append(this.expires);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", secure=");
        sb.append(this.secure);
        sb.append(", httpOnly=");
        sb.append(this.httpOnly);
        sb.append(", extensions=");
        sb.append(this.extensions);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.value.hashCode();
        int hashCode3 = this.encoding.hashCode();
        java.lang.Integer num = this.maxAge;
        int hashCode4 = num == null ? 0 : num.hashCode();
        io.ktor.util.date.GMTDate gMTDate = this.expires;
        int hashCode5 = gMTDate == null ? 0 : gMTDate.hashCode();
        java.lang.String str = this.domain;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.path;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.secure)) * 31) + java.lang.Boolean.hashCode(this.httpOnly)) * 31) + this.extensions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.Cookie)) {
            return false;
        }
        io.ktor.http.Cookie cookie = (io.ktor.http.Cookie) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, cookie.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, cookie.value) && this.encoding == cookie.encoding && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAge, cookie.maxAge) && kotlin.jvm.internal.Intrinsics.areEqual(this.expires, cookie.expires) && kotlin.jvm.internal.Intrinsics.areEqual(this.domain, cookie.domain) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, cookie.path) && this.secure == cookie.secure && this.httpOnly == cookie.httpOnly && kotlin.jvm.internal.Intrinsics.areEqual(this.extensions, cookie.extensions);
    }

    public final io.ktor.http.Cookie copy(java.lang.String name2, java.lang.String value, io.ktor.http.CookieEncoding encoding, java.lang.Integer maxAge, io.ktor.util.date.GMTDate expires, java.lang.String domain, java.lang.String path, boolean secure, boolean httpOnly, java.util.Map<java.lang.String, java.lang.String> extensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoding, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensions, "");
        return new io.ktor.http.Cookie(name2, value, encoding, maxAge, expires, domain, path, secure, httpOnly, extensions);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    /* renamed from: component5, reason: from getter */
    public final io.ktor.util.date.GMTDate getExpires() {
        return this.expires;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getMaxAge() {
        return this.maxAge;
    }

    /* renamed from: component3, reason: from getter */
    public final io.ktor.http.CookieEncoding getEncoding() {
        return this.encoding;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component10() {
        return this.extensions;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}
