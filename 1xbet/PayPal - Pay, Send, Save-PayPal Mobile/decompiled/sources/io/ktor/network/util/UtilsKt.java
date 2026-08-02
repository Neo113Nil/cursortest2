package io.ktor.network.util;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aS\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "name", "", "timeoutMs", "Lkotlin/Function0;", "clock", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onTimeout", "Lio/ktor/network/util/Timeout;", "createTimeout", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lio/ktor/network/util/Timeout;", "T", "block", "withTimeout", "(Lio/ktor/network/util/Timeout;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "INFINITE_TIMEOUT_MS", "J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UtilsKt {
    public static final long INFINITE_TIMEOUT_MS = Long.MAX_VALUE;

    public static /* synthetic */ io.ktor.network.util.Timeout createTimeout$default(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, long j, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.network.util.UtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    long timeMillis;
                    timeMillis = io.ktor.util.date.DateJvmKt.getTimeMillis();
                    return java.lang.Long.valueOf(timeMillis);
                }
            };
        }
        return createTimeout(coroutineScope, str2, j, function0, function1);
    }

    public static final io.ktor.network.util.Timeout createTimeout(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, long j, kotlin.jvm.functions.Function0<java.lang.Long> function0, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new io.ktor.network.util.Timeout(str, j, function0, coroutineScope, function1);
    }

    public static final <T> T withTimeout(io.ktor.network.util.Timeout timeout, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (timeout == null) {
            return function0.invoke();
        }
        timeout.start();
        try {
            return function0.invoke();
        } finally {
            timeout.stop();
        }
    }
}
