package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class b {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$1$1", f = "RewardedCountDownTimerCustom.kt", i = {0, 1}, l = {96, 104}, m = "invokeSuspend", n = {"currentSeconds", "currentSeconds"}, s = {"I$0", "I$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11186a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> e;
        public final /* synthetic */ Function0<Unit> f;
        public final /* synthetic */ MutableState<Integer> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, Animatable<Float, AnimationVector1D> animatable, Function0<Unit> function0, MutableState<Integer> mutableState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = animatable;
            this.f = function0;
            this.g = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0080, code lost:
        
            if (r14.c != 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00a0, code lost:
        
            r14.f.invoke();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
        
            if (r14.c != 0) goto L41;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.b;
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int c = b.c(this.g);
                    i = this.c;
                    float a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i, this.d);
                    try {
                        if (i < c) {
                            int coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(c - i, 0) * 1000, 0);
                            Animatable<Float, AnimationVector1D> animatable = this.e;
                            Float boxFloat = Boxing.boxFloat(a2);
                            TweenSpec tween$default = AnimationSpecKt.tween$default(coerceAtLeast, 0, EasingKt.getLinearEasing(), 2, null);
                            this.f11186a = i;
                            this.b = 1;
                            if (Animatable.animateTo$default(animatable, boxFloat, tween$default, null, null, this, 12, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i;
                            b.a(this.g, i2);
                        } else {
                            Animatable<Float, AnimationVector1D> animatable2 = this.e;
                            Float boxFloat2 = Boxing.boxFloat(a2);
                            this.f11186a = i;
                            this.b = 2;
                            if (animatable2.snapTo(boxFloat2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i;
                            Unit unit = Unit.INSTANCE;
                            b.a(this.g, i2);
                        }
                    } catch (CancellationException unused) {
                        b.a(this.g, i);
                    } catch (Throwable th) {
                        th = th;
                        b.a(this.g, i);
                        if (this.c == 0) {
                            this.f.invoke();
                        }
                        throw th;
                    }
                } else if (i3 == 1) {
                    i2 = this.f11186a;
                    ResultKt.throwOnFailure(obj);
                    b.a(this.g, i2);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f11186a;
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                    b.a(this.g, i2);
                }
            } catch (CancellationException unused2) {
                i = coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                i = coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$2$1", f = "RewardedCountDownTimerCustom.kt", i = {}, l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$b, reason: collision with other inner class name */
    public static final class C1568b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11187a;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> b;
        public final /* synthetic */ MutableState<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1568b(Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState, Continuation<? super C1568b> continuation) {
            super(2, continuation);
            this.b = animatable;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1568b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1568b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11187a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!b.b(this.c)) {
                    Animatable<Float, AnimationVector1D> animatable = this.b;
                    this.f11187a = 1;
                    if (animatable.stop(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f11188a;
        public final /* synthetic */ LifecycleEventObserver b;

        public c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.f11188a = lifecycleOwner;
            this.b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f11188a.getLifecycle().removeObserver(this.b);
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11189a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11189a = iArr;
        }
    }

    public static final Unit a(long j, long j2, Modifier modifier, float f, float f2, Function0 function0, String str, LifecycleOwner lifecycleOwner, int i, int i2, int i3, int i4, Composer composer, int i5) {
        a(j, j2, modifier, f, f2, function0, str, lifecycleOwner, i, i2, composer, i3 | 1, i4);
        return Unit.INSTANCE;
    }

    public static final int c(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0420  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final long j2, Modifier modifier, float f, float f2, final Function0<Unit> onTimerFinish, final String customTimerString, LifecycleOwner lifecycleOwner, final int i, final int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        float f3;
        int i7;
        float m3840constructorimpl;
        LifecycleOwner lifecycleOwner2;
        Modifier modifier2;
        float f4;
        int i8;
        Object rememberedValue;
        Composer.Companion companion;
        boolean changed;
        float f5;
        Object mutableStateOf$default;
        final LifecycleOwner lifecycleOwner3;
        boolean changed2;
        Object rememberedValue2;
        float f6;
        Object rememberedValue3;
        Animatable animatable;
        boolean changed3;
        Object rememberedValue4;
        Animatable animatable2;
        float f7;
        float f8;
        Composer composer2;
        boolean changed4;
        Object rememberedValue5;
        boolean changed5;
        Object rememberedValue6;
        boolean changed6;
        Object rememberedValue7;
        boolean changed7;
        Object rememberedValue8;
        boolean changed8;
        Object rememberedValue9;
        boolean changed9;
        Object rememberedValue10;
        float f9;
        final LifecycleOwner lifecycleOwner4;
        final float f10;
        final float f11;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Intrinsics.checkNotNullParameter(customTimerString, "customTimerString");
        Composer startRestartGroup = composer.startRestartGroup(1415937460);
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
        int i10 = i4 & 4;
        if (i10 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
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
                    i5 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                    if ((i4 & 32) == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changed(onTimerFinish) ? 131072 : 65536;
                    }
                    if ((i4 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i5 |= startRestartGroup.changed(customTimerString) ? 1048576 : 524288;
                    }
                    if ((i3 & 12582912) == 0) {
                        if ((i4 & 128) == 0 && startRestartGroup.changed(lifecycleOwner)) {
                            i9 = 8388608;
                            i5 |= i9;
                        }
                        i9 = 4194304;
                        i5 |= i9;
                    }
                    if ((i4 & 256) == 0) {
                        i5 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(i) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i4 & 512) == 0) {
                        i5 |= C.ENCODING_PCM_32BIT;
                    } else if ((i3 & C.ENCODING_PCM_32BIT) == 0) {
                        i5 |= startRestartGroup.changed(i2) ? 536870912 : 268435456;
                    }
                    if ((306783379 & i5) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier;
                            float m3840constructorimpl2 = i6 == 0 ? Dp.m3840constructorimpl(5) : f3;
                            m3840constructorimpl = i7 == 0 ? Dp.m3840constructorimpl(30) : f2;
                            if ((i4 & 128) == 0) {
                                lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                                i5 &= -29360129;
                            } else {
                                lifecycleOwner2 = lifecycleOwner;
                            }
                            modifier2 = modifier4;
                            f4 = m3840constructorimpl2;
                            i8 = i5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            modifier2 = modifier;
                            lifecycleOwner2 = lifecycleOwner;
                            i8 = i5;
                            f4 = f3;
                            m3840constructorimpl = f2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1415937460, i8, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustom (RewardedCountDownTimerCustom.kt:72)");
                        }
                        startRestartGroup.startReplaceableGroup(-1077278555);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        int i11 = i8;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3992boximpl(IntSize.INSTANCE.m4005getZeroYbymL2g()), null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.startReplaceableGroup(-1077276327);
                        changed = startRestartGroup.changed(lifecycleOwner2);
                        Object rememberedValue11 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue11 == companion.getEmpty()) {
                            f5 = f4;
                            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default);
                        } else {
                            f5 = f4;
                            mutableStateOf$default = rememberedValue11;
                        }
                        final MutableState mutableState2 = (MutableState) mutableStateOf$default;
                        startRestartGroup.endReplaceableGroup();
                        lifecycleOwner3 = lifecycleOwner2;
                        Object[] objArr = new Object[0];
                        startRestartGroup.startReplaceableGroup(-1077272712);
                        changed2 = startRestartGroup.changed(i2);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b.a(i2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        f6 = m3840constructorimpl;
                        MutableState mutableState3 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 6);
                        startRestartGroup.startReplaceableGroup(-1077269958);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 != companion.getEmpty()) {
                            rememberedValue3 = AnimatableKt.Animatable$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i2, i), 0.0f, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        animatable = (Animatable) rememberedValue3;
                        startRestartGroup.endReplaceableGroup();
                        UInt m8170boximpl = UInt.m8170boximpl(i2);
                        startRestartGroup.startReplaceableGroup(-1077264621);
                        changed3 = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed3 || rememberedValue4 == companion.getEmpty()) {
                            float f12 = f5;
                            animatable2 = animatable;
                            f7 = f12;
                            f8 = f6;
                            composer2 = startRestartGroup;
                            a aVar = new a(i2, i, animatable2, onTimerFinish, mutableState3, null);
                            composer2.updateRememberedValue(aVar);
                            rememberedValue4 = aVar;
                        } else {
                            f7 = f5;
                            f8 = f6;
                            animatable2 = animatable;
                            composer2 = startRestartGroup;
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(m8170boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i11 >> 27) & 14);
                        Boolean valueOf = Boolean.valueOf(b(mutableState2));
                        composer2.startReplaceableGroup(-1077230899);
                        final Animatable animatable3 = animatable2;
                        changed4 = composer2.changed(mutableState2) | composer2.changed(animatable3);
                        rememberedValue5 = composer2.rememberedValue();
                        if (!changed4 || rememberedValue5 == companion.getEmpty()) {
                            rememberedValue5 = new C1568b(animatable3, mutableState2, null);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
                        composer2.startReplaceableGroup(-1077226486);
                        changed5 = composer2.changed(mutableState2) | composer2.changed(animatable3) | composer2.changed(lifecycleOwner3);
                        rememberedValue6 = composer2.rememberedValue();
                        if (!changed5 || rememberedValue6 == companion.getEmpty()) {
                            rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(LifecycleOwner.this, animatable3, mutableState2, (DisposableEffectScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer2, (i11 >> 21) & 14);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement.HorizontalOrVertical m365spacedBy0680j_4 = Arrangement.INSTANCE.m365spacedBy0680j_4(Dp.m3840constructorimpl(8));
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m365spacedBy0680j_4, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor);
                        }
                        composer2.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                        Updater.m1290setimpl(m1283constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, companion3.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        String a2 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                        long d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        int m3753getStarte0LSkKk = TextAlign.INSTANCE.m3753getStarte0LSkKk();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composer2.startReplaceableGroup(-447505287);
                        final String str = "custom_countdown_timer_text";
                        changed6 = composer2.changed("custom_countdown_timer_text");
                        rememberedValue7 = composer2.rememberedValue();
                        if (!changed6 || rememberedValue7 == companion.getEmpty()) {
                            rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(str, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        composer2.endReplaceableGroup();
                        TextKt.m1243TextfLXpl1I(a2, SemanticsModifierKt.semantics$default(companion4, false, (Function1) rememberedValue7, 1, null), j2, d2, null, null, null, 0L, null, TextAlign.m3741boximpl(m3753getStarte0LSkKk), 0L, 0, false, 2, null, null, composer2, ((i11 << 3) & 896) | 3072, 3072, 56816);
                        Alignment center = companion2.getCenter();
                        Modifier m420padding3ABfNKs = PaddingKt.m420padding3ABfNKs(SizeKt.m461size3ABfNKs(companion4, f8), Dp.m3840constructorimpl(2));
                        composer2.startReplaceableGroup(-447492116);
                        changed7 = composer2.changed(mutableState);
                        rememberedValue8 = composer2.rememberedValue();
                        if (!changed7 || rememberedValue8 == companion.getEmpty()) {
                            rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(MutableState.this, (IntSize) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        composer2.endReplaceableGroup();
                        Modifier m172backgroundbw27NRU = BackgroundKt.m172backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m420padding3ABfNKs, (Function1) rememberedValue8), Color.m1627copywmQWz5c$default(Color.INSTANCE.m1665getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        composer2.startReplaceableGroup(-447486932);
                        final String str2 = "custom_timer_container";
                        changed8 = composer2.changed("custom_timer_container");
                        rememberedValue9 = composer2.rememberedValue();
                        if (!changed8 || rememberedValue9 == companion.getEmpty()) {
                            rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.b(str2, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        composer2.endReplaceableGroup();
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(m172backgroundbw27NRU, false, (Function1) rememberedValue9, 1, null);
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(semantics$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor2);
                        }
                        composer2.disableReusing();
                        Composer m1283constructorimpl2 = Updater.m1283constructorimpl(composer2);
                        Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                        composer2.startReplaceableGroup(-1178257690);
                        final float f13 = f7;
                        changed9 = composer2.changed(j) | composer2.changed(mutableState) | composer2.changed(f13) | composer2.changed(animatable3) | composer2.changed(j2);
                        rememberedValue10 = composer2.rememberedValue();
                        if (!changed9 || rememberedValue10 == companion.getEmpty()) {
                            f9 = f8;
                            lifecycleOwner4 = lifecycleOwner3;
                            Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(j, f13, animatable3, j2, mutableState, (DrawScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(function1);
                            rememberedValue10 = function1;
                        } else {
                            f9 = f8;
                            lifecycleOwner4 = lifecycleOwner3;
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue10, composer2, 6);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f10 = f9;
                        f11 = f13;
                        modifier3 = modifier2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        f10 = f2;
                        lifecycleOwner4 = lifecycleOwner;
                        f11 = f3;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return b.a(j, j2, modifier3, f11, f10, onTimerFinish, customTimerString, lifecycleOwner4, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i4 & 32) == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                if ((i4 & 512) == 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 128) == 0) {
                }
                modifier2 = modifier4;
                f4 = m3840constructorimpl2;
                i8 = i5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1077278555);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                int i112 = i8;
                if (rememberedValue == companion.getEmpty()) {
                }
                final MutableState mutableState4 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-1077276327);
                changed = startRestartGroup.changed(lifecycleOwner2);
                Object rememberedValue112 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                f5 = f4;
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                final MutableState mutableState22 = (MutableState) mutableStateOf$default;
                startRestartGroup.endReplaceableGroup();
                lifecycleOwner3 = lifecycleOwner2;
                Object[] objArr2 = new Object[0];
                startRestartGroup.startReplaceableGroup(-1077272712);
                changed2 = startRestartGroup.changed(i2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.a(i2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                f6 = m3840constructorimpl;
                MutableState mutableState32 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 6);
                startRestartGroup.startReplaceableGroup(-1077269958);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 != companion.getEmpty()) {
                }
                animatable = (Animatable) rememberedValue3;
                startRestartGroup.endReplaceableGroup();
                UInt m8170boximpl2 = UInt.m8170boximpl(i2);
                startRestartGroup.startReplaceableGroup(-1077264621);
                changed3 = startRestartGroup.changed(mutableState32) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed3) {
                }
                float f122 = f5;
                animatable2 = animatable;
                f7 = f122;
                f8 = f6;
                composer2 = startRestartGroup;
                a aVar2 = new a(i2, i, animatable2, onTimerFinish, mutableState32, null);
                composer2.updateRememberedValue(aVar2);
                rememberedValue4 = aVar2;
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(m8170boximpl2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i112 >> 27) & 14);
                Boolean valueOf2 = Boolean.valueOf(b(mutableState22));
                composer2.startReplaceableGroup(-1077230899);
                final Animatable animatable32 = animatable2;
                changed4 = composer2.changed(mutableState22) | composer2.changed(animatable32);
                rememberedValue5 = composer2.rememberedValue();
                if (!changed4) {
                }
                rememberedValue5 = new C1568b(animatable32, mutableState22, null);
                composer2.updateRememberedValue(rememberedValue5);
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
                composer2.startReplaceableGroup(-1077226486);
                changed5 = composer2.changed(mutableState22) | composer2.changed(animatable32) | composer2.changed(lifecycleOwner3);
                rememberedValue6 = composer2.rememberedValue();
                if (!changed5) {
                }
                rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(LifecycleOwner.this, animatable32, mutableState22, (DisposableEffectScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
                composer2.endReplaceableGroup();
                EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer2, (i112 >> 21) & 14);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                Arrangement.HorizontalOrVertical m365spacedBy0680j_42 = Arrangement.INSTANCE.m365spacedBy0680j_4(Dp.m3840constructorimpl(8));
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m365spacedBy0680j_42, centerVertically2, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(modifier2);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m1283constructorimpl3 = Updater.m1283constructorimpl(composer2);
                Updater.m1290setimpl(m1283constructorimpl3, rowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl3, density3, companion32.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl3, layoutDirection3, companion32.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl3, viewConfiguration3, companion32.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-678309503);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                String a22 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                long d22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                int m3753getStarte0LSkKk2 = TextAlign.INSTANCE.m3753getStarte0LSkKk();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                composer2.startReplaceableGroup(-447505287);
                final String str3 = "custom_countdown_timer_text";
                changed6 = composer2.changed("custom_countdown_timer_text");
                rememberedValue7 = composer2.rememberedValue();
                if (!changed6) {
                }
                rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(str3, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
                composer2.endReplaceableGroup();
                TextKt.m1243TextfLXpl1I(a22, SemanticsModifierKt.semantics$default(companion42, false, (Function1) rememberedValue7, 1, null), j2, d22, null, null, null, 0L, null, TextAlign.m3741boximpl(m3753getStarte0LSkKk2), 0L, 0, false, 2, null, null, composer2, ((i112 << 3) & 896) | 3072, 3072, 56816);
                Alignment center2 = companion22.getCenter();
                Modifier m420padding3ABfNKs2 = PaddingKt.m420padding3ABfNKs(SizeKt.m461size3ABfNKs(companion42, f8), Dp.m3840constructorimpl(2));
                composer2.startReplaceableGroup(-447492116);
                changed7 = composer2.changed(mutableState4);
                rememberedValue8 = composer2.rememberedValue();
                if (!changed7) {
                }
                rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(MutableState.this, (IntSize) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue8);
                composer2.endReplaceableGroup();
                Modifier m172backgroundbw27NRU2 = BackgroundKt.m172backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m420padding3ABfNKs2, (Function1) rememberedValue8), Color.m1627copywmQWz5c$default(Color.INSTANCE.m1665getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                composer2.startReplaceableGroup(-447486932);
                final String str22 = "custom_timer_container";
                changed8 = composer2.changed("custom_timer_container");
                rememberedValue9 = composer2.rememberedValue();
                if (!changed8) {
                }
                rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.b(str22, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
                composer2.endReplaceableGroup();
                Modifier semantics$default2 = SemanticsModifierKt.semantics$default(m172backgroundbw27NRU2, false, (Function1) rememberedValue9, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                Density density22 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection22 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(semantics$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m1283constructorimpl22 = Updater.m1283constructorimpl(composer2);
                Updater.m1290setimpl(m1283constructorimpl22, rememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl22, density22, companion32.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, companion32.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, companion32.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                composer2.startReplaceableGroup(-1178257690);
                final float f132 = f7;
                changed9 = composer2.changed(j) | composer2.changed(mutableState4) | composer2.changed(f132) | composer2.changed(animatable32) | composer2.changed(j2);
                rememberedValue10 = composer2.rememberedValue();
                if (changed9) {
                }
                f9 = f8;
                lifecycleOwner4 = lifecycleOwner3;
                Function1 function12 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(j, f132, animatable32, j2, mutableState4, (DrawScope) obj);
                    }
                };
                composer2.updateRememberedValue(function12);
                rememberedValue10 = function12;
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(fillMaxSize$default2, (Function1) rememberedValue10, composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                f10 = f9;
                f11 = f132;
                modifier3 = modifier2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            if ((i4 & 512) == 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 128) == 0) {
            }
            modifier2 = modifier4;
            f4 = m3840constructorimpl2;
            i8 = i5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1077278555);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            int i1122 = i8;
            if (rememberedValue == companion.getEmpty()) {
            }
            final MutableState mutableState42 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1077276327);
            changed = startRestartGroup.changed(lifecycleOwner2);
            Object rememberedValue1122 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            f5 = f4;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default);
            final MutableState mutableState222 = (MutableState) mutableStateOf$default;
            startRestartGroup.endReplaceableGroup();
            lifecycleOwner3 = lifecycleOwner2;
            Object[] objArr22 = new Object[0];
            startRestartGroup.startReplaceableGroup(-1077272712);
            changed2 = startRestartGroup.changed(i2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a(i2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            f6 = m3840constructorimpl;
            MutableState mutableState322 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 6);
            startRestartGroup.startReplaceableGroup(-1077269958);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 != companion.getEmpty()) {
            }
            animatable = (Animatable) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            UInt m8170boximpl22 = UInt.m8170boximpl(i2);
            startRestartGroup.startReplaceableGroup(-1077264621);
            changed3 = startRestartGroup.changed(mutableState322) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3) {
            }
            float f1222 = f5;
            animatable2 = animatable;
            f7 = f1222;
            f8 = f6;
            composer2 = startRestartGroup;
            a aVar22 = new a(i2, i, animatable2, onTimerFinish, mutableState322, null);
            composer2.updateRememberedValue(aVar22);
            rememberedValue4 = aVar22;
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(m8170boximpl22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i1122 >> 27) & 14);
            Boolean valueOf22 = Boolean.valueOf(b(mutableState222));
            composer2.startReplaceableGroup(-1077230899);
            final Animatable animatable322 = animatable2;
            changed4 = composer2.changed(mutableState222) | composer2.changed(animatable322);
            rememberedValue5 = composer2.rememberedValue();
            if (!changed4) {
            }
            rememberedValue5 = new C1568b(animatable322, mutableState222, null);
            composer2.updateRememberedValue(rememberedValue5);
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
            composer2.startReplaceableGroup(-1077226486);
            changed5 = composer2.changed(mutableState222) | composer2.changed(animatable322) | composer2.changed(lifecycleOwner3);
            rememberedValue6 = composer2.rememberedValue();
            if (!changed5) {
            }
            rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(LifecycleOwner.this, animatable322, mutableState222, (DisposableEffectScope) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue6);
            composer2.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer2, (i1122 >> 21) & 14);
            Alignment.Companion companion222 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically22 = companion222.getCenterVertically();
            Arrangement.HorizontalOrVertical m365spacedBy0680j_422 = Arrangement.INSTANCE.m365spacedBy0680j_4(Dp.m3840constructorimpl(8));
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m365spacedBy0680j_422, centerVertically22, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            Density density32 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection32 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration32 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor32 = companion322.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf32 = LayoutKt.materializerOf(modifier2);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m1283constructorimpl32 = Updater.m1283constructorimpl(composer2);
            Updater.m1290setimpl(m1283constructorimpl32, rowMeasurePolicy22, companion322.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl32, density32, companion322.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl32, layoutDirection32, companion322.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl32, viewConfiguration32, companion322.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf32.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            String a222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
            long d222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
            int m3753getStarte0LSkKk22 = TextAlign.INSTANCE.m3753getStarte0LSkKk();
            Modifier.Companion companion422 = Modifier.INSTANCE;
            composer2.startReplaceableGroup(-447505287);
            final String str32 = "custom_countdown_timer_text";
            changed6 = composer2.changed("custom_countdown_timer_text");
            rememberedValue7 = composer2.rememberedValue();
            if (!changed6) {
            }
            rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(str32, (SemanticsPropertyReceiver) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue7);
            composer2.endReplaceableGroup();
            TextKt.m1243TextfLXpl1I(a222, SemanticsModifierKt.semantics$default(companion422, false, (Function1) rememberedValue7, 1, null), j2, d222, null, null, null, 0L, null, TextAlign.m3741boximpl(m3753getStarte0LSkKk22), 0L, 0, false, 2, null, null, composer2, ((i1122 << 3) & 896) | 3072, 3072, 56816);
            Alignment center22 = companion222.getCenter();
            Modifier m420padding3ABfNKs22 = PaddingKt.m420padding3ABfNKs(SizeKt.m461size3ABfNKs(companion422, f8), Dp.m3840constructorimpl(2));
            composer2.startReplaceableGroup(-447492116);
            changed7 = composer2.changed(mutableState42);
            rememberedValue8 = composer2.rememberedValue();
            if (!changed7) {
            }
            rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(MutableState.this, (IntSize) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue8);
            composer2.endReplaceableGroup();
            Modifier m172backgroundbw27NRU22 = BackgroundKt.m172backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m420padding3ABfNKs22, (Function1) rememberedValue8), Color.m1627copywmQWz5c$default(Color.INSTANCE.m1665getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            composer2.startReplaceableGroup(-447486932);
            final String str222 = "custom_timer_container";
            changed8 = composer2.changed("custom_timer_container");
            rememberedValue9 = composer2.rememberedValue();
            if (!changed8) {
            }
            rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.b(str222, (SemanticsPropertyReceiver) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue9);
            composer2.endReplaceableGroup();
            Modifier semantics$default22 = SemanticsModifierKt.semantics$default(m172backgroundbw27NRU22, false, (Function1) rememberedValue9, 1, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            Density density222 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection222 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor222 = companion322.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(semantics$default22);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m1283constructorimpl222 = Updater.m1283constructorimpl(composer2);
            Updater.m1290setimpl(m1283constructorimpl222, rememberBoxMeasurePolicy22, companion322.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl222, density222, companion322.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl222, layoutDirection222, companion322.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl222, viewConfiguration222, companion322.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(companion422, 0.0f, 1, null);
            composer2.startReplaceableGroup(-1178257690);
            final float f1322 = f7;
            changed9 = composer2.changed(j) | composer2.changed(mutableState42) | composer2.changed(f1322) | composer2.changed(animatable322) | composer2.changed(j2);
            rememberedValue10 = composer2.rememberedValue();
            if (changed9) {
            }
            f9 = f8;
            lifecycleOwner4 = lifecycleOwner3;
            Function1 function122 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(j, f1322, animatable322, j2, mutableState42, (DrawScope) obj);
                }
            };
            composer2.updateRememberedValue(function122);
            rememberedValue10 = function122;
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default22, (Function1) rememberedValue10, composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            f10 = f9;
            f11 = f1322;
            modifier3 = modifier2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 128) == 0) {
        }
        modifier2 = modifier4;
        f4 = m3840constructorimpl2;
        i8 = i5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1077278555);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        int i11222 = i8;
        if (rememberedValue == companion.getEmpty()) {
        }
        final MutableState mutableState422 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1077276327);
        changed = startRestartGroup.changed(lifecycleOwner2);
        Object rememberedValue11222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        f5 = f4;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default);
        final MutableState mutableState2222 = (MutableState) mutableStateOf$default;
        startRestartGroup.endReplaceableGroup();
        lifecycleOwner3 = lifecycleOwner2;
        Object[] objArr222 = new Object[0];
        startRestartGroup.startReplaceableGroup(-1077272712);
        changed2 = startRestartGroup.changed(i2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.a(i2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        f6 = m3840constructorimpl;
        MutableState mutableState3222 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr222, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 6);
        startRestartGroup.startReplaceableGroup(-1077269958);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 != companion.getEmpty()) {
        }
        animatable = (Animatable) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        UInt m8170boximpl222 = UInt.m8170boximpl(i2);
        startRestartGroup.startReplaceableGroup(-1077264621);
        changed3 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        float f12222 = f5;
        animatable2 = animatable;
        f7 = f12222;
        f8 = f6;
        composer2 = startRestartGroup;
        a aVar222 = new a(i2, i, animatable2, onTimerFinish, mutableState3222, null);
        composer2.updateRememberedValue(aVar222);
        rememberedValue4 = aVar222;
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(m8170boximpl222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i11222 >> 27) & 14);
        Boolean valueOf222 = Boolean.valueOf(b(mutableState2222));
        composer2.startReplaceableGroup(-1077230899);
        final Animatable animatable3222 = animatable2;
        changed4 = composer2.changed(mutableState2222) | composer2.changed(animatable3222);
        rememberedValue5 = composer2.rememberedValue();
        if (!changed4) {
        }
        rememberedValue5 = new C1568b(animatable3222, mutableState2222, null);
        composer2.updateRememberedValue(rememberedValue5);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
        composer2.startReplaceableGroup(-1077226486);
        changed5 = composer2.changed(mutableState2222) | composer2.changed(animatable3222) | composer2.changed(lifecycleOwner3);
        rememberedValue6 = composer2.rememberedValue();
        if (!changed5) {
        }
        rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(LifecycleOwner.this, animatable3222, mutableState2222, (DisposableEffectScope) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue6);
        composer2.endReplaceableGroup();
        EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer2, (i11222 >> 21) & 14);
        Alignment.Companion companion2222 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically222 = companion2222.getCenterVertically();
        Arrangement.HorizontalOrVertical m365spacedBy0680j_4222 = Arrangement.INSTANCE.m365spacedBy0680j_4(Dp.m3840constructorimpl(8));
        composer2.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m365spacedBy0680j_4222, centerVertically222, composer2, 54);
        composer2.startReplaceableGroup(-1323940314);
        Density density322 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection322 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration322 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor322 = companion3222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf322 = LayoutKt.materializerOf(modifier2);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m1283constructorimpl322 = Updater.m1283constructorimpl(composer2);
        Updater.m1290setimpl(m1283constructorimpl322, rowMeasurePolicy222, companion3222.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl322, density322, companion3222.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl322, layoutDirection322, companion3222.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl322, viewConfiguration322, companion3222.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf322.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        String a2222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
        long d2222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
        int m3753getStarte0LSkKk222 = TextAlign.INSTANCE.m3753getStarte0LSkKk();
        Modifier.Companion companion4222 = Modifier.INSTANCE;
        composer2.startReplaceableGroup(-447505287);
        final String str322 = "custom_countdown_timer_text";
        changed6 = composer2.changed("custom_countdown_timer_text");
        rememberedValue7 = composer2.rememberedValue();
        if (!changed6) {
        }
        rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(str322, (SemanticsPropertyReceiver) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue7);
        composer2.endReplaceableGroup();
        TextKt.m1243TextfLXpl1I(a2222, SemanticsModifierKt.semantics$default(companion4222, false, (Function1) rememberedValue7, 1, null), j2, d2222, null, null, null, 0L, null, TextAlign.m3741boximpl(m3753getStarte0LSkKk222), 0L, 0, false, 2, null, null, composer2, ((i11222 << 3) & 896) | 3072, 3072, 56816);
        Alignment center222 = companion2222.getCenter();
        Modifier m420padding3ABfNKs222 = PaddingKt.m420padding3ABfNKs(SizeKt.m461size3ABfNKs(companion4222, f8), Dp.m3840constructorimpl(2));
        composer2.startReplaceableGroup(-447492116);
        changed7 = composer2.changed(mutableState422);
        rememberedValue8 = composer2.rememberedValue();
        if (!changed7) {
        }
        rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(MutableState.this, (IntSize) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue8);
        composer2.endReplaceableGroup();
        Modifier m172backgroundbw27NRU222 = BackgroundKt.m172backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m420padding3ABfNKs222, (Function1) rememberedValue8), Color.m1627copywmQWz5c$default(Color.INSTANCE.m1665getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
        composer2.startReplaceableGroup(-447486932);
        final String str2222 = "custom_timer_container";
        changed8 = composer2.changed("custom_timer_container");
        rememberedValue9 = composer2.rememberedValue();
        if (!changed8) {
        }
        rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.b(str2222, (SemanticsPropertyReceiver) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue9);
        composer2.endReplaceableGroup();
        Modifier semantics$default222 = SemanticsModifierKt.semantics$default(m172backgroundbw27NRU222, false, (Function1) rememberedValue9, 1, null);
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        Density density2222 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2222 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2222 = companion3222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(semantics$default222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m1283constructorimpl2222 = Updater.m1283constructorimpl(composer2);
        Updater.m1290setimpl(m1283constructorimpl2222, rememberBoxMeasurePolicy222, companion3222.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl2222, density2222, companion3222.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl2222, layoutDirection2222, companion3222.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl2222, viewConfiguration2222, companion3222.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(companion4222, 0.0f, 1, null);
        composer2.startReplaceableGroup(-1178257690);
        final float f13222 = f7;
        changed9 = composer2.changed(j) | composer2.changed(mutableState422) | composer2.changed(f13222) | composer2.changed(animatable3222) | composer2.changed(j2);
        rememberedValue10 = composer2.rememberedValue();
        if (changed9) {
        }
        f9 = f8;
        lifecycleOwner4 = lifecycleOwner3;
        Function1 function1222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(j, f13222, animatable3222, j2, mutableState422, (DrawScope) obj);
            }
        };
        composer2.updateRememberedValue(function1222);
        rememberedValue10 = function1222;
        composer2.endReplaceableGroup();
        CanvasKt.Canvas(fillMaxSize$default222, (Function1) rememberedValue10, composer2, 6);
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        f10 = f9;
        f11 = f13222;
        modifier3 = modifier2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void a(MutableState<IntSize> mutableState, long j) {
        mutableState.setValue(IntSize.m3992boximpl(j));
    }

    public static final void a(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void a(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final MutableState a(int i) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
    }

    public static final DisposableEffectResult a(LifecycleOwner lifecycleOwner, final Animatable animatable, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                b.a(Animatable.this, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final void a(Animatable animatable, MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = d.f11189a[event.ordinal()];
        if (i == 1) {
            a((MutableState<Boolean>) mutableState, false);
        } else if (i == 2 && ((Number) animatable.getValue()).floatValue() > 0.0f) {
            a((MutableState<Boolean>) mutableState, true);
        }
    }

    public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final Unit a(MutableState mutableState, IntSize intSize) {
        a((MutableState<IntSize>) mutableState, intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    public static final Unit a(long j, float f, Animatable animatable, long j2, MutableState mutableState, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long Size = androidx.compose.ui.geometry.SizeKt.Size(IntSize.m4000getWidthimpl(a((MutableState<IntSize>) mutableState)), IntSize.m3999getHeightimpl(a((MutableState<IntSize>) mutableState)));
        float f2 = Canvas.mo315toPx0680j_4(f);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m2102drawArcyD3GUKo$default(Canvas, j, 360.0f, 360.0f, false, 0L, Size, 0.0f, new Stroke(f2, 0.0f, companion.m1933getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            DrawScope.m2102drawArcyD3GUKo$default(Canvas, j2, 270.0f, RangesKt.coerceAtLeast(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, androidx.compose.ui.geometry.SizeKt.Size(IntSize.m4000getWidthimpl(a((MutableState<IntSize>) mutableState)), IntSize.m3999getHeightimpl(a((MutableState<IntSize>) mutableState))), 0.0f, new Stroke(Canvas.mo315toPx0680j_4(f), 0.0f, companion.m1933getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return Unit.INSTANCE;
    }

    public static final long a(MutableState<IntSize> mutableState) {
        return mutableState.getValue().getPackedValue();
    }
}
