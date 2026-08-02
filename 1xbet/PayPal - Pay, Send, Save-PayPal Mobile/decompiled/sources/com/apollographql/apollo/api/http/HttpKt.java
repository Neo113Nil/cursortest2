package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/apollographql/apollo/api/http/HttpHeader;", "", "name", "get", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpKt {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r1 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String get(java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, java.lang.String str) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = list.iterator();
        boolean z = false;
        java.lang.Object obj = null;
        while (true) {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                java.lang.String lowerCase = ((com.apollographql.apollo.api.http.HttpHeader) next).getName().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, lowerCase2)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        com.apollographql.apollo.api.http.HttpHeader httpHeader = (com.apollographql.apollo.api.http.HttpHeader) obj;
        if (httpHeader == null || (value = httpHeader.getValue()) == null) {
            return null;
        }
        return kotlin.text.StringsKt.trim(value).toString();
    }
}
