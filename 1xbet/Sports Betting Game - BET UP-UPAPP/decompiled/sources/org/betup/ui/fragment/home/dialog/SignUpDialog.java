package org.betup.ui.fragment.home.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;

/* loaded from: classes4.dex */
public class SignUpDialog extends BaseDialog {

    @BindView(R.id.email)
    EditText emailEditText;
    private OnRegDataEnteredListener listener;

    @BindView(R.id.name)
    EditText nameEditText;

    @BindView(R.id.password)
    EditText passEditText;

    @BindView(R.id.retypePass)
    EditText retypePassEditText;

    public interface OnRegDataEnteredListener {
        void onRegDataEntered(String nickname, String email, String password, String passwordConfirm);
    }

    public SignUpDialog(Context context, OnRegDataEnteredListener listener) {
        super(context);
        this.listener = listener;
    }

    @Override // org.betup.ui.fragment.home.dialog.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(R.layout.dialog_sign_up);
        resizeDialog();
        ButterKnife.bind(this);
    }

    @OnClick({R.id.cancelButton})
    public void cancelClick() {
        dismiss();
    }

    @OnClick({R.id.signInButton})
    public void signInClick() {
        this.listener.onRegDataEntered(this.nameEditText.getText().toString(), this.emailEditText.getText().toString(), this.passEditText.getText().toString(), this.retypePassEditText.getText().toString());
    }
}
