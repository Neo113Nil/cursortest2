package org.betup.ui.dialogs.compose;

import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.model.local.entity.OddType;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;

/* compiled from: OddsDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OddsDialogScreenKt$OddsDialogScreen$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ String $coefFormatted;
    final /* synthetic */ MutableState<IntSize> $contentBottomSize$delegate;
    final /* synthetic */ MutableState<Float> $contentBottomY$delegate;
    final /* synthetic */ MutableState<IntSize> $contentSize$delegate;
    final /* synthetic */ double $demoCoefficientDraw;
    final /* synthetic */ double $demoCoefficientWin1;
    final /* synthetic */ double $demoCoefficientWin2;
    final /* synthetic */ Density $density;
    final /* synthetic */ float $dialogHorizontalPadding;
    final /* synthetic */ float $dialogVerticalPadding;
    final /* synthetic */ boolean $isInTour;
    final /* synthetic */ OddType $oddFormatForPreview;
    final /* synthetic */ Function0<Unit> $onCancel;
    final /* synthetic */ Function1<OddType, Unit> $onDismiss;
    final /* synthetic */ Function0<Unit> $onOpenDefaultBetAmount;
    final /* synthetic */ long $previewStake;
    final /* synthetic */ long $profit;
    final /* synthetic */ float $scaleVerticalPadding;
    final /* synthetic */ MutableState<DemoBetOutcome> $selectedDemoOutcome$delegate;
    final /* synthetic */ MutableState<OddType> $selectedOddType$delegate;
    final /* synthetic */ boolean $showTopCloseRow;
    final /* synthetic */ long $totalWin;
    final /* synthetic */ View $view;

    /* JADX WARN: Multi-variable type inference failed */
    OddsDialogScreenKt$OddsDialogScreen$1(float f, float f2, float f3, View view, MutableState<IntSize> mutableState, Density density, MutableState<Float> mutableState2, MutableState<IntSize> mutableState3, boolean z, Function0<Unit> function0, boolean z2, Function0<Unit> function02, MutableState<OddType> mutableState4, OddType oddType, double d, double d2, double d3, MutableState<DemoBetOutcome> mutableState5, long j, long j2, long j3, String str, Function1<? super OddType, Unit> function1) {
        this.$scaleVerticalPadding = f;
        this.$dialogHorizontalPadding = f2;
        this.$dialogVerticalPadding = f3;
        this.$view = view;
        this.$contentSize$delegate = mutableState;
        this.$density = density;
        this.$contentBottomY$delegate = mutableState2;
        this.$contentBottomSize$delegate = mutableState3;
        this.$showTopCloseRow = z;
        this.$onCancel = function0;
        this.$isInTour = z2;
        this.$onOpenDefaultBetAmount = function02;
        this.$selectedOddType$delegate = mutableState4;
        this.$oddFormatForPreview = oddType;
        this.$demoCoefficientWin1 = d;
        this.$demoCoefficientDraw = d2;
        this.$demoCoefficientWin2 = d3;
        this.$selectedDemoOutcome$delegate = mutableState5;
        this.$previewStake = j;
        this.$totalWin = j2;
        this.$profit = j3;
        this.$coefFormatted = str;
        this.$onDismiss = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(final float f, View view, final MutableState mutableState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        final long mo6536getSizeYbymL2g = coordinates.mo6536getSizeYbymL2g();
        view.post(new Runnable() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OddsDialogScreenKt$OddsDialogScreen$1.invoke$lambda$7$lambda$6$lambda$5(f, mo6536getSizeYbymL2g, mutableState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$7$lambda$6$lambda$5(float f, long j, MutableState mutableState) {
        IntSize OddsDialogScreen_g3amZ_k$lambda$15;
        IntSize OddsDialogScreen_g3amZ_k$lambda$152;
        if (f == 1.0f) {
            OddsDialogScreen_g3amZ_k$lambda$152 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$15(mutableState);
            if (OddsDialogScreen_g3amZ_k$lambda$152 == null ? false : IntSize.m7943equalsimpl0(OddsDialogScreen_g3amZ_k$lambda$152.m7949unboximpl(), j)) {
                return;
            }
            mutableState.setValue(IntSize.m7937boximpl(j));
            return;
        }
        OddsDialogScreen_g3amZ_k$lambda$15 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$15(mutableState);
        if (OddsDialogScreen_g3amZ_k$lambda$15 != null || f <= 0.0f) {
            return;
        }
        mutableState.setValue(IntSize.m7937boximpl(IntSize.m7940constructorimpl((((int) (((int) (j >> 32)) / f)) << 32) | (((int) (((int) (j & 4294967295L)) / f)) & 4294967295L))));
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        IntSize OddsDialogScreen_g3amZ_k$lambda$15;
        IntSize OddsDialogScreen_g3amZ_k$lambda$152;
        IntSize OddsDialogScreen_g3amZ_k$lambda$153;
        IntSize OddsDialogScreen_g3amZ_k$lambda$154;
        float OddsDialogScreen_g3amZ_k$lambda$21;
        IntSize OddsDialogScreen_g3amZ_k$lambda$18;
        IntSize OddsDialogScreen_g3amZ_k$lambda$182;
        boolean z;
        float OddsDialogScreen_g3amZ_k$lambda$212;
        float OddsDialogScreen_g3amZ_k$lambda$213;
        IntSize OddsDialogScreen_g3amZ_k$lambda$183;
        boolean z2;
        Function1<OddType, Unit> function1;
        long j;
        long j2;
        String str;
        MutableState<IntSize> mutableState;
        MutableState<Float> mutableState2;
        MutableState<OddType> mutableState3;
        Function0<Unit> function0;
        double d;
        double d2;
        long j3;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(592984724, i2, -1, "org.betup.ui.dialogs.compose.OddsDialogScreen.<anonymous> (OddsDialogScreen.kt:190)");
        }
        float m7774constructorimpl = Dp.m7774constructorimpl(BoxWithConstraints.mo1422getMaxHeightD9Ej5fM() - this.$scaleVerticalPadding);
        OddsDialogScreen_g3amZ_k$lambda$15 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$15(this.$contentSize$delegate);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(OddsDialogScreen_g3amZ_k$lambda$15) | composer.changed(m7774constructorimpl);
        Density density = this.$density;
        MutableState<IntSize> mutableState4 = this.$contentSize$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            OddsDialogScreen_g3amZ_k$lambda$152 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$15(mutableState4);
            float f = 1.0f;
            if (OddsDialogScreen_g3amZ_k$lambda$152 != null) {
                OddsDialogScreen_g3amZ_k$lambda$153 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$15(mutableState4);
                Intrinsics.checkNotNull(OddsDialogScreen_g3amZ_k$lambda$153);
                if (((int) (OddsDialogScreen_g3amZ_k$lambda$153.m7949unboximpl() & 4294967295L)) > 0) {
                    OddsDialogScreen_g3amZ_k$lambda$154 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$15(mutableState4);
                    Intrinsics.checkNotNull(OddsDialogScreen_g3amZ_k$lambda$154);
                    f = RangesKt.coerceIn(m7774constructorimpl / density.mo1164toDpu2uoSUM((int) (OddsDialogScreen_g3amZ_k$lambda$154.m7949unboximpl() & 4294967295L)), 0.7f, 1.0f);
                }
            }
            rememberedValue = Float.valueOf(f);
            composer.updateRememberedValue(rememberedValue);
        }
        final float floatValue = ((Number) rememberedValue).floatValue();
        composer.endReplaceGroup();
        OddsDialogScreen_g3amZ_k$lambda$21 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$21(this.$contentBottomY$delegate);
        OddsDialogScreen_g3amZ_k$lambda$18 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$18(this.$contentBottomSize$delegate);
        composer.startReplaceGroup(-1224400529);
        boolean changed2 = composer.changed(OddsDialogScreen_g3amZ_k$lambda$21) | composer.changed(OddsDialogScreen_g3amZ_k$lambda$18) | composer.changed(m7774constructorimpl) | composer.changed(floatValue);
        Density density2 = this.$density;
        MutableState<IntSize> mutableState5 = this.$contentBottomSize$delegate;
        MutableState<Float> mutableState6 = this.$contentBottomY$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            OddsDialogScreen_g3amZ_k$lambda$182 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$18(mutableState5);
            if (OddsDialogScreen_g3amZ_k$lambda$182 != null) {
                OddsDialogScreen_g3amZ_k$lambda$212 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$21(mutableState6);
                if (OddsDialogScreen_g3amZ_k$lambda$212 > 0.0f && floatValue > 0.0f) {
                    OddsDialogScreen_g3amZ_k$lambda$213 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$21(mutableState6);
                    float mo1163toDpu2uoSUM = density2.mo1163toDpu2uoSUM(OddsDialogScreen_g3amZ_k$lambda$213 * floatValue);
                    OddsDialogScreen_g3amZ_k$lambda$183 = OddsDialogScreenKt.OddsDialogScreen_g3amZ_k$lambda$18(mutableState5);
                    Intrinsics.checkNotNull(OddsDialogScreen_g3amZ_k$lambda$183);
                    if (Dp.m7773compareTo0680j_4(Dp.m7774constructorimpl(mo1163toDpu2uoSUM + density2.mo1163toDpu2uoSUM(((int) (OddsDialogScreen_g3amZ_k$lambda$183.m7949unboximpl() & 4294967295L)) * floatValue)), m7774constructorimpl) > 0) {
                        z = false;
                        rememberedValue2 = Boolean.valueOf(z);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                }
            }
            z = true;
            rememberedValue2 = Boolean.valueOf(z);
            composer.updateRememberedValue(rememberedValue2);
        }
        boolean booleanValue = ((Boolean) rememberedValue2).booleanValue();
        composer.endReplaceGroup();
        Modifier scale = ScaleKt.scale(PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), this.$dialogHorizontalPadding, this.$dialogVerticalPadding), floatValue);
        composer.startReplaceGroup(-1746271574);
        boolean changed3 = composer.changed(floatValue) | composer.changedInstance(this.$view);
        final View view = this.$view;
        final MutableState<IntSize> mutableState7 = this.$contentSize$delegate;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.compose.OddsDialogScreenKt$OddsDialogScreen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = OddsDialogScreenKt$OddsDialogScreen$1.invoke$lambda$7$lambda$6(floatValue, view, mutableState7, (LayoutCoordinates) obj);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(scale, (Function1) rememberedValue3);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        boolean z3 = this.$showTopCloseRow;
        Function0<Unit> function02 = this.$onCancel;
        boolean z4 = this.$isInTour;
        Function0<Unit> function03 = this.$onOpenDefaultBetAmount;
        MutableState<OddType> mutableState8 = this.$selectedOddType$delegate;
        OddType oddType = this.$oddFormatForPreview;
        double d3 = this.$demoCoefficientWin1;
        double d4 = this.$demoCoefficientDraw;
        double d5 = this.$demoCoefficientWin2;
        MutableState<DemoBetOutcome> mutableState9 = this.$selectedDemoOutcome$delegate;
        long j4 = this.$previewStake;
        long j5 = this.$totalWin;
        long j6 = this.$profit;
        String str2 = this.$coefFormatted;
        View view2 = this.$view;
        MutableState<IntSize> mutableState10 = this.$contentBottomSize$delegate;
        MutableState<Float> mutableState11 = this.$contentBottomY$delegate;
        Function1<OddType, Unit> function12 = this.$onDismiss;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, onGloballyPositioned);
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
        composer.startReplaceGroup(231673605);
        if (z3) {
            Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
            mutableState3 = mutableState8;
            function0 = function03;
            z2 = z4;
            function1 = function12;
            j = j5;
            j2 = j6;
            str = str2;
            mutableState = mutableState10;
            mutableState2 = mutableState11;
            d = d4;
            d2 = d5;
            j3 = j4;
            TopActionButtonsKt.TopActionButtons(align, function02, null, null, false, false, false, composer, 24576, 108);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), composer, 6);
        } else {
            z2 = z4;
            function1 = function12;
            j = j5;
            j2 = j6;
            str = str2;
            mutableState = mutableState10;
            mutableState2 = mutableState11;
            mutableState3 = mutableState8;
            function0 = function03;
            d = d4;
            d2 = d5;
            j3 = j4;
        }
        composer.endReplaceGroup();
        TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$OddsDialogScreenKt.INSTANCE.getLambda$391295418$app_release(), ComposableLambdaKt.rememberComposableLambda(1854933435, true, new OddsDialogScreenKt$OddsDialogScreen$1$2$1(z2, function0, mutableState3, oddType, d3, d, d2, mutableState9, j3, j, j2, str), composer, 54), ComposableLambdaKt.rememberComposableLambda(-976395844, true, new OddsDialogScreenKt$OddsDialogScreen$1$2$2(booleanValue, view2, mutableState, mutableState2, z2, function1, mutableState3), composer, 54), false, true, null, false, composer, 224694, 192);
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(48)), composer, 6);
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
