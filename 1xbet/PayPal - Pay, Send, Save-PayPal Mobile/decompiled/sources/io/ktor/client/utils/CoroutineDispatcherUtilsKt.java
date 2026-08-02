package io.ktor.client.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "threadCount", "", "dispatcherName", "Lkotlinx/coroutines/CoroutineDispatcher;", "clientDispatcher", "(Lkotlinx/coroutines/Dispatchers;ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CoroutineDispatcherUtilsKt {
    public static final kotlinx.coroutines.CoroutineDispatcher clientDispatcher(kotlinx.coroutines.Dispatchers dispatchers, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlinx.coroutines.CoroutineDispatcher.limitedParallelism$default(kotlinx.coroutines.Dispatchers.getIO(), i, null, 2, null);
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineDispatcher clientDispatcher$default(kotlinx.coroutines.Dispatchers dispatchers, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = "ktor-client-dispatcher";
        }
        return clientDispatcher(dispatchers, i, str);
    }
}
