package org.betup.ui.tour.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.CommonButtonMatchBetKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.OddHelper;

/* compiled from: TourDemoMatchScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TourDemoMatchScreenKt$TourDemoMatchScreen$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ double $coefficientDraw;
    final /* synthetic */ double $coefficientWin1;
    final /* synthetic */ double $coefficientWin2;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function1<String, Unit> $onBetSelected;
    final /* synthetic */ String $selectedBet;

    /* JADX WARN: Multi-variable type inference failed */
    TourDemoMatchScreenKt$TourDemoMatchScreen$1(OddType oddType, double d, String str, Function1<? super String, Unit> function1, double d2, double d3) {
        this.$oddType = oddType;
        this.$coefficientWin1 = d;
        this.$selectedBet = str;
        this.$onBetSelected = function1;
        this.$coefficientDraw = d2;
        this.$coefficientWin2 = d3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$3$lambda$2(Function1 function1) {
        function1.invoke("win_1");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4(Function1 function1) {
        function1.invoke("draw");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(Function1 function1) {
        function1.invoke("win_2");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        double d;
        OddType oddType;
        double d2;
        OddType oddType2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-603046836, i, -1, "org.betup.ui.tour.compose.TourDemoMatchScreen.<anonymous> (TourDemoMatchScreen.kt:84)");
        }
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(14));
        OddType oddType3 = this.$oddType;
        double d3 = this.$coefficientWin1;
        String str = this.$selectedBet;
        final Function1<String, Unit> function1 = this.$onBetSelected;
        double d4 = this.$coefficientDraw;
        double d5 = this.$coefficientWin2;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TeamsRowKt.m13615TeamsRowUiefj4(null, StringResources_androidKt.stringResource(R.string.tour_demo_team_germany, composer, 6), StringResources_androidKt.stringResource(R.string.tour_demo_team_brazil, composer, 6), "https://betup.org/uploads_api/league/53.png", "https://betup.org/uploads_api/league/31.png", null, null, null, StringResources_androidKt.stringResource(R.string.tour_demo_match_time, composer, 6), StringResources_androidKt.stringResource(R.string.tour_demo_match_date, composer, 6), null, false, false, false, false, false, false, 0, null, null, 0.0f, 0.0f, false, composer, 1797120, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8383617);
        float f = 12;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer, 6);
        String stringResource = StringResources_androidKt.stringResource(R.string.tour_demo_regular_time, composer, 6);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourDemoMatchScreenKt$TourDemoMatchScreen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(fillMaxWidth$default, true, stringResource, false, false, false, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 1572918, 0, 0, 2097080);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer, 6);
        Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4))), Dp.m7774constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_demo_who_will_win, composer, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 48, 0, 65532);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer, 6);
        DividerKt.m2440DivideroMI9zvI(null, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), Dp.m7774constructorimpl(1), 0.0f, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 9);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer, 6);
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        String stringResource2 = StringResources_androidKt.stringResource(R.string.win_1, composer, 6);
        if (oddType3 == null) {
            oddType = OddType.DECIMAL;
            d = d3;
        } else {
            d = d3;
            oddType = oddType3;
        }
        String format = OddHelper.format(oddType, d);
        boolean areEqual = Intrinsics.areEqual(str, "win_1");
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(function1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.tour.compose.TourDemoMatchScreenKt$TourDemoMatchScreen$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9$lambda$8$lambda$3$lambda$2;
                    invoke$lambda$10$lambda$9$lambda$8$lambda$3$lambda$2 = TourDemoMatchScreenKt$TourDemoMatchScreen$1.invoke$lambda$10$lambda$9$lambda$8$lambda$3$lambda$2(Function1.this);
                    return invoke$lambda$10$lambda$9$lambda$8$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        CommonButtonMatchBetKt.CommonButtonMatchBet(weight$default, areEqual, stringResource2, true, true, format, true, (Function0) rememberedValue2, null, false, false, null, false, false, false, false, false, null, composer, 1600512, 0, 261888);
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        String stringResource3 = StringResources_androidKt.stringResource(R.string.draw, composer, 6);
        if (oddType3 == null) {
            oddType2 = OddType.DECIMAL;
            d2 = d4;
        } else {
            d2 = d4;
            oddType2 = oddType3;
        }
        String format2 = OddHelper.format(oddType2, d2);
        boolean areEqual2 = Intrinsics.areEqual(str, "draw");
        composer.startReplaceGroup(5004770);
        boolean changed2 = composer.changed(function1);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.tour.compose.TourDemoMatchScreenKt$TourDemoMatchScreen$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4;
                    invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4 = TourDemoMatchScreenKt$TourDemoMatchScreen$1.invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4(Function1.this);
                    return invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        CommonButtonMatchBetKt.CommonButtonMatchBet(weight$default2, areEqual2, stringResource3, true, true, format2, true, (Function0) rememberedValue3, null, false, false, null, false, false, false, false, false, null, composer, 1600512, 0, 261888);
        Modifier weight$default3 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        String stringResource4 = StringResources_androidKt.stringResource(R.string.win_2, composer, 6);
        String format3 = OddHelper.format(oddType3 == null ? OddType.DECIMAL : oddType3, d5);
        boolean areEqual3 = Intrinsics.areEqual(str, "win_2");
        composer.startReplaceGroup(5004770);
        boolean changed3 = composer.changed(function1);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.tour.compose.TourDemoMatchScreenKt$TourDemoMatchScreen$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6;
                    invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6 = TourDemoMatchScreenKt$TourDemoMatchScreen$1.invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(Function1.this);
                    return invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        CommonButtonMatchBetKt.CommonButtonMatchBet(weight$default3, areEqual3, stringResource4, true, true, format3, true, (Function0) rememberedValue4, null, false, false, null, false, false, false, false, false, null, composer, 1600512, 0, 261888);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
