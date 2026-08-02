package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TapGestureDetectorKt$detectTapAndPress$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0, 0, 1}, l = {251, 257}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "resetJob", "resetJob"}, s = {"L$0", "L$1", "L$0"}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

        /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineStart Camera2StreamConfigurationMap;
            kotlinx.coroutines.Job launch$default;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
            kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3;
            kotlinx.coroutines.Job job;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputMinFrameDuration;
                kotlinx.coroutines.CoroutineScope coroutineScope = this.Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap();
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, Camera2StreamConfigurationMap, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(this.getHighSpeedVideoSizes, null), 1, null);
                this.getOutputMinFrameDuration = awaitPointerEventScope2;
                this.getHighSpeedVideoFpsRangesFor = launch$default;
                this.getHighSpeedVideoSizesFor = 1;
                java.lang.Object awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 3, null);
                if (awaitFirstDown$default != coroutine_suspended) {
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj = awaitFirstDown$default;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                job = (kotlinx.coroutines.Job) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                if (pointerInputChange == null) {
                    pointerInputChange.consume();
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, job, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.AnonymousClass3(this.getHighSpeedVideoSizes, null));
                    kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (function1 != null) {
                        function1.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange.getPosition()));
                    }
                } else {
                    androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, job, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoSizes, null));
                }
                return kotlin.Unit.INSTANCE;
            }
            launch$default = (kotlinx.coroutines.Job) this.getHighSpeedVideoFpsRangesFor;
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            pointerInputChange2.consume();
            kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function32 = this.getHighSpeedVideoFpsRanges;
            function3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoFpsRanges;
            if (function32 != function3) {
                androidx.compose.foundation.gestures.TapGestureDetectorKt.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, launch$default, androidx.compose.foundation.gestures.TapGestureDetectorKt.Camera2StreamConfigurationMap(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.C00141(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, pointerInputChange2, null));
            }
            this.getOutputMinFrameDuration = launch$default;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoSizesFor = 2;
            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
            if (obj != coroutine_suspended) {
                job = launch$default;
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                if (pointerInputChange == null) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00141 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputChange getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.Camera2StreamConfigurationMap;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoSizes;
                    androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl = this.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(this.getHighResolutionOutputSizeshNQ4ISI.getPosition());
                    this.Camera2StreamConfigurationMap = 1;
                    if (function3.invoke(pressGestureScopeImpl, m5741boximpl, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.C00141) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.C00141(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00141(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.C00141> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoSizes = function3;
                this.getHighSpeedVideoFpsRangesFor = pressGestureScopeImpl;
                this.getHighResolutionOutputSizeshNQ4ISI = pointerInputChange;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor.cancel();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = pressGestureScopeImpl;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoSizes != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor.release();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.AnonymousClass3(this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.AnonymousClass3> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = pressGestureScopeImpl;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getOutputMinFrameDuration = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = coroutineScope;
            this.getHighSpeedVideoFpsRanges = function3;
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
            this.getHighSpeedVideoSizes = pressGestureScopeImpl;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
            this.getHighSpeedVideoFpsRanges = 1;
            if (androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(this.getHighResolutionOutputSizeshNQ4ISI, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1(coroutineScope, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        tapGestureDetectorKt$detectTapAndPress$2.getInputFormats = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TapGestureDetectorKt$detectTapAndPress$2(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pointerInputScope;
        this.getHighSpeedVideoSizes = function3;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.Camera2StreamConfigurationMap = pressGestureScopeImpl;
    }
}
