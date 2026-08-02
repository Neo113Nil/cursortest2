package org.betup.ui.fragment.flashbet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment;
import org.betup.ui.fragment.flashbet.compose.FlashBetContentKt;
import org.betup.ui.fragment.flashbet.controller.FlashBetController;

/* compiled from: FlashBetFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FlashBetFragment this$0;

    FlashBetFragment$onCreateView$1$1(FlashBetFragment flashBetFragment) {
        this.this$0 = flashBetFragment;
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
            ComposerKt.traceEventStart(396080869, i, -1, "org.betup.ui.fragment.flashbet.FlashBetFragment.onCreateView.<anonymous>.<anonymous> (FlashBetFragment.kt:55)");
        }
        FlashBetController flashBetController = this.this$0.getFlashBetController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final FlashBetFragment flashBetFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.flashbet.FlashBetFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = FlashBetFragment$onCreateView$1$1.invoke$lambda$2$lambda$1(FlashBetFragment.this, (String) obj);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final FlashBetFragment flashBetFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.flashbet.FlashBetFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = FlashBetFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(FlashBetFragment.this, (FlashBetGameSessionDto) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        FlashBetContentKt.FlashBetContent(flashBetController, function1, (Function1) rememberedValue2, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(FlashBetFragment flashBetFragment, final String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        flashBetFragment.showDialogSafely("FlashBetDetailsDialog", new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetFragment$onCreateView$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DialogFragment invoke$lambda$2$lambda$1$lambda$0;
                invoke$lambda$2$lambda$1$lambda$0 = FlashBetFragment$onCreateView$1$1.invoke$lambda$2$lambda$1$lambda$0(sessionId);
                return invoke$lambda$2$lambda$1$lambda$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialogFragment invoke$lambda$2$lambda$1$lambda$0(String str) {
        return FlashBetDetailsDialogFragment.Companion.newInstance$default(FlashBetDetailsDialogFragment.INSTANCE, str, false, false, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(FlashBetFragment flashBetFragment, final FlashBetGameSessionDto session) {
        Intrinsics.checkNotNullParameter(session, "session");
        flashBetFragment.showDialogSafely("FlashBetAbandonedSessionDialog", new Function0() { // from class: org.betup.ui.fragment.flashbet.FlashBetFragment$onCreateView$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DialogFragment invoke$lambda$5$lambda$4$lambda$3;
                invoke$lambda$5$lambda$4$lambda$3 = FlashBetFragment$onCreateView$1$1.invoke$lambda$5$lambda$4$lambda$3(FlashBetGameSessionDto.this);
                return invoke$lambda$5$lambda$4$lambda$3;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialogFragment invoke$lambda$5$lambda$4$lambda$3(FlashBetGameSessionDto flashBetGameSessionDto) {
        return FlashBetAbandonedSessionDialogFragment.INSTANCE.newInstance(flashBetGameSessionDto.getId());
    }
}
