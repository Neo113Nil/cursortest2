package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class MediumButtonMinigamesBinding implements ViewBinding {
    public final TextView btnTitleTv;
    public final ImageView iconIv;
    private final ConstraintLayout rootView;

    private MediumButtonMinigamesBinding(ConstraintLayout rootView, TextView btnTitleTv, ImageView iconIv) {
        this.rootView = rootView;
        this.btnTitleTv = btnTitleTv;
        this.iconIv = iconIv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MediumButtonMinigamesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MediumButtonMinigamesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.medium_button_minigames, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MediumButtonMinigamesBinding bind(View rootView) {
        int i = R.id.btn_title_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.btn_title_tv);
        if (textView != null) {
            i = R.id.icon_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_iv);
            if (imageView != null) {
                return new MediumButtonMinigamesBinding((ConstraintLayout) rootView, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
