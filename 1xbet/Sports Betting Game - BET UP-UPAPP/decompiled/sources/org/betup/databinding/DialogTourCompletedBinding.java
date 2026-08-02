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
import org.betup.ui.controls.ArcTextView;
import org.betup.ui.controls.SpriteImageButton;
import org.betup.ui.views.AlphaPressButton;

/* loaded from: classes2.dex */
public final class DialogTourCompletedBinding implements ViewBinding {
    public final AlphaPressButton close;
    public final TextView desc;
    public final ConstraintLayout dialogContainer;
    public final ImageView imageView;
    public final ArcTextView label;
    public final SpriteImageButton ok;
    private final ConstraintLayout rootView;

    private DialogTourCompletedBinding(ConstraintLayout rootView, AlphaPressButton close, TextView desc, ConstraintLayout dialogContainer, ImageView imageView, ArcTextView label, SpriteImageButton ok) {
        this.rootView = rootView;
        this.close = close;
        this.desc = desc;
        this.dialogContainer = dialogContainer;
        this.imageView = imageView;
        this.label = label;
        this.ok = ok;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogTourCompletedBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogTourCompletedBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_tour_completed, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogTourCompletedBinding bind(View rootView) {
        int i = R.id.close;
        AlphaPressButton alphaPressButton = (AlphaPressButton) ViewBindings.findChildViewById(rootView, R.id.close);
        if (alphaPressButton != null) {
            i = R.id.desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.desc);
            if (textView != null) {
                i = R.id.dialog_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dialog_container);
                if (constraintLayout != null) {
                    i = R.id.imageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                    if (imageView != null) {
                        i = R.id.label;
                        ArcTextView arcTextView = (ArcTextView) ViewBindings.findChildViewById(rootView, R.id.label);
                        if (arcTextView != null) {
                            i = R.id.ok;
                            SpriteImageButton spriteImageButton = (SpriteImageButton) ViewBindings.findChildViewById(rootView, R.id.ok);
                            if (spriteImageButton != null) {
                                return new DialogTourCompletedBinding((ConstraintLayout) rootView, alphaPressButton, textView, constraintLayout, imageView, arcTextView, spriteImageButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
