package org.betup.ui.fragment.achievements.compose;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.achievements.NewAchievementSummaryModel;
import org.betup.ui.dialogs.AchievementDialogFragment;
import org.betup.ui.fragment.achievements.compose.components.MissionProgressComponentKt;
import org.betup.ui.fragment.achievements.compose.model.AchievementUiModel;

/* compiled from: AchievementsContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AchievementsContentKt$AchievementsContent$1$1$1$2$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ State<AchievementUiModel> $achievement15$delegate;
    final /* synthetic */ NewAchievementSummaryModel $summaryData;

    AchievementsContentKt$AchievementsContent$1$1$1$2$1(NewAchievementSummaryModel newAchievementSummaryModel, State<AchievementUiModel> state) {
        this.$summaryData = newAchievementSummaryModel;
        this.$achievement15$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        AchievementUiModel AchievementsContent$lambda$2;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(658210659, i, -1, "org.betup.ui.fragment.achievements.compose.AchievementsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AchievementsContent.kt:126)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        final Activity activity = context instanceof Activity ? (Activity) context : null;
        NewAchievementSummaryModel newAchievementSummaryModel = this.$summaryData;
        AchievementsContent$lambda$2 = AchievementsContentKt.AchievementsContent$lambda$2(this.$achievement15$delegate);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$achievement15$delegate) | composer.changedInstance(activity);
        final State<AchievementUiModel> state = this.$achievement15$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$1$1$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = AchievementsContentKt$AchievementsContent$1$1$1$2$1.invoke$lambda$3$lambda$2(State.this, activity);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        MissionProgressComponentKt.MissionProgressComponent(newAchievementSummaryModel, AchievementsContent$lambda$2, (Function0) rememberedValue, null, composer, 0, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(State state, Activity activity) {
        AchievementUiModel AchievementsContent$lambda$2;
        AchievementsContent$lambda$2 = AchievementsContentKt.AchievementsContent$lambda$2(state);
        if (AchievementsContent$lambda$2 != null && activity != null) {
            AchievementDialogFragment.INSTANCE.showDialog(activity, AchievementsContent$lambda$2.getName(), AchievementsContent$lambda$2.getDescription(), AchievementsContent$lambda$2.getPhotoUrl(), AchievementsContent$lambda$2.getPrice(), true, AchievementsContent$lambda$2.getId());
        }
        return Unit.INSTANCE;
    }
}
