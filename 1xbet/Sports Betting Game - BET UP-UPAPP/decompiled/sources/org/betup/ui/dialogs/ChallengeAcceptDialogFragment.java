package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.MainActivity;
import org.betup.ui.base.SnackbarDialogFragment;
import org.betup.ui.dialogs.controller.ChallengeAcceptController;
import org.betup.ui.dialogs.events.BattleBackToBetSelectionEvent;
import org.betup.ui.fragment.bets.BetsController;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: ChallengeAcceptDialogFragment.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lorg/betup/ui/dialogs/ChallengeAcceptDialogFragment;", "Lorg/betup/ui/base/SnackbarDialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "controller", "Lorg/betup/ui/dialogs/controller/ChallengeAcceptController;", "getController", "()Lorg/betup/ui/dialogs/controller/ChallengeAcceptController;", "setController", "(Lorg/betup/ui/dialogs/controller/ChallengeAcceptController;)V", "betController", "Lorg/betup/ui/fragment/bets/BetsController;", "getBetController", "()Lorg/betup/ui/fragment/bets/BetsController;", "setBetController", "(Lorg/betup/ui/fragment/bets/BetsController;)V", "allSportId", "", "allLeagueId", "allMatchId", "", "followerPhoto", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onDestroyView", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengeAcceptDialogFragment extends SnackbarDialogFragment {
    private static final String ARG_AMOUNT = "amount";
    private static final String ARG_BET_ID = "bet_id";
    private static final String ARG_BET_NAME = "bet_name";
    private static final String ARG_CHALLENGE_ID = "challenge_id";
    private static final String ARG_COEFFICIENT = "coefficient";
    private static final String ARG_FOLLOWER_PHOTO = "follower_photo";
    private static final String ARG_GROUP_NAME = "group_name";
    private static final String ARG_MATCH_ID = "match_id";
    private static final String ARG_USER_ID = "user_id";
    private static final String ARG_VARIETY_NAME = "variety_name";
    private int allLeagueId;
    private long allMatchId;
    private int allSportId;

    @Inject
    public BetsController betController;

    @Inject
    public ChallengeAcceptController controller;
    private String followerPhoto;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final ChallengeAcceptController getController() {
        ChallengeAcceptController challengeAcceptController = this.controller;
        if (challengeAcceptController != null) {
            return challengeAcceptController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controller");
        return null;
    }

    public final void setController(ChallengeAcceptController challengeAcceptController) {
        Intrinsics.checkNotNullParameter(challengeAcceptController, "<set-?>");
        this.controller = challengeAcceptController;
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    /* compiled from: ChallengeAcceptDialogFragment.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lorg/betup/ui/dialogs/ChallengeAcceptDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_CHALLENGE_ID", "", "ARG_MATCH_ID", "ARG_USER_ID", "ARG_BET_ID", "ARG_BET_NAME", "ARG_GROUP_NAME", "ARG_VARIETY_NAME", "ARG_COEFFICIENT", "ARG_FOLLOWER_PHOTO", "ARG_AMOUNT", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/ChallengeAcceptDialogFragment;", "matchId", "", "userId", "betId", "betName", "groupName", "varietyName", "followerPhoto", "amount", ChallengeAcceptDialogFragment.ARG_COEFFICIENT, "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;)Lorg/betup/ui/dialogs/ChallengeAcceptDialogFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ChallengeAcceptDialogFragment newInstance$default(Companion companion, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, Long l4, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                l = null;
            }
            if ((i & 2) != 0) {
                l2 = null;
            }
            if ((i & 4) != 0) {
                l3 = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            if ((i & 16) != 0) {
                str2 = null;
            }
            if ((i & 32) != 0) {
                str3 = null;
            }
            if ((i & 64) != 0) {
                str4 = null;
            }
            if ((i & 128) != 0) {
                l4 = null;
            }
            if ((i & 256) != 0) {
                d = null;
            }
            return companion.newInstance(l, l2, l3, str, str2, str3, str4, l4, d);
        }

        public final ChallengeAcceptDialogFragment newInstance(Long matchId, Long userId, Long betId, String betName, String groupName, String varietyName, String followerPhoto, Long amount, Double coefficient) {
            ChallengeAcceptDialogFragment challengeAcceptDialogFragment = new ChallengeAcceptDialogFragment();
            Bundle bundle = new Bundle();
            if (matchId != null) {
                bundle.putLong(ChallengeAcceptDialogFragment.ARG_MATCH_ID, matchId.longValue());
            }
            if (userId != null) {
                bundle.putLong("user_id", userId.longValue());
            }
            if (betId != null) {
                bundle.putLong(ChallengeAcceptDialogFragment.ARG_BET_ID, betId.longValue());
            }
            if (betName != null) {
                bundle.putString(ChallengeAcceptDialogFragment.ARG_BET_NAME, betName);
            }
            if (groupName != null) {
                bundle.putString(ChallengeAcceptDialogFragment.ARG_GROUP_NAME, groupName);
            }
            if (varietyName != null) {
                bundle.putString(ChallengeAcceptDialogFragment.ARG_VARIETY_NAME, varietyName);
            }
            if (followerPhoto != null) {
                bundle.putString(ChallengeAcceptDialogFragment.ARG_FOLLOWER_PHOTO, followerPhoto);
            }
            if (amount != null) {
                bundle.putLong("amount", amount.longValue());
            }
            if (coefficient != null) {
                bundle.putDouble(ChallengeAcceptDialogFragment.ARG_COEFFICIENT, coefficient.doubleValue());
            }
            challengeAcceptDialogFragment.setArguments(bundle);
            return challengeAcceptDialogFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        Long valueOf = arguments != null ? Long.valueOf(arguments.getLong(ARG_MATCH_ID, -1L)) : null;
        if (valueOf != null && valueOf.longValue() == -1) {
            valueOf = null;
        }
        Bundle arguments2 = getArguments();
        Long valueOf2 = arguments2 != null ? Long.valueOf(arguments2.getLong("user_id", -1L)) : null;
        if (valueOf2 != null && valueOf2.longValue() == -1) {
            valueOf2 = null;
        }
        Bundle arguments3 = getArguments();
        this.allSportId = arguments3 != null ? arguments3.getInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID) : 0;
        Bundle arguments4 = getArguments();
        this.allLeagueId = arguments4 != null ? arguments4.getInt("leagueId") : 0;
        this.allMatchId = valueOf != null ? valueOf.longValue() : 0L;
        Bundle arguments5 = getArguments();
        this.followerPhoto = arguments5 != null ? arguments5.getString(ARG_FOLLOWER_PHOTO) : null;
        Bundle arguments6 = getArguments();
        Long valueOf3 = arguments6 != null ? Long.valueOf(arguments6.getLong("amount", -1L)) : null;
        Long l = (valueOf3 == null || valueOf3.longValue() != -1) ? valueOf3 : null;
        Log.d("ChallengeAcceptDialogFragment", "allMatchId: " + this.allMatchId);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1666963183, true, new ChallengeAcceptDialogFragment$onCreateView$1$1(this, l, valueOf2)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Long valueOf = arguments != null ? Long.valueOf(arguments.getLong(ARG_CHALLENGE_ID, -1L)) : null;
        Long l = (valueOf != null && valueOf.longValue() == -1) ? null : valueOf;
        Bundle arguments2 = getArguments();
        Long valueOf2 = arguments2 != null ? Long.valueOf(arguments2.getLong(ARG_MATCH_ID, -1L)) : null;
        Long l2 = (valueOf2 != null && valueOf2.longValue() == -1) ? null : valueOf2;
        Bundle arguments3 = getArguments();
        final Long valueOf3 = arguments3 != null ? Long.valueOf(arguments3.getLong("user_id", -1L)) : null;
        if (valueOf3 != null && valueOf3.longValue() == -1) {
            valueOf3 = null;
        }
        Bundle arguments4 = getArguments();
        Long valueOf4 = arguments4 != null ? Long.valueOf(arguments4.getLong(ARG_BET_ID, -1L)) : null;
        Long l3 = (valueOf4 != null && valueOf4.longValue() == -1) ? null : valueOf4;
        Bundle arguments5 = getArguments();
        String string = arguments5 != null ? arguments5.getString(ARG_BET_NAME) : null;
        Bundle arguments6 = getArguments();
        String string2 = arguments6 != null ? arguments6.getString(ARG_GROUP_NAME) : null;
        Bundle arguments7 = getArguments();
        String string3 = arguments7 != null ? arguments7.getString(ARG_VARIETY_NAME) : null;
        Bundle arguments8 = getArguments();
        Double valueOf5 = arguments8 != null ? Double.valueOf(arguments8.getDouble(ARG_COEFFICIENT, -1.0d)) : null;
        Double d = !Intrinsics.areEqual(valueOf5, -1.0d) ? valueOf5 : null;
        Bundle arguments9 = getArguments();
        String string4 = arguments9 != null ? arguments9.getString(ARG_FOLLOWER_PHOTO) : null;
        Bundle arguments10 = getArguments();
        Long valueOf6 = arguments10 != null ? Long.valueOf(arguments10.getLong("amount", -1L)) : null;
        Long l4 = (valueOf6 == null || valueOf6.longValue() != -1) ? valueOf6 : null;
        ChallengeAcceptController controller = getController();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        controller.bind((MainActivity) requireActivity, new Function0() { // from class: org.betup.ui.dialogs.ChallengeAcceptDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onViewCreated$lambda$10;
                onViewCreated$lambda$10 = ChallengeAcceptDialogFragment.onViewCreated$lambda$10(ChallengeAcceptDialogFragment.this);
                return onViewCreated$lambda$10;
            }
        }, requireContext, l, l2, valueOf3, l3, string, string2, string3, d, string4, new Function1() { // from class: org.betup.ui.dialogs.ChallengeAcceptDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onViewCreated$lambda$11;
                onViewCreated$lambda$11 = ChallengeAcceptDialogFragment.onViewCreated$lambda$11(ChallengeAcceptDialogFragment.this, (CharSequence) obj);
                return onViewCreated$lambda$11;
            }
        });
        BetsController betController = getBetController();
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNull(requireActivity2, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        BetsController.bind$default(betController, (MainActivity) requireActivity2, new Function0() { // from class: org.betup.ui.dialogs.ChallengeAcceptDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, requireContext2, null, 8, null);
        long coerceAtLeast = l4 != null ? RangesKt.coerceAtLeast(l4.longValue(), 500L) : 500L;
        if (l4 != null && l4.longValue() < 500) {
            showSnackbar(R.string.min_battle_amount);
        }
        getBetController().onAmountChange(Long.valueOf(coerceAtLeast));
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: org.betup.ui.dialogs.ChallengeAcceptDialogFragment$onViewCreated$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                long j;
                int i;
                int i2;
                EventBus eventBus = EventBus.getDefault();
                j = ChallengeAcceptDialogFragment.this.allMatchId;
                i = ChallengeAcceptDialogFragment.this.allLeagueId;
                i2 = ChallengeAcceptDialogFragment.this.allSportId;
                eventBus.post(new BattleBackToBetSelectionEvent(j, i, i2, valueOf3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(ChallengeAcceptDialogFragment challengeAcceptDialogFragment) {
        challengeAcceptDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(ChallengeAcceptDialogFragment challengeAcceptDialogFragment, CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SnackbarDialogFragment.showSnackbar$default(challengeAcceptDialogFragment, message, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.base.SnackbarDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(null);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setDimAmount(0.5f);
        }
        Log.d("ChallengeAcceptDialogFragment", "onStart called");
        Log.d("ChallengeAcceptDialogFragment", "Checking if controller is already registered: " + EventBus.getDefault().isRegistered(getController()));
        if (!EventBus.getDefault().isRegistered(getController())) {
            EventBus.getDefault().register(getController());
            Log.d("ChallengeAcceptDialogFragment", "Controller registered with EventBus");
        } else {
            Log.d("ChallengeAcceptDialogFragment", "Controller already registered with EventBus");
        }
        Log.d("ChallengeAcceptDialogFragment", "Final registration status: " + EventBus.getDefault().isRegistered(getController()));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("ChallengeAcceptDialogFragment", "onDestroyView called");
        Log.d("ChallengeAcceptDialogFragment", "Checking if controller is registered before unregister: " + EventBus.getDefault().isRegistered(getController()));
        if (EventBus.getDefault().isRegistered(getController())) {
            EventBus.getDefault().unregister(getController());
            Log.d("ChallengeAcceptDialogFragment", "Controller unregistered from EventBus");
        } else {
            Log.d("ChallengeAcceptDialogFragment", "Controller was not registered with EventBus");
        }
        getController().destroy();
    }
}
