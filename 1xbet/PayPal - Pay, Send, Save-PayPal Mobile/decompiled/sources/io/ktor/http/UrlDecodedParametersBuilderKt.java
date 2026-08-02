package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/util/StringValuesBuilder;", "parameters", "Lio/ktor/http/Parameters;", "decodeParameters", "(Lio/ktor/util/StringValuesBuilder;)Lio/ktor/http/Parameters;", "Lio/ktor/util/StringValues;", "Lio/ktor/http/ParametersBuilder;", "encodeParameters", "(Lio/ktor/util/StringValues;)Lio/ktor/http/ParametersBuilder;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lio/ktor/util/StringValuesBuilder;Lio/ktor/util/StringValues;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UrlDecodedParametersBuilderKt {
    public static final io.ktor.http.Parameters decodeParameters(io.ktor.util.StringValuesBuilder stringValuesBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValuesBuilder, "");
        io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        io.ktor.http.ParametersBuilder parametersBuilder = ParametersBuilder$default;
        for (java.lang.String str : stringValuesBuilder.names()) {
            java.util.List<java.lang.String> all = stringValuesBuilder.getAll(str);
            if (all == null) {
                all = kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.String decodeURLQueryComponent$default = io.ktor.http.CodecsKt.decodeURLQueryComponent$default(str, 0, 0, false, null, 15, null);
            java.util.List<java.lang.String> list = all;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(io.ktor.http.CodecsKt.decodeURLQueryComponent$default((java.lang.String) it.next(), 0, 0, true, null, 11, null));
            }
            parametersBuilder.appendAll(decodeURLQueryComponent$default, arrayList);
        }
        return ParametersBuilder$default.build();
    }

    public static final io.ktor.http.ParametersBuilder encodeParameters(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringValues, "");
        io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        getHighSpeedVideoFpsRanges(ParametersBuilder$default, stringValues);
        return ParametersBuilder$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(io.ktor.util.StringValuesBuilder stringValuesBuilder, io.ktor.util.StringValues stringValues) {
        for (java.lang.String str : stringValues.names()) {
            java.util.List<java.lang.String> all = stringValues.getAll(str);
            if (all == null) {
                all = kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.String encodeURLParameter$default = io.ktor.http.CodecsKt.encodeURLParameter$default(str, false, 1, null);
            java.util.List<java.lang.String> list = all;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(io.ktor.http.CodecsKt.encodeURLParameterValue((java.lang.String) it.next()));
            }
            stringValuesBuilder.appendAll(encodeURLParameter$default, arrayList);
        }
    }
}
