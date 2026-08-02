package org.betup.ui.dialogs;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.appinvite.PreviewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.services.billing.BillingService;
import org.betup.ui.dialogs.BonusOfferWebViewFragment;
import org.betup.utils.WebViewDialogStateGuard;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: BonusOfferWebViewFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0017J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/dialogs/BonusOfferWebViewFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "webView", "Landroid/webkit/WebView;", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onDestroyView", "onStart", "AndroidBridge", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BonusOfferWebViewFragment extends DialogFragment {
    public static final String TAG = "BonusOfferWebViewFragment";

    @Inject
    public BillingService billingService;
    private WebView webView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final BillingService getBillingService() {
        BillingService billingService = this.billingService;
        if (billingService != null) {
            return billingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("billingService");
        return null;
    }

    public final void setBillingService(BillingService billingService) {
        Intrinsics.checkNotNullParameter(billingService, "<set-?>");
        this.billingService = billingService;
    }

    /* compiled from: BonusOfferWebViewFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/BonusOfferWebViewFragment$AndroidBridge;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/BonusOfferWebViewFragment;)V", PreviewActivity.ON_CLICK_LISTENER_CLOSE, "", FirebaseAnalytics.Event.PURCHASE, "productId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AndroidBridge {
        public AndroidBridge() {
        }

        @JavascriptInterface
        public final void close() {
            FragmentActivity requireActivity = BonusOfferWebViewFragment.this.requireActivity();
            final BonusOfferWebViewFragment bonusOfferWebViewFragment = BonusOfferWebViewFragment.this;
            requireActivity.runOnUiThread(new Runnable() { // from class: org.betup.ui.dialogs.BonusOfferWebViewFragment$AndroidBridge$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BonusOfferWebViewFragment.this.dismissAllowingStateLoss();
                }
            });
        }

        @JavascriptInterface
        public final void purchase(final String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            FragmentActivity requireActivity = BonusOfferWebViewFragment.this.requireActivity();
            final BonusOfferWebViewFragment bonusOfferWebViewFragment = BonusOfferWebViewFragment.this;
            requireActivity.runOnUiThread(new Runnable() { // from class: org.betup.ui.dialogs.BonusOfferWebViewFragment$AndroidBridge$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BonusOfferWebViewFragment.AndroidBridge.purchase$lambda$1(BonusOfferWebViewFragment.this, productId);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void purchase$lambda$1(final BonusOfferWebViewFragment bonusOfferWebViewFragment, String str) {
            bonusOfferWebViewFragment.getBillingService().purchaseItem(bonusOfferWebViewFragment.requireActivity(), str, new BillingService.PurchaseListener() { // from class: org.betup.ui.dialogs.BonusOfferWebViewFragment$AndroidBridge$purchase$1$1
                @Override // org.betup.services.billing.BillingService.PurchaseListener
                public void purchaseCompleted() {
                    Log.d(BonusOfferWebViewFragment.TAG, "Purchase completed");
                    BonusOfferWebViewFragment.this.dismissAllowingStateLoss();
                }

                @Override // org.betup.services.billing.BillingService.PurchaseListener
                public void purchaseFailed(BillingService.BillingError error) {
                    Log.w(BonusOfferWebViewFragment.TAG, "Purchase failed: " + error);
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.Theme.Translucent.NoTitleBar.Fullscreen);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        WebView webView = new WebView(requireContext());
        WebViewDialogStateGuard.INSTANCE.applyStateless(webView);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webView.setBackgroundColor(0);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        webView.addJavascriptInterface(new AndroidBridge(), "Android");
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("file:///android_asset/offer.html");
        this.webView = webView;
        frameLayout.addView(webView);
        return frameLayout;
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
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawableResource(R.color.transparent);
        window.clearFlags(2);
    }

    /* compiled from: BonusOfferWebViewFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lorg/betup/ui/dialogs/BonusOfferWebViewFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/BonusOfferWebViewFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BonusOfferWebViewFragment newInstance() {
            return new BonusOfferWebViewFragment();
        }
    }
}
