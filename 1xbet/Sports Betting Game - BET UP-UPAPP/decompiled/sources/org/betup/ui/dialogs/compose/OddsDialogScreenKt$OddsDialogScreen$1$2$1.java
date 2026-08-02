package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
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
import io.bidmachine.media3.extractor.WavUtil;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.ui.common.compose.CommonButtonMatchBetKt;
import org.betup.ui.common.compose.OddsFormatTabButtonKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.OddHelper;

/* compiled from: OddsDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OddsDialogScreenKt$OddsDialogScreen$1$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $coefFormatted;
    final /* synthetic */ double $demoCoefficientDraw;
    final /* synthetic */ double $demoCoefficientWin1;
    final /* synthetic */ double $demoCoefficientWin2;
    final /* synthetic */ boolean $isInTour;
    final /* synthetic */ OddType $oddFormatForPreview;
    final /* synthetic */ Function0<Unit> $onOpenDefaultBetAmount;
    final /* synthetic */ long $previewStake;
    final /* synthetic */ long $profit;
    final /* synthetic */ MutableState<DemoBetOutcome> $selectedDemoOutcome$delegate;
    final /* synthetic */ MutableState<OddType> $selectedOddType$delegate;
    final /* synthetic */ long $totalWin;

    /* compiled from: OddsDialogScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DemoBetOutcome.values().length];
            try {
                iArr[DemoBetOutcome.WIN1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DemoBetOutcome.DRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DemoBetOutcome.WIN2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    OddsDialogScreenKt$OddsDialogScreen$1$2$1(boolean z, Function0<Unit> function0, MutableState<OddType> mutableState, OddType oddType, double d, double d2, double d3, MutableState<DemoBetOutcome> mutableState2, long j, long j2, long j3, String str) {
        this.$isInTour = z;
        this.$onOpenDefaultBetAmount = function0;
        this.$selectedOddType$delegate = mutableState;
        this.$oddFormatForPreview = oddType;
        this.$demoCoefficientWin1 = d;
        this.$demoCoefficientDraw = d2;
        this.$demoCoefficientWin2 = d3;
        this.$selectedDemoOutcome$delegate = mutableState2;
        this.$previewStake = j;
        this.$totalWin = j2;
        this.$profit = j3;
        this.$coefFormatted = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$6$lambda$1$lambda$0(MutableState mutableState) {
        mutableState.setValue(OddType.DECIMAL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$6$lambda$3$lambda$2(MutableState mutableState) {
        mutableState.setValue(OddType.AMERICAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$6$lambda$5$lambda$4(MutableState mutableState) {
        mutableState.setValue(OddType.FRACTIONAL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$8$lambda$7(MutableState mutableState) {
        mutableState.setValue(DemoBetOutcome.WIN1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9(MutableState mutableState) {
        mutableState.setValue(DemoBetOutcome.DRAW);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11(MutableState mutableState) {
        mutableState.setValue(DemoBetOutcome.WIN2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$21$lambda$20(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OddType OddsDialogScreen_g3amZ_k$lambda$4;
        OddType OddsDialogScreen_g3amZ_k$lambda$42;
        int i2;
        boolean z;
        OddType OddsDialogScreen_g3amZ_k$lambda$43;
        RoundedCornerShape roundedCornerShape;
        RoundedCornerShape roundedCornerShape2;
        RoundedCornerShape roundedCornerShape3;
        DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$7;
        boolean z2;
        int i3;
        final MutableState<DemoBetOutcome> mutableState;
        DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$72;
        final MutableState<DemoBetOutcome> mutableState2;
        DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$73;
        final MutableState<DemoBetOutcome> mutableState3;
        DemoBetOutcome OddsDialogScreen_g3amZ_k$lambda$74;
        int i4;
        String str;
        RoundedCornerShape roundedCornerShape4;
        RoundedCornerShape roundedCornerShape5;
        RoundedCornerShape roundedCornerShape6;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1854933435, i, -1, "org.betup.ui.dialogs.compose.OddsDialogScreen.<anonymous>.<anonymous>.<anonymous> (OddsDialogScreen.kt:290)");
        }
        float f = 10;
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(14), Dp.m7774constructorimpl(f));
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        boolean z3 = this.$isInTour;
        final Function0<Unit> function0 = this.$onOpenDefaultBetAmount;
        final MutableState<OddType> mutableState4 = this.$selectedOddType$delegate;
        OddType oddType = this.$oddFormatForPreview;
        double d = this.$demoCoefficientWin1;
        double d2 = this.$demoCoefficientDraw;
        double d3 = this.$demoCoefficientWin2;
        MutableState<DemoBetOutcome> mutableState5 = this.$selectedDemoOutcome$delegate;
        long j = this.$previewStake;
        long j2 = this.$totalWin;
        long j3 = this.$profit;
        String str2 = this.$coefFormatted;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        float f2 = 6;
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
        String stringResource = StringResources_androidKt.stringResource(R.string.odds_format_tab_decimal, composer, 6);
        String stringResource2 = StringResources_androidKt.stringResource(R.string.odds_dialog_format_default, composer, 6);
        OddsDialogScreen_g3amZ_k$lambda$4 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$4(mutableState4);
        boolean z4 = OddsDialogScreen_g3amZ_k$lambda$4 == OddType.DECIMAL;
        composer.startReplaceGroup(5004770);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$22$lambda$6$lambda$1$lambda$0;
                    invoke$lambda$22$lambda$6$lambda$1$lambda$0 = OddsDialogScreenKt$OddsDialogScreen$1$2$1.invoke$lambda$22$lambda$6$lambda$1$lambda$0(MutableState.this);
                    return invoke$lambda$22$lambda$6$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        OddsFormatTabButtonKt.OddsFormatTabButton(fillMaxWidth$default2, stringResource, stringResource2, z4, (Function0) rememberedValue, composer, 24576, 0);
        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
        String stringResource3 = StringResources_androidKt.stringResource(R.string.odds_format_tab_american, composer, 6);
        OddsDialogScreen_g3amZ_k$lambda$42 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$4(mutableState4);
        if (OddsDialogScreen_g3amZ_k$lambda$42 == OddType.AMERICAN) {
            i2 = 5004770;
            z = true;
        } else {
            i2 = 5004770;
            z = false;
        }
        composer.startReplaceGroup(i2);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$22$lambda$6$lambda$3$lambda$2;
                    invoke$lambda$22$lambda$6$lambda$3$lambda$2 = OddsDialogScreenKt$OddsDialogScreen$1$2$1.invoke$lambda$22$lambda$6$lambda$3$lambda$2(MutableState.this);
                    return invoke$lambda$22$lambda$6$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        OddsFormatTabButtonKt.OddsFormatTabButton(fillMaxWidth$default3, stringResource3, null, z, (Function0) rememberedValue2, composer, 24960, 0);
        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
        String stringResource4 = StringResources_androidKt.stringResource(R.string.odds_format_tab_fractional, composer, 6);
        OddsDialogScreen_g3amZ_k$lambda$43 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$4(mutableState4);
        boolean z5 = OddsDialogScreen_g3amZ_k$lambda$43 == OddType.FRACTIONAL;
        composer.startReplaceGroup(5004770);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$22$lambda$6$lambda$5$lambda$4;
                    invoke$lambda$22$lambda$6$lambda$5$lambda$4 = OddsDialogScreenKt$OddsDialogScreen$1$2$1.invoke$lambda$22$lambda$6$lambda$5$lambda$4(MutableState.this);
                    return invoke$lambda$22$lambda$6$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        OddsFormatTabButtonKt.OddsFormatTabButton(fillMaxWidth$default4, stringResource4, null, z5, (Function0) rememberedValue3, composer, 24960, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float f3 = 8;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer, 6);
        Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        float f4 = 1;
        float m7774constructorimpl = Dp.m7774constructorimpl(f4);
        Brush brush = ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush();
        roundedCornerShape = OddsDialogScreenKt.OddsDialogMatchPreviewOuterShape;
        Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BorderKt.m1038borderziNgDLE(fillMaxWidth$default5, m7774constructorimpl, brush, roundedCornerShape), Dp.m7774constructorimpl(5));
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs);
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
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        float m7774constructorimpl2 = Dp.m7774constructorimpl(f4);
        Brush brush2 = ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush();
        roundedCornerShape2 = OddsDialogScreenKt.OddsDialogMatchPreviewInnerShape;
        Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(fillMaxWidth$default6, m7774constructorimpl2, brush2, roundedCornerShape2);
        long j4 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
        roundedCornerShape3 = OddsDialogScreenKt.OddsDialogMatchPreviewInnerShape;
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(m1038borderziNgDLE, j4, roundedCornerShape3), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
        TeamsRowKt.m13615TeamsRowUiefj4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), StringResources_androidKt.stringResource(R.string.tour_demo_team_germany, composer, 6), StringResources_androidKt.stringResource(R.string.tour_demo_team_brazil, composer, 6), "https://betup.org/uploads_api/league/53.png", "https://betup.org/uploads_api/league/31.png", null, null, null, StringResources_androidKt.stringResource(R.string.tour_demo_match_time, composer, 6), StringResources_androidKt.stringResource(R.string.tour_demo_match_date, composer, 6), null, false, false, false, true, false, false, 0, null, null, 0.0f, 0.0f, false, composer, 1797126, 24960, 0, 8367232);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer, 6);
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_demo_who_will_win, composer, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 48, 0, 65532);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer, 6);
        DividerKt.m2440DivideroMI9zvI(null, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), Dp.m7774constructorimpl(f4), 0.0f, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 9);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer, 6);
        Modifier fillMaxWidth$default7 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default7);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor5);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        Modifier weight$default = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
        String stringResource5 = StringResources_androidKt.stringResource(R.string.win_1, composer, 6);
        String format = OddHelper.format(oddType, d);
        OddsDialogScreen_g3amZ_k$lambda$7 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$7(mutableState5);
        if (OddsDialogScreen_g3amZ_k$lambda$7 == DemoBetOutcome.WIN1) {
            i3 = 5004770;
            z2 = true;
        } else {
            z2 = false;
            i3 = 5004770;
        }
        composer.startReplaceGroup(i3);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            mutableState = mutableState5;
            rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$8$lambda$7;
                    invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$8$lambda$7 = OddsDialogScreenKt$OddsDialogScreen$1$2$1.invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$8$lambda$7(MutableState.this);
                    return invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        } else {
            mutableState = mutableState5;
        }
        MutableState<DemoBetOutcome> mutableState6 = mutableState;
        composer.endReplaceGroup();
        CommonButtonMatchBetKt.CommonButtonMatchBet(weight$default, z2, stringResource5, true, true, format, true, (Function0) rememberedValue4, null, false, false, null, false, false, false, false, false, null, composer, 14183424, 0, 261888);
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
        String stringResource6 = StringResources_androidKt.stringResource(R.string.draw, composer, 6);
        String format2 = OddHelper.format(oddType, d2);
        OddsDialogScreen_g3amZ_k$lambda$72 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$7(mutableState6);
        boolean z6 = OddsDialogScreen_g3amZ_k$lambda$72 == DemoBetOutcome.DRAW;
        composer.startReplaceGroup(5004770);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            mutableState2 = mutableState6;
            rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9;
                    invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9 = OddsDialogScreenKt$OddsDialogScreen$1$2$1.invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9(MutableState.this);
                    return invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        } else {
            mutableState2 = mutableState6;
        }
        composer.endReplaceGroup();
        MutableState<DemoBetOutcome> mutableState7 = mutableState2;
        CommonButtonMatchBetKt.CommonButtonMatchBet(weight$default2, z6, stringResource6, true, true, format2, true, (Function0) rememberedValue5, null, false, false, null, false, false, false, false, false, null, composer, 14183424, 0, 261888);
        Modifier weight$default3 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
        String stringResource7 = StringResources_androidKt.stringResource(R.string.win_2, composer, 6);
        String format3 = OddHelper.format(oddType, d3);
        OddsDialogScreen_g3amZ_k$lambda$73 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$7(mutableState7);
        boolean z7 = OddsDialogScreen_g3amZ_k$lambda$73 == DemoBetOutcome.WIN2;
        composer.startReplaceGroup(5004770);
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            mutableState3 = mutableState7;
            rememberedValue6 = new Function0() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11;
                    invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11 = OddsDialogScreenKt$OddsDialogScreen$1$2$1.invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11(MutableState.this);
                    return invoke$lambda$22$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        } else {
            mutableState3 = mutableState7;
        }
        composer.endReplaceGroup();
        CommonButtonMatchBetKt.CommonButtonMatchBet(weight$default3, z7, stringResource7, true, true, format3, true, (Function0) rememberedValue6, null, false, false, null, false, false, false, false, false, null, composer, 14183424, 0, 261888);
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
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer, 6);
        OddsDialogScreen_g3amZ_k$lambda$74 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$7(mutableState3);
        int i5 = WhenMappings.$EnumSwitchMapping$0[OddsDialogScreen_g3amZ_k$lambda$74.ordinal()];
        if (i5 == 1) {
            i4 = 3;
            composer.startReplaceGroup(377348073);
            str = StringResources_androidKt.stringResource(R.string.win_1, composer, 6) + " - " + StringResources_androidKt.stringResource(R.string.tour_demo_team_germany, composer, 6);
            composer.endReplaceGroup();
        } else if (i5 != 2) {
            i4 = 3;
            if (i5 != 3) {
                composer.startReplaceGroup(377344879);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(377356168);
            str = StringResources_androidKt.stringResource(R.string.win_2, composer, 6) + " - " + StringResources_androidKt.stringResource(R.string.tour_demo_team_brazil, composer, 6);
            composer.endReplaceGroup();
        } else {
            i4 = 3;
            composer.startReplaceGroup(377352494);
            str = StringResources_androidKt.stringResource(R.string.draw, composer, 6);
            composer.endReplaceGroup();
        }
        String str3 = str;
        Modifier fillMaxWidth$default8 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        BorderStroke borderStroke = new BorderStroke(Dp.m7774constructorimpl(f4), ComposeUtils.AppBrushPalette.ButtonBackgroundGoldBorder.INSTANCE.getBrush(), null);
        roundedCornerShape4 = OddsDialogScreenKt.OddsDialogSelectedBetOuterShape;
        Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BorderKt.border(fillMaxWidth$default8, borderStroke, roundedCornerShape4), Dp.m7774constructorimpl(i4));
        float m7774constructorimpl3 = Dp.m7774constructorimpl(f4);
        long j5 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
        roundedCornerShape5 = OddsDialogScreenKt.OddsDialogSelectedBetInnerShape;
        Modifier m1036borderxT4_qwU = BorderKt.m1036borderxT4_qwU(m1516padding3ABfNKs2, m7774constructorimpl3, j5, roundedCornerShape5);
        long j6 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
        roundedCornerShape6 = OddsDialogScreenKt.OddsDialogSelectedBetInnerShape;
        Modifier m1516padding3ABfNKs3 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(m1036borderxT4_qwU, j6, roundedCornerShape6), Dp.m7774constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs3);
        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor6);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl6 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl6, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default9 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default9);
        Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor7);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl7 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl7, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        Modifier weight$default4 = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer, weight$default4);
        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor8);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
        }
        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
        String stringResource8 = StringResources_androidKt.stringResource(R.string.odds_dialog_selected_bet, composer, 6);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = stringResource8.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(9), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(2)), composer, 6);
        TextKt.m2642Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float f5 = 4;
        Modifier m1517paddingVpY3zN43 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(Modifier.INSTANCE, ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), RoundedCornerShapeKt.RoundedCornerShape(50), 0.0f, 4, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f5));
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN43);
        Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor9);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl9 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
            m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
        }
        Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Intrinsics.checkNotNull(str2);
        TextKt.m2642Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer, 6);
        OddsDialogScreenKt.OddsPreviewAmountRow(StringResources_androidKt.stringResource(R.string.odds_dialog_bet_amount, composer, 6), String.valueOf(j), false, composer, RendererCapabilities.DECODER_SUPPORT_MASK);
        OddsDialogScreenKt.OddsPreviewAmountRow(StringResources_androidKt.stringResource(R.string.odds_dialog_total_win, composer, 6), String.valueOf(j2), false, composer, RendererCapabilities.DECODER_SUPPORT_MASK);
        OddsDialogScreenKt.OddsPreviewAmountRow(StringResources_androidKt.stringResource(R.string.profit, composer, 6), "+" + j3, true, composer, RendererCapabilities.DECODER_SUPPORT_MASK);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer, 6);
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.odds_dialog_change_in_settings, composer, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer, 48, 0, 65532);
        composer.startReplaceGroup(377543266);
        if (!z3 && function0 != null) {
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), composer, 6);
            String stringResource9 = StringResources_androidKt.stringResource(R.string.odds_dialog_set_default_bet_amount, composer, 6);
            TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(12), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16740312, (DefaultConstructorMarker) null);
            Modifier fillMaxWidth$default10 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean changed = composer.changed(function0);
            Object rememberedValue7 = composer.rememberedValue();
            if (changed || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$2$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$22$lambda$21$lambda$20;
                        invoke$lambda$22$lambda$21$lambda$20 = OddsDialogScreenKt$OddsDialogScreen$1$2$1.invoke$lambda$22$lambda$21$lambda$20(Function0.this);
                        return invoke$lambda$22$lambda$21$lambda$20;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            composer.endReplaceGroup();
            TextKt.m2642Text4IGK_g(stringResource9, ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default10, false, null, null, (Function0) rememberedValue7, 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 0, 0, 65532);
        }
        composer.endReplaceGroup();
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
