package org.betup.ui.dialogs;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.entity.followers.UserFollower;
import org.greenrobot.eventbus.EventBus;

/* compiled from: FollowersDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FollowersDialog$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FollowersDialog this$0;

    FollowersDialog$onCreateView$1$1(FollowersDialog followersDialog) {
        this.this$0 = followersDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean z;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371257123, i, -1, "org.betup.ui.dialogs.FollowersDialog.onCreateView.<anonymous>.<anonymous> (FollowersDialog.kt:95)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getFollowersDialogController().isLoading(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getFollowersDialogController().getFilteredFollowers(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getFollowersDialogController().getFilteredFollowing(), null, composer, 0, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.this$0.getFollowersDialogController().m14178getSelectedTabIndex(), null, composer, 0, 1);
        State collectAsState5 = SnapshotStateKt.collectAsState(this.this$0.getFollowersDialogController().getQuery(), null, composer, 0, 1);
        boolean invoke$lambda$0 = invoke$lambda$0(collectAsState);
        List<UserFollower> invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        List<UserFollower> invoke$lambda$2 = invoke$lambda$2(collectAsState3);
        int invoke$lambda$3 = invoke$lambda$3(collectAsState4);
        String invoke$lambda$4 = invoke$lambda$4(collectAsState5);
        int currentUserId = this.this$0.getFollowersDialogController().getCurrentUserId();
        z = this.this$0.isInBattle;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final FollowersDialog followersDialog = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.FollowersDialog$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$6$lambda$5;
                    invoke$lambda$6$lambda$5 = FollowersDialog$onCreateView$1$1.invoke$lambda$6$lambda$5(FollowersDialog.this, ((Integer) obj).intValue());
                    return invoke$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final FollowersDialog followersDialog2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.dialogs.FollowersDialog$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = FollowersDialog$onCreateView$1$1.invoke$lambda$8$lambda$7(FollowersDialog.this, (String) obj);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function1 function12 = (Function1) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final FollowersDialog followersDialog3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.FollowersDialog$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$10$lambda$9;
                    invoke$lambda$10$lambda$9 = FollowersDialog$onCreateView$1$1.invoke$lambda$10$lambda$9(FollowersDialog.this, (String) obj);
                    return invoke$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function1 function13 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final FollowersDialog followersDialog4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.FollowersDialog$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$12$lambda$11;
                    invoke$lambda$12$lambda$11 = FollowersDialog$onCreateView$1$1.invoke$lambda$12$lambda$11(FollowersDialog.this);
                    return invoke$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function0 function0 = (Function0) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(this.this$0);
        final FollowersDialog followersDialog5 = this.this$0;
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.FollowersDialog$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$13;
                    invoke$lambda$14$lambda$13 = FollowersDialog$onCreateView$1$1.invoke$lambda$14$lambda$13(FollowersDialog.this);
                    return invoke$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function0 function02 = (Function0) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(this.this$0);
        final FollowersDialog followersDialog6 = this.this$0;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function1() { // from class: org.betup.ui.dialogs.FollowersDialog$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$16$lambda$15;
                    invoke$lambda$16$lambda$15 = FollowersDialog$onCreateView$1$1.invoke$lambda$16$lambda$15(FollowersDialog.this, ((Integer) obj).intValue());
                    return invoke$lambda$16$lambda$15;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        FollowersDialogKt.FollowersDialogContent(invoke$lambda$0, invoke$lambda$1, invoke$lambda$2, invoke$lambda$3, invoke$lambda$4, currentUserId, z, function1, function12, function13, function0, function02, (Function1) rememberedValue6, composer, 0, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(FollowersDialog followersDialog, int i) {
        followersDialog.getFollowersDialogController().setSelectedTab(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(FollowersDialog followersDialog, String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        followersDialog.getFollowersDialogController().onQueryChanged(newQuery);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(FollowersDialog followersDialog, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        followersDialog.getFollowersDialogController().performSearch(searchQuery);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(FollowersDialog followersDialog) {
        followersDialog.getFollowersDialogController().resetSearchState();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(FollowersDialog followersDialog) {
        followersDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15(FollowersDialog followersDialog, int i) {
        int i2;
        int i3;
        boolean z;
        FollowersDialogStateManager followersDialogStateManager = FollowersDialogStateManager.INSTANCE;
        i2 = followersDialog.userId;
        i3 = followersDialog.lastSelectedTabIndex;
        z = followersDialog.isInBattle;
        followersDialogStateManager.storeDialogState(i2, i3, z);
        Bundle bundle = new Bundle();
        bundle.putInt("id", i);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
        FollowersDialogStateManager.INSTANCE.clearDialogState();
        followersDialog.dismiss();
        return Unit.INSTANCE;
    }

    private static final boolean invoke$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<UserFollower> invoke$lambda$1(State<? extends List<? extends UserFollower>> state) {
        return (List) state.getValue();
    }

    private static final List<UserFollower> invoke$lambda$2(State<? extends List<? extends UserFollower>> state) {
        return (List) state.getValue();
    }

    private static final int invoke$lambda$3(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final String invoke$lambda$4(State<String> state) {
        return state.getValue();
    }
}
