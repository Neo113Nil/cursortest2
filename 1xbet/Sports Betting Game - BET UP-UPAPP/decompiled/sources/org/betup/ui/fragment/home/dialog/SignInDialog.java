package org.betup.ui.fragment.home.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;

/* loaded from: classes4.dex */
public class SignInDialog extends BaseDialog {

    @BindView(R.id.email)
    EditText emailEditText;
    private OnCredentialsEnteredListener listener;

    @BindView(R.id.password)
    EditText passEditText;
    private boolean regButton;

    @BindView(R.id.registerButton)
    Button registerButton;

    @BindView(R.id.resetPass)
    TextView resetPass;

    public interface OnCredentialsEnteredListener {
        void onCredentialsEntered(String email, String password);

        void onNewAccountClicked();

        boolean resetPassClick(String email);
    }

    public SignInDialog(Context context, OnCredentialsEnteredListener listener, boolean regButton) {
        super(context);
        this.listener = listener;
        this.regButton = regButton;
    }

    @Override // org.betup.ui.fragment.home.dialog.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(R.layout.dialog_sign_in);
        resizeDialog();
        ButterKnife.bind(this);
        if (!this.regButton) {
            this.registerButton.setVisibility(8);
        }
        TextView textView = this.resetPass;
        textView.setPaintFlags(8 | textView.getPaintFlags());
    }

    @OnClick({R.id.cancelButton})
    public void cancelClick() {
        dismiss();
    }

    @OnClick({R.id.registerButton})
    public void regClick() {
        dismiss();
        this.listener.onNewAccountClicked();
    }

    @OnClick({R.id.resetPass})
    public void resetPassClick() {
        this.listener.resetPassClick(this.emailEditText.getText().toString().trim());
    }

    @OnClick({R.id.signInButton})
    public void signInClick() {
        this.listener.onCredentialsEntered(this.emailEditText.getText().toString().trim(), this.passEditText.getText().toString());
    }
}
