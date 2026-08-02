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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.C3664q2;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: MatchNotificationComposeDialogFragment.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"Lorg/betup/ui/dialogs/MatchNotificationComposeDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MatchNotificationComposeDialogFragment extends DialogFragment {
    private static final String ARG_IMAGE_URL = "image_url";
    private static final String ARG_MATCH_ID = "match_id";
    private static final String ARG_SUBTITLE = "subtitle";
    private static final String ARG_TITLE = "title";
    private static final String TAG = "MatchPushNotification";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final void show(FragmentActivity fragmentActivity, int i, String str, String str2, String str3) {
        INSTANCE.show(fragmentActivity, i, str, str2, str3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt(ARG_MATCH_ID) : 0;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("title") : null;
        String str = string == null ? "" : string;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString(ARG_SUBTITLE) : null;
        String str2 = string2 == null ? "" : string2;
        Bundle arguments4 = getArguments();
        String string3 = arguments4 != null ? arguments4.getString(ARG_IMAGE_URL) : null;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(251580441, true, new MatchNotificationComposeDialogFragment$onCreateView$1$1(str, str2, string3, this, i)));
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

    /* compiled from: MatchNotificationComposeDialogFragment.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0007J,\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/dialogs/MatchNotificationComposeDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_MATCH_ID", "ARG_TITLE", "ARG_SUBTITLE", "ARG_IMAGE_URL", C3664q2.v, "", "activity", "Landroidx/fragment/app/FragmentActivity;", "matchId", "", "titleLine", "subtitleLine", UnifiedMediationParams.KEY_IMAGE_URL, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/MatchNotificationComposeDialogFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void show(FragmentActivity activity, int matchId, String titleLine, String subtitleLine, String imageUrl) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(MatchNotificationComposeDialogFragment.TAG);
            DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
            if (dialogFragment != null) {
                dialogFragment.dismissAllowingStateLoss();
            }
            newInstance(matchId, titleLine, subtitleLine, imageUrl).show(supportFragmentManager, MatchNotificationComposeDialogFragment.TAG);
        }

        public final MatchNotificationComposeDialogFragment newInstance(int matchId, String titleLine, String subtitleLine, String imageUrl) {
            MatchNotificationComposeDialogFragment matchNotificationComposeDialogFragment = new MatchNotificationComposeDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(MatchNotificationComposeDialogFragment.ARG_MATCH_ID, matchId);
            if (titleLine == null) {
                titleLine = "";
            }
            bundle.putString("title", titleLine);
            if (subtitleLine == null) {
                subtitleLine = "";
            }
            bundle.putString(MatchNotificationComposeDialogFragment.ARG_SUBTITLE, subtitleLine);
            bundle.putString(MatchNotificationComposeDialogFragment.ARG_IMAGE_URL, imageUrl);
            matchNotificationComposeDialogFragment.setArguments(bundle);
            return matchNotificationComposeDialogFragment;
        }
    }
}
