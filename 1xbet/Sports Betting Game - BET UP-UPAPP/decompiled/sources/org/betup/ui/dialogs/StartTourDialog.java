package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import org.betup.R;

/* loaded from: classes2.dex */
public class StartTourDialog extends BaseBlurredDialog {
    private boolean accepted;

    @BindView(R.id.desc)
    TextView desc;
    private StartTourDialogListener listener;

    public interface StartTourDialogListener {
        void onSkip();

        void onStart();
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog
    protected int getLayoutId() {
        return R.layout.dialog_tour;
    }

    public StartTourDialog(Context context, StartTourDialogListener listener) {
        super(context);
        this.accepted = false;
        this.listener = listener;
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.desc.setText(Html.fromHtml(getContext().getString(R.string.start_tour_dec)));
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        StartTourDialogListener startTourDialogListener = this.listener;
        if (startTourDialogListener == null || this.accepted) {
            return;
        }
        startTourDialogListener.onSkip();
    }

    @OnClick({R.id.ok})
    public void onOkClick() {
        this.accepted = true;
        Log.d("TOURTEST", "ON START");
        dismiss();
        StartTourDialogListener startTourDialogListener = this.listener;
        if (startTourDialogListener != null) {
            startTourDialogListener.onStart();
        }
    }

    @OnClick({R.id.close})
    public void onCloseButtonClick() {
        dismiss();
    }

    public static StartTourDialog showDialog(Context context, StartTourDialogListener listener) {
        StartTourDialog startTourDialog = new StartTourDialog(context, listener);
        startTourDialog.show();
        return startTourDialog;
    }
}
