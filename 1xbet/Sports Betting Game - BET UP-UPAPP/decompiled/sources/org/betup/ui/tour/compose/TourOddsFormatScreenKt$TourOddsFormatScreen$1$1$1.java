package org.betup.ui.tour.compose;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.ui.common.compose.CommonButtonKt;

/* compiled from: TourOddsFormatScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TourOddsFormatScreenKt$TourOddsFormatScreen$1$1$1 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<OddType> $selectedOddType$delegate;

    TourOddsFormatScreenKt$TourOddsFormatScreen$1$1$1(MutableState<OddType> mutableState) {
        this.$selectedOddType$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
        mutableState.setValue(OddType.DECIMAL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(MutableState mutableState) {
        mutableState.setValue(OddType.AMERICAN);
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        OddType TourOddsFormatScreen$lambda$1;
        OddType TourOddsFormatScreen$lambda$12;
        OddType TourOddsFormatScreen$lambda$13;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(528894918, i, -1, "org.betup.ui.tour.compose.TourOddsFormatScreen.<anonymous>.<anonymous>.<anonymous> (TourOddsFormatScreen.kt:101)");
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.decimal_odds, composer, 6);
        TourOddsFormatScreen$lambda$1 = TourOddsFormatScreenKt.TourOddsFormatScreen$lambda$1(this.$selectedOddType$delegate);
        boolean z = TourOddsFormatScreen$lambda$1 == OddType.DECIMAL;
        Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
        composer.startReplaceGroup(5004770);
        final MutableState<OddType> mutableState = this.$selectedOddType$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourOddsFormatScreenKt$TourOddsFormatScreen$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TourOddsFormatScreenKt$TourOddsFormatScreen$1$1$1.invoke$lambda$1$lambda$0(MutableState.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(wrapContentWidth$default, z, stringResource, false, false, false, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 1572870, 0, 0, 2097080);
        String stringResource2 = StringResources_androidKt.stringResource(R.string.american_odds, composer, 6);
        TourOddsFormatScreen$lambda$12 = TourOddsFormatScreenKt.TourOddsFormatScreen$lambda$1(this.$selectedOddType$delegate);
        boolean z2 = TourOddsFormatScreen$lambda$12 == OddType.AMERICAN;
        Modifier wrapContentWidth$default2 = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
        composer.startReplaceGroup(5004770);
        final MutableState<OddType> mutableState2 = this.$selectedOddType$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.tour.compose.TourOddsFormatScreenKt$TourOddsFormatScreen$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = TourOddsFormatScreenKt$TourOddsFormatScreen$1$1$1.invoke$lambda$3$lambda$2(MutableState.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(wrapContentWidth$default2, z2, stringResource2, false, false, false, (Function0) rememberedValue2, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 1572870, 0, 0, 2097080);
        String stringResource3 = StringResources_androidKt.stringResource(R.string.fractional_odds, composer, 6);
        TourOddsFormatScreen$lambda$13 = TourOddsFormatScreenKt.TourOddsFormatScreen$lambda$1(this.$selectedOddType$delegate);
        boolean z3 = TourOddsFormatScreen$lambda$13 == OddType.FRACTIONAL;
        Modifier wrapContentWidth$default3 = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
        composer.startReplaceGroup(5004770);
        final MutableState<OddType> mutableState3 = this.$selectedOddType$delegate;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.tour.compose.TourOddsFormatScreenKt$TourOddsFormatScreen$1$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = TourOddsFormatScreenKt$TourOddsFormatScreen$1$1$1.invoke$lambda$5$lambda$4(MutableState.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(wrapContentWidth$default3, z3, stringResource3, false, false, false, (Function0) rememberedValue3, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 1572870, 0, 0, 2097080);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(MutableState mutableState) {
        mutableState.setValue(OddType.FRACTIONAL);
        return Unit.INSTANCE;
    }
}
