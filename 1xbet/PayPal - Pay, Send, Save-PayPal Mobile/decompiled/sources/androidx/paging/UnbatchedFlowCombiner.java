package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003BF\u0012=\u0010\t\u001a9\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010RK\u0010\u0013\u001a9\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d"}, d2 = {"Landroidx/paging/UnbatchedFlowCombiner;", "T1", "T2", "", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "Landroidx/paging/CombineSource;", "Lkotlin/coroutines/Continuation;", "", "send", "<init>", "(Lkotlin/jvm/functions/Function4;)V", "", "index", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onNext", "(ILjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function4;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CompletableDeferred;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CompletableDeferred;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "", "[Lkotlinx/coroutines/CompletableDeferred;", "[Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UnbatchedFlowCombiner<T1, T2> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function4<T1, T2, androidx.paging.CombineSource, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit>[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public UnbatchedFlowCombiner(kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super androidx.paging.CombineSource, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        this.getHighSpeedVideoFpsRangesFor = function4;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit>[] completableDeferredArr = new kotlinx.coroutines.CompletableDeferred[2];
        for (int i = 0; i < 2; i++) {
            completableDeferredArr[i] = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }
        this.Camera2StreamConfigurationMap = completableDeferredArr;
        java.lang.Object[] objArr = new java.lang.Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            obj = androidx.paging.FlowExtKt.getHighSpeedVideoFpsRangesFor;
            objArr[i2] = obj;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x006e, code lost:
    
        if (r15.await(r0) == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:28:0x0091, B:30:0x0098, B:35:0x00a6, B:37:0x00ae, B:39:0x00b8, B:44:0x00bd, B:45:0x00c7, B:51:0x00c2, B:52:0x00c5, B:32:0x00a2), top: B:27:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:28:0x0091, B:30:0x0098, B:35:0x00a6, B:37:0x00ae, B:39:0x00b8, B:44:0x00bd, B:45:0x00c7, B:51:0x00c2, B:52:0x00c5, B:32:0x00a2), top: B:27:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:28:0x0091, B:30:0x0098, B:35:0x00a6, B:37:0x00ae, B:39:0x00b8, B:44:0x00bd, B:45:0x00c7, B:51:0x00c2, B:52:0x00c5, B:32:0x00a2), top: B:27:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onNext(int i, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.UnbatchedFlowCombiner$onNext$1 unbatchedFlowCombiner$onNext$1;
        java.lang.Object coroutine_suspended;
        int i2;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object obj2;
        kotlinx.coroutines.sync.Mutex mutex2;
        int length;
        int i3;
        boolean z;
        androidx.paging.CombineSource combineSource;
        kotlin.jvm.functions.Function4<T1, T2, androidx.paging.CombineSource, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function4;
        java.lang.Object obj3;
        java.lang.Object obj4;
        kotlinx.coroutines.sync.Mutex mutex3;
        java.lang.Object obj5;
        java.lang.Object obj6;
        if (continuation instanceof androidx.paging.UnbatchedFlowCombiner$onNext$1) {
            unbatchedFlowCombiner$onNext$1 = (androidx.paging.UnbatchedFlowCombiner$onNext$1) continuation;
            if ((unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj7 = unbatchedFlowCombiner$onNext$1.getHighSpeedVideoSizes;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj7);
                    if (this.Camera2StreamConfigurationMap[i].isCompleted()) {
                        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getHighSpeedVideoSizes;
                        unbatchedFlowCombiner$onNext$1.getHighResolutionOutputSizeshNQ4ISI = obj;
                        unbatchedFlowCombiner$onNext$1.Camera2StreamConfigurationMap = i;
                        unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor = 1;
                    } else {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.Camera2StreamConfigurationMap[i].complete(kotlin.Unit.INSTANCE));
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (kotlinx.coroutines.sync.Mutex) unbatchedFlowCombiner$onNext$1.getHighResolutionOutputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj7);
                                this.getHighSpeedVideoSizes.complete(kotlin.Unit.INSTANCE);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                mutex3.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th) {
                                mutex2 = mutex3;
                                th = th;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        i = unbatchedFlowCombiner$onNext$1.Camera2StreamConfigurationMap;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRanges;
                        obj2 = unbatchedFlowCombiner$onNext$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj7);
                        try {
                            java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                            length = objArr.length;
                            i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    z = false;
                                    break;
                                }
                                java.lang.Object obj8 = objArr[i3];
                                obj6 = androidx.paging.FlowExtKt.getHighSpeedVideoFpsRangesFor;
                                if (obj8 == obj6) {
                                    z = true;
                                    break;
                                }
                                i3++;
                            }
                            java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            objArr2[i] = obj2;
                            for (java.lang.Object obj9 : objArr2) {
                                obj5 = androidx.paging.FlowExtKt.getHighSpeedVideoFpsRangesFor;
                                if (obj9 == obj5) {
                                    mutex3 = mutex2;
                                    break;
                                }
                            }
                            if (!z) {
                                combineSource = androidx.paging.CombineSource.INITIAL;
                            } else if (i == 0) {
                                combineSource = androidx.paging.CombineSource.RECEIVER;
                            } else {
                                combineSource = androidx.paging.CombineSource.OTHER;
                            }
                            function4 = this.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object[] objArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                            obj3 = objArr3[0];
                            obj4 = objArr3[1];
                            unbatchedFlowCombiner$onNext$1.getHighResolutionOutputSizeshNQ4ISI = mutex2;
                            unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRanges = null;
                            unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor = 3;
                            if (function4.invoke(obj3, obj4, combineSource, unbatchedFlowCombiner$onNext$1) != coroutine_suspended) {
                                mutex3 = mutex2;
                                this.getHighSpeedVideoSizes.complete(kotlin.Unit.INSTANCE);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                mutex3.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    i = unbatchedFlowCombiner$onNext$1.Camera2StreamConfigurationMap;
                    obj = unbatchedFlowCombiner$onNext$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj7);
                }
                mutex = this.getHighSpeedVideoFpsRanges;
                unbatchedFlowCombiner$onNext$1.getHighResolutionOutputSizeshNQ4ISI = obj;
                unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRanges = mutex;
                unbatchedFlowCombiner$onNext$1.Camera2StreamConfigurationMap = i;
                unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor = 2;
                if (mutex.lock(null, unbatchedFlowCombiner$onNext$1) != coroutine_suspended) {
                    obj2 = obj;
                    mutex2 = mutex;
                    java.lang.Object[] objArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    length = objArr4.length;
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                        }
                        i3++;
                    }
                    java.lang.Object[] objArr22 = this.getHighResolutionOutputSizeshNQ4ISI;
                    objArr22[i] = obj2;
                    while (r8 < r2) {
                    }
                    if (!z) {
                    }
                    function4 = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object[] objArr32 = this.getHighResolutionOutputSizeshNQ4ISI;
                    obj3 = objArr32[0];
                    obj4 = objArr32[1];
                    unbatchedFlowCombiner$onNext$1.getHighResolutionOutputSizeshNQ4ISI = mutex2;
                    unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRanges = null;
                    unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor = 3;
                    if (function4.invoke(obj3, obj4, combineSource, unbatchedFlowCombiner$onNext$1) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        unbatchedFlowCombiner$onNext$1 = new androidx.paging.UnbatchedFlowCombiner$onNext$1(this, continuation);
        java.lang.Object obj72 = unbatchedFlowCombiner$onNext$1.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
        }
        mutex = this.getHighSpeedVideoFpsRanges;
        unbatchedFlowCombiner$onNext$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRanges = mutex;
        unbatchedFlowCombiner$onNext$1.Camera2StreamConfigurationMap = i;
        unbatchedFlowCombiner$onNext$1.getHighSpeedVideoFpsRangesFor = 2;
        if (mutex.lock(null, unbatchedFlowCombiner$onNext$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
