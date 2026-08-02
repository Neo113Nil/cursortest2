package org.betup.ui.fragment.achievements.controller;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;
import org.betup.model.remote.entity.achievements.NewAchievementSummaryModel;
import org.betup.model.remote.entity.achievements.NewAchievementsResponseModel;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.betup.ui.fragment.achievements.compose.model.AchievementUiModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AchievementsController.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010%\u001a\u00020\"J\u0006\u0010&\u001a\u00020\"J\u000e\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\"2\u0006\u0010(\u001a\u00020)R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020)0,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lorg/betup/ui/fragment/achievements/controller/AchievementsController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "achievementsInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;", "getAchievementsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;", "setAchievementsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserAchievementsInteractor;)V", "_achievements", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/betup/ui/fragment/achievements/compose/model/AchievementUiModel;", "achievements", "Lkotlinx/coroutines/flow/StateFlow;", "getAchievements", "()Lkotlinx/coroutines/flow/StateFlow;", "_summary", "Lorg/betup/model/remote/entity/achievements/NewAchievementSummaryModel;", "summary", "getSummary", "_achievement15", "achievement15", "getAchievement15", "_isAchievementsLoading", "", "isAchievementsLoading", "_achievementsError", "", "achievementsError", "getAchievementsError", "isControllerActive", "initialize", "", "context", "Landroid/content/Context;", "setInactive", "unbind", "loadAchievements", "userId", "", "refreshAchievements", "achievementsListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/achievements/NewAchievementsResponseModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AchievementsController {
    public static final int $stable = 8;
    private final MutableStateFlow<AchievementUiModel> _achievement15;
    private final MutableStateFlow<List<AchievementUiModel>> _achievements;
    private final MutableStateFlow<String> _achievementsError;
    private final MutableStateFlow<Boolean> _isAchievementsLoading;
    private final MutableStateFlow<NewAchievementSummaryModel> _summary;
    private final StateFlow<AchievementUiModel> achievement15;
    private final StateFlow<List<AchievementUiModel>> achievements;
    private final StateFlow<String> achievementsError;

    @Inject
    public V7UserAchievementsInteractor achievementsInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewAchievementsResponseModel, Integer> achievementsListener;
    private final StateFlow<Boolean> isAchievementsLoading;
    private boolean isControllerActive;
    private final StateFlow<NewAchievementSummaryModel> summary;

    @Inject
    public AchievementsController() {
        MutableStateFlow<List<AchievementUiModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._achievements = MutableStateFlow;
        this.achievements = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<NewAchievementSummaryModel> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._summary = MutableStateFlow2;
        this.summary = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<AchievementUiModel> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this._achievement15 = MutableStateFlow3;
        this.achievement15 = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._isAchievementsLoading = MutableStateFlow4;
        this.isAchievementsLoading = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._achievementsError = MutableStateFlow5;
        this.achievementsError = FlowKt.asStateFlow(MutableStateFlow5);
        this.achievementsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.achievements.controller.AchievementsController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                AchievementsController.achievementsListener$lambda$3(AchievementsController.this, fetchedResponseMessage);
            }
        };
    }

    public final V7UserAchievementsInteractor getAchievementsInteractor() {
        V7UserAchievementsInteractor v7UserAchievementsInteractor = this.achievementsInteractor;
        if (v7UserAchievementsInteractor != null) {
            return v7UserAchievementsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("achievementsInteractor");
        return null;
    }

    public final void setAchievementsInteractor(V7UserAchievementsInteractor v7UserAchievementsInteractor) {
        Intrinsics.checkNotNullParameter(v7UserAchievementsInteractor, "<set-?>");
        this.achievementsInteractor = v7UserAchievementsInteractor;
    }

    public final StateFlow<List<AchievementUiModel>> getAchievements() {
        return this.achievements;
    }

    public final StateFlow<NewAchievementSummaryModel> getSummary() {
        return this.summary;
    }

    public final StateFlow<AchievementUiModel> getAchievement15() {
        return this.achievement15;
    }

    public final StateFlow<Boolean> isAchievementsLoading() {
        return this.isAchievementsLoading;
    }

    public final StateFlow<String> getAchievementsError() {
        return this.achievementsError;
    }

    public final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        this.isControllerActive = true;
        Log.d("AchievementsController", "Controller initialized");
    }

    /* renamed from: isControllerActive, reason: from getter */
    public final boolean getIsControllerActive() {
        return this.isControllerActive;
    }

    public final void setInactive() {
        this.isControllerActive = false;
        Log.d("AchievementsController", "Controller set as inactive");
    }

    public final void unbind() {
        this.isControllerActive = false;
        Log.d("AchievementsController", "Controller unbound");
    }

    public final void loadAchievements(int userId) {
        if (this._isAchievementsLoading.getValue().booleanValue()) {
            return;
        }
        this._isAchievementsLoading.setValue(true);
        this._achievementsError.setValue(null);
        getAchievementsInteractor().load(this.achievementsListener, Integer.valueOf(userId));
    }

    public final void refreshAchievements(int userId) {
        Log.d("AchievementsController", "Refreshing achievements data for user: " + userId);
        getAchievementsInteractor().invalidate(userId);
        loadAchievements(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void achievementsListener$lambda$3(AchievementsController achievementsController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        AchievementUiModel achievementUiModel;
        achievementsController._isAchievementsLoading.setValue(false);
        if (!achievementsController.isControllerActive) {
            Log.d("AchievementsController", "Controller inactive, ignoring achievements response");
            return;
        }
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            NewAchievementsResponseModel newAchievementsResponseModel = (NewAchievementsResponseModel) fetchedResponseMessage.getModel();
            ArrayList items = newAchievementsResponseModel.getItems();
            NewAchievementSummaryModel summary = newAchievementsResponseModel.getSummary();
            NewUserAchievementsModel newUserAchievementsModel = items.size() >= 15 ? items.get(14) : null;
            if (newUserAchievementsModel != null) {
                Intrinsics.checkNotNull(items);
                ArrayList arrayList = new ArrayList();
                for (Object obj : items) {
                    if (((NewUserAchievementsModel) obj).getId() != newUserAchievementsModel.getId()) {
                        arrayList.add(obj);
                    }
                }
                items = arrayList;
            }
            Intrinsics.checkNotNull(items);
            List<NewUserAchievementsModel> list = items;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (NewUserAchievementsModel newUserAchievementsModel2 : list) {
                int id = newUserAchievementsModel2.getId();
                String name = newUserAchievementsModel2.getName();
                String str2 = name == null ? "" : name;
                String description = newUserAchievementsModel2.getDescription();
                String str3 = description == null ? "" : description;
                String photoUrl = newUserAchievementsModel2.getPhotoUrl();
                arrayList2.add(new AchievementUiModel(id, str2, str3, photoUrl == null ? "" : photoUrl, newUserAchievementsModel2.getPrice(), newUserAchievementsModel2.getProgress(), newUserAchievementsModel2.isOpened()));
            }
            ArrayList arrayList3 = arrayList2;
            achievementsController._achievements.setValue(arrayList3);
            achievementsController._summary.setValue(summary);
            MutableStateFlow<AchievementUiModel> mutableStateFlow = achievementsController._achievement15;
            if (newUserAchievementsModel != null) {
                int id2 = newUserAchievementsModel.getId();
                String name2 = newUserAchievementsModel.getName();
                String str4 = name2 == null ? "" : name2;
                String description2 = newUserAchievementsModel.getDescription();
                String str5 = description2 == null ? "" : description2;
                String photoUrl2 = newUserAchievementsModel.getPhotoUrl();
                achievementUiModel = new AchievementUiModel(id2, str4, str5, photoUrl2 == null ? "" : photoUrl2, newUserAchievementsModel.getPrice(), newUserAchievementsModel.getProgress(), newUserAchievementsModel.isOpened());
            } else {
                achievementUiModel = null;
            }
            mutableStateFlow.setValue(achievementUiModel);
            achievementsController._achievementsError.setValue(null);
            Log.d("AchievementsController", "Achievements loaded: " + arrayList3.size() + ", Achievement 15: " + (newUserAchievementsModel != null) + ", Summary: " + summary);
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        achievementsController._achievementsError.setValue(str);
        Log.w("AchievementsController", "Failed to load achievements: " + str);
    }
}
