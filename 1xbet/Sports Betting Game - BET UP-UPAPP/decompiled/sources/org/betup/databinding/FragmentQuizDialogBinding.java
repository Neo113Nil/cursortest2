package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class FragmentQuizDialogBinding implements ViewBinding {
    public final AlphaPressButton closeBtn;
    public final FragmentContainerView containerFcv;
    public final ConstraintLayout contentCl;
    public final ConstraintLayout dialogQuizCl;
    public final ConstraintLayout dialogQuizOuterCl;
    public final ConstraintLayout headerCl;
    private final ConstraintLayout rootView;
    public final TextView subtitleTv;
    public final TextView titleTv;

    private FragmentQuizDialogBinding(ConstraintLayout rootView, AlphaPressButton closeBtn, FragmentContainerView containerFcv, ConstraintLayout contentCl, ConstraintLayout dialogQuizCl, ConstraintLayout dialogQuizOuterCl, ConstraintLayout headerCl, TextView subtitleTv, TextView titleTv) {
        this.rootView = rootView;
        this.closeBtn = closeBtn;
        this.containerFcv = containerFcv;
        this.contentCl = contentCl;
        this.dialogQuizCl = dialogQuizCl;
        this.dialogQuizOuterCl = dialogQuizOuterCl;
        this.headerCl = headerCl;
        this.subtitleTv = subtitleTv;
        this.titleTv = titleTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQuizDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentQuizDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_quiz_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentQuizDialogBinding bind(View rootView) {
        int i = R.id.close_btn;
        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close_btn);
        if (alphaPressButton != null) {
            i = R.id.container_fcv;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.container_fcv);
            if (fragmentContainerView != null) {
                i = R.id.content_cl;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.content_cl);
                if (constraintLayout != null) {
                    i = R.id.dialog_quiz_cl;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_quiz_cl);
                    if (constraintLayout2 != null) {
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) rootView;
                        i = R.id.header_cl;
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.header_cl);
                        if (constraintLayout4 != null) {
                            i = R.id.subtitle_tv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle_tv);
                            if (textView != null) {
                                i = R.id.title_tv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                                if (textView2 != null) {
                                    return new FragmentQuizDialogBinding(constraintLayout3, alphaPressButton, fragmentContainerView, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, textView, textView2);
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
