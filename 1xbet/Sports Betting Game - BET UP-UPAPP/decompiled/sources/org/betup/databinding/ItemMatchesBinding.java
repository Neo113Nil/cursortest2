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
public final class ItemMatchesBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final ImageView fav;
    public final ImageView liveMatcehsSportIcon;
    public final ImageView liveMatchesCircle;
    public final TextView matchCountTv;
    public final TextView name;
    public final TextView numberOfMatchesLive;
    private final ConstraintLayout rootView;

    private ItemMatchesBinding(ConstraintLayout rootView, ConstraintLayout container, ImageView fav, ImageView liveMatcehsSportIcon, ImageView liveMatchesCircle, TextView matchCountTv, TextView name, TextView numberOfMatchesLive) {
        this.rootView = rootView;
        this.container = container;
        this.fav = fav;
        this.liveMatcehsSportIcon = liveMatcehsSportIcon;
        this.liveMatchesCircle = liveMatchesCircle;
        this.matchCountTv = matchCountTv;
        this.name = name;
        this.numberOfMatchesLive = numberOfMatchesLive;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemMatchesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemMatchesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_matches, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMatchesBinding bind(View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.fav;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fav);
        if (imageView != null) {
            i = R.id.liveMatcehsSportIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.liveMatcehsSportIcon);
            if (imageView2 != null) {
                i = R.id.liveMatchesCircle;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.liveMatchesCircle);
                if (imageView3 != null) {
                    i = R.id.match_count_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.match_count_tv);
                    if (textView != null) {
                        i = R.id.name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                        if (textView2 != null) {
                            i = R.id.numberOfMatchesLive;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.numberOfMatchesLive);
                            if (textView3 != null) {
                                return new ItemMatchesBinding(constraintLayout, constraintLayout, imageView, imageView2, imageView3, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
