package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.subscription.SubscriptionType;
import org.betup.services.subscription.DefaultSubscriptionService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: NotificationDialogFragment.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J \u0010\u001e\u001a\u00020\u00132\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00130\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!²\u0006\u0012\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002"}, d2 = {"Lorg/betup/ui/dialogs/NotificationDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "subscriptionService", "Lorg/betup/services/subscription/DefaultSubscriptionService;", "getSubscriptionService", "()Lorg/betup/services/subscription/DefaultSubscriptionService;", "setSubscriptionService", "(Lorg/betup/services/subscription/DefaultSubscriptionService;)V", "matchId", "", "matchState", "Lorg/betup/model/remote/entity/matches/MatchState;", "currentSubscriptions", "", "Lorg/betup/model/remote/entity/subscription/SubscriptionType;", "onDismissListener", "Lkotlin/Function1;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "setOnDismissListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, VastTagName.COMPANION, "app_release", "loadedSubscriptions", "isLoading", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationDialogFragment extends DialogFragment {
    private static final String ARG_CURRENT_SUBSCRIPTIONS = "current_subscriptions";
    private static final String ARG_MATCH_ID = "match_id";
    private static final String ARG_MATCH_STATE = "match_state";
    private List<? extends SubscriptionType> currentSubscriptions;
    private int matchId;
    private MatchState matchState;
    private Function1<? super List<? extends SubscriptionType>, Unit> onDismissListener;

    @Inject
    public DefaultSubscriptionService subscriptionService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final DefaultSubscriptionService getSubscriptionService() {
        DefaultSubscriptionService defaultSubscriptionService = this.subscriptionService;
        if (defaultSubscriptionService != null) {
            return defaultSubscriptionService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("subscriptionService");
        return null;
    }

    public final void setSubscriptionService(DefaultSubscriptionService defaultSubscriptionService) {
        Intrinsics.checkNotNullParameter(defaultSubscriptionService, "<set-?>");
        this.subscriptionService = defaultSubscriptionService;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(true);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.matchId = arguments.getInt(ARG_MATCH_ID, 0);
            int i = arguments.getInt(ARG_MATCH_STATE, -1);
            List<? extends SubscriptionType> list = null;
            this.matchState = i >= 0 ? MatchState.values()[i] : null;
            int[] intArray = arguments.getIntArray(ARG_CURRENT_SUBSCRIPTIONS);
            if (intArray != null) {
                ArrayList arrayList = new ArrayList(intArray.length);
                for (int i2 : intArray) {
                    arrayList.add(SubscriptionType.values()[i2]);
                }
                list = CollectionsKt.toList(arrayList);
            }
            this.currentSubscriptions = list;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-370346119, true, new NotificationDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.6f);
    }

    public final void setOnDismissListener(Function1<? super List<? extends SubscriptionType>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onDismissListener = listener;
    }

    /* compiled from: NotificationDialogFragment.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/dialogs/NotificationDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_MATCH_ID", "", "ARG_MATCH_STATE", "ARG_CURRENT_SUBSCRIPTIONS", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/NotificationDialogFragment;", "matchId", "", "matchState", "Lorg/betup/model/remote/entity/matches/MatchState;", "currentSubscriptions", "", "Lorg/betup/model/remote/entity/subscription/SubscriptionType;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NotificationDialogFragment newInstance(int matchId, MatchState matchState, List<? extends SubscriptionType> currentSubscriptions) {
            int[] iArr;
            NotificationDialogFragment notificationDialogFragment = new NotificationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(NotificationDialogFragment.ARG_MATCH_ID, matchId);
            bundle.putInt(NotificationDialogFragment.ARG_MATCH_STATE, matchState != null ? matchState.ordinal() : -1);
            if (currentSubscriptions != null) {
                List<? extends SubscriptionType> list = currentSubscriptions;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((SubscriptionType) it.next()).ordinal()));
                }
                iArr = CollectionsKt.toIntArray(arrayList);
            } else {
                iArr = null;
            }
            bundle.putIntArray(NotificationDialogFragment.ARG_CURRENT_SUBSCRIPTIONS, iArr);
            notificationDialogFragment.setArguments(bundle);
            return notificationDialogFragment;
        }
    }
}
