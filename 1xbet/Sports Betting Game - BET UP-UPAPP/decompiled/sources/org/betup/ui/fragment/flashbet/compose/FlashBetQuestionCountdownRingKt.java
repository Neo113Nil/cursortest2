package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FlashBetQuestionCountdownRing.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u000e\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u008a\u0084\u0002²\u0006'\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bX\u008a\u0084\u0002"}, d2 = {"FlashBetQuestionCountdownRing", "", "initialSeconds", "", "countdownKey", "", "isActive", "", "onExpired", "Lkotlin/Function0;", "onSecondTick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "remainingSeconds", "modifier", "Landroidx/compose/ui/Modifier;", RRWebVideoEvent.JsonKeys.SIZE, "Landroidx/compose/ui/unit/Dp;", "urgentThresholdSeconds", "FlashBetQuestionCountdownRing-0vH8DBg", "(ILjava/lang/Object;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FILandroidx/compose/runtime/Composer;II)V", "app_release", "", "hasExpired", "lastTickSecond", "latestIsActive", "latestOnExpired", "latestOnSecondTick"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetQuestionCountdownRingKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetQuestionCountdownRing_0vH8DBg$lambda$16(int i, Object obj, boolean z, Function0 function0, Function1 function1, Modifier modifier, float f, int i2, int i3, int i4, Composer composer, int i5) {
        m13724FlashBetQuestionCountdownRing0vH8DBg(i, obj, z, function0, function1, modifier, f, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0413  */
    /* renamed from: FlashBetQuestionCountdownRing-0vH8DBg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13724FlashBetQuestionCountdownRing0vH8DBg(final int i, final Object countdownKey, final boolean z, final Function0<Unit> onExpired, Function1<? super Integer, Unit> function1, Modifier modifier, float f, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Function1<? super Integer, Unit> function12;
        int i6;
        Modifier modifier2;
        int i7;
        float f2;
        int i8;
        Modifier modifier3;
        boolean changed;
        Object rememberedValue;
        MutableFloatState mutableFloatState;
        boolean changed2;
        Object rememberedValue2;
        int i9;
        boolean changed3;
        Object rememberedValue3;
        float f3;
        Function1<? super Integer, Unit> function13;
        boolean changed4;
        FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1 rememberedValue4;
        int i10;
        MutableFloatState mutableFloatState2;
        Function1<? super Integer, Unit> function14;
        Modifier modifier4;
        int i11;
        final float coerceIn;
        long j;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changed5;
        Object rememberedValue5;
        float f4;
        Modifier modifier5;
        Composer composer2;
        final int i12;
        final Modifier modifier6;
        final float f5;
        final Function1<? super Integer, Unit> function15;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(countdownKey, "countdownKey");
        Intrinsics.checkNotNullParameter(onExpired, "onExpired");
        Composer startRestartGroup = composer.startRestartGroup(1950870679);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(countdownKey) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(onExpired) ? 2048 : 1024;
        }
        int i13 = i4 & 16;
        if (i13 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            function12 = function1;
            i5 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
            i6 = i4 & 32;
            if (i6 == 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
            }
            i7 = i4 & 64;
            if (i7 == 0) {
                i5 |= 1572864;
                f2 = f;
            } else {
                f2 = f;
                if ((i3 & 1572864) == 0) {
                    i5 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                }
            }
            i8 = i4 & 128;
            if (i8 == 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i5 |= startRestartGroup.changed(i2) ? 8388608 : 4194304;
            }
            if ((i5 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                if (i13 != 0) {
                    function12 = null;
                }
                modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (i7 != 0) {
                    f2 = Dp.m7774constructorimpl(32);
                }
                int i14 = i8 == 0 ? 3 : i2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1950870679, i5, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetQuestionCountdownRing (FlashBetQuestionCountdownRing.kt:42)");
                }
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(countdownKey);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(i);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableFloatState = (MutableFloatState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                changed2 = startRestartGroup.changed(countdownKey);
                rememberedValue2 = startRestartGroup.rememberedValue();
                i9 = i14;
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                changed3 = startRestartGroup.changed(countdownKey);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(i + 1);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                MutableIntState mutableIntState = (MutableIntState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), startRestartGroup, (i5 >> 6) & 14);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onExpired, startRestartGroup, (i5 >> 9) & 14);
                f3 = f2;
                State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function12, startRestartGroup, (i5 >> 12) & 14);
                Boolean valueOf = Boolean.valueOf(z);
                function13 = function12;
                startRestartGroup.startReplaceGroup(-1224400529);
                changed4 = ((i5 & 14) != 4) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableFloatState) | startRestartGroup.changed(mutableIntState) | startRestartGroup.changed(rememberUpdatedState) | startRestartGroup.changed(rememberUpdatedState3) | startRestartGroup.changed(rememberUpdatedState2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    i10 = i5;
                    mutableFloatState2 = mutableFloatState;
                    function14 = function13;
                    modifier4 = modifier3;
                    i11 = 0;
                    rememberedValue4 = new FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1(z, i, mutableState, mutableFloatState2, mutableIntState, rememberUpdatedState, rememberUpdatedState3, rememberUpdatedState2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    i10 = i5;
                    mutableFloatState2 = mutableFloatState;
                    modifier4 = modifier3;
                    function14 = function13;
                    i11 = 0;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(countdownKey, valueOf, (Function2) rememberedValue4, startRestartGroup, (i10 >> 3) & 126);
                coerceIn = i <= 0 ? RangesKt.coerceIn(FlashBetQuestionCountdownRing_0vH8DBg$lambda$1(mutableFloatState2) / i, 0.0f, 1.0f) : 0.0f;
                int coerceAtLeast = RangesKt.coerceAtLeast((int) Math.ceil(FlashBetQuestionCountdownRing_0vH8DBg$lambda$1(mutableFloatState2)), i11);
                if (!RangesKt.rangeUntil(0.0f, i9).contains(Float.valueOf(FlashBetQuestionCountdownRing_0vH8DBg$lambda$1(mutableFloatState2)))) {
                    j = ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
                } else {
                    j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                }
                final long j2 = j;
                final long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                final float m7774constructorimpl = Dp.m7774constructorimpl(2);
                Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(modifier4, f3);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed5 = startRestartGroup.changed(m5167copywmQWz5c$default) | startRestartGroup.changed(coerceIn) | startRestartGroup.changed(j2);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    f4 = f3;
                    modifier5 = modifier4;
                    Function1 function16 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetQuestionCountdownRingKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13;
                            FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13 = FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13(m7774constructorimpl, m5167copywmQWz5c$default, coerceIn, j2, (DrawScope) obj);
                            return FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function16);
                    rememberedValue5 = function16;
                } else {
                    f4 = f3;
                    modifier5 = modifier4;
                }
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue5, startRestartGroup, 6);
                String valueOf2 = String.valueOf(coerceAtLeast);
                composer2 = startRestartGroup;
                TextKt.m2642Text4IGK_g(valueOf2, (Modifier) null, j2, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i12 = i9;
                modifier6 = modifier5;
                f5 = f4;
                function15 = function14;
            } else {
                startRestartGroup.skipToGroupEnd();
                i12 = i2;
                f5 = f2;
                function15 = function12;
                composer2 = startRestartGroup;
                modifier6 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetQuestionCountdownRingKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FlashBetQuestionCountdownRing_0vH8DBg$lambda$16;
                        FlashBetQuestionCountdownRing_0vH8DBg$lambda$16 = FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$16(i, countdownKey, z, onExpired, function15, modifier6, f5, i12, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        return FlashBetQuestionCountdownRing_0vH8DBg$lambda$16;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        i6 = i4 & 32;
        if (i6 == 0) {
        }
        i7 = i4 & 64;
        if (i7 == 0) {
        }
        i8 = i4 & 128;
        if (i8 == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        if (i13 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(countdownKey);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(i);
        startRestartGroup.updateRememberedValue(rememberedValue);
        mutableFloatState = (MutableFloatState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changed2 = startRestartGroup.changed(countdownKey);
        rememberedValue2 = startRestartGroup.rememberedValue();
        i9 = i14;
        if (!changed2) {
        }
        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        MutableState mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changed3 = startRestartGroup.changed(countdownKey);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(i + 1);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        MutableIntState mutableIntState2 = (MutableIntState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), startRestartGroup, (i5 >> 6) & 14);
        State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(onExpired, startRestartGroup, (i5 >> 9) & 14);
        f3 = f2;
        State rememberUpdatedState32 = SnapshotStateKt.rememberUpdatedState(function12, startRestartGroup, (i5 >> 12) & 14);
        Boolean valueOf3 = Boolean.valueOf(z);
        function13 = function12;
        startRestartGroup.startReplaceGroup(-1224400529);
        changed4 = ((i5 & 14) != 4) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableFloatState) | startRestartGroup.changed(mutableIntState2) | startRestartGroup.changed(rememberUpdatedState4) | startRestartGroup.changed(rememberUpdatedState32) | startRestartGroup.changed(rememberUpdatedState22);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed4) {
        }
        i10 = i5;
        mutableFloatState2 = mutableFloatState;
        function14 = function13;
        modifier4 = modifier3;
        i11 = 0;
        rememberedValue4 = new FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1(z, i, mutableState2, mutableFloatState2, mutableIntState2, rememberUpdatedState4, rememberUpdatedState32, rememberUpdatedState22, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(countdownKey, valueOf3, (Function2) rememberedValue4, startRestartGroup, (i10 >> 3) & 126);
        if (i <= 0) {
        }
        int coerceAtLeast2 = RangesKt.coerceAtLeast((int) Math.ceil(FlashBetQuestionCountdownRing_0vH8DBg$lambda$1(mutableFloatState2)), i11);
        if (!RangesKt.rangeUntil(0.0f, i9).contains(Float.valueOf(FlashBetQuestionCountdownRing_0vH8DBg$lambda$1(mutableFloatState2)))) {
        }
        final long j22 = j;
        final long m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        final float m7774constructorimpl2 = Dp.m7774constructorimpl(2);
        Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(modifier4, f3);
        Alignment center2 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed5 = startRestartGroup.changed(m5167copywmQWz5c$default2) | startRestartGroup.changed(coerceIn) | startRestartGroup.changed(j22);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changed5) {
        }
        f4 = f3;
        modifier5 = modifier4;
        Function1 function162 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetQuestionCountdownRingKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13;
                FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13 = FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13(m7774constructorimpl2, m5167copywmQWz5c$default2, coerceIn, j22, (DrawScope) obj);
                return FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13;
            }
        };
        startRestartGroup.updateRememberedValue(function162);
        rememberedValue5 = function162;
        startRestartGroup.endReplaceGroup();
        CanvasKt.Canvas(fillMaxSize$default2, (Function1) rememberedValue5, startRestartGroup, 6);
        String valueOf22 = String.valueOf(coerceAtLeast2);
        composer2 = startRestartGroup;
        TextKt.m2642Text4IGK_g(valueOf22, (Modifier) null, j22, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        i12 = i9;
        modifier6 = modifier5;
        f5 = f4;
        function15 = function14;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final float FlashBetQuestionCountdownRing_0vH8DBg$lambda$1(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetQuestionCountdownRing_0vH8DBg$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetQuestionCountdownRing_0vH8DBg$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetQuestionCountdownRing_0vH8DBg$lambda$7(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetQuestionCountdownRing_0vH8DBg$lambda$15$lambda$14$lambda$13(float f, long j, float f2, long j2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f3 = Canvas.mo1167toPx0680j_4(f);
        float m4995getMinDimensionimpl = Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) - f3;
        float intBitsToFloat = (Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) - m4995getMinDimensionimpl) / 2.0f;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) - m4995getMinDimensionimpl) / 2.0f;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        long m4987constructorimpl = Size.m4987constructorimpl((Float.floatToRawIntBits(m4995getMinDimensionimpl) << 32) | (Float.floatToRawIntBits(m4995getMinDimensionimpl) & 4294967295L));
        DrawScope.m5709drawArcyD3GUKo$default(Canvas, j, 0.0f, 360.0f, false, m4919constructorimpl, m4987constructorimpl, 0.0f, new Stroke(f3, 0.0f, StrokeCap.INSTANCE.m5523getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        if (f2 > 0.0f) {
            DrawScope.m5709drawArcyD3GUKo$default(Canvas, j2, -90.0f, f2 * 360.0f, false, m4919constructorimpl, m4987constructorimpl, 0.0f, new Stroke(f3, 0.0f, StrokeCap.INSTANCE.m5523getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetQuestionCountdownRing_0vH8DBg$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> FlashBetQuestionCountdownRing_0vH8DBg$lambda$10(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Integer, Unit> FlashBetQuestionCountdownRing_0vH8DBg$lambda$11(State<? extends Function1<? super Integer, Unit>> state) {
        return (Function1) state.getValue();
    }
}
