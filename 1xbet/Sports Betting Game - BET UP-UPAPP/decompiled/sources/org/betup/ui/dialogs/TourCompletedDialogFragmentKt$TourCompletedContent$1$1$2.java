package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;

/* compiled from: TourCompletedDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TourCompletedDialogFragmentKt$TourCompletedContent$1$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $isCollecting$delegate;
    final /* synthetic */ Function0<Unit> $onCollect;
    final /* synthetic */ ColumnScope $this_Column;

    TourCompletedDialogFragmentKt$TourCompletedContent$1$1$2(ColumnScope columnScope, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        this.$this_Column = columnScope;
        this.$onCollect = function0;
        this.$isCollecting$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean TourCompletedContent$lambda$1;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(97988508, i, -1, "org.betup.ui.dialogs.TourCompletedContent.<anonymous>.<anonymous>.<anonymous> (TourCompletedDialogFragment.kt:233)");
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.collect, composer, 6);
        TourCompletedContent$lambda$1 = TourCompletedDialogFragmentKt.TourCompletedContent$lambda$1(this.$isCollecting$delegate);
        boolean z = !TourCompletedContent$lambda$1;
        Modifier weight$default = ColumnScope.weight$default(this.$this_Column, PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(32), Dp.m7774constructorimpl(8)), 1.0f, false, 2, null);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$onCollect);
        final Function0<Unit> function0 = this.$onCollect;
        final MutableState<Boolean> mutableState = this.$isCollecting$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.TourCompletedDialogFragmentKt$TourCompletedContent$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TourCompletedDialogFragmentKt$TourCompletedContent$1$1$2.invoke$lambda$1$lambda$0(Function0.this, mutableState);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(weight$default, false, stringResource, false, false, z, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 3072, 0, 0, 2097042);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0, MutableState mutableState) {
        boolean TourCompletedContent$lambda$1;
        TourCompletedContent$lambda$1 = TourCompletedDialogFragmentKt.TourCompletedContent$lambda$1(mutableState);
        if (!TourCompletedContent$lambda$1) {
            TourCompletedDialogFragmentKt.TourCompletedContent$lambda$2(mutableState, true);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
