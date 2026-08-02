package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.utils.DialogManager;
import org.betup.utils.VideoRewardCollectDialogHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: VideoRewardCollectDialogFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001c\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "amount", "", "title", "", "description", "imageResourceId", "onCollectListener", "Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$OnCollectListener;", "onDismissListener", "Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$OnDismissListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "OnCollectListener", "OnDismissListener", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoRewardCollectDialogFragment extends DialogFragment {
    private static final String ARG_AMOUNT = "amount";
    private static final String ARG_DESCRIPTION = "description";
    private static final String ARG_IMAGE_RESOURCE = "imageResource";
    private static final String ARG_TITLE = "title";
    private int amount;
    private OnCollectListener onCollectListener;
    private OnDismissListener onDismissListener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private String title = "";
    private String description = "";
    private int imageResourceId = R.drawable.watched_video_prize_img;

    /* compiled from: VideoRewardCollectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$OnCollectListener;", "", "onCollect", "", "amount", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnCollectListener {
        void onCollect(int amount);
    }

    /* compiled from: VideoRewardCollectDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$OnDismissListener;", "", "onDismiss", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnDismissListener {
        void onDismiss();
    }

    @JvmStatic
    public static final VideoRewardCollectDialogFragment newInstance(int i, String str, String str2, OnCollectListener onCollectListener, OnDismissListener onDismissListener, int i2) {
        return INSTANCE.newInstance(i, str, str2, onCollectListener, onDismissListener, i2);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.amount = arguments.getInt("amount", 0);
            String string = arguments.getString("title", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.title = string;
            String string2 = arguments.getString("description", "");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.description = string2;
            this.imageResourceId = arguments.getInt(ARG_IMAGE_RESOURCE, R.drawable.watched_video_prize_img);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1072918937, true, new VideoRewardCollectDialogFragment$onCreateView$1$1(this)));
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

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        String tag = getTag();
        if (tag == null) {
            tag = VideoRewardCollectDialogHelper.DIALOG_TAG;
        }
        DialogManager.onDialogDismissed(tag);
        OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* compiled from: VideoRewardCollectDialogFragment.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_AMOUNT", "", "ARG_TITLE", "ARG_DESCRIPTION", "ARG_IMAGE_RESOURCE", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment;", "amount", "", "title", "description", "onCollectListener", "Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$OnCollectListener;", "onDismissListener", "Lorg/betup/ui/dialogs/VideoRewardCollectDialogFragment$OnDismissListener;", "imageResourceId", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ VideoRewardCollectDialogFragment newInstance$default(Companion companion, int i, String str, String str2, OnCollectListener onCollectListener, OnDismissListener onDismissListener, int i2, int i3, Object obj) {
            if ((i3 & 32) != 0) {
                i2 = R.drawable.watched_video_prize_img;
            }
            return companion.newInstance(i, str, str2, onCollectListener, onDismissListener, i2);
        }

        @JvmStatic
        public final VideoRewardCollectDialogFragment newInstance(int amount, String title, String description, OnCollectListener onCollectListener, OnDismissListener onDismissListener, int imageResourceId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            VideoRewardCollectDialogFragment videoRewardCollectDialogFragment = new VideoRewardCollectDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("amount", amount);
            bundle.putString("title", title);
            bundle.putString("description", description);
            bundle.putInt(VideoRewardCollectDialogFragment.ARG_IMAGE_RESOURCE, imageResourceId);
            videoRewardCollectDialogFragment.setArguments(bundle);
            videoRewardCollectDialogFragment.onCollectListener = onCollectListener;
            videoRewardCollectDialogFragment.onDismissListener = onDismissListener;
            return videoRewardCollectDialogFragment;
        }
    }
}
