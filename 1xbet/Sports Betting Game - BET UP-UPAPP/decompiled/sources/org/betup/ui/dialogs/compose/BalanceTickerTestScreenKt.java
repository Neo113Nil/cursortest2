package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.common.balance.BalanceAnimatedAmountKt;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BalanceTickerTestScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"INITIAL_TEST_BALANCE", "", "SMALL_INCREMENT", "BIG_INCREMENT", "BalanceTickerTestScreen", "", "selectedMode", "onModeChange", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "balance", "previousBalance"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BalanceTickerTestScreenKt {
    private static final int BIG_INCREMENT = 250;
    private static final int INITIAL_TEST_BALANCE = 12450;
    private static final int SMALL_INCREMENT = 25;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceTickerTestScreen$lambda$19(int i, Function1 function1, Function0 function0, int i2, Composer composer, int i3) {
        BalanceTickerTestScreen(i, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void BalanceTickerTestScreen(final int i, final Function1<? super Integer, Unit> onModeChange, Function0<Unit> onDismiss, Composer composer, int i2) {
        int i3;
        Composer composer2;
        final MutableIntState mutableIntState;
        final int i4;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(onModeChange, "onModeChange");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(32208911);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onModeChange) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(32208911, i5, -1, "org.betup.ui.dialogs.compose.BalanceTickerTestScreen (BalanceTickerTestScreen.kt:39)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(INITIAL_TEST_BALANCE);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(BalanceTickerTestScreen$lambda$1(mutableIntState2));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableIntState mutableIntState3 = (MutableIntState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            float f = 12;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null), Dp.m7774constructorimpl(16));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.balance_big, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(18), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.balance_big, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            float f2 = 10;
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(R.string.balance_animation_mode_ticker, startRestartGroup, 6);
            boolean z = i == 1;
            startRestartGroup.startReplaceGroup(5004770);
            int i6 = i5 & 112;
            boolean z2 = i6 == 32;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.compose.BalanceTickerTestScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BalanceTickerTestScreen$lambda$18$lambda$10$lambda$7$lambda$6;
                        BalanceTickerTestScreen$lambda$18$lambda$10$lambda$7$lambda$6 = BalanceTickerTestScreenKt.BalanceTickerTestScreen$lambda$18$lambda$10$lambda$7$lambda$6(Function1.this);
                        return BalanceTickerTestScreen$lambda$18$lambda$10$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, z, stringResource, false, false, false, (Function0) rememberedValue3, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 3072, 0, 0, 2097073);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.balance_animation_mode_counter, startRestartGroup, 6);
            boolean z3 = i == 2;
            startRestartGroup.startReplaceGroup(5004770);
            boolean z4 = i6 == 32;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.compose.BalanceTickerTestScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BalanceTickerTestScreen$lambda$18$lambda$10$lambda$9$lambda$8;
                        BalanceTickerTestScreen$lambda$18$lambda$10$lambda$9$lambda$8 = BalanceTickerTestScreenKt.BalanceTickerTestScreen$lambda$18$lambda$10$lambda$9$lambda$8(Function1.this);
                        return BalanceTickerTestScreen$lambda$18$lambda$10$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, z3, stringResource2, false, false, false, (Function0) rememberedValue4, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 3072, 0, 0, 2097073);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            BalanceAnimatedAmountKt.m12877BalanceAnimatedAmountL10cc54(BalanceTickerTestScreen$lambda$1(mutableIntState2), BalanceTickerTestScreen$lambda$4(mutableIntState3), i, null, TextUnitKt.getSp(34), startRestartGroup, ((i5 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 24576, 8);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), composer2, 6);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically2, composer2, 54);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-1633490746);
            Object rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                mutableIntState = mutableIntState3;
                rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.compose.BalanceTickerTestScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BalanceTickerTestScreen$lambda$18$lambda$17$lambda$12$lambda$11;
                        BalanceTickerTestScreen$lambda$18$lambda$17$lambda$12$lambda$11 = BalanceTickerTestScreenKt.BalanceTickerTestScreen$lambda$18$lambda$17$lambda$12$lambda$11(MutableIntState.this, mutableIntState);
                        return BalanceTickerTestScreen$lambda$18$lambda$17$lambda$12$lambda$11;
                    }
                };
                composer2.updateRememberedValue(rememberedValue5);
            } else {
                mutableIntState = mutableIntState3;
            }
            composer2.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, true, "25", false, false, false, (Function0) rememberedValue5, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 1575984, 0, 0, 2097073);
            composer2.startReplaceGroup(-1633490746);
            Object rememberedValue6 = composer2.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: org.betup.ui.dialogs.compose.BalanceTickerTestScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BalanceTickerTestScreen$lambda$18$lambda$17$lambda$14$lambda$13;
                        BalanceTickerTestScreen$lambda$18$lambda$17$lambda$14$lambda$13 = BalanceTickerTestScreenKt.BalanceTickerTestScreen$lambda$18$lambda$17$lambda$14$lambda$13(MutableIntState.this, mutableIntState);
                        return BalanceTickerTestScreen$lambda$18$lambda$17$lambda$14$lambda$13;
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            composer2.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, true, "250", false, false, false, (Function0) rememberedValue6, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 1575984, 0, 0, 2097073);
            String stringResource3 = StringResources_androidKt.stringResource(R.string.retry, composer2, 6);
            composer2.startReplaceGroup(-1633490746);
            Object rememberedValue7 = composer2.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.BalanceTickerTestScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BalanceTickerTestScreen$lambda$18$lambda$17$lambda$16$lambda$15;
                        BalanceTickerTestScreen$lambda$18$lambda$17$lambda$16$lambda$15 = BalanceTickerTestScreenKt.BalanceTickerTestScreen$lambda$18$lambda$17$lambda$16$lambda$15(MutableIntState.this, mutableIntState);
                        return BalanceTickerTestScreen$lambda$18$lambda$17$lambda$16$lambda$15;
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
            }
            composer2.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, stringResource3, false, false, false, (Function0) rememberedValue7, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 1575984, 0, 0, 2097073);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14)), composer2, 6);
            i4 = i2;
            function0 = onDismiss;
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, StringResources_androidKt.stringResource(R.string.close, composer2, 6), false, false, false, onDismiss, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, (3670016 & (i5 << 12)) | 3120, 0, 0, 2097073);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
            i4 = i2;
            function0 = onDismiss;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BalanceTickerTestScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BalanceTickerTestScreen$lambda$19;
                    BalanceTickerTestScreen$lambda$19 = BalanceTickerTestScreenKt.BalanceTickerTestScreen$lambda$19(i, onModeChange, function0, i4, (Composer) obj, ((Integer) obj2).intValue());
                    return BalanceTickerTestScreen$lambda$19;
                }
            });
        }
    }

    private static final int BalanceTickerTestScreen$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final int BalanceTickerTestScreen$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceTickerTestScreen$lambda$18$lambda$10$lambda$7$lambda$6(Function1 function1) {
        function1.invoke(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceTickerTestScreen$lambda$18$lambda$10$lambda$9$lambda$8(Function1 function1) {
        function1.invoke(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceTickerTestScreen$lambda$18$lambda$17$lambda$12$lambda$11(MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        mutableIntState2.setIntValue(BalanceTickerTestScreen$lambda$1(mutableIntState));
        mutableIntState.setIntValue(BalanceTickerTestScreen$lambda$1(mutableIntState) + 25);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceTickerTestScreen$lambda$18$lambda$17$lambda$14$lambda$13(MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        mutableIntState2.setIntValue(BalanceTickerTestScreen$lambda$1(mutableIntState));
        mutableIntState.setIntValue(BalanceTickerTestScreen$lambda$1(mutableIntState) + 250);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceTickerTestScreen$lambda$18$lambda$17$lambda$16$lambda$15(MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        mutableIntState2.setIntValue(BalanceTickerTestScreen$lambda$1(mutableIntState));
        mutableIntState.setIntValue(INITIAL_TEST_BALANCE);
        return Unit.INSTANCE;
    }
}
