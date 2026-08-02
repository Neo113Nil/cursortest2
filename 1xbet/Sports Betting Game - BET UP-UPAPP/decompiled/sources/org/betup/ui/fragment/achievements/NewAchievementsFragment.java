package org.betup.ui.fragment.achievements;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.services.user.UserService;
import org.betup.ui.TabMenuItem;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.achievements.compose.AchievementsContentKt;
import org.betup.ui.fragment.achievements.controller.AchievementsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: NewAchievementsFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lorg/betup/ui/fragment/achievements/NewAchievementsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "achievementsController", "Lorg/betup/ui/fragment/achievements/controller/AchievementsController;", "getAchievementsController", "()Lorg/betup/ui/fragment/achievements/controller/AchievementsController;", "setAchievementsController", "(Lorg/betup/ui/fragment/achievements/controller/AchievementsController;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, X3.i.u0, X3.i.t0, "onStop", "onDestroy", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NewAchievementsFragment extends BaseFragment {

    @Inject
    public AchievementsController achievementsController;

    @Inject
    public UserService userService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final AchievementsController getAchievementsController() {
        AchievementsController achievementsController = this.achievementsController;
        if (achievementsController != null) {
            return achievementsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("achievementsController");
        return null;
    }

    public final void setAchievementsController(AchievementsController achievementsController) {
        Intrinsics.checkNotNullParameter(achievementsController, "<set-?>");
        this.achievementsController = achievementsController;
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
        Log.d("NewAchievementsFragment", "onCreate called");
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Log.d("NewAchievementsFragment", "Dagger injection completed");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Log.d("NewAchievementsFragment", "onCreateView called");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        Log.d("NewAchievementsFragment", "ComposeView created, setting content");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1046708166, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.achievements.NewAchievementsFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1046708166, i, -1, "org.betup.ui.fragment.achievements.NewAchievementsFragment.onCreateView.<anonymous>.<anonymous> (NewAchievementsFragment.kt:45)");
                }
                AchievementsContentKt.AchievementsContent(NewAchievementsFragment.this.getAchievementsController(), NewAchievementsFragment.this.getUserService(), null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Log.d("NewAchievementsFragment", "onViewCreated called");
        AchievementsController achievementsController = getAchievementsController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        achievementsController.initialize(requireContext);
        Integer id = getUserService().getShortProfile().getUserModel().getId();
        Log.d("NewAchievementsFragment", "Loading achievements for user: " + id);
        AchievementsController achievementsController2 = getAchievementsController();
        Intrinsics.checkNotNull(id);
        achievementsController2.loadAchievements(id.intValue());
        updateMenuBars(getString(R.string.drawer_achievements), TabMenuItem.NONE);
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.d("NewAchievementsFragment", "onResume called");
        if (getAchievementsController().getIsControllerActive()) {
            return;
        }
        Log.d("NewAchievementsFragment", "Controller not active in onResume, rebinding");
        AchievementsController achievementsController = getAchievementsController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        achievementsController.initialize(requireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.d("NewAchievementsFragment", "onPause called");
        getAchievementsController().setInactive();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Log.d("NewAchievementsFragment", "onStop called");
        getAchievementsController().setInactive();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.d("NewAchievementsFragment", "onDestroy called");
        getAchievementsController().unbind();
    }

    /* compiled from: NewAchievementsFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/achievements/NewAchievementsFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/achievements/NewAchievementsFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NewAchievementsFragment newInstance() {
            return new NewAchievementsFragment();
        }
    }
}
