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
public class TestPreventionDialog extends BaseDialog {

    @BindView(R.id.desc)
    TextView desc;

    public TestPreventionDialog(Context context) {
        super(R.layout.dialog_test_prevent, context);
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        this.desc.setText(Html.fromHtml(getContext().getString(R.string.test_prevent)));
    }

    public static TestPreventionDialog showDialog(Context context) {
        TestPreventionDialog testPreventionDialog = new TestPreventionDialog(context);
        testPreventionDialog.show();
        return testPreventionDialog;
    }
}
