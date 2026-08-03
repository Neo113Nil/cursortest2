package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

/* loaded from: classes5.dex */
public final class h {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$1$1", f = "Linear.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7850a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k b;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$1$1$1", f = "Linear.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$a$a, reason: collision with other inner class name */
        public static final class C0303a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7851a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0303a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a.C0303a> continuation) {
                super(2, continuation);
                this.b = kVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a.C0303a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a.C0303a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7851a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.b.b();
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a> continuation) {
            super(2, continuation);
            this.b = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7850a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.CoroutineContext main = com.moloco.sdk.internal.scheduling.b.a().getMain();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a.C0303a c0303a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a.C0303a(this.b, null);
                this.f7850a = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(main, c0303a, this) == coroutine_suspended) {
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

    public /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, kotlin.Unit> {
        public b(java.lang.Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar) {
            a(lVar);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$2$5$1", f = "Linear.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7852a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.c> continuation) {
            super(2, continuation);
            this.c = function0;
            this.d = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.c) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.c(this.c, this.d, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7852a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = (androidx.compose.ui.input.pointer.PointerInputScope) this.b;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.c;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar = this.d;
                kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$c$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.c.a(kotlin.jvm.functions.Function0.this, kVar, (androidx.compose.ui.geometry.Offset) obj2, (androidx.compose.ui.geometry.Offset) obj3);
                    }
                };
                this.f7852a = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(pointerInputScope, function2, this) == coroutine_suspended) {
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

        public static final kotlin.Unit a(kotlin.jvm.functions.Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, androidx.compose.ui.geometry.Offset offset, androidx.compose.ui.geometry.Offset offset2) {
            if (function0 != null) {
                function0.invoke();
            } else {
                kVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f7665a.a(offset.getPackedValue()));
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
        public d(java.lang.Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onMuteChange", "onMuteChange(Z)V", 0);
        }

        public final void a(boolean z) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).c(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
            a(bool.booleanValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public e(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public f(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).u();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class g implements kotlin.jvm.functions.Function6<androidx.compose.foundation.layout.BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.Alignment f7853a;
        public final /* synthetic */ androidx.compose.foundation.layout.PaddingValues b;

        public static final class a implements kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j f7854a;
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> b;
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> c;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
                this.f7854a = jVar;
                this.b = function0;
                this.c = function02;
            }

            public final void a(androidx.compose.animation.AnimatedVisibilityScope AnimatedVisibility, androidx.compose.runtime.Composer composer, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(989733896, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous>.<anonymous> (Linear.kt:155)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = this.f7854a;
                if (jVar != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a(jVar, this.b, this.c, null, composer, 0, 8);
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        }

        public g(androidx.compose.ui.Alignment alignment, androidx.compose.foundation.layout.PaddingValues paddingValues) {
            this.f7853a = alignment;
            this.b = paddingValues;
        }

        public final void a(androidx.compose.foundation.layout.BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, kotlin.jvm.functions.Function0<kotlin.Unit> onDisplayed, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDisplayed, "onDisplayed");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(jVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changedInstance(onDisplayed) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= composer.changedInstance(onClick) ? 2048 : 1024;
            }
            if ((i2 & 9363) == 9362 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-903645392, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous> (Linear.kt:149)");
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(jVar != null, androidx.compose.foundation.layout.PaddingKt.padding(boxScope.align(androidx.compose.ui.Modifier.INSTANCE, this.f7853a), this.b), (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 989733896, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.g.a(jVar, onDisplayed, onClick)), composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function02, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(boxScope, jVar, function0, function02, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function7 function7, kotlin.jvm.functions.Function5 function5, kotlin.jvm.functions.Function6 function6, kotlin.jvm.functions.Function7 function72, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q q, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(kVar, function0, modifier, function7, function5, function6, function72, q, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final void b(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i c(androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function7<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function2<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a, kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function7, final kotlin.jvm.functions.Function5<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, final kotlin.jvm.functions.Function6<? super androidx.compose.foundation.layout.BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function6, final kotlin.jvm.functions.Function7<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function72, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, final kotlin.jvm.functions.Function0<kotlin.Unit> onShouldReplay, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        boolean z;
        java.lang.Object rememberedValue;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer.Companion companion;
        final androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue3;
        final androidx.compose.runtime.MutableState mutableState2;
        java.lang.Object rememberedValue4;
        boolean z2;
        java.lang.Object rememberedValue5;
        androidx.compose.runtime.MutableState mutableState3;
        boolean z3;
        java.lang.Object rememberedValue6;
        boolean z4;
        java.lang.Object rememberedValue7;
        boolean z5;
        java.lang.Object rememberedValue8;
        boolean z6;
        java.lang.Object rememberedValue9;
        int i6;
        int i7;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.MutableState mutableState4;
        androidx.compose.runtime.MutableState mutableState5;
        int i8;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1913678167);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(viewModel) : startRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function7) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function5) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(function6) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(function72) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= (16777216 & i) == 0 ? startRestartGroup.changed(viewVisibilityTracker) : startRestartGroup.changedInstance(viewVisibilityTracker) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changedInstance(onShouldReplay) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i4 = i3;
            if ((38347923 & i4) == 38347922 || !startRestartGroup.getSkipping()) {
                androidx.compose.ui.Modifier modifier4 = i9 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1913678167, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Linear (Linear.kt:40)");
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1664827545);
                i5 = i4 & 14;
                z = i5 != 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion2.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier4);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor);
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(viewModel.Q(), null, startRestartGroup, 0, 1);
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(viewModel.q(), null, startRestartGroup, 0, 1);
                startRestartGroup.startReplaceableGroup(1087103523);
                rememberedValue2 = startRestartGroup.rememberedValue();
                companion = androidx.compose.runtime.Composer.INSTANCE;
                if (rememberedValue2 == companion.getEmpty()) {
                    androidx.compose.runtime.MutableState mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                    rememberedValue2 = mutableStateOf$default;
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087106315);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b.b, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087112304);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m(java.lang.Boolean.TRUE), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final androidx.compose.runtime.MutableState mutableState6 = (androidx.compose.runtime.MutableState) rememberedValue4;
                startRestartGroup.endReplaceableGroup();
                java.lang.String G = viewModel.G();
                boolean L = viewModel.L();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> a2 = a((androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean>>) mutableState6);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> a3 = a((androidx.compose.runtime.State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long>>) collectAsState);
                boolean b2 = b((androidx.compose.runtime.State<java.lang.Boolean>) collectAsState2);
                startRestartGroup.startReplaceableGroup(1087122634);
                z2 = i5 != 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue5;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087126542);
                if (i5 != 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(viewModel))) {
                    mutableState3 = mutableState;
                    z3 = true;
                } else {
                    mutableState3 = mutableState;
                    z3 = false;
                }
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue6;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087134824);
                z4 = i5 != 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!z4 || rememberedValue7 == companion.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue7;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087138431);
                z5 = i5 != 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!z5 || rememberedValue8 == companion.getEmpty()) {
                    rememberedValue8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.b(viewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceableGroup();
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue8);
                androidx.compose.ui.Modifier matchParentSize = boxScopeInstance.matchParentSize(androidx.compose.ui.Modifier.INSTANCE);
                startRestartGroup.startReplaceableGroup(1087142612);
                z6 = ((i4 & 112) != 32) | (i5 != 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(viewModel)));
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!z6 || rememberedValue9 == companion.getEmpty()) {
                    rememberedValue9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.c(function0, viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(G, L, a2, a3, b2, function1, function12, viewVisibilityTracker, function13, function14, androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(matchParentSize, unit, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9), startRestartGroup, i4 & 29360128, 0, 0);
                startRestartGroup.startReplaceableGroup(1087152169);
                if (function72 != null) {
                    mutableState5 = mutableState3;
                    i6 = i5;
                    i7 = i4;
                    composer2 = startRestartGroup;
                    mutableState4 = mutableState2;
                    i8 = 4;
                } else {
                    startRestartGroup.startReplaceableGroup(1376164556);
                    java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == companion.getEmpty()) {
                        rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    startRestartGroup.endReplaceableGroup();
                    i6 = i5;
                    i7 = i4;
                    composer2 = startRestartGroup;
                    mutableState4 = mutableState2;
                    mutableState5 = mutableState3;
                    i8 = 4;
                    function72.invoke(boxScopeInstance, java.lang.Boolean.valueOf(b((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState3)), c((androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState2), (kotlin.jvm.functions.Function1) rememberedValue10, onShouldReplay, composer2, java.lang.Integer.valueOf(((i4 >> 12) & 57344) | 3078));
                }
                composer2.endReplaceableGroup();
                boolean z7 = !b((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState5) || ((c((androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState4) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a) ^ true);
                composer2.startReplaceableGroup(1087171337);
                if (function7 != null) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z7);
                    java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(b((androidx.compose.runtime.State<java.lang.Boolean>) collectAsState2));
                    composer2.startReplaceableGroup(1376183992);
                    boolean z8 = i6 == i8 || ((i7 & 8) != 0 && composer2.changedInstance(viewModel));
                    java.lang.Object rememberedValue11 = composer2.rememberedValue();
                    if (z8 || rememberedValue11 == companion.getEmpty()) {
                        rememberedValue11 = new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a) obj2);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue11;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1376189411);
                    boolean z9 = i6 == i8 || ((i7 & 8) != 0 && composer2.changedInstance(viewModel));
                    java.lang.Object rememberedValue12 = composer2.rememberedValue();
                    if (z9 || rememberedValue12 == companion.getEmpty()) {
                        rememberedValue12 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.d(viewModel);
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    composer2.endReplaceableGroup();
                    function7.invoke(boxScopeInstance, valueOf, valueOf2, function2, (kotlin.reflect.KFunction) rememberedValue12, composer2, 6);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1087179946);
                if (function5 != null) {
                    function5.invoke(boxScopeInstance, java.lang.Boolean.valueOf(b((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState5)), c((androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState4), composer2, 6);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1087182738);
                if (function6 != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j c2 = c((androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>) androidx.compose.runtime.SnapshotStateKt.collectAsState(viewModel.O(), null, composer2, 0, 1));
                    composer2.startReplaceableGroup(1376198609);
                    boolean z10 = i6 == i8 || ((i7 & 8) != 0 && composer2.changedInstance(viewModel));
                    java.lang.Object rememberedValue13 = composer2.rememberedValue();
                    if (z10 || rememberedValue13 == companion.getEmpty()) {
                        rememberedValue13 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.e(viewModel);
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue13;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1376200365);
                    boolean z11 = i6 == i8 || ((i7 & 8) != 0 && composer2.changedInstance(viewModel));
                    java.lang.Object rememberedValue14 = composer2.rememberedValue();
                    if (z11 || rememberedValue14 == companion.getEmpty()) {
                        rememberedValue14 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.f(viewModel);
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    composer2.endReplaceableGroup();
                    function6.invoke(boxScopeInstance, c2, kFunction, (kotlin.reflect.KFunction) rememberedValue14, composer2, 6);
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, function0, modifier3, function7, function5, function6, function72, viewVisibilityTracker, onShouldReplay, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i4 = i3;
        if ((38347923 & i4) == 38347922) {
        }
        if (i9 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(1664827545);
        i5 = i4 & 14;
        if (i5 != 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(viewModel, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion companion22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion22.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier4);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(viewModel.Q(), null, startRestartGroup, 0, 1);
        androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(viewModel.q(), null, startRestartGroup, 0, 1);
        startRestartGroup.startReplaceableGroup(1087103523);
        rememberedValue2 = startRestartGroup.rememberedValue();
        companion = androidx.compose.runtime.Composer.INSTANCE;
        if (rememberedValue2 == companion.getEmpty()) {
        }
        mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087106315);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
        }
        mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087112304);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
        }
        final androidx.compose.runtime.MutableState mutableState62 = (androidx.compose.runtime.MutableState) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        java.lang.String G2 = viewModel.G();
        boolean L2 = viewModel.L();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> a22 = a((androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean>>) mutableState62);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> a32 = a((androidx.compose.runtime.State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long>>) collectAsState3);
        boolean b22 = b((androidx.compose.runtime.State<java.lang.Boolean>) collectAsState22);
        startRestartGroup.startReplaceableGroup(1087122634);
        if (i5 != 4) {
        }
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue5;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087126542);
        if (i5 != 4) {
        }
        mutableState3 = mutableState;
        z3 = true;
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue6;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087134824);
        if (i5 != 4) {
        }
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        kotlin.jvm.functions.Function1 function132 = (kotlin.jvm.functions.Function1) rememberedValue7;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087138431);
        if (i5 != 4) {
        }
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.b(viewModel);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceableGroup();
        kotlin.jvm.functions.Function1 function142 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue8);
        androidx.compose.ui.Modifier matchParentSize2 = boxScopeInstance2.matchParentSize(androidx.compose.ui.Modifier.INSTANCE);
        startRestartGroup.startReplaceableGroup(1087142612);
        z6 = ((i4 & 112) != 32) | (i5 != 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(viewModel)));
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!z6) {
        }
        rememberedValue9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.c(function0, viewModel, null);
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceableGroup();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(G2, L2, a22, a32, b22, function15, function122, viewVisibilityTracker, function132, function142, androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(matchParentSize2, unit2, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9), startRestartGroup, i4 & 29360128, 0, 0);
        startRestartGroup.startReplaceableGroup(1087152169);
        if (function72 != null) {
        }
        composer2.endReplaceableGroup();
        if (b((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState5)) {
        }
        composer2.startReplaceableGroup(1087171337);
        if (function7 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(1087179946);
        if (function5 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(1087182738);
        if (function6 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j c(androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> state) {
        return state.getValue();
    }

    public static final boolean b(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final boolean b(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, androidx.compose.runtime.MutableState mutableState, boolean z) {
        kVar.d(z);
        b(mutableState, z);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, boolean z) {
        if (z) {
            kVar.D();
        } else {
            kVar.F();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, androidx.compose.runtime.MutableState mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        kVar.a(it);
        a((androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState, it);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(androidx.compose.runtime.MutableState mutableState, boolean z) {
        a((androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean>>) mutableState, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean>) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m(java.lang.Boolean.valueOf(z)));
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        kVar.a(button);
        kVar.a(buttonType);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.jvm.functions.Function6<androidx.compose.foundation.layout.BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.ui.Alignment alignment, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1318345093);
        if ((i2 & 1) != 0) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getBottomStart();
        }
        if ((i2 & 2) != 0) {
            paddingValues = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1318345093, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon (Linear.kt:148)");
        }
        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -903645392, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.g(alignment, paddingValues));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long> a(androidx.compose.runtime.State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long>> state) {
        return state.getValue();
    }

    public static final void a(androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        mutableState.setValue(iVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> a(androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean>> mutableState) {
        return mutableState.getValue();
    }

    public static final void a(androidx.compose.runtime.MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean>> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Boolean> mVar) {
        mutableState.setValue(mVar);
    }
}
