package io.ktor.websocket;

/* compiled from: WebSocketExtensionHeader.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionHeader;", "", "", "name", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "parseParameters", "()Lkotlin/sequences/Sequence;", "toString", "()Ljava/lang/String;", "parametersToString", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebSocketExtensionHeader {
    private final java.lang.String name;
    private final java.util.List<java.lang.String> parameters;

    public WebSocketExtensionHeader(java.lang.String name, java.util.List<java.lang.String> parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.name = name;
        this.parameters = parameters;
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
                kotlin.Pair parseParameters$lambda$0;
                parseParameters$lambda$0 = io.ktor.websocket.WebSocketExtensionHeader.parseParameters$lambda$0((java.lang.String) obj);
                return parseParameters$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair parseParameters$lambda$0(java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) it, com.ironsource.B5.U, 0, false, 6, (java.lang.Object) null);
        java.lang.String str = "";
        if (indexOf$default < 0) {
            return kotlin.TuplesKt.to(it, "");
        }
        java.lang.String substring = kotlin.text.StringsKt.substring(it, kotlin.ranges.RangesKt.until(0, indexOf$default));
        int i = indexOf$default + 1;
        if (i < it.length()) {
            str = it.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        return kotlin.TuplesKt.to(substring, str);
    }

    public java.lang.String toString() {
        return this.name + ' ' + parametersToString();
    }

    private final java.lang.String parametersToString() {
        if (this.parameters.isEmpty()) {
            return "";
        }
        return "; " + kotlin.collections.CollectionsKt.joinToString$default(this.parameters, ";", null, null, 0, null, null, 62, null);
    }
}
