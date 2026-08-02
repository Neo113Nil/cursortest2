package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentInterstitialVideoBinding implements ViewBinding {
    public final Button interstitialSkipButton;
    public final VideoView interstitialVideoView;
    private final FrameLayout rootView;

    private FragmentInterstitialVideoBinding(FrameLayout rootView, Button interstitialSkipButton, VideoView interstitialVideoView) {
        this.rootView = rootView;
        this.interstitialSkipButton = interstitialSkipButton;
        this.interstitialVideoView = interstitialVideoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInterstitialVideoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentInterstitialVideoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_interstitial_video, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentInterstitialVideoBinding bind(View rootView) {
        int i = R.id.interstitialSkipButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.interstitialSkipButton);
        if (button != null) {
            i = R.id.interstitialVideoView;
            VideoView videoView = (VideoView) ViewBindings.findChildViewById(rootView, R.id.interstitialVideoView);
            if (videoView != null) {
                return new FragmentInterstitialVideoBinding((FrameLayout) rootView, button, videoView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
