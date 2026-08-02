package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003"}, d2 = {"", "Lorg/jspecify/annotations/NonNull;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "ARGUMENT_CLASS_NAME"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConstraintTrackingWorkerKt {
    public static final java.lang.String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$awaitConstraintsNotMet(androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker, androidx.work.impl.model.WorkSpec workSpec, kotlin.coroutines.Continuation continuation) {
        androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 constraintTrackingWorkerKt$awaitConstraintsNotMet$1;
        int i;
        if (continuation instanceof androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1) {
            constraintTrackingWorkerKt$awaitConstraintsNotMet$1 = (androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1) continuation;
            if ((constraintTrackingWorkerKt$awaitConstraintsNotMet$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorkerKt$awaitConstraintsNotMet$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlinx.coroutines.flow.Flow onEach = kotlinx.coroutines.flow.FlowKt.onEach(workConstraintsTracker.track(workSpec), new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(workSpec, null));
                    kotlinx.coroutines.flow.Flow<java.lang.Object> flow = new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation2) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation2);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                if (continuation instanceof androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                                        java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                            if (obj instanceof androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) {
                                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
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
                                anonymousClass1 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                if (i != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2", f = "ConstraintTrackingWorker.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                                int getHighSpeedVideoFpsRangesFor;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.Camera2StreamConfigurationMap = obj;
                                    this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                                    return androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                                }

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                this.getHighSpeedVideoFpsRangesFor = flowCollector;
                            }
                        }
                    };
                    constraintTrackingWorkerKt$awaitConstraintsNotMet$1.getHighSpeedVideoSizes = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(flow, constraintTrackingWorkerKt$awaitConstraintsNotMet$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(((androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) obj).getReason());
            }
        }
        constraintTrackingWorkerKt$awaitConstraintsNotMet$1 = new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1(continuation);
        java.lang.Object obj2 = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = constraintTrackingWorkerKt$awaitConstraintsNotMet$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(((androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) obj2).getReason());
    }

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("ConstraintTrkngWrkr");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighResolutionOutputSizeshNQ4ISI = tagWithPrefix;
    }
}
