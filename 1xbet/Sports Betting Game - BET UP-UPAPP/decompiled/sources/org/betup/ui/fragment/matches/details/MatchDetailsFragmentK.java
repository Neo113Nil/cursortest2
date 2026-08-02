package org.betup.ui.fragment.matches.details;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.presentation.PresentationMatchContext;
import org.betup.presentation.PresentationScreenProvider;
import org.betup.presentation.ScreenTracker;
import org.betup.services.language.AppLanguageObserver;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchDetailsFragmentK.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006(²\u0006\f\u0010)\u001a\u0004\u0018\u00010*X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/matches/details/MatchDetailsFragmentK;", "Lorg/betup/ui/fragment/BaseFragment;", "Lorg/betup/presentation/PresentationScreenProvider;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "getController", "()Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "setController", "(Lorg/betup/ui/fragment/matches/details/MatchDetailsController;)V", "appLanguageObserver", "Lorg/betup/services/language/AppLanguageObserver;", "getAppLanguageObserver", "()Lorg/betup/services/language/AppLanguageObserver;", "setAppLanguageObserver", "(Lorg/betup/services/language/AppLanguageObserver;)V", "screenTracker", "Lorg/betup/presentation/ScreenTracker;", "getScreenTracker", "()Lorg/betup/presentation/ScreenTracker;", "setScreenTracker", "(Lorg/betup/presentation/ScreenTracker;)V", "presentationScreenKey", "", "presentationScreenContext", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", X3.i.u0, "onDestroy", VastTagName.COMPANION, "app_release", "matchInfo", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchDetailsFragmentK extends BaseFragment implements PresentationScreenProvider {

    @Inject
    public AppLanguageObserver appLanguageObserver;

    @Inject
    public MatchDetailsController controller;

    @Inject
    public ScreenTracker screenTracker;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // org.betup.presentation.PresentationScreenProvider
    public boolean shouldReportPresentationScreen() {
        return PresentationScreenProvider.DefaultImpls.shouldReportPresentationScreen(this);
    }

    public final MatchDetailsController getController() {
        MatchDetailsController matchDetailsController = this.controller;
        if (matchDetailsController != null) {
            return matchDetailsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(MatchDetailsController matchDetailsController) {
        Intrinsics.checkNotNullParameter(matchDetailsController, "<set-?>");
        this.controller = matchDetailsController;
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

    public final ScreenTracker getScreenTracker() {
        ScreenTracker screenTracker = this.screenTracker;
        if (screenTracker != null) {
            return screenTracker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenTracker");
        return null;
    }

    public final void setScreenTracker(ScreenTracker screenTracker) {
        Intrinsics.checkNotNullParameter(screenTracker, "<set-?>");
        this.screenTracker = screenTracker;
    }

    @Override // org.betup.presentation.PresentationScreenProvider
    public String presentationScreenKey() {
        return "match_details";
    }

    @Override // org.betup.presentation.PresentationScreenProvider
    public Map<String, String> presentationScreenContext() {
        Bundle arguments = getArguments();
        return PresentationMatchContext.INSTANCE.fromShortMatch(getController().getCurrentMatch().getValue(), arguments != null ? arguments.getInt("id") : 0);
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
        FragmentActivity activity = getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity == null) {
            Log.w("MatchDetailsFragmentK", "onCreateView called while fragment is not attached");
            return new FrameLayout(inflater.getContext());
        }
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("id") : 0;
        Bundle arguments2 = getArguments();
        boolean z = arguments2 != null ? arguments2.getBoolean("isLive") : false;
        Bundle arguments3 = getArguments();
        getController().bind(mainActivity, z, i, arguments3 != null ? arguments3.getInt("participationId") : 0);
        TourComposeHelper tourComposeHelper = mainActivity.tourComposeHelper;
        Function1<? super Rect, Unit> function1 = tourComposeHelper != null ? tourComposeHelper.setBetSectionBounds : null;
        Function0<Unit> function0 = tourComposeHelper != null ? tourComposeHelper.onBetSectionReady : null;
        TourState tourState = tourComposeHelper != null ? tourComposeHelper.getTourState() : null;
        Log.d("TourFlow", "MatchDetailsFragmentK - isTourActive: " + (tourState != null ? Boolean.valueOf(tourState.isTourActive()) : null) + ", currentStep: " + (tourState != null ? tourState.getCurrentStep() : null));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-79722033, true, new MatchDetailsFragmentK$onCreateView$1$1(this, function1, function0)));
        return composeView;
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getAppLanguageObserver().wasLanguageRecentlyChanged()) {
            getAppLanguageObserver().markLanguageChangeHandled();
        }
        getController().refreshBetGroups();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getController().cleanup();
    }

    /* compiled from: MatchDetailsFragmentK.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/matches/details/MatchDetailsFragmentK$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "setInstance", "Lorg/betup/ui/fragment/matches/details/MatchDetailsFragmentK;", "id", "", "isLive", "", "participationId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MatchDetailsFragmentK setInstance(int id, boolean isLive, int participationId) {
            Log.d("SLIDERTEST", "MAIN INSTANCE = " + id);
            MatchDetailsFragmentK matchDetailsFragmentK = new MatchDetailsFragmentK();
            Bundle bundle = new Bundle();
            bundle.putInt("id", id);
            bundle.putBoolean("isLive", isLive);
            bundle.putInt("participationId", participationId);
            matchDetailsFragmentK.setArguments(bundle);
            return matchDetailsFragmentK;
        }
    }
}
