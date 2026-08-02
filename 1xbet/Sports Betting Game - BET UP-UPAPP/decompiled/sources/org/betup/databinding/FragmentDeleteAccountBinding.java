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
import org.betup.R;

/* loaded from: classes2.dex */
public final class FragmentDeleteAccountBinding implements ViewBinding {
    public final Button cancelRequest;
    public final TextView confirmHint;
    public final ConstraintLayout container;
    public final TextView emailHint;
    public final EditText from;
    public final EditText message;
    public final TextView msgHint;
    private final ConstraintLayout rootView;
    public final Button send;
    public final LinearLayout sent;

    private FragmentDeleteAccountBinding(ConstraintLayout rootView, Button cancelRequest, TextView confirmHint, ConstraintLayout container, TextView emailHint, EditText from, EditText message, TextView msgHint, Button send, LinearLayout sent) {
        this.rootView = rootView;
        this.cancelRequest = cancelRequest;
        this.confirmHint = confirmHint;
        this.container = container;
        this.emailHint = emailHint;
        this.from = from;
        this.message = message;
        this.msgHint = msgHint;
        this.send = send;
        this.sent = sent;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDeleteAccountBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentDeleteAccountBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_delete_account, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentDeleteAccountBinding bind(View rootView) {
        int i = R.id.cancelRequest;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.cancelRequest);
        if (button != null) {
            i = R.id.confirmHint;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirmHint);
            if (textView != null) {
                i = R.id.container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (constraintLayout != null) {
                    i = R.id.emailHint;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.emailHint);
                    if (textView2 != null) {
                        i = R.id.from;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.from);
                        if (editText != null) {
                            i = R.id.message;
                            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.message);
                            if (editText2 != null) {
                                i = R.id.msgHint;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.msgHint);
                                if (textView3 != null) {
                                    i = R.id.send;
                                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.send);
                                    if (button2 != null) {
                                        i = R.id.sent;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sent);
                                        if (linearLayout != null) {
                                            return new FragmentDeleteAccountBinding((ConstraintLayout) rootView, button, textView, constraintLayout, textView2, editText, editText2, textView3, button2, linearLayout);
                                        }
                                    }
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
