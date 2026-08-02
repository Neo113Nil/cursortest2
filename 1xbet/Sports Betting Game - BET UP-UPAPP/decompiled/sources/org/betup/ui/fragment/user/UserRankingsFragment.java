package org.betup.ui.fragment.user;

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
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.user.compose.UserRankingsContentKt;
import org.betup.ui.fragment.user.controller.UserRankingsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: UserRankingsFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/user/UserRankingsFragment;", "Lorg/betup/ui/fragment/BaseFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "userRankingsController", "Lorg/betup/ui/fragment/user/controller/UserRankingsController;", "getUserRankingsController", "()Lorg/betup/ui/fragment/user/controller/UserRankingsController;", "setUserRankingsController", "(Lorg/betup/ui/fragment/user/controller/UserRankingsController;)V", "userId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserRankingsFragment extends BaseFragment {
    private int userId;

    @Inject
    public UserRankingsController userRankingsController;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final UserRankingsFragment newInstance(int i) {
        return INSTANCE.newInstance(i);
    }

    public final UserRankingsController getUserRankingsController() {
        UserRankingsController userRankingsController = this.userRankingsController;
        if (userRankingsController != null) {
            return userRankingsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userRankingsController");
        return null;
    }

    public final void setUserRankingsController(UserRankingsController userRankingsController) {
        Intrinsics.checkNotNullParameter(userRankingsController, "<set-?>");
        this.userRankingsController = userRankingsController;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("UserRankingsFragment", "onCreate called");
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("id", 0) : 0;
        this.userId = i;
        Log.d("UserRankingsFragment", "userId from arguments: " + i);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Log.d("UserRankingsFragment", "Dagger injection completed");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Log.d("UserRankingsFragment", "onCreateView called with userId: " + this.userId);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        Log.d("UserRankingsFragment", "ComposeView created, setting content");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(712280347, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.UserRankingsFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                int i2;
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(712280347, i, -1, "org.betup.ui.fragment.user.UserRankingsFragment.onCreateView.<anonymous>.<anonymous> (UserRankingsFragment.kt:45)");
                }
                UserRankingsController userRankingsController = UserRankingsFragment.this.getUserRankingsController();
                i2 = UserRankingsFragment.this.userId;
                UserRankingsContentKt.UserRankingsContent(userRankingsController, i2, composer, 0, 0);
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
        Log.d("UserRankingsFragment", "onViewCreated called");
    }

    /* compiled from: UserRankingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/user/UserRankingsFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/user/UserRankingsFragment;", "userId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UserRankingsFragment newInstance(int userId) {
            UserRankingsFragment userRankingsFragment = new UserRankingsFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("id", userId);
            userRankingsFragment.setArguments(bundle);
            return userRankingsFragment;
        }
    }
}
