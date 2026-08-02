package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogExperienceBinding implements ViewBinding {
    public final ImageView icon;
    public final TextView msg;
    public final Button ok;
    private final LinearLayout rootView;

    private DialogExperienceBinding(LinearLayout rootView, ImageView icon, TextView msg, Button ok) {
        this.rootView = rootView;
        this.icon = icon;
        this.msg = msg;
        this.ok = ok;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogExperienceBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogExperienceBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_experience, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogExperienceBinding bind(View rootView) {
        int i = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
        if (imageView != null) {
            i = R.id.msg;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.msg);
            if (textView != null) {
                i = R.id.ok;
                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.ok);
                if (button != null) {
                    return new DialogExperienceBinding((LinearLayout) rootView, imageView, textView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
