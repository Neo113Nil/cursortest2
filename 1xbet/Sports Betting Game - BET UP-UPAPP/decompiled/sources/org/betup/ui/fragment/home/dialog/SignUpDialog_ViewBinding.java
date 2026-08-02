package org.betup.ui.fragment.home.dialog;

import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import org.betup.R;

/* loaded from: classes4.dex */
public class SignUpDialog_ViewBinding implements Unbinder {
    private SignUpDialog target;
    private View view7f0a0176;
    private View view7f0a0695;

    public SignUpDialog_ViewBinding(SignUpDialog target) {
        this(target, target.getWindow().getDecorView());
    }

    public SignUpDialog_ViewBinding(final SignUpDialog target, View source) {
        this.target = target;
        target.nameEditText = (EditText) Utils.findRequiredViewAsType(source, R.id.name, "field 'nameEditText'", EditText.class);
        target.emailEditText = (EditText) Utils.findRequiredViewAsType(source, R.id.email, "field 'emailEditText'", EditText.class);
        target.passEditText = (EditText) Utils.findRequiredViewAsType(source, R.id.password, "field 'passEditText'", EditText.class);
        target.retypePassEditText = (EditText) Utils.findRequiredViewAsType(source, R.id.retypePass, "field 'retypePassEditText'", EditText.class);
        View findRequiredView = Utils.findRequiredView(source, R.id.cancelButton, "method 'cancelClick'");
        this.view7f0a0176 = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.home.dialog.SignUpDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.cancelClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(source, R.id.signInButton, "method 'signInClick'");
        this.view7f0a0695 = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.home.dialog.SignUpDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public void doClick(View p0) {
                target.signInClick();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SignUpDialog signUpDialog = this.target;
        if (signUpDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        signUpDialog.nameEditText = null;
        signUpDialog.emailEditText = null;
        signUpDialog.passEditText = null;
        signUpDialog.retypePassEditText = null;
        this.view7f0a0176.setOnClickListener(null);
        this.view7f0a0176 = null;
        this.view7f0a0695.setOnClickListener(null);
        this.view7f0a0695 = null;
    }
}
