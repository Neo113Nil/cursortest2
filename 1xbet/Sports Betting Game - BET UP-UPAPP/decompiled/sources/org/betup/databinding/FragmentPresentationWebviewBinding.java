package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentPresentationWebviewBinding implements ViewBinding {
    public final WebView presentationWebView;
    private final FrameLayout rootView;

    private FragmentPresentationWebviewBinding(FrameLayout rootView, WebView presentationWebView) {
        this.rootView = rootView;
        this.presentationWebView = presentationWebView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPresentationWebviewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentPresentationWebviewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_presentation_webview, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPresentationWebviewBinding bind(View rootView) {
        WebView webView = (WebView) ViewBindings.findChildViewById(rootView, R.id.presentationWebView);
        if (webView != null) {
            return new FragmentPresentationWebviewBinding((FrameLayout) rootView, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.presentationWebView)));
    }
}
