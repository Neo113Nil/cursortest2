package org.betup.ui.fragment.matches;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.matches.compose.DateSelectorElementKt;

/* compiled from: MatchesByDateFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MatchesByDateFragment$setupDateSelector$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MatchesByDateFragment this$0;

    MatchesByDateFragment$setupDateSelector$1(MatchesByDateFragment matchesByDateFragment) {
        this.this$0 = matchesByDateFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1891927917, i, -1, "org.betup.ui.fragment.matches.MatchesByDateFragment.setupDateSelector.<anonymous> (MatchesByDateFragment.kt:296)");
        }
        String invoke$lambda$0 = invoke$lambda$0(SnapshotStateKt.collectAsState(this.this$0.getDateFilterState().getSelectedDate(), null, composer, 0, 1));
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final MatchesByDateFragment matchesByDateFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment$setupDateSelector$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = MatchesByDateFragment$setupDateSelector$1.invoke$lambda$2$lambda$1(MatchesByDateFragment.this, (String) obj);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        DateSelectorElementKt.DateSelectorElement(invoke$lambda$0, (Function1) rememberedValue, null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(MatchesByDateFragment matchesByDateFragment, String newDate) {
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        matchesByDateFragment.performDateChange(newDate);
        return Unit.INSTANCE;
    }

    private static final String invoke$lambda$0(State<String> state) {
        return state.getValue();
    }
}
