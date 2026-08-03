package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: TapAndDoubleTapGesture.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2", f = "TapAndDoubleTapGesture.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TapOnPosition $onDoubleTap;
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TapOnPosition $onTap;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope $this_detectTapAndDoubleTap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text2.input.internal.selection.TapOnPosition tapOnPosition, androidx.compose.foundation.text2.input.internal.selection.TapOnPosition tapOnPosition2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2> continuation) {
        super(2, continuation);
        this.$this_detectTapAndDoubleTap = pointerInputScope;
        this.$onTap = tapOnPosition;
        this.$onDoubleTap = tapOnPosition2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2(this.$this_detectTapAndDoubleTap, this.$onTap, this.$onDoubleTap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* compiled from: TapAndDoubleTapGesture.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1", f = "TapAndDoubleTapGesture.kt", i = {0, 1, 1, 2, 2, 3, 3, 4}, l = {44, 50, 54, 64, 69, 77}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture", "longPressTimeout", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0"})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TapOnPosition $onDoubleTap;
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TapOnPosition $onTap;
        long J$0;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.text2.input.internal.selection.TapOnPosition tapOnPosition, androidx.compose.foundation.text2.input.internal.selection.TapOnPosition tapOnPosition2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onTap = tapOnPosition;
            this.$onDoubleTap = tapOnPosition2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1(this.$onTap, this.$onDoubleTap, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00ce A[Catch: PointerEventTimeoutCancellationException -> 0x0020, TRY_ENTER, TRY_LEAVE, TryCatch #1 {PointerEventTimeoutCancellationException -> 0x0020, blocks: (B:11:0x001b, B:17:0x00ce), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object consumeUntilUp;
            java.lang.Object consumeUntilUp2;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
            long j;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                try {
                } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused) {
                    this.L$0 = r1;
                    this.J$0 = j;
                    this.label = 3;
                    consumeUntilUp2 = androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt.consumeUntilUp(r1, this);
                    awaitPointerEventScope2 = r1;
                    if (consumeUntilUp2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused2) {
                this.L$0 = null;
                this.label = 6;
                consumeUntilUp = androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt.consumeUntilUp(r1, this);
                if (consumeUntilUp == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            switch (r1) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    this.L$0 = awaitPointerEventScope5;
                    this.label = 1;
                    java.lang.Object awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope5, false, null, this, 3, null);
                    if (awaitFirstDown$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope4 = awaitPointerEventScope5;
                    obj = awaitFirstDown$default;
                    ((androidx.compose.ui.input.pointer.PointerInputChange) obj).consume();
                    j = awaitPointerEventScope4.getViewConfiguration().getLongPressTimeoutMillis();
                    this.L$0 = awaitPointerEventScope4;
                    this.J$0 = j;
                    this.label = 2;
                    obj = awaitPointerEventScope4.withTimeout(j, new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.C00351(null), this);
                    r1 = awaitPointerEventScope4;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    awaitPointerEventScope = r1;
                    if (pointerInputChange != null) {
                        pointerInputChange.consume();
                        androidx.compose.foundation.text2.input.internal.selection.TapOnPosition tapOnPosition = this.$onTap;
                        if (tapOnPosition != null) {
                            tapOnPosition.mo1177onEventk4lQ0M(pointerInputChange.getPosition());
                        }
                        if (this.$onDoubleTap != null) {
                            this.L$0 = awaitPointerEventScope;
                            this.J$0 = j;
                            this.label = 4;
                            obj = androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt.awaitSecondDown(awaitPointerEventScope, pointerInputChange, this);
                            awaitPointerEventScope3 = awaitPointerEventScope;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((androidx.compose.ui.input.pointer.PointerInputChange) obj) != null) {
                                this.L$0 = awaitPointerEventScope3;
                                this.label = 5;
                                java.lang.Object withTimeout = awaitPointerEventScope3.withTimeout(j, new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.AnonymousClass2(this.$onDoubleTap, null), this);
                                r1 = awaitPointerEventScope3;
                                if (withTimeout == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                case 1:
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope4 = awaitPointerEventScope6;
                    ((androidx.compose.ui.input.pointer.PointerInputChange) obj).consume();
                    j = awaitPointerEventScope4.getViewConfiguration().getLongPressTimeoutMillis();
                    this.L$0 = awaitPointerEventScope4;
                    this.J$0 = j;
                    this.label = 2;
                    obj = awaitPointerEventScope4.withTimeout(j, new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.C00351(null), this);
                    r1 = awaitPointerEventScope4;
                    if (obj == coroutine_suspended) {
                    }
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    awaitPointerEventScope = r1;
                    if (pointerInputChange != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                case 2:
                    j = this.J$0;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r1 = awaitPointerEventScope7;
                    pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    awaitPointerEventScope = r1;
                    if (pointerInputChange != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                case 3:
                    j = this.J$0;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope8;
                    pointerInputChange = null;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    if (pointerInputChange != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                case 4:
                    j = this.J$0;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope3 = awaitPointerEventScope9;
                    if (((androidx.compose.ui.input.pointer.PointerInputChange) obj) != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                case 5:
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r1 = awaitPointerEventScope10;
                    return kotlin.Unit.INSTANCE;
                case 6:
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: TapAndDoubleTapGesture.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$1", f = "TapAndDoubleTapGesture.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00351 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange>, java.lang.Object> {
            private /* synthetic */ java.lang.Object L$0;
            int label;

            C00351(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.C00351> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.C00351 c00351 = new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.C00351(continuation);
                c00351.L$0 = obj;
                return c00351;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
                return ((androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.C00351) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default((androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0, null, this, 1, null);
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

        /* compiled from: TapAndDoubleTapGesture.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$2", f = "TapAndDoubleTapGesture.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TapOnPosition $onDoubleTap;
            private /* synthetic */ java.lang.Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(androidx.compose.foundation.text2.input.internal.selection.TapOnPosition tapOnPosition, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.$onDoubleTap = tapOnPosition;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.AnonymousClass2 anonymousClass2 = new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.AnonymousClass2(this.$onDoubleTap, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1.AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default((androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0, null, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                if (pointerInputChange != null) {
                    pointerInputChange.consume();
                    this.$onDoubleTap.mo1177onEventk4lQ0M(pointerInputChange.getPosition());
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
            this.label = 1;
            if (androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(this.$this_detectTapAndDoubleTap, new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2.AnonymousClass1(this.$onTap, this.$onDoubleTap, null), this) == coroutine_suspended) {
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
