package org.betup.ui.fragment.user;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.ReturnToLastTabMessage;
import org.betup.services.user.UserService;
import org.betup.ui.BackPressedController;
import org.betup.ui.MainActivity;
import org.betup.ui.base.BaseActivity;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.bets.BetsController;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: UserDetailsFragmentK.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u001fH\u0016J\b\u0010'\u001a\u00020\u001fH\u0016J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020)2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u00102\u001a\u00020\u001fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064²\u0006\f\u00105\u001a\u0004\u0018\u000106X\u008a\u0084\u0002²\u0006\f\u00107\u001a\u0004\u0018\u000108X\u008a\u0084\u0002²\u0006\f\u00109\u001a\u0004\u0018\u00010:X\u008a\u0084\u0002²\u0006\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u0004\u0018\u00010?X\u008a\u0084\u0002²\u0006\n\u0010@\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010A\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010B\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\u0010\u0010C\u001a\b\u0012\u0004\u0012\u00020D0<X\u008a\u0084\u0002²\u0006\n\u0010E\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\u0010\u0010F\u001a\b\u0012\u0004\u0012\u00020G0<X\u008a\u0084\u0002²\u0006\n\u0010H\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\u0010\u0010I\u001a\b\u0012\u0004\u0012\u00020J0<X\u008a\u0084\u0002²\u0006\n\u0010K\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010M\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u0004\u0018\u00010JX\u008a\u0084\u0002²\u0006\u0010\u0010O\u001a\b\u0012\u0004\u0012\u00020P0<X\u008a\u0084\u0002²\u0006\n\u0010Q\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010R\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010S\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010T\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsFragmentK;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/user/UserDetailsController;", "getController", "()Lorg/betup/ui/fragment/user/UserDetailsController;", "setController", "(Lorg/betup/ui/fragment/user/UserDetailsController;)V", "betListController", "Lorg/betup/ui/fragment/bets/BetsController;", "getBetListController", "()Lorg/betup/ui/fragment/bets/BetsController;", "setBetListController", "(Lorg/betup/ui/fragment/bets/BetsController;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "userId", "", "avatarReturn", "", "openToMessages", "openToRankings", "backPressedController", "Lorg/betup/ui/BackPressedController;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", X3.i.u0, X3.i.t0, "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "backPressedListener", "Lorg/betup/ui/BackPressedController$BackPressedListener;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onDestroyView", VastTagName.COMPANION, "app_release", "userInfo", "Lorg/betup/model/remote/entity/user/NewUserInfoModel;", "userStats", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "userRanks", "Lorg/betup/model/remote/entity/user/NewUserRanksModel;", "userAchievements", "", "Lorg/betup/model/remote/entity/user/NewUserAchievementsModel;", "newUserFavourites", "Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;", "isLoading", "userInfoLoadFailed", "selectedTab", "baseTabs", "Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "selectedBaseTabIndex", "rankingTabs", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "selectedRankingTabIndex", "chats", "Lorg/betup/model/remote/entity/messaging/ChatModel;", "isChatsLoading", "isChatsLoadingMore", "hasMoreChats", "selectedChat", "chatMessages", "Lorg/betup/model/remote/entity/messaging/ExtendedMessageModel;", "isChatMessagesLoading", "isChatMessagesLoadingMore", "hasMoreChatMessages", "isSendingMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserDetailsFragmentK extends BaseFragment {
    private boolean avatarReturn;
    private BackPressedController backPressedController;
    private final BackPressedController.BackPressedListener backPressedListener = new BackPressedController.BackPressedListener() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$$ExternalSyntheticLambda1
        @Override // org.betup.ui.BackPressedController.BackPressedListener
        public final boolean onBackPressed() {
            boolean backPressedListener$lambda$2;
            backPressedListener$lambda$2 = UserDetailsFragmentK.backPressedListener$lambda$2(UserDetailsFragmentK.this);
            return backPressedListener$lambda$2;
        }
    };

    @Inject
    public BetsController betListController;

    @Inject
    public UserDetailsController controller;
    private boolean openToMessages;
    private boolean openToRankings;
    private int userId;

    @Inject
    public UserService userService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final UserDetailsController getController() {
        UserDetailsController userDetailsController = this.controller;
        if (userDetailsController != null) {
            return userDetailsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(UserDetailsController userDetailsController) {
        Intrinsics.checkNotNullParameter(userDetailsController, "<set-?>");
        this.controller = userDetailsController;
    }

    public final BetsController getBetListController() {
        BetsController betsController = this.betListController;
        if (betsController != null) {
            return betsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betListController");
        return null;
    }

    public final void setBetListController(BetsController betsController) {
        Intrinsics.checkNotNullParameter(betsController, "<set-?>");
        this.betListController = betsController;
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

    /* compiled from: UserDetailsFragmentK.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsFragmentK$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/user/UserDetailsFragmentK;", "id", "", "avatarReturn", "", "openToMessages", "openToRankings", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserDetailsFragmentK newInstance(int i, boolean z) {
            return newInstance$default(this, i, z, false, false, 12, null);
        }

        public final UserDetailsFragmentK newInstance(int i, boolean z, boolean z2) {
            return newInstance$default(this, i, z, z2, false, 8, null);
        }

        private Companion() {
        }

        public static /* synthetic */ UserDetailsFragmentK newInstance$default(Companion companion, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            if ((i2 & 8) != 0) {
                z3 = false;
            }
            return companion.newInstance(i, z, z2, z3);
        }

        public final UserDetailsFragmentK newInstance(int id, boolean avatarReturn, boolean openToMessages, boolean openToRankings) {
            UserDetailsFragmentK userDetailsFragmentK = new UserDetailsFragmentK();
            Bundle bundle = new Bundle();
            bundle.putInt("id", id);
            bundle.putBoolean("return", avatarReturn);
            bundle.putBoolean("openToMessages", openToMessages);
            bundle.putBoolean("openToRankings", openToRankings);
            userDetailsFragmentK.setArguments(bundle);
            return userDetailsFragmentK;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.backPressedController = context instanceof BackPressedController ? (BackPressedController) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) application).getComponent().inject(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.userId = arguments.getInt("id");
            this.avatarReturn = arguments.getBoolean("return");
            this.openToMessages = arguments.getBoolean("openToMessages", false);
            this.openToRankings = arguments.getBoolean("openToRankings", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.backPressedController = null;
        super.onDetach();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        View findViewById;
        super.onResume();
        FragmentActivity activity = getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity != null && (findViewById = mainActivity.findViewById(R.id.app_top_header_cv)) != null) {
            findViewById.setVisibility(8);
        }
        getController().refreshUserInfo();
        getController().updateFavorites();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.setOnBackPressedListener(this.backPressedListener);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        View findViewById;
        super.onPause();
        FragmentActivity activity = getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity != null && (findViewById = mainActivity.findViewById(R.id.app_top_header_cv)) != null) {
            findViewById.setVisibility(0);
        }
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(677574555, true, new UserDetailsFragmentK$onCreateView$1$1(this)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean backPressedListener$lambda$2(UserDetailsFragmentK userDetailsFragmentK) {
        if (userDetailsFragmentK.getController().getSelectedChat().getValue() != null) {
            userDetailsFragmentK.getController().closeChat();
            return false;
        }
        EventBus.getDefault().post(new ReturnToLastTabMessage());
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        getController().initialize(this.userId, (BaseActivity) requireActivity, this.openToMessages, this.openToRankings);
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null) {
            BetsController betListController = getBetListController();
            Function0 function0 = new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            BetsController.bind$default(betListController, mainActivity, function0, requireContext, null, 8, null);
            getBetListController().reloadBetsHistory();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getController().cleanup();
    }
}
