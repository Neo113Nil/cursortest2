package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.country.GetV7CountriesInteractor;
import org.betup.model.remote.api.rest.user.ChangeV7CountryInteractor;
import org.betup.services.user.UserService;
import org.betup.ui.base.SnackbarDialogFragment;
import org.betup.ui.dialogs.compose.ChangeCountryDialogScreenKt;

/* compiled from: ChangeCountryDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChangeCountryDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ChangeCountryDialogFragment this$0;

    ChangeCountryDialogFragment$onCreateView$1$1(ChangeCountryDialogFragment changeCountryDialogFragment) {
        this.this$0 = changeCountryDialogFragment;
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
            ComposerKt.traceEventStart(1981733403, i, -1, "org.betup.ui.dialogs.ChangeCountryDialogFragment.onCreateView.<anonymous>.<anonymous> (ChangeCountryDialogFragment.kt:44)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        UserService userService = this.this$0.getUserService();
        GetV7CountriesInteractor getCountriesInteractor = this.this$0.getGetCountriesInteractor();
        ChangeV7CountryInteractor changeCountryInteractor = this.this$0.getChangeCountryInteractor();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ChangeCountryDialogFragment changeCountryDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.ChangeCountryDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ChangeCountryDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(ChangeCountryDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ChangeCountryDialogFragment changeCountryDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.dialogs.ChangeCountryDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = ChangeCountryDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(ChangeCountryDialogFragment.this, (CharSequence) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        ChangeCountryDialogScreenKt.ChangeCountryDialogScreen(companion, userService, getCountriesInteractor, changeCountryInteractor, function0, (Function1) rememberedValue2, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ChangeCountryDialogFragment changeCountryDialogFragment) {
        changeCountryDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ChangeCountryDialogFragment changeCountryDialogFragment, CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SnackbarDialogFragment.showSnackbar$default(changeCountryDialogFragment, message, null, 2, null);
        return Unit.INSTANCE;
    }
}
