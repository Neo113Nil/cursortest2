package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {69, 71, 98}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "startState"}, s = {"L$0", "L$0", "L$1"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$data$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b9, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, kotlinx.coroutines.flow.FlowKt.onCompletion(new androidx.content.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1<>(r9), new androidx.content.core.DataStoreImpl$data$1.AnonymousClass5(r8.getHighSpeedVideoSizes, null)), r8) != r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object withContext;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        androidx.content.core.State state;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            androidx.content.core.DataStoreImpl<T> dataStoreImpl = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = flowCollector3;
            this.getHighSpeedVideoFpsRangesFor = 1;
            withContext = kotlinx.coroutines.BuildersKt.withContext(dataStoreImpl.getHighSpeedVideoFpsRanges.getCoroutineContext(), new androidx.content.core.DataStoreImpl$readState$2(dataStoreImpl, false, null), this);
            if (withContext != coroutine_suspended) {
                flowCollector = flowCollector3;
                obj = withContext;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector4;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            state = (androidx.content.core.State) this.getHighSpeedVideoFpsRanges;
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.flow.Flow dropWhile = kotlinx.coroutines.flow.FlowKt.dropWhile(kotlinx.coroutines.flow.FlowKt.takeWhile(kotlinx.coroutines.flow.FlowKt.onStart(((androidx.content.core.DataStoreImpl) this.getHighSpeedVideoSizes).getInputFormats.getFlow(), new androidx.content.core.DataStoreImpl$data$1.AnonymousClass1(this.getHighSpeedVideoSizes, null)), new androidx.content.core.DataStoreImpl$data$1.AnonymousClass2(null)), new androidx.content.core.DataStoreImpl$data$1.AnonymousClass3(state, null));
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = 3;
        }
        androidx.content.core.State state2 = (androidx.content.core.State) obj;
        if (!(state2 instanceof androidx.content.core.Data)) {
            if (state2 instanceof androidx.content.core.UnInitialized) {
                throw new java.lang.IllegalStateException(androidx.content.core.DataStoreImpl.BUG_MESSAGE.toString());
            }
            if (state2 instanceof androidx.content.core.ReadException) {
                throw ((androidx.content.core.ReadException) state2).getReadException();
            }
            if (state2 instanceof androidx.content.core.Final) {
                return kotlin.Unit.INSTANCE;
            }
            if (state2 instanceof androidx.content.core.NoValueDataState) {
                throw new java.lang.IllegalStateException(androidx.content.core.DataStoreImpl.BUG_MESSAGE.toString());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.Camera2StreamConfigurationMap = flowCollector;
        this.getHighSpeedVideoFpsRanges = state2;
        this.getHighSpeedVideoFpsRangesFor = 2;
        if (flowCollector.emit(((androidx.content.core.Data) state2).getValue(), this) != coroutine_suspended) {
            flowCollector2 = flowCollector;
            state = state2;
            final kotlinx.coroutines.flow.Flow dropWhile2 = kotlinx.coroutines.flow.FlowKt.dropWhile(kotlinx.coroutines.flow.FlowKt.takeWhile(kotlinx.coroutines.flow.FlowKt.onStart(((androidx.content.core.DataStoreImpl) this.getHighSpeedVideoSizes).getInputFormats.getFlow(), new androidx.content.core.DataStoreImpl$data$1.AnonymousClass1(this.getHighSpeedVideoSizes, null)), new androidx.content.core.DataStoreImpl$data$1.AnonymousClass2(null)), new androidx.content.core.DataStoreImpl$data$1.AnonymousClass3(state, null));
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = 3;
        }
        return coroutine_suspended;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/datastore/core/State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super androidx.content.core.State<T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this);
                if (Camera2StreamConfigurationMap == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.content.core.DataStoreImpl$data$1.AnonymousClass1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.content.core.DataStoreImpl$data$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$data$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = dataStoreImpl;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.core.State<T>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!(((androidx.content.core.State) this.Camera2StreamConfigurationMap) instanceof androidx.content.core.Final));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.content.core.DataStoreImpl$data$1.AnonymousClass2) create((androidx.content.core.State) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.content.core.DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new androidx.content.core.DataStoreImpl$data$1.AnonymousClass2(continuation);
            anonymousClass2.Camera2StreamConfigurationMap = obj;
            return anonymousClass2;
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$data$1.AnonymousClass2> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.core.State<T>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.content.core.State<T> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.content.core.State state = (androidx.content.core.State) this.getHighResolutionOutputSizeshNQ4ISI;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((state instanceof androidx.content.core.Data) && ((androidx.content.core.Data) state).getVersion() <= ((androidx.content.core.Data) this.getHighSpeedVideoFpsRanges).getVersion());
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.content.core.DataStoreImpl$data$1.AnonymousClass3) create((androidx.content.core.State) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.content.core.DataStoreImpl$data$1.AnonymousClass3 anonymousClass3 = new androidx.content.core.DataStoreImpl$data$1.AnonymousClass3(this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass3.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(androidx.content.core.State<T> state, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$data$1.AnonymousClass3> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = state;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super T>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object highSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this);
                if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new androidx.content.core.DataStoreImpl$data$1.AnonymousClass5(this.getHighSpeedVideoFpsRangesFor, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$data$1.AnonymousClass5> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoFpsRangesFor = dataStoreImpl;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.content.core.DataStoreImpl$data$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.core.DataStoreImpl$data$1 dataStoreImpl$data$1 = new androidx.content.core.DataStoreImpl$data$1(this.getHighSpeedVideoSizes, continuation);
        dataStoreImpl$data$1.Camera2StreamConfigurationMap = obj;
        return dataStoreImpl$data$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$data$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$data$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = dataStoreImpl;
    }
}
