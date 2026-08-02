package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.media.MediaPlayer;
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
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: PurchaseCompletedNewDialogFragment.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/dialogs/PurchaseCompletedNewDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "model", "Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;", "onDismissListener", "Lorg/betup/ui/dialogs/PurchaseCompletedNewDialogFragment$OnDismissListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "OnDismissListener", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchaseCompletedNewDialogFragment extends DialogFragment {
    private PurchaseCompletedUiModel model = new PurchaseCompletedUiModel(null, null, null, 0, 0, 0, null, 0, null, 511, null);
    private OnDismissListener onDismissListener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PurchaseCompletedNewDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/dialogs/PurchaseCompletedNewDialogFragment$OnDismissListener;", "", "onDismiss", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnDismissListener {
        void onDismiss();
    }

    @JvmStatic
    public static final PurchaseCompletedNewDialogFragment newInstance(long j, OnDismissListener onDismissListener) {
        return INSTANCE.newInstance(j, onDismissListener);
    }

    @JvmStatic
    public static final PurchaseCompletedNewDialogFragment newInstance(PurchaseCompletedUiModel purchaseCompletedUiModel, OnDismissListener onDismissListener) {
        return INSTANCE.newInstance(purchaseCompletedUiModel, onDismissListener);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.model = PurchaseCompletedUiModel.INSTANCE.fromBundle(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-933227495, true, new PurchaseCompletedNewDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        final MediaPlayer create;
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(null);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setDimAmount(0.6f);
        }
        if (this.model.getKind() == PurchaseCompletedKind.DAILY_CLAIM || (create = MediaPlayer.create(requireContext(), R.raw.purchase_success_sound)) == null) {
            return;
        }
        create.setVolume(0.5f, 0.5f);
        create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: org.betup.ui.dialogs.PurchaseCompletedNewDialogFragment$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                create.release();
            }
        });
        create.start();
    }

    /* compiled from: PurchaseCompletedNewDialogFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\f"}, d2 = {"Lorg/betup/ui/dialogs/PurchaseCompletedNewDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/PurchaseCompletedNewDialogFragment;", "amount", "", "onDismissListener", "Lorg/betup/ui/dialogs/PurchaseCompletedNewDialogFragment$OnDismissListener;", "model", "Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PurchaseCompletedNewDialogFragment newInstance(long amount, OnDismissListener onDismissListener) {
            return newInstance(PurchaseCompletedUiMapper.INSTANCE.fromInstantAmount(amount), onDismissListener);
        }

        @JvmStatic
        public final PurchaseCompletedNewDialogFragment newInstance(PurchaseCompletedUiModel model, OnDismissListener onDismissListener) {
            Intrinsics.checkNotNullParameter(model, "model");
            PurchaseCompletedNewDialogFragment purchaseCompletedNewDialogFragment = new PurchaseCompletedNewDialogFragment();
            purchaseCompletedNewDialogFragment.setArguments(model.toBundle());
            purchaseCompletedNewDialogFragment.onDismissListener = onDismissListener;
            return purchaseCompletedNewDialogFragment;
        }
    }
}
