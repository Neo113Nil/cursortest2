package org.betup.ui.fragment.flashbet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt;
import org.betup.ui.fragment.flashbet.controller.FlashBetGameController;

/* compiled from: FlashBetGameFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetGameFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $categoryLogoUrl;
    final /* synthetic */ String $categoryName;
    final /* synthetic */ String $categoryPhotoUrl;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $sportId;
    final /* synthetic */ String $sportName;
    final /* synthetic */ FlashBetGameFragment this$0;

    FlashBetGameFragment$onCreateView$1$1(String str, String str2, String str3, String str4, String str5, FlashBetGameFragment flashBetGameFragment, String str6) {
        this.$sessionId = str;
        this.$categoryName = str2;
        this.$categoryLogoUrl = str3;
        this.$categoryPhotoUrl = str4;
        this.$sportId = str5;
        this.this$0 = flashBetGameFragment;
        this.$sportName = str6;
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
            ComposerKt.traceEventStart(-1604350555, i, -1, "org.betup.ui.fragment.flashbet.FlashBetGameFragment.onCreateView.<anonymous>.<anonymous> (FlashBetGameFragment.kt:46)");
        }
        String str = this.$sessionId;
        String str2 = this.$categoryName;
        String str3 = this.$categoryLogoUrl;
        String str4 = this.$categoryPhotoUrl;
        String str5 = this.$sportId;
        FlashBetGameController controller = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final FlashBetGameFragment flashBetGameFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetGameFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = FlashBetGameFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(FlashBetGameFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance2 = composer.changedInstance(this.this$0) | composer.changed(this.$sportId) | composer.changed(this.$sportName);
        final FlashBetGameFragment flashBetGameFragment2 = this.this$0;
        final String str6 = this.$sportId;
        final String str7 = this.$sportName;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetGameFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = FlashBetGameFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(FlashBetGameFragment.this, str6, str7);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance3 = composer.changedInstance(this.this$0) | composer.changed(this.$sessionId);
        final FlashBetGameFragment flashBetGameFragment3 = this.this$0;
        final String str8 = this.$sessionId;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetGameFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = FlashBetGameFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(FlashBetGameFragment.this, str8);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        FlashBetGameContentKt.FlashBetGameContent(str, str2, str3, str4, str5, controller, function0, function02, (Function0) rememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FlashBetGameFragment flashBetGameFragment) {
        flashBetGameFragment.showLeaveConfirmDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(FlashBetGameFragment flashBetGameFragment, String str, String str2) {
        flashBetGameFragment.navigateToLeaguesSelection(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(FlashBetGameFragment flashBetGameFragment, String str) {
        flashBetGameFragment.getController().leaveSession(str);
        flashBetGameFragment.goBackToFlashBetListAndShowSessionExpiredDialog();
        return Unit.INSTANCE;
    }
}
