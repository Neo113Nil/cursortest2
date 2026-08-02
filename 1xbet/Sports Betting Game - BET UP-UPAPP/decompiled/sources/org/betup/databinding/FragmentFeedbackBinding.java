package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jaredrummler.materialspinner.MaterialSpinner;
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentFeedbackBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final EditText from;
    public final EditText message;
    public final TextView ok;
    private final ConstraintLayout rootView;
    public final Button send;
    public final LinearLayout sent;
    public final MaterialSpinner spinner;

    private FragmentFeedbackBinding(ConstraintLayout rootView, ConstraintLayout container, EditText from, EditText message, TextView ok, Button send, LinearLayout sent, MaterialSpinner spinner) {
        this.rootView = rootView;
        this.container = container;
        this.from = from;
        this.message = message;
        this.ok = ok;
        this.send = send;
        this.sent = sent;
        this.spinner = spinner;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFeedbackBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentFeedbackBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_feedback, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentFeedbackBinding bind(View rootView) {
        int i = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
        if (constraintLayout != null) {
            i = R.id.from;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.from);
            if (editText != null) {
                i = R.id.message;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.message);
                if (editText2 != null) {
                    i = R.id.ok;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ok);
                    if (textView != null) {
                        i = R.id.send;
                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.send);
                        if (button != null) {
                            i = R.id.sent;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sent);
                            if (linearLayout != null) {
                                i = R.id.spinner;
                                MaterialSpinner materialSpinner = (MaterialSpinner) ViewBindings.findChildViewById(rootView, R.id.spinner);
                                if (materialSpinner != null) {
                                    return new FragmentFeedbackBinding((ConstraintLayout) rootView, constraintLayout, editText, editText2, textView, button, linearLayout, materialSpinner);
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
