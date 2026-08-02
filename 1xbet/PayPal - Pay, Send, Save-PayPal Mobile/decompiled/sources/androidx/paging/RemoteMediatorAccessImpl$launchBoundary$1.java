package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class RemoteMediatorAccessImpl$launchBoundary$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.paging.RemoteMediatorAccessImpl<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {367}, m = "invokeSuspend", n = {"loadType"}, s = {"L$0"}, v = 1)
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.paging.RemoteMediatorAccessImpl<Key, Value> getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0051 -> B:5:0x0054). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.paging.AccessorStateHolder accessorStateHolder;
            kotlin.Pair pair;
            androidx.paging.RemoteMediator remoteMediator;
            androidx.paging.AccessorStateHolder accessorStateHolder2;
            androidx.paging.AccessorStateHolder accessorStateHolder3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                accessorStateHolder = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighSpeedVideoFpsRangesFor).getHighResolutionOutputSizeshNQ4ISI;
                pair = (kotlin.Pair) accessorStateHolder.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Pair highSpeedVideoSizes;
                        highSpeedVideoSizes = ((androidx.paging.AccessorState) obj2).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes;
                    }
                });
                if (pair != null) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final androidx.paging.LoadType loadType = (androidx.paging.LoadType) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.paging.RemoteMediator.MediatorResult mediatorResult = (androidx.paging.RemoteMediator.MediatorResult) obj;
                if (mediatorResult instanceof androidx.paging.RemoteMediator.MediatorResult.Success) {
                    accessorStateHolder3 = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighSpeedVideoFpsRangesFor).getHighResolutionOutputSizeshNQ4ISI;
                    accessorStateHolder3.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1.Camera2StreamConfigurationMap(androidx.paging.LoadType.this, mediatorResult, (androidx.paging.AccessorState) obj2);
                        }
                    });
                } else if (mediatorResult instanceof androidx.paging.RemoteMediator.MediatorResult.Error) {
                    accessorStateHolder2 = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighSpeedVideoFpsRangesFor).getHighResolutionOutputSizeshNQ4ISI;
                    accessorStateHolder2.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1.getHighSpeedVideoFpsRanges(androidx.paging.LoadType.this, mediatorResult, (androidx.paging.AccessorState) obj2);
                        }
                    });
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                accessorStateHolder = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighSpeedVideoFpsRangesFor).getHighResolutionOutputSizeshNQ4ISI;
                pair = (kotlin.Pair) accessorStateHolder.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Pair highSpeedVideoSizes;
                        highSpeedVideoSizes = ((androidx.paging.AccessorState) obj2).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes;
                    }
                });
                if (pair != null) {
                    loadType = (androidx.paging.LoadType) pair.component1();
                    androidx.paging.PagingState pagingState = (androidx.paging.PagingState) pair.component2();
                    remoteMediator = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoSizes = loadType;
                    this.Camera2StreamConfigurationMap = 1;
                    obj = remoteMediator.load(loadType, pagingState, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    final androidx.paging.RemoteMediator.MediatorResult mediatorResult2 = (androidx.paging.RemoteMediator.MediatorResult) obj;
                    if (mediatorResult2 instanceof androidx.paging.RemoteMediator.MediatorResult.Success) {
                    }
                    accessorStateHolder = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighSpeedVideoFpsRangesFor).getHighResolutionOutputSizeshNQ4ISI;
                    pair = (kotlin.Pair) accessorStateHolder.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Pair highSpeedVideoSizes;
                            highSpeedVideoSizes = ((androidx.paging.AccessorState) obj2).getHighSpeedVideoSizes();
                            return highSpeedVideoSizes;
                        }
                    });
                    if (pair != null) {
                    }
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.paging.LoadType loadType, androidx.paging.RemoteMediator.MediatorResult mediatorResult, androidx.paging.AccessorState accessorState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            kotlin.collections.CollectionsKt.removeAll(accessorState.Camera2StreamConfigurationMap, (kotlin.jvm.functions.Function1) new androidx.paging.AccessorState$$ExternalSyntheticLambda0(loadType));
            androidx.paging.LoadState.Error error = new androidx.paging.LoadState.Error(((androidx.paging.RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            accessorState.getHighSpeedVideoSizes[loadType.ordinal()] = error;
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.paging.LoadType loadType, androidx.paging.RemoteMediator.MediatorResult mediatorResult, androidx.paging.AccessorState accessorState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            kotlin.collections.CollectionsKt.removeAll(accessorState.Camera2StreamConfigurationMap, (kotlin.jvm.functions.Function1) new androidx.paging.AccessorState$$ExternalSyntheticLambda0(loadType));
            if (((androidx.paging.RemoteMediator.MediatorResult.Success) mediatorResult).getEndOfPaginationReached()) {
                androidx.paging.AccessorState.BlockState blockState = androidx.paging.AccessorState.BlockState.COMPLETED;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockState, "");
                accessorState.getHighSpeedVideoFpsRangesFor[loadType.ordinal()] = blockState;
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.paging.RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1> continuation) {
            super(1, continuation);
            this.getHighSpeedVideoFpsRangesFor = remoteMediatorAccessImpl;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.SingleRunner singleRunner;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            singleRunner = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (singleRunner.runInIsolation(1, new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$launchBoundary$1(androidx.paging.RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = remoteMediatorAccessImpl;
    }
}
