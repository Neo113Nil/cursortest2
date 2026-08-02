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
public class OneTimeOfferAcceptedDialog extends BaseDialog {

    @BindView(R.id.desc)
    TextView desc;

    public OneTimeOfferAcceptedDialog(Context context) {
        super(R.layout.dialog_one_time_offer_accepted, context);
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.desc.setText(Html.fromHtml(getContext().getString(R.string.enjoy_purchase)));
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }
}
