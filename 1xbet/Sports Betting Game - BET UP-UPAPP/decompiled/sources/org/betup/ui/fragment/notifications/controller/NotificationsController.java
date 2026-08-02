package org.betup.ui.fragment.notifications.controller;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
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
import org.betup.model.local.entity.Event;
import org.betup.model.local.interactor.LoadEventsInteractor;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.user.UserService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NotificationsController.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<J\u0006\u00106\u001a\u00020%J\u0006\u0010=\u001a\u00020:J\u0006\u0010>\u001a\u00020:J\u0010\u0010?\u001a\u00020:2\b\b\u0002\u0010@\u001a\u00020%J\u0006\u0010A\u001a\u00020:J\u000e\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020/J\u0006\u0010D\u001a\u00020:J\b\u0010E\u001a\u00020:H\u0002J\u0006\u0010F\u001a\u00020:J\u0006\u0010G\u001a\u00020:R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0!¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0!¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020%0!¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020%0!¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0!¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002030!¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u000e\u00106\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000203X\u0082D¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lorg/betup/ui/fragment/notifications/controller/NotificationsController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "loadEventsInteractor", "Lorg/betup/model/local/interactor/LoadEventsInteractor;", "getLoadEventsInteractor", "()Lorg/betup/model/local/interactor/LoadEventsInteractor;", "setLoadEventsInteractor", "(Lorg/betup/model/local/interactor/LoadEventsInteractor;)V", "readAllEventsInteractor", "Lorg/betup/model/local/interactor/ReadAllEventsInteractor;", "getReadAllEventsInteractor", "()Lorg/betup/model/local/interactor/ReadAllEventsInteractor;", "setReadAllEventsInteractor", "(Lorg/betup/model/local/interactor/ReadAllEventsInteractor;)V", "pushStorageProvider", "Lorg/betup/services/push/PushStorageProvider;", "getPushStorageProvider", "()Lorg/betup/services/push/PushStorageProvider;", "setPushStorageProvider", "(Lorg/betup/services/push/PushStorageProvider;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "_notifications", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/betup/model/local/entity/Event;", "notifications", "Lkotlinx/coroutines/flow/StateFlow;", "getNotifications", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoading", "", "isLoading", "_isLoadingMore", "isLoadingMore", "_hasMore", "hasMore", "getHasMore", "_isRefreshing", "isRefreshing", "_error", "", "error", "getError", "_unreadCount", "", "unreadCount", "getUnreadCount", "isControllerActive", "currentOffset", "pageSize", "initialize", "", "context", "Landroid/content/Context;", "setInactive", "unbind", "loadNotifications", "reset", "markAllAsRead", "markAsRead", "eventUid", "refreshUnreadCount", "updateUnreadCount", "refresh", "loadMore", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationsController {
    public static final int $stable = 8;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _hasMore;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isLoadingMore;
    private final MutableStateFlow<Boolean> _isRefreshing;
    private final MutableStateFlow<List<Event>> _notifications;
    private final MutableStateFlow<Integer> _unreadCount;
    private int currentOffset;
    private final StateFlow<String> error;
    private final StateFlow<Boolean> hasMore;
    private boolean isControllerActive;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isLoadingMore;
    private final StateFlow<Boolean> isRefreshing;

    @Inject
    public LoadEventsInteractor loadEventsInteractor;
    private final StateFlow<List<Event>> notifications;
    private final int pageSize;

    @Inject
    public PushStorageProvider pushStorageProvider;

    @Inject
    public ReadAllEventsInteractor readAllEventsInteractor;
    private final StateFlow<Integer> unreadCount;

    @Inject
    public UserService userService;

    @Inject
    public NotificationsController() {
        MutableStateFlow<List<Event>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._notifications = MutableStateFlow;
        this.notifications = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow2;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingMore = MutableStateFlow3;
        this.isLoadingMore = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(true);
        this._hasMore = MutableStateFlow4;
        this.hasMore = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(false);
        this._isRefreshing = MutableStateFlow5;
        this.isRefreshing = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow6;
        this.error = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Integer> MutableStateFlow7 = StateFlowKt.MutableStateFlow(0);
        this._unreadCount = MutableStateFlow7;
        this.unreadCount = FlowKt.asStateFlow(MutableStateFlow7);
        this.pageSize = 20;
    }

    public final LoadEventsInteractor getLoadEventsInteractor() {
        LoadEventsInteractor loadEventsInteractor = this.loadEventsInteractor;
        if (loadEventsInteractor != null) {
            return loadEventsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loadEventsInteractor");
        return null;
    }

    public final void setLoadEventsInteractor(LoadEventsInteractor loadEventsInteractor) {
        Intrinsics.checkNotNullParameter(loadEventsInteractor, "<set-?>");
        this.loadEventsInteractor = loadEventsInteractor;
    }

    public final ReadAllEventsInteractor getReadAllEventsInteractor() {
        ReadAllEventsInteractor readAllEventsInteractor = this.readAllEventsInteractor;
        if (readAllEventsInteractor != null) {
            return readAllEventsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("readAllEventsInteractor");
        return null;
    }

    public final void setReadAllEventsInteractor(ReadAllEventsInteractor readAllEventsInteractor) {
        Intrinsics.checkNotNullParameter(readAllEventsInteractor, "<set-?>");
        this.readAllEventsInteractor = readAllEventsInteractor;
    }

    public final PushStorageProvider getPushStorageProvider() {
        PushStorageProvider pushStorageProvider = this.pushStorageProvider;
        if (pushStorageProvider != null) {
            return pushStorageProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushStorageProvider");
        return null;
    }

    public final void setPushStorageProvider(PushStorageProvider pushStorageProvider) {
        Intrinsics.checkNotNullParameter(pushStorageProvider, "<set-?>");
        this.pushStorageProvider = pushStorageProvider;
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

    public final StateFlow<List<Event>> getNotifications() {
        return this.notifications;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> isLoadingMore() {
        return this.isLoadingMore;
    }

    public final StateFlow<Boolean> getHasMore() {
        return this.hasMore;
    }

    public final StateFlow<Boolean> isRefreshing() {
        return this.isRefreshing;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<Integer> getUnreadCount() {
        return this.unreadCount;
    }

    public final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        this.isControllerActive = true;
        Log.d("NotificationsController", "Controller initialized");
    }

    /* renamed from: isControllerActive, reason: from getter */
    public final boolean getIsControllerActive() {
        return this.isControllerActive;
    }

    public final void setInactive() {
        this.isControllerActive = false;
    }

    public final void unbind() {
        this.isControllerActive = false;
    }

    public static /* synthetic */ void loadNotifications$default(NotificationsController notificationsController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        notificationsController.loadNotifications(z);
    }

    public final void loadNotifications(final boolean reset) {
        BaseUserModel userModel;
        if (this.isControllerActive) {
            ShortUserProfileModel shortProfile = getUserService().getShortProfile();
            if (shortProfile == null || (userModel = shortProfile.getUserModel()) == null) {
                this._error.setValue("User not logged in");
                return;
            }
            if (reset) {
                this.currentOffset = 0;
                this._notifications.setValue(CollectionsKt.emptyList());
                this._hasMore.setValue(true);
                this._isLoading.setValue(true);
            } else if (!this._hasMore.getValue().booleanValue() || this._isLoadingMore.getValue().booleanValue()) {
                return;
            } else {
                this._isLoadingMore.setValue(true);
            }
            this._error.setValue(null);
            Bundle bundle = new Bundle();
            bundle.putInt("offset", this.currentOffset);
            bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.pageSize);
            getLoadEventsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<List<? extends Event>, Integer>() { // from class: org.betup.ui.fragment.notifications.controller.NotificationsController$loadNotifications$1

                /* compiled from: NotificationsController.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FetchStat.values().length];
                        try {
                            iArr[FetchStat.SUCCESS.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FetchStat.NO_CONNECTION.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[FetchStat.SERVER_DOWN.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[FetchStat.FAIL_AFTER_RETRIALS.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public void onFetched(FetchedResponseMessage<List<? extends Event>, Integer> responseMessage) {
                    MutableStateFlow mutableStateFlow;
                    MutableStateFlow mutableStateFlow2;
                    MutableStateFlow mutableStateFlow3;
                    MutableStateFlow mutableStateFlow4;
                    MutableStateFlow mutableStateFlow5;
                    int i;
                    int i2;
                    int i3;
                    MutableStateFlow mutableStateFlow6;
                    MutableStateFlow mutableStateFlow7;
                    MutableStateFlow mutableStateFlow8;
                    MutableStateFlow mutableStateFlow9;
                    Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                    mutableStateFlow = NotificationsController.this._isLoading;
                    mutableStateFlow.setValue(false);
                    mutableStateFlow2 = NotificationsController.this._isLoadingMore;
                    mutableStateFlow2.setValue(false);
                    mutableStateFlow3 = NotificationsController.this._isRefreshing;
                    mutableStateFlow3.setValue(false);
                    FetchStat stat = responseMessage.getStat();
                    int i4 = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2 || i4 == 3 || i4 == 4) {
                            mutableStateFlow8 = NotificationsController.this._error;
                            mutableStateFlow8.setValue("Failed to load notifications");
                            return;
                        } else {
                            mutableStateFlow9 = NotificationsController.this._error;
                            mutableStateFlow9.setValue("Unknown error");
                            return;
                        }
                    }
                    List<? extends Event> model = responseMessage.getModel();
                    if (model == null) {
                        model = CollectionsKt.emptyList();
                    }
                    if (reset) {
                        mutableStateFlow7 = NotificationsController.this._notifications;
                        mutableStateFlow7.setValue(model);
                    } else {
                        mutableStateFlow4 = NotificationsController.this._notifications;
                        mutableStateFlow5 = NotificationsController.this._notifications;
                        mutableStateFlow4.setValue(CollectionsKt.plus((Collection) mutableStateFlow5.getValue(), (Iterable) model));
                    }
                    int size = model.size();
                    i = NotificationsController.this.pageSize;
                    if (size < i) {
                        mutableStateFlow6 = NotificationsController.this._hasMore;
                        mutableStateFlow6.setValue(false);
                    } else {
                        NotificationsController notificationsController = NotificationsController.this;
                        i2 = notificationsController.currentOffset;
                        i3 = NotificationsController.this.pageSize;
                        notificationsController.currentOffset = i2 + i3;
                    }
                    NotificationsController.this.updateUnreadCount();
                }
            }, userModel.getId(), bundle);
        }
    }

    public final void markAllAsRead() {
        ShortUserProfileModel shortProfile;
        BaseUserModel userModel;
        if (!this.isControllerActive || (shortProfile = getUserService().getShortProfile()) == null || (userModel = shortProfile.getUserModel()) == null) {
            return;
        }
        getPushStorageProvider().readAll(userModel.getId());
        MutableStateFlow<List<Event>> mutableStateFlow = this._notifications;
        List<Event> value = mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        for (Event event : value) {
            Event event2 = new Event();
            event2.setEventId(event.getEventId());
            event2.setUserId(event.getUserId());
            event2.setTitle(event.getTitle());
            event2.setBody(event.getBody());
            event2.setType(event.getType());
            event2.setSentTimestamp(event.getSentTimestamp());
            event2.setGotTimestamp(event.getGotTimestamp());
            event2.setNew(false);
            event2.setUid(event.getUid());
            event2.setEventParams(event.getEventParams());
            arrayList.add(event2);
        }
        mutableStateFlow.setValue(arrayList);
        updateUnreadCount();
    }

    public final void markAsRead(String eventUid) {
        Intrinsics.checkNotNullParameter(eventUid, "eventUid");
        if (this.isControllerActive) {
            getPushStorageProvider().readEvent(eventUid);
            List<Event> value = this._notifications.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            for (Event event : value) {
                if (Intrinsics.areEqual(event.getUid(), eventUid)) {
                    Event event2 = new Event();
                    event2.setEventId(event.getEventId());
                    event2.setUserId(event.getUserId());
                    event2.setTitle(event.getTitle());
                    event2.setBody(event.getBody());
                    event2.setType(event.getType());
                    event2.setSentTimestamp(event.getSentTimestamp());
                    event2.setGotTimestamp(event.getGotTimestamp());
                    event2.setNew(false);
                    event2.setUid(event.getUid());
                    event2.setEventParams(event.getEventParams());
                    event = event2;
                }
                arrayList.add(event);
            }
            this._notifications.setValue(arrayList);
        }
    }

    public final void refreshUnreadCount() {
        BaseUserModel userModel;
        ShortUserProfileModel shortProfile = getUserService().getShortProfile();
        if (shortProfile == null || (userModel = shortProfile.getUserModel()) == null) {
            return;
        }
        getPushStorageProvider().refreshEventCount(userModel.getId());
        this._unreadCount.setValue(Integer.valueOf(getPushStorageProvider().getEventsCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUnreadCount() {
        BaseUserModel userModel;
        ShortUserProfileModel shortProfile = getUserService().getShortProfile();
        if (shortProfile == null || (userModel = shortProfile.getUserModel()) == null) {
            return;
        }
        getPushStorageProvider().refreshEventCount(userModel.getId());
        this._unreadCount.setValue(Integer.valueOf(getPushStorageProvider().getEventsCount()));
    }

    public final void refresh() {
        if (this.isControllerActive) {
            this._isRefreshing.setValue(true);
            ShortUserProfileModel shortProfile = getUserService().getShortProfile();
            BaseUserModel userModel = shortProfile != null ? shortProfile.getUserModel() : null;
            if (userModel != null) {
                getPushStorageProvider().readAll(userModel.getId());
                MutableStateFlow<List<Event>> mutableStateFlow = this._notifications;
                List<Event> value = mutableStateFlow.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
                for (Event event : value) {
                    Event event2 = new Event();
                    event2.setEventId(event.getEventId());
                    event2.setUserId(event.getUserId());
                    event2.setTitle(event.getTitle());
                    event2.setBody(event.getBody());
                    event2.setType(event.getType());
                    event2.setSentTimestamp(event.getSentTimestamp());
                    event2.setGotTimestamp(event.getGotTimestamp());
                    event2.setNew(false);
                    event2.setUid(event.getUid());
                    event2.setEventParams(event.getEventParams());
                    arrayList.add(event2);
                }
                mutableStateFlow.setValue(arrayList);
                updateUnreadCount();
            }
            loadNotifications(true);
        }
    }

    public final void loadMore() {
        if (this.isControllerActive && this._hasMore.getValue().booleanValue() && !this._isLoadingMore.getValue().booleanValue()) {
            loadNotifications(false);
        }
    }
}
