package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

/* loaded from: classes5.dex */
public final class b {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$1$1", f = "RewardedCountDownTimerCustom.kt", i = {0, 1}, l = {96, 104}, m = "invokeSuspend", n = {"currentSeconds", "currentSeconds"}, s = {"I$0", "I$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7651a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> e;
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> f;
        public final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Integer> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<java.lang.Integer> mutableState, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a> continuation) {
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
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(this.c, this.d, this.e, this.f, this.g, continuation);
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
                    int c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.c(this.g);
                    r1 = this.c;
                    float a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a((int) r1, this.d);
                    try {
                        if (r1 < c) {
                            int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtLeast(c - r1, 0) * 1000, 0);
                            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.e;
                            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(a2);
                            androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(coerceAtLeast, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
                            this.f7651a = r1;
                            this.b = 1;
                            if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, boxFloat, tween$default, null, null, this, 12, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = r1;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(this.g, i);
                        } else {
                            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable2 = this.e;
                            java.lang.Float boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(a2);
                            this.f7651a = r1;
                            this.b = 2;
                            if (animatable2.snapTo(boxFloat2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = r1;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(this.g, i);
                        }
                    } catch (java.util.concurrent.CancellationException unused) {
                        r12 = r1;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(this.g, (int) r12);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(this.g, (int) r1);
                        if (this.c == 0) {
                            this.f.invoke();
                        }
                        throw th;
                    }
                } else if (i2 == 1) {
                    i = this.f7651a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(this.g, i);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.f7651a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(this.g, i);
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$2$1", f = "RewardedCountDownTimerCustom.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$b, reason: collision with other inner class name */
    public static final class C0272b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7652a;
        public final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> b;
        public final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0272b(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b> continuation) {
            super(2, continuation);
            this.b = animatable;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7652a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.b(this.c)) {
                    androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.b;
                    this.f7652a = 1;
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

    public static final class c implements androidx.compose.runtime.DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.LifecycleOwner f7653a;
        public final /* synthetic */ androidx.lifecycle.LifecycleEventObserver b;

        public c(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver) {
            this.f7653a = lifecycleOwner;
            this.b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f7653a.getLifecycle().removeObserver(this.b);
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7654a;

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
            f7654a = iArr;
        }
    }

    public static final kotlin.Unit a(long j, long j2, androidx.compose.ui.Modifier modifier, float f, float f2, kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.lifecycle.LifecycleOwner lifecycleOwner, int i, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        a(j, j2, modifier, f, f2, function0, str, lifecycleOwner, i, i2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static final int c(androidx.compose.runtime.MutableState<java.lang.Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final long j2, androidx.compose.ui.Modifier modifier, float f, float f2, final kotlin.jvm.functions.Function0<kotlin.Unit> onTimerFinish, final java.lang.String customTimerString, androidx.lifecycle.LifecycleOwner lifecycleOwner, final int i, final int i2, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        androidx.compose.ui.Modifier modifier2;
        int i7;
        float f3;
        int i8;
        androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        androidx.compose.ui.Modifier modifier3;
        float f4;
        androidx.lifecycle.LifecycleOwner lifecycleOwner3;
        float f5;
        int i9;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer.Companion companion;
        androidx.compose.runtime.MutableState mutableState;
        boolean changed;
        java.lang.Object mutableStateOf$default;
        boolean z;
        java.lang.Object rememberedValue2;
        int i10;
        java.lang.Object rememberedValue3;
        androidx.compose.animation.core.Animatable animatable;
        kotlin.UInt m10890boximpl;
        boolean changed2;
        java.lang.Object rememberedValue4;
        androidx.compose.runtime.MutableState mutableState2;
        int i11;
        kotlin.UInt uInt;
        final androidx.compose.animation.core.Animatable animatable2;
        boolean changed3;
        java.lang.Object rememberedValue5;
        boolean changed4;
        java.lang.Object rememberedValue6;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        java.lang.Object rememberedValue7;
        java.lang.Object rememberedValue8;
        final androidx.compose.runtime.MutableState mutableState3;
        java.lang.Object rememberedValue9;
        int currentCompositeKeyHash2;
        androidx.compose.runtime.Composer m1641constructorimpl2;
        boolean changedInstance;
        java.lang.Object rememberedValue10;
        final float f6;
        final androidx.compose.ui.Modifier modifier4;
        final float f7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customTimerString, "customTimerString");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1415937460);
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
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    f3 = f;
                    i5 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i5 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                        if ((i4 & 32) != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changedInstance(onTimerFinish) ? 131072 : 65536;
                        }
                        if ((i4 & 64) != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(customTimerString) ? 1048576 : 524288;
                        }
                        if ((i3 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                lifecycleOwner2 = lifecycleOwner;
                                if (startRestartGroup.changedInstance(lifecycleOwner2)) {
                                    i14 = 8388608;
                                    i5 |= i14;
                                }
                            } else {
                                lifecycleOwner2 = lifecycleOwner;
                            }
                            i14 = 4194304;
                            i5 |= i14;
                        } else {
                            lifecycleOwner2 = lifecycleOwner;
                        }
                        if ((i4 & 256) == 0) {
                            i13 = (100663296 & i3) == 0 ? startRestartGroup.changed(i) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                            if ((i4 & 512) != 0) {
                                i12 = (805306368 & i3) == 0 ? startRestartGroup.changed(i2) ? 536870912 : 268435456 : 805306368;
                                if ((306783379 & i5) == 306783378 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i6 != 0) {
                                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            f3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(5);
                                        }
                                        float m4478constructorimpl = i8 != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(30) : f2;
                                        if ((i4 & 128) != 0) {
                                            lifecycleOwner3 = (androidx.lifecycle.LifecycleOwner) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                                            i5 &= -29360129;
                                            modifier3 = modifier2;
                                            f4 = f3;
                                        } else {
                                            modifier3 = modifier2;
                                            f4 = f3;
                                            lifecycleOwner3 = lifecycleOwner2;
                                        }
                                        f5 = m4478constructorimpl;
                                        i9 = i5;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 128) != 0) {
                                            i5 &= -29360129;
                                        }
                                        i9 = i5;
                                        modifier3 = modifier2;
                                        f4 = f3;
                                        lifecycleOwner3 = lifecycleOwner2;
                                        f5 = f2;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1415937460, i9, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustom (RewardedCountDownTimerCustom.kt:72)");
                                    }
                                    startRestartGroup.startReplaceableGroup(-1077278555);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    companion = androidx.compose.runtime.Composer.INSTANCE;
                                    if (rememberedValue == companion.getEmpty()) {
                                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g()), null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.startReplaceableGroup(-1077276327);
                                    changed = startRestartGroup.changed(lifecycleOwner3);
                                    java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue11 == companion.getEmpty()) {
                                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                                        startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                    } else {
                                        mutableStateOf$default = rememberedValue11;
                                    }
                                    final androidx.compose.runtime.MutableState mutableState4 = (androidx.compose.runtime.MutableState) mutableStateOf$default;
                                    startRestartGroup.endReplaceableGroup();
                                    final androidx.lifecycle.LifecycleOwner lifecycleOwner4 = lifecycleOwner3;
                                    java.lang.Object[] objArr = new java.lang.Object[0];
                                    startRestartGroup.startReplaceableGroup(-1077272712);
                                    int i15 = 1879048192 & i9;
                                    z = i15 == 536870912;
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!z || rememberedValue2 == companion.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    i10 = i9;
                                    androidx.compose.runtime.MutableState mutableState5 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                                    startRestartGroup.startReplaceableGroup(-1077269958);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == companion.getEmpty()) {
                                        rememberedValue3 = androidx.compose.animation.core.AnimatableKt.Animatable$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i2, i), 0.0f, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                                    startRestartGroup.endReplaceableGroup();
                                    m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                                    startRestartGroup.startReplaceableGroup(-1077264621);
                                    changed2 = (i15 == 536870912) | startRestartGroup.changed(mutableState5) | ((234881024 & i10) == 67108864) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) == 131072);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue4 == companion.getEmpty()) {
                                        mutableState2 = mutableState;
                                        i11 = i10;
                                        uInt = m10890boximpl;
                                        animatable2 = animatable;
                                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2, i, animatable, onTimerFinish, mutableState5, null);
                                        startRestartGroup.updateRememberedValue(aVar);
                                        rememberedValue4 = aVar;
                                    } else {
                                        mutableState2 = mutableState;
                                        i11 = i10;
                                        uInt = m10890boximpl;
                                        animatable2 = animatable;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 27) & 14);
                                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b(mutableState4));
                                    startRestartGroup.startReplaceableGroup(-1077230899);
                                    changed3 = startRestartGroup.changed(mutableState4) | startRestartGroup.changedInstance(animatable2);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!changed3 || rememberedValue5 == companion.getEmpty()) {
                                        rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b(animatable2, mutableState4, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                                    startRestartGroup.startReplaceableGroup(-1077226486);
                                    changed4 = startRestartGroup.changed(mutableState4) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner4);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changed4 || rememberedValue6 == companion.getEmpty()) {
                                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.lifecycle.LifecycleOwner.this, animatable2, mutableState4, (androidx.compose.runtime.DisposableEffectScope) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner4, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 21) & 14);
                                    androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.INSTANCE;
                                    androidx.compose.ui.Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(8));
                                    startRestartGroup.startReplaceableGroup(693286680);
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m474spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                                    startRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.node.ComposeUiNode.Companion companion3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion3.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                    startRestartGroup.startReplaceableGroup(2058660585);
                                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                    java.lang.String a2 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                                    long d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                                    int m4365getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk();
                                    androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-447505287);
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == companion.getEmpty()) {
                                        final java.lang.String str = "custom_countdown_timer_text";
                                        rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    float f8 = f5;
                                    androidx.compose.material.TextKt.m1582TextfLXpl1I(a2, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion4, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), j2, d2, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4365getStarte0LSkKk), 0L, 0, false, 2, null, null, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 56816);
                                    androidx.compose.ui.Alignment center = companion2.getCenter();
                                    androidx.compose.ui.Modifier m568padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion4, f8), androidx.compose.ui.unit.Dp.m4478constructorimpl(2));
                                    startRestartGroup.startReplaceableGroup(-447492116);
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (rememberedValue8 == companion.getEmpty()) {
                                        mutableState3 = mutableState2;
                                        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.compose.runtime.MutableState.this, (androidx.compose.ui.unit.IntSize) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    } else {
                                        mutableState3 = mutableState2;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.ui.Modifier m211backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m568padding3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue8), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                                    startRestartGroup.startReplaceableGroup(-447486932);
                                    rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (rememberedValue9 == companion.getEmpty()) {
                                        final java.lang.String str2 = "custom_timer_container";
                                        rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.b(str2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
                                    startRestartGroup.startReplaceableGroup(733328855);
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                                    startRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion3.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default);
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor2);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (!m1641constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                        m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                        m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                    startRestartGroup.startReplaceableGroup(2058660585);
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                    startRestartGroup.startReplaceableGroup(-1178257690);
                                    changedInstance = ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i11 & 112) == 32);
                                    rememberedValue10 = startRestartGroup.rememberedValue();
                                    if (!changedInstance || rememberedValue10 == companion.getEmpty()) {
                                        final float f9 = f4;
                                        final androidx.compose.animation.core.Animatable animatable3 = animatable2;
                                        final androidx.compose.runtime.MutableState mutableState6 = mutableState3;
                                        rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(j, f9, animatable3, j2, mutableState6, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, 6);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endNode();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endNode();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    f6 = f8;
                                    modifier4 = modifier3;
                                    f7 = f4;
                                    lifecycleOwner2 = lifecycleOwner4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    f6 = f2;
                                    f7 = f3;
                                    modifier4 = modifier2;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final androidx.lifecycle.LifecycleOwner lifecycleOwner5 = lifecycleOwner2;
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(j, j2, modifier4, f7, f6, onTimerFinish, customTimerString, lifecycleOwner5, i, i2, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= i12;
                            if ((306783379 & i5) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i4 & 128) != 0) {
                            }
                            f5 = m4478constructorimpl;
                            i9 = i5;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceableGroup(-1077278555);
                            rememberedValue = startRestartGroup.rememberedValue();
                            companion = androidx.compose.runtime.Composer.INSTANCE;
                            if (rememberedValue == companion.getEmpty()) {
                            }
                            mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-1077276327);
                            changed = startRestartGroup.changed(lifecycleOwner3);
                            java.lang.Object rememberedValue112 = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default);
                            final androidx.compose.runtime.MutableState mutableState42 = (androidx.compose.runtime.MutableState) mutableStateOf$default;
                            startRestartGroup.endReplaceableGroup();
                            final androidx.lifecycle.LifecycleOwner lifecycleOwner42 = lifecycleOwner3;
                            java.lang.Object[] objArr2 = new java.lang.Object[0];
                            startRestartGroup.startReplaceableGroup(-1077272712);
                            int i152 = 1879048192 & i9;
                            if (i152 == 536870912) {
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z) {
                            }
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceableGroup();
                            i10 = i9;
                            androidx.compose.runtime.MutableState mutableState52 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                            startRestartGroup.startReplaceableGroup(-1077269958);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == companion.getEmpty()) {
                            }
                            animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                            startRestartGroup.endReplaceableGroup();
                            m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                            startRestartGroup.startReplaceableGroup(-1077264621);
                            changed2 = (i152 == 536870912) | startRestartGroup.changed(mutableState52) | ((234881024 & i10) == 67108864) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) == 131072);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changed2) {
                            }
                            mutableState2 = mutableState;
                            i11 = i10;
                            uInt = m10890boximpl;
                            animatable2 = animatable;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2, i, animatable, onTimerFinish, mutableState52, null);
                            startRestartGroup.updateRememberedValue(aVar2);
                            rememberedValue4 = aVar2;
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 27) & 14);
                            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(b(mutableState42));
                            startRestartGroup.startReplaceableGroup(-1077230899);
                            changed3 = startRestartGroup.changed(mutableState42) | startRestartGroup.changedInstance(animatable2);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b(animatable2, mutableState42, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(-1077226486);
                            changed4 = startRestartGroup.changed(mutableState42) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner42);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed4) {
                            }
                            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.lifecycle.LifecycleOwner.this, animatable2, mutableState42, (androidx.compose.runtime.DisposableEffectScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner42, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 21) & 14);
                            androidx.compose.ui.Alignment.Companion companion22 = androidx.compose.ui.Alignment.INSTANCE;
                            androidx.compose.ui.Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_42 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(8));
                            startRestartGroup.startReplaceableGroup(693286680);
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m474spacedBy0680j_42, centerVertically2, startRestartGroup, 54);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.node.ComposeUiNode.Companion companion32 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = companion32.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy2, companion32.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                            if (!m1641constructorimpl.getInserting()) {
                            }
                            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                            modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            java.lang.String a22 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                            long d22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                            int m4365getStarte0LSkKk2 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk();
                            androidx.compose.ui.Modifier.Companion companion42 = androidx.compose.ui.Modifier.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-447505287);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            float f82 = f5;
                            androidx.compose.material.TextKt.m1582TextfLXpl1I(a22, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion42, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), j2, d22, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4365getStarte0LSkKk2), 0L, 0, false, 2, null, null, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 56816);
                            androidx.compose.ui.Alignment center2 = companion22.getCenter();
                            androidx.compose.ui.Modifier m568padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion42, f82), androidx.compose.ui.unit.Dp.m4478constructorimpl(2));
                            startRestartGroup.startReplaceableGroup(-447492116);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.Modifier m211backgroundbw27NRU2 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m568padding3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue8), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                            startRestartGroup.startReplaceableGroup(-447486932);
                            rememberedValue9 = startRestartGroup.rememberedValue();
                            if (rememberedValue9 == companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.Modifier semantics$default2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU2, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
                            startRestartGroup.startReplaceableGroup(733328855);
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = companion32.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default2);
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = companion32.getSetCompositeKeyHash();
                            if (!m1641constructorimpl2.getInserting()) {
                            }
                            m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                            modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                            startRestartGroup.startReplaceableGroup(-1178257690);
                            changedInstance = ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i11 & 112) == 32);
                            rememberedValue10 = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            final float f92 = f4;
                            final androidx.compose.animation.core.Animatable animatable32 = animatable2;
                            final androidx.compose.runtime.MutableState mutableState62 = mutableState3;
                            rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(j, f92, animatable32, j2, mutableState62, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default2, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, 6);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            f6 = f82;
                            modifier4 = modifier3;
                            f7 = f4;
                            lifecycleOwner2 = lifecycleOwner42;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i5 |= i13;
                        if ((i4 & 512) != 0) {
                        }
                        i5 |= i12;
                        if ((306783379 & i5) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if ((i4 & 128) != 0) {
                        }
                        f5 = m4478constructorimpl;
                        i9 = i5;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(-1077278555);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = androidx.compose.runtime.Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                        }
                        mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.startReplaceableGroup(-1077276327);
                        changed = startRestartGroup.changed(lifecycleOwner3);
                        java.lang.Object rememberedValue1122 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                        startRestartGroup.updateRememberedValue(mutableStateOf$default);
                        final androidx.compose.runtime.MutableState mutableState422 = (androidx.compose.runtime.MutableState) mutableStateOf$default;
                        startRestartGroup.endReplaceableGroup();
                        final androidx.lifecycle.LifecycleOwner lifecycleOwner422 = lifecycleOwner3;
                        java.lang.Object[] objArr22 = new java.lang.Object[0];
                        startRestartGroup.startReplaceableGroup(-1077272712);
                        int i1522 = 1879048192 & i9;
                        if (i1522 == 536870912) {
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        i10 = i9;
                        androidx.compose.runtime.MutableState mutableState522 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr22, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                        startRestartGroup.startReplaceableGroup(-1077269958);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == companion.getEmpty()) {
                        }
                        animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                        startRestartGroup.endReplaceableGroup();
                        m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                        startRestartGroup.startReplaceableGroup(-1077264621);
                        changed2 = (i1522 == 536870912) | startRestartGroup.changed(mutableState522) | ((234881024 & i10) == 67108864) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) == 131072);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed2) {
                        }
                        mutableState2 = mutableState;
                        i11 = i10;
                        uInt = m10890boximpl;
                        animatable2 = animatable;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a aVar22 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2, i, animatable, onTimerFinish, mutableState522, null);
                        startRestartGroup.updateRememberedValue(aVar22);
                        rememberedValue4 = aVar22;
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 27) & 14);
                        java.lang.Boolean valueOf22 = java.lang.Boolean.valueOf(b(mutableState422));
                        startRestartGroup.startReplaceableGroup(-1077230899);
                        changed3 = startRestartGroup.changed(mutableState422) | startRestartGroup.changedInstance(animatable2);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b(animatable2, mutableState422, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(-1077226486);
                        changed4 = startRestartGroup.changed(mutableState422) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner422);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.lifecycle.LifecycleOwner.this, animatable2, mutableState422, (androidx.compose.runtime.DisposableEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner422, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 21) & 14);
                        androidx.compose.ui.Alignment.Companion companion222 = androidx.compose.ui.Alignment.INSTANCE;
                        androidx.compose.ui.Alignment.Vertical centerVertically22 = companion222.getCenterVertically();
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_422 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(8));
                        startRestartGroup.startReplaceableGroup(693286680);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy22 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m474spacedBy0680j_422, centerVertically22, startRestartGroup, 54);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.node.ComposeUiNode.Companion companion322 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor32 = companion322.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf32 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy22, companion322.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap32, companion322.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash32 = companion322.getSetCompositeKeyHash();
                        if (!m1641constructorimpl.getInserting()) {
                        }
                        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                        modifierMaterializerOf32.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance22 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        java.lang.String a222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                        long d222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        int m4365getStarte0LSkKk22 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk();
                        androidx.compose.ui.Modifier.Companion companion422 = androidx.compose.ui.Modifier.INSTANCE;
                        startRestartGroup.startReplaceableGroup(-447505287);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (rememberedValue7 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        float f822 = f5;
                        androidx.compose.material.TextKt.m1582TextfLXpl1I(a222, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion422, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), j2, d222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4365getStarte0LSkKk22), 0L, 0, false, 2, null, null, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 56816);
                        androidx.compose.ui.Alignment center22 = companion222.getCenter();
                        androidx.compose.ui.Modifier m568padding3ABfNKs22 = androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion422, f822), androidx.compose.ui.unit.Dp.m4478constructorimpl(2));
                        startRestartGroup.startReplaceableGroup(-447492116);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (rememberedValue8 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.ui.Modifier m211backgroundbw27NRU22 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m568padding3ABfNKs22, (kotlin.jvm.functions.Function1) rememberedValue8), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                        startRestartGroup.startReplaceableGroup(-447486932);
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (rememberedValue9 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.ui.Modifier semantics$default22 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU22, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
                        startRestartGroup.startReplaceableGroup(733328855);
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = companion322.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default22);
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy22, companion322.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap222, companion322.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = companion322.getSetCompositeKeyHash();
                        if (!m1641constructorimpl2.getInserting()) {
                        }
                        m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                        modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion422, 0.0f, 1, null);
                        startRestartGroup.startReplaceableGroup(-1178257690);
                        changedInstance = ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i11 & 112) == 32);
                        rememberedValue10 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        final float f922 = f4;
                        final androidx.compose.animation.core.Animatable animatable322 = animatable2;
                        final androidx.compose.runtime.MutableState mutableState622 = mutableState3;
                        rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(j, f922, animatable322, j2, mutableState622, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default22, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, 6);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        f6 = f822;
                        modifier4 = modifier3;
                        f7 = f4;
                        lifecycleOwner2 = lifecycleOwner422;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i4 & 32) != 0) {
                    }
                    if ((i4 & 64) != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i4 & 256) == 0) {
                    }
                    i5 |= i13;
                    if ((i4 & 512) != 0) {
                    }
                    i5 |= i12;
                    if ((306783379 & i5) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    f5 = m4478constructorimpl;
                    i9 = i5;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-1077278555);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = androidx.compose.runtime.Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                    }
                    mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-1077276327);
                    changed = startRestartGroup.changed(lifecycleOwner3);
                    java.lang.Object rememberedValue11222 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                    final androidx.compose.runtime.MutableState mutableState4222 = (androidx.compose.runtime.MutableState) mutableStateOf$default;
                    startRestartGroup.endReplaceableGroup();
                    final androidx.lifecycle.LifecycleOwner lifecycleOwner4222 = lifecycleOwner3;
                    java.lang.Object[] objArr222 = new java.lang.Object[0];
                    startRestartGroup.startReplaceableGroup(-1077272712);
                    int i15222 = 1879048192 & i9;
                    if (i15222 == 536870912) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    i10 = i9;
                    androidx.compose.runtime.MutableState mutableState5222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                    startRestartGroup.startReplaceableGroup(-1077269958);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                    }
                    animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                    startRestartGroup.endReplaceableGroup();
                    m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                    startRestartGroup.startReplaceableGroup(-1077264621);
                    changed2 = (i15222 == 536870912) | startRestartGroup.changed(mutableState5222) | ((234881024 & i10) == 67108864) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) == 131072);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    mutableState2 = mutableState;
                    i11 = i10;
                    uInt = m10890boximpl;
                    animatable2 = animatable;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a aVar222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2, i, animatable, onTimerFinish, mutableState5222, null);
                    startRestartGroup.updateRememberedValue(aVar222);
                    rememberedValue4 = aVar222;
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 27) & 14);
                    java.lang.Boolean valueOf222 = java.lang.Boolean.valueOf(b(mutableState4222));
                    startRestartGroup.startReplaceableGroup(-1077230899);
                    changed3 = startRestartGroup.changed(mutableState4222) | startRestartGroup.changedInstance(animatable2);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b(animatable2, mutableState4222, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1077226486);
                    changed4 = startRestartGroup.changed(mutableState4222) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner4222);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.lifecycle.LifecycleOwner.this, animatable2, mutableState4222, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner4222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 21) & 14);
                    androidx.compose.ui.Alignment.Companion companion2222 = androidx.compose.ui.Alignment.INSTANCE;
                    androidx.compose.ui.Alignment.Vertical centerVertically222 = companion2222.getCenterVertically();
                    androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_4222 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(8));
                    startRestartGroup.startReplaceableGroup(693286680);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy222 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m474spacedBy0680j_4222, centerVertically222, startRestartGroup, 54);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.node.ComposeUiNode.Companion companion3222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor322 = companion3222.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf322 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy222, companion3222.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap322, companion3222.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash322 = companion3222.getSetCompositeKeyHash();
                    if (!m1641constructorimpl.getInserting()) {
                    }
                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                    modifierMaterializerOf322.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance222 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    java.lang.String a2222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                    long d2222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                    int m4365getStarte0LSkKk222 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk();
                    androidx.compose.ui.Modifier.Companion companion4222 = androidx.compose.ui.Modifier.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-447505287);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    float f8222 = f5;
                    androidx.compose.material.TextKt.m1582TextfLXpl1I(a2222, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion4222, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), j2, d2222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4365getStarte0LSkKk222), 0L, 0, false, 2, null, null, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 56816);
                    androidx.compose.ui.Alignment center222 = companion2222.getCenter();
                    androidx.compose.ui.Modifier m568padding3ABfNKs222 = androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion4222, f8222), androidx.compose.ui.unit.Dp.m4478constructorimpl(2));
                    startRestartGroup.startReplaceableGroup(-447492116);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.Modifier m211backgroundbw27NRU222 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m568padding3ABfNKs222, (kotlin.jvm.functions.Function1) rememberedValue8), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                    startRestartGroup.startReplaceableGroup(-447486932);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.Modifier semantics$default222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU222, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
                    startRestartGroup.startReplaceableGroup(733328855);
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = companion3222.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default222);
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy222, companion3222.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap2222, companion3222.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2222 = companion3222.getSetCompositeKeyHash();
                    if (!m1641constructorimpl2.getInserting()) {
                    }
                    m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                    modifierMaterializerOf2222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier fillMaxSize$default222 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion4222, 0.0f, 1, null);
                    startRestartGroup.startReplaceableGroup(-1178257690);
                    changedInstance = ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i11 & 112) == 32);
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    final float f9222 = f4;
                    final androidx.compose.animation.core.Animatable animatable3222 = animatable2;
                    final androidx.compose.runtime.MutableState mutableState6222 = mutableState3;
                    rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(j, f9222, animatable3222, j2, mutableState6222, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default222, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    f6 = f8222;
                    modifier4 = modifier3;
                    f7 = f4;
                    lifecycleOwner2 = lifecycleOwner4222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f3 = f;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                if ((i4 & 32) != 0) {
                }
                if ((i4 & 64) != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                i5 |= i13;
                if ((i4 & 512) != 0) {
                }
                i5 |= i12;
                if ((306783379 & i5) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                f5 = m4478constructorimpl;
                i9 = i5;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1077278555);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = androidx.compose.runtime.Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-1077276327);
                changed = startRestartGroup.changed(lifecycleOwner3);
                java.lang.Object rememberedValue112222 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                final androidx.compose.runtime.MutableState mutableState42222 = (androidx.compose.runtime.MutableState) mutableStateOf$default;
                startRestartGroup.endReplaceableGroup();
                final androidx.lifecycle.LifecycleOwner lifecycleOwner42222 = lifecycleOwner3;
                java.lang.Object[] objArr2222 = new java.lang.Object[0];
                startRestartGroup.startReplaceableGroup(-1077272712);
                int i152222 = 1879048192 & i9;
                if (i152222 == 536870912) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                i10 = i9;
                androidx.compose.runtime.MutableState mutableState52222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr2222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
                startRestartGroup.startReplaceableGroup(-1077269958);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                }
                animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                startRestartGroup.endReplaceableGroup();
                m10890boximpl = kotlin.UInt.m10890boximpl(i2);
                startRestartGroup.startReplaceableGroup(-1077264621);
                changed2 = (i152222 == 536870912) | startRestartGroup.changed(mutableState52222) | ((234881024 & i10) == 67108864) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) == 131072);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                mutableState2 = mutableState;
                i11 = i10;
                uInt = m10890boximpl;
                animatable2 = animatable;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a aVar2222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2, i, animatable, onTimerFinish, mutableState52222, null);
                startRestartGroup.updateRememberedValue(aVar2222);
                rememberedValue4 = aVar2222;
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 27) & 14);
                java.lang.Boolean valueOf2222 = java.lang.Boolean.valueOf(b(mutableState42222));
                startRestartGroup.startReplaceableGroup(-1077230899);
                changed3 = startRestartGroup.changed(mutableState42222) | startRestartGroup.changedInstance(animatable2);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b(animatable2, mutableState42222, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf2222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1077226486);
                changed4 = startRestartGroup.changed(mutableState42222) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner42222);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.lifecycle.LifecycleOwner.this, animatable2, mutableState42222, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner42222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 21) & 14);
                androidx.compose.ui.Alignment.Companion companion22222 = androidx.compose.ui.Alignment.INSTANCE;
                androidx.compose.ui.Alignment.Vertical centerVertically2222 = companion22222.getCenterVertically();
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_42222 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(8));
                startRestartGroup.startReplaceableGroup(693286680);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2222 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m474spacedBy0680j_42222, centerVertically2222, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.node.ComposeUiNode.Companion companion32222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3222 = companion32222.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf3222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy2222, companion32222.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap3222, companion32222.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3222 = companion32222.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
                modifierMaterializerOf3222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2222 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                java.lang.String a22222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                long d22222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                int m4365getStarte0LSkKk2222 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk();
                androidx.compose.ui.Modifier.Companion companion42222 = androidx.compose.ui.Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(-447505287);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                float f82222 = f5;
                androidx.compose.material.TextKt.m1582TextfLXpl1I(a22222, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion42222, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), j2, d22222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4365getStarte0LSkKk2222), 0L, 0, false, 2, null, null, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 56816);
                androidx.compose.ui.Alignment center2222 = companion22222.getCenter();
                androidx.compose.ui.Modifier m568padding3ABfNKs2222 = androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion42222, f82222), androidx.compose.ui.unit.Dp.m4478constructorimpl(2));
                startRestartGroup.startReplaceableGroup(-447492116);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier m211backgroundbw27NRU2222 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m568padding3ABfNKs2222, (kotlin.jvm.functions.Function1) rememberedValue8), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                startRestartGroup.startReplaceableGroup(-447486932);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier semantics$default2222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU2222, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22222 = companion32222.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default2222);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy2222, companion32222.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap22222, companion32222.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22222 = companion32222.getSetCompositeKeyHash();
                if (!m1641constructorimpl2.getInserting()) {
                }
                m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                modifierMaterializerOf22222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier fillMaxSize$default2222 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion42222, 0.0f, 1, null);
                startRestartGroup.startReplaceableGroup(-1178257690);
                changedInstance = ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i11 & 112) == 32);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                final float f92222 = f4;
                final androidx.compose.animation.core.Animatable animatable32222 = animatable2;
                final androidx.compose.runtime.MutableState mutableState62222 = mutableState3;
                rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(j, f92222, animatable32222, j2, mutableState62222, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default2222, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, 6);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                f6 = f82222;
                modifier4 = modifier3;
                f7 = f4;
                lifecycleOwner2 = lifecycleOwner42222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            f3 = f;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            i5 |= i13;
            if ((i4 & 512) != 0) {
            }
            i5 |= i12;
            if ((306783379 & i5) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            f5 = m4478constructorimpl;
            i9 = i5;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1077278555);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = androidx.compose.runtime.Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1077276327);
            changed = startRestartGroup.changed(lifecycleOwner3);
            java.lang.Object rememberedValue1122222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default);
            final androidx.compose.runtime.MutableState mutableState422222 = (androidx.compose.runtime.MutableState) mutableStateOf$default;
            startRestartGroup.endReplaceableGroup();
            final androidx.lifecycle.LifecycleOwner lifecycleOwner422222 = lifecycleOwner3;
            java.lang.Object[] objArr22222 = new java.lang.Object[0];
            startRestartGroup.startReplaceableGroup(-1077272712);
            int i1522222 = 1879048192 & i9;
            if (i1522222 == 536870912) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            i10 = i9;
            androidx.compose.runtime.MutableState mutableState522222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr22222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
            startRestartGroup.startReplaceableGroup(-1077269958);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
            }
            animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            m10890boximpl = kotlin.UInt.m10890boximpl(i2);
            startRestartGroup.startReplaceableGroup(-1077264621);
            changed2 = (i1522222 == 536870912) | startRestartGroup.changed(mutableState522222) | ((234881024 & i10) == 67108864) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) == 131072);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            mutableState2 = mutableState;
            i11 = i10;
            uInt = m10890boximpl;
            animatable2 = animatable;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a aVar22222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2, i, animatable, onTimerFinish, mutableState522222, null);
            startRestartGroup.updateRememberedValue(aVar22222);
            rememberedValue4 = aVar22222;
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 27) & 14);
            java.lang.Boolean valueOf22222 = java.lang.Boolean.valueOf(b(mutableState422222));
            startRestartGroup.startReplaceableGroup(-1077230899);
            changed3 = startRestartGroup.changed(mutableState422222) | startRestartGroup.changedInstance(animatable2);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b(animatable2, mutableState422222, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf22222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1077226486);
            changed4 = startRestartGroup.changed(mutableState422222) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner422222);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.lifecycle.LifecycleOwner.this, animatable2, mutableState422222, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner422222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 21) & 14);
            androidx.compose.ui.Alignment.Companion companion222222 = androidx.compose.ui.Alignment.INSTANCE;
            androidx.compose.ui.Alignment.Vertical centerVertically22222 = companion222222.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_422222 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(8));
            startRestartGroup.startReplaceableGroup(693286680);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy22222 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m474spacedBy0680j_422222, centerVertically22222, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion322222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor32222 = companion322222.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf32222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy22222, companion322222.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap32222, companion322222.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash32222 = companion322222.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
            modifierMaterializerOf32222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance22222 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            java.lang.String a222222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
            long d222222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
            int m4365getStarte0LSkKk22222 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk();
            androidx.compose.ui.Modifier.Companion companion422222 = androidx.compose.ui.Modifier.INSTANCE;
            startRestartGroup.startReplaceableGroup(-447505287);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            float f822222 = f5;
            androidx.compose.material.TextKt.m1582TextfLXpl1I(a222222, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion422222, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), j2, d222222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4365getStarte0LSkKk22222), 0L, 0, false, 2, null, null, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 56816);
            androidx.compose.ui.Alignment center22222 = companion222222.getCenter();
            androidx.compose.ui.Modifier m568padding3ABfNKs22222 = androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion422222, f822222), androidx.compose.ui.unit.Dp.m4478constructorimpl(2));
            startRestartGroup.startReplaceableGroup(-447492116);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier m211backgroundbw27NRU22222 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m568padding3ABfNKs22222, (kotlin.jvm.functions.Function1) rememberedValue8), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
            startRestartGroup.startReplaceableGroup(-447486932);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier semantics$default22222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU22222, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center22222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222222 = companion322222.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default22222);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy22222, companion322222.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap222222, companion322222.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222222 = companion322222.getSetCompositeKeyHash();
            if (!m1641constructorimpl2.getInserting()) {
            }
            m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
            m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
            modifierMaterializerOf222222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default22222 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion422222, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(-1178257690);
            changedInstance = ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i11 & 112) == 32);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            final float f922222 = f4;
            final androidx.compose.animation.core.Animatable animatable322222 = animatable2;
            final androidx.compose.runtime.MutableState mutableState622222 = mutableState3;
            rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(j, f922222, animatable322222, j2, mutableState622222, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue10);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default22222, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, 6);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            f6 = f822222;
            modifier4 = modifier3;
            f7 = f4;
            lifecycleOwner2 = lifecycleOwner422222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        f3 = f;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        i5 |= i13;
        if ((i4 & 512) != 0) {
        }
        i5 |= i12;
        if ((306783379 & i5) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        f5 = m4478constructorimpl;
        i9 = i5;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1077278555);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = androidx.compose.runtime.Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1077276327);
        changed = startRestartGroup.changed(lifecycleOwner3);
        java.lang.Object rememberedValue11222222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default);
        final androidx.compose.runtime.MutableState mutableState4222222 = (androidx.compose.runtime.MutableState) mutableStateOf$default;
        startRestartGroup.endReplaceableGroup();
        final androidx.lifecycle.LifecycleOwner lifecycleOwner4222222 = lifecycleOwner3;
        java.lang.Object[] objArr222222 = new java.lang.Object[0];
        startRestartGroup.startReplaceableGroup(-1077272712);
        int i15222222 = 1879048192 & i9;
        if (i15222222 == 536870912) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        i10 = i9;
        androidx.compose.runtime.MutableState mutableState5222222 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr222222, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 6);
        startRestartGroup.startReplaceableGroup(-1077269958);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
        }
        animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        m10890boximpl = kotlin.UInt.m10890boximpl(i2);
        startRestartGroup.startReplaceableGroup(-1077264621);
        changed2 = (i15222222 == 536870912) | startRestartGroup.changed(mutableState5222222) | ((234881024 & i10) == 67108864) | startRestartGroup.changedInstance(animatable) | ((458752 & i10) == 131072);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        mutableState2 = mutableState;
        i11 = i10;
        uInt = m10890boximpl;
        animatable2 = animatable;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a aVar222222 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(i2, i, animatable, onTimerFinish, mutableState5222222, null);
        startRestartGroup.updateRememberedValue(aVar222222);
        rememberedValue4 = aVar222222;
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(uInt, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i11 >> 27) & 14);
        java.lang.Boolean valueOf222222 = java.lang.Boolean.valueOf(b(mutableState4222222));
        startRestartGroup.startReplaceableGroup(-1077230899);
        changed3 = startRestartGroup.changed(mutableState4222222) | startRestartGroup.changedInstance(animatable2);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.C0272b(animatable2, mutableState4222222, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(valueOf222222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1077226486);
        changed4 = startRestartGroup.changed(mutableState4222222) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner4222222);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.lifecycle.LifecycleOwner.this, animatable2, mutableState4222222, (androidx.compose.runtime.DisposableEffectScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner4222222, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, startRestartGroup, (i11 >> 21) & 14);
        androidx.compose.ui.Alignment.Companion companion2222222 = androidx.compose.ui.Alignment.INSTANCE;
        androidx.compose.ui.Alignment.Vertical centerVertically222222 = companion2222222.getCenterVertically();
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_4222222 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(8));
        startRestartGroup.startReplaceableGroup(693286680);
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy222222 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m474spacedBy0680j_4222222, centerVertically222222, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion companion3222222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor322222 = companion3222222.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf322222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy222222, companion3222222.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap322222, companion3222222.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash322222 = companion3222222.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322222);
        modifierMaterializerOf322222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance222222 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        java.lang.String a2222222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
        long d2222222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
        int m4365getStarte0LSkKk222222 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk();
        androidx.compose.ui.Modifier.Companion companion4222222 = androidx.compose.ui.Modifier.INSTANCE;
        startRestartGroup.startReplaceableGroup(-447505287);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        float f8222222 = f5;
        androidx.compose.material.TextKt.m1582TextfLXpl1I(a2222222, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion4222222, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), j2, d2222222, null, null, null, 0L, null, androidx.compose.ui.text.style.TextAlign.m4353boximpl(m4365getStarte0LSkKk222222), 0L, 0, false, 2, null, null, startRestartGroup, ((i11 << 3) & 896) | 3072, 3072, 56816);
        androidx.compose.ui.Alignment center222222 = companion2222222.getCenter();
        androidx.compose.ui.Modifier m568padding3ABfNKs222222 = androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion4222222, f8222222), androidx.compose.ui.unit.Dp.m4478constructorimpl(2));
        startRestartGroup.startReplaceableGroup(-447492116);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier m211backgroundbw27NRU222222 = androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(m568padding3ABfNKs222222, (kotlin.jvm.functions.Function1) rememberedValue8), androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
        startRestartGroup.startReplaceableGroup(-447486932);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (rememberedValue9 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier semantics$default222222 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m211backgroundbw27NRU222222, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center222222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222222 = companion3222222.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2222222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(semantics$default222222);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy222222, companion3222222.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, currentCompositionLocalMap2222222, companion3222222.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2222222 = companion3222222.getSetCompositeKeyHash();
        if (!m1641constructorimpl2.getInserting()) {
        }
        m1641constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
        m1641constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
        modifierMaterializerOf2222222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.ui.Modifier fillMaxSize$default222222 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion4222222, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-1178257690);
        changedInstance = ((i11 & 14) == 4) | ((i11 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i11 & 112) == 32);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        final float f9222222 = f4;
        final androidx.compose.animation.core.Animatable animatable3222222 = animatable2;
        final androidx.compose.runtime.MutableState mutableState6222222 = mutableState3;
        rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(j, f9222222, animatable3222222, j2, mutableState6222222, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue10);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.CanvasKt.Canvas(fillMaxSize$default222222, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, 6);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        f6 = f8222222;
        modifier4 = modifier3;
        f7 = f4;
        lifecycleOwner2 = lifecycleOwner4222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final kotlin.Unit b(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semantics, str);
        return kotlin.Unit.INSTANCE;
    }

    public static final boolean b(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void a(androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> mutableState, long j) {
        mutableState.setValue(androidx.compose.ui.unit.IntSize.m4644boximpl(j));
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
        androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(androidx.compose.animation.core.Animatable.this, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final void a(androidx.compose.animation.core.Animatable animatable, androidx.compose.runtime.MutableState mutableState, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        int i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.d.f7654a[event.ordinal()];
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

    public static final kotlin.Unit a(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.unit.IntSize intSize) {
        a((androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize>) mutableState, intSize.getPackedValue());
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(long j, float f, androidx.compose.animation.core.Animatable animatable, long j2, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.graphics.drawscope.DrawScope Canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long Size = androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(a((androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize>) mutableState)), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(a((androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize>) mutableState)));
        float f2 = Canvas.mo315toPx0680j_4(f);
        androidx.compose.ui.graphics.StrokeCap.Companion companion = androidx.compose.ui.graphics.StrokeCap.INSTANCE;
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2657drawArcyD3GUKo$default(Canvas, j, 360.0f, 360.0f, false, 0L, Size, 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(f2, 0.0f, companion.m2475getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((java.lang.Number) animatable.getValue()).floatValue() > 0.0f) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2657drawArcyD3GUKo$default(Canvas, j2, 270.0f, kotlin.ranges.RangesKt.coerceAtLeast(((java.lang.Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(a((androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize>) mutableState)), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(a((androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize>) mutableState))), 0.0f, new androidx.compose.ui.graphics.drawscope.Stroke(Canvas.mo315toPx0680j_4(f), 0.0f, companion.m2475getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final long a(androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> mutableState) {
        return mutableState.getValue().getPackedValue();
    }
}
