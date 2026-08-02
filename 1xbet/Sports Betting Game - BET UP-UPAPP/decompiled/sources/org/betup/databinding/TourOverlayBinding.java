package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class TourOverlayBinding implements ViewBinding {
    public final Group animatedGroup;
    public final ConstraintLayout container;
    public final ImageView helperImage;
    public final LinearLayout popupContainer;
    private final ConstraintLayout rootView;
    public final TextView text;
    public final View tip;
    public final TextView title;

    private TourOverlayBinding(ConstraintLayout rootView, Group animatedGroup, ConstraintLayout container, ImageView helperImage, LinearLayout popupContainer, TextView text, View tip, TextView title) {
        this.rootView = rootView;
        this.animatedGroup = animatedGroup;
        this.container = container;
        this.helperImage = helperImage;
        this.popupContainer = popupContainer;
        this.text = text;
        this.tip = tip;
        this.title = title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static TourOverlayBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static TourOverlayBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.tour_overlay, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static TourOverlayBinding bind(View rootView) {
        int i = R.id.animatedGroup;
        Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.animatedGroup);
        if (group != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i = R.id.helperImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.helperImage);
            if (imageView != null) {
                i = R.id.popupContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.popupContainer);
                if (linearLayout != null) {
                    i = R.id.text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text);
                    if (textView != null) {
                        i = R.id.tip;
                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.tip);
                        if (findChildViewById != null) {
                            i = R.id.title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                            if (textView2 != null) {
                                return new TourOverlayBinding(constraintLayout, group, constraintLayout, imageView, linearLayout, textView, findChildViewById, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
