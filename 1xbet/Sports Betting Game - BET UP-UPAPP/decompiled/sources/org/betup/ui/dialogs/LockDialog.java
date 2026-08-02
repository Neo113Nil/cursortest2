package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import org.betup.R;

/* loaded from: classes2.dex */
public class LockDialog extends BaseDialog {
    private Builder builder;

    @BindView(R.id.desc)
    TextView desc;

    @BindView(R.id.notice)
    TextView notice;

    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.unlock_price)
    TextView unlockPrice;

    @BindView(R.id.unlock_text)
    TextView unlockText;

    public LockDialog(Context context, Builder builder) {
        super(R.layout.dialog_green_lock, context);
        this.builder = builder;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.title.setText(this.builder.title);
        this.desc.setText(Html.fromHtml(this.builder.desc));
        this.notice.setText(this.builder.notice);
        this.unlockPrice.setText(this.builder.price);
        this.unlockText.setText(this.builder.buttonText);
    }

    public static class Builder {
        private String buttonText;
        private Context context;
        private String desc;
        private String notice;
        private String price;
        private String title;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setNotice(String notice) {
            this.notice = notice;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder setButtonText(String buttonText) {
            this.buttonText = buttonText;
            return this;
        }

        public LockDialog build() {
            return new LockDialog(this.context, this);
        }
    }
}
