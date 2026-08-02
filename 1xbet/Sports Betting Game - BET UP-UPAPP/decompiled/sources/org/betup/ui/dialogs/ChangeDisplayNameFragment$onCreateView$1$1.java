package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.services.user.UserService;
import org.betup.services.user.UserServiceAccessor;
import org.betup.ui.base.SnackbarDialogFragment;
import org.betup.ui.dialogs.compose.ChangeDisplayNameScreenKt;

/* compiled from: ChangeDisplayNameFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChangeDisplayNameFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $currentName;
    final /* synthetic */ ChangeDisplayNameFragment this$0;

    ChangeDisplayNameFragment$onCreateView$1$1(String str, ChangeDisplayNameFragment changeDisplayNameFragment) {
        this.$currentName = str;
        this.this$0 = changeDisplayNameFragment;
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
            ComposerKt.traceEventStart(1888160061, i, -1, "org.betup.ui.dialogs.ChangeDisplayNameFragment.onCreateView.<anonymous>.<anonymous> (ChangeDisplayNameFragment.kt:41)");
        }
        String str = this.$currentName;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ChangeDisplayNameFragment changeDisplayNameFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.ChangeDisplayNameFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ChangeDisplayNameFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(ChangeDisplayNameFragment.this, (String) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ChangeDisplayNameFragment changeDisplayNameFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.ChangeDisplayNameFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = ChangeDisplayNameFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(ChangeDisplayNameFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function0 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final ChangeDisplayNameFragment changeDisplayNameFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.ChangeDisplayNameFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = ChangeDisplayNameFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(ChangeDisplayNameFragment.this, (CharSequence) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        ChangeDisplayNameScreenKt.ChangeDisplayNameScreen(str, function1, function0, (Function1) rememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(ChangeDisplayNameFragment changeDisplayNameFragment, CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SnackbarDialogFragment.showSnackbar$default(changeDisplayNameFragment, message, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(final ChangeDisplayNameFragment changeDisplayNameFragment, String newName) {
        ChangeDisplayNameInteractorAccessor changeDisplayNameInteractorAccessor;
        Intrinsics.checkNotNullParameter(newName, "newName");
        changeDisplayNameInteractorAccessor = changeDisplayNameFragment.interactorAccessor;
        changeDisplayNameInteractorAccessor.getChangeV7NameInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<BaseUserModel, String>() { // from class: org.betup.ui.dialogs.ChangeDisplayNameFragment$onCreateView$1$1$1$1$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<BaseUserModel, String> responseMessage) {
                UserServiceAccessor userServiceAccessor;
                UserServiceAccessor userServiceAccessor2;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (ChangeDisplayNameFragment.this.isAdded()) {
                    if (responseMessage.getStat() == FetchStat.SUCCESS) {
                        userServiceAccessor = ChangeDisplayNameFragment.this.userServiceAccessor;
                        userServiceAccessor.getUserService().invalidate(UserService.InfoKind.GENERAL);
                        userServiceAccessor2 = ChangeDisplayNameFragment.this.userServiceAccessor;
                        userServiceAccessor2.getUserService().syncProfile(UserService.InfoKind.GENERAL);
                        ChangeDisplayNameFragment.this.showSnackbar(R.string.changes_applied);
                        return;
                    }
                    ChangeDisplayNameFragment.this.showSnackbar(R.string.name_invalid);
                }
            }
        }, newName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ChangeDisplayNameFragment changeDisplayNameFragment) {
        changeDisplayNameFragment.dismiss();
        return Unit.INSTANCE;
    }
}
