package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class v {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButtonKt$LifecycleAwareAdCountdownButton$1$1", f = "LifecycleAwareAdCountdownButton.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7666a;
        public final /* synthetic */ androidx.compose.runtime.State<kotlin.UInt> b;
        public final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> c;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$a$a, reason: collision with other inner class name */
        public static final class C0274a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> f7667a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0274a(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state) {
                this.f7667a = state;
            }

            public final java.lang.Object a(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.b(this.f7667a).invoke();
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                return a(((kotlin.UInt) obj).getData(), continuation);
            }
        }

        public static final class b implements kotlinx.coroutines.flow.Flow<kotlin.UInt> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.Flow f7668a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$a$b$a, reason: collision with other inner class name */
            public static final class C0275a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f7669a;

                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButtonKt$LifecycleAwareAdCountdownButton$1$1$invokeSuspend$$inlined$filter$1$2", f = "LifecycleAwareAdCountdownButton.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$a$b$a$a, reason: collision with other inner class name */
                public static final class C0276a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f7670a;
                    public int b;
                    public java.lang.Object c;
                    public java.lang.Object d;

                    public C0276a(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f7670a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.b.C0275a.this.emit(null, this);
                    }
                }

                public C0275a(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.f7669a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.b.C0275a.C0276a c0276a;
                    int i;
                    if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.b.C0275a.C0276a) {
                        c0276a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.b.C0275a.C0276a) continuation;
                        int i2 = c0276a.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0276a.b = i2 - Integer.MIN_VALUE;
                            java.lang.Object obj2 = c0276a.f7670a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c0276a.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f7669a;
                                if (((kotlin.UInt) obj).getData() == 0) {
                                    c0276a.b = 1;
                                    if (flowCollector.emit(obj, c0276a) == coroutine_suspended) {
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
                    c0276a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.b.C0275a.C0276a(continuation);
                    java.lang.Object obj22 = c0276a.f7670a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0276a.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            public b(kotlinx.coroutines.flow.Flow flow) {
                this.f7668a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.UInt> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = this.f7668a.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.b.C0275a(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.compose.runtime.State<kotlin.UInt> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a> continuation) {
            super(2, continuation);
            this.b = state;
            this.c = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7666a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.runtime.State<kotlin.UInt> state = this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.b(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.a(androidx.compose.runtime.State.this);
                    }
                }));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.C0274a c0274a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a.C0274a(this.c);
                this.f7666a = 1;
                if (bVar.collect(c0274a, this) == coroutine_suspended) {
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

        public static final kotlin.UInt a(androidx.compose.runtime.State state) {
            return kotlin.UInt.m10890boximpl(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a(state));
        }
    }

    public static final kotlin.Unit a(androidx.compose.foundation.layout.BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function11 function11, boolean z3, kotlinx.coroutines.flow.Flow flow, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(boxScope, mVar, z, z2, function0, function02, function1, function11, z3, flow, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> b(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state) {
        return state.getValue();
    }

    public static final void a(final androidx.compose.foundation.layout.BoxScope boxScope, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<kotlin.UInt> initialSecondsLeft, final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> onCountdownFinished, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, final kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> onButtonRendered, final kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> basedOnAdCountdownButton, final boolean z3, kotlinx.coroutines.flow.Flow<java.lang.Boolean> flow, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final kotlinx.coroutines.flow.Flow<java.lang.Boolean> flow2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialSecondsLeft, "initialSecondsLeft");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCountdownFinished, "onCountdownFinished");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basedOnAdCountdownButton, "basedOnAdCountdownButton");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1211286303);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(initialSecondsLeft) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onCountdownFinished) ? 16384 : 8192;
        }
        if ((i2 & 16) != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 131072 : 65536;
        }
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(onButtonRendered) ? 1048576 : 524288;
        }
        if ((i2 & 64) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(basedOnAdCountdownButton) ? 8388608 : 4194304;
        }
        if ((i2 & 128) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z3) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(flow) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            flow2 = flow;
            composer2 = startRestartGroup;
        } else {
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> flow3 = i4 != 0 ? null : flow;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1211286303, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButton (LifecycleAwareAdCountdownButton.kt:35)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            androidx.compose.runtime.Composer.Companion companion = androidx.compose.runtime.Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1117957914);
            boolean changed = ((i3 & 112) == 32) | startRestartGroup.changed(flow3);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a(initialSecondsLeft.a().getData(), coroutineScope, flow3);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i5 = i3;
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> flow4 = flow3;
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle((kotlinx.coroutines.flow.StateFlow) rememberedValue2, (androidx.lifecycle.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onCountdownFinished, startRestartGroup, (i5 >> 12) & 14);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(1117966956);
            boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle) | startRestartGroup.changed(rememberUpdatedState);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a(collectAsStateWithLifecycle, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z2);
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z);
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z3);
            kotlin.UInt a2 = initialSecondsLeft.a();
            kotlin.UInt m10890boximpl = kotlin.UInt.m10890boximpl(a(collectAsStateWithLifecycle));
            kotlin.jvm.functions.Function0<kotlin.Unit> b = b(rememberUpdatedState);
            int i6 = i5 >> 6;
            composer2 = startRestartGroup;
            basedOnAdCountdownButton.invoke(boxScope, valueOf, valueOf2, onClick, onButtonRendered, valueOf3, a2, m10890boximpl, b, composer2, java.lang.Integer.valueOf((i5 & 14) | (i6 & 112) | (i5 & 896) | (i6 & 7168) | (i6 & 57344) | ((i5 >> 9) & 458752) | ((i5 << 6) & 1879048192)));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            flow2 = flow4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v.a(androidx.compose.foundation.layout.BoxScope.this, initialSecondsLeft, z, z2, onCountdownFinished, onClick, onButtonRendered, basedOnAdCountdownButton, z3, flow2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final int a(androidx.compose.runtime.State<kotlin.UInt> state) {
        return state.getValue().getData();
    }
}
