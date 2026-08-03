package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class e {

    public static final class a implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.layout.BoxScope f7615a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i b;
        public final /* synthetic */ kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> c;
        public final /* synthetic */ boolean d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0268a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
            public C0268a(java.lang.Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).x();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                a();
                return kotlin.Unit.INSTANCE;
            }
        }

        public /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> {
            public b(java.lang.Object obj) {
                super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c cVar) {
                a(cVar);
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.compose.foundation.layout.BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function11, boolean z) {
            this.f7615a = boxScope;
            this.b = iVar;
            this.c = function11;
            this.d = z;
        }

        public final void a(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-880292845, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton.<anonymous>.<anonymous> (AdGoNextButton.kt:54)");
            }
            androidx.compose.foundation.layout.BoxScope boxScope = this.f7615a;
            kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> l = this.b.l();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar = this.b;
            composer.startReplaceableGroup(328190741);
            boolean changedInstance = composer.changedInstance(iVar);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a.C0268a(iVar);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar2 = this.b;
            composer.startReplaceableGroup(328192462);
            boolean changedInstance2 = composer.changedInstance(iVar2);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a.b(iVar2);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScope, l, function0, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), this.c, this.d, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButtonKt$GoNextButton$1$1", f = "AdGoNextButton.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7616a;
        public final /* synthetic */ androidx.compose.runtime.State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> b;
        public final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Integer> c;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Integer> f7617a;

            public a(androidx.compose.runtime.MutableState<java.lang.Integer> mutableState) {
                this.f7617a = mutableState;
            }

            public final java.lang.Object a(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(this.f7617a, i);
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                return a(((java.lang.Number) obj).intValue(), continuation);
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b, reason: collision with other inner class name */
        public static final class C0269b implements kotlinx.coroutines.flow.Flow<java.lang.Integer> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.Flow f7618a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a */
            public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f7619a;

                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButtonKt$GoNextButton$1$1$invokeSuspend$$inlined$filter$1$2", f = "AdGoNextButton.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a$a, reason: collision with other inner class name */
                public static final class C0270a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f7620a;
                    public int b;
                    public java.lang.Object c;
                    public java.lang.Object d;

                    public C0270a(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f7620a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0269b.a.this.emit(null, this);
                    }
                }

                public a(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f7619a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0269b.a.C0270a c0270a;
                    int i;
                    if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0269b.a.C0270a) {
                        c0270a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0269b.a.C0270a) continuation;
                        int i2 = c0270a.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0270a.b = i2 - Integer.MIN_VALUE;
                            java.lang.Object obj2 = c0270a.f7620a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c0270a.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f7619a;
                                if (((java.lang.Number) obj).intValue() > 0) {
                                    c0270a.b = 1;
                                    if (flowCollector.emit(obj, c0270a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                    c0270a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0269b.a.C0270a(continuation);
                    java.lang.Object obj22 = c0270a.f7620a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0270a.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            public C0269b(kotlinx.coroutines.flow.Flow flow) {
                this.f7618a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = this.f7618a.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0269b.a(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> state, androidx.compose.runtime.MutableState<java.lang.Integer> mutableState, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b> continuation) {
            super(2, continuation);
            this.b = state;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7616a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.runtime.State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> state = this.b;
                kotlinx.coroutines.flow.Flow take = kotlinx.coroutines.flow.FlowKt.take(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.C0269b(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Integer.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.a(androidx.compose.runtime.State.this));
                    }
                })), 1);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b.a(this.c);
                this.f7616a = 1;
                if (take.collect(aVar, this) == coroutine_suspended) {
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

        public static final int a(androidx.compose.runtime.State state) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a((androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a>) state);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b bVar = a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b) a2 : null;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }
    }

    public static final kotlin.Unit a(androidx.compose.foundation.layout.BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a aVar, kotlin.jvm.functions.Function11 function11, kotlin.jvm.functions.Function11 function112, kotlin.jvm.functions.Function11 function113, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(boxScope, iVar, aVar, (kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function11, (kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function112, (kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function113, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(androidx.compose.foundation.layout.BoxScope boxScope, kotlinx.coroutines.flow.StateFlow stateFlow, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function11 function11, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        a(boxScope, stateFlow, function0, function1, function11, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final androidx.compose.foundation.layout.BoxScope boxScope, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a aVar, final kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function11, final kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function112, kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function113, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function114;
        kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function115;
        kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function116;
        kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function117;
        java.lang.Boolean valueOf;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-449567267);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(adViewModel) : startRestartGroup.changedInstance(adViewModel) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(aVar) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function114 = function11;
            i3 |= startRestartGroup.changedInstance(function114) ? 2048 : 1024;
            if ((i2 & 8) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function115 = function112;
                i3 |= startRestartGroup.changedInstance(function115) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        function116 = function113;
                        if (startRestartGroup.changedInstance(function116)) {
                            i4 = 131072;
                            i3 |= i4;
                        }
                    } else {
                        function116 = function113;
                    }
                    i4 = 65536;
                    i3 |= i4;
                } else {
                    function116 = function113;
                }
                if ((74899 & i3) != 74898 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -458753;
                        }
                    } else if ((i2 & 16) != 0) {
                        i3 &= -458753;
                        function116 = function114;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-449567267, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton (AdGoNextButton.kt:28)");
                    }
                    function117 = null;
                    valueOf = aVar != null ? java.lang.Boolean.valueOf(aVar.a()) : null;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, java.lang.Boolean.TRUE)) {
                        function117 = function115;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, java.lang.Boolean.FALSE)) {
                        if (aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c) {
                            function117 = function114;
                        } else {
                            if (!(aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a) && !(aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b) && !(aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d) && aVar != null) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            function117 = function116;
                        }
                    } else if (valueOf != null) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    boolean z = aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a;
                    boolean z2 = (z || (aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b) || !(aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c)) ? false : true;
                    if (function117 != null) {
                        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -880292845, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScope, adViewModel, function117, z2));
                        if (z) {
                            startRestartGroup.startReplaceableGroup(-1024203648);
                            composableLambda.invoke(startRestartGroup, 6);
                            startRestartGroup.endReplaceableGroup();
                        } else if (aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b) {
                            startRestartGroup.startReplaceableGroup(-1024201856);
                            composableLambda.invoke(startRestartGroup, 6);
                            startRestartGroup.endReplaceableGroup();
                        } else if (aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c) {
                            startRestartGroup.startReplaceableGroup(-1024199968);
                            composableLambda.invoke(startRestartGroup, 6);
                            startRestartGroup.endReplaceableGroup();
                        } else {
                            startRestartGroup.startReplaceableGroup(-1685393183);
                            startRestartGroup.endReplaceableGroup();
                        }
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    final kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function118 = function116;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(androidx.compose.foundation.layout.BoxScope.this, adViewModel, aVar, function11, function112, function118, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function115 = function112;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) != 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            function117 = null;
            if (aVar != null) {
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, java.lang.Boolean.TRUE)) {
            }
            boolean z3 = aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a;
            if (z3) {
                if (function117 != null) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if (function117 != null) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function114 = function11;
        if ((i2 & 8) == 0) {
        }
        function115 = function112;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        function117 = null;
        if (aVar != null) {
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, java.lang.Boolean.TRUE)) {
        }
        boolean z32 = aVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a;
        if (z32) {
        }
        if (function117 != null) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(final androidx.compose.foundation.layout.BoxScope boxScope, final kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> stateFlow, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> function1, final kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function11, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(706979519);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(stateFlow) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function11) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(706979519, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.GoNextButton (AdGoNextButton.kt:83)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(stateFlow, (androidx.lifecycle.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, (i2 >> 3) & 14, 7);
            startRestartGroup.startReplaceableGroup(-2101080690);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            androidx.compose.runtime.Composer.Companion companion = androidx.compose.runtime.Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(-2101078598);
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.b(collectAsStateWithLifecycle, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            int m10896constructorimpl = kotlin.UInt.m10896constructorimpl(a((androidx.compose.runtime.MutableState<java.lang.Integer>) mutableState));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a a2 = a((androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a>) collectAsStateWithLifecycle);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b bVar = a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b) a2 : null;
            int m10896constructorimpl2 = kotlin.UInt.m10896constructorimpl(bVar != null ? bVar.b() : 0);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a((androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a>) collectAsStateWithLifecycle) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.C0312a);
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(!(a((androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a>) collectAsStateWithLifecycle) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.c));
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z);
            kotlin.UInt m10890boximpl = kotlin.UInt.m10890boximpl(m10896constructorimpl);
            kotlin.UInt m10890boximpl2 = kotlin.UInt.m10890boximpl(m10896constructorimpl2);
            startRestartGroup.startReplaceableGroup(-2101047518);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            int i3 = i2 << 3;
            function11.invoke(boxScope, valueOf, valueOf2, function0, function1, valueOf3, m10890boximpl, m10890boximpl2, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, java.lang.Integer.valueOf((i2 & 14) | 100663296 | (i3 & 7168) | (i3 & 57344) | (458752 & i2) | ((i2 << 15) & 1879048192)));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(androidx.compose.foundation.layout.BoxScope.this, stateFlow, function0, function1, function11, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(androidx.compose.runtime.MutableState<java.lang.Integer> mutableState, int i) {
        mutableState.setValue(java.lang.Integer.valueOf(i));
    }

    public static final kotlin.Unit a() {
        return kotlin.Unit.INSTANCE;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a a(androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> state) {
        return state.getValue();
    }

    public static final int a(androidx.compose.runtime.MutableState<java.lang.Integer> mutableState) {
        return mutableState.getValue().intValue();
    }
}
