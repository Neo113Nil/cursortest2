package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\r\u001a3\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "Ljava/util/UUID;", "id", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/WorkInfo;", "getWorkStatusPojoFlowDataForIds", "(Landroidx/work/impl/model/WorkSpecDao;Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "name", "", "getWorkStatusPojoFlowForName", "(Landroidx/work/impl/model/WorkSpecDao;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "tag", "getWorkStatusPojoFlowForTag", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "dedup", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineDispatcher;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkSpecDaoKt {
    public static final kotlinx.coroutines.flow.Flow<androidx.work.WorkInfo> getWorkStatusPojoFlowDataForIds(androidx.work.impl.model.WorkSpecDao workSpecDao, java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecDao, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        final kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(kotlin.collections.CollectionsKt.listOf(java.lang.String.valueOf(uuid)));
        return kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<androidx.work.WorkInfo>() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.work.WorkInfo> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                androidx.work.impl.model.WorkSpec.WorkInfoPojo workInfoPojo = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) obj);
                                androidx.work.WorkInfo workInfo = workInfoPojo != null ? workInfoPojo.toWorkInfo() : null;
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(workInfo, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                    anonymousClass1 = new androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", f = "WorkSpecDao.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRanges = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }
        });
    }

    public static final kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.WorkInfo>> getWorkStatusPojoFlowForName(androidx.work.impl.model.WorkSpecDao workSpecDao, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecDao, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(str), coroutineDispatcher);
    }

    public static final kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.WorkInfo>> getWorkStatusPojoFlowForTag(androidx.work.impl.model.WorkSpecDao workSpecDao, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecDao, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(str), coroutineDispatcher);
    }

    public static final kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.WorkInfo>> dedup(final kotlinx.coroutines.flow.Flow<? extends java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> flow, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<java.util.List<? extends androidx.work.WorkInfo>>() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends androidx.work.WorkInfo>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                java.util.List list = (java.util.List) obj;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                java.util.Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((androidx.work.impl.model.WorkSpec.WorkInfoPojo) it.next()).toWorkInfo());
                                }
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
                    anonymousClass1 = new androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", f = "WorkSpecDao.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizes = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                }
            }
        }), coroutineDispatcher);
    }
}
