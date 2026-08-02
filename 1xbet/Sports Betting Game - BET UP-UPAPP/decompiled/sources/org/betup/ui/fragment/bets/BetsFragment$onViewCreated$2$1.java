package org.betup.ui.fragment.bets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.R;

/* compiled from: BetsFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetsFragment$onViewCreated$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BetsFragment this$0;

    BetsFragment$onViewCreated$2$1(BetsFragment betsFragment) {
        this.this$0 = betsFragment;
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
            ComposerKt.traceEventStart(-461159882, i, -1, "org.betup.ui.fragment.bets.BetsFragment.onViewCreated.<anonymous>.<anonymous> (BetsFragment.kt:78)");
        }
        int invoke$lambda$0 = invoke$lambda$0(SnapshotStateKt.collectAsState(this.this$0.getController().getSelectedTabFlow(), null, composer, 0, 1));
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final BetsFragment betsFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.BetsFragment$onViewCreated$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = BetsFragment$onViewCreated$2$1.invoke$lambda$2$lambda$1(BetsFragment.this, ((Integer) obj).intValue());
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        BetsTabBarComposeKt.BetsTabBarCompose(null, invoke$lambda$0, (Function1) rememberedValue, CollectionsKt.listOf((Object[]) new String[]{this.this$0.getString(R.string.bets), this.this$0.getString(R.string.drawer_my_bets), this.this$0.getString(R.string.quiz_results)}), false, composer, 0, 17);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(BetsFragment betsFragment, int i) {
        betsFragment.getController().setNewBetsTab(i);
        return Unit.INSTANCE;
    }

    private static final int invoke$lambda$0(State<Integer> state) {
        return state.getValue().intValue();
    }
}
