package org.betup.ui.fragment.matches;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.fragment.bets.BetsTabBarComposeKt;

/* compiled from: TopMatchesFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TopMatchesFragment$updateTabContent$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TopMatchesFragment this$0;

    TopMatchesFragment$updateTabContent$1(TopMatchesFragment topMatchesFragment) {
        this.this$0 = topMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final int invoke$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public final void invoke(Composer composer, int i) {
        int i2;
        int i3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(26341022, i, -1, "org.betup.ui.fragment.matches.TopMatchesFragment.updateTabContent.<anonymous> (TopMatchesFragment.kt:137)");
        }
        composer.startReplaceGroup(1849434622);
        TopMatchesFragment topMatchesFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            i3 = topMatchesFragment.selectedTab;
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i3), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        i2 = this.this$0.selectedTab;
        Integer valueOf = Integer.valueOf(i2);
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = composer.changedInstance(this.this$0);
        TopMatchesFragment topMatchesFragment2 = this.this$0;
        TopMatchesFragment$updateTabContent$1$1$1 rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new TopMatchesFragment$updateTabContent$1$1$1(topMatchesFragment2, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, 0);
        int invoke$lambda$1 = invoke$lambda$1(mutableState);
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final TopMatchesFragment topMatchesFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.TopMatchesFragment$updateTabContent$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = TopMatchesFragment$updateTabContent$1.invoke$lambda$5$lambda$4(TopMatchesFragment.this, ((Integer) obj).intValue());
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        BetsTabBarComposeKt.BetsTabBarCompose(null, invoke$lambda$1, (Function1) rememberedValue3, CollectionsKt.listOf((Object[]) new String[]{this.this$0.getString(R.string.future), this.this$0.getString(R.string.live)}), true, composer, 24576, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(TopMatchesFragment topMatchesFragment, int i) {
        topMatchesFragment.switchToTab(i);
        return Unit.INSTANCE;
    }
}
