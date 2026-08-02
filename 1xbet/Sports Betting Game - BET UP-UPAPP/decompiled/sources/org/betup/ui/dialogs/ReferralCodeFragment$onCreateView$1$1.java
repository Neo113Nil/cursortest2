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
import org.betup.model.remote.entity.MetaModel;
import org.betup.model.remote.entity.user.referrals.ReferralResponse;
import org.betup.ui.base.SnackbarDialogFragment;
import org.betup.ui.dialogs.compose.ReferralCodeScreenKt;

/* compiled from: ReferralCodeFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReferralCodeFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $userReferralCode;
    final /* synthetic */ ReferralCodeFragment this$0;

    ReferralCodeFragment$onCreateView$1$1(ReferralCodeFragment referralCodeFragment, String str) {
        this.this$0 = referralCodeFragment;
        this.$userReferralCode = str;
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
            ComposerKt.traceEventStart(-1232265895, i, -1, "org.betup.ui.dialogs.ReferralCodeFragment.onCreateView.<anonymous>.<anonymous> (ReferralCodeFragment.kt:40)");
        }
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ReferralCodeFragment referralCodeFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.ReferralCodeFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ReferralCodeFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(ReferralCodeFragment.this, (String) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ReferralCodeFragment referralCodeFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.ReferralCodeFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = ReferralCodeFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(ReferralCodeFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function0 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$userReferralCode) | composer.changedInstance(this.this$0);
        final String str = this.$userReferralCode;
        final ReferralCodeFragment referralCodeFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.ReferralCodeFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = ReferralCodeFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(str, referralCodeFragment3, (String) obj);
                    return Boolean.valueOf(invoke$lambda$5$lambda$4);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final ReferralCodeFragment referralCodeFragment4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.dialogs.ReferralCodeFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = ReferralCodeFragment$onCreateView$1$1.invoke$lambda$7$lambda$6(ReferralCodeFragment.this, (CharSequence) obj);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        ReferralCodeScreenKt.ReferralCodeScreen(function1, function0, function12, (Function1) rememberedValue4, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(ReferralCodeFragment referralCodeFragment, CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SnackbarDialogFragment.showSnackbar$default(referralCodeFragment, message, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(final ReferralCodeFragment referralCodeFragment, String code) {
        ReferralCodeInteractorAccessor referralCodeInteractorAccessor;
        Intrinsics.checkNotNullParameter(code, "code");
        referralCodeInteractorAccessor = referralCodeFragment.interactorAccessor;
        referralCodeInteractorAccessor.getV7ReferralInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<ReferralResponse, String>() { // from class: org.betup.ui.dialogs.ReferralCodeFragment$onCreateView$1$1$1$1$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<ReferralResponse, String> responseMessage) {
                int i;
                MetaModel metaModel;
                Integer code2;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() == FetchStat.SUCCESS) {
                    ReferralCodeFragment.this.dismiss();
                    ReferralCodeFragment.this.showSnackbar(R.string.code_accepted);
                } else {
                    try {
                        ReferralResponse model = responseMessage.getModel();
                        i = ((model == null || (metaModel = model.metaModel) == null || (code2 = metaModel.getCode()) == null) ? 404 : code2.intValue()) == 403 ? R.string.code_used_on_device : R.string.invalid_referral_code;
                    } catch (Exception unused) {
                        i = R.string.error;
                    }
                    ReferralCodeFragment.this.showSnackbar(i);
                }
            }
        }, code);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ReferralCodeFragment referralCodeFragment) {
        referralCodeFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$5$lambda$4(String str, ReferralCodeFragment referralCodeFragment, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (!Intrinsics.areEqual(code, str)) {
            return true;
        }
        referralCodeFragment.showSnackbar(R.string.not_your_code);
        return false;
    }
}
