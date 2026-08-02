package androidx.room;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/room/ObservedTableVersions;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "", "tableIds", "", "increment", "(Ljava/util/Set;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObservedTableVersions {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<int[]> getHighSpeedVideoFpsRangesFor;

    public ObservedTableVersions(int i) {
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new int[i]);
    }

    public final void increment(java.util.Set<java.lang.Integer> tableIds) {
        int[] value;
        int[] iArr;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableIds, "");
        if (tableIds.isEmpty()) {
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<int[]> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        do {
            value = mutableStateFlow.getValue();
            int[] iArr2 = value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                if (tableIds.contains(java.lang.Integer.valueOf(i2))) {
                    i = iArr2[i2] + 1;
                } else {
                    i = iArr2[i2];
                }
                iArr[i2] = i;
            }
        } while (!mutableStateFlow.compareAndSet(value, iArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super int[]> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.ObservedTableVersions$collect$1 observedTableVersions$collect$1;
        int i;
        if (continuation instanceof androidx.room.ObservedTableVersions$collect$1) {
            observedTableVersions$collect$1 = (androidx.room.ObservedTableVersions$collect$1) continuation;
            if ((observedTableVersions$collect$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                observedTableVersions$collect$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = observedTableVersions$collect$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = observedTableVersions$collect$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<int[]> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
                    observedTableVersions$collect$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (mutableStateFlow.collect(flowCollector, observedTableVersions$collect$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        observedTableVersions$collect$1 = new androidx.room.ObservedTableVersions$collect$1(this, continuation);
        java.lang.Object obj2 = observedTableVersions$collect$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = observedTableVersions$collect$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }
}
