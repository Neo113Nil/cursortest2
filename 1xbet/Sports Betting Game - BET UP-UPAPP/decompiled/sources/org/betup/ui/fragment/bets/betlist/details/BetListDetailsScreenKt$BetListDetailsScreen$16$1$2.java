package org.betup.ui.fragment.bets.betlist.details;

import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.utils.TicketShareHelper;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetListDetailsScreenKt$BetListDetailsScreen$16$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FragmentActivity $actForChooser;
    final /* synthetic */ MutableState<BetShareChooserState> $shareChooserState$delegate;
    final /* synthetic */ BetShareChooserState $st;

    BetListDetailsScreenKt$BetListDetailsScreen$16$1$2(BetShareChooserState betShareChooserState, FragmentActivity fragmentActivity, MutableState<BetShareChooserState> mutableState) {
        this.$st = betShareChooserState;
        this.$actForChooser = fragmentActivity;
        this.$shareChooserState$delegate = mutableState;
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
            ComposerKt.traceEventStart(951056265, i, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreen.<anonymous>.<anonymous>.<anonymous> (BetListDetailsScreen.kt:297)");
        }
        List<Bitmap> bitmaps = this.$st.getBitmaps();
        String shareLink = this.$st.getShareLink();
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance = composer.changedInstance(this.$actForChooser) | composer.changedInstance(this.$st);
        final FragmentActivity fragmentActivity = this.$actForChooser;
        final BetShareChooserState betShareChooserState = this.$st;
        final MutableState<BetShareChooserState> mutableState = this.$shareChooserState$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = BetListDetailsScreenKt$BetListDetailsScreen$16$1$2.invoke$lambda$1$lambda$0(FragmentActivity.this, betShareChooserState, mutableState);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance2 = composer.changedInstance(this.$actForChooser) | composer.changedInstance(this.$st);
        final FragmentActivity fragmentActivity2 = this.$actForChooser;
        final BetShareChooserState betShareChooserState2 = this.$st;
        final MutableState<BetShareChooserState> mutableState2 = this.$shareChooserState$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = BetListDetailsScreenKt$BetListDetailsScreen$16$1$2.invoke$lambda$3$lambda$2(FragmentActivity.this, betShareChooserState2, mutableState2);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance3 = composer.changedInstance(this.$st) | composer.changedInstance(this.$actForChooser);
        final BetShareChooserState betShareChooserState3 = this.$st;
        final FragmentActivity fragmentActivity3 = this.$actForChooser;
        final MutableState<BetShareChooserState> mutableState3 = this.$shareChooserState$delegate;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$1$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$6$lambda$5;
                    invoke$lambda$6$lambda$5 = BetListDetailsScreenKt$BetListDetailsScreen$16$1$2.invoke$lambda$6$lambda$5(BetShareChooserState.this, fragmentActivity3, mutableState3);
                    return invoke$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function03 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance4 = composer.changedInstance(this.$st);
        final BetShareChooserState betShareChooserState4 = this.$st;
        final MutableState<BetShareChooserState> mutableState4 = this.$shareChooserState$delegate;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$1$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$8;
                    invoke$lambda$9$lambda$8 = BetListDetailsScreenKt$BetListDetailsScreen$16$1$2.invoke$lambda$9$lambda$8(BetShareChooserState.this, mutableState4);
                    return invoke$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        BetTicketShareChooserScreenKt.BetTicketShareChooserScreen(bitmaps, shareLink, function0, function02, function03, (Function0) rememberedValue4, 0, 0, 0, 0, composer, 0, 960);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FragmentActivity fragmentActivity, BetShareChooserState betShareChooserState, MutableState mutableState) {
        TicketShareHelper.INSTANCE.shareBitmapsAsImage(fragmentActivity, betShareChooserState.getBitmaps(), betShareChooserState.getBetId(), (r17 & 8) != 0 ? false : betShareChooserState.isSingleLegBetTicket(), (r17 & 16) != 0, (r17 & 32) != 0 ? null : null);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(FragmentActivity fragmentActivity, BetShareChooserState betShareChooserState, MutableState mutableState) {
        TicketShareHelper.INSTANCE.shareBitmapsAsImage(fragmentActivity, betShareChooserState.getBitmaps(), betShareChooserState.getBetId(), betShareChooserState.isSingleLegBetTicket(), true, betShareChooserState.getShareLink());
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(BetShareChooserState betShareChooserState, FragmentActivity fragmentActivity, MutableState mutableState) {
        for (Bitmap bitmap : betShareChooserState.getBitmaps()) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        TicketShareHelper.INSTANCE.sharePlainText(fragmentActivity, betShareChooserState.getShareLink(), R.string.share_bet_ticket);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(BetShareChooserState betShareChooserState, MutableState mutableState) {
        for (Bitmap bitmap : betShareChooserState.getBitmaps()) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }
}
