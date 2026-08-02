package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014"}, d2 = {"Lio/ktor/http/HeaderValueParam;", "", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "escapeValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/ktor/http/HeaderValueParam;", "toString", "Ljava/lang/String;", "getName", "getValue", "Z", "getEscapeValue"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class HeaderValueParam {
    private final boolean escapeValue;
    private final java.lang.String name;
    private final java.lang.String value;

    public HeaderValueParam(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.value = str2;
        this.escapeValue = z;
    }

    public final boolean getEscapeValue() {
        return this.escapeValue;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderValueParam(java.lang.String str, java.lang.String str2) {
        this(str, str2, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof io.ktor.http.HeaderValueParam)) {
            return false;
        }
        io.ktor.http.HeaderValueParam headerValueParam = (io.ktor.http.HeaderValueParam) other;
        return kotlin.text.StringsKt.equals(headerValueParam.name, this.name, true) && kotlin.text.StringsKt.equals(headerValueParam.value, this.value, true);
    }

    public final int hashCode() {
        java.lang.String lowerCase = this.name.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int hashCode = lowerCase.hashCode();
        java.lang.String lowerCase2 = this.value.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HeaderValueParam(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", escapeValue=");
        sb.append(this.escapeValue);
        sb.append(')');
        return sb.toString();
    }

    public final io.ktor.http.HeaderValueParam copy(java.lang.String name2, java.lang.String value, boolean escapeValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new io.ktor.http.HeaderValueParam(name2, value, escapeValue);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEscapeValue() {
        return this.escapeValue;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ io.ktor.http.HeaderValueParam copy$default(io.ktor.http.HeaderValueParam headerValueParam, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = headerValueParam.name;
        }
        if ((i & 2) != 0) {
            str2 = headerValueParam.value;
        }
        if ((i & 4) != 0) {
            z = headerValueParam.escapeValue;
        }
        return headerValueParam.copy(str, str2, z);
    }
}
