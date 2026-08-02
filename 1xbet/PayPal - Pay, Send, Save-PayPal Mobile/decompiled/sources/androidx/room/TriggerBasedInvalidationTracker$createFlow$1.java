package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", i = {0, 1}, l = {239, 239, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
final class TriggerBasedInvalidationTracker$createFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.util.Set<? extends java.lang.String>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int[] Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        if (r12.collect(new androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2(r5, r11.getHighSpeedVideoFpsRanges, r7, r11.getHighResolutionOutputSizeshNQ4ISI, r11.Camera2StreamConfigurationMap), r11) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext((kotlin.coroutines.CoroutineContext) r12, new androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass1(r11.getHighSpeedVideoSizes, null), r11) != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.room.ObservedTableStates observedTableStates;
        androidx.room.ObservedTableStates observedTableStates2;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        androidx.room.RoomDatabase roomDatabase;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        androidx.room.ObservedTableVersions observedTableVersions;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
                observedTableStates2 = this.getHighSpeedVideoSizes.getInputFormats;
                if (observedTableStates2.onObserverAdded$room_runtime(this.Camera2StreamConfigurationMap)) {
                    roomDatabase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoSizesFor = flowCollector3;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object coroutineContext = androidx.room.util.DBUtil.getCoroutineContext(roomDatabase, false, this);
                    if (coroutineContext != coroutine_suspended) {
                        flowCollector2 = flowCollector3;
                        obj = coroutineContext;
                    }
                    return coroutine_suspended;
                }
                flowCollector = flowCollector3;
                kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                observedTableVersions = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
                this.getHighSpeedVideoSizesFor = null;
                this.getHighSpeedVideoFpsRangesFor = 3;
            } else if (i == 1) {
                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw new kotlin.KotlinNothingValueException();
                }
                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector2;
                kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                observedTableVersions = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
                this.getHighSpeedVideoSizesFor = null;
                this.getHighSpeedVideoFpsRangesFor = 3;
            }
            this.getHighSpeedVideoSizesFor = flowCollector2;
            this.getHighSpeedVideoFpsRangesFor = 2;
        } catch (java.lang.Throwable th) {
            observedTableStates = this.getHighSpeedVideoSizes.getInputFormats;
            observedTableStates.onObserverRemoved$room_runtime(this.Camera2StreamConfigurationMap);
            throw th;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (this.getHighSpeedVideoFpsRangesFor.syncTriggers$room_runtime(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = triggerBasedInvalidationTracker;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2, reason: invalid class name */
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String[] Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<java.util.Set<java.lang.String>> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<int[]> getHighSpeedVideoFpsRanges;
        final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int[] getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            if (r14.emit(r2, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
        
            if (r14.emit(r2, r0) == r1) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(int[] iArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 triggerBasedInvalidationTracker$createFlow$1$2$emit$1;
            int i;
            java.lang.Object obj;
            if (continuation instanceof androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) {
                triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = (androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) continuation;
                if ((triggerBasedInvalidationTracker$createFlow$1$2$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    triggerBasedInvalidationTracker$createFlow$1$2$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj2 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        if (this.getHighSpeedVideoFpsRanges.element == null) {
                            obj = iArr;
                            if (this.getHighSpeedVideoFpsRangesFor) {
                                kotlinx.coroutines.flow.FlowCollector<java.util.Set<java.lang.String>> flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.util.Set<java.lang.String> set = kotlin.collections.ArraysKt.toSet(this.Camera2StreamConfigurationMap);
                                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.getHighSpeedVideoFpsRangesFor = iArr;
                                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.Camera2StreamConfigurationMap = 1;
                                obj = iArr;
                            }
                        } else {
                            java.lang.String[] strArr = this.Camera2StreamConfigurationMap;
                            kotlin.jvm.internal.Ref.ObjectRef<int[]> objectRef = this.getHighSpeedVideoFpsRanges;
                            int[] iArr2 = this.getHighSpeedVideoSizes;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int length = strArr.length;
                            int i2 = 0;
                            int i3 = 0;
                            while (i2 < length) {
                                java.lang.String str = strArr[i2];
                                int[] iArr3 = objectRef.element;
                                if (iArr3 == null) {
                                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                                }
                                int i4 = iArr2[i3];
                                if (iArr3[i4] != iArr[i4]) {
                                    arrayList.add(str);
                                }
                                i2++;
                                i3++;
                            }
                            java.util.ArrayList arrayList2 = arrayList;
                            obj = iArr;
                            if (!arrayList2.isEmpty()) {
                                kotlinx.coroutines.flow.FlowCollector<java.util.Set<java.lang.String>> flowCollector2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.util.Set<java.lang.String> set2 = kotlin.collections.CollectionsKt.toSet(arrayList2);
                                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.getHighSpeedVideoFpsRangesFor = iArr;
                                triggerBasedInvalidationTracker$createFlow$1$2$emit$1.Camera2StreamConfigurationMap = 2;
                                obj = iArr;
                            }
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj3 = (T) ((int[]) triggerBasedInvalidationTracker$createFlow$1$2$emit$1.getHighSpeedVideoFpsRangesFor);
                        kotlin.ResultKt.throwOnFailure(obj2);
                        obj = obj3;
                    }
                    this.getHighSpeedVideoFpsRanges.element = (T) obj;
                    return kotlin.Unit.INSTANCE;
                }
            }
            triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(this, continuation);
            java.lang.Object obj22 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.Camera2StreamConfigurationMap;
            if (i != 0) {
            }
            this.getHighSpeedVideoFpsRanges.element = (T) obj;
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.internal.Ref.ObjectRef<int[]> objectRef, boolean z, kotlinx.coroutines.flow.FlowCollector<? super java.util.Set<java.lang.String>> flowCollector, java.lang.String[] strArr, int[] iArr) {
            this.getHighSpeedVideoFpsRanges = objectRef;
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
            this.Camera2StreamConfigurationMap = strArr;
            this.getHighSpeedVideoSizes = iArr;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.Set<? extends java.lang.String>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.TriggerBasedInvalidationTracker$createFlow$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.TriggerBasedInvalidationTracker$createFlow$1 triggerBasedInvalidationTracker$createFlow$1 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        triggerBasedInvalidationTracker$createFlow$1.getHighSpeedVideoSizesFor = obj;
        return triggerBasedInvalidationTracker$createFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$createFlow$1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, int[] iArr, boolean z, java.lang.String[] strArr, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$createFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = triggerBasedInvalidationTracker;
        this.Camera2StreamConfigurationMap = iArr;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = strArr;
    }
}
