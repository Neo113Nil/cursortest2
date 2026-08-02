package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0000\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n0\t¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0011\u001a\u00020\u0010*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n0\t2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0013\u001a\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0014\u001a\u001f\u0010\u0011\u001a\u00020\u0010*\u00020\u00152\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0016\u001a7\u0010\u0011\u001a\u00020\u0010*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t0\u00180\u00172\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0019"}, d2 = {"", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", "defaultEncoding", "", "limit", "Lio/ktor/http/Parameters;", "parseUrlEncodedParameters", "(Ljava/lang/String;Ljava/nio/charset/Charset;I)Lio/ktor/http/Parameters;", "", "Lkotlin/Pair;", "formUrlEncode", "(Ljava/util/List;)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "out", "", "formUrlEncodeTo", "(Ljava/util/List;Ljava/lang/Appendable;)V", "(Lio/ktor/http/Parameters;)Ljava/lang/String;", "(Lio/ktor/http/Parameters;Ljava/lang/Appendable;)V", "Lio/ktor/http/ParametersBuilder;", "(Lio/ktor/http/ParametersBuilder;Ljava/lang/Appendable;)V", "", "", "(Ljava/util/Set;Ljava/lang/Appendable;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpUrlEncodedKt {
    public static /* synthetic */ io.ktor.http.Parameters parseUrlEncodedParameters$default(java.lang.String str, java.nio.charset.Charset charset, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 1000;
        }
        return parseUrlEncodedParameters(str, charset, i);
    }

    public static final io.ktor.http.Parameters parseUrlEncodedParameters(java.lang.String str, java.nio.charset.Charset charset, int i) {
        java.lang.Object obj;
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        java.util.List<java.lang.String> split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"&"}, false, i, 2, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
        for (java.lang.String str2 : split$default) {
            arrayList.add(kotlin.TuplesKt.to(kotlin.text.StringsKt.substringBefore$default(str2, "=", (java.lang.String) null, 2, (java.lang.Object) null), kotlin.text.StringsKt.substringAfter(str2, "=", "")));
        }
        java.util.ArrayList<kotlin.Pair> arrayList2 = arrayList;
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.Pair) obj).getFirst(), "_charset_")) {
                break;
            }
        }
        kotlin.Pair pair = (kotlin.Pair) obj;
        if (pair == null || (name2 = (java.lang.String) pair.getSecond()) == null) {
            name2 = io.ktor.utils.io.charsets.CharsetJVMKt.getName(charset);
        }
        java.nio.charset.Charset forName = io.ktor.utils.io.charsets.CharsetJVMKt.forName(kotlin.text.Charsets.INSTANCE, name2);
        io.ktor.http.Parameters.Companion companion = io.ktor.http.Parameters.INSTANCE;
        io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        for (kotlin.Pair pair2 : arrayList2) {
            ParametersBuilder$default.append(io.ktor.http.CodecsKt.decodeURLQueryComponent$default((java.lang.String) pair2.component1(), 0, 0, false, forName, 7, null), io.ktor.http.CodecsKt.decodeURLQueryComponent$default((java.lang.String) pair2.component2(), 0, 0, false, forName, 7, null));
        }
        return ParametersBuilder$default.build();
    }

    public static final java.lang.String formUrlEncode(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        formUrlEncodeTo(list, sb);
        return sb.toString();
    }

    public static final void formUrlEncodeTo(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, java.lang.Appendable appendable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        kotlin.collections.CollectionsKt.joinTo(list, appendable, (r14 & 2) != 0 ? ", " : "&", (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.HttpUrlEncodedKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.http.HttpUrlEncodedKt.m23353$r8$lambda$rvfUw7uViHEgIjyNjAXAQmrKLk((kotlin.Pair) obj);
            }
        });
    }

    public static final java.lang.String formUrlEncode(io.ktor.http.Parameters parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries = parameters.entries();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
            java.util.Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(kotlin.TuplesKt.to(entry.getKey(), (java.lang.String) it2.next()));
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
        }
        return formUrlEncode(arrayList);
    }

    public static final void formUrlEncodeTo(io.ktor.http.Parameters parameters, java.lang.Appendable appendable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        formUrlEncodeTo(parameters.entries(), appendable);
    }

    public static final void formUrlEncodeTo(io.ktor.http.ParametersBuilder parametersBuilder, java.lang.Appendable appendable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parametersBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        formUrlEncodeTo(parametersBuilder.entries(), appendable);
    }

    public static final void formUrlEncodeTo(java.util.Set<? extends java.util.Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>>> set, java.lang.Appendable appendable) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (list.isEmpty()) {
                arrayList = kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(str, null));
            } else {
                java.util.List list2 = list;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(kotlin.TuplesKt.to(str, (java.lang.String) it2.next()));
                }
                arrayList = arrayList3;
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, arrayList);
        }
        formUrlEncodeTo(arrayList2, appendable);
    }

    /* renamed from: $r8$lambda$rvfUw7uViHEgIjyN-jAXAQmrKLk, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m23353$r8$lambda$rvfUw7uViHEgIjyNjAXAQmrKLk(kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String encodeURLParameter = io.ktor.http.CodecsKt.encodeURLParameter((java.lang.String) pair.getFirst(), true);
        if (pair.getSecond() == null) {
            return encodeURLParameter;
        }
        java.lang.String encodeURLParameterValue = io.ktor.http.CodecsKt.encodeURLParameterValue(java.lang.String.valueOf(pair.getSecond()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(encodeURLParameter);
        sb.append('=');
        sb.append(encodeURLParameterValue);
        return sb.toString();
    }
}
