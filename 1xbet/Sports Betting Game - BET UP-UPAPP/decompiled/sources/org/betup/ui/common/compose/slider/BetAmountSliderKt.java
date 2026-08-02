package org.betup.ui.common.compose.slider;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;

/* compiled from: BetAmountSlider.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ai\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"BetAmountSlider", "", "modifier", "Landroidx/compose/ui/Modifier;", "amount", "", "maxValue", "minValue", "onValueChange", "Lkotlin/Function1;", "autoSelectHalf", "", "step", "enabled", "(Landroidx/compose/ui/Modifier;JJJLkotlin/jvm/functions/Function1;ZJZLandroidx/compose/runtime/Composer;II)V", "QuickSelectButton", "labelRes", "", "isSelected", "onClick", "Lkotlin/Function0;", "isButtonEnabled", "(IZLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "PreviewBetAmountSlider", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetAmountSliderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetAmountSlider$lambda$13(Modifier modifier, long j, long j2, long j3, Function1 function1, boolean z, long j4, boolean z2, int i, int i2, Composer composer, int i3) {
        BetAmountSlider(modifier, j, j2, j3, function1, z, j4, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetAmountSlider$lambda$15(int i, Composer composer, int i2) {
        PreviewBetAmountSlider(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickSelectButton$lambda$14(int i, boolean z, Function0 function0, boolean z2, int i2, int i3, Composer composer, int i4) {
        QuickSelectButton(i, z, function0, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetAmountSlider$lambda$1$lambda$0(long j) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetAmountSlider(Modifier modifier, long j, long j2, long j3, Function1<? super Long, Unit> function1, boolean z, long j4, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Function1<? super Long, Unit> function12;
        boolean z3;
        final long min;
        final long coerceAtLeast;
        int i10;
        boolean changed;
        BetAmountSliderKt$BetAmountSlider$2$1 rememberedValue;
        int currentCompositeKeyHash;
        Modifier modifier2;
        final Function1<? super Long, Unit> function13;
        Composer m4610constructorimpl;
        final long j7;
        boolean changed2;
        Object rememberedValue2;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        boolean changed3;
        Object rememberedValue3;
        boolean changed4;
        Object rememberedValue4;
        final long j8;
        boolean z4;
        boolean changed5;
        Object rememberedValue5;
        final Function1<? super Long, Unit> function14;
        final Function1<? super Long, Unit> function15;
        final boolean z5;
        final boolean z6;
        final long j9;
        final long j10;
        final long j11;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-433623654);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j5 = j;
            i3 |= startRestartGroup.changed(j5) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                j6 = j2;
                i3 |= startRestartGroup.changed(j6) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(z) ? 131072 : 65536;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(j4) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                        long j12 = i12 == 0 ? 50L : j5;
                        if (i4 != 0) {
                            j6 = 100;
                        }
                        long j13 = i5 == 0 ? 0L : j3;
                        if (i6 == 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new Function1() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit BetAmountSlider$lambda$1$lambda$0;
                                        BetAmountSlider$lambda$1$lambda$0 = BetAmountSliderKt.BetAmountSlider$lambda$1$lambda$0(((Long) obj).longValue());
                                        return BetAmountSlider$lambda$1$lambda$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            function12 = (Function1) rememberedValue6;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            function12 = function1;
                        }
                        z3 = i7 == 0 ? false : z;
                        long j14 = i8 == 0 ? 100L : j4;
                        boolean z7 = i9 == 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-433623654, i3, -1, "org.betup.ui.common.compose.slider.BetAmountSlider (BetAmountSlider.kt:36)");
                        }
                        min = Math.min(j13, j6);
                        long max = Math.max(j13, j6);
                        long j15 = j13;
                        long j16 = j6;
                        coerceAtLeast = RangesKt.coerceAtLeast(max - min, 0L);
                        long coerceIn = RangesKt.coerceIn(j12, min, max);
                        boolean z8 = j12 != max;
                        boolean z9 = j12 != (coerceAtLeast / ((long) 3)) + min;
                        boolean z10 = j12 != (coerceAtLeast / ((long) 2)) + min;
                        Boolean valueOf = Boolean.valueOf(z3);
                        long j17 = j12;
                        startRestartGroup.startReplaceGroup(-1224400529);
                        i10 = 57344 & i3;
                        boolean z11 = z10;
                        changed = ((458752 & i3) != 131072) | (i10 != 16384) | startRestartGroup.changed(min) | startRestartGroup.changed(coerceAtLeast);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new BetAmountSliderKt$BetAmountSlider$2$1(z3, function12, min, coerceAtLeast, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i3 >> 15) & 14);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        boolean z12 = z9;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                        modifier2 = companion;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        boolean z13 = z7;
                        function13 = function12;
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
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int i13 = (int) (coerceIn - min);
                        int i14 = (int) coerceAtLeast;
                        int i15 = (int) min;
                        j7 = j14;
                        int coerceAtLeast2 = RangesKt.coerceAtLeast((int) j7, 1);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changed2 = startRestartGroup.changed(coerceAtLeast) | ((3670016 & i3) != 1048576) | (i10 != 16384) | startRestartGroup.changed(min);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit BetAmountSlider$lambda$12$lambda$4$lambda$3;
                                    BetAmountSlider$lambda$12$lambda$4$lambda$3 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$4$lambda$3(j7, coerceAtLeast, function13, min, ((Integer) obj).intValue());
                                    return BetAmountSlider$lambda$12$lambda$4$lambda$3;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        CustomBorderSliderKt.CustomBorderSlider(null, i13, i14, i15, coerceAtLeast2, z13, (Function1) rememberedValue2, startRestartGroup, (i3 >> 6) & 458752, 1);
                        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(18), 1, null);
                        Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1746271574);
                        changed3 = startRestartGroup.changed(min) | (i10 != 16384) | startRestartGroup.changed(coerceAtLeast);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5;
                                    BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5(Function1.this, min, coerceAtLeast);
                                    return BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        Function0 function0 = (Function0) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        int i16 = ((i3 >> 12) & 7168) | 6;
                        QuickSelectButton(R.string.fraction_one_third, z12, function0, z13, startRestartGroup, i16, 0);
                        startRestartGroup.startReplaceGroup(-1746271574);
                        changed4 = startRestartGroup.changed(min) | (i10 != 16384) | startRestartGroup.changed(coerceAtLeast);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7;
                                    BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7(Function1.this, min, coerceAtLeast);
                                    return BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        QuickSelectButton(R.string.fraction_one_half, z11, (Function0) rememberedValue4, z13, startRestartGroup, i16, 0);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        if (i10 != 16384) {
                            j8 = max;
                            z4 = true;
                        } else {
                            j8 = max;
                            z4 = false;
                        }
                        changed5 = startRestartGroup.changed(j8) | z4;
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            function14 = function13;
                            rememberedValue5 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9;
                                    BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9(Function1.this, j8);
                                    return BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        } else {
                            function14 = function13;
                        }
                        startRestartGroup.endReplaceGroup();
                        QuickSelectButton(R.string.max, z8, (Function0) rememberedValue5, z13, startRestartGroup, i16, 0);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function15 = function14;
                        z5 = z13;
                        z6 = z3;
                        j9 = j16;
                        j10 = j15;
                        j11 = j17;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        z6 = z;
                        z5 = z2;
                        j11 = j5;
                        j9 = j6;
                        j10 = j3;
                        function15 = function1;
                        j7 = j4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BetAmountSlider$lambda$13;
                                BetAmountSlider$lambda$13 = BetAmountSliderKt.BetAmountSlider$lambda$13(Modifier.this, j11, j9, j10, function15, z6, j7, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return BetAmountSlider$lambda$13;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                if ((4793491 & i3) == 4793490) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                min = Math.min(j13, j6);
                long max2 = Math.max(j13, j6);
                long j152 = j13;
                long j162 = j6;
                coerceAtLeast = RangesKt.coerceAtLeast(max2 - min, 0L);
                long coerceIn2 = RangesKt.coerceIn(j12, min, max2);
                if (j12 != max2) {
                }
                if (j12 != (coerceAtLeast / ((long) 3)) + min) {
                }
                if (j12 != (coerceAtLeast / ((long) 2)) + min) {
                }
                Boolean valueOf2 = Boolean.valueOf(z3);
                long j172 = j12;
                startRestartGroup.startReplaceGroup(-1224400529);
                i10 = 57344 & i3;
                boolean z112 = z10;
                changed = ((458752 & i3) != 131072) | (i10 != 16384) | startRestartGroup.changed(min) | startRestartGroup.changed(coerceAtLeast);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new BetAmountSliderKt$BetAmountSlider$2$1(z3, function12, min, coerceAtLeast, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i3 >> 15) & 14);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                boolean z122 = z9;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                modifier2 = companion;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                boolean z132 = z7;
                function13 = function12;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i132 = (int) (coerceIn2 - min);
                int i142 = (int) coerceAtLeast;
                int i152 = (int) min;
                j7 = j14;
                int coerceAtLeast22 = RangesKt.coerceAtLeast((int) j7, 1);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed2 = startRestartGroup.changed(coerceAtLeast) | ((3670016 & i3) != 1048576) | (i10 != 16384) | startRestartGroup.changed(min);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = new Function1() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BetAmountSlider$lambda$12$lambda$4$lambda$3;
                        BetAmountSlider$lambda$12$lambda$4$lambda$3 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$4$lambda$3(j7, coerceAtLeast, function13, min, ((Integer) obj).intValue());
                        return BetAmountSlider$lambda$12$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                CustomBorderSliderKt.CustomBorderSlider(null, i132, i142, i152, coerceAtLeast22, z132, (Function1) rememberedValue2, startRestartGroup, (i3 >> 6) & 458752, 1);
                Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(18), 1, null);
                Arrangement.HorizontalOrVertical spaceEvenly2 = Arrangement.INSTANCE.getSpaceEvenly();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1746271574);
                changed3 = startRestartGroup.changed(min) | (i10 != 16384) | startRestartGroup.changed(coerceAtLeast);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5;
                        BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5(Function1.this, min, coerceAtLeast);
                        return BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                Function0 function02 = (Function0) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                int i162 = ((i3 >> 12) & 7168) | 6;
                QuickSelectButton(R.string.fraction_one_third, z122, function02, z132, startRestartGroup, i162, 0);
                startRestartGroup.startReplaceGroup(-1746271574);
                changed4 = startRestartGroup.changed(min) | (i10 != 16384) | startRestartGroup.changed(coerceAtLeast);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7;
                        BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7(Function1.this, min, coerceAtLeast);
                        return BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                QuickSelectButton(R.string.fraction_one_half, z112, (Function0) rememberedValue4, z132, startRestartGroup, i162, 0);
                startRestartGroup.startReplaceGroup(-1633490746);
                if (i10 != 16384) {
                }
                changed5 = startRestartGroup.changed(j8) | z4;
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed5) {
                }
                function14 = function13;
                rememberedValue5 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9;
                        BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9(Function1.this, j8);
                        return BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceGroup();
                QuickSelectButton(R.string.max, z8, (Function0) rememberedValue5, z132, startRestartGroup, i162, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                function15 = function14;
                z5 = z132;
                z6 = z3;
                j9 = j162;
                j10 = j152;
                j11 = j172;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j6 = j2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            min = Math.min(j13, j6);
            long max22 = Math.max(j13, j6);
            long j1522 = j13;
            long j1622 = j6;
            coerceAtLeast = RangesKt.coerceAtLeast(max22 - min, 0L);
            long coerceIn22 = RangesKt.coerceIn(j12, min, max22);
            if (j12 != max22) {
            }
            if (j12 != (coerceAtLeast / ((long) 3)) + min) {
            }
            if (j12 != (coerceAtLeast / ((long) 2)) + min) {
            }
            Boolean valueOf22 = Boolean.valueOf(z3);
            long j1722 = j12;
            startRestartGroup.startReplaceGroup(-1224400529);
            i10 = 57344 & i3;
            boolean z1122 = z10;
            changed = ((458752 & i3) != 131072) | (i10 != 16384) | startRestartGroup.changed(min) | startRestartGroup.changed(coerceAtLeast);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new BetAmountSliderKt$BetAmountSlider$2$1(z3, function12, min, coerceAtLeast, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i3 >> 15) & 14);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            boolean z1222 = z9;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            modifier2 = companion;
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            boolean z1322 = z7;
            function13 = function12;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            int i1322 = (int) (coerceIn22 - min);
            int i1422 = (int) coerceAtLeast;
            int i1522 = (int) min;
            j7 = j14;
            int coerceAtLeast222 = RangesKt.coerceAtLeast((int) j7, 1);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed2 = startRestartGroup.changed(coerceAtLeast) | ((3670016 & i3) != 1048576) | (i10 != 16384) | startRestartGroup.changed(min);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = new Function1() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BetAmountSlider$lambda$12$lambda$4$lambda$3;
                    BetAmountSlider$lambda$12$lambda$4$lambda$3 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$4$lambda$3(j7, coerceAtLeast, function13, min, ((Integer) obj).intValue());
                    return BetAmountSlider$lambda$12$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            CustomBorderSliderKt.CustomBorderSlider(null, i1322, i1422, i1522, coerceAtLeast222, z1322, (Function1) rememberedValue2, startRestartGroup, (i3 >> 6) & 458752, 1);
            Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(18), 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly22 = Arrangement.INSTANCE.getSpaceEvenly();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceEvenly22, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1746271574);
            changed3 = startRestartGroup.changed(min) | (i10 != 16384) | startRestartGroup.changed(coerceAtLeast);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5;
                    BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5(Function1.this, min, coerceAtLeast);
                    return BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            Function0 function022 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            int i1622 = ((i3 >> 12) & 7168) | 6;
            QuickSelectButton(R.string.fraction_one_third, z1222, function022, z1322, startRestartGroup, i1622, 0);
            startRestartGroup.startReplaceGroup(-1746271574);
            changed4 = startRestartGroup.changed(min) | (i10 != 16384) | startRestartGroup.changed(coerceAtLeast);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7;
                    BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7(Function1.this, min, coerceAtLeast);
                    return BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            QuickSelectButton(R.string.fraction_one_half, z1122, (Function0) rememberedValue4, z1322, startRestartGroup, i1622, 0);
            startRestartGroup.startReplaceGroup(-1633490746);
            if (i10 != 16384) {
            }
            changed5 = startRestartGroup.changed(j8) | z4;
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed5) {
            }
            function14 = function13;
            rememberedValue5 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9;
                    BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9(Function1.this, j8);
                    return BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            QuickSelectButton(R.string.max, z8, (Function0) rememberedValue5, z1322, startRestartGroup, i1622, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function15 = function14;
            z5 = z1322;
            z6 = z3;
            j9 = j1622;
            j10 = j1522;
            j11 = j1722;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        j5 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j6 = j2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        min = Math.min(j13, j6);
        long max222 = Math.max(j13, j6);
        long j15222 = j13;
        long j16222 = j6;
        coerceAtLeast = RangesKt.coerceAtLeast(max222 - min, 0L);
        long coerceIn222 = RangesKt.coerceIn(j12, min, max222);
        if (j12 != max222) {
        }
        if (j12 != (coerceAtLeast / ((long) 3)) + min) {
        }
        if (j12 != (coerceAtLeast / ((long) 2)) + min) {
        }
        Boolean valueOf222 = Boolean.valueOf(z3);
        long j17222 = j12;
        startRestartGroup.startReplaceGroup(-1224400529);
        i10 = 57344 & i3;
        boolean z11222 = z10;
        changed = ((458752 & i3) != 131072) | (i10 != 16384) | startRestartGroup.changed(min) | startRestartGroup.changed(coerceAtLeast);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new BetAmountSliderKt$BetAmountSlider$2$1(z3, function12, min, coerceAtLeast, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i3 >> 15) & 14);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        boolean z12222 = z9;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        modifier2 = companion;
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        boolean z13222 = z7;
        function13 = function12;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        int i13222 = (int) (coerceIn222 - min);
        int i14222 = (int) coerceAtLeast;
        int i15222 = (int) min;
        j7 = j14;
        int coerceAtLeast2222 = RangesKt.coerceAtLeast((int) j7, 1);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed2 = startRestartGroup.changed(coerceAtLeast) | ((3670016 & i3) != 1048576) | (i10 != 16384) | startRestartGroup.changed(min);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new Function1() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BetAmountSlider$lambda$12$lambda$4$lambda$3;
                BetAmountSlider$lambda$12$lambda$4$lambda$3 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$4$lambda$3(j7, coerceAtLeast, function13, min, ((Integer) obj).intValue());
                return BetAmountSlider$lambda$12$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        CustomBorderSliderKt.CustomBorderSlider(null, i13222, i14222, i15222, coerceAtLeast2222, z13222, (Function1) rememberedValue2, startRestartGroup, (i3 >> 6) & 458752, 1);
        Modifier m1518paddingVpY3zN4$default222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(18), 1, null);
        Arrangement.HorizontalOrVertical spaceEvenly222 = Arrangement.INSTANCE.getSpaceEvenly();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceEvenly222, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1746271574);
        changed3 = startRestartGroup.changed(min) | (i10 != 16384) | startRestartGroup.changed(coerceAtLeast);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5;
                BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5(Function1.this, min, coerceAtLeast);
                return BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        Function0 function0222 = (Function0) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        int i16222 = ((i3 >> 12) & 7168) | 6;
        QuickSelectButton(R.string.fraction_one_third, z12222, function0222, z13222, startRestartGroup, i16222, 0);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed4 = startRestartGroup.changed(min) | (i10 != 16384) | startRestartGroup.changed(coerceAtLeast);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7;
                BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7(Function1.this, min, coerceAtLeast);
                return BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        QuickSelectButton(R.string.fraction_one_half, z11222, (Function0) rememberedValue4, z13222, startRestartGroup, i16222, 0);
        startRestartGroup.startReplaceGroup(-1633490746);
        if (i10 != 16384) {
        }
        changed5 = startRestartGroup.changed(j8) | z4;
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changed5) {
        }
        function14 = function13;
        rememberedValue5 = new Function0() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9;
                BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9 = BetAmountSliderKt.BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9(Function1.this, j8);
                return BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        QuickSelectButton(R.string.max, z8, (Function0) rememberedValue5, z13222, startRestartGroup, i16222, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function15 = function14;
        z5 = z13222;
        z6 = z3;
        j9 = j16222;
        j10 = j15222;
        j11 = j17222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetAmountSlider$lambda$12$lambda$4$lambda$3(long j, long j2, Function1 function1, long j3, int i) {
        int coerceAtLeast = RangesKt.coerceAtLeast((int) j, 1);
        function1.invoke(Long.valueOf(RangesKt.coerceIn((i / coerceAtLeast) * coerceAtLeast, 0, (int) j2) + j3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetAmountSlider$lambda$12$lambda$11$lambda$6$lambda$5(Function1 function1, long j, long j2) {
        function1.invoke(Long.valueOf(j + (j2 / 3)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetAmountSlider$lambda$12$lambda$11$lambda$8$lambda$7(Function1 function1, long j, long j2) {
        function1.invoke(Long.valueOf(j + (j2 / 2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetAmountSlider$lambda$12$lambda$11$lambda$10$lambda$9(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void QuickSelectButton(final int i, final boolean z, final Function0<Unit> function0, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1335638172);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    z4 = i5 != 0 ? true : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1335638172, i4, -1, "org.betup.ui.common.compose.slider.QuickSelectButton (BetAmountSlider.kt:108)");
                    }
                    CommonButtonKt.m12915CommonButtonUPEs2M4(null, z, StringResources_androidKt.stringResource(i, startRestartGroup, i4 & 14), true, false, z4, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, (i4 & 112) | 3072 | (458752 & (i4 << 6)) | ((i4 << 12) & 3670016), 0, 0, 2097041);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final boolean z5 = z4;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit QuickSelectButton$lambda$14;
                            QuickSelectButton$lambda$14 = BetAmountSliderKt.QuickSelectButton$lambda$14(i, z, function0, z5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return QuickSelectButton$lambda$14;
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            if ((i4 & 1171) == 1170) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, z, StringResources_androidKt.stringResource(i, startRestartGroup, i4 & 14), true, false, z4, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, (i4 & 112) | 3072 | (458752 & (i4 << 6)) | ((i4 << 12) & 3670016), 0, 0, 2097041);
            if (ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i4 & 1171) == 1170) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        CommonButtonKt.m12915CommonButtonUPEs2M4(null, z, StringResources_androidKt.stringResource(i, startRestartGroup, i4 & 14), true, false, z4, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, (i4 & 112) | 3072 | (458752 & (i4 << 6)) | ((i4 << 12) & 3670016), 0, 0, 2097041);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PreviewBetAmountSlider(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(923360924);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(923360924, i, -1, "org.betup.ui.common.compose.slider.PreviewBetAmountSlider (BetAmountSlider.kt:120)");
            }
            BetAmountSlider(null, 0L, 0L, 0L, null, false, 0L, false, startRestartGroup, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.slider.BetAmountSliderKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBetAmountSlider$lambda$15;
                    PreviewBetAmountSlider$lambda$15 = BetAmountSliderKt.PreviewBetAmountSlider$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBetAmountSlider$lambda$15;
                }
            });
        }
    }
}
