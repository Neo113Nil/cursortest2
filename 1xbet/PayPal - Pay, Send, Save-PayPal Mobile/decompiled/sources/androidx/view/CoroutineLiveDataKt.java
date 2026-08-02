package androidx.view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\\\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001aZ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u00072-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0012\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*`\b\u0000\u0010\u0019\u001a\u0004\b\u0000\u0010\u0000\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u00102)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010"}, d2 = {"T", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/EmittedSource;", "addDisposableSource", "(Landroidx/lifecycle/MediatorLiveData;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "liveData", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "Ljava/time/Duration;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "(Ljava/time/Duration;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "DEFAULT_TIMEOUT", "J", "Block"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    public static final <T> java.lang.Object addDisposableSource(androidx.view.MediatorLiveData<T> mediatorLiveData, androidx.view.LiveData<T> liveData, kotlin.coroutines.Continuation<? super androidx.view.EmittedSource> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new androidx.view.CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, null), continuation);
    }

    public static /* synthetic */ androidx.view.LiveData liveData$default(kotlin.coroutines.CoroutineContext coroutineContext, long j, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return liveData(coroutineContext, j, function2);
    }

    public static final <T> androidx.view.LiveData<T> liveData(kotlin.coroutines.CoroutineContext coroutineContext, long j, kotlin.jvm.functions.Function2<? super androidx.view.LiveDataScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return new androidx.view.CoroutineLiveData(coroutineContext, j, function2);
    }

    public static /* synthetic */ androidx.view.LiveData liveData$default(java.time.Duration duration, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return liveData(duration, coroutineContext, function2);
    }

    public static final <T> androidx.view.LiveData<T> liveData(java.time.Duration duration, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super androidx.view.LiveDataScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return new androidx.view.CoroutineLiveData(coroutineContext, androidx.view.C0274Api26Impl.INSTANCE.toMillis(duration), function2);
    }

    public static final <T> androidx.view.LiveData<T> liveData(kotlin.jvm.functions.Function2<? super androidx.view.LiveDataScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return liveData$default((kotlin.coroutines.CoroutineContext) null, 0L, function2, 3, (java.lang.Object) null);
    }

    public static final <T> androidx.view.LiveData<T> liveData(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super androidx.view.LiveDataScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return liveData$default(coroutineContext, 0L, function2, 2, (java.lang.Object) null);
    }

    public static final <T> androidx.view.LiveData<T> liveData(java.time.Duration duration, kotlin.jvm.functions.Function2<? super androidx.view.LiveDataScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return liveData$default(duration, (kotlin.coroutines.CoroutineContext) null, function2, 2, (java.lang.Object) null);
    }
}
