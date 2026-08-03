package io.ktor.websocket;

/* compiled from: WebSocketExtensionHeader.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "value", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "parseWebSocketExtensions", "(Ljava/lang/String;)Ljava/util/List;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebSocketExtensionHeaderKt {
    public static final java.util.List<io.ktor.websocket.WebSocketExtensionHeader> parseWebSocketExtensions(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) value, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
        java.util.Iterator it = split$default.iterator();
        while (it.hasNext()) {
            java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{";"}, false, 0, 6, (java.lang.Object) null);
            java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) kotlin.collections.CollectionsKt.first(split$default2)).toString();
            java.util.List drop = kotlin.collections.CollectionsKt.drop(split$default2, 1);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(drop, 10));
            java.util.Iterator it2 = drop.iterator();
            while (it2.hasNext()) {
                arrayList2.add(kotlin.text.StringsKt.trim((java.lang.CharSequence) it2.next()).toString());
            }
            arrayList.add(new io.ktor.websocket.WebSocketExtensionHeader(obj, arrayList2));
        }
        return arrayList;
    }
}
