package org.betup.ui.fragment.bets.betslip.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import org.betup.R;
import org.betup.ui.fragment.home.dialog.BaseDialog;

/* loaded from: classes4.dex */
public class ExperienceDialog extends BaseDialog {
    private int exp;

    @BindView(R.id.msg)
    TextView msg;
    private OnExperienceDialogClosed onExperienceDialogClosed;

    public interface OnExperienceDialogClosed {
        void onClose();
    }

    public ExperienceDialog(Context context, int exp, OnExperienceDialogClosed onExperienceDialogClosed) {
        super(context);
        this.exp = exp;
        this.onExperienceDialogClosed = onExperienceDialogClosed;
    }

    @Override // org.betup.ui.fragment.home.dialog.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_experience);
        resizeDialog();
        ButterKnife.bind(this);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.betup.ui.fragment.bets.betslip.dialog.ExperienceDialog.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialog) {
                ExperienceDialog.this.onExperienceDialogClosed.onClose();
            }
        });
        this.msg.setText(Html.fromHtml(String.format(getContext().getString(R.string.experience_msg), Integer.valueOf(this.exp))));
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        dismiss();
    }
}
