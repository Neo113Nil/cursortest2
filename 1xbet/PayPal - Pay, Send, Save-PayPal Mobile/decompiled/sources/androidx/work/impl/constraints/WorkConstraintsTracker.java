package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "controllers", "<init>", "(Ljava/util/List;)V", "Landroidx/work/impl/constraints/trackers/Trackers;", com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "(Landroidx/work/impl/constraints/trackers/Trackers;)V", "Landroidx/work/impl/model/WorkSpec;", "spec", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "track", "(Landroidx/work/impl/model/WorkSpec;)Lkotlinx/coroutines/flow/Flow;", "workSpec", "", "areAllConstraintsMet", "(Landroidx/work/impl/model/WorkSpec;)Z", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkConstraintsTracker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<androidx.work.impl.constraints.controllers.ConstraintController> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(java.util.List<? extends androidx.work.impl.constraints.controllers.ConstraintController> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(androidx.work.impl.constraints.trackers.Trackers trackers) {
        this((java.util.List<? extends androidx.work.impl.constraints.controllers.ConstraintController>) androidx.work.impl.constraints.WorkConstraintsTrackerKt.access$createControllers(trackers));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "");
    }

    public final kotlinx.coroutines.flow.Flow<androidx.work.impl.constraints.ConstraintsState> track(androidx.work.impl.model.WorkSpec spec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "");
        java.util.List<androidx.work.impl.constraints.controllers.ConstraintController> list = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((androidx.work.impl.constraints.controllers.ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((androidx.work.impl.constraints.controllers.ConstraintController) it.next()).track(spec.constraints));
        }
        final kotlinx.coroutines.flow.Flow[] flowArr = (kotlinx.coroutines.flow.Flow[]) kotlin.collections.CollectionsKt.toList(arrayList3).toArray(new kotlinx.coroutines.flow.Flow[0]);
        return kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<androidx.work.impl.constraints.ConstraintsState>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.work.impl.constraints.ConstraintsState>, androidx.work.impl.constraints.ConstraintsState[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                int getHighSpeedVideoSizes;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    androidx.work.impl.constraints.ConstraintsState.ConstraintsMet constraintsMet;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighSpeedVideoSizes;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                        androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 anonymousClass3 = this;
                        androidx.work.impl.constraints.ConstraintsState[] constraintsStateArr = (androidx.work.impl.constraints.ConstraintsState[]) ((java.lang.Object[]) this.getHighSpeedVideoFpsRanges);
                        int length = constraintsStateArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                constraintsMet = null;
                                break;
                            }
                            constraintsMet = constraintsStateArr[i2];
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(constraintsMet, androidx.work.impl.constraints.ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i2++;
                        }
                        if (constraintsMet == null) {
                            constraintsMet = androidx.work.impl.constraints.ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.getHighSpeedVideoSizes = 1;
                        if (flowCollector.emit(constraintsMet, anonymousClass3) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.work.impl.constraints.ConstraintsState> flowCollector, androidx.work.impl.constraints.ConstraintsState[] constraintsStateArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 anonymousClass3 = new androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3(continuation);
                    anonymousClass3.getHighSpeedVideoFpsRangesFor = flowCollector;
                    anonymousClass3.getHighSpeedVideoFpsRanges = constraintsStateArr;
                    return anonymousClass3.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                public AnonymousClass3(kotlin.coroutines.Continuation continuation) {
                    super(3, continuation);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.work.impl.constraints.ConstraintsState> flowCollector, kotlin.coroutines.Continuation continuation) {
                kotlinx.coroutines.flow.Flow[] flowArr2 = flowArr;
                final kotlinx.coroutines.flow.Flow[] flowArr3 = flowArr;
                java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr2, new kotlin.jvm.functions.Function0<androidx.work.impl.constraints.ConstraintsState[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.work.impl.constraints.ConstraintsState[] invoke() {
                        return new androidx.work.impl.constraints.ConstraintsState[flowArr3.length];
                    }
                }, new androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3(null), continuation);
                return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
            }
        });
    }

    public final boolean areAllConstraintsMet(androidx.work.impl.model.WorkSpec workSpec) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        java.util.List<androidx.work.impl.constraints.controllers.ConstraintController> list = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((androidx.work.impl.constraints.controllers.ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Work ");
            sb.append(workSpec.id);
            sb.append(" constrained by ");
            sb.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.work.impl.constraints.WorkConstraintsTracker.m9479$r8$lambda$1G7rUPF21ZPnX0hYpH5ELtRBso((androidx.work.impl.constraints.controllers.ConstraintController) obj2);
                }
            }, 31, null));
            logger.debug(str, sb.toString());
        }
        return arrayList2.isEmpty();
    }

    /* renamed from: $r8$lambda$1G7rUPF21-ZPnX0hYpH5ELtRBso, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m9479$r8$lambda$1G7rUPF21ZPnX0hYpH5ELtRBso(androidx.work.impl.constraints.controllers.ConstraintController constraintController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintController, "");
        java.lang.String simpleName = constraintController.getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName;
    }
}
