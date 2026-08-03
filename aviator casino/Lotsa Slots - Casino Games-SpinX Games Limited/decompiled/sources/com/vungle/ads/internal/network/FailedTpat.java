package com.vungle.ads.internal.network;

/* compiled from: TpatSender.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234B]\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBQ\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003JW\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001J!\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202HÇ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Lcom/vungle/ads/internal/network/FailedTpat;", "", "seen1", "", "method", "Lcom/vungle/ads/internal/network/HttpMethod;", "headers", "", "", "body", "retryAttempt", "retryCount", "tpatKey", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getMethod", "()Lcom/vungle/ads/internal/network/HttpMethod;", "getRetryAttempt", "()I", "setRetryAttempt", "(I)V", "getRetryCount", "setRetryCount", "getTpatKey", "setTpatKey", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes6.dex */
public final /* data */ class FailedTpat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.network.FailedTpat.Companion INSTANCE = new com.vungle.ads.internal.network.FailedTpat.Companion(null);
    private final java.lang.String body;
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private final com.vungle.ads.internal.network.HttpMethod method;
    private int retryAttempt;
    private int retryCount;
    private java.lang.String tpatKey;

    public static /* synthetic */ com.vungle.ads.internal.network.FailedTpat copy$default(com.vungle.ads.internal.network.FailedTpat failedTpat, com.vungle.ads.internal.network.HttpMethod httpMethod, java.util.Map map, java.lang.String str, int i, int i2, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            httpMethod = failedTpat.method;
        }
        if ((i3 & 2) != 0) {
            map = failedTpat.headers;
        }
        java.util.Map map2 = map;
        if ((i3 & 4) != 0) {
            str = failedTpat.body;
        }
        java.lang.String str3 = str;
        if ((i3 & 8) != 0) {
            i = failedTpat.retryAttempt;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = failedTpat.retryCount;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            str2 = failedTpat.tpatKey;
        }
        return failedTpat.copy(httpMethod, map2, str3, i4, i5, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final com.vungle.ads.internal.network.HttpMethod getMethod() {
        return this.method;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.headers;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getTpatKey() {
        return this.tpatKey;
    }

    public final com.vungle.ads.internal.network.FailedTpat copy(com.vungle.ads.internal.network.HttpMethod method, java.util.Map<java.lang.String, java.lang.String> headers, java.lang.String body, int retryAttempt, int retryCount, java.lang.String tpatKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        return new com.vungle.ads.internal.network.FailedTpat(method, headers, body, retryAttempt, retryCount, tpatKey);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.vungle.ads.internal.network.FailedTpat)) {
            return false;
        }
        com.vungle.ads.internal.network.FailedTpat failedTpat = (com.vungle.ads.internal.network.FailedTpat) other;
        return this.method == failedTpat.method && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, failedTpat.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, failedTpat.body) && this.retryAttempt == failedTpat.retryAttempt && this.retryCount == failedTpat.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.tpatKey, failedTpat.tpatKey);
    }

    public int hashCode() {
        int hashCode = this.method.hashCode() * 31;
        java.util.Map<java.lang.String, java.lang.String> map = this.headers;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        java.lang.String str = this.body;
        int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.retryAttempt) * 31) + this.retryCount) * 31;
        java.lang.String str2 = this.tpatKey;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FailedTpat(method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", retryAttempt=" + this.retryAttempt + ", retryCount=" + this.retryCount + ", tpatKey=" + this.tpatKey + ')';
    }

    /* compiled from: TpatSender.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/network/FailedTpat$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/network/FailedTpat;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.vungle.ads.internal.network.FailedTpat> serializer() {
            return com.vungle.ads.internal.network.FailedTpat$$serializer.INSTANCE;
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FailedTpat(int i, com.vungle.ads.internal.network.HttpMethod httpMethod, java.util.Map map, java.lang.String str, int i2, int i3, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i & 16)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 16, com.vungle.ads.internal.network.FailedTpat$$serializer.INSTANCE.getDescriptor());
        }
        this.method = (i & 1) == 0 ? com.vungle.ads.internal.network.HttpMethod.GET : httpMethod;
        if ((i & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i & 8) == 0) {
            this.retryAttempt = 0;
        } else {
            this.retryAttempt = i2;
        }
        this.retryCount = i3;
        if ((i & 32) == 0) {
            this.tpatKey = null;
        } else {
            this.tpatKey = str2;
        }
    }

    public FailedTpat(com.vungle.ads.internal.network.HttpMethod method, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, int i, int i2, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        this.method = method;
        this.headers = map;
        this.body = str;
        this.retryAttempt = i;
        this.retryCount = i2;
        this.tpatKey = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.vungle.ads.internal.network.FailedTpat self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.method != com.vungle.ads.internal.network.HttpMethod.GET) {
            output.encodeSerializableElement(serialDesc, 0, com.vungle.ads.internal.network.HttpMethod$$serializer.INSTANCE, self.method);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.headers != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), self.headers);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.body != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.body);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.retryAttempt != 0) {
            output.encodeIntElement(serialDesc, 3, self.retryAttempt);
        }
        output.encodeIntElement(serialDesc, 4, self.retryCount);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.tpatKey == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.tpatKey);
    }

    public /* synthetic */ FailedTpat(com.vungle.ads.internal.network.HttpMethod httpMethod, java.util.Map map, java.lang.String str, int i, int i2, java.lang.String str2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? com.vungle.ads.internal.network.HttpMethod.GET : httpMethod, (i3 & 2) != 0 ? null : map, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? 0 : i, i2, (i3 & 32) != 0 ? null : str2);
    }

    public final com.vungle.ads.internal.network.HttpMethod getMethod() {
        return this.method;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public final java.lang.String getBody() {
        return this.body;
    }

    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    public final void setRetryAttempt(int i) {
        this.retryAttempt = i;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public final java.lang.String getTpatKey() {
        return this.tpatKey;
    }

    public final void setTpatKey(java.lang.String str) {
        this.tpatKey = str;
    }
}
