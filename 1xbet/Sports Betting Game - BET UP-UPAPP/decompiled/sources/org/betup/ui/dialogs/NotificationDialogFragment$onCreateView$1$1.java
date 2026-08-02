package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.subscription.SubscriptionType;
import org.betup.services.subscription.DefaultSubscriptionService;
import org.betup.ui.dialogs.compose.NotificationDialogScreenKt;

/* compiled from: NotificationDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NotificationDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NotificationDialogFragment this$0;

    NotificationDialogFragment$onCreateView$1$1(NotificationDialogFragment notificationDialogFragment) {
        this.this$0 = notificationDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SubscriptionType> invoke$lambda$1(MutableState<List<SubscriptionType>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void invoke(Composer composer, int i) {
        MatchState matchState;
        List list;
        List list2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-370346119, i, -1, "org.betup.ui.dialogs.NotificationDialogFragment.onCreateView.<anonymous>.<anonymous> (NotificationDialogFragment.kt:58)");
        }
        composer.startReplaceGroup(1849434622);
        NotificationDialogFragment notificationDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            list2 = notificationDialogFragment.currentSubscriptions;
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list2, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        NotificationDialogFragment notificationDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            list = notificationDialogFragment2.currentSubscriptions;
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(list == null), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        composer.endReplaceGroup();
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance = composer.changedInstance(this.this$0);
        NotificationDialogFragment notificationDialogFragment3 = this.this$0;
        NotificationDialogFragment$onCreateView$1$1$1$1 rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new NotificationDialogFragment$onCreateView$1$1$1$1(notificationDialogFragment3, mutableState, mutableState2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer, 6);
        List<SubscriptionType> invoke$lambda$1 = invoke$lambda$1(mutableState);
        if (invoke$lambda$1 == null) {
            invoke$lambda$1 = CollectionsKt.emptyList();
        }
        List<SubscriptionType> list3 = invoke$lambda$1;
        matchState = this.this$0.matchState;
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final NotificationDialogFragment notificationDialogFragment4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.dialogs.NotificationDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = NotificationDialogFragment$onCreateView$1$1.invoke$lambda$8$lambda$7(NotificationDialogFragment.this, (List) obj);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function1 function1 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final NotificationDialogFragment notificationDialogFragment5 = this.this$0;
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.NotificationDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9;
                    invoke$lambda$10$lambda$9 = NotificationDialogFragment$onCreateView$1$1.invoke$lambda$10$lambda$9(NotificationDialogFragment.this);
                    return invoke$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        NotificationDialogScreenKt.NotificationDialogScreen(matchState, list3, function1, (Function0) rememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(NotificationDialogFragment notificationDialogFragment, List selectedTypes) {
        int i;
        Function1 function1;
        int i2;
        Intrinsics.checkNotNullParameter(selectedTypes, "selectedTypes");
        i = notificationDialogFragment.matchId;
        if (i > 0) {
            DefaultSubscriptionService subscriptionService = notificationDialogFragment.getSubscriptionService();
            i2 = notificationDialogFragment.matchId;
            subscriptionService.updateMatchSubscriptions(i2, selectedTypes);
        }
        function1 = notificationDialogFragment.onDismissListener;
        if (function1 != null) {
            function1.invoke(selectedTypes);
        }
        notificationDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(NotificationDialogFragment notificationDialogFragment) {
        notificationDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
