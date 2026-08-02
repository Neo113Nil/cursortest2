package org.betup.ui.fragment.flashbet;

import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.bus.NavigateMessage;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt;
import org.betup.ui.fragment.flashbet.controller.FlashBetMatchStartController;
import org.greenrobot.eventbus.EventBus;

/* compiled from: FlashBetMatchStartFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetMatchStartFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $categoryId;
    final /* synthetic */ String $categoryLogoUrl;
    final /* synthetic */ String $categoryName;
    final /* synthetic */ String $categoryPhotoUrl;
    final /* synthetic */ long $entryFee;
    final /* synthetic */ String $sportId;
    final /* synthetic */ String $sportName;
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ FlashBetMatchStartFragment this$0;

    FlashBetMatchStartFragment$onCreateView$1$1(String str, String str2, String str3, String str4, long j, FlashBetMatchStartFragment flashBetMatchStartFragment, String str5, String str6, ComposeView composeView) {
        this.$sportId = str;
        this.$categoryName = str2;
        this.$categoryPhotoUrl = str3;
        this.$categoryLogoUrl = str4;
        this.$entryFee = j;
        this.this$0 = flashBetMatchStartFragment;
        this.$categoryId = str5;
        this.$sportName = str6;
        this.$this_apply = composeView;
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
            ComposerKt.traceEventStart(1924056069, i, -1, "org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment.onCreateView.<anonymous>.<anonymous> (FlashBetMatchStartFragment.kt:50)");
        }
        String str = this.$sportId;
        String str2 = this.$categoryName;
        String str3 = this.$categoryPhotoUrl;
        String str4 = this.$categoryLogoUrl;
        long j = this.$entryFee;
        FlashBetMatchStartController controller = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final FlashBetMatchStartFragment flashBetMatchStartFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = FlashBetMatchStartFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(FlashBetMatchStartFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance2 = composer.changedInstance(this.this$0) | composer.changed(this.$categoryId);
        final FlashBetMatchStartFragment flashBetMatchStartFragment2 = this.this$0;
        final String str5 = this.$categoryId;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = FlashBetMatchStartFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(FlashBetMatchStartFragment.this, str5);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean changed = composer.changed(this.$categoryName) | composer.changed(this.$categoryLogoUrl) | composer.changed(this.$categoryPhotoUrl) | composer.changed(this.$sportId) | composer.changed(this.$sportName) | composer.changedInstance(this.this$0) | composer.changedInstance(this.$this_apply);
        final ComposeView composeView = this.$this_apply;
        final FlashBetMatchStartFragment flashBetMatchStartFragment3 = this.this$0;
        final String str6 = this.$categoryName;
        final String str7 = this.$categoryLogoUrl;
        final String str8 = this.$categoryPhotoUrl;
        final String str9 = this.$sportId;
        final String str10 = this.$sportName;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = FlashBetMatchStartFragment$onCreateView$1$1.invoke$lambda$8$lambda$7(ComposeView.this, flashBetMatchStartFragment3, str6, str7, str8, str9, str10, (FlashBetGameSessionDto) obj);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        FlashBetMatchStartContentKt.FlashBetMatchStartContent(str, str2, str3, str4, j, controller, function0, function02, (Function1) rememberedValue3, null, composer, 0, 512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FlashBetMatchStartFragment flashBetMatchStartFragment) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FragmentActivity activity = flashBetMatchStartFragment.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(FlashBetMatchStartFragment flashBetMatchStartFragment, String str) {
        flashBetMatchStartFragment.getController().startGame(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(ComposeView composeView, FlashBetMatchStartFragment flashBetMatchStartFragment, String str, String str2, String str3, String str4, String str5, FlashBetGameSessionDto flashBetGameSessionDto) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (flashBetGameSessionDto != null) {
            Bundle bundle = new Bundle();
            bundle.putString("sessionId", flashBetGameSessionDto.getId());
            bundle.putString("categoryName", str);
            bundle.putString("categoryLogoUrl", str2);
            bundle.putString("categoryPhotoUrl", str3);
            bundle.putString(GetRandomTeamImagesInteractor.KEY_SPORT_ID, str4);
            bundle.putString("sportName", str5);
            flashBetMatchStartFragment.getController().acknowledgeGameStarted();
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.FLASH_BET_GAME, bundle));
        } else {
            flashBetMatchStartFragment.getController().acknowledgeGameStarted();
            FragmentActivity activity = flashBetMatchStartFragment.getActivity();
            if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.onBackPressed();
            }
        }
        return Unit.INSTANCE;
    }
}
