package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.siyamed.shapeimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemSlideBinding implements ViewBinding {
    public final RelativeLayout container;
    public final RoundedImageView img;
    private final RelativeLayout rootView;
    public final TextView time;

    private ItemSlideBinding(RelativeLayout rootView, RelativeLayout container, RoundedImageView img, TextView time) {
        this.rootView = rootView;
        this.container = container;
        this.img = img;
        this.time = time;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemSlideBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSlideBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_slide, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSlideBinding bind(View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i = R.id.img;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.img);
        if (roundedImageView != null) {
            i = R.id.time;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.time);
            if (textView != null) {
                return new ItemSlideBinding(relativeLayout, relativeLayout, roundedImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
