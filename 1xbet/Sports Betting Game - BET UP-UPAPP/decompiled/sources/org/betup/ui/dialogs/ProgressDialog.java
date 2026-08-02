package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import org.betup.R;

/* loaded from: classes2.dex */
public class ProgressDialog extends Dialog implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public ProgressDialog(Context context) {
        super(context);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(R.layout.progress_dialog);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -1);
        }
    }

    public static ProgressDialog showDialog(Context context) {
        Log.d("SHARE_OFFER", "SHOWING PROGRESS DIALOG");
        ProgressDialog progressDialog = new ProgressDialog(context);
        if (progressDialog.getWindow() != null) {
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        progressDialog.setCancelable(false);
        progressDialog.show();
        return progressDialog;
    }
}
