package org.betup.ui.dialogs;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.compose.AppExperienceSettingsState;
import org.betup.ui.dialogs.compose.VisualEffectsScreenKt;
import org.betup.utils.SharedPrefs;

/* compiled from: VisualEffectsFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VisualEffectsFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AppExperienceSettingsState $initialState;
    final /* synthetic */ VisualEffectsFragment this$0;

    VisualEffectsFragment$onCreateView$1$1(AppExperienceSettingsState appExperienceSettingsState, Context context, VisualEffectsFragment visualEffectsFragment) {
        this.$initialState = appExperienceSettingsState;
        this.$context = context;
        this.this$0 = visualEffectsFragment;
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
            ComposerKt.traceEventStart(-31768717, i, -1, "org.betup.ui.dialogs.VisualEffectsFragment.onCreateView.<anonymous>.<anonymous> (VisualEffectsFragment.kt:31)");
        }
        AppExperienceSettingsState appExperienceSettingsState = this.$initialState;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.$context);
        final Context context = this.$context;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.VisualEffectsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = VisualEffectsFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(context, (AppExperienceSettingsState) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final VisualEffectsFragment visualEffectsFragment = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.VisualEffectsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = VisualEffectsFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(VisualEffectsFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        VisualEffectsScreenKt.AppExperienceSettingsScreen(appExperienceSettingsState, function1, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, AppExperienceSettingsState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SharedPrefs.setAreVisualEffectsEnabled(context, state.getVisualEffectsEnabled());
        SharedPrefs.setHapticEffectsEnabled(context, state.getHapticFeedbackEnabled());
        SharedPrefs.setAreInAppMessagesEnabled(context, state.getInAppMessagesEnabled());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(VisualEffectsFragment visualEffectsFragment) {
        visualEffectsFragment.dismiss();
        return Unit.INSTANCE;
    }
}
