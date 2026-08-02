package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, m = "invokeSuspend", n = {"launchAppendPrepend"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class RemoteMediatorAccessImpl$launchRefresh$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.RemoteMediatorAccessImpl<Key, Value> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.SingleRunner singleRunner;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
            singleRunner = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = booleanRef2;
            this.getHighSpeedVideoSizes = 1;
            if (singleRunner.runInIsolation(2, new androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, booleanRef2, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            booleanRef = booleanRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (booleanRef.element) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7.Camera2StreamConfigurationMap, null, null, new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.paging.RemoteMediatorAccessImpl<Key, Value> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.paging.AccessorStateHolder accessorStateHolder;
            androidx.paging.RemoteMediatorAccessImpl remoteMediatorAccessImpl;
            androidx.paging.RemoteMediator remoteMediator;
            kotlin.jvm.internal.Ref.BooleanRef booleanRef;
            androidx.paging.AccessorStateHolder accessorStateHolder2;
            boolean booleanValue;
            androidx.paging.AccessorStateHolder accessorStateHolder3;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                accessorStateHolder = ((androidx.paging.RemoteMediatorAccessImpl) this.getHighSpeedVideoFpsRangesFor).getHighResolutionOutputSizeshNQ4ISI;
                androidx.paging.PagingState pagingState = (androidx.paging.PagingState) accessorStateHolder.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1.AnonymousClass1.getHighSpeedVideoFpsRanges((androidx.paging.AccessorState) obj2);
                    }
                });
                if (pagingState != null) {
                    remoteMediatorAccessImpl = this.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = this.getHighSpeedVideoSizes;
                    remoteMediator = remoteMediatorAccessImpl.getHighSpeedVideoFpsRanges;
                    androidx.paging.LoadType loadType = androidx.paging.LoadType.REFRESH;
                    this.Camera2StreamConfigurationMap = remoteMediatorAccessImpl;
                    this.getHighSpeedVideoFpsRanges = booleanRef2;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = remoteMediator.load(loadType, pagingState, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
            remoteMediatorAccessImpl = (androidx.paging.RemoteMediatorAccessImpl) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.paging.RemoteMediator.MediatorResult mediatorResult = (androidx.paging.RemoteMediator.MediatorResult) obj;
            if (mediatorResult instanceof androidx.paging.RemoteMediator.MediatorResult.Success) {
                accessorStateHolder3 = remoteMediatorAccessImpl.getHighResolutionOutputSizeshNQ4ISI;
                booleanValue = ((java.lang.Boolean) accessorStateHolder3.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1.AnonymousClass1.getHighSpeedVideoSizes(androidx.paging.RemoteMediator.MediatorResult.this, (androidx.paging.AccessorState) obj2));
                    }
                })).booleanValue();
            } else if (mediatorResult instanceof androidx.paging.RemoteMediator.MediatorResult.Error) {
                accessorStateHolder2 = remoteMediatorAccessImpl.getHighResolutionOutputSizeshNQ4ISI;
                booleanValue = ((java.lang.Boolean) accessorStateHolder2.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1.AnonymousClass1.getHighSpeedVideoFpsRanges(androidx.paging.RemoteMediator.MediatorResult.this, (androidx.paging.AccessorState) obj2));
                    }
                })).booleanValue();
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            booleanRef.element = booleanValue;
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ androidx.paging.PagingState getHighSpeedVideoFpsRanges(androidx.paging.AccessorState accessorState) {
            java.lang.Object obj;
            java.util.Iterator it = accessorState.Camera2StreamConfigurationMap.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((androidx.paging.AccessorState.PendingRequest) obj).getLoadType() == androidx.paging.LoadType.REFRESH) {
                    break;
                }
            }
            androidx.paging.AccessorState.PendingRequest pendingRequest = (androidx.paging.AccessorState.PendingRequest) obj;
            if (pendingRequest != null) {
                return pendingRequest.getPagingState();
            }
            return null;
        }

        public static /* synthetic */ boolean getHighSpeedVideoFpsRanges(androidx.paging.RemoteMediator.MediatorResult mediatorResult, androidx.paging.AccessorState accessorState) {
            androidx.paging.LoadType loadType = androidx.paging.LoadType.REFRESH;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            kotlin.collections.CollectionsKt.removeAll(accessorState.Camera2StreamConfigurationMap, (kotlin.jvm.functions.Function1) new androidx.paging.AccessorState$$ExternalSyntheticLambda0(loadType));
            androidx.paging.LoadType loadType2 = androidx.paging.LoadType.REFRESH;
            androidx.paging.LoadState.Error error = new androidx.paging.LoadState.Error(((androidx.paging.RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType2, "");
            accessorState.getHighSpeedVideoSizes[loadType2.ordinal()] = error;
            return accessorState.getHighSpeedVideoSizes() != null;
        }

        public static /* synthetic */ boolean getHighSpeedVideoSizes(androidx.paging.RemoteMediator.MediatorResult mediatorResult, androidx.paging.AccessorState accessorState) {
            androidx.paging.LoadType loadType = androidx.paging.LoadType.REFRESH;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType, "");
            kotlin.collections.CollectionsKt.removeAll(accessorState.Camera2StreamConfigurationMap, (kotlin.jvm.functions.Function1) new androidx.paging.AccessorState$$ExternalSyntheticLambda0(loadType));
            if (((androidx.paging.RemoteMediator.MediatorResult.Success) mediatorResult).getEndOfPaginationReached()) {
                androidx.paging.LoadType loadType2 = androidx.paging.LoadType.REFRESH;
                androidx.paging.AccessorState.BlockState blockState = androidx.paging.AccessorState.BlockState.COMPLETED;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockState, "");
                accessorState.getHighSpeedVideoFpsRangesFor[loadType2.ordinal()] = blockState;
                androidx.paging.LoadType loadType3 = androidx.paging.LoadType.PREPEND;
                androidx.paging.AccessorState.BlockState blockState2 = androidx.paging.AccessorState.BlockState.COMPLETED;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType3, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockState2, "");
                accessorState.getHighSpeedVideoFpsRangesFor[loadType3.ordinal()] = blockState2;
                androidx.paging.LoadType loadType4 = androidx.paging.LoadType.APPEND;
                androidx.paging.AccessorState.BlockState blockState3 = androidx.paging.AccessorState.BlockState.COMPLETED;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType4, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockState3, "");
                accessorState.getHighSpeedVideoFpsRangesFor[loadType4.ordinal()] = blockState3;
                accessorState.Camera2StreamConfigurationMap.clear();
            } else {
                androidx.paging.LoadType loadType5 = androidx.paging.LoadType.PREPEND;
                androidx.paging.AccessorState.BlockState blockState4 = androidx.paging.AccessorState.BlockState.UNBLOCKED;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType5, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockState4, "");
                accessorState.getHighSpeedVideoFpsRangesFor[loadType5.ordinal()] = blockState4;
                androidx.paging.LoadType loadType6 = androidx.paging.LoadType.APPEND;
                androidx.paging.AccessorState.BlockState blockState5 = androidx.paging.AccessorState.BlockState.UNBLOCKED;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType6, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockState5, "");
                accessorState.getHighSpeedVideoFpsRangesFor[loadType6.ordinal()] = blockState5;
            }
            androidx.paging.LoadType loadType7 = androidx.paging.LoadType.PREPEND;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType7, "");
            accessorState.getHighSpeedVideoSizes[loadType7.ordinal()] = null;
            androidx.paging.LoadType loadType8 = androidx.paging.LoadType.APPEND;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadType8, "");
            accessorState.getHighSpeedVideoSizes[loadType8.ordinal()] = null;
            return accessorState.getHighSpeedVideoSizes() != null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.paging.RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1.AnonymousClass1> continuation) {
            super(1, continuation);
            this.getHighSpeedVideoFpsRangesFor = remoteMediatorAccessImpl;
            this.getHighSpeedVideoSizes = booleanRef;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$launchRefresh$1(androidx.paging.RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = remoteMediatorAccessImpl;
    }
}
