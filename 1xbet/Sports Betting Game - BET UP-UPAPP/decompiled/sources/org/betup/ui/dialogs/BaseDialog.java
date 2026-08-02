package org.betup.ui.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public class BaseDialog extends Dialog {
    private static final String TAG = "BaseDialog";
    protected Context context;
    protected int layout;
    protected String title;

    public BaseDialog(Context context) {
        super(context);
        this.context = context;
    }

    public BaseDialog(int layout, Context context) {
        super(context);
        this.layout = layout;
        this.context = context;
    }

    public BaseDialog(String title, int layout, Context context) {
        super(context);
        this.title = title;
        this.layout = layout;
        this.context = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(this.layout);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public void show() {
        Context context = this.context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                Log.w(TAG, "Skip show(): activity is not active");
                return;
            }
        }
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            super.show();
        } catch (WindowManager.BadTokenException e) {
            Log.w(TAG, "Skip show(): invalid window token", e);
        }
    }
}
