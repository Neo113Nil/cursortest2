package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogSpecialOfferBinding implements ViewBinding {
    public final RelativeLayout container;
    public final RoundedImageView icon;
    public final ProgressBar progress;
    private final RelativeLayout rootView;

    private DialogSpecialOfferBinding(RelativeLayout rootView, RelativeLayout container, RoundedImageView icon, ProgressBar progress) {
        this.rootView = rootView;
        this.container = container;
        this.icon = icon;
        this.progress = progress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogSpecialOfferBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogSpecialOfferBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_special_offer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSpecialOfferBinding bind(View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i = R.id.icon;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
        if (roundedImageView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (progressBar != null) {
                return new DialogSpecialOfferBinding(relativeLayout, relativeLayout, roundedImageView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
