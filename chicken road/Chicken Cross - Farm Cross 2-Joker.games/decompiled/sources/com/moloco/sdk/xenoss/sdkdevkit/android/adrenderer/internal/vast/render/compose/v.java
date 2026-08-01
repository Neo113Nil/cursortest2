package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class v {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastProgressBarKt$VastProgressBar$1$1", f = "VastProgressBar.kt", i = {}, l = {65, 67, 75}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11457a;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Animatable<Float, AnimationVector1D> animatable, float f, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = animatable;
            this.c = f;
            this.d = z;
            this.e = iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11457a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.b;
                Float boxFloat = Boxing.boxFloat(this.c);
                this.f11457a = 1;
                if (animatable.snapTo(boxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!this.d || !(this.e instanceof i.c)) {
                Animatable<Float, AnimationVector1D> animatable2 = this.b;
                this.f11457a = 3;
                if (animatable2.stop(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Unit unit2 = Unit.INSTANCE;
                return Unit.INSTANCE;
            }
            Animatable<Float, AnimationVector1D> animatable3 = this.b;
            Float boxFloat2 = Boxing.boxFloat(1.0f);
            TweenSpec tween$default = AnimationSpecKt.tween$default(v.d(this.e), 0, EasingKt.getLinearEasing(), 2, null);
            this.f11457a = 2;
            if (Animatable.animateTo$default(animatable3, boxFloat2, tween$default, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, i | 1);
        return Unit.INSTANCE;
    }

    public static final float c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        if (iVar instanceof i.a) {
            return 100.0f;
        }
        if (iVar instanceof i.c) {
            if (((i.c) iVar).d() != 0) {
                return (float) (r4.c() / r4.d());
            }
        } else if (!(iVar instanceof i.d) && !Intrinsics.areEqual(iVar, i.b.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return 0.0f;
    }

    public static final int d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        if (iVar instanceof i.a) {
            return 0;
        }
        if (iVar instanceof i.c) {
            i.c cVar = (i.c) iVar;
            if (cVar.d() == 0) {
                return 0;
            }
            return RangesKt.coerceAtLeast((int) (cVar.d() - cVar.c()), 0);
        }
        if ((iVar instanceof i.d) || Intrinsics.areEqual(iVar, i.b.b)) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Unit a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        a(z, iVar, modifier, j, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if ((r28 & 8) != 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        Modifier modifier3;
        float f;
        float m3840constructorimpl;
        Object rememberedValue;
        Composer.Companion companion;
        float max;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        final float f2;
        int i4;
        float f3;
        Modifier modifier4;
        Composer composer2;
        boolean changed2;
        Object rememberedValue4;
        final long j3;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer startRestartGroup = composer.startRestartGroup(632891183);
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
                composer2 = startRestartGroup;
                modifier5 = modifier2;
                j3 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m976getPrimary0d7_KjU();
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    final long j4 = j2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(632891183, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastProgressBar (VastProgressBar.kt:52)");
                    }
                    f = 4;
                    m3840constructorimpl = Dp.m3840constructorimpl(f);
                    Object[] objArr = new Object[0];
                    startRestartGroup.startReplaceableGroup(-1652684781);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return v.a();
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    MutableState mutableState = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
                    max = Math.max(c(progress), a((MutableState<Float>) mutableState));
                    startRestartGroup.startReplaceableGroup(-1652680550);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = AnimatableKt.Animatable$default(max, 0.0f, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final Animatable animatable = (Animatable) rememberedValue2;
                    startRestartGroup.endReplaceableGroup();
                    a((MutableState<Float>) mutableState, ((Number) animatable.getValue()).floatValue());
                    Boolean valueOf = Boolean.valueOf(z);
                    startRestartGroup.startReplaceableGroup(-1652675684);
                    changed = startRestartGroup.changed(animatable) | startRestartGroup.changed(max) | startRestartGroup.changed(z) | startRestartGroup.changed(progress);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == companion.getEmpty()) {
                        f2 = m3840constructorimpl;
                        i4 = i3;
                        f3 = f;
                        modifier4 = modifier3;
                        composer2 = startRestartGroup;
                        rememberedValue3 = new a(animatable, max, z, progress, null);
                        composer2.updateRememberedValue(rememberedValue3);
                    } else {
                        f2 = m3840constructorimpl;
                        i4 = i3;
                        f3 = f;
                        modifier4 = modifier3;
                        composer2 = startRestartGroup;
                    }
                    composer2.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(progress, valueOf, (Function2) rememberedValue3, composer2, ((i4 >> 3) & 14) | ((i4 << 3) & 112));
                    Modifier m447height3ABfNKs = SizeKt.m447height3ABfNKs(modifier4, Dp.m3840constructorimpl(f3));
                    composer2.startReplaceableGroup(-1652659568);
                    changed2 = composer2.changed(animatable) | composer2.changed(f2) | composer2.changed(j4);
                    rememberedValue4 = composer2.rememberedValue();
                    if (!changed2 || rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return v.a(Animatable.this, f2, j4, (DrawScope) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    BoxKt.Box(DrawModifierKt.drawBehind(m447height3ABfNKs, (Function1) rememberedValue4), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = j4;
                    modifier5 = modifier4;
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v.a(z, progress, modifier5, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if (ComposerKt.isTraceInProgress()) {
        }
        f = 4;
        m3840constructorimpl = Dp.m3840constructorimpl(f);
        Object[] objArr2 = new Object[0];
        startRestartGroup.startReplaceableGroup(-1652684781);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m1296rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
        max = Math.max(c(progress), a((MutableState<Float>) mutableState2));
        startRestartGroup.startReplaceableGroup(-1652680550);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        final Animatable animatable2 = (Animatable) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        a((MutableState<Float>) mutableState2, ((Number) animatable2.getValue()).floatValue());
        Boolean valueOf2 = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(-1652675684);
        changed = startRestartGroup.changed(animatable2) | startRestartGroup.changed(max) | startRestartGroup.changed(z) | startRestartGroup.changed(progress);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        f2 = m3840constructorimpl;
        i4 = i3;
        f3 = f;
        modifier4 = modifier3;
        composer2 = startRestartGroup;
        rememberedValue3 = new a(animatable2, max, z, progress, null);
        composer2.updateRememberedValue(rememberedValue3);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(progress, valueOf2, (Function2) rememberedValue3, composer2, ((i4 >> 3) & 14) | ((i4 << 3) & 112));
        Modifier m447height3ABfNKs2 = SizeKt.m447height3ABfNKs(modifier4, Dp.m3840constructorimpl(f3));
        composer2.startReplaceableGroup(-1652659568);
        changed2 = composer2.changed(animatable2) | composer2.changed(f2) | composer2.changed(j42);
        rememberedValue4 = composer2.rememberedValue();
        if (!changed2) {
        }
        rememberedValue4 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.a(Animatable.this, f2, j42, (DrawScope) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue4);
        composer2.endReplaceableGroup();
        BoxKt.Box(DrawModifierKt.drawBehind(m447height3ABfNKs2, (Function1) rememberedValue4), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j3 = j42;
        modifier5 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    public static final MutableState a() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
    }

    public static final Unit a(Animatable animatable, float f, long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m2119drawRoundRectuAw5IA$default(drawBehind, j, 0L, androidx.compose.ui.geometry.SizeKt.Size(((Number) animatable.getValue()).floatValue() * Size.m1461getWidthimpl(drawBehind.mo2122getSizeNHjbRc()), Size.m1458getHeightimpl(drawBehind.mo2122getSizeNHjbRc())), CornerRadiusKt.CornerRadius(f, f), null, 0.0f, null, 0, 242, null);
        return Unit.INSTANCE;
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1397199635);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1397199635, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Preview (VastProgressBar.kt:120)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, f.f11404a.a(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float a(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }
}
