package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

/* loaded from: classes5.dex */
public final class m {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastProgressBarKt$VastProgressBar$1$1", f = "VastProgressBar.kt", i = {}, l = {43, 45, 53}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7863a;
        public final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, float f, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a> continuation) {
            super(2, continuation);
            this.b = animatable;
            this.c = f;
            this.d = z;
            this.e = iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7863a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.b;
                java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.c);
                this.f7863a = 1;
                if (animatable.snapTo(boxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (!this.d || !(this.e instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c)) {
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable2 = this.b;
                this.f7863a = 3;
                if (animatable2.stop(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                return kotlin.Unit.INSTANCE;
            }
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable3 = this.b;
            java.lang.Float boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f);
            androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.c(this.e), 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
            this.f7863a = 2;
            if (androidx.compose.animation.core.Animatable.animateTo$default(animatable3, boxFloat2, tween$default, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlin.Unit a(int i, androidx.compose.runtime.Composer composer, int i2) {
        a(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final float b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        if (iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a) {
            return 100.0f;
        }
        if (iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) {
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) iVar).d() != 0) {
                return (float) (r5.c() / r5.d());
            }
        } else if (!(iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d) && !kotlin.jvm.internal.Intrinsics.areEqual(iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b.b)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return 0.0f;
    }

    public static final int c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        if (iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a) {
            return 0;
        }
        if (iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) iVar;
            if (cVar.d() == 0) {
                return 0;
            }
            return kotlin.ranges.RangesKt.coerceAtLeast((int) (cVar.d() - cVar.c()), 0);
        }
        if ((iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d) || kotlin.jvm.internal.Intrinsics.areEqual(iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b.b)) {
            return 0;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final kotlin.Unit a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, androidx.compose.ui.Modifier modifier, long j, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(z, iVar, modifier, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        if ((r30 & 8) != 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, androidx.compose.ui.Modifier modifier, long j, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        long j2;
        androidx.compose.ui.Modifier modifier3;
        float f;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer.Companion companion;
        float max;
        java.lang.Object rememberedValue2;
        boolean changedInstance;
        java.lang.Object rememberedValue3;
        float f2;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        boolean changedInstance2;
        java.lang.Object rememberedValue4;
        final androidx.compose.ui.Modifier modifier5;
        final long j3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(632891183);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(progress) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                j3 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (i6 != 0) {
                        modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).m1315getPrimary0d7_KjU();
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    final long j4 = j2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(632891183, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastProgressBar (VastProgressBar.kt:30)");
                    }
                    f = 4;
                    final float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    startRestartGroup.startReplaceableGroup(-1652713005);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = androidx.compose.runtime.Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a();
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 3072, 6);
                    max = java.lang.Math.max(b(progress), a((androidx.compose.runtime.MutableState<java.lang.Float>) mutableState));
                    startRestartGroup.startReplaceableGroup(-1652708774);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = androidx.compose.animation.core.AnimatableKt.Animatable$default(max, 0.0f, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue2;
                    startRestartGroup.endReplaceableGroup();
                    a((androidx.compose.runtime.MutableState<java.lang.Float>) mutableState, ((java.lang.Number) animatable.getValue()).floatValue());
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
                    startRestartGroup.startReplaceableGroup(-1652703908);
                    changedInstance = startRestartGroup.changedInstance(animatable) | startRestartGroup.changed(max) | ((i3 & 14) != 4) | ((i3 & 112) != 32);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue3 == companion.getEmpty()) {
                        f2 = f;
                        i4 = i3;
                        modifier4 = modifier3;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a(animatable, max, z, progress, null);
                        startRestartGroup.updateRememberedValue(aVar);
                        rememberedValue3 = aVar;
                    } else {
                        f2 = f;
                        i4 = i3;
                        modifier4 = modifier3;
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(progress, valueOf, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, ((i4 >> 3) & 14) | ((i4 << 3) & 112));
                    androidx.compose.ui.Modifier m603height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(modifier4, androidx.compose.ui.unit.Dp.m4478constructorimpl(f2));
                    startRestartGroup.startReplaceableGroup(-1652687792);
                    changedInstance2 = startRestartGroup.changedInstance(animatable) | startRestartGroup.changed(m4478constructorimpl) | ((((i4 & 7168) ^ 3072) <= 2048 && startRestartGroup.changed(j4)) || (i4 & 3072) == 2048);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a(androidx.compose.animation.core.Animatable.this, m4478constructorimpl, j4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.DrawModifierKt.drawBehind(m603height3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue4), startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j3 = j4;
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a(z, progress, modifier5, j3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        modifier3 = modifier2;
        final long j42 = j2;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        f = 4;
        final float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(f);
        java.lang.Object[] objArr2 = new java.lang.Object[0];
        startRestartGroup.startReplaceableGroup(-1652713005);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = androidx.compose.runtime.Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 3072, 6);
        max = java.lang.Math.max(b(progress), a((androidx.compose.runtime.MutableState<java.lang.Float>) mutableState2));
        startRestartGroup.startReplaceableGroup(-1652708774);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        final androidx.compose.animation.core.Animatable animatable2 = (androidx.compose.animation.core.Animatable) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        a((androidx.compose.runtime.MutableState<java.lang.Float>) mutableState2, ((java.lang.Number) animatable2.getValue()).floatValue());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(-1652703908);
        changedInstance = startRestartGroup.changedInstance(animatable2) | startRestartGroup.changed(max) | ((i3 & 14) != 4) | ((i3 & 112) != 32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        f2 = f;
        i4 = i3;
        modifier4 = modifier3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a(animatable2, max, z, progress, null);
        startRestartGroup.updateRememberedValue(aVar2);
        rememberedValue3 = aVar2;
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(progress, valueOf2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, ((i4 >> 3) & 14) | ((i4 << 3) & 112));
        androidx.compose.ui.Modifier m603height3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m603height3ABfNKs(modifier4, androidx.compose.ui.unit.Dp.m4478constructorimpl(f2));
        startRestartGroup.startReplaceableGroup(-1652687792);
        changedInstance2 = startRestartGroup.changedInstance(animatable2) | startRestartGroup.changed(m4478constructorimpl2) | ((((i4 & 7168) ^ 3072) <= 2048 && startRestartGroup.changed(j42)) || (i4 & 3072) == 2048);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a(androidx.compose.animation.core.Animatable.this, m4478constructorimpl2, j42, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.DrawModifierKt.drawBehind(m603height3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue4), startRestartGroup, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier5 = modifier4;
        j3 = j42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(androidx.compose.runtime.MutableState<java.lang.Float> mutableState, float f) {
        mutableState.setValue(java.lang.Float.valueOf(f));
    }

    public static final androidx.compose.runtime.MutableState a() {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(0.0f), null, 2, null);
    }

    public static final kotlin.Unit a(androidx.compose.animation.core.Animatable animatable, float f, long j, androidx.compose.ui.graphics.drawscope.DrawScope drawBehind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2674drawRoundRectuAw5IA$default(drawBehind, j, 0L, androidx.compose.ui.geometry.SizeKt.Size(((java.lang.Number) animatable.getValue()).floatValue() * androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawBehind.mo2592getSizeNHjbRc()), androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawBehind.mo2592getSizeNHjbRc())), androidx.compose.ui.geometry.CornerRadiusKt.CornerRadius(f, f), null, 0.0f, null, 0, 242, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1397199635);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1397199635, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Preview (VastProgressBar.kt:98)");
            }
            androidx.compose.material.MaterialThemeKt.MaterialTheme(null, null, null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e.f7845a.a(), startRestartGroup, 3072, 7);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float a(androidx.compose.runtime.MutableState<java.lang.Float> mutableState) {
        return mutableState.getValue().floatValue();
    }
}
