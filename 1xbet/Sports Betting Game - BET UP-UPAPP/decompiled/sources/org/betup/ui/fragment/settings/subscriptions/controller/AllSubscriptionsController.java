package org.betup.ui.fragment.settings.subscriptions.controller;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.vk.sdk.api.model.VKAttachments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteAllV7SubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7AllMatchSubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.GetAllV7SubscriptionsInteractor;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.subscription.MatchSubscriptionModel;
import org.betup.model.remote.entity.subscription.PageInfo;
import org.betup.model.remote.entity.subscription.SubscriptionResponseModel;
import org.betup.ui.MainActivity;
import org.betup.utils.SnackbarHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AllSubscriptionsController.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0004GJMP\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:J\u000e\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020*J\u0016\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u000201J\u000e\u0010@\u001a\u0002082\u0006\u0010>\u001a\u00020*J\u0006\u0010A\u001a\u000208J\u0006\u0010B\u001a\u000208J\u0006\u0010C\u001a\u000208J\u0006\u0010D\u001a\u000208J\b\u0010E\u001a\u000208H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0#¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020*0#¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020*0#¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0016\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010#¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020'0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020'0#¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0010\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0004\n\u0002\u0010HR\u0010\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0004\n\u0002\u0010KR\u0010\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0004\n\u0002\u0010NR\u0010\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0004\n\u0002\u0010Q¨\u0006R"}, d2 = {"Lorg/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getAllSubscriptionsInteractor", "Lorg/betup/model/remote/api/rest/subscription/GetAllV7SubscriptionsInteractor;", "getGetAllSubscriptionsInteractor", "()Lorg/betup/model/remote/api/rest/subscription/GetAllV7SubscriptionsInteractor;", "setGetAllSubscriptionsInteractor", "(Lorg/betup/model/remote/api/rest/subscription/GetAllV7SubscriptionsInteractor;)V", "deleteAllSubscriptionsInteractor", "Lorg/betup/model/remote/api/rest/subscription/DeleteAllV7SubscriptionsInteractor;", "getDeleteAllSubscriptionsInteractor", "()Lorg/betup/model/remote/api/rest/subscription/DeleteAllV7SubscriptionsInteractor;", "setDeleteAllSubscriptionsInteractor", "(Lorg/betup/model/remote/api/rest/subscription/DeleteAllV7SubscriptionsInteractor;)V", "deleteMatchSubscriptionInteractor", "Lorg/betup/model/remote/api/rest/subscription/DeleteV7MatchSubscriptionInteractor;", "getDeleteMatchSubscriptionInteractor", "()Lorg/betup/model/remote/api/rest/subscription/DeleteV7MatchSubscriptionInteractor;", "setDeleteMatchSubscriptionInteractor", "(Lorg/betup/model/remote/api/rest/subscription/DeleteV7MatchSubscriptionInteractor;)V", "deleteAllMatchSubscriptionsInteractor", "Lorg/betup/model/remote/api/rest/subscription/DeleteV7AllMatchSubscriptionsInteractor;", "getDeleteAllMatchSubscriptionsInteractor", "()Lorg/betup/model/remote/api/rest/subscription/DeleteV7AllMatchSubscriptionsInteractor;", "setDeleteAllMatchSubscriptionsInteractor", "(Lorg/betup/model/remote/api/rest/subscription/DeleteV7AllMatchSubscriptionsInteractor;)V", "activity", "Lorg/betup/ui/MainActivity;", "_subscriptions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/betup/model/remote/entity/subscription/MatchSubscriptionModel;", BillingClient.FeatureType.SUBSCRIPTIONS, "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptions", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoading", "", "isLoading", "_currentPage", "", "currentPage", "getCurrentPage", "_totalPages", "totalPages", "getTotalPages", "_error", "", "error", "getError", "_canRetry", "canRetry", "getCanRetry", "initialize", "", "context", "Landroid/content/Context;", "loadSubscriptions", VKAttachments.TYPE_WIKI_PAGE, "deleteSubscription", "matchId", "event", "deleteAllSubscriptionsForMatch", "deleteAllSubscriptions", "loadNextPage", "refresh", "retry", "clearError", "subscriptionsLoadListener", "org/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController$subscriptionsLoadListener$1", "Lorg/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController$subscriptionsLoadListener$1;", "deleteSubscriptionListener", "org/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController$deleteSubscriptionListener$1", "Lorg/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController$deleteSubscriptionListener$1;", "deleteAllSubscriptionsListener", "org/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController$deleteAllSubscriptionsListener$1", "Lorg/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController$deleteAllSubscriptionsListener$1;", "deleteAllMatchSubscriptionsListener", "org/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController$deleteAllMatchSubscriptionsListener$1", "Lorg/betup/ui/fragment/settings/subscriptions/controller/AllSubscriptionsController$deleteAllMatchSubscriptionsListener$1;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AllSubscriptionsController {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _canRetry;
    private final MutableStateFlow<Integer> _currentPage;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<List<MatchSubscriptionModel>> _subscriptions;
    private final MutableStateFlow<Integer> _totalPages;
    private MainActivity activity;
    private final StateFlow<Boolean> canRetry;
    private final StateFlow<Integer> currentPage;

    @Inject
    public DeleteV7AllMatchSubscriptionsInteractor deleteAllMatchSubscriptionsInteractor;
    private final AllSubscriptionsController$deleteAllMatchSubscriptionsListener$1 deleteAllMatchSubscriptionsListener;

    @Inject
    public DeleteAllV7SubscriptionsInteractor deleteAllSubscriptionsInteractor;
    private final AllSubscriptionsController$deleteAllSubscriptionsListener$1 deleteAllSubscriptionsListener;

    @Inject
    public DeleteV7MatchSubscriptionInteractor deleteMatchSubscriptionInteractor;
    private final AllSubscriptionsController$deleteSubscriptionListener$1 deleteSubscriptionListener;
    private final StateFlow<String> error;

    @Inject
    public GetAllV7SubscriptionsInteractor getAllSubscriptionsInteractor;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<List<MatchSubscriptionModel>> subscriptions;
    private final AllSubscriptionsController$subscriptionsLoadListener$1 subscriptionsLoadListener;
    private final StateFlow<Integer> totalPages;

    /* JADX WARN: Type inference failed for: r0v10, types: [org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController$deleteAllMatchSubscriptionsListener$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController$subscriptionsLoadListener$1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController$deleteSubscriptionListener$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController$deleteAllSubscriptionsListener$1] */
    @Inject
    public AllSubscriptionsController() {
        MutableStateFlow<List<MatchSubscriptionModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._subscriptions = MutableStateFlow;
        this.subscriptions = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow2;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this._currentPage = MutableStateFlow3;
        this.currentPage = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this._totalPages = MutableStateFlow4;
        this.totalPages = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow5;
        this.error = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(false);
        this._canRetry = MutableStateFlow6;
        this.canRetry = FlowKt.asStateFlow(MutableStateFlow6);
        this.subscriptionsLoadListener = new BaseCachedSharedInteractor.OnFetchedListener<SubscriptionResponseModel, Integer>() { // from class: org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController$subscriptionsLoadListener$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<SubscriptionResponseModel, Integer> responseMessage) {
                MutableStateFlow mutableStateFlow;
                MainActivity mainActivity;
                String str;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                MainActivity mainActivity2;
                MutableStateFlow mutableStateFlow4;
                MutableStateFlow mutableStateFlow5;
                MutableStateFlow mutableStateFlow6;
                MutableStateFlow mutableStateFlow7;
                MutableStateFlow mutableStateFlow8;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                mutableStateFlow = AllSubscriptionsController.this._isLoading;
                mutableStateFlow.setValue(false);
                if (responseMessage.getStat() != FetchStat.SUCCESS || responseMessage.getModel() == null) {
                    mainActivity = AllSubscriptionsController.this.activity;
                    if (mainActivity == null || (str = mainActivity.getString(R.string.error_occured)) == null) {
                        str = "Error loading subscriptions";
                    }
                    boolean z = responseMessage.getStat() == FetchStat.NO_CONNECTION || responseMessage.getStat() == FetchStat.SERVER_DOWN || responseMessage.getStat() == FetchStat.FAIL_AFTER_RETRIALS;
                    mutableStateFlow2 = AllSubscriptionsController.this._error;
                    mutableStateFlow2.setValue(str);
                    mutableStateFlow3 = AllSubscriptionsController.this._canRetry;
                    mutableStateFlow3.setValue(Boolean.valueOf(z));
                    Log.e("AllSubscriptionsController", "Failed to load subscriptions: " + responseMessage.getStat());
                    mainActivity2 = AllSubscriptionsController.this.activity;
                    if (mainActivity2 != null) {
                        SnackbarHelper.showShort(mainActivity2, R.string.error_occured);
                        return;
                    }
                    return;
                }
                SubscriptionResponseModel model = responseMessage.getModel();
                Integer id = responseMessage.getId();
                int intValue = id != null ? id.intValue() : 0;
                if (intValue == 0) {
                    mutableStateFlow8 = AllSubscriptionsController.this._subscriptions;
                    List<MatchSubscriptionModel> sportMatches = model.getSportMatches();
                    if (sportMatches == null) {
                        sportMatches = CollectionsKt.emptyList();
                    }
                    mutableStateFlow8.setValue(sportMatches);
                } else {
                    mutableStateFlow4 = AllSubscriptionsController.this._subscriptions;
                    mutableStateFlow5 = AllSubscriptionsController.this._subscriptions;
                    Collection collection = (Collection) mutableStateFlow5.getValue();
                    List<MatchSubscriptionModel> sportMatches2 = model.getSportMatches();
                    if (sportMatches2 == null) {
                        sportMatches2 = CollectionsKt.emptyList();
                    }
                    mutableStateFlow4.setValue(CollectionsKt.plus(collection, (Iterable) sportMatches2));
                }
                mutableStateFlow6 = AllSubscriptionsController.this._currentPage;
                mutableStateFlow6.setValue(Integer.valueOf(intValue));
                mutableStateFlow7 = AllSubscriptionsController.this._totalPages;
                PageInfo pageInfo = model.getPageInfo();
                mutableStateFlow7.setValue(Integer.valueOf(pageInfo != null ? pageInfo.getTotalPages() : 0));
                AllSubscriptionsController.this.clearError();
            }
        };
        this.deleteSubscriptionListener = new BaseCachedSharedInteractor.OnFetchedListener<Map<String, ? extends Boolean>, Long>() { // from class: org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController$deleteSubscriptionListener$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<Map<String, ? extends Boolean>, Long> responseMessage) {
                MainActivity mainActivity;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() == FetchStat.SUCCESS) {
                    AllSubscriptionsController.this.loadSubscriptions(0);
                    return;
                }
                Log.e("AllSubscriptionsController", "Failed to delete subscription: " + responseMessage.getStat());
                mainActivity = AllSubscriptionsController.this.activity;
                if (mainActivity != null) {
                    SnackbarHelper.showShort(mainActivity, R.string.error_occured);
                }
            }
        };
        this.deleteAllSubscriptionsListener = new BaseCachedSharedInteractor.OnFetchedListener<Map<String, ? extends String>, Void>() { // from class: org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController$deleteAllSubscriptionsListener$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<Map<String, ? extends String>, Void> responseMessage) {
                MainActivity mainActivity;
                MainActivity mainActivity2;
                MutableStateFlow mutableStateFlow;
                MainActivity mainActivity3;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() == FetchStat.SUCCESS && responseMessage.getModel() != null) {
                    String str = responseMessage.getModel().get("status");
                    if (Intrinsics.areEqual(str, "success")) {
                        mutableStateFlow = AllSubscriptionsController.this._subscriptions;
                        mutableStateFlow.setValue(CollectionsKt.emptyList());
                        AllSubscriptionsController.this.getGetAllSubscriptionsInteractor().invalidate((Integer) 0);
                        mainActivity3 = AllSubscriptionsController.this.activity;
                        if (mainActivity3 != null) {
                            SnackbarHelper.showShort(mainActivity3, R.string.changes_applied);
                            return;
                        }
                        return;
                    }
                    Log.e("AllSubscriptionsController", "Delete all subscriptions returned status: " + str);
                    mainActivity2 = AllSubscriptionsController.this.activity;
                    if (mainActivity2 != null) {
                        SnackbarHelper.showShort(mainActivity2, R.string.error_occured);
                        return;
                    }
                    return;
                }
                Log.e("AllSubscriptionsController", "Failed to delete all subscriptions: " + responseMessage.getStat());
                mainActivity = AllSubscriptionsController.this.activity;
                if (mainActivity != null) {
                    SnackbarHelper.showShort(mainActivity, R.string.error_occured);
                }
            }
        };
        this.deleteAllMatchSubscriptionsListener = new BaseCachedSharedInteractor.OnFetchedListener<Map<String, ? extends Boolean>, Long>() { // from class: org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController$deleteAllMatchSubscriptionsListener$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<Map<String, ? extends Boolean>, Long> responseMessage) {
                MainActivity mainActivity;
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() != FetchStat.SUCCESS) {
                    Log.e("AllSubscriptionsController", "Failed to delete all match subscriptions: " + responseMessage.getStat());
                    mainActivity = AllSubscriptionsController.this.activity;
                    if (mainActivity != null) {
                        SnackbarHelper.showShort(mainActivity, R.string.error_occured);
                        return;
                    }
                    return;
                }
                Long id = responseMessage.getId();
                Integer valueOf = id != null ? Integer.valueOf((int) id.longValue()) : null;
                if (valueOf != null) {
                    mutableStateFlow = AllSubscriptionsController.this._subscriptions;
                    mutableStateFlow2 = AllSubscriptionsController.this._subscriptions;
                    Iterable iterable = (Iterable) mutableStateFlow2.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : iterable) {
                        MatchDetailsDataModel match = ((MatchSubscriptionModel) obj).getMatch();
                        if (!Intrinsics.areEqual(match != null ? match.getId() : null, valueOf)) {
                            arrayList.add(obj);
                        }
                    }
                    mutableStateFlow.setValue(arrayList);
                }
                AllSubscriptionsController.this.getGetAllSubscriptionsInteractor().invalidate();
                AllSubscriptionsController.this.loadSubscriptions(0);
            }
        };
    }

    public final GetAllV7SubscriptionsInteractor getGetAllSubscriptionsInteractor() {
        GetAllV7SubscriptionsInteractor getAllV7SubscriptionsInteractor = this.getAllSubscriptionsInteractor;
        if (getAllV7SubscriptionsInteractor != null) {
            return getAllV7SubscriptionsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAllSubscriptionsInteractor");
        return null;
    }

    public final void setGetAllSubscriptionsInteractor(GetAllV7SubscriptionsInteractor getAllV7SubscriptionsInteractor) {
        Intrinsics.checkNotNullParameter(getAllV7SubscriptionsInteractor, "<set-?>");
        this.getAllSubscriptionsInteractor = getAllV7SubscriptionsInteractor;
    }

    public final DeleteAllV7SubscriptionsInteractor getDeleteAllSubscriptionsInteractor() {
        DeleteAllV7SubscriptionsInteractor deleteAllV7SubscriptionsInteractor = this.deleteAllSubscriptionsInteractor;
        if (deleteAllV7SubscriptionsInteractor != null) {
            return deleteAllV7SubscriptionsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteAllSubscriptionsInteractor");
        return null;
    }

    public final void setDeleteAllSubscriptionsInteractor(DeleteAllV7SubscriptionsInteractor deleteAllV7SubscriptionsInteractor) {
        Intrinsics.checkNotNullParameter(deleteAllV7SubscriptionsInteractor, "<set-?>");
        this.deleteAllSubscriptionsInteractor = deleteAllV7SubscriptionsInteractor;
    }

    public final DeleteV7MatchSubscriptionInteractor getDeleteMatchSubscriptionInteractor() {
        DeleteV7MatchSubscriptionInteractor deleteV7MatchSubscriptionInteractor = this.deleteMatchSubscriptionInteractor;
        if (deleteV7MatchSubscriptionInteractor != null) {
            return deleteV7MatchSubscriptionInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteMatchSubscriptionInteractor");
        return null;
    }

    public final void setDeleteMatchSubscriptionInteractor(DeleteV7MatchSubscriptionInteractor deleteV7MatchSubscriptionInteractor) {
        Intrinsics.checkNotNullParameter(deleteV7MatchSubscriptionInteractor, "<set-?>");
        this.deleteMatchSubscriptionInteractor = deleteV7MatchSubscriptionInteractor;
    }

    public final DeleteV7AllMatchSubscriptionsInteractor getDeleteAllMatchSubscriptionsInteractor() {
        DeleteV7AllMatchSubscriptionsInteractor deleteV7AllMatchSubscriptionsInteractor = this.deleteAllMatchSubscriptionsInteractor;
        if (deleteV7AllMatchSubscriptionsInteractor != null) {
            return deleteV7AllMatchSubscriptionsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteAllMatchSubscriptionsInteractor");
        return null;
    }

    public final void setDeleteAllMatchSubscriptionsInteractor(DeleteV7AllMatchSubscriptionsInteractor deleteV7AllMatchSubscriptionsInteractor) {
        Intrinsics.checkNotNullParameter(deleteV7AllMatchSubscriptionsInteractor, "<set-?>");
        this.deleteAllMatchSubscriptionsInteractor = deleteV7AllMatchSubscriptionsInteractor;
    }

    public final StateFlow<List<MatchSubscriptionModel>> getSubscriptions() {
        return this.subscriptions;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Integer> getCurrentPage() {
        return this.currentPage;
    }

    public final StateFlow<Integer> getTotalPages() {
        return this.totalPages;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<Boolean> getCanRetry() {
        return this.canRetry;
    }

    public final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        if (context instanceof MainActivity) {
            this.activity = (MainActivity) context;
        }
        getGetAllSubscriptionsInteractor().invalidate();
        loadSubscriptions(0);
    }

    public final void loadSubscriptions(int page) {
        this._isLoading.setValue(true);
        getGetAllSubscriptionsInteractor().load(this.subscriptionsLoadListener, Integer.valueOf(page));
    }

    public final void deleteSubscription(int matchId, String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Bundle bundle = new Bundle();
        bundle.putString("event", event);
        getDeleteMatchSubscriptionInteractor().load(this.deleteSubscriptionListener, Long.valueOf(matchId), bundle);
    }

    public final void deleteAllSubscriptionsForMatch(int matchId) {
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", matchId);
        getDeleteAllMatchSubscriptionsInteractor().load(this.deleteAllMatchSubscriptionsListener, Long.valueOf(matchId), bundle);
    }

    public final void deleteAllSubscriptions() {
        getDeleteAllSubscriptionsInteractor().load(this.deleteAllSubscriptionsListener, null);
    }

    public final void loadNextPage() {
        int intValue = this._currentPage.getValue().intValue() + 1;
        if (intValue < this._totalPages.getValue().intValue()) {
            loadSubscriptions(intValue);
        }
    }

    public final void refresh() {
        getGetAllSubscriptionsInteractor().invalidate();
        clearError();
        loadSubscriptions(0);
    }

    public final void retry() {
        if (this._canRetry.getValue().booleanValue()) {
            clearError();
            loadSubscriptions(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearError() {
        this._error.setValue(null);
        this._canRetry.setValue(false);
    }
}
