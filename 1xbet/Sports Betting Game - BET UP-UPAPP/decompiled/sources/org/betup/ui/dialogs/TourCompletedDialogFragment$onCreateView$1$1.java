package org.betup.ui.dialogs;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: TourCompletedDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TourCompletedDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TourCompletedDialogFragment this$0;

    TourCompletedDialogFragment$onCreateView$1$1(TourCompletedDialogFragment tourCompletedDialogFragment) {
        this.this$0 = tourCompletedDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1922773377, i, -1, "org.betup.ui.dialogs.TourCompletedDialogFragment.onCreateView.<anonymous>.<anonymous> (TourCompletedDialogFragment.kt:89)");
        }
        str = this.this$0.title;
        String str4 = str == null ? "" : str;
        str2 = this.this$0.subtitle;
        String str5 = str2 == null ? "" : str2;
        str3 = this.this$0.iconUrl;
        i2 = this.this$0.price;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final TourCompletedDialogFragment tourCompletedDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.TourCompletedDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TourCompletedDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(TourCompletedDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final TourCompletedDialogFragment tourCompletedDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.TourCompletedDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = TourCompletedDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(TourCompletedDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        TourCompletedDialogFragmentKt.TourCompletedContent(str4, str5, str3, i2, function0, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TourCompletedDialogFragment tourCompletedDialogFragment) {
        boolean z;
        z = tourCompletedDialogFragment.dismissed;
        if (!z) {
            tourCompletedDialogFragment.dismissed = true;
            tourCompletedDialogFragment.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(TourCompletedDialogFragment tourCompletedDialogFragment) {
        Log.d("TourCompletedDialog", "Collect button clicked - dismissing dialog");
        tourCompletedDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
