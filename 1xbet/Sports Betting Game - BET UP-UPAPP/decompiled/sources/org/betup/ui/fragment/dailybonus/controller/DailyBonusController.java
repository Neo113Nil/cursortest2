package org.betup.ui.fragment.dailybonus.controller;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.bonus.V7DailyBonusInteractor;
import org.betup.model.remote.entity.bonus.V7DailyBonusResponse;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.dailybonus.mapper.DailyBonusMapperKt;
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.dailybonus.model.DailyBonusDay;
import org.betup.ui.fragment.dailybonus.model.DailyBonusState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyBonusController.kt */
@Singleton
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\b\u0010%\u001a\u00020!H\u0002J\u0006\u0010&\u001a\u00020!J\u0006\u0010'\u001a\u00020!J\u0012\u0010+\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J\u0006\u0010,\u001a\u00020\u0014J\u0006\u0010-\u001a\u00020\u0014J\u0006\u0010.\u001a\u00020!R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u000e\u0010\u001e\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020!0)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "v7DailyBonusInteractor", "Lorg/betup/model/remote/api/rest/bonus/V7DailyBonusInteractor;", "getV7DailyBonusInteractor", "()Lorg/betup/model/remote/api/rest/bonus/V7DailyBonusInteractor;", "setV7DailyBonusInteractor", "(Lorg/betup/model/remote/api/rest/bonus/V7DailyBonusInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "context", "Landroid/content/Context;", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_data", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;", "data", "getData", "_isAvailable", "isAvailable", "isInitialized", "autoDailyPromptConsumedThisProcess", "initialize", "", "reset", "updateAvailability", "notifyRewardClaimed", "markItemAsTakenLocally", "invalidate", "load", "onFetched", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/bonus/V7DailyBonusResponse;", "shouldShowDailyBonusAsActive", "hasClaimableDailyReward", "shouldAutoPresentDailyBonus", "markAutoDailyPromptConsumedForProcess", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DailyBonusController {
    public static final int $stable = 8;
    private final MutableStateFlow<DailyBonusData> _data;
    private final MutableStateFlow<Boolean> _isAvailable;
    private final MutableStateFlow<Boolean> _isLoading;
    private boolean autoDailyPromptConsumedThisProcess;
    private Context context;
    private final StateFlow<DailyBonusData> data;
    private final StateFlow<Boolean> isAvailable;
    private boolean isInitialized;
    private final StateFlow<Boolean> isLoading;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7DailyBonusResponse, Unit> onFetched;

    @Inject
    public UserService userService;

    @Inject
    public V7DailyBonusInteractor v7DailyBonusInteractor;

    @Inject
    public DailyBonusController() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<DailyBonusData> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._data = MutableStateFlow2;
        this.data = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isAvailable = MutableStateFlow3;
        this.isAvailable = FlowKt.asStateFlow(MutableStateFlow3);
        this.onFetched = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.dailybonus.controller.DailyBonusController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                DailyBonusController.onFetched$lambda$3(DailyBonusController.this, fetchedResponseMessage);
            }
        };
    }

    public final V7DailyBonusInteractor getV7DailyBonusInteractor() {
        V7DailyBonusInteractor v7DailyBonusInteractor = this.v7DailyBonusInteractor;
        if (v7DailyBonusInteractor != null) {
            return v7DailyBonusInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7DailyBonusInteractor");
        return null;
    }

    public final void setV7DailyBonusInteractor(V7DailyBonusInteractor v7DailyBonusInteractor) {
        Intrinsics.checkNotNullParameter(v7DailyBonusInteractor, "<set-?>");
        this.v7DailyBonusInteractor = v7DailyBonusInteractor;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<DailyBonusData> getData() {
        return this.data;
    }

    public final StateFlow<Boolean> isAvailable() {
        return this.isAvailable;
    }

    public final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        load();
    }

    public final void reset() {
        Log.d("DailyBonusController", "Resetting controller for new user");
        this.isInitialized = false;
        this._data.setValue(null);
        this._isAvailable.setValue(false);
        this._isLoading.setValue(false);
        this.autoDailyPromptConsumedThisProcess = false;
        invalidate();
    }

    public final void updateAvailability() {
        boolean shouldShowDailyBonusAsActive = shouldShowDailyBonusAsActive(this._data.getValue());
        if (this._isAvailable.getValue().booleanValue() != shouldShowDailyBonusAsActive) {
            this._isAvailable.setValue(Boolean.valueOf(shouldShowDailyBonusAsActive));
            Log.d("DailyBonusController", "Updated availability: " + shouldShowDailyBonusAsActive + " (isRegistered: " + getUserService().isRegistered() + ", isAnonymous: " + getUserService().isAnonymous() + ")");
        }
    }

    public final void notifyRewardClaimed() {
        Log.d("DailyBonusController", "notifyRewardClaimed - Marking item as TAKEN, then invalidating and reloading");
        markAutoDailyPromptConsumedForProcess();
        markItemAsTakenLocally();
        invalidate();
        load();
        Log.d("DailyBonusController", "notifyRewardClaimed - Cache invalidated and data reload requested");
    }

    private final void markItemAsTakenLocally() {
        DailyBonusData value = this._data.getValue();
        if (value != null) {
            List<DailyBonusDay> bonuses = value.getBonuses();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bonuses, 10));
            for (DailyBonusDay dailyBonusDay : bonuses) {
                if (dailyBonusDay.getState() == DailyBonusState.AVAILABLE) {
                    Log.d("DailyBonusController", "Marking bonus day " + dailyBonusDay.getDayNumber() + " as TAKEN locally");
                    dailyBonusDay = DailyBonusDay.copy$default(dailyBonusDay, 0, 0, 0, 0, null, DailyBonusState.TAKEN, 31, null);
                }
                arrayList.add(dailyBonusDay);
            }
            this._data.setValue(DailyBonusData.copy$default(value, arrayList, null, null, 0, null, 30, null));
            this._isAvailable.setValue(Boolean.valueOf(shouldShowDailyBonusAsActive(this._data.getValue())));
        }
    }

    public final void invalidate() {
        if (this.v7DailyBonusInteractor == null) {
            Log.d("DailyBonusController", "Cannot invalidate - v7DailyBonusInteractor not initialized yet");
        } else {
            Log.d("DailyBonusController", "Invalidating daily bonus cache");
            getV7DailyBonusInteractor().invalidate(Unit.INSTANCE);
        }
    }

    public final void load() {
        if (this.v7DailyBonusInteractor == null) {
            Log.d("DailyBonusController", "Cannot load - v7DailyBonusInteractor not initialized yet");
        } else {
            this._isLoading.setValue(true);
            getV7DailyBonusInteractor().load(this.onFetched);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$3(DailyBonusController dailyBonusController, FetchedResponseMessage responseMessage) {
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        try {
            V7DailyBonusResponse v7DailyBonusResponse = (V7DailyBonusResponse) responseMessage.getModel();
            if (v7DailyBonusResponse != null) {
                dailyBonusController._data.setValue(DailyBonusMapperKt.toDailyBonusData(v7DailyBonusResponse));
                dailyBonusController._isAvailable.setValue(Boolean.valueOf(dailyBonusController.shouldShowDailyBonusAsActive(dailyBonusController._data.getValue())));
                Log.d("DailyBonusController", "onFetched: " + v7DailyBonusResponse + ", isRegistered: " + dailyBonusController.getUserService().isRegistered() + ", isAnonymous: " + dailyBonusController.getUserService().isAnonymous() + ", isAvailable: " + dailyBonusController._isAvailable.getValue());
            } else {
                dailyBonusController._isAvailable.setValue(Boolean.valueOf(dailyBonusController.shouldShowDailyBonusAsActive(null)));
            }
        } finally {
            dailyBonusController._isLoading.setValue(false);
        }
    }

    private final boolean shouldShowDailyBonusAsActive(DailyBonusData data) {
        List<DailyBonusDay> bonuses;
        if (!getUserService().isRegistered() || data == null || (bonuses = data.getBonuses()) == null) {
            return false;
        }
        List<DailyBonusDay> list = bonuses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((DailyBonusDay) it.next()).getState() == DailyBonusState.AVAILABLE) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasClaimableDailyReward() {
        DailyBonusData value;
        List<DailyBonusDay> bonuses;
        if (!getUserService().isRegistered() || (value = this._data.getValue()) == null || (bonuses = value.getBonuses()) == null) {
            return false;
        }
        List<DailyBonusDay> list = bonuses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((DailyBonusDay) it.next()).getState() == DailyBonusState.AVAILABLE) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldAutoPresentDailyBonus() {
        if (this.autoDailyPromptConsumedThisProcess) {
            return false;
        }
        return hasClaimableDailyReward();
    }

    public final void markAutoDailyPromptConsumedForProcess() {
        this.autoDailyPromptConsumedThisProcess = true;
    }
}
