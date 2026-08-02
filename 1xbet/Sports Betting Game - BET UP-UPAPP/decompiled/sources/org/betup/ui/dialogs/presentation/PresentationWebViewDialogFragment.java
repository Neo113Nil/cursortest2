package org.betup.ui.dialogs.presentation;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.presentation.PresentationCampaignDto;
import org.betup.ui.dialogs.presentation.bridge.PresentationWebViewBridgeHandler;
import org.betup.utils.PresentationOverlayGate;
import org.betup.utils.WebViewDialogStateGuard;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: PresentationWebViewDialogFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lorg/betup/ui/dialogs/presentation/PresentationWebViewDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "callbackKey", "", "campaign", "Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "bridgeHandler", "Lorg/betup/ui/dialogs/presentation/bridge/PresentationWebViewBridgeHandler;", "restoreFailed", "", "webView", "Landroid/webkit/WebView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onDestroyView", "onStart", "onDismiss", "dialog", "Landroid/content/DialogInterface;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationWebViewDialogFragment extends DialogFragment {
    private static final String ARG_CALLBACK_KEY = "arg_callback_key";
    public static final String TAG = "PresentationWebViewDialog";
    private PresentationWebViewBridgeHandler bridgeHandler;
    private String callbackKey = "";
    private PresentationCampaignDto campaign;
    private boolean restoreFailed;
    private WebView webView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String string = requireArguments().getString(ARG_CALLBACK_KEY);
        if (string == null) {
            string = "";
        }
        this.callbackKey = string;
        this.campaign = PresentationBridgeCallbackRegistry.INSTANCE.peekCampaign(this.callbackKey);
        PresentationWebViewBridgeHandler peekHandler = PresentationBridgeCallbackRegistry.INSTANCE.peekHandler(this.callbackKey);
        this.bridgeHandler = peekHandler;
        if (this.campaign == null || peekHandler == null) {
            Log.w(TAG, "Presentation context unavailable (process death or stale restore); dismissing");
            this.restoreFailed = true;
            PresentationOverlayGate.onPresentationDismissed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        PresentationWebViewBridgeHandler presentationWebViewBridgeHandler;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.restoreFailed) {
            return new View(requireContext());
        }
        PresentationCampaignDto presentationCampaignDto = this.campaign;
        if (presentationCampaignDto != null && (presentationWebViewBridgeHandler = this.bridgeHandler) != null) {
            View inflate = inflater.inflate(R.layout.fragment_presentation_webview, container, false);
            WebView webView = (WebView) inflate.findViewById(R.id.presentationWebView);
            this.webView = webView;
            Intrinsics.checkNotNull(webView);
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            PresentationWebViewDialogFragmentKt.configureWebView(webView, requireContext, presentationCampaignDto, presentationWebViewBridgeHandler);
            Intrinsics.checkNotNull(inflate);
            return inflate;
        }
        return new View(requireContext());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        WebViewDialogStateGuard.INSTANCE.stripFragmentViewState(outState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        WebViewDialogStateGuard.INSTANCE.destroy(this.webView);
        this.webView = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        if (this.restoreFailed) {
            dismissAllowingStateLoss();
            return;
        }
        List<Fragment> fragments = getParentFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        List<Fragment> list = fragments;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Fragment fragment : list) {
                if ((fragment instanceof PresentationWebViewDialogFragment) && fragment != this && ((PresentationWebViewDialogFragment) fragment).isAdded()) {
                    dismissAllowingStateLoss();
                    return;
                }
            }
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.0f);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.restoreFailed && this.callbackKey.length() > 0) {
            PresentationBridgeCallbackRegistry.INSTANCE.remove(this.callbackKey);
        }
        PresentationOverlayGate.onPresentationDismissed();
        super.onDismiss(dialog);
    }

    /* compiled from: PresentationWebViewDialogFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/ui/dialogs/presentation/PresentationWebViewDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_CALLBACK_KEY", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/presentation/PresentationWebViewDialogFragment;", "campaign", "Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "handler", "Lorg/betup/ui/dialogs/presentation/bridge/PresentationWebViewBridgeHandler;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PresentationWebViewDialogFragment newInstance(PresentationCampaignDto campaign, PresentationWebViewBridgeHandler handler) {
            Intrinsics.checkNotNullParameter(campaign, "campaign");
            Intrinsics.checkNotNullParameter(handler, "handler");
            String put = PresentationBridgeCallbackRegistry.INSTANCE.put(campaign, handler);
            PresentationWebViewDialogFragment presentationWebViewDialogFragment = new PresentationWebViewDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(PresentationWebViewDialogFragment.ARG_CALLBACK_KEY, put);
            presentationWebViewDialogFragment.setArguments(bundle);
            return presentationWebViewDialogFragment;
        }
    }
}
