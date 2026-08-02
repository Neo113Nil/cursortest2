package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\r"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "asLiveData", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;J)Landroidx/lifecycle/LiveData;", "asFlow", "(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/Flow;", "Ljava/time/Duration;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "(Lkotlinx/coroutines/flow/Flow;Ljava/time/Duration;Lkotlin/coroutines/CoroutineContext;)Landroidx/lifecycle/LiveData;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlowLiveDataConversions {
    public static /* synthetic */ androidx.view.LiveData asLiveData$default(kotlinx.coroutines.flow.Flow flow, kotlin.coroutines.CoroutineContext coroutineContext, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(flow, coroutineContext, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> androidx.view.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext coroutineContext, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfo = (androidx.view.LiveData<T>) androidx.view.CoroutineLiveDataKt.liveData(coroutineContext, j, new androidx.view.FlowLiveDataConversions$asLiveData$1(flow, null));
        if (flow instanceof kotlinx.coroutines.flow.StateFlow) {
            if (androidx.arch.core.executor.ArchTaskExecutor.getInstance().isMainThread()) {
                loaderInfo.setValue(((kotlinx.coroutines.flow.StateFlow) flow).getValue());
                return loaderInfo;
            }
            loaderInfo.postValue(((kotlinx.coroutines.flow.StateFlow) flow).getValue());
        }
        return loaderInfo;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(androidx.view.LiveData<T> liveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        return kotlinx.coroutines.flow.FlowKt.conflate(kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.view.FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    public static /* synthetic */ androidx.view.LiveData asLiveData$default(kotlinx.coroutines.flow.Flow flow, java.time.Duration duration, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(flow, duration, coroutineContext);
    }

    public static final <T> androidx.view.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, java.time.Duration duration, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return asLiveData(flow, coroutineContext, androidx.view.C0274Api26Impl.INSTANCE.toMillis(duration));
    }

    public static final <T> androidx.view.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        return asLiveData$default(flow, coroutineContext, 0L, 2, (java.lang.Object) null);
    }

    public static final <T> androidx.view.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return asLiveData$default(flow, (kotlin.coroutines.CoroutineContext) null, 0L, 3, (java.lang.Object) null);
    }
}
