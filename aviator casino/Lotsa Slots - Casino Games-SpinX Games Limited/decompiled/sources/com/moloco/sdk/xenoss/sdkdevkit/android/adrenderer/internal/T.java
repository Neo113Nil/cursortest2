package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class T {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isAttachedToWindowFlow$1", f = "ViewVisibilityTracker.kt", i = {0}, l = {114, 130}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7413a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ android.view.View c;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T$a$a, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0223a implements android.view.View.OnAttachStateChangeListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<java.lang.Boolean> f7414a;

            /* JADX WARN: Multi-variable type inference failed */
            public ViewOnAttachStateChangeListenerC0223a(kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> producerScope) {
                this.f7414a = producerScope;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                this.f7414a.mo10716trySendJP2dKIU(java.lang.Boolean.TRUE);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                this.f7414a.mo10716trySendJP2dKIU(java.lang.Boolean.FALSE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(android.view.View view, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a> continuation) {
            super(2, continuation);
            this.c = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.channels.ProducerScope producerScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7413a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.c.isAttachedToWindow());
                this.b = producerScope;
                this.f7413a = 1;
                if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a.ViewOnAttachStateChangeListenerC0223a viewOnAttachStateChangeListenerC0223a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a.ViewOnAttachStateChangeListenerC0223a(producerScope);
            this.c.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0223a);
            final android.view.View view = this.c;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T$a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a.a(view, viewOnAttachStateChangeListenerC0223a);
                }
            };
            this.b = null;
            this.f7413a = 2;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(android.view.View view, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a.ViewOnAttachStateChangeListenerC0223a viewOnAttachStateChangeListenerC0223a) {
            view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0223a);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isLifecycleResumedFlow$1", f = "ViewVisibilityTracker.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7415a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ androidx.lifecycle.Lifecycle c;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7416a;

            static {
                int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f7416a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.Lifecycle lifecycle, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b> continuation) {
            super(2, continuation);
            this.c = lifecycle;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b(this.c, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7415a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
                final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T$b$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b.a(kotlinx.coroutines.channels.ProducerScope.this, lifecycleOwner, event);
                    }
                };
                this.c.addObserver(lifecycleEventObserver);
                final androidx.lifecycle.Lifecycle lifecycle = this.c;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T$b$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b.a(androidx.lifecycle.Lifecycle.this, lifecycleEventObserver);
                    }
                };
                this.f7415a = 1;
                if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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

        public static final void a(kotlinx.coroutines.channels.ProducerScope producerScope, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
            int i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b.a.f7416a[event.ordinal()];
            if (i == 1) {
                kotlinx.coroutines.channels.ChannelResult.m12318boximpl(producerScope.mo10716trySendJP2dKIU(java.lang.Boolean.FALSE));
            } else if (i != 2) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else {
                kotlinx.coroutines.channels.ChannelResult.m12318boximpl(producerScope.mo10716trySendJP2dKIU(java.lang.Boolean.TRUE));
            }
        }

        public static final kotlin.Unit a(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver) {
            lifecycle.removeObserver(lifecycleEventObserver);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isLifecycleResumedFlow$lifecycle$1", f = "ViewVisibilityTracker.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7417a;
        public /* synthetic */ java.lang.Object b;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.c) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7417a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.b;
                this.f7417a = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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

    public static final kotlinx.coroutines.flow.Flow<java.lang.Boolean> b(android.view.View view) {
        return b(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.a(view, null)));
    }

    public static final kotlinx.coroutines.flow.Flow<java.lang.Boolean> b(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            return b(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b(lifecycle, null)));
        }
        return kotlinx.coroutines.flow.FlowKt.flow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.c(null));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> b(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(kotlinx.coroutines.flow.FlowKt.conflate(flow)), com.moloco.sdk.internal.scheduling.b.a().getMain());
    }
}
