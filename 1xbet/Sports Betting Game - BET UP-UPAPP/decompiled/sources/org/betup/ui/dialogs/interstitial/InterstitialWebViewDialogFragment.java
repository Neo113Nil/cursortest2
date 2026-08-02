package org.betup.ui.dialogs.interstitial;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.interstitial.InterstitialCampaignDto;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialBridgeContext;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialDismissPolicy;
import org.betup.ui.dialogs.interstitial.bridge.InterstitialWebViewBridgeHandler;
import org.betup.utils.ImmersiveOverlayGate;
import org.betup.utils.WebViewDialogStateGuard;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: InterstitialWebViewDialogFragment.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010&\u001a\u00020\u001bH\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u001bH\u0016J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\nH\u0016J\b\u0010.\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u00060"}, d2 = {"Lorg/betup/ui/dialogs/interstitial/InterstitialWebViewDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/ui/dialogs/interstitial/InterstitialBackHandler;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "callbackKey", "", "bridgeContext", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialBridgeContext;", "restoreFailed", "", "webView", "Landroid/webkit/WebView;", "clicked", "campaign", "Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "getCampaign", "()Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "bridgeHandler", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "getBridgeHandler", "()Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialWebViewBridgeHandler;", "dismissPolicy", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", "getDismissPolicy", "()Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialDismissPolicy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onSaveInstanceState", "outState", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "handleHardwareBack", "notifyHtmlDismissState", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterstitialWebViewDialogFragment extends DialogFragment implements InterstitialBackHandler {
    private static final String ARG_CALLBACK_KEY = "arg_callback_key";
    public static final String TAG = "InterstitialWebViewDialog";
    private InterstitialBridgeContext bridgeContext;
    private String callbackKey = "";
    private boolean clicked;
    private boolean restoreFailed;
    private WebView webView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private final InterstitialCampaignDto getCampaign() {
        InterstitialBridgeContext interstitialBridgeContext = this.bridgeContext;
        if (interstitialBridgeContext != null) {
            return interstitialBridgeContext.getCampaign();
        }
        return null;
    }

    private final InterstitialWebViewBridgeHandler getBridgeHandler() {
        InterstitialBridgeContext interstitialBridgeContext = this.bridgeContext;
        if (interstitialBridgeContext != null) {
            return interstitialBridgeContext.getHandler();
        }
        return null;
    }

    private final InterstitialDismissPolicy getDismissPolicy() {
        InterstitialBridgeContext interstitialBridgeContext = this.bridgeContext;
        if (interstitialBridgeContext != null) {
            return interstitialBridgeContext.getDismissPolicy();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
        String string = requireArguments().getString(ARG_CALLBACK_KEY);
        if (string == null) {
            string = "";
        }
        this.callbackKey = string;
        InterstitialBridgeContext peek = InterstitialBridgeCallbackRegistry.INSTANCE.peek(this.callbackKey);
        this.bridgeContext = peek;
        if (peek == null) {
            Log.w(TAG, "Interstitial context unavailable (process death or stale restore); dismissing");
            this.restoreFailed = true;
            ImmersiveOverlayGate.onImmersiveDismissed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.restoreFailed) {
            return new View(requireContext());
        }
        InterstitialBridgeContext interstitialBridgeContext = this.bridgeContext;
        if (interstitialBridgeContext == null) {
            return new View(requireContext());
        }
        View inflate = inflater.inflate(R.layout.fragment_interstitial_webview, container, false);
        WebView webView = (WebView) inflate.findViewById(R.id.interstitialWebView);
        this.webView = webView;
        Button button = (Button) inflate.findViewById(R.id.interstitialSkipButton);
        Intrinsics.checkNotNull(webView);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        InterstitialWebViewDialogFragmentKt.configureWebView(webView, requireContext, interstitialBridgeContext.getCampaign(), interstitialBridgeContext.getHandler(), interstitialBridgeContext.getDismissPolicy(), new Function0() { // from class: org.betup.ui.dialogs.interstitial.InterstitialWebViewDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onCreateView$lambda$0;
                onCreateView$lambda$0 = InterstitialWebViewDialogFragment.onCreateView$lambda$0(InterstitialWebViewDialogFragment.this);
                return onCreateView$lambda$0;
            }
        });
        Intrinsics.checkNotNull(button);
        InterstitialWebViewDialogFragmentKt.configureNativeSkipButton(button);
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$0(InterstitialWebViewDialogFragment interstitialWebViewDialogFragment) {
        interstitialWebViewDialogFragment.clicked = true;
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new OnBackPressedCallback() { // from class: org.betup.ui.dialogs.interstitial.InterstitialWebViewDialogFragment$onViewCreated$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                InterstitialWebViewDialogFragment.this.handleHardwareBack();
            }
        });
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
                if ((fragment instanceof InterstitialWebViewDialogFragment) && fragment != this && ((InterstitialWebViewDialogFragment) fragment).isAdded()) {
                    dismissAllowingStateLoss();
                    return;
                }
            }
        }
        InterstitialWebViewBridgeHandler bridgeHandler = getBridgeHandler();
        if (bridgeHandler != null) {
            bridgeHandler.onPresentationStarted();
        }
        InterstitialDismissPolicy dismissPolicy = getDismissPolicy();
        if (dismissPolicy != null) {
            dismissPolicy.setOnDismissReadyListener(new Function0() { // from class: org.betup.ui.dialogs.interstitial.InterstitialWebViewDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit onStart$lambda$2;
                    onStart$lambda$2 = InterstitialWebViewDialogFragment.onStart$lambda$2(InterstitialWebViewDialogFragment.this);
                    return onStart$lambda$2;
                }
            });
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: org.betup.ui.dialogs.interstitial.InterstitialWebViewDialogFragment$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    boolean onStart$lambda$3;
                    onStart$lambda$3 = InterstitialWebViewDialogFragment.onStart$lambda$3(InterstitialWebViewDialogFragment.this, dialogInterface, i, keyEvent);
                    return onStart$lambda$3;
                }
            });
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(-16777216));
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(InterstitialWebViewDialogFragment interstitialWebViewDialogFragment) {
        interstitialWebViewDialogFragment.notifyHtmlDismissState();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onStart$lambda$3(InterstitialWebViewDialogFragment interstitialWebViewDialogFragment, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            return interstitialWebViewDialogFragment.handleHardwareBack();
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        WebViewDialogStateGuard.INSTANCE.stripFragmentViewState(outState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterstitialDismissPolicy dismissPolicy = getDismissPolicy();
        if (dismissPolicy != null) {
            dismissPolicy.cancel();
        }
        InterstitialDismissPolicy dismissPolicy2 = getDismissPolicy();
        if (dismissPolicy2 != null) {
            dismissPolicy2.setOnDismissReadyListener(null);
        }
        WebViewDialogStateGuard.INSTANCE.destroy(this.webView);
        this.webView = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.restoreFailed && this.callbackKey.length() > 0) {
            InterstitialBridgeCallbackRegistry.INSTANCE.remove(this.callbackKey);
        }
        ImmersiveOverlayGate.onImmersiveDismissed();
        super.onDismiss(dialog);
    }

    @Override // org.betup.ui.dialogs.interstitial.InterstitialBackHandler
    public boolean handleHardwareBack() {
        InterstitialWebViewBridgeHandler bridgeHandler = getBridgeHandler();
        if (bridgeHandler != null && bridgeHandler.canSkip()) {
            bridgeHandler.onSkip();
        }
        return true;
    }

    private final void notifyHtmlDismissState() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript("window.dispatchEvent(new Event('interstitial:dismiss-ready'));", null);
        }
    }

    /* compiled from: InterstitialWebViewDialogFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/dialogs/interstitial/InterstitialWebViewDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_CALLBACK_KEY", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/interstitial/InterstitialWebViewDialogFragment;", "context", "Lorg/betup/ui/dialogs/interstitial/bridge/InterstitialBridgeContext;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InterstitialWebViewDialogFragment newInstance(InterstitialBridgeContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String put = InterstitialBridgeCallbackRegistry.INSTANCE.put(context);
            InterstitialWebViewDialogFragment interstitialWebViewDialogFragment = new InterstitialWebViewDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(InterstitialWebViewDialogFragment.ARG_CALLBACK_KEY, put);
            interstitialWebViewDialogFragment.setArguments(bundle);
            return interstitialWebViewDialogFragment;
        }
    }
}
