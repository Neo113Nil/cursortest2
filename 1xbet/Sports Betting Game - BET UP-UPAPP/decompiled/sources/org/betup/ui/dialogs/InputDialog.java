package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;

/* loaded from: classes2.dex */
public class InputDialog extends BaseDialog {
    private Builder builder;

    @BindView(R.id.secondButton)
    View cancel;

    @BindView(R.id.code)
    EditText code;

    @BindView(R.id.desc)
    TextView desc;

    @BindView(R.id.ok)
    View ok;

    @BindView(R.id.subtitle)
    TextView title;

    public interface InputListener {
        void canceled();

        void textEntered(InputDialog dialog, String str);
    }

    public InputDialog(Context context, Builder builder) {
        super(R.layout.dialog_invite_code, context);
        this.builder = builder;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.title.setText(this.builder.title);
        this.desc.setText(this.builder.desc);
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        this.builder.inputListener.textEntered(this, this.code.getText().toString());
    }

    @OnClick({R.id.secondButton})
    public void onCancelClick() {
        dismiss();
        this.builder.inputListener.canceled();
    }

    public static class Builder {
        private Context context;
        private String desc;
        private InputListener inputListener;
        private String title;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setInputListener(InputListener inputListener) {
            this.inputListener = inputListener;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public InputDialog build() {
            return new InputDialog(this.context, this);
        }
    }
}
