package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class w extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S {
    public static final int b = 0;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ImpressionViewVisibilityTracker$isEnoughAreaVisibleFlow$1", f = "ViewVisibilityTracker.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7956a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ android.view.View c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(android.view.View view, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a> continuation) {
            super(2, continuation);
            this.c = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.lang.Boolean> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7956a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
                boolean z = false;
                final android.graphics.Rect rect = new android.graphics.Rect(0, 0, 0, 0);
                final android.view.View view = this.c;
                final android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w$a$$ExternalSyntheticLambda0
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a.a(kotlinx.coroutines.channels.ProducerScope.this, view, rect);
                    }
                };
                this.c.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
                if (this.c.isShown() && this.c.getGlobalVisibleRect(rect)) {
                    z = true;
                }
                producerScope.mo10716trySendJP2dKIU(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                final android.view.View view2 = this.c;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w$a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a.a(view2, onPreDrawListener);
                    }
                };
                this.f7956a = 1;
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

        public static final boolean a(kotlinx.coroutines.channels.ProducerScope producerScope, android.view.View view, android.graphics.Rect rect) {
            producerScope.mo10716trySendJP2dKIU(java.lang.Boolean.valueOf(view.isShown() && view.getGlobalVisibleRect(rect)));
            return true;
        }

        public static final kotlin.Unit a(android.view.View view, android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> b(android.view.View view) {
        kotlinx.coroutines.flow.Flow<java.lang.Boolean> b2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T.b(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a(view, null)));
        return b2;
    }
}
