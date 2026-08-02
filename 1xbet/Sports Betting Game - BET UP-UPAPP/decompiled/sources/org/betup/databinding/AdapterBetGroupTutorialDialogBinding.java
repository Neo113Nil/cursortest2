package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class AdapterBetGroupTutorialDialogBinding implements ViewBinding {
    public final ImageView closeBtn;
    public final ConstraintLayout containerCl;
    public final LinearLayout contentLl;
    public final ConstraintLayout dialogContainerCl;
    public final LinearLayout headerCl;
    public final ConstraintLayout innerContainerCl;
    public final TextView pageTv;
    private final ConstraintLayout rootView;
    public final TextView titleTv;

    private AdapterBetGroupTutorialDialogBinding(ConstraintLayout rootView, ImageView closeBtn, ConstraintLayout containerCl, LinearLayout contentLl, ConstraintLayout dialogContainerCl, LinearLayout headerCl, ConstraintLayout innerContainerCl, TextView pageTv, TextView titleTv) {
        this.rootView = rootView;
        this.closeBtn = closeBtn;
        this.containerCl = containerCl;
        this.contentLl = contentLl;
        this.dialogContainerCl = dialogContainerCl;
        this.headerCl = headerCl;
        this.innerContainerCl = innerContainerCl;
        this.pageTv = pageTv;
        this.titleTv = titleTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterBetGroupTutorialDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AdapterBetGroupTutorialDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.adapter_bet_group_tutorial_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterBetGroupTutorialDialogBinding bind(View rootView) {
        int i = R.id.close_btn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close_btn);
        if (imageView != null) {
            i = R.id.container_cl;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container_cl);
            if (constraintLayout != null) {
                i = R.id.content_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.content_ll);
                if (linearLayout != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) rootView;
                    i = R.id.header_cl;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.header_cl);
                    if (linearLayout2 != null) {
                        i = R.id.inner_container_cl;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.inner_container_cl);
                        if (constraintLayout3 != null) {
                            i = R.id.page_tv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.page_tv);
                            if (textView != null) {
                                i = R.id.title_tv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                                if (textView2 != null) {
                                    return new AdapterBetGroupTutorialDialogBinding(constraintLayout2, imageView, constraintLayout, linearLayout, constraintLayout2, linearLayout2, constraintLayout3, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
