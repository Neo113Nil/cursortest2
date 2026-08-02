package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\n\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"4\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0004\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Function1;", "", "", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "apolloExceptionHandler", "getApolloExceptionHandler", "()Lkotlin/jvm/functions/Function1;", "setApolloExceptionHandler", "(Lkotlin/jvm/functions/Function1;)V", "getApolloExceptionHandler$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloExceptionHandlerKt {
    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> Camera2StreamConfigurationMap;
    private static kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> apolloExceptionHandler;

    public static /* synthetic */ void getApolloExceptionHandler$annotations() {
    }

    static {
        kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.exception.ApolloExceptionHandlerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.exception.ApolloExceptionHandlerKt.m9976$r8$lambda$sscGhSiNriZTUQ8UpPSwe6v48((java.lang.Throwable) obj);
            }
        };
        Camera2StreamConfigurationMap = function1;
        apolloExceptionHandler = function1;
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getApolloExceptionHandler() {
        return apolloExceptionHandler;
    }

    public static final void setApolloExceptionHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        apolloExceptionHandler = function1;
    }

    /* renamed from: $r8$lambda$sscG-hSiNriZTU-Q8UpPSwe6v48, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9976$r8$lambda$sscGhSiNriZTUQ8UpPSwe6v48(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.lang.System.out.println((java.lang.Object) "Apollo: unhandled exception");
        th.printStackTrace();
        return kotlin.Unit.INSTANCE;
    }
}
