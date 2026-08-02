package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.Language;
import org.betup.services.LocaleService;
import org.betup.services.language.AppLanguageObserver;
import org.betup.ui.dialogs.compose.ChangeLanguageScreenKt;

/* compiled from: ChangeLanguageFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChangeLanguageFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Language $currentLanguage;
    final /* synthetic */ ChangeLanguageFragment this$0;

    ChangeLanguageFragment$onCreateView$1$1(Language language, ChangeLanguageFragment changeLanguageFragment) {
        this.$currentLanguage = language;
        this.this$0 = changeLanguageFragment;
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
            ComposerKt.traceEventStart(-551314599, i, -1, "org.betup.ui.dialogs.ChangeLanguageFragment.onCreateView.<anonymous>.<anonymous> (ChangeLanguageFragment.kt:38)");
        }
        Language language = this.$currentLanguage;
        Intrinsics.checkNotNull(language);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ChangeLanguageFragment changeLanguageFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.ChangeLanguageFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ChangeLanguageFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(ChangeLanguageFragment.this, (Language) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ChangeLanguageFragment changeLanguageFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.ChangeLanguageFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = ChangeLanguageFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(ChangeLanguageFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        ChangeLanguageScreenKt.ChangeLanguageScreen(language, function1, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ChangeLanguageFragment changeLanguageFragment, Language language) {
        Intrinsics.checkNotNullParameter(language, "language");
        AppLanguageObserver appLanguageObserver = changeLanguageFragment.getAppLanguageObserver();
        String code = language.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        appLanguageObserver.onLanguageChanged(code);
        LocaleService.setLanguage(changeLanguageFragment.requireContext(), language.getCode());
        changeLanguageFragment.getPushTokenService().sync();
        changeLanguageFragment.requireActivity().recreate();
        changeLanguageFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ChangeLanguageFragment changeLanguageFragment) {
        changeLanguageFragment.dismiss();
        return Unit.INSTANCE;
    }
}
