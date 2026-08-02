package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/apollographql/apollo/api/http/HttpHeader;", "", "name", "valueOf", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpHeaders {
    public static final java.lang.String valueOf(java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.equals(((com.apollographql.apollo.api.http.HttpHeader) obj).getName(), str, true)) {
                break;
            }
        }
        com.apollographql.apollo.api.http.HttpHeader httpHeader = (com.apollographql.apollo.api.http.HttpHeader) obj;
        if (httpHeader != null) {
            return httpHeader.getValue();
        }
        return null;
    }
}
