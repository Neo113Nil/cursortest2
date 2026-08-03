package io.ktor.http;

/* compiled from: Parameters.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000b\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0006\u0010\u000e\u001a'\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000f¢\u0006\u0004\b\u0006\u0010\u0011\u001aE\u0010\u0006\u001a\u00020\u000526\u0010\u0014\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00130\u0012\"\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u0013¢\u0006\u0004\b\u0006\u0010\u0015\u001a&\u0010\u001a\u001a\u00020\u00052\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"", "size", "Lio/ktor/http/ParametersBuilder;", "ParametersBuilder", "(I)Lio/ktor/http/ParametersBuilder;", "Lio/ktor/http/Parameters;", "parametersOf", "()Lio/ktor/http/Parameters;", "", "name", "value", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/Parameters;", "", "values", "(Ljava/lang/String;Ljava/util/List;)Lio/ktor/http/Parameters;", "", "map", "(Ljava/util/Map;)Lio/ktor/http/Parameters;", "", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)Lio/ktor/http/Parameters;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "builder", "parameters", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/http/Parameters;", "other", "plus", "(Lio/ktor/http/Parameters;Lio/ktor/http/Parameters;)Lio/ktor/http/Parameters;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParametersKt {
    public static final io.ktor.http.ParametersBuilder ParametersBuilder(int i) {
        return new io.ktor.http.ParametersBuilderImpl(i);
    }

    public static /* synthetic */ io.ktor.http.ParametersBuilder ParametersBuilder$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return ParametersBuilder(i);
    }

    public static final io.ktor.http.Parameters parametersOf() {
        return io.ktor.http.Parameters.INSTANCE.getEmpty();
    }

    public static final io.ktor.http.Parameters parametersOf(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new io.ktor.http.ParametersSingleImpl(name, kotlin.collections.CollectionsKt.listOf(value));
    }

    public static final io.ktor.http.Parameters parametersOf(java.lang.String name, java.util.List<java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        return new io.ktor.http.ParametersSingleImpl(name, values);
    }

    public static final io.ktor.http.Parameters parametersOf(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        return new io.ktor.http.ParametersImpl(map);
    }

    public static final io.ktor.http.Parameters parametersOf(kotlin.Pair<java.lang.String, ? extends java.util.List<java.lang.String>>... pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "pairs");
        return new io.ktor.http.ParametersImpl(kotlin.collections.MapsKt.toMap(kotlin.collections.ArraysKt.asList(pairs)));
    }

    public static final io.ktor.http.Parameters parameters(kotlin.jvm.functions.Function1<? super io.ktor.http.ParametersBuilder, kotlin.Unit> builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        io.ktor.http.Parameters.Companion companion = io.ktor.http.Parameters.INSTANCE;
        io.ktor.http.ParametersBuilder ParametersBuilder$default = ParametersBuilder$default(0, 1, null);
        builder.invoke(ParametersBuilder$default);
        return ParametersBuilder$default.build();
    }

    public static final io.ktor.http.Parameters plus(io.ktor.http.Parameters parameters, io.ktor.http.Parameters other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (parameters.getCaseInsensitiveName() == other.getCaseInsensitiveName()) {
            if (parameters.isEmpty()) {
                return other;
            }
            if (other.isEmpty()) {
                return parameters;
            }
            io.ktor.http.Parameters.Companion companion = io.ktor.http.Parameters.INSTANCE;
            io.ktor.http.ParametersBuilder ParametersBuilder$default = ParametersBuilder$default(0, 1, null);
            ParametersBuilder$default.appendAll(parameters);
            ParametersBuilder$default.appendAll(other);
            return ParametersBuilder$default.build();
        }
        throw new java.lang.IllegalArgumentException("Cannot concatenate Parameters with case-sensitive and case-insensitive names");
    }
}
