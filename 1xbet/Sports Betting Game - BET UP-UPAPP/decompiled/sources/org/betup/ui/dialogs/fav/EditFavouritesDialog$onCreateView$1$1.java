package org.betup.ui.dialogs.fav;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.bus.QuestionDialogMessage;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.greenrobot.eventbus.EventBus;

/* compiled from: EditFavouritesDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class EditFavouritesDialog$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ EditFavouritesDialog this$0;

    EditFavouritesDialog$onCreateView$1$1(EditFavouritesDialog editFavouritesDialog) {
        this.this$0 = editFavouritesDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$38$lambda$37$lambda$36() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final boolean invoke$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10$lambda$9(EditFavouritesDialog editFavouritesDialog, SportListItemUiModel sportListItemUiModel) {
        editFavouritesDialog.getMyController().toggleFavorite(sportListItemUiModel.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18$lambda$17(EditFavouritesDialog editFavouritesDialog, SportListItemUiModel sportListItemUiModel, MutableState mutableState) {
        editFavouritesDialog.getMyController().onSportChanged(sportListItemUiModel);
        invoke$lambda$7(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$20(EditFavouritesDialog editFavouritesDialog) {
        editFavouritesDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$23$lambda$22(MutableState mutableState) {
        invoke$lambda$7(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$24(EditFavouritesDialog editFavouritesDialog, String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        editFavouritesDialog.getMatchesController().onQueryChanged(newQuery);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$26(EditFavouritesDialog editFavouritesDialog, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        editFavouritesDialog.getMatchesController().performSearch(searchQuery);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$28(EditFavouritesDialog editFavouritesDialog) {
        editFavouritesDialog.getMatchesController().resetSearchState();
        editFavouritesDialog.getMatchesController().performSearch("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$31$lambda$30(EditFavouritesDialog editFavouritesDialog) {
        editFavouritesDialog.getMatchesController().loadNextPage();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String stringResource;
        SportListItemUiModel copy$default;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-621624436, i, -1, "org.betup.ui.dialogs.fav.EditFavouritesDialog.onCreateView.<anonymous>.<anonymous> (EditFavouritesDialog.kt:59)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getMyController().getItems(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getMyController().isLoading(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getMyController().isLoadingMore(), null, composer, 0, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.this$0.getMyController().getHasMore(), null, composer, 0, 1);
        State collectAsState5 = SnapshotStateKt.collectAsState(this.this$0.getMyController().getQuery(), null, composer, 0, 1);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        State collectAsState6 = SnapshotStateKt.collectAsState(this.this$0.getMyController().getSelectedSport(), null, composer, 0, 1);
        composer.startReplaceGroup(-380607823);
        List<SportListItemUiModel> invoke$lambda$0 = invoke$lambda$0(collectAsState);
        final EditFavouritesDialog editFavouritesDialog = this.this$0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke$lambda$0, 10));
        for (final SportListItemUiModel sportListItemUiModel : invoke$lambda$0) {
            int id = sportListItemUiModel.getId();
            String name = sportListItemUiModel.getName();
            String photoUrl = sportListItemUiModel.getPhotoUrl();
            boolean isFavorite = sportListItemUiModel.isFavorite();
            composer.startReplaceGroup(-1633490746);
            boolean changedInstance = composer.changedInstance(editFavouritesDialog) | composer.changed(sportListItemUiModel);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$11$lambda$10$lambda$9;
                        invoke$lambda$11$lambda$10$lambda$9 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$11$lambda$10$lambda$9(EditFavouritesDialog.this, sportListItemUiModel);
                        return invoke$lambda$11$lambda$10$lambda$9;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            arrayList.add(new FavItem(id, name, photoUrl, isFavorite, (Function0) rememberedValue2));
        }
        ArrayList arrayList2 = arrayList;
        composer.endReplaceGroup();
        if (invoke$lambda$6(mutableState)) {
            composer.startReplaceGroup(1086546201);
            State collectAsState7 = SnapshotStateKt.collectAsState(this.this$0.getMatchesController().getItems(), null, composer, 0, 1);
            State collectAsState8 = SnapshotStateKt.collectAsState(this.this$0.getMatchesController().isLoading(), null, composer, 0, 1);
            State collectAsState9 = SnapshotStateKt.collectAsState(this.this$0.getMatchesController().isLoadingMore(), null, composer, 0, 1);
            State collectAsState10 = SnapshotStateKt.collectAsState(this.this$0.getMatchesController().getHasMore(), null, composer, 0, 1);
            State collectAsState11 = SnapshotStateKt.collectAsState(this.this$0.getMatchesController().getQuery(), null, composer, 0, 1);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.favourite_sports, composer, 6);
            composer.startReplaceGroup(-380576135);
            List<SportListItemUiModel> invoke$lambda$12 = invoke$lambda$12(collectAsState7);
            final EditFavouritesDialog editFavouritesDialog2 = this.this$0;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke$lambda$12, 10));
            for (final SportListItemUiModel sportListItemUiModel2 : invoke$lambda$12) {
                int id2 = sportListItemUiModel2.getId();
                String name2 = sportListItemUiModel2.getName();
                String photoUrl2 = sportListItemUiModel2.getPhotoUrl();
                boolean isFavorite2 = sportListItemUiModel2.isFavorite();
                composer.startReplaceGroup(-1746271574);
                boolean changedInstance2 = composer.changedInstance(editFavouritesDialog2) | composer.changed(sportListItemUiModel2);
                Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$19$lambda$18$lambda$17;
                            invoke$lambda$19$lambda$18$lambda$17 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$19$lambda$18$lambda$17(EditFavouritesDialog.this, sportListItemUiModel2, mutableState);
                            return invoke$lambda$19$lambda$18$lambda$17;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                arrayList3.add(new FavItem(id2, name2, photoUrl2, isFavorite2, (Function0) rememberedValue3));
            }
            ArrayList arrayList4 = arrayList3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance3 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog3 = this.this$0;
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$21$lambda$20;
                        invoke$lambda$21$lambda$20 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$21$lambda$20(EditFavouritesDialog.this);
                        return invoke$lambda$21$lambda$20;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            Function0 function0 = (Function0) rememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$23$lambda$22;
                        invoke$lambda$23$lambda$22 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$23$lambda$22(MutableState.this);
                        return invoke$lambda$23$lambda$22;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            Function0 function02 = (Function0) rememberedValue5;
            composer.endReplaceGroup();
            String invoke$lambda$16 = invoke$lambda$16(collectAsState11);
            composer.startReplaceGroup(5004770);
            boolean changedInstance4 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog4 = this.this$0;
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$25$lambda$24;
                        invoke$lambda$25$lambda$24 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$25$lambda$24(EditFavouritesDialog.this, (String) obj);
                        return invoke$lambda$25$lambda$24;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            Function1 function1 = (Function1) rememberedValue6;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance5 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog5 = this.this$0;
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function1() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$27$lambda$26;
                        invoke$lambda$27$lambda$26 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$27$lambda$26(EditFavouritesDialog.this, (String) obj);
                        return invoke$lambda$27$lambda$26;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            Function1 function12 = (Function1) rememberedValue7;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance6 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog6 = this.this$0;
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$29$lambda$28;
                        invoke$lambda$29$lambda$28 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$29$lambda$28(EditFavouritesDialog.this);
                        return invoke$lambda$29$lambda$28;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            Function0 function03 = (Function0) rememberedValue8;
            composer.endReplaceGroup();
            boolean invoke$lambda$13 = invoke$lambda$13(collectAsState8);
            boolean invoke$lambda$15 = invoke$lambda$15(collectAsState10);
            boolean invoke$lambda$14 = invoke$lambda$14(collectAsState9);
            composer.startReplaceGroup(5004770);
            boolean changedInstance7 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog7 = this.this$0;
            Object rememberedValue9 = composer.rememberedValue();
            if (changedInstance7 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$31$lambda$30;
                        invoke$lambda$31$lambda$30 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$31$lambda$30(EditFavouritesDialog.this);
                        return invoke$lambda$31$lambda$30;
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            composer.endReplaceGroup();
            EditFavouritesKt.EditFavourites(null, stringResource2, arrayList4, function0, function02, invoke$lambda$16, function1, function12, function03, invoke$lambda$13, invoke$lambda$15, invoke$lambda$14, (Function0) rememberedValue9, null, false, true, composer, 24576, 224256, 1);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1088818904);
            FavouriteTypeK favouriteTypeK = this.this$0.favouriteType;
            if (favouriteTypeK instanceof FavouriteTypeK.Sports) {
                composer.startReplaceGroup(-380517766);
                stringResource = StringResources_androidKt.stringResource(R.string.favourite_sports, composer, 6);
                composer.endReplaceGroup();
            } else if (favouriteTypeK instanceof FavouriteTypeK.Leagues) {
                composer.startReplaceGroup(-380514437);
                stringResource = StringResources_androidKt.stringResource(R.string.favourite_leagues, composer, 6);
                composer.endReplaceGroup();
            } else {
                if (!(favouriteTypeK instanceof FavouriteTypeK.Teams)) {
                    composer.startReplaceGroup(-380519983);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-380511143);
                stringResource = StringResources_androidKt.stringResource(R.string.favourite_teams, composer, 6);
                composer.endReplaceGroup();
            }
            String str = stringResource;
            composer.startReplaceGroup(5004770);
            boolean changedInstance8 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog8 = this.this$0;
            Object rememberedValue10 = composer.rememberedValue();
            if (changedInstance8 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$34$lambda$33;
                        invoke$lambda$34$lambda$33 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$34$lambda$33(EditFavouritesDialog.this);
                        return invoke$lambda$34$lambda$33;
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            Function0 function04 = (Function0) rememberedValue10;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance9 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog9 = this.this$0;
            Object rememberedValue11 = composer.rememberedValue();
            if (changedInstance9 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$38$lambda$37;
                        invoke$lambda$38$lambda$37 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$38$lambda$37(EditFavouritesDialog.this);
                        return invoke$lambda$38$lambda$37;
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            Function0 function05 = (Function0) rememberedValue11;
            composer.endReplaceGroup();
            String invoke$lambda$4 = invoke$lambda$4(collectAsState5);
            composer.startReplaceGroup(5004770);
            boolean changedInstance10 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog10 = this.this$0;
            Object rememberedValue12 = composer.rememberedValue();
            if (changedInstance10 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function1() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$40$lambda$39;
                        invoke$lambda$40$lambda$39 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$40$lambda$39(EditFavouritesDialog.this, (String) obj);
                        return invoke$lambda$40$lambda$39;
                    }
                };
                composer.updateRememberedValue(rememberedValue12);
            }
            Function1 function13 = (Function1) rememberedValue12;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance11 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog11 = this.this$0;
            Object rememberedValue13 = composer.rememberedValue();
            if (changedInstance11 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new Function1() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$42$lambda$41;
                        invoke$lambda$42$lambda$41 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$42$lambda$41(EditFavouritesDialog.this, (String) obj);
                        return invoke$lambda$42$lambda$41;
                    }
                };
                composer.updateRememberedValue(rememberedValue13);
            }
            Function1 function14 = (Function1) rememberedValue13;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance12 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog12 = this.this$0;
            Object rememberedValue14 = composer.rememberedValue();
            if (changedInstance12 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$44$lambda$43;
                        invoke$lambda$44$lambda$43 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$44$lambda$43(EditFavouritesDialog.this);
                        return invoke$lambda$44$lambda$43;
                    }
                };
                composer.updateRememberedValue(rememberedValue14);
            }
            Function0 function06 = (Function0) rememberedValue14;
            composer.endReplaceGroup();
            boolean invoke$lambda$1 = invoke$lambda$1(collectAsState2);
            boolean invoke$lambda$3 = invoke$lambda$3(collectAsState4);
            boolean invoke$lambda$2 = invoke$lambda$2(collectAsState3);
            composer.startReplaceGroup(5004770);
            boolean changedInstance13 = composer.changedInstance(this.this$0);
            final EditFavouritesDialog editFavouritesDialog13 = this.this$0;
            Object rememberedValue15 = composer.rememberedValue();
            if (changedInstance13 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$46$lambda$45;
                        invoke$lambda$46$lambda$45 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$46$lambda$45(EditFavouritesDialog.this);
                        return invoke$lambda$46$lambda$45;
                    }
                };
                composer.updateRememberedValue(rememberedValue15);
            }
            Function0 function07 = (Function0) rememberedValue15;
            composer.endReplaceGroup();
            SportListItemUiModel invoke$lambda$8 = invoke$lambda$8(collectAsState6);
            composer.startReplaceGroup(-380411292);
            if (invoke$lambda$8 == null) {
                copy$default = null;
            } else {
                composer.startReplaceGroup(5004770);
                Object rememberedValue16 = composer.rememberedValue();
                if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new Function0() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$48$lambda$47;
                            invoke$lambda$48$lambda$47 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$48$lambda$47(MutableState.this);
                            return invoke$lambda$48$lambda$47;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue16);
                }
                composer.endReplaceGroup();
                copy$default = SportListItemUiModel.copy$default(invoke$lambda$8, 0, null, null, 0, 0, false, (Function0) rememberedValue16, 63, null);
            }
            composer.endReplaceGroup();
            EditFavouritesKt.EditFavourites(null, str, arrayList2, function04, function05, invoke$lambda$4, function13, function14, function06, invoke$lambda$1, invoke$lambda$3, invoke$lambda$2, function07, copy$default, (this.this$0.favouriteType instanceof FavouriteTypeK.Leagues) || (this.this$0.favouriteType instanceof FavouriteTypeK.Teams), false, composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 1);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$34$lambda$33(final EditFavouritesDialog editFavouritesDialog) {
        editFavouritesDialog.getMyController().saveFavorites(new Function1() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$34$lambda$33$lambda$32;
                invoke$lambda$34$lambda$33$lambda$32 = EditFavouritesDialog$onCreateView$1$1.invoke$lambda$34$lambda$33$lambda$32(EditFavouritesDialog.this, ((Boolean) obj).booleanValue());
                return invoke$lambda$34$lambda$33$lambda$32;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$34$lambda$33$lambda$32(EditFavouritesDialog editFavouritesDialog, boolean z) {
        if (z) {
            Log.d("EditFavouritesDialog", "Favorites saved successfully");
        } else {
            Log.e("EditFavouritesDialog", "Failed to save favorites");
        }
        editFavouritesDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$38$lambda$37(final EditFavouritesDialog editFavouritesDialog) {
        if (editFavouritesDialog.getMyController().hasUnsavedChanges()) {
            EventBus.getDefault().post(new QuestionDialogMessage(editFavouritesDialog.getString(R.string.unsaved_changes_message), new Runnable() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EditFavouritesDialog.this.dismiss();
                }
            }, new Runnable() { // from class: org.betup.ui.dialogs.fav.EditFavouritesDialog$onCreateView$1$1$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    EditFavouritesDialog$onCreateView$1$1.invoke$lambda$38$lambda$37$lambda$36();
                }
            }));
        } else {
            editFavouritesDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39(EditFavouritesDialog editFavouritesDialog, String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        editFavouritesDialog.getMyController().onQueryChanged(newQuery);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$42$lambda$41(EditFavouritesDialog editFavouritesDialog, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        editFavouritesDialog.getMyController().performSearch(searchQuery);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$44$lambda$43(EditFavouritesDialog editFavouritesDialog) {
        editFavouritesDialog.getMyController().resetSearchState();
        editFavouritesDialog.getMyController().performSearch("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$46$lambda$45(EditFavouritesDialog editFavouritesDialog) {
        editFavouritesDialog.getMyController().loadNextPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$48$lambda$47(MutableState mutableState) {
        invoke$lambda$7(mutableState, true);
        return Unit.INSTANCE;
    }

    private static final List<SportListItemUiModel> invoke$lambda$0(State<? extends List<SportListItemUiModel>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String invoke$lambda$4(State<String> state) {
        return state.getValue();
    }

    private static final SportListItemUiModel invoke$lambda$8(State<SportListItemUiModel> state) {
        return state.getValue();
    }

    private static final List<SportListItemUiModel> invoke$lambda$12(State<? extends List<SportListItemUiModel>> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$13(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$14(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$15(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final String invoke$lambda$16(State<String> state) {
        return state.getValue();
    }
}
