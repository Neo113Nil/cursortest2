package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import org.betup.R;

/* loaded from: classes2.dex */
public final class MatchShareListButtonBinding implements ViewBinding {
    private final ImageView rootView;
    public final ImageView shareMatchRowButton;

    private MatchShareListButtonBinding(ImageView rootView, ImageView shareMatchRowButton) {
        this.rootView = rootView;
        this.shareMatchRowButton = shareMatchRowButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageView getRoot() {
        return this.rootView;
    }

    public static MatchShareListButtonBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MatchShareListButtonBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.match_share_list_button, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MatchShareListButtonBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) rootView;
        return new MatchShareListButtonBinding(imageView, imageView);
    }
}
