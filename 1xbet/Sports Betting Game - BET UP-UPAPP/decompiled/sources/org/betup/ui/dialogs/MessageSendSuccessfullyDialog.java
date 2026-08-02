package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;

/* loaded from: classes2.dex */
public class MessageSendSuccessfullyDialog extends BaseDialog {

    @BindView(R.id.message_success_send)
    TextView message;

    public MessageSendSuccessfullyDialog(Context context) {
        super(R.layout.dialog_message_send_successfully, context);
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.message.setText(Html.fromHtml(getContext().getString(R.string.message_successful_send)));
    }

    @OnClick({R.id.ok})
    public void onClick() {
        dismiss();
    }
}
