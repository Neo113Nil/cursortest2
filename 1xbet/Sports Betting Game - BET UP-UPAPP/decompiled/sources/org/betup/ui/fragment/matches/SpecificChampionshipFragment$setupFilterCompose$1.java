package org.betup.ui.fragment.matches;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.matches.compose.MatchesFilterElementKt;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;

/* compiled from: SpecificChampionshipFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SpecificChampionshipFragment$setupFilterCompose$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SpecificChampionshipFragment this$0;

    SpecificChampionshipFragment$setupFilterCompose$1(SpecificChampionshipFragment specificChampionshipFragment) {
        this.this$0 = specificChampionshipFragment;
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
            ComposerKt.traceEventStart(1346710300, i, -1, "org.betup.ui.fragment.matches.SpecificChampionshipFragment.setupFilterCompose.<anonymous> (SpecificChampionshipFragment.kt:1134)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getMatchFilterState().getFilterList(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getMatchFilterState().getSelectedFilter(), null, composer, 0, 1);
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        FragmentActivity fragmentActivity = requireActivity;
        List<NewMatchFilter> invoke$lambda$0 = invoke$lambda$0(collectAsState);
        NewMatchFilter invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final SpecificChampionshipFragment specificChampionshipFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$setupFilterCompose$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = SpecificChampionshipFragment$setupFilterCompose$1.invoke$lambda$3$lambda$2(SpecificChampionshipFragment.this, (NewMatchFilter) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        MatchesFilterElementKt.MatchesFilterElement(fragmentActivity, invoke$lambda$0, invoke$lambda$1, (Function1) rememberedValue, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), composer, 24576);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SpecificChampionshipFragment specificChampionshipFragment, NewMatchFilter newFilter) {
        Intrinsics.checkNotNullParameter(newFilter, "newFilter");
        specificChampionshipFragment.onFilterSelectedFromCompose(newFilter);
        return Unit.INSTANCE;
    }

    private static final List<NewMatchFilter> invoke$lambda$0(State<? extends List<? extends NewMatchFilter>> state) {
        return (List) state.getValue();
    }

    private static final NewMatchFilter invoke$lambda$1(State<? extends NewMatchFilter> state) {
        return state.getValue();
    }
}
