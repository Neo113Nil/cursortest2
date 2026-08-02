package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemMessageChainBinding implements ViewBinding {
    public final RoundedImageView avatarIcon;
    public final ImageView isRead;
    public final TextView message;
    public final TextView name;
    private final ConstraintLayout rootView;

    private ItemMessageChainBinding(ConstraintLayout rootView, RoundedImageView avatarIcon, ImageView isRead, TextView message, TextView name) {
        this.rootView = rootView;
        this.avatarIcon = avatarIcon;
        this.isRead = isRead;
        this.message = message;
        this.name = name;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemMessageChainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMessageChainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_message_chain, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMessageChainBinding bind(View rootView) {
        int i = R.id.avatarIcon;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(rootView, R.id.avatarIcon);
        if (roundedImageView != null) {
            i = R.id.isRead;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.isRead);
            if (imageView != null) {
                i = R.id.message;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.message);
                if (textView != null) {
                    i = R.id.name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                    if (textView2 != null) {
                        return new ItemMessageChainBinding((ConstraintLayout) rootView, roundedImageView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
