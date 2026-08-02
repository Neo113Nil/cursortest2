package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionHeader;", "", "", "name", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "parseParameters", "()Lkotlin/sequences/Sequence;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getParameters", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketExtensionHeader {
    private final java.lang.String name;
    private final java.util.List<java.lang.String> parameters;

    public WebSocketExtensionHeader(java.lang.String str, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.parameters = list;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.List<java.lang.String> getParameters() {
        return this.parameters;
    }

    public final kotlin.sequences.Sequence<kotlin.Pair<java.lang.String, java.lang.String>> parseParameters() {
        return kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(this.parameters), new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketExtensionHeader$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.websocket.WebSocketExtensionHeader.$r8$lambda$QO0UP6nwxVSVV5pH8HZ4esraVTQ((java.lang.String) obj);
            }
        });
    }

    public final java.lang.String toString() {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.name);
        sb.append(' ');
        if (this.parameters.isEmpty()) {
            obj = "";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("; ");
            sb2.append(kotlin.collections.CollectionsKt.joinToString$default(this.parameters, ";", null, null, 0, null, null, 62, null));
            obj = sb2.toString();
        }
        sb.append(obj);
        return sb.toString();
    }

    public static /* synthetic */ kotlin.Pair $r8$lambda$QO0UP6nwxVSVV5pH8HZ4esraVTQ(java.lang.String str) {
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '=', 0, false, 6, (java.lang.Object) null);
        if (indexOf$default < 0) {
            return kotlin.TuplesKt.to(str, "");
        }
        java.lang.String substring = kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(0, indexOf$default));
        int i = indexOf$default + 1;
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            str2 = substring2;
        }
        return kotlin.TuplesKt.to(substring, str2);
    }
}
