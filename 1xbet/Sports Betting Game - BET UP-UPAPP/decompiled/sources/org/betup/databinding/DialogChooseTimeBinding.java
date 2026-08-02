package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogChooseTimeBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final Button timeCancelButton;
    public final Button timeOkButton;
    public final Spinner timeSpinner;

    private DialogChooseTimeBinding(LinearLayout rootView, Button timeCancelButton, Button timeOkButton, Spinner timeSpinner) {
        this.rootView = rootView;
        this.timeCancelButton = timeCancelButton;
        this.timeOkButton = timeOkButton;
        this.timeSpinner = timeSpinner;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogChooseTimeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogChooseTimeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_choose_time, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogChooseTimeBinding bind(View rootView) {
        int i = R.id.timeCancelButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.timeCancelButton);
        if (button != null) {
            i = R.id.timeOkButton;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.timeOkButton);
            if (button2 != null) {
                i = R.id.timeSpinner;
                Spinner spinner = (Spinner) ViewBindings.findChildViewById(rootView, R.id.timeSpinner);
                if (spinner != null) {
                    return new DialogChooseTimeBinding((LinearLayout) rootView, button, button2, spinner);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
