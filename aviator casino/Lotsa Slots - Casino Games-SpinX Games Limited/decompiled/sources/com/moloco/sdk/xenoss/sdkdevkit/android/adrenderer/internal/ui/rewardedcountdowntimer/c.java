package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

/* loaded from: classes5.dex */
public final class c {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerKt$RewardedCountDownTimer$1$1", f = "RewardedCountDownTimer.kt", i = {0, 1}, l = {90, 98}, m = "invokeSuspend", n = {"currentSeconds", "currentSeconds"}, s = {"I$0", "I$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7655a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> e;
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> f;
        public final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Integer> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<java.lang.Integer> mutableState, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = animatable;
            this.f = function0;
            this.g = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0082, code lost:
        
            if (r14.c != 0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
        
            r14.f.invoke();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
        
            if (r14.c != 0) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            ?? r1;
            ?? r12;
            int i;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            try {
                if (i2 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int b = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(this.g);
                    r1 = this.c;
                    float a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a((int) r1, this.d);
                    try {
                        if (r1 < b) {
                            int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtLeast(b - r1, 0) * 1000, 0);
                            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.e;
                            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(a2);
                            androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(coerceAtLeast, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
                            this.f7655a = r1;
                            this.b = 1;
                            if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, boxFloat, tween$default, null, null, this, 12, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = r1;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(this.g, i);
                        } else {
                            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable2 = this.e;
                            java.lang.Float boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(a2);
                            this.f7655a = r1;
                            this.b = 2;
                            if (animatable2.snapTo(boxFloat2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = r1;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(this.g, i);
                        }
                    } catch (java.util.concurrent.CancellationException unused) {
                        r12 = r1;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(this.g, (int) r12);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(this.g, (int) r1);
                        if (this.c == 0) {
                            this.f.invoke();
                        }
                        throw th;
                    }
                } else if (i2 == 1) {
                    i = this.f7655a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(this.g, i);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.f7655a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(this.g, i);
                }
            } catch (java.util.concurrent.CancellationException unused2) {
                r12 = coroutine_suspended;
            } catch (java.lang.Throwable th2) {
                th = th2;
                r1 = coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerKt$RewardedCountDownTimer$2$1", f = "RewardedCountDownTimer.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7656a;
        public final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> b;
        public final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b> continuation) {
            super(2, continuation);
            this.b = animatable;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7656a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(this.c)) {
                    androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.b;
                    this.f7656a = 1;
                    if (animatable.stop(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$c, reason: collision with other inner class name */
    public static final class C0273c implements androidx.compose.runtime.DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.LifecycleOwner f7657a;
        public final /* synthetic */ androidx.lifecycle.LifecycleEventObserver b;

        public C0273c(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver) {
            this.f7657a = lifecycleOwner;
            this.b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f7657a.getLifecycle().removeObserver(this.b);
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7658a;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f7658a = iArr;
        }
    }

    public static final kotlin.Unit a(long j, long j2, androidx.compose.ui.Modifier modifier, float f, float f2, kotlin.jvm.functions.Function0 function0, androidx.lifecycle.LifecycleOwner lifecycleOwner, int i, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        a(j, j2, modifier, f, f2, function0, lifecycleOwner, i, i2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final long j2, androidx.compose.ui.Modifier modifier, float f, float f2, final kotlin.jvm.functions.Function0<kotlin.Unit> onTimerFinish, androidx.lifecycle.LifecycleOwner lifecycleOwner, final int i, final int i2, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        final androidx.compose.ui.Modifier modifier2;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        androidx.compose.ui.Modifier modifier3;
        float f5;
        int i9;
        boolean changed;
        java.lang.Object rememberedValue;
        boolean z;
        java.lang.Object rememberedValue2;
        int i10;
        java.lang.Object rememberedValue3;
        androidx.compose.runtime.Composer.Companion companion;
        androidx.compose.animation.core.Animatable animatable;
        kotlin.UInt m10890boximpl;
        boolean changed2;
        java.lang.Object rememberedValue4;
        kotlin.UInt uInt;
        androidx.compose.animation.core.Animatable animatable2;
        int i11;
        kotlin.coroutines.Continuation continuation;
        boolean changed3;
        java.lang.Object rememberedValue5;
        boolean changed4;
        java.lang.Object rememberedValue6;
        java.lang.Object rememberedValue7;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        boolean changedInstance;
        java.lang.Object rememberedValue8;
        java.lang.String m10868m;
        java.lang.Object rememberedValue9;
        final float f6;
        androidx.lifecycle.LifecycleOwner lifecycleOwner3;
        final float f7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-562864551);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(j) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        int i14 = i4 & 4;
        if (i14 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                f3 = f;
                i5 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    f4 = f2;
                    i5 |= startRestartGroup.changed(f4) ? 16384 : 8192;
                    i8 = i4 & 32;
                    int i15 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    if (i8 == 0) {
                        if ((196608 & i3) == 0) {
                            i15 = startRestartGroup.changedInstance(onTimerFinish) ? 131072 : 65536;
                        }
                        if ((1572864 & i3) == 0) {
                            if ((i4 & 64) == 0 && startRestartGroup.changedInstance(lifecycleOwner)) {
                                i13 = 1048576;
                                i5 |= i13;
                            }
                            i13 = 524288;
                            i5 |= i13;
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                        }
                        if ((i4 & 256) == 0) {
                            i12 = (100663296 & i3) == 0 ? startRestartGroup.changed(i2) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                            if ((38347923 & i5) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    androidx.compose.ui.Modifier modifier4 = i14 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                    float m4478constructorimpl = i6 == 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(7) : f3;
                                    float m4478constructorimpl2 = i7 == 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(30) : f4;
                                    if ((i4 & 64) == 0) {
                                        lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                                        i5 &= -3670017;
                                    } else {
                                        lifecycleOwner2 = lifecycleOwner;
                                    }
                                    modifier3 = modifier4;
                                    f5 = m4478constructorimpl;
                                    f4 = m4478constructorimpl2;
                                    i9 = i5;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    lifecycleOwner2 = lifecycleOwner;
                                    i9 = i5;
                                    f5 = f3;
                                    modifier3 = modifier2;
                                }
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-562864551, i9, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimer (RewardedCountDownTimer.kt:66)");
                                }
                                startRestartGroup.startReplaceableGroup(1215960328);
                                changed = startRestartGroup.changed(lifecycleOwner2);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    androidx.compose.runtime.MutableState mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                    rememberedValue = mutableStateOf$default;
                                }
                                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                                startRestartGroup.endReplaceableGroup();
                                java.lang.Object[] objArr = new java.lang.Object[0];
                                startRestartGroup.startReplaceableGroup(1215963943);
                                int i16 = 234881024 & i9;
                                final androidx.lifecycle.LifecycleOwner lifecycleOwner4 = lifecycleOwner2;
                                z = i16 != 67108864;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                i10 = i9;
                                androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                                startRestartGroup.startReplaceableGroup(1215966697);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                companion = androidx.compose.runtime.Composer.INSTANCE;
                                if (rememberedValue3 != companion.getEmpty()) {
                                    rememberedValue3 = androidx.compose.animation.core.AnimatableKt.Animatable$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i2, i), 0.0f, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                                startRestartGroup.endReplaceableGroup();
                                m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                                startRestartGroup.startReplaceableGroup(1215977122);
                                changed2 = startRestartGroup.changed(mutableState2) | (i16 != 67108864) | ((29360128 & i10) != 8388608) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) != 131072);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue4 == companion.getEmpty()) {
                                    uInt = m10890boximpl;
                                    animatable2 = animatable;
                                    i11 = i10;
                                    continuation = null;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2, i, animatable, onTimerFinish, mutableState2, null);
                                    startRestartGroup.updateRememberedValue(aVar);
                                    rememberedValue4 = aVar;
                                } else {
                                    uInt = m10890boximpl;
                                    animatable2 = animatable;
                                    i11 = i10;
                                    continuation = null;
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 24) & 14);
                                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState));
                                startRestartGroup.startReplaceableGroup(1216010844);
                                final androidx.compose.animation.core.Animatable animatable3 = animatable2;
                                changed3 = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(animatable3);
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue5 == companion.getEmpty()) {
                                    rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(animatable3, mutableState, continuation);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(1216015257);
                                changed4 = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(animatable3) | startRestartGroup.changedInstance(lifecycleOwner4);
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (!changed4 || rememberedValue6 == companion.getEmpty()) {
                                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(androidx.lifecycle.LifecycleOwner.this, animatable3, mutableState, (androidx.compose.runtime.DisposableEffectScope) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner4, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 18) & 14);
                                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                androidx.compose.ui.Modifier m211backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(modifier3, f4), androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(20))), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                                startRestartGroup.startReplaceableGroup(1216045352);
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (rememberedValue7 == companion.getEmpty()) {
                                    final java.lang.String str = "timer_container";
                                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, continuation);
                                startRestartGroup.startReplaceableGroup(733328855);
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion2.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default);
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
                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                                startRestartGroup.startReplaceableGroup(1205651458);
                                changedInstance = ((i11 & 14) != 4) | ((i11 & 7168) != 2048) | startRestartGroup.changedInstance(animatable3) | ((i11 & 112) != 32);
                                rememberedValue8 = startRestartGroup.rememberedValue();
                                if (!changedInstance || rememberedValue8 == companion.getEmpty()) {
                                    final float f8 = f5;
                                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(j, f8, animatable3, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, 6);
                                m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(i2, 10);
                                androidx.compose.ui.text.TextStyle button = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).getButton();
                                long d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                                int m4360getCentere0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk();
                                startRestartGroup.startReplaceableGroup(1205686792);
                                rememberedValue9 = startRestartGroup.rememberedValue();
                                if (rememberedValue9 == companion.getEmpty()) {
                                    final java.lang.String str2 = "countdown_timer_text";
                                    rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(str2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue9);
                                }
                                startRestartGroup.endReplaceableGroup();
                                float f9 = f4;
                                androidx.compose.ui.Modifier modifier5 = modifier3;
                                androidx.compose.material.TextKt.m1582TextfLXpl1I(m10868m, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion3, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null), j2, d2, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4360getCentere0LSkKk), 0L, 0, false, 1, null, button, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 24048);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier5;
                                f6 = f9;
                                lifecycleOwner3 = lifecycleOwner4;
                                f7 = f5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                lifecycleOwner3 = lifecycleOwner;
                                f7 = f3;
                                f6 = f4;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.lifecycle.LifecycleOwner lifecycleOwner5 = lifecycleOwner3;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(j, j2, modifier2, f7, f6, onTimerFinish, lifecycleOwner5, i, i2, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= i12;
                        if ((38347923 & i5) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i4 & 64) == 0) {
                        }
                        modifier3 = modifier4;
                        f5 = m4478constructorimpl;
                        f4 = m4478constructorimpl2;
                        i9 = i5;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(1215960328);
                        changed = startRestartGroup.changed(lifecycleOwner2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        androidx.compose.runtime.MutableState mutableStateOf$default2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                        startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                        rememberedValue = mutableStateOf$default2;
                        final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        java.lang.Object[] objArr2 = new java.lang.Object[0];
                        startRestartGroup.startReplaceableGroup(1215963943);
                        int i162 = 234881024 & i9;
                        final androidx.lifecycle.LifecycleOwner lifecycleOwner42 = lifecycleOwner2;
                        if (i162 != 67108864) {
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        i10 = i9;
                        androidx.compose.runtime.MutableState mutableState22 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                        startRestartGroup.startReplaceableGroup(1215966697);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        companion = androidx.compose.runtime.Composer.INSTANCE;
                        if (rememberedValue3 != companion.getEmpty()) {
                        }
                        animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                        startRestartGroup.endReplaceableGroup();
                        m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                        startRestartGroup.startReplaceableGroup(1215977122);
                        changed2 = startRestartGroup.changed(mutableState22) | (i162 != 67108864) | ((29360128 & i10) != 8388608) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) != 131072);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed2) {
                        }
                        uInt = m10890boximpl;
                        animatable2 = animatable;
                        i11 = i10;
                        continuation = null;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2, i, animatable, onTimerFinish, mutableState22, null);
                        startRestartGroup.updateRememberedValue(aVar2);
                        rememberedValue4 = aVar2;
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 24) & 14);
                        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(a((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState3));
                        startRestartGroup.startReplaceableGroup(1216010844);
                        final androidx.compose.animation.core.Animatable animatable32 = animatable2;
                        changed3 = startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(animatable32);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(animatable32, mutableState3, continuation);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(1216015257);
                        changed4 = startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(animatable32) | startRestartGroup.changedInstance(lifecycleOwner42);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(androidx.lifecycle.LifecycleOwner.this, animatable32, mutableState3, (androidx.compose.runtime.DisposableEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner42, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 18) & 14);
                        androidx.compose.ui.Alignment center2 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                        androidx.compose.ui.Modifier m211backgroundbw27NRU2 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(modifier3, f4), androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(20))), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                        startRestartGroup.startReplaceableGroup(1216045352);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (rememberedValue7 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.ui.Modifier semantics$default2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU2, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, continuation);
                        startRestartGroup.startReplaceableGroup(733328855);
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.node.ComposeUiNode.Companion companion22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion22.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default2);
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
                        androidx.compose.ui.Modifier.Companion companion32 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null);
                        startRestartGroup.startReplaceableGroup(1205651458);
                        changedInstance = ((i11 & 14) != 4) | ((i11 & 7168) != 2048) | startRestartGroup.changedInstance(animatable32) | ((i11 & 112) != 32);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        final float f82 = f5;
                        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(j, f82, animatable32, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default2, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, 6);
                        m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(i2, 10);
                        androidx.compose.ui.text.TextStyle button2 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).getButton();
                        long d22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        int m4360getCentere0LSkKk2 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk();
                        startRestartGroup.startReplaceableGroup(1205686792);
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (rememberedValue9 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        float f92 = f4;
                        androidx.compose.ui.Modifier modifier52 = modifier3;
                        androidx.compose.material.TextKt.m1582TextfLXpl1I(m10868m, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion32, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null), j2, d22, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4360getCentere0LSkKk2), 0L, 0, false, 1, null, button2, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 24048);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier52;
                        f6 = f92;
                        lifecycleOwner3 = lifecycleOwner42;
                        f7 = f5;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i5 |= i15;
                    if ((1572864 & i3) == 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if ((i4 & 256) == 0) {
                    }
                    i5 |= i12;
                    if ((38347923 & i5) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i4 & 64) == 0) {
                    }
                    modifier3 = modifier4;
                    f5 = m4478constructorimpl;
                    f4 = m4478constructorimpl2;
                    i9 = i5;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(1215960328);
                    changed = startRestartGroup.changed(lifecycleOwner2);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    androidx.compose.runtime.MutableState mutableStateOf$default22 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default22);
                    rememberedValue = mutableStateOf$default22;
                    final androidx.compose.runtime.MutableState mutableState32 = (androidx.compose.runtime.MutableState) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    java.lang.Object[] objArr22 = new java.lang.Object[0];
                    startRestartGroup.startReplaceableGroup(1215963943);
                    int i1622 = 234881024 & i9;
                    final androidx.lifecycle.LifecycleOwner lifecycleOwner422 = lifecycleOwner2;
                    if (i1622 != 67108864) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    i10 = i9;
                    androidx.compose.runtime.MutableState mutableState222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr22, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                    startRestartGroup.startReplaceableGroup(1215966697);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    companion = androidx.compose.runtime.Composer.INSTANCE;
                    if (rememberedValue3 != companion.getEmpty()) {
                    }
                    animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                    startRestartGroup.endReplaceableGroup();
                    m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                    startRestartGroup.startReplaceableGroup(1215977122);
                    changed2 = startRestartGroup.changed(mutableState222) | (i1622 != 67108864) | ((29360128 & i10) != 8388608) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) != 131072);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    uInt = m10890boximpl;
                    animatable2 = animatable;
                    i11 = i10;
                    continuation = null;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a aVar22 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2, i, animatable, onTimerFinish, mutableState222, null);
                    startRestartGroup.updateRememberedValue(aVar22);
                    rememberedValue4 = aVar22;
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 24) & 14);
                    java.lang.Boolean valueOf22 = java.lang.Boolean.valueOf(a((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState32));
                    startRestartGroup.startReplaceableGroup(1216010844);
                    final androidx.compose.animation.core.Animatable animatable322 = animatable2;
                    changed3 = startRestartGroup.changed(mutableState32) | startRestartGroup.changedInstance(animatable322);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(animatable322, mutableState32, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(1216015257);
                    changed4 = startRestartGroup.changed(mutableState32) | startRestartGroup.changedInstance(animatable322) | startRestartGroup.changedInstance(lifecycleOwner422);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(androidx.lifecycle.LifecycleOwner.this, animatable322, mutableState32, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner422, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 18) & 14);
                    androidx.compose.ui.Alignment center22 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                    androidx.compose.ui.Modifier m211backgroundbw27NRU22 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(modifier3, f4), androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(20))), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                    startRestartGroup.startReplaceableGroup(1216045352);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.Modifier semantics$default22 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU22, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, continuation);
                    startRestartGroup.startReplaceableGroup(733328855);
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.node.ComposeUiNode.Companion companion222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = companion222.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default22);
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = companion222.getSetCompositeKeyHash();
                    if (!m1641constructorimpl.getInserting()) {
                    }
                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion322 = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion322, 0.0f, 1, null);
                    startRestartGroup.startReplaceableGroup(1205651458);
                    changedInstance = ((i11 & 14) != 4) | ((i11 & 7168) != 2048) | startRestartGroup.changedInstance(animatable322) | ((i11 & 112) != 32);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    final float f822 = f5;
                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(j, f822, animatable322, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default22, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, 6);
                    m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(i2, 10);
                    androidx.compose.ui.text.TextStyle button22 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).getButton();
                    long d222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                    int m4360getCentere0LSkKk22 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk();
                    startRestartGroup.startReplaceableGroup(1205686792);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    float f922 = f4;
                    androidx.compose.ui.Modifier modifier522 = modifier3;
                    androidx.compose.material.TextKt.m1582TextfLXpl1I(m10868m, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion322, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null), j2, d222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4360getCentere0LSkKk22), 0L, 0, false, 1, null, button22, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 24048);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier522;
                    f6 = f922;
                    lifecycleOwner3 = lifecycleOwner422;
                    f7 = f5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f4 = f2;
                i8 = i4 & 32;
                int i152 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                if (i8 == 0) {
                }
                i5 |= i152;
                if ((1572864 & i3) == 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if ((i4 & 256) == 0) {
                }
                i5 |= i12;
                if ((38347923 & i5) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i14 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                modifier3 = modifier4;
                f5 = m4478constructorimpl;
                f4 = m4478constructorimpl2;
                i9 = i5;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(1215960328);
                changed = startRestartGroup.changed(lifecycleOwner2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                androidx.compose.runtime.MutableState mutableStateOf$default222 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default222);
                rememberedValue = mutableStateOf$default222;
                final androidx.compose.runtime.MutableState mutableState322 = (androidx.compose.runtime.MutableState) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                java.lang.Object[] objArr222 = new java.lang.Object[0];
                startRestartGroup.startReplaceableGroup(1215963943);
                int i16222 = 234881024 & i9;
                final androidx.lifecycle.LifecycleOwner lifecycleOwner4222 = lifecycleOwner2;
                if (i16222 != 67108864) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                i10 = i9;
                androidx.compose.runtime.MutableState mutableState2222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                startRestartGroup.startReplaceableGroup(1215966697);
                rememberedValue3 = startRestartGroup.rememberedValue();
                companion = androidx.compose.runtime.Composer.INSTANCE;
                if (rememberedValue3 != companion.getEmpty()) {
                }
                animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                startRestartGroup.endReplaceableGroup();
                m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                startRestartGroup.startReplaceableGroup(1215977122);
                changed2 = startRestartGroup.changed(mutableState2222) | (i16222 != 67108864) | ((29360128 & i10) != 8388608) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) != 131072);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                uInt = m10890boximpl;
                animatable2 = animatable;
                i11 = i10;
                continuation = null;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a aVar222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2, i, animatable, onTimerFinish, mutableState2222, null);
                startRestartGroup.updateRememberedValue(aVar222);
                rememberedValue4 = aVar222;
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 24) & 14);
                java.lang.Boolean valueOf222 = java.lang.Boolean.valueOf(a((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState322));
                startRestartGroup.startReplaceableGroup(1216010844);
                final androidx.compose.animation.core.Animatable animatable3222 = animatable2;
                changed3 = startRestartGroup.changed(mutableState322) | startRestartGroup.changedInstance(animatable3222);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(animatable3222, mutableState322, continuation);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(1216015257);
                changed4 = startRestartGroup.changed(mutableState322) | startRestartGroup.changedInstance(animatable3222) | startRestartGroup.changedInstance(lifecycleOwner4222);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(androidx.lifecycle.LifecycleOwner.this, animatable3222, mutableState322, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner4222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 18) & 14);
                androidx.compose.ui.Alignment center222 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                androidx.compose.ui.Modifier m211backgroundbw27NRU222 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(modifier3, f4), androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(20))), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                startRestartGroup.startReplaceableGroup(1216045352);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier semantics$default222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU222, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, continuation);
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.node.ComposeUiNode.Companion companion2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = companion2222.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default222);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy222, companion2222.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap222, companion2222.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = companion2222.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion3222 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.Modifier fillMaxSize$default222 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion3222, 0.0f, 1, null);
                startRestartGroup.startReplaceableGroup(1205651458);
                changedInstance = ((i11 & 14) != 4) | ((i11 & 7168) != 2048) | startRestartGroup.changedInstance(animatable3222) | ((i11 & 112) != 32);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                final float f8222 = f5;
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(j, f8222, animatable3222, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default222, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, 6);
                m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(i2, 10);
                androidx.compose.ui.text.TextStyle button222 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).getButton();
                long d2222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                int m4360getCentere0LSkKk222 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk();
                startRestartGroup.startReplaceableGroup(1205686792);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                float f9222 = f4;
                androidx.compose.ui.Modifier modifier5222 = modifier3;
                androidx.compose.material.TextKt.m1582TextfLXpl1I(m10868m, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion3222, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null), j2, d2222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4360getCentere0LSkKk222), 0L, 0, false, 1, null, button222, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 24048);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier5222;
                f6 = f9222;
                lifecycleOwner3 = lifecycleOwner4222;
                f7 = f5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            f4 = f2;
            i8 = i4 & 32;
            int i1522 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if (i8 == 0) {
            }
            i5 |= i1522;
            if ((1572864 & i3) == 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if ((i4 & 256) == 0) {
            }
            i5 |= i12;
            if ((38347923 & i5) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i14 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            modifier3 = modifier4;
            f5 = m4478constructorimpl;
            f4 = m4478constructorimpl2;
            i9 = i5;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(1215960328);
            changed = startRestartGroup.changed(lifecycleOwner2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            androidx.compose.runtime.MutableState mutableStateOf$default2222 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default2222);
            rememberedValue = mutableStateOf$default2222;
            final androidx.compose.runtime.MutableState mutableState3222 = (androidx.compose.runtime.MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            java.lang.Object[] objArr2222 = new java.lang.Object[0];
            startRestartGroup.startReplaceableGroup(1215963943);
            int i162222 = 234881024 & i9;
            final androidx.lifecycle.LifecycleOwner lifecycleOwner42222 = lifecycleOwner2;
            if (i162222 != 67108864) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            i10 = i9;
            androidx.compose.runtime.MutableState mutableState22222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
            startRestartGroup.startReplaceableGroup(1215966697);
            rememberedValue3 = startRestartGroup.rememberedValue();
            companion = androidx.compose.runtime.Composer.INSTANCE;
            if (rememberedValue3 != companion.getEmpty()) {
            }
            animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            m10890boximpl = kotlin.UInt.m10890boximpl(i2);
            startRestartGroup.startReplaceableGroup(1215977122);
            changed2 = startRestartGroup.changed(mutableState22222) | (i162222 != 67108864) | ((29360128 & i10) != 8388608) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) != 131072);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            uInt = m10890boximpl;
            animatable2 = animatable;
            i11 = i10;
            continuation = null;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a aVar2222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2, i, animatable, onTimerFinish, mutableState22222, null);
            startRestartGroup.updateRememberedValue(aVar2222);
            rememberedValue4 = aVar2222;
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 24) & 14);
            java.lang.Boolean valueOf2222 = java.lang.Boolean.valueOf(a((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState3222));
            startRestartGroup.startReplaceableGroup(1216010844);
            final androidx.compose.animation.core.Animatable animatable32222 = animatable2;
            changed3 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changedInstance(animatable32222);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(animatable32222, mutableState3222, continuation);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf2222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1216015257);
            changed4 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changedInstance(animatable32222) | startRestartGroup.changedInstance(lifecycleOwner42222);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(androidx.lifecycle.LifecycleOwner.this, animatable32222, mutableState3222, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner42222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 18) & 14);
            androidx.compose.ui.Alignment center2222 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            androidx.compose.ui.Modifier m211backgroundbw27NRU2222 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(modifier3, f4), androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(20))), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
            startRestartGroup.startReplaceableGroup(1216045352);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier semantics$default2222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU2222, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, continuation);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = companion22222.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default2222);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy2222, companion22222.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2222, companion22222.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2222 = companion22222.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            modifierMaterializerOf2222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion32222 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default2222 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion32222, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1205651458);
            changedInstance = ((i11 & 14) != 4) | ((i11 & 7168) != 2048) | startRestartGroup.changedInstance(animatable32222) | ((i11 & 112) != 32);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            final float f82222 = f5;
            rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(j, f82222, animatable32222, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default2222, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, 6);
            m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(i2, 10);
            androidx.compose.ui.text.TextStyle button2222 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).getButton();
            long d22222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
            int m4360getCentere0LSkKk2222 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk();
            startRestartGroup.startReplaceableGroup(1205686792);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            float f92222 = f4;
            androidx.compose.ui.Modifier modifier52222 = modifier3;
            androidx.compose.material.TextKt.m1582TextfLXpl1I(m10868m, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion32222, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null), j2, d22222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4360getCentere0LSkKk2222), 0L, 0, false, 1, null, button2222, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 24048);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier52222;
            f6 = f92222;
            lifecycleOwner3 = lifecycleOwner42222;
            f7 = f5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        f4 = f2;
        i8 = i4 & 32;
        int i15222 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if (i8 == 0) {
        }
        i5 |= i15222;
        if ((1572864 & i3) == 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if ((i4 & 256) == 0) {
        }
        i5 |= i12;
        if ((38347923 & i5) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        modifier3 = modifier4;
        f5 = m4478constructorimpl;
        f4 = m4478constructorimpl2;
        i9 = i5;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(1215960328);
        changed = startRestartGroup.changed(lifecycleOwner2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        androidx.compose.runtime.MutableState mutableStateOf$default22222 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default22222);
        rememberedValue = mutableStateOf$default22222;
        final androidx.compose.runtime.MutableState mutableState32222 = (androidx.compose.runtime.MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        java.lang.Object[] objArr22222 = new java.lang.Object[0];
        startRestartGroup.startReplaceableGroup(1215963943);
        int i1622222 = 234881024 & i9;
        final androidx.lifecycle.LifecycleOwner lifecycleOwner422222 = lifecycleOwner2;
        if (i1622222 != 67108864) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        i10 = i9;
        androidx.compose.runtime.MutableState mutableState222222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr22222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
        startRestartGroup.startReplaceableGroup(1215966697);
        rememberedValue3 = startRestartGroup.rememberedValue();
        companion = androidx.compose.runtime.Composer.INSTANCE;
        if (rememberedValue3 != companion.getEmpty()) {
        }
        animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        m10890boximpl = kotlin.UInt.m10890boximpl(i2);
        startRestartGroup.startReplaceableGroup(1215977122);
        changed2 = startRestartGroup.changed(mutableState222222) | (i1622222 != 67108864) | ((29360128 & i10) != 8388608) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) != 131072);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        uInt = m10890boximpl;
        animatable2 = animatable;
        i11 = i10;
        continuation = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a aVar22222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(i2, i, animatable, onTimerFinish, mutableState222222, null);
        startRestartGroup.updateRememberedValue(aVar22222);
        rememberedValue4 = aVar22222;
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 24) & 14);
        java.lang.Boolean valueOf22222 = java.lang.Boolean.valueOf(a((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState32222));
        startRestartGroup.startReplaceableGroup(1216010844);
        final androidx.compose.animation.core.Animatable animatable322222 = animatable2;
        changed3 = startRestartGroup.changed(mutableState32222) | startRestartGroup.changedInstance(animatable322222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.b(animatable322222, mutableState32222, continuation);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf22222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1216015257);
        changed4 = startRestartGroup.changed(mutableState32222) | startRestartGroup.changedInstance(animatable322222) | startRestartGroup.changedInstance(lifecycleOwner422222);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(androidx.lifecycle.LifecycleOwner.this, animatable322222, mutableState32222, (androidx.compose.runtime.DisposableEffectScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner422222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 18) & 14);
        androidx.compose.ui.Alignment center22222 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
        androidx.compose.ui.Modifier m211backgroundbw27NRU22222 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(modifier3, f4), androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(20))), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
        startRestartGroup.startReplaceableGroup(1216045352);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier semantics$default22222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU22222, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, continuation);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center22222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion companion222222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22222 = companion222222.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default22222);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy22222, companion222222.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22222, companion222222.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22222 = companion222222.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        modifierMaterializerOf22222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion322222 = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.Modifier fillMaxSize$default22222 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion322222, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(1205651458);
        changedInstance = ((i11 & 14) != 4) | ((i11 & 7168) != 2048) | startRestartGroup.changedInstance(animatable322222) | ((i11 & 112) != 32);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        final float f822222 = f5;
        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(j, f822222, animatable322222, j2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default22222, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, 6);
        m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(i2, 10);
        androidx.compose.ui.text.TextStyle button22222 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).getButton();
        long d222222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
        int m4360getCentere0LSkKk22222 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4360getCentere0LSkKk();
        startRestartGroup.startReplaceableGroup(1205686792);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (rememberedValue9 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        float f922222 = f4;
        androidx.compose.ui.Modifier modifier522222 = modifier3;
        androidx.compose.material.TextKt.m1582TextfLXpl1I(m10868m, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion322222, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null), j2, d222222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4360getCentere0LSkKk22222), 0L, 0, false, 1, null, button22222, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 24048);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier522222;
        f6 = f922222;
        lifecycleOwner3 = lifecycleOwner422222;
        f7 = f5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final kotlin.Unit b(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semantics, str);
        return kotlin.Unit.INSTANCE;
    }

    public static final int b(androidx.compose.runtime.MutableState<java.lang.Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void a(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final void a(androidx.compose.runtime.MutableState<java.lang.Integer> mutableState, int i) {
        mutableState.setValue(java.lang.Integer.valueOf(i));
    }

    public static final androidx.compose.runtime.MutableState a(int i) {
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Integer.valueOf(i), null, 2, null);
    }

    public static final androidx.compose.runtime.DisposableEffectResult a(androidx.lifecycle.LifecycleOwner lifecycleOwner, final androidx.compose.animation.core.Animatable animatable, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(androidx.compose.animation.core.Animatable.this, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.C0273c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final void a(androidx.compose.animation.core.Animatable animatable, androidx.compose.runtime.MutableState mutableState, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        int i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.d.f7658a[event.ordinal()];
        if (i == 1) {
            a((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState, false);
        } else if (i == 2 && ((java.lang.Number) animatable.getValue()).floatValue() > 0.0f) {
            a((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState, true);
        }
    }

    public static final kotlin.Unit a(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semantics, str);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(long j, float f, androidx.compose.animation.core.Animatable animatable, long j2, androidx.compose.ui.graphics.drawscope.DrawScope Canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long Size = androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.geometry.Size.m1940getWidthimpl(Canvas.mo2592getSizeNHjbRc()), androidx.compose.ui.geometry.Size.m1937getHeightimpl(Canvas.mo2592getSizeNHjbRc()));
        float f2 = Canvas.mo315toPx0680j_4(f);
        androidx.compose.ui.graphics.StrokeCap.Companion companion = androidx.compose.ui.graphics.StrokeCap.INSTANCE;
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2657drawArcyD3GUKo$default(Canvas, j, 360.0f, 360.0f, false, 0L, Size, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f2, 0.0f, companion.m2475getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((java.lang.Number) animatable.getValue()).floatValue() > 0.0f) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2657drawArcyD3GUKo$default(Canvas, j2, 270.0f, kotlin.ranges.RangesKt.coerceAtLeast(((java.lang.Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.geometry.Size.m1940getWidthimpl(Canvas.mo2592getSizeNHjbRc()), androidx.compose.ui.geometry.Size.m1937getHeightimpl(Canvas.mo2592getSizeNHjbRc())), 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(Canvas.mo315toPx0680j_4(f), 0.0f, companion.m2475getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final boolean a(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}
