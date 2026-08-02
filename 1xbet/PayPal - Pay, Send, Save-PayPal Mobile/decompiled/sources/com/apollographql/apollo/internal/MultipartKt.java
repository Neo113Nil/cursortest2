package com.apollographql.apollo.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0007\u001a\u00020\u0006*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpResponse;", "response", "Lkotlinx/coroutines/flow/Flow;", "Lokio/BufferedSource;", "multipartBodyFlow", "(Lcom/apollographql/apollo/api/http/HttpResponse;)Lkotlinx/coroutines/flow/Flow;", "", "isMultipart", "(Lcom/apollographql/apollo/api/http/HttpResponse;)Z", "isGraphQLResponse"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultipartKt {
    public static final kotlinx.coroutines.flow.Flow<okio.BufferedSource> multipartBodyFlow(com.apollographql.apollo.api.http.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        return kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1(objectRef, httpResponse, null)), new com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2(objectRef, null));
    }

    public static final boolean isMultipart(com.apollographql.apollo.api.http.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        java.lang.String valueOf = com.apollographql.apollo.api.http.HttpHeaders.valueOf(httpResponse.getHeaders(), "Content-Type");
        return valueOf != null && kotlin.text.StringsKt.startsWith(valueOf, "multipart/", true);
    }

    public static final boolean isGraphQLResponse(com.apollographql.apollo.api.http.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        java.lang.String valueOf = com.apollographql.apollo.api.http.HttpHeaders.valueOf(httpResponse.getHeaders(), "Content-Type");
        return valueOf != null && kotlin.text.StringsKt.startsWith(valueOf, "application/graphql-response+json", true);
    }

    public static final /* synthetic */ java.lang.String access$getBoundaryParameter(java.lang.String str) {
        java.lang.Object obj;
        java.util.List split$default;
        java.lang.String str2;
        if (str != null) {
            java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{';'}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default2, 10));
            java.util.Iterator it = split$default2.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.text.StringsKt.trim((java.lang.String) it.next()).toString());
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (kotlin.text.StringsKt.startsWith$default((java.lang.String) obj, "boundary=", false, 2, (java.lang.Object) null)) {
                    break;
                }
            }
            java.lang.String str3 = (java.lang.String) obj;
            if (str3 != null && (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new char[]{'='}, false, 0, 6, (java.lang.Object) null)) != null && (str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1)) != null) {
                return kotlin.text.StringsKt.trim(str2, '\"', '\'');
            }
        }
        return null;
    }
}
