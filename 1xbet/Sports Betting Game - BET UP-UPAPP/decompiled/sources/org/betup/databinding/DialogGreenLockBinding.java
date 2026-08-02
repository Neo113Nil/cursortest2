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
public final class DialogGreenLockBinding implements ViewBinding {
    public final TextView desc;
    public final ImageView imageView6;
    public final TextView notice;
    private final ConstraintLayout rootView;
    public final TextView title;
    public final TextView unlockPrice;
    public final TextView unlockText;

    private DialogGreenLockBinding(ConstraintLayout rootView, TextView desc, ImageView imageView6, TextView notice, TextView title, TextView unlockPrice, TextView unlockText) {
        this.rootView = rootView;
        this.desc = desc;
        this.imageView6 = imageView6;
        this.notice = notice;
        this.title = title;
        this.unlockPrice = unlockPrice;
        this.unlockText = unlockText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogGreenLockBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogGreenLockBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_green_lock, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogGreenLockBinding bind(View rootView) {
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
        if (textView != null) {
            i = R.id.imageView6;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView6);
            if (imageView != null) {
                i = R.id.notice;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.notice);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                    if (textView3 != null) {
                        i = R.id.unlock_price;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.unlock_price);
                        if (textView4 != null) {
                            i = R.id.unlock_text;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.unlock_text);
                            if (textView5 != null) {
                                return new DialogGreenLockBinding((ConstraintLayout) rootView, textView, imageView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
