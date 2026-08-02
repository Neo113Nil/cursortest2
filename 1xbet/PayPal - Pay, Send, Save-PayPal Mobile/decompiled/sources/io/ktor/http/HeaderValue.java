package io.ktor.http;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lio/ktor/http/HeaderValue;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "Lio/ktor/http/HeaderValueParam;", "params", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/ktor/http/HeaderValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/util/List;", "getParams", "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "D", "getQuality", "()D"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class HeaderValue {
    private final java.util.List<io.ktor.http.HeaderValueParam> params;
    private final double quality;
    private final java.lang.String value;

    public HeaderValue(java.lang.String str, java.util.List<io.ktor.http.HeaderValueParam> list) {
        java.lang.Double d;
        java.lang.Object obj;
        java.lang.String value;
        java.lang.Double doubleOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.value = str;
        this.params = list;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.http.HeaderValueParam) obj).getName(), "q")) {
                    break;
                }
            }
        }
        io.ktor.http.HeaderValueParam headerValueParam = (io.ktor.http.HeaderValueParam) obj;
        double d2 = 1.0d;
        if (headerValueParam != null && (value = headerValueParam.getValue()) != null && (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value)) != null) {
            double doubleValue = doubleOrNull.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d = doubleOrNull;
            }
            if (d != null) {
                d2 = d.doubleValue();
            }
        }
        this.quality = d2;
    }

    public /* synthetic */ HeaderValue(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<io.ktor.http.HeaderValueParam> getParams() {
        return this.params;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HeaderValue(value=");
        sb.append(this.value);
        sb.append(", params=");
        sb.append(this.params);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.value.hashCode() * 31) + this.params.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.HeaderValue)) {
            return false;
        }
        io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.value, headerValue.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.params, headerValue.params);
    }

    public final io.ktor.http.HeaderValue copy(java.lang.String value, java.util.List<io.ktor.http.HeaderValueParam> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        return new io.ktor.http.HeaderValue(value, params);
    }

    public final java.util.List<io.ktor.http.HeaderValueParam> component2() {
        return this.params;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.ktor.http.HeaderValue copy$default(io.ktor.http.HeaderValue headerValue, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = headerValue.value;
        }
        if ((i & 2) != 0) {
            list = headerValue.params;
        }
        return headerValue.copy(str, list);
    }
}
