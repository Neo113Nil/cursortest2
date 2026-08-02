package org.betup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.betup.R;

/* loaded from: classes2.dex */
public final class DialogSignInBinding implements ViewBinding {
    public final Button cancelButton;
    public final EditText email;
    public final EditText password;
    public final Button registerButton;
    public final TextView resetPass;
    private final LinearLayout rootView;
    public final Button signInButton;

    private DialogSignInBinding(LinearLayout rootView, Button cancelButton, EditText email, EditText password, Button registerButton, TextView resetPass, Button signInButton) {
        this.rootView = rootView;
        this.cancelButton = cancelButton;
        this.email = email;
        this.password = password;
        this.registerButton = registerButton;
        this.resetPass = resetPass;
        this.signInButton = signInButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogSignInBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogSignInBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_sign_in, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSignInBinding bind(View rootView) {
        int i = R.id.cancelButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.cancelButton);
        if (button != null) {
            i = R.id.email;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.email);
            if (editText != null) {
                i = R.id.password;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.password);
                if (editText2 != null) {
                    i = R.id.registerButton;
                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.registerButton);
                    if (button2 != null) {
                        i = R.id.resetPass;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.resetPass);
                        if (textView != null) {
                            i = R.id.signInButton;
                            Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.signInButton);
                            if (button3 != null) {
                                return new DialogSignInBinding((LinearLayout) rootView, button, editText, editText2, button2, textView, button3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
