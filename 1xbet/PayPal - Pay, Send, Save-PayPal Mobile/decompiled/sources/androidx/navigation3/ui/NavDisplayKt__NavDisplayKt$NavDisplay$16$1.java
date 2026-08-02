package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1", f = "NavDisplay.kt", i = {}, l = {869}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class NavDisplayKt__NavDisplayKt$NavDisplay$16$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.collection.MutableObjectFloatMap<androidx.navigation3.ui.AnimatedSceneKey> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Transition<androidx.navigation3.scene.Scene<T>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateMap<androidx.navigation3.ui.AnimatedSceneKey, androidx.navigation3.scene.Scene<T>> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.animation.core.Transition<androidx.navigation3.scene.Scene<T>> transition = this.getHighSpeedVideoFpsRanges;
            final kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean isRunning;
                    isRunning = androidx.compose.animation.core.Transition.this.isRunning();
                    return java.lang.Boolean.valueOf(isRunning);
                }
            });
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> flow = new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                    if (!((java.lang.Boolean) obj).booleanValue()) {
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRanges;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1$2", f = "NavDisplay.kt", i = {}, l = {50}, m = "emit", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        int getHighResolutionOutputSizeshNQ4ISI;
                        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getHighSpeedVideoFpsRanges = obj;
                            this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                            return androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.Camera2StreamConfigurationMap = flowCollector;
                    }
                }
            };
            final androidx.compose.animation.core.Transition<androidx.navigation3.scene.Scene<T>> transition2 = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.snapshots.SnapshotStateMap<androidx.navigation3.ui.AnimatedSceneKey, androidx.navigation3.scene.Scene<T>> snapshotStateMap = this.getHighSpeedVideoFpsRangesFor;
            final androidx.collection.MutableObjectFloatMap<androidx.navigation3.ui.AnimatedSceneKey> mutableObjectFloatMap = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    androidx.navigation3.ui.AnimatedSceneKey animatedSceneKey = new androidx.navigation3.ui.AnimatedSceneKey(transition2.getTargetState());
                    java.util.List<androidx.navigation3.ui.AnimatedSceneKey> list = kotlin.collections.CollectionsKt.toList(snapshotStateMap.keySet());
                    androidx.compose.runtime.snapshots.SnapshotStateMap<androidx.navigation3.ui.AnimatedSceneKey, androidx.navigation3.scene.Scene<T>> snapshotStateMap2 = snapshotStateMap;
                    for (androidx.navigation3.ui.AnimatedSceneKey animatedSceneKey2 : list) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(animatedSceneKey2, animatedSceneKey)) {
                            snapshotStateMap2.remove(animatedSceneKey2);
                        }
                    }
                    androidx.collection.MutableObjectFloatMap<androidx.navigation3.ui.AnimatedSceneKey> mutableObjectFloatMap2 = mutableObjectFloatMap;
                    long[] jArr = mutableObjectFloatMap2.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        int i5 = (i2 << 3) + i4;
                                        java.lang.Object obj3 = mutableObjectFloatMap2.keys[i5];
                                        float f = mutableObjectFloatMap2.values[i5];
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual((androidx.navigation3.ui.AnimatedSceneKey) obj3, animatedSceneKey)) {
                                            mutableObjectFloatMap2.removeValueAt(i5);
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
        return ((androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavDisplayKt__NavDisplayKt$NavDisplay$16$1(androidx.compose.animation.core.Transition<androidx.navigation3.scene.Scene<T>> transition, androidx.compose.runtime.snapshots.SnapshotStateMap<androidx.navigation3.ui.AnimatedSceneKey, androidx.navigation3.scene.Scene<T>> snapshotStateMap, androidx.collection.MutableObjectFloatMap<androidx.navigation3.ui.AnimatedSceneKey> mutableObjectFloatMap, kotlin.coroutines.Continuation<? super androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$16$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = transition;
        this.getHighSpeedVideoFpsRangesFor = snapshotStateMap;
        this.Camera2StreamConfigurationMap = mutableObjectFloatMap;
    }
}
