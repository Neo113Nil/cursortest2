package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentInterstitialWebviewBinding implements ViewBinding {
    public final Button interstitialSkipButton;
    public final WebView interstitialWebView;
    private final FrameLayout rootView;

    private FragmentInterstitialWebviewBinding(FrameLayout rootView, Button interstitialSkipButton, WebView interstitialWebView) {
        this.rootView = rootView;
        this.interstitialSkipButton = interstitialSkipButton;
        this.interstitialWebView = interstitialWebView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInterstitialWebviewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentInterstitialWebviewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_interstitial_webview, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentInterstitialWebviewBinding bind(View rootView) {
        int i = R.id.interstitialSkipButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.interstitialSkipButton);
        if (button != null) {
            i = R.id.interstitialWebView;
            WebView webView = (WebView) ViewBindings.findChildViewById(rootView, R.id.interstitialWebView);
            if (webView != null) {
                return new FragmentInterstitialWebviewBinding((FrameLayout) rootView, button, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
