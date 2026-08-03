package androidx.compose.foundation;

/* compiled from: BasicTooltip.android.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class BasicTooltip_androidKt$handleGestures$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.BasicTooltipState $state;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTooltip_androidKt$handleGestures$1(androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1> continuation) {
        super(2, continuation);
        this.$state = basicTooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1 basicTooltip_androidKt$handleGestures$1 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1(this.$state, continuation);
        basicTooltip_androidKt$handleGestures$1.L$0 = obj;
        return basicTooltip_androidKt$handleGestures$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* compiled from: BasicTooltip.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope $$this$pointerInput;
        final /* synthetic */ androidx.compose.foundation.BasicTooltipState $state;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$pointerInput = pointerInputScope;
            this.$state = basicTooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1(this.$$this$pointerInput, this.$state, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* compiled from: BasicTooltip.android.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 1, 1}, l = {158, 164, 172}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
        /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00041 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.CoroutineScope $$this$coroutineScope;
            final /* synthetic */ androidx.compose.foundation.BasicTooltipState $state;
            long J$0;
            private /* synthetic */ java.lang.Object L$0;
            java.lang.Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00041(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.$state = basicTooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041 c00041 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041(this.$$this$coroutineScope, this.$state, continuation);
                c00041.L$0 = obj;
                return c00041;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00c8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x00d6 A[LOOP:0: B:8:0x00d4->B:9:0x00d6, LOOP_END] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                long longPressTimeoutMillis;
                java.lang.Object awaitFirstDown$default;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
                java.lang.Object awaitPointerEvent;
                int size;
                int i;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    longPressTimeoutMillis = awaitPointerEventScope3.getViewConfiguration().getLongPressTimeoutMillis();
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope3;
                    this.L$1 = pointerEventPass2;
                    this.J$0 = longPressTimeoutMillis;
                    this.label = 1;
                    awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, pointerEventPass2, this, 1, null);
                    if (awaitFirstDown$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope = awaitPointerEventScope3;
                    pointerEventPass = pointerEventPass2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            awaitPointerEvent = obj;
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
                            size = changes.size();
                            for (i = 0; i < size; i++) {
                                changes.get(i).consume();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        pointerEventPass = (androidx.compose.ui.input.pointer.PointerEventPass) this.L$1;
                        awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.AnonymousClass2(this.$state, null), 3, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                            awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                            if (awaitPointerEvent == coroutine_suspended) {
                            }
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
                            size = changes2.size();
                            while (i < size) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    long j = this.J$0;
                    pointerEventPass = (androidx.compose.ui.input.pointer.PointerEventPass) this.L$1;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    longPressTimeoutMillis = j;
                    awaitPointerEventScope = awaitPointerEventScope4;
                    awaitFirstDown$default = obj;
                }
                int type = ((androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown$default).getType();
                if (androidx.compose.ui.input.pointer.PointerType.m3348equalsimpl0(type, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m3355getTouchT8wyACA()) || androidx.compose.ui.input.pointer.PointerType.m3348equalsimpl0(type, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m3354getStylusT8wyACA())) {
                    try {
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = pointerEventPass;
                        this.label = 2;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.C00051(pointerEventPass, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused2) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.AnonymousClass2(this.$state, null), 3, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                        if (awaitPointerEvent == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
                        size = changes22.size();
                        while (i < size) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }

            /* compiled from: BasicTooltip.android.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00051 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange>, java.lang.Object> {
                final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass $pass;
                private /* synthetic */ java.lang.Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00051(androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.C00051> continuation) {
                    super(2, continuation);
                    this.$pass = pointerEventPass;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.C00051 c00051 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.C00051(this.$pass, continuation);
                    c00051.L$0 = obj;
                    return c00051;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
                    return ((androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.C00051) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation((androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0, this.$pass, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: BasicTooltip.android.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ androidx.compose.foundation.BasicTooltipState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(androidx.compose.foundation.BasicTooltipState basicTooltipState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.AnonymousClass2(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$state.show(androidx.compose.foundation.MutatePriority.UserInput, this) == coroutine_suspended) {
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
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                this.label = 1;
                if (androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(this.$$this$pointerInput, new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00041(coroutineScope, this.$state, null), this) == coroutine_suspended) {
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
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1((androidx.compose.ui.input.pointer.PointerInputScope) this.L$0, this.$state, null), this) == coroutine_suspended) {
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
}
