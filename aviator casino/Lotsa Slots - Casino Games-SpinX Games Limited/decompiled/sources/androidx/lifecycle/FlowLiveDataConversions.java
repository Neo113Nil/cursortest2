package androidx.lifecycle;

/* compiled from: FlowLiveData.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Landroidx/lifecycle/LiveData;", "asLiveData", "timeout", "Ljava/time/Duration;", "context", "Lkotlin/coroutines/CoroutineContext;", "timeoutInMs", "", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowLiveDataConversions {
    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        return asLiveData$default(flow, (kotlin.coroutines.CoroutineContext) null, 0L, 3, (java.lang.Object) null);
    }

    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData$default(flow, context, 0L, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ androidx.lifecycle.LiveData asLiveData$default(kotlinx.coroutines.flow.Flow flow, kotlin.coroutines.CoroutineContext coroutineContext, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(flow, coroutineContext, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext context, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        androidx.room.RoomTrackingLiveData roomTrackingLiveData = (androidx.lifecycle.LiveData<T>) androidx.lifecycle.CoroutineLiveDataKt.liveData(context, j, new androidx.lifecycle.FlowLiveDataConversions$asLiveData$1(flow, null));
        if (flow instanceof kotlinx.coroutines.flow.StateFlow) {
            if (androidx.arch.core.executor.ArchTaskExecutor.getInstance().isMainThread()) {
                roomTrackingLiveData.setValue(((kotlinx.coroutines.flow.StateFlow) flow).getValue());
            } else {
                roomTrackingLiveData.postValue(((kotlinx.coroutines.flow.StateFlow) flow).getValue());
            }
        }
        return roomTrackingLiveData;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(androidx.lifecycle.LiveData<T> liveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "<this>");
        return kotlinx.coroutines.flow.FlowKt.conflate(kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.lifecycle.FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    public static /* synthetic */ androidx.lifecycle.LiveData asLiveData$default(kotlinx.coroutines.flow.Flow flow, java.time.Duration duration, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(flow, duration, coroutineContext);
    }

    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, java.time.Duration timeout, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "timeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData(flow, context, androidx.lifecycle.Api26Impl.INSTANCE.toMillis(timeout));
    }
}
