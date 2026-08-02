package org.betup.ui.fragment.matches.details.compose.tabs.battles;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattlesNoDataViewKt;

/* compiled from: BattlesTabContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BattlesTabContentKt$BattlesTabContent$2$2$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ State<Boolean> $canCreateBattle$delegate;
    final /* synthetic */ MatchDetailsController $controller;

    BattlesTabContentKt$BattlesTabContent$2$2$1$1(MatchDetailsController matchDetailsController, State<Boolean> state) {
        this.$controller = matchDetailsController;
        this.$canCreateBattle$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        boolean BattlesTabContent$lambda$3;
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1921726654, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BattlesTabContent.kt:195)");
        }
        String stringResource = StringResources_androidKt.stringResource(R.string.battles_no_available, composer, 6);
        composer.startReplaceGroup(-56613702);
        BattlesTabContent$lambda$3 = BattlesTabContentKt.BattlesTabContent$lambda$3(this.$canCreateBattle$delegate);
        if (BattlesTabContent$lambda$3) {
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(this.$controller);
            final MatchDetailsController matchDetailsController = this.$controller;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$2$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = BattlesTabContentKt$BattlesTabContent$2$2$1$1.invoke$lambda$1$lambda$0(MatchDetailsController.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function0 = (Function0) rememberedValue;
            composer.endReplaceGroup();
        } else {
            function0 = null;
        }
        composer.endReplaceGroup();
        BattlesNoDataViewKt.BattlesNoDataView(stringResource, function0, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MatchDetailsController matchDetailsController) {
        matchDetailsController.createBattle();
        return Unit.INSTANCE;
    }
}
