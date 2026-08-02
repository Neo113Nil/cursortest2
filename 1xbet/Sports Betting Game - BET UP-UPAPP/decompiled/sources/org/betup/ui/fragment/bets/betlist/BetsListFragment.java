package org.betup.ui.fragment.bets.betlist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.api.rest.user.bets.models.BetsResponseModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.bets.betlist.details.BetDetailDialog;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetsListFragment.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-J.\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0014\u00103\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020+04H\u0002J\b\u00106\u001a\u00020+H\u0016J\u0012\u00107\u001a\u00020+2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00068"}, d2 = {"Lorg/betup/ui/fragment/bets/betlist/BetsListFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setFirebaseRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "betController", "Lorg/betup/ui/fragment/bets/BetsController;", "getBetController", "()Lorg/betup/ui/fragment/bets/BetsController;", "setBetController", "(Lorg/betup/ui/fragment/bets/BetsController;)V", "betsListInteractor", "Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "getBetsListInteractor", "()Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "setBetsListInteractor", "(Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;)V", "appLanguageObserver", "Lorg/betup/services/language/AppLanguageObserver;", "getAppLanguageObserver", "()Lorg/betup/services/language/AppLanguageObserver;", "setAppLanguageObserver", "(Lorg/betup/services/language/AppLanguageObserver;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showBetDetailDialog", "", "selectedBetId", "", "showBetDetailDialogForDeepLink", "betId", "sharedFromUserId", "loadForeignUserBetForDeepLink", "ownerUserId", "onDone", "Lkotlin/Function1;", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "onStart", "onCreate", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetsListFragment extends BaseFragment {
    public static final int $stable = 8;

    @Inject
    public AppLanguageObserver appLanguageObserver;

    @Inject
    public BetsController betController;

    @Inject
    public BetsListInteractor betsListInteractor;

    @Inject
    public FirebaseRemoteConfig firebaseRemoteConfig;

    @Inject
    public UserService userService;

    public final FirebaseRemoteConfig getFirebaseRemoteConfig() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.firebaseRemoteConfig;
        if (firebaseRemoteConfig != null) {
            return firebaseRemoteConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseRemoteConfig");
        return null;
    }

    public final void setFirebaseRemoteConfig(FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<set-?>");
        this.firebaseRemoteConfig = firebaseRemoteConfig;
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

    public final BetsController getBetController() {
        BetsController betsController = this.betController;
        if (betsController != null) {
            return betsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betController");
        return null;
    }

    public final void setBetController(BetsController betsController) {
        Intrinsics.checkNotNullParameter(betsController, "<set-?>");
        this.betController = betsController;
    }

    public final BetsListInteractor getBetsListInteractor() {
        BetsListInteractor betsListInteractor = this.betsListInteractor;
        if (betsListInteractor != null) {
            return betsListInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betsListInteractor");
        return null;
    }

    public final void setBetsListInteractor(BetsListInteractor betsListInteractor) {
        Intrinsics.checkNotNullParameter(betsListInteractor, "<set-?>");
        this.betsListInteractor = betsListInteractor;
    }

    public final AppLanguageObserver getAppLanguageObserver() {
        AppLanguageObserver appLanguageObserver = this.appLanguageObserver;
        if (appLanguageObserver != null) {
            return appLanguageObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appLanguageObserver");
        return null;
    }

    public final void setAppLanguageObserver(AppLanguageObserver appLanguageObserver) {
        Intrinsics.checkNotNullParameter(appLanguageObserver, "<set-?>");
        this.appLanguageObserver = appLanguageObserver;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1779192227, true, new BetsListFragment$onCreateView$1$1(this)));
        getBetController().reloadBetsHistory();
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBetDetailDialog(int selectedBetId) {
        BetDetailDialog betDetailDialog = new BetDetailDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("betId", selectedBetId);
        betDetailDialog.setArguments(bundle);
        betDetailDialog.show(requireActivity().getSupportFragmentManager(), "BetDetailDialog");
    }

    public static /* synthetic */ void showBetDetailDialogForDeepLink$default(BetsListFragment betsListFragment, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        betsListFragment.showBetDetailDialogForDeepLink(i, i2);
    }

    public final void showBetDetailDialogForDeepLink(final int betId, int sharedFromUserId) {
        if (betId <= 0) {
            return;
        }
        Integer id = getUserService().getShortProfile().getUserModel().getId();
        if (sharedFromUserId <= 0 || (id != null && sharedFromUserId == id.intValue())) {
            showBetDetailDialog(betId);
        } else {
            loadForeignUserBetForDeepLink(sharedFromUserId, betId, new Function1() { // from class: org.betup.ui.fragment.bets.betlist.BetsListFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit showBetDetailDialogForDeepLink$lambda$6;
                    showBetDetailDialogForDeepLink$lambda$6 = BetsListFragment.showBetDetailDialogForDeepLink$lambda$6(BetsListFragment.this, betId, (BetsListModel) obj);
                    return showBetDetailDialogForDeepLink$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showBetDetailDialogForDeepLink$lambda$6(BetsListFragment betsListFragment, int i, final BetsListModel betsListModel) {
        if (!betsListFragment.isAdded()) {
            return Unit.INSTANCE;
        }
        if (betsListModel != null) {
            BetDetailDialog betDetailDialog = new BetDetailDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("betId", i);
            betDetailDialog.setArguments(bundle);
            betDetailDialog.setCustomBetListProvider(new Function0() { // from class: org.betup.ui.fragment.bets.betlist.BetsListFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List listOf;
                    listOf = CollectionsKt.listOf(BetsListModel.this);
                    return listOf;
                }
            });
            betDetailDialog.setIsViewingOtherUserBets(true);
            betDetailDialog.show(betsListFragment.requireActivity().getSupportFragmentManager(), "BetDetailDialog");
        } else {
            betsListFragment.showBetDetailDialog(i);
        }
        return Unit.INSTANCE;
    }

    private final void loadForeignUserBetForDeepLink(int ownerUserId, int betId, Function1<? super BetsListModel, Unit> onDone) {
        Ref.IntRef intRef = new Ref.IntRef();
        getBetsListInteractor().invalidate();
        loadForeignUserBetForDeepLink$loadNextPage(this, onDone, intRef, 15, ownerUserId, betId);
    }

    private static final void loadForeignUserBetForDeepLink$loadNextPage(final BetsListFragment betsListFragment, final Function1<? super BetsListModel, Unit> function1, final Ref.IntRef intRef, final int i, final int i2, final int i3) {
        if (!betsListFragment.isAdded()) {
            function1.invoke(null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("offset", intRef.element);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, i);
        bundle.putInt("userId", i2);
        betsListFragment.getBetsListInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.bets.betlist.BetsListFragment$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetsListFragment.loadForeignUserBetForDeepLink$loadNextPage$lambda$9(BetsListFragment.this, function1, i, intRef, i3, i2, fetchedResponseMessage);
            }
        }, BetState.ALL, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadForeignUserBetForDeepLink$loadNextPage$lambda$9(BetsListFragment betsListFragment, Function1 function1, int i, Ref.IntRef intRef, int i2, int i3, FetchedResponseMessage fetchedResponseMessage) {
        List<BetsListModel> emptyList;
        Object obj;
        if (betsListFragment.isAdded()) {
            if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS) {
                function1.invoke(null);
                return;
            }
            BetsResponseModel betsResponseModel = (BetsResponseModel) fetchedResponseMessage.getModel();
            if (betsResponseModel == null || (emptyList = betsResponseModel.getBetlists()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            Iterator<T> it = emptyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer id = ((BetsListModel) obj).getId();
                if (id != null && id.intValue() == i2) {
                    break;
                }
            }
            BetsListModel betsListModel = (BetsListModel) obj;
            if (betsListModel != null) {
                function1.invoke(betsListModel);
            } else if (emptyList.size() < i) {
                function1.invoke(null);
            } else {
                intRef.element += i;
                loadForeignUserBetForDeepLink$loadNextPage(betsListFragment, function1, intRef, i, i3, i2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getAppLanguageObserver().wasLanguageRecentlyChanged()) {
            getAppLanguageObserver().markLanguageChangeHandled();
        }
        getBetController().reloadBetsHistory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setControllingMenus(false);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }
}
