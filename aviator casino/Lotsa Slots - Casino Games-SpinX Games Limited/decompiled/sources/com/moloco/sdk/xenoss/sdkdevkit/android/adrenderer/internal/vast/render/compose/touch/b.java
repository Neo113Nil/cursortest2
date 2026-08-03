package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

/* loaded from: classes5.dex */
public final class b {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2", f = "Tap.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7897a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a c;
        public final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, kotlin.Unit> d;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2$1", f = "Tap.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a, reason: collision with other inner class name */
        public static final class C0309a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7898a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a b;
            public final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope c;
            public final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, kotlin.Unit> d;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2$1$1", f = "Tap.kt", i = {0, 1}, l = {45, 48}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "down"}, s = {"L$0", "L$0"})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a$a, reason: collision with other inner class name */
            public static final class C0310a extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7899a;
                public /* synthetic */ java.lang.Object b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a c;
                public final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, kotlin.Unit> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0310a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a.C0310a> continuation) {
                    super(2, continuation);
                    this.c = aVar;
                    this.d = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a.C0310a) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a.C0310a c0310a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a.C0310a(this.c, this.d, continuation);
                    c0310a.b = obj;
                    return c0310a;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f7899a;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.b;
                        this.b = awaitPointerEventScope;
                        this.f7899a = 1;
                        obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.b;
                            kotlin.ResultKt.throwOnFailure(obj);
                            pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                            if (pointerInputChange2 != null) {
                                this.c.a();
                            } else {
                                this.c.b();
                                this.d.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(pointerInputChange.getPosition()), androidx.compose.ui.geometry.Offset.m1860boximpl(pointerInputChange2.getPosition()));
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.b;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange3.getPressed() != pointerInputChange3.getPreviousPressed()) {
                        pointerInputChange3.consume();
                    }
                    this.b = pointerInputChange3;
                    this.f7899a = 2;
                    java.lang.Object b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.b(awaitPointerEventScope, this);
                    if (b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pointerInputChange = pointerInputChange3;
                    obj = b;
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange2 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0309a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = pointerInputScope;
                this.d = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7898a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.b.c();
                    androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a.C0310a c0310a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a.C0310a(this.b, this.d, null);
                    this.f7898a = 1;
                    if (pointerInputScope.awaitPointerEventScope(c0310a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a> continuation) {
            super(2, continuation);
            this.c = aVar;
            this.d = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(this.c, this.d, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7897a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a c0309a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0309a(this.c, (androidx.compose.ui.input.pointer.PointerInputScope) this.b, this.d, null);
                this.f7897a = 1;
                if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c0309a, this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt", f = "Tap.kt", i = {0, 1}, l = {62, 77}, m = "waitForUpOrCancellationInitial", n = {"$this$waitForUpOrCancellationInitial", "$this$waitForUpOrCancellationInitial"}, s = {"L$0", "L$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b, reason: collision with other inner class name */
    public static final class C0311b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7900a;
        public /* synthetic */ java.lang.Object b;
        public int c;

        public C0311b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.C0311b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.b((androidx.compose.ui.input.pointer.AwaitPointerEventScope) null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a0 -> B:11:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.C0311b c0311b;
        int i;
        int size;
        int i2;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.C0311b) {
            c0311b = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.C0311b) continuation;
            int i3 = c0311b.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0311b.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c0311b.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0311b.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Initial;
                    c0311b.f7900a = awaitPointerEventScope;
                    c0311b.c = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, c0311b);
                    if (obj == coroutine_suspended) {
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i == 1) {
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) c0311b.f7900a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent2.getChanges().get(0);
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) c0311b.f7900a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                int size2 = changes3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (changes3.get(i4).isConsumed()) {
                        return null;
                    }
                }
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Initial;
                c0311b.f7900a = awaitPointerEventScope;
                c0311b.c = 1;
                obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, c0311b);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent22 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent22.getChanges();
                size = changes22.size();
                i2 = 0;
                while (i2 < size) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(changes22.get(i2))) {
                        i2++;
                    } else {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = pointerEvent22.getChanges();
                        int size3 = changes4.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes4.get(i5);
                            if (pointerInputChange.isConsumed() || androidx.compose.ui.input.pointer.PointerEventKt.m3220isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope.mo3173getSizeYbymL2g(), awaitPointerEventScope.mo3172getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                        c0311b.f7900a = awaitPointerEventScope;
                        c0311b.c = 2;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, c0311b);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes32 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                        int size22 = changes32.size();
                        while (i4 < size22) {
                        }
                        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass22 = androidx.compose.ui.input.pointer.PointerEventPass.Initial;
                        c0311b.f7900a = awaitPointerEventScope;
                        c0311b.c = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass22, c0311b);
                        if (obj == coroutine_suspended) {
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent222 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes222 = pointerEvent222.getChanges();
                        size = changes222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent222.getChanges().get(0);
            }
        }
        c0311b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.C0311b(continuation);
        java.lang.Object obj2 = c0311b.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0311b.c;
        if (i != 0) {
        }
    }

    public static final <T> void c(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    public static final java.lang.Object a(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object forEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(pointerInputScope, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a(pointerInputScope), function2, null), continuation);
        return forEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : kotlin.Unit.INSTANCE;
    }

    public static final <T> boolean a(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!function1.invoke(list.get(i)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean b(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (function1.invoke(list.get(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
