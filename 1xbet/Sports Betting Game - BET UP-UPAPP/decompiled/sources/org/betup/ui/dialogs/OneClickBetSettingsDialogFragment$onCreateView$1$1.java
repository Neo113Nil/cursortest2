package org.betup.ui.dialogs;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.user.OneClickBetSettingsModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.PlayerStatsMinStakeComposeDialogFragment;
import org.betup.utils.FormatHelper;

/* compiled from: OneClickBetSettingsDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OneClickBetSettingsDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Function1<Context, Function2<CharSequence, Long, Unit>> $notify;
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ OneClickBetSettingsDialogFragment this$0;

    /* JADX WARN: Multi-variable type inference failed */
    OneClickBetSettingsDialogFragment$onCreateView$1$1(OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment, Function1<? super Context, ? extends Function2<? super CharSequence, ? super Long, Unit>> function1, Context context, ComposeView composeView) {
        this.this$0 = oneClickBetSettingsDialogFragment;
        this.$notify = function1;
        this.$ctx = context;
        this.$this_apply = composeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final OneClickBetSettingsModel invoke$lambda$1(MutableState<OneClickBetSettingsModel> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$22(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$25(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$28(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$29(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$31(MutableState<Long> mutableState) {
        return mutableState.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$32(MutableState<Long> mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$36$lambda$35(OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment, Function2 function2, Context context, long j, MutableState mutableState, MutableState mutableState2, FetchedResponseMessage fetchedResponseMessage) {
        invoke$lambda$26(mutableState, false);
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            oneClickBetSettingsDialogFragment.getUserService().applyUserProgress((UserProgressModel) fetchedResponseMessage.getModel());
            invoke$lambda$23(mutableState2, true);
            oneClickBetSettingsDialogFragment.getUserService().invalidate(UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
            oneClickBetSettingsDialogFragment.getUserService().getProfile(oneClickBetSettingsDialogFragment.getBetsController(), UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
            String string = context.getString(R.string.one_click_bet_unlock_success_detail, Long.valueOf(j), Long.valueOf(((UserProgressModel) fetchedResponseMessage.getModel()).getMoneyBalance()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            function2.invoke(string, 5500L);
            return;
        }
        if (fetchedResponseMessage.getStat() == FetchStat.INVALID) {
            long j2 = 0;
            try {
                UserProgressModel userProgressModel = oneClickBetSettingsDialogFragment.getUserService().getShortProfile().getUserProgressModel();
                if (userProgressModel != null) {
                    j2 = userProgressModel.getMoneyBalance();
                }
            } catch (Exception unused) {
            }
            String string2 = context.getString(R.string.one_click_bet_unlock_insufficient_detail, Long.valueOf(j), Long.valueOf(j2));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            function2.invoke(string2, 5500L);
            return;
        }
        String string3 = context.getString(R.string.one_click_bet_unlock_failed_detail);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        function2.invoke(string3, 5500L);
    }

    public final void invoke(Composer composer, int i) {
        Object obj;
        String dialogTitle;
        boolean z;
        UserProgressModel userProgressModel;
        boolean z2;
        MutableState mutableState;
        final MutableState mutableState2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1433939715, i, -1, "org.betup.ui.dialogs.OneClickBetSettingsDialogFragment.onCreateView.<anonymous>.<anonymous> (OneClickBetSettingsDialogFragment.kt:123)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState3 = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState4 = (MutableState) rememberedValue2;
        composer.endReplaceGroup();
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance = composer.changedInstance(this.this$0);
        OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (Function2) new OneClickBetSettingsDialogFragment$onCreateView$1$1$1$1(oneClickBetSettingsDialogFragment, mutableState4, mutableState3, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer, 6);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = false;
            composer.updateRememberedValue(rememberedValue4);
        }
        boolean booleanValue = ((Boolean) rememberedValue4).booleanValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        ComposeView composeView = this.$this_apply;
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = Long.valueOf(composeView.getResources().getInteger(R.integer.one_click_bet_unlock_cost));
            composer.updateRememberedValue(rememberedValue5);
        }
        long longValue = ((Number) rememberedValue5).longValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment2 = this.this$0;
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = Long.valueOf(oneClickBetSettingsDialogFragment2.getBetsController().containsPlayerStatsBetInSlip() ? oneClickBetSettingsDialogFragment2.getBetsController().getPlayerStatsMinStakeBetcoins() : 0L);
            composer.updateRememberedValue(rememberedValue6);
        }
        final long longValue2 = ((Number) rememberedValue6).longValue();
        composer.endReplaceGroup();
        Object invoke$lambda$1 = invoke$lambda$1(mutableState3);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(invoke$lambda$1);
        Object rememberedValue7 = composer.rememberedValue();
        if (changed || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            OneClickBetSettingsModel invoke$lambda$12 = invoke$lambda$1(mutableState3);
            long minStakeBetcoins = invoke$lambda$12 != null ? invoke$lambda$12.getMinStakeBetcoins() : 0L;
            if (minStakeBetcoins <= 0) {
                minStakeBetcoins = 100;
            }
            rememberedValue7 = Long.valueOf(Math.max(minStakeBetcoins, longValue2));
            composer.updateRememberedValue(rememberedValue7);
        }
        final long longValue3 = ((Number) rememberedValue7).longValue();
        composer.endReplaceGroup();
        Object invoke$lambda$13 = invoke$lambda$1(mutableState3);
        composer.startReplaceGroup(5004770);
        boolean changed2 = composer.changed(invoke$lambda$13);
        Object rememberedValue8 = composer.rememberedValue();
        if (changed2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            OneClickBetSettingsModel invoke$lambda$14 = invoke$lambda$1(mutableState3);
            long maxStakeBetcoins = invoke$lambda$14 != null ? invoke$lambda$14.getMaxStakeBetcoins() : 0L;
            if (maxStakeBetcoins <= 0) {
                maxStakeBetcoins = Long.MAX_VALUE;
            }
            rememberedValue8 = Long.valueOf(maxStakeBetcoins);
            composer.updateRememberedValue(rememberedValue8);
        }
        long longValue4 = ((Number) rememberedValue8).longValue();
        composer.endReplaceGroup();
        Object invoke$lambda$15 = invoke$lambda$1(mutableState3);
        composer.startReplaceGroup(-1633490746);
        boolean changed3 = composer.changed(invoke$lambda$15);
        Object rememberedValue9 = composer.rememberedValue();
        if (changed3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            if (booleanValue) {
                OneClickBetSettingsModel invoke$lambda$16 = invoke$lambda$1(mutableState3);
                long unlockCostBetcoins = invoke$lambda$16 != null ? invoke$lambda$16.getUnlockCostBetcoins() : 0L;
                if (unlockCostBetcoins > 0) {
                    longValue = unlockCostBetcoins;
                }
            } else {
                longValue = 0;
            }
            rememberedValue9 = Long.valueOf(longValue);
            composer.updateRememberedValue(rememberedValue9);
        }
        final long longValue5 = ((Number) rememberedValue9).longValue();
        composer.endReplaceGroup();
        Object invoke$lambda$17 = invoke$lambda$1(mutableState3);
        composer.startReplaceGroup(5004770);
        boolean changed4 = composer.changed(invoke$lambda$17);
        Object rememberedValue10 = composer.rememberedValue();
        if (changed4 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            OneClickBetSettingsModel invoke$lambda$18 = invoke$lambda$1(mutableState3);
            if (invoke$lambda$18 == null || (dialogTitle = invoke$lambda$18.getDialogTitle()) == null || (obj = StringsKt.trim((CharSequence) dialogTitle).toString()) == null || ((CharSequence) obj).length() <= 0) {
                obj = null;
            }
            composer.updateRememberedValue(obj);
            rememberedValue10 = obj;
        }
        String str = (String) rememberedValue10;
        composer.endReplaceGroup();
        Object invoke$lambda$19 = invoke$lambda$1(mutableState3);
        composer.startReplaceGroup(5004770);
        boolean changed5 = composer.changed(invoke$lambda$19);
        Object rememberedValue11 = composer.rememberedValue();
        if (changed5 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            OneClickBetSettingsModel invoke$lambda$110 = invoke$lambda$1(mutableState3);
            long presetStakeBetcoins1 = invoke$lambda$110 != null ? invoke$lambda$110.getPresetStakeBetcoins1() : 0L;
            if (presetStakeBetcoins1 <= 0) {
                presetStakeBetcoins1 = 5000;
            }
            rememberedValue11 = Long.valueOf(presetStakeBetcoins1);
            composer.updateRememberedValue(rememberedValue11);
        }
        long longValue6 = ((Number) rememberedValue11).longValue();
        composer.endReplaceGroup();
        Object invoke$lambda$111 = invoke$lambda$1(mutableState3);
        composer.startReplaceGroup(5004770);
        boolean changed6 = composer.changed(invoke$lambda$111);
        Object rememberedValue12 = composer.rememberedValue();
        if (changed6 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            OneClickBetSettingsModel invoke$lambda$112 = invoke$lambda$1(mutableState3);
            long presetStakeBetcoins2 = invoke$lambda$112 != null ? invoke$lambda$112.getPresetStakeBetcoins2() : 0L;
            if (presetStakeBetcoins2 <= 0) {
                presetStakeBetcoins2 = 10000;
            }
            rememberedValue12 = Long.valueOf(presetStakeBetcoins2);
            composer.updateRememberedValue(rememberedValue12);
        }
        long longValue7 = ((Number) rememberedValue12).longValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment3 = this.this$0;
        Object rememberedValue13 = composer.rememberedValue();
        if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
            rememberedValue13 = Long.valueOf(oneClickBetSettingsDialogFragment3.getUserService().getBetupUserIdOrZero());
            composer.updateRememberedValue(rememberedValue13);
        }
        long longValue8 = ((Number) rememberedValue13).longValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment4 = this.this$0;
        Object rememberedValue14 = composer.rememberedValue();
        if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
            try {
                userProgressModel = oneClickBetSettingsDialogFragment4.getUserService().getShortProfile().getUserProgressModel();
            } catch (Exception unused) {
            }
            if (userProgressModel != null) {
                if (userProgressModel.isOneClickBetUnlocked()) {
                    z = true;
                    rememberedValue14 = Boolean.valueOf(z);
                    composer.updateRememberedValue(rememberedValue14);
                }
            }
            z = false;
            rememberedValue14 = Boolean.valueOf(z);
            composer.updateRememberedValue(rememberedValue14);
        }
        boolean booleanValue2 = ((Boolean) rememberedValue14).booleanValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment5 = this.this$0;
        Object rememberedValue15 = composer.rememberedValue();
        if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
            rememberedValue15 = Boolean.valueOf(oneClickBetSettingsDialogFragment5.getLocalPreferencesService().isOneClickBetEnabled(longValue8));
            composer.updateRememberedValue(rememberedValue15);
        }
        boolean booleanValue3 = ((Boolean) rememberedValue15).booleanValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment6 = this.this$0;
        Object rememberedValue16 = composer.rememberedValue();
        if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
            rememberedValue16 = Long.valueOf(oneClickBetSettingsDialogFragment6.getLocalPreferencesService().getOneClickBetStake(longValue8));
            composer.updateRememberedValue(rememberedValue16);
        }
        long longValue9 = ((Number) rememberedValue16).longValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue17 = composer.rememberedValue();
        if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
            Object mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(booleanValue2 || !booleanValue), null, 2, null);
            composer.updateRememberedValue(mutableStateOf$default);
            rememberedValue17 = mutableStateOf$default;
        }
        MutableState mutableState5 = (MutableState) rememberedValue17;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue18 = composer.rememberedValue();
        if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
            rememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue18);
        }
        final MutableState mutableState6 = (MutableState) rememberedValue18;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue19 = composer.rememberedValue();
        if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
            rememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(booleanValue3), null, 2, null);
            composer.updateRememberedValue(rememberedValue19);
        }
        final MutableState mutableState7 = (MutableState) rememberedValue19;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue20 = composer.rememberedValue();
        if (rememberedValue20 == Composer.INSTANCE.getEmpty()) {
            rememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(longValue9), null, 2, null);
            composer.updateRememberedValue(rememberedValue20);
        }
        final MutableState mutableState8 = (MutableState) rememberedValue20;
        composer.endReplaceGroup();
        boolean invoke$lambda$4 = invoke$lambda$4(mutableState4);
        composer.startReplaceGroup(-1746271574);
        boolean changed7 = composer.changed(invoke$lambda$4) | composer.changed(longValue4) | composer.changed(longValue3);
        OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment7 = this.this$0;
        Object rememberedValue21 = composer.rememberedValue();
        if (changed7 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
            z2 = booleanValue;
            mutableState = mutableState5;
            long coerceAtLeast = RangesKt.coerceAtLeast(oneClickBetSettingsDialogFragment7.getFirebaseRemoteConfig().getLong(RemoteConfigConstants.MAX_BET_LIMIT), 1L);
            if (longValue4 <= 0 || longValue4 >= Long.MAX_VALUE) {
                longValue4 = coerceAtLeast;
            }
            rememberedValue21 = Long.valueOf(RangesKt.coerceAtLeast(Math.min(longValue4, coerceAtLeast), longValue3));
            composer.updateRememberedValue(rememberedValue21);
        } else {
            z2 = booleanValue;
            mutableState = mutableState5;
        }
        final long longValue10 = ((Number) rememberedValue21).longValue();
        composer.endReplaceGroup();
        Boolean valueOf = Boolean.valueOf(invoke$lambda$4(mutableState4));
        Long valueOf2 = Long.valueOf(longValue3);
        Long valueOf3 = Long.valueOf(longValue10);
        composer.startReplaceGroup(-1224400529);
        boolean changed8 = composer.changed(longValue3) | composer.changed(longValue10);
        Object rememberedValue22 = composer.rememberedValue();
        if (changed8 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
            rememberedValue22 = (Function2) new OneClickBetSettingsDialogFragment$onCreateView$1$1$2$1(longValue3, longValue10, mutableState4, mutableState8, null);
            composer.updateRememberedValue(rememberedValue22);
        }
        composer.endReplaceGroup();
        final boolean z3 = z2;
        EffectsKt.LaunchedEffect(valueOf, valueOf2, valueOf3, (Function2) rememberedValue22, composer, 0);
        final Function2<CharSequence, Long, Unit> invoke = this.$notify.invoke(this.$ctx);
        composer.startReplaceGroup(5004770);
        boolean changed9 = composer.changed(longValue5);
        final OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment8 = this.this$0;
        final Context context = this.$ctx;
        Object rememberedValue23 = composer.rememberedValue();
        if (changed9 || rememberedValue23 == Composer.INSTANCE.getEmpty()) {
            final MutableState mutableState9 = mutableState;
            rememberedValue23 = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$36$lambda$35(OneClickBetSettingsDialogFragment.this, invoke, context, longValue5, mutableState6, mutableState9, fetchedResponseMessage);
                }
            };
            composer.updateRememberedValue(rememberedValue23);
        }
        final BaseCachedSharedInteractor.OnFetchedListener onFetchedListener = (BaseCachedSharedInteractor.OnFetchedListener) rememberedValue23;
        composer.endReplaceGroup();
        boolean invoke$lambda$22 = invoke$lambda$22(mutableState);
        boolean invoke$lambda$25 = invoke$lambda$25(mutableState6);
        boolean invoke$lambda$28 = invoke$lambda$28(mutableState7);
        long invoke$lambda$31 = invoke$lambda$31(mutableState8);
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance2 = composer.changedInstance(this.this$0) | composer.changedInstance(onFetchedListener);
        final OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment9 = this.this$0;
        Object rememberedValue24 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue24 == Composer.INSTANCE.getEmpty()) {
            rememberedValue24 = new Function0() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$38$lambda$37;
                    invoke$lambda$38$lambda$37 = OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$38$lambda$37(z3, oneClickBetSettingsDialogFragment9, onFetchedListener, mutableState6);
                    return invoke$lambda$38$lambda$37;
                }
            };
            composer.updateRememberedValue(rememberedValue24);
        }
        Function0 function0 = (Function0) rememberedValue24;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        Object rememberedValue25 = composer.rememberedValue();
        if (rememberedValue25 == Composer.INSTANCE.getEmpty()) {
            mutableState2 = mutableState;
            rememberedValue25 = new Function1() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$40$lambda$39;
                    invoke$lambda$40$lambda$39 = OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$40$lambda$39(MutableState.this, mutableState7, ((Boolean) obj2).booleanValue());
                    return invoke$lambda$40$lambda$39;
                }
            };
            composer.updateRememberedValue(rememberedValue25);
        } else {
            mutableState2 = mutableState;
        }
        Function1 function1 = (Function1) rememberedValue25;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean changed10 = composer.changed(longValue3) | composer.changed(longValue10);
        Object rememberedValue26 = composer.rememberedValue();
        if (changed10 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
            rememberedValue26 = new Function1() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$42$lambda$41;
                    invoke$lambda$42$lambda$41 = OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$42$lambda$41(longValue3, longValue10, mutableState8, ((Long) obj2).longValue());
                    return invoke$lambda$42$lambda$41;
                }
            };
            composer.updateRememberedValue(rememberedValue26);
        }
        Function1 function12 = (Function1) rememberedValue26;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment10 = this.this$0;
        Object rememberedValue27 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue27 == Composer.INSTANCE.getEmpty()) {
            rememberedValue27 = new Function0() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$44$lambda$43;
                    invoke$lambda$44$lambda$43 = OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$44$lambda$43(OneClickBetSettingsDialogFragment.this);
                    return invoke$lambda$44$lambda$43;
                }
            };
            composer.updateRememberedValue(rememberedValue27);
        }
        Function0 function02 = (Function0) rememberedValue27;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean changed11 = composer.changed(longValue3) | composer.changedInstance(this.$ctx) | composer.changed(invoke) | composer.changedInstance(this.this$0);
        final Context context2 = this.$ctx;
        final OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment11 = this.this$0;
        Object rememberedValue28 = composer.rememberedValue();
        if (changed11 || rememberedValue28 == Composer.INSTANCE.getEmpty()) {
            final MutableState mutableState10 = mutableState2;
            rememberedValue28 = new Function0() { // from class: org.betup.ui.dialogs.OneClickBetSettingsDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$46$lambda$45;
                    invoke$lambda$46$lambda$45 = OneClickBetSettingsDialogFragment$onCreateView$1$1.invoke$lambda$46$lambda$45(longValue3, longValue2, context2, invoke, oneClickBetSettingsDialogFragment11, mutableState8, mutableState7, mutableState10);
                    return invoke$lambda$46$lambda$45;
                }
            };
            composer.updateRememberedValue(rememberedValue28);
        }
        composer.endReplaceGroup();
        OneClickBetSettingsDialogFragmentKt.OneClickBetSettingsContent(invoke$lambda$22, invoke$lambda$25, longValue5, str, longValue6, longValue7, invoke$lambda$28, invoke$lambda$31, longValue10, longValue3, function0, function1, function12, function02, (Function0) rememberedValue28, composer, 0, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$38$lambda$37(boolean z, OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment, BaseCachedSharedInteractor.OnFetchedListener onFetchedListener, MutableState mutableState) {
        if (z && !invoke$lambda$25(mutableState)) {
            invoke$lambda$26(mutableState, true);
            oneClickBetSettingsDialogFragment.getUnlockOneClickBetInteractor().load(onFetchedListener, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39(MutableState mutableState, MutableState mutableState2, boolean z) {
        if (invoke$lambda$22(mutableState)) {
            invoke$lambda$29(mutableState2, z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$42$lambda$41(long j, long j2, MutableState mutableState, long j3) {
        invoke$lambda$32(mutableState, RangesKt.coerceIn(j3, j, j2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$44$lambda$43(OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment) {
        oneClickBetSettingsDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$46$lambda$45(long j, long j2, Context context, Function2 function2, OneClickBetSettingsDialogFragment oneClickBetSettingsDialogFragment, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        Function0 function0;
        String string;
        if (invoke$lambda$31(mutableState) < j) {
            if (j2 > 0 && invoke$lambda$31(mutableState) < j2) {
                string = context.getString(R.string.player_stats_min_stake_required, FormatHelper.getShopBetcoinsFormated(j2));
            } else {
                string = context.getString(R.string.one_click_bet_min_stake_detail, Long.valueOf(j));
            }
            Intrinsics.checkNotNull(string);
            function2.invoke(string, 5500L);
            if (j2 > 0 && invoke$lambda$31(mutableState) < j2) {
                PlayerStatsMinStakeComposeDialogFragment.Companion companion = PlayerStatsMinStakeComposeDialogFragment.INSTANCE;
                FragmentActivity requireActivity = oneClickBetSettingsDialogFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                companion.show(requireActivity, string);
            }
        } else {
            long betupUserIdOrZero = oneClickBetSettingsDialogFragment.getUserService().getBetupUserIdOrZero();
            boolean isOneClickBetEnabled = oneClickBetSettingsDialogFragment.getLocalPreferencesService().isOneClickBetEnabled(betupUserIdOrZero);
            oneClickBetSettingsDialogFragment.getLocalPreferencesService().setOneClickBetEnabled(betupUserIdOrZero, invoke$lambda$28(mutableState2));
            oneClickBetSettingsDialogFragment.getLocalPreferencesService().setOneClickBetStake(betupUserIdOrZero, invoke$lambda$31(mutableState));
            function0 = oneClickBetSettingsDialogFragment.onSavedListener;
            if (function0 != null) {
                function0.invoke();
            }
            if (invoke$lambda$22(mutableState3) && invoke$lambda$28(mutableState2) && !isOneClickBetEnabled) {
                String string2 = context.getString(R.string.one_click_bet_notify_enabled);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                function2.invoke(string2, 5500L);
            } else if (invoke$lambda$22(mutableState3) && !invoke$lambda$28(mutableState2) && isOneClickBetEnabled) {
                String string3 = context.getString(R.string.one_click_bet_notify_disabled);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                function2.invoke(string3, 5500L);
            } else {
                String string4 = context.getString(R.string.one_click_bet_notify_saved, Long.valueOf(invoke$lambda$31(mutableState)));
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                function2.invoke(string4, 5500L);
            }
            oneClickBetSettingsDialogFragment.dismiss();
        }
        return Unit.INSTANCE;
    }
}
