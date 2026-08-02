package org.betup.ui.fragment.flashbet;

import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt;
import org.betup.ui.fragment.flashbet.compose.FlashBetLeagueCardItem;
import org.betup.ui.fragment.flashbet.controller.FlashBetCategoriesController;
import org.greenrobot.eventbus.EventBus;

/* compiled from: FlashBetCategoriesFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetCategoriesFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $sportId;
    final /* synthetic */ String $sportName;
    final /* synthetic */ FlashBetCategoriesFragment this$0;

    FlashBetCategoriesFragment$onCreateView$1$1(FlashBetCategoriesFragment flashBetCategoriesFragment, String str, String str2) {
        this.this$0 = flashBetCategoriesFragment;
        this.$sportId = str;
        this.$sportName = str2;
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
            ComposerKt.traceEventStart(196807781, i, -1, "org.betup.ui.fragment.flashbet.FlashBetCategoriesFragment.onCreateView.<anonymous>.<anonymous> (FlashBetCategoriesFragment.kt:60)");
        }
        FlashBetCategoriesController flashBetCategoriesController = this.this$0.getFlashBetCategoriesController();
        String str = this.$sportId;
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$sportId) | composer.changed(this.$sportName);
        final String str2 = this.$sportId;
        final String str3 = this.$sportName;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.flashbet.FlashBetCategoriesFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = FlashBetCategoriesFragment$onCreateView$1$1.invoke$lambda$2$lambda$1(str2, str3, (FlashBetLeagueCardItem) obj);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final FlashBetCategoriesFragment flashBetCategoriesFragment = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetCategoriesFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = FlashBetCategoriesFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(FlashBetCategoriesFragment.this);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        FlashBetCategoriesContentKt.FlashBetCategoriesContent(flashBetCategoriesController, str, function1, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(String str, String str2, FlashBetLeagueCardItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Bundle bundle = new Bundle();
        bundle.putString(GetRandomTeamImagesInteractor.KEY_SPORT_ID, str);
        bundle.putString("sportName", str2);
        bundle.putString("categoryId", item.getId());
        bundle.putString("categoryName", item.getTitle());
        bundle.putString("categoryPhotoUrl", item.getPhotoUrl());
        String leagueLogoUrl = item.getLeagueLogoUrl();
        if (leagueLogoUrl == null) {
            leagueLogoUrl = "";
        }
        bundle.putString("categoryLogoUrl", leagueLogoUrl);
        bundle.putLong("entryFee", item.getEntryFee());
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.FLASH_BET_MATCH_START, bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(FlashBetCategoriesFragment flashBetCategoriesFragment) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FragmentActivity activity = flashBetCategoriesFragment.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }
}
