package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002"}, d2 = {"Lio/ktor/http/Parameters;", "Lio/ktor/util/StringValues;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Parameters extends io.ktor.util.StringValues {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.Parameters.Companion INSTANCE = io.ktor.http.Parameters.Companion.getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static boolean contains(io.ktor.http.Parameters parameters, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return io.ktor.util.StringValues.DefaultImpls.contains(parameters, str);
        }

        public static boolean contains(io.ktor.http.Parameters parameters, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            return io.ktor.util.StringValues.DefaultImpls.contains(parameters, str, str2);
        }

        public static void forEach(io.ktor.http.Parameters parameters, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            io.ktor.util.StringValues.DefaultImpls.forEach(parameters, function2);
        }

        public static java.lang.String get(io.ktor.http.Parameters parameters, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return io.ktor.util.StringValues.DefaultImpls.get(parameters, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lio/ktor/http/Parameters$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/http/ParametersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Lio/ktor/http/Parameters;", "build", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/http/Parameters;", "Empty", "Lio/ktor/http/Parameters;", "getEmpty", "()Lio/ktor/http/Parameters;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        static final /* synthetic */ io.ktor.http.Parameters.Companion getHighSpeedVideoFpsRanges = new io.ktor.http.Parameters.Companion();
        private static final io.ktor.http.Parameters Empty = io.ktor.http.EmptyParameters.INSTANCE;

        private Companion() {
        }

        public final io.ktor.http.Parameters getEmpty() {
            return Empty;
        }

        public final io.ktor.http.Parameters build(kotlin.jvm.functions.Function1<? super io.ktor.http.ParametersBuilder, kotlin.Unit> builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
            builder.invoke(ParametersBuilder$default);
            return ParametersBuilder$default.build();
        }
    }
}
