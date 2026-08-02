package org.betup.ui.fragment.notifications;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.model.local.entity.Event;
import org.betup.services.user.UserService;
import org.betup.ui.TabMenuItem;
import org.betup.ui.dialogs.push.PushNotificationData;
import org.betup.ui.dialogs.push.PushNotificationDialogFragment;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.notifications.controller.NotificationsController;
import org.betup.utils.DialogManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: NotificationsFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lorg/betup/ui/fragment/notifications/NotificationsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "notificationsController", "Lorg/betup/ui/fragment/notifications/controller/NotificationsController;", "getNotificationsController", "()Lorg/betup/ui/fragment/notifications/controller/NotificationsController;", "setNotificationsController", "(Lorg/betup/ui/fragment/notifications/controller/NotificationsController;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "openNotificationDialog", "event", "Lorg/betup/model/local/entity/Event;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, X3.i.u0, X3.i.t0, "onStop", "onDestroy", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationsFragment extends BaseFragment {

    @Inject
    public NotificationsController notificationsController;

    @Inject
    public UserService userService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final NotificationsController getNotificationsController() {
        NotificationsController notificationsController = this.notificationsController;
        if (notificationsController != null) {
            return notificationsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationsController");
        return null;
    }

    public final void setNotificationsController(NotificationsController notificationsController) {
        Intrinsics.checkNotNullParameter(notificationsController, "<set-?>");
        this.notificationsController = notificationsController;
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

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1925266448, true, new NotificationsFragment$onCreateView$1$1(this)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openNotificationDialog(Event event) {
        Log.d("NotificationsFragment", "Opening notification dialog for event type: " + event.getType() + ", title: " + event.getTitle());
        Log.d("NotificationsFragment", "Event params: " + event.getParamsAsMap());
        PushNotificationData fromEvent = PushNotificationData.INSTANCE.fromEvent(event);
        if (fromEvent != null) {
            Log.d("NotificationsFragment", "Created notification data: " + fromEvent);
            PushNotificationDialogFragment newInstance = PushNotificationDialogFragment.INSTANCE.newInstance(fromEvent);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            DialogManager.showDialogReplacingPrevious(newInstance, parentFragmentManager, PushNotificationDialogFragment.TAG);
            return;
        }
        Log.w("NotificationsFragment", "Could not create PushNotificationData from event: " + event.getType() + ", params: " + event.getParamsAsMap());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        NotificationsController notificationsController = getNotificationsController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        notificationsController.initialize(requireContext);
        NotificationsController.loadNotifications$default(getNotificationsController(), false, 1, null);
        getNotificationsController().refreshUnreadCount();
        updateMenuBars("Notifications", TabMenuItem.NONE);
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!getNotificationsController().getIsControllerActive()) {
            NotificationsController notificationsController = getNotificationsController();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            notificationsController.initialize(requireContext);
        }
        getNotificationsController().refreshUnreadCount();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getNotificationsController().setInactive();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getNotificationsController().setInactive();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getNotificationsController().unbind();
    }

    /* compiled from: NotificationsFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/notifications/NotificationsFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/notifications/NotificationsFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NotificationsFragment newInstance() {
            return new NotificationsFragment();
        }
    }
}
