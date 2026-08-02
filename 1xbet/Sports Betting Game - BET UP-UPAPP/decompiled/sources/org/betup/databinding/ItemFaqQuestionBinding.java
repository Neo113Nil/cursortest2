package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class ItemFaqQuestionBinding implements ViewBinding {
    public final ImageView arrow;
    public final TextView question;
    private final RelativeLayout rootView;

    private ItemFaqQuestionBinding(RelativeLayout rootView, ImageView arrow, TextView question) {
        this.rootView = rootView;
        this.arrow = arrow;
        this.question = question;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemFaqQuestionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemFaqQuestionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_faq_question, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemFaqQuestionBinding bind(View rootView) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arrow);
        if (imageView != null) {
            i = R.id.question;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.question);
            if (textView != null) {
                return new ItemFaqQuestionBinding((RelativeLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
