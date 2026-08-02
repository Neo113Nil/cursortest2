package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/http/HeaderValueWithParameters;", "", "", "content", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "name", "parameter", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getContent", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HeaderValueWithParameters {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.HeaderValueWithParameters.Companion INSTANCE = new io.ktor.http.HeaderValueWithParameters.Companion(null);
    private final java.lang.String content;
    private final java.util.List<io.ktor.http.HeaderValueParam> parameters;

    public HeaderValueWithParameters(java.lang.String str, java.util.List<io.ktor.http.HeaderValueParam> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.content = str;
        this.parameters = list;
    }

    protected final java.lang.String getContent() {
        return this.content;
    }

    public /* synthetic */ HeaderValueWithParameters(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<io.ktor.http.HeaderValueParam> getParameters() {
        return this.parameters;
    }

    public final java.lang.String parameter(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.parameters);
        if (lastIndex < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            io.ktor.http.HeaderValueParam headerValueParam = this.parameters.get(i);
            if (kotlin.text.StringsKt.equals(headerValueParam.getName(), name2, true)) {
                return headerValueParam.getValue();
            }
            if (i == lastIndex) {
                return null;
            }
            i++;
        }
    }

    public java.lang.String toString() {
        boolean highSpeedVideoFpsRanges;
        if (this.parameters.isEmpty()) {
            return this.content;
        }
        int length = this.content.length();
        int i = 0;
        int i2 = 0;
        for (io.ktor.http.HeaderValueParam headerValueParam : this.parameters) {
            i2 += headerValueParam.getName().length() + headerValueParam.getValue().length() + 3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + i2);
        sb.append(this.content);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.parameters);
        if (lastIndex >= 0) {
            while (true) {
                io.ktor.http.HeaderValueParam headerValueParam2 = this.parameters.get(i);
                sb.append("; ");
                sb.append(headerValueParam2.getName());
                sb.append("=");
                java.lang.String value = headerValueParam2.getValue();
                highSpeedVideoFpsRanges = io.ktor.http.HeaderValueWithParametersKt.getHighSpeedVideoFpsRanges(value);
                if (highSpeedVideoFpsRanges) {
                    sb.append(io.ktor.http.HeaderValueWithParametersKt.quote(value));
                } else {
                    sb.append(value);
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return obj;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lio/ktor/http/HeaderValueWithParameters$Companion;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function2;", "", "Lio/ktor/http/HeaderValueParam;", "init", "parse", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <R> R parse(java.lang.String value, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<io.ktor.http.HeaderValueParam>, ? extends R> init) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(init, "");
            io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) kotlin.collections.CollectionsKt.last((java.util.List) io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(value));
            return init.invoke(headerValue.getValue(), headerValue.getParams());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
