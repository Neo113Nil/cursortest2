package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import com.google.zxing.pdf417.PDF417Common;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
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
public final class c {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerKt$RewardedCountDownTimer$1$1", f = "RewardedCountDownTimer.kt", i = {0, 1}, l = {PDF417Common.MAX_ROWS_IN_BARCODE, 98}, m = "invokeSuspend", n = {"currentSeconds", "currentSeconds"}, s = {"I$0", "I$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11190a;
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
                    int b = c.b(this.g);
                    i = this.c;
                    float a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i, this.d);
                    try {
                        if (i < b) {
                            int coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(b - i, 0) * 1000, 0);
                            Animatable<Float, AnimationVector1D> animatable = this.e;
                            Float boxFloat = Boxing.boxFloat(a2);
                            TweenSpec tween$default = AnimationSpecKt.tween$default(coerceAtLeast, 0, EasingKt.getLinearEasing(), 2, null);
                            this.f11190a = i;
                            this.b = 1;
                            if (Animatable.animateTo$default(animatable, boxFloat, tween$default, null, null, this, 12, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i;
                            c.a(this.g, i2);
                        } else {
                            Animatable<Float, AnimationVector1D> animatable2 = this.e;
                            Float boxFloat2 = Boxing.boxFloat(a2);
                            this.f11190a = i;
                            this.b = 2;
                            if (animatable2.snapTo(boxFloat2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i;
                            Unit unit = Unit.INSTANCE;
                            c.a(this.g, i2);
                        }
                    } catch (CancellationException unused) {
                        c.a(this.g, i);
                    } catch (Throwable th) {
                        th = th;
                        c.a(this.g, i);
                        if (this.c == 0) {
                            this.f.invoke();
                        }
                        throw th;
                    }
                } else if (i3 == 1) {
                    i2 = this.f11190a;
                    ResultKt.throwOnFailure(obj);
                    c.a(this.g, i2);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f11190a;
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                    c.a(this.g, i2);
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerKt$RewardedCountDownTimer$2$1", f = "RewardedCountDownTimer.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11191a;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> b;
        public final /* synthetic */ MutableState<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = animatable;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11191a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!c.a(this.c)) {
                    Animatable<Float, AnimationVector1D> animatable = this.b;
                    this.f11191a = 1;
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

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$c, reason: collision with other inner class name */
    public static final class C1569c implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f11192a;
        public final /* synthetic */ LifecycleEventObserver b;

        public C1569c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.f11192a = lifecycleOwner;
            this.b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f11192a.getLifecycle().removeObserver(this.b);
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11193a;

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
            f11193a = iArr;
        }
    }

    public static final Unit a(long j, long j2, Modifier modifier, float f, float f2, Function0 function0, LifecycleOwner lifecycleOwner, int i, int i2, int i3, int i4, Composer composer, int i5) {
        a(j, j2, modifier, f, f2, function0, lifecycleOwner, i, i2, composer, i3 | 1, i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final long j2, Modifier modifier, float f, float f2, final Function0<Unit> onTimerFinish, LifecycleOwner lifecycleOwner, final int i, final int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        float m3840constructorimpl;
        LifecycleOwner lifecycleOwner2;
        Modifier modifier3;
        float f3;
        float f4;
        float f5;
        boolean changed;
        Object rememberedValue;
        MutableState mutableState;
        boolean changed2;
        int i8;
        Object rememberedValue2;
        Object rememberedValue3;
        Composer.Companion companion;
        Modifier modifier4;
        Animatable animatable;
        UInt m8170boximpl;
        boolean changed3;
        Object rememberedValue4;
        Animatable animatable2;
        int i9;
        final LifecycleOwner lifecycleOwner3;
        float f6;
        MutableState mutableState2;
        float f7;
        Modifier modifier5;
        UInt uInt;
        Composer composer2;
        boolean changed4;
        Object rememberedValue5;
        Object obj;
        boolean changed5;
        Object rememberedValue6;
        float f8;
        boolean changed6;
        Object rememberedValue7;
        final float f9;
        boolean changed7;
        Object rememberedValue8;
        float f10;
        float f11;
        int i10;
        String m8149m;
        boolean changed8;
        Object rememberedValue9;
        Composer composer3;
        final LifecycleOwner lifecycleOwner4;
        final float f12;
        final float f13;
        final Modifier modifier6;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Composer startRestartGroup = composer.startRestartGroup(-562864551);
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
        int i11 = i4 & 4;
        if (i11 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i5 |= startRestartGroup.changed(f) ? 2048 : 1024;
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
                    if ((i3 & 1572864) == 0) {
                        i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(lifecycleOwner)) ? 1048576 : 524288;
                    }
                    if ((i4 & 128) == 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    if ((i4 & 256) == 0) {
                        i5 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(i2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((38347923 & i5) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            float m3840constructorimpl2 = i6 == 0 ? Dp.m3840constructorimpl(7) : f;
                            m3840constructorimpl = i7 == 0 ? Dp.m3840constructorimpl(30) : f2;
                            if ((i4 & 64) == 0) {
                                i5 &= -3670017;
                                lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            } else {
                                lifecycleOwner2 = lifecycleOwner;
                            }
                            modifier3 = modifier2;
                            f3 = m3840constructorimpl2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            m3840constructorimpl = f2;
                            lifecycleOwner2 = lifecycleOwner;
                            modifier3 = modifier2;
                            f3 = f;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            f4 = m3840constructorimpl;
                            f5 = f3;
                        } else {
                            f4 = m3840constructorimpl;
                            f5 = f3;
                            ComposerKt.traceEventStart(-562864551, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimer (RewardedCountDownTimer.kt:66)");
                        }
                        startRestartGroup.startReplaceableGroup(1215960328);
                        changed = startRestartGroup.changed(lifecycleOwner2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default);
                            rememberedValue = mutableStateOf$default;
                        }
                        mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        Object[] objArr = new Object[0];
                        startRestartGroup.startReplaceableGroup(1215963943);
                        changed2 = startRestartGroup.changed(i2);
                        i8 = i5;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return c.a(i2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        MutableState mutableState3 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 6);
                        startRestartGroup.startReplaceableGroup(1215966697);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue3 != companion.getEmpty()) {
                            modifier4 = modifier3;
                            rememberedValue3 = AnimatableKt.Animatable$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i2, i), 0.0f, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        } else {
                            modifier4 = modifier3;
                        }
                        animatable = (Animatable) rememberedValue3;
                        startRestartGroup.endReplaceableGroup();
                        m8170boximpl = UInt.m8170boximpl(i2);
                        startRestartGroup.startReplaceableGroup(1215977122);
                        changed3 = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed3 || rememberedValue4 == companion.getEmpty()) {
                            animatable2 = animatable;
                            i9 = i8;
                            lifecycleOwner3 = lifecycleOwner2;
                            f6 = f4;
                            mutableState2 = mutableState;
                            f7 = f5;
                            modifier5 = modifier4;
                            uInt = m8170boximpl;
                            composer2 = startRestartGroup;
                            rememberedValue4 = new a(i2, i, animatable2, onTimerFinish, mutableState3, null);
                            composer2.updateRememberedValue(rememberedValue4);
                        } else {
                            f6 = f4;
                            f7 = f5;
                            modifier5 = modifier4;
                            uInt = m8170boximpl;
                            animatable2 = animatable;
                            lifecycleOwner3 = lifecycleOwner2;
                            mutableState2 = mutableState;
                            composer2 = startRestartGroup;
                            i9 = i8;
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i9 >> 24) & 14);
                        Boolean valueOf = Boolean.valueOf(a((MutableState<Boolean>) mutableState2));
                        composer2.startReplaceableGroup(1216010844);
                        final MutableState mutableState4 = mutableState2;
                        final Animatable animatable3 = animatable2;
                        changed4 = composer2.changed(mutableState4) | composer2.changed(animatable3);
                        rememberedValue5 = composer2.rememberedValue();
                        if (!changed4 || rememberedValue5 == companion.getEmpty()) {
                            obj = null;
                            rememberedValue5 = new b(animatable3, mutableState4, null);
                            composer2.updateRememberedValue(rememberedValue5);
                        } else {
                            obj = null;
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
                        composer2.startReplaceableGroup(1216015257);
                        changed5 = composer2.changed(mutableState4) | composer2.changed(animatable3) | composer2.changed(lifecycleOwner3);
                        rememberedValue6 = composer2.rememberedValue();
                        if (!changed5 || rememberedValue6 == companion.getEmpty()) {
                            rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return c.a(LifecycleOwner.this, animatable3, mutableState4, (DisposableEffectScope) obj2);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer2, (i9 >> 18) & 14);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        f8 = f6;
                        Modifier m172backgroundbw27NRU = BackgroundKt.m172backgroundbw27NRU(ClipKt.clip(SizeKt.m461size3ABfNKs(modifier5, f8), RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(Dp.m3840constructorimpl(20))), Color.m1627copywmQWz5c$default(Color.INSTANCE.m1665getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        composer2.startReplaceableGroup(1216045352);
                        final String str = "timer_container";
                        changed6 = composer2.changed("timer_container");
                        rememberedValue7 = composer2.rememberedValue();
                        if (!changed6 || rememberedValue7 == companion.getEmpty()) {
                            rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return c.a(str, (SemanticsPropertyReceiver) obj2);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        composer2.endReplaceableGroup();
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(m172backgroundbw27NRU, false, (Function1) rememberedValue7, 1, obj);
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(semantics$default);
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
                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, companion2.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                        composer2.startReplaceableGroup(1205651458);
                        f9 = f7;
                        changed7 = composer2.changed(j) | composer2.changed(f9) | composer2.changed(animatable3) | composer2.changed(j2);
                        rememberedValue8 = composer2.rememberedValue();
                        if (!changed7 || rememberedValue8 == companion.getEmpty()) {
                            f10 = f8;
                            f11 = f9;
                            i10 = 6;
                            Object obj2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return c.a(j, f9, animatable3, j2, (DrawScope) obj3);
                                }
                            };
                            composer2.updateRememberedValue(obj2);
                            rememberedValue8 = obj2;
                        } else {
                            f10 = f8;
                            f11 = f9;
                            i10 = 6;
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue8, composer2, i10);
                        m8149m = UByte$$ExternalSyntheticBackport0.m8149m(i2, 10);
                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
                        long d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        int m3748getCentere0LSkKk = TextAlign.INSTANCE.m3748getCentere0LSkKk();
                        composer2.startReplaceableGroup(1205686792);
                        final String str2 = "countdown_timer_text";
                        changed8 = composer2.changed("countdown_timer_text");
                        rememberedValue9 = composer2.rememberedValue();
                        if (!changed8 || rememberedValue9 == companion.getEmpty()) {
                            rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return c.b(str2, (SemanticsPropertyReceiver) obj3);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        composer2.endReplaceableGroup();
                        LifecycleOwner lifecycleOwner5 = lifecycleOwner3;
                        Modifier modifier7 = modifier5;
                        composer3 = composer2;
                        TextKt.m1243TextfLXpl1I(m8149m, SemanticsModifierKt.semantics$default(companion3, false, (Function1) rememberedValue9, 1, null), j2, d2, null, null, null, 0L, null, TextAlign.m3741boximpl(m3748getCentere0LSkKk), 0L, 0, false, 1, null, button, composer3, ((i9 << 3) & 896) | 3072, 3072, 24048);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        lifecycleOwner4 = lifecycleOwner5;
                        f12 = f10;
                        f13 = f11;
                        modifier6 = modifier7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        f12 = f2;
                        lifecycleOwner4 = lifecycleOwner;
                        modifier6 = modifier2;
                        composer3 = startRestartGroup;
                        f13 = f;
                    }
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                return c.a(j, j2, modifier6, f13, f12, onTimerFinish, lifecycleOwner4, i, i2, i3, i4, (Composer) obj3, ((Integer) obj4).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i4 & 32) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i4 & 128) == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                if ((38347923 & i5) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                modifier3 = modifier2;
                f3 = m3840constructorimpl2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(1215960328);
                changed = startRestartGroup.changed(lifecycleOwner2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                Object mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                rememberedValue = mutableStateOf$default2;
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                Object[] objArr2 = new Object[0];
                startRestartGroup.startReplaceableGroup(1215963943);
                changed2 = startRestartGroup.changed(i2);
                i8 = i5;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.a(i2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState32 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 6);
                startRestartGroup.startReplaceableGroup(1215966697);
                rememberedValue3 = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue3 != companion.getEmpty()) {
                }
                animatable = (Animatable) rememberedValue3;
                startRestartGroup.endReplaceableGroup();
                m8170boximpl = UInt.m8170boximpl(i2);
                startRestartGroup.startReplaceableGroup(1215977122);
                changed3 = startRestartGroup.changed(mutableState32) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed3) {
                }
                animatable2 = animatable;
                i9 = i8;
                lifecycleOwner3 = lifecycleOwner2;
                f6 = f4;
                mutableState2 = mutableState;
                f7 = f5;
                modifier5 = modifier4;
                uInt = m8170boximpl;
                composer2 = startRestartGroup;
                rememberedValue4 = new a(i2, i, animatable2, onTimerFinish, mutableState32, null);
                composer2.updateRememberedValue(rememberedValue4);
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i9 >> 24) & 14);
                Boolean valueOf2 = Boolean.valueOf(a((MutableState<Boolean>) mutableState2));
                composer2.startReplaceableGroup(1216010844);
                final MutableState mutableState42 = mutableState2;
                final Animatable animatable32 = animatable2;
                changed4 = composer2.changed(mutableState42) | composer2.changed(animatable32);
                rememberedValue5 = composer2.rememberedValue();
                if (changed4) {
                }
                obj = null;
                rememberedValue5 = new b(animatable32, mutableState42, null);
                composer2.updateRememberedValue(rememberedValue5);
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
                composer2.startReplaceableGroup(1216015257);
                changed5 = composer2.changed(mutableState42) | composer2.changed(animatable32) | composer2.changed(lifecycleOwner3);
                rememberedValue6 = composer2.rememberedValue();
                if (!changed5) {
                }
                rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        return c.a(LifecycleOwner.this, animatable32, mutableState42, (DisposableEffectScope) obj22);
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
                composer2.endReplaceableGroup();
                EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer2, (i9 >> 18) & 14);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                f8 = f6;
                Modifier m172backgroundbw27NRU2 = BackgroundKt.m172backgroundbw27NRU(ClipKt.clip(SizeKt.m461size3ABfNKs(modifier5, f8), RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(Dp.m3840constructorimpl(20))), Color.m1627copywmQWz5c$default(Color.INSTANCE.m1665getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                composer2.startReplaceableGroup(1216045352);
                final String str3 = "timer_container";
                changed6 = composer2.changed("timer_container");
                rememberedValue7 = composer2.rememberedValue();
                if (!changed6) {
                }
                rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        return c.a(str3, (SemanticsPropertyReceiver) obj22);
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
                composer2.endReplaceableGroup();
                Modifier semantics$default2 = SemanticsModifierKt.semantics$default(m172backgroundbw27NRU2, false, (Function1) rememberedValue7, 1, obj);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(semantics$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m1283constructorimpl2 = Updater.m1283constructorimpl(composer2);
                Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl2, density2, companion22.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null);
                composer2.startReplaceableGroup(1205651458);
                f9 = f7;
                changed7 = composer2.changed(j) | composer2.changed(f9) | composer2.changed(animatable32) | composer2.changed(j2);
                rememberedValue8 = composer2.rememberedValue();
                if (changed7) {
                }
                f10 = f8;
                f11 = f9;
                i10 = 6;
                Object obj22 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return c.a(j, f9, animatable32, j2, (DrawScope) obj3);
                    }
                };
                composer2.updateRememberedValue(obj22);
                rememberedValue8 = obj22;
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(fillMaxSize$default2, (Function1) rememberedValue8, composer2, i10);
                m8149m = UByte$$ExternalSyntheticBackport0.m8149m(i2, 10);
                TextStyle button2 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
                long d22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                int m3748getCentere0LSkKk2 = TextAlign.INSTANCE.m3748getCentere0LSkKk();
                composer2.startReplaceableGroup(1205686792);
                final String str22 = "countdown_timer_text";
                changed8 = composer2.changed("countdown_timer_text");
                rememberedValue9 = composer2.rememberedValue();
                if (!changed8) {
                }
                rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return c.b(str22, (SemanticsPropertyReceiver) obj3);
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
                composer2.endReplaceableGroup();
                LifecycleOwner lifecycleOwner52 = lifecycleOwner3;
                Modifier modifier72 = modifier5;
                composer3 = composer2;
                TextKt.m1243TextfLXpl1I(m8149m, SemanticsModifierKt.semantics$default(companion32, false, (Function1) rememberedValue9, 1, null), j2, d22, null, null, null, 0L, null, TextAlign.m3741boximpl(m3748getCentere0LSkKk2), 0L, 0, false, 1, null, button2, composer3, ((i9 << 3) & 896) | 3072, 3072, 24048);
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                lifecycleOwner4 = lifecycleOwner52;
                f12 = f10;
                f13 = f11;
                modifier6 = modifier72;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i4 & 128) == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            if ((38347923 & i5) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            modifier3 = modifier2;
            f3 = m3840constructorimpl2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(1215960328);
            changed = startRestartGroup.changed(lifecycleOwner2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            Object mutableStateOf$default22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default22);
            rememberedValue = mutableStateOf$default22;
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Object[] objArr22 = new Object[0];
            startRestartGroup.startReplaceableGroup(1215963943);
            changed2 = startRestartGroup.changed(i2);
            i8 = i5;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.a(i2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState322 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 6);
            startRestartGroup.startReplaceableGroup(1215966697);
            rememberedValue3 = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue3 != companion.getEmpty()) {
            }
            animatable = (Animatable) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            m8170boximpl = UInt.m8170boximpl(i2);
            startRestartGroup.startReplaceableGroup(1215977122);
            changed3 = startRestartGroup.changed(mutableState322) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3) {
            }
            animatable2 = animatable;
            i9 = i8;
            lifecycleOwner3 = lifecycleOwner2;
            f6 = f4;
            mutableState2 = mutableState;
            f7 = f5;
            modifier5 = modifier4;
            uInt = m8170boximpl;
            composer2 = startRestartGroup;
            rememberedValue4 = new a(i2, i, animatable2, onTimerFinish, mutableState322, null);
            composer2.updateRememberedValue(rememberedValue4);
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i9 >> 24) & 14);
            Boolean valueOf22 = Boolean.valueOf(a((MutableState<Boolean>) mutableState2));
            composer2.startReplaceableGroup(1216010844);
            final MutableState mutableState422 = mutableState2;
            final Animatable animatable322 = animatable2;
            changed4 = composer2.changed(mutableState422) | composer2.changed(animatable322);
            rememberedValue5 = composer2.rememberedValue();
            if (changed4) {
            }
            obj = null;
            rememberedValue5 = new b(animatable322, mutableState422, null);
            composer2.updateRememberedValue(rememberedValue5);
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
            composer2.startReplaceableGroup(1216015257);
            changed5 = composer2.changed(mutableState422) | composer2.changed(animatable322) | composer2.changed(lifecycleOwner3);
            rememberedValue6 = composer2.rememberedValue();
            if (!changed5) {
            }
            rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj222) {
                    return c.a(LifecycleOwner.this, animatable322, mutableState422, (DisposableEffectScope) obj222);
                }
            };
            composer2.updateRememberedValue(rememberedValue6);
            composer2.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer2, (i9 >> 18) & 14);
            Alignment center22 = Alignment.INSTANCE.getCenter();
            f8 = f6;
            Modifier m172backgroundbw27NRU22 = BackgroundKt.m172backgroundbw27NRU(ClipKt.clip(SizeKt.m461size3ABfNKs(modifier5, f8), RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(Dp.m3840constructorimpl(20))), Color.m1627copywmQWz5c$default(Color.INSTANCE.m1665getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            composer2.startReplaceableGroup(1216045352);
            final String str32 = "timer_container";
            changed6 = composer2.changed("timer_container");
            rememberedValue7 = composer2.rememberedValue();
            if (!changed6) {
            }
            rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj222) {
                    return c.a(str32, (SemanticsPropertyReceiver) obj222);
                }
            };
            composer2.updateRememberedValue(rememberedValue7);
            composer2.endReplaceableGroup();
            Modifier semantics$default22 = SemanticsModifierKt.semantics$default(m172backgroundbw27NRU22, false, (Function1) rememberedValue7, 1, obj);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            Density density22 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection22 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(semantics$default22);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m1283constructorimpl22 = Updater.m1283constructorimpl(composer2);
            Updater.m1290setimpl(m1283constructorimpl22, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl22, density22, companion222.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, companion222.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, companion222.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion322 = Modifier.INSTANCE;
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(companion322, 0.0f, 1, null);
            composer2.startReplaceableGroup(1205651458);
            f9 = f7;
            changed7 = composer2.changed(j) | composer2.changed(f9) | composer2.changed(animatable322) | composer2.changed(j2);
            rememberedValue8 = composer2.rememberedValue();
            if (changed7) {
            }
            f10 = f8;
            f11 = f9;
            i10 = 6;
            Object obj222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return c.a(j, f9, animatable322, j2, (DrawScope) obj3);
                }
            };
            composer2.updateRememberedValue(obj222);
            rememberedValue8 = obj222;
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default22, (Function1) rememberedValue8, composer2, i10);
            m8149m = UByte$$ExternalSyntheticBackport0.m8149m(i2, 10);
            TextStyle button22 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
            long d222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
            int m3748getCentere0LSkKk22 = TextAlign.INSTANCE.m3748getCentere0LSkKk();
            composer2.startReplaceableGroup(1205686792);
            final String str222 = "countdown_timer_text";
            changed8 = composer2.changed("countdown_timer_text");
            rememberedValue9 = composer2.rememberedValue();
            if (!changed8) {
            }
            rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return c.b(str222, (SemanticsPropertyReceiver) obj3);
                }
            };
            composer2.updateRememberedValue(rememberedValue9);
            composer2.endReplaceableGroup();
            LifecycleOwner lifecycleOwner522 = lifecycleOwner3;
            Modifier modifier722 = modifier5;
            composer3 = composer2;
            TextKt.m1243TextfLXpl1I(m8149m, SemanticsModifierKt.semantics$default(companion322, false, (Function1) rememberedValue9, 1, null), j2, d222, null, null, null, 0L, null, TextAlign.m3741boximpl(m3748getCentere0LSkKk22), 0L, 0, false, 1, null, button22, composer3, ((i9 << 3) & 896) | 3072, 3072, 24048);
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            lifecycleOwner4 = lifecycleOwner522;
            f12 = f10;
            f13 = f11;
            modifier6 = modifier722;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i4 & 128) == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        if ((38347923 & i5) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        modifier3 = modifier2;
        f3 = m3840constructorimpl2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(1215960328);
        changed = startRestartGroup.changed(lifecycleOwner2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        Object mutableStateOf$default222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default222);
        rememberedValue = mutableStateOf$default222;
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Object[] objArr222 = new Object[0];
        startRestartGroup.startReplaceableGroup(1215963943);
        changed2 = startRestartGroup.changed(i2);
        i8 = i5;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.a(i2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState3222 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr222, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 0, 6);
        startRestartGroup.startReplaceableGroup(1215966697);
        rememberedValue3 = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue3 != companion.getEmpty()) {
        }
        animatable = (Animatable) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        m8170boximpl = UInt.m8170boximpl(i2);
        startRestartGroup.startReplaceableGroup(1215977122);
        changed3 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        animatable2 = animatable;
        i9 = i8;
        lifecycleOwner3 = lifecycleOwner2;
        f6 = f4;
        mutableState2 = mutableState;
        f7 = f5;
        modifier5 = modifier4;
        uInt = m8170boximpl;
        composer2 = startRestartGroup;
        rememberedValue4 = new a(i2, i, animatable2, onTimerFinish, mutableState3222, null);
        composer2.updateRememberedValue(rememberedValue4);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i9 >> 24) & 14);
        Boolean valueOf222 = Boolean.valueOf(a((MutableState<Boolean>) mutableState2));
        composer2.startReplaceableGroup(1216010844);
        final MutableState mutableState4222 = mutableState2;
        final Animatable animatable3222 = animatable2;
        changed4 = composer2.changed(mutableState4222) | composer2.changed(animatable3222);
        rememberedValue5 = composer2.rememberedValue();
        if (changed4) {
        }
        obj = null;
        rememberedValue5 = new b(animatable3222, mutableState4222, null);
        composer2.updateRememberedValue(rememberedValue5);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
        composer2.startReplaceableGroup(1216015257);
        changed5 = composer2.changed(mutableState4222) | composer2.changed(animatable3222) | composer2.changed(lifecycleOwner3);
        rememberedValue6 = composer2.rememberedValue();
        if (!changed5) {
        }
        rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2222) {
                return c.a(LifecycleOwner.this, animatable3222, mutableState4222, (DisposableEffectScope) obj2222);
            }
        };
        composer2.updateRememberedValue(rememberedValue6);
        composer2.endReplaceableGroup();
        EffectsKt.DisposableEffect(lifecycleOwner3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer2, (i9 >> 18) & 14);
        Alignment center222 = Alignment.INSTANCE.getCenter();
        f8 = f6;
        Modifier m172backgroundbw27NRU222 = BackgroundKt.m172backgroundbw27NRU(ClipKt.clip(SizeKt.m461size3ABfNKs(modifier5, f8), RoundedCornerShapeKt.m670RoundedCornerShape0680j_4(Dp.m3840constructorimpl(20))), Color.m1627copywmQWz5c$default(Color.INSTANCE.m1665getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
        composer2.startReplaceableGroup(1216045352);
        final String str322 = "timer_container";
        changed6 = composer2.changed("timer_container");
        rememberedValue7 = composer2.rememberedValue();
        if (!changed6) {
        }
        rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2222) {
                return c.a(str322, (SemanticsPropertyReceiver) obj2222);
            }
        };
        composer2.updateRememberedValue(rememberedValue7);
        composer2.endReplaceableGroup();
        Modifier semantics$default222 = SemanticsModifierKt.semantics$default(m172backgroundbw27NRU222, false, (Function1) rememberedValue7, 1, obj);
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        Density density222 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection222 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor222 = companion2222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(semantics$default222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m1283constructorimpl222 = Updater.m1283constructorimpl(composer2);
        Updater.m1290setimpl(m1283constructorimpl222, rememberBoxMeasurePolicy222, companion2222.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl222, density222, companion2222.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl222, layoutDirection222, companion2222.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl222, viewConfiguration222, companion2222.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion3222 = Modifier.INSTANCE;
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(companion3222, 0.0f, 1, null);
        composer2.startReplaceableGroup(1205651458);
        f9 = f7;
        changed7 = composer2.changed(j) | composer2.changed(f9) | composer2.changed(animatable3222) | composer2.changed(j2);
        rememberedValue8 = composer2.rememberedValue();
        if (changed7) {
        }
        f10 = f8;
        f11 = f9;
        i10 = 6;
        Object obj2222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return c.a(j, f9, animatable3222, j2, (DrawScope) obj3);
            }
        };
        composer2.updateRememberedValue(obj2222);
        rememberedValue8 = obj2222;
        composer2.endReplaceableGroup();
        CanvasKt.Canvas(fillMaxSize$default222, (Function1) rememberedValue8, composer2, i10);
        m8149m = UByte$$ExternalSyntheticBackport0.m8149m(i2, 10);
        TextStyle button222 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
        long d2222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
        int m3748getCentere0LSkKk222 = TextAlign.INSTANCE.m3748getCentere0LSkKk();
        composer2.startReplaceableGroup(1205686792);
        final String str2222 = "countdown_timer_text";
        changed8 = composer2.changed("countdown_timer_text");
        rememberedValue9 = composer2.rememberedValue();
        if (!changed8) {
        }
        rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return c.b(str2222, (SemanticsPropertyReceiver) obj3);
            }
        };
        composer2.updateRememberedValue(rememberedValue9);
        composer2.endReplaceableGroup();
        LifecycleOwner lifecycleOwner5222 = lifecycleOwner3;
        Modifier modifier7222 = modifier5;
        composer3 = composer2;
        TextKt.m1243TextfLXpl1I(m8149m, SemanticsModifierKt.semantics$default(companion3222, false, (Function1) rememberedValue9, 1, null), j2, d2222, null, null, null, 0L, null, TextAlign.m3741boximpl(m3748getCentere0LSkKk222), 0L, 0, false, 1, null, button222, composer3, ((i9 << 3) & 896) | 3072, 3072, 24048);
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        lifecycleOwner4 = lifecycleOwner5222;
        f12 = f10;
        f13 = f11;
        modifier6 = modifier7222;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final int b(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
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
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                c.a(Animatable.this, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new C1569c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final void a(Animatable animatable, MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = d.f11193a[event.ordinal()];
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

    public static final Unit a(long j, float f, Animatable animatable, long j2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long Size = androidx.compose.ui.geometry.SizeKt.Size(Size.m1461getWidthimpl(Canvas.mo2122getSizeNHjbRc()), Size.m1458getHeightimpl(Canvas.mo2122getSizeNHjbRc()));
        float f2 = Canvas.mo315toPx0680j_4(f);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m2102drawArcyD3GUKo$default(Canvas, j, 360.0f, 360.0f, false, 0L, Size, 0.0f, new Stroke(f2, 0.0f, companion.m1933getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            DrawScope.m2102drawArcyD3GUKo$default(Canvas, j2, 270.0f, RangesKt.coerceAtLeast(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, androidx.compose.ui.geometry.SizeKt.Size(Size.m1461getWidthimpl(Canvas.mo2122getSizeNHjbRc()), Size.m1458getHeightimpl(Canvas.mo2122getSizeNHjbRc())), 0.0f, new Stroke(Canvas.mo315toPx0680j_4(f), 0.0f, companion.m1933getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return Unit.INSTANCE;
    }

    public static final boolean a(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}
