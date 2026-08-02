package org.betup.ui.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import butterknife.ButterKnife;
import org.betup.utils.DialogUtil;

/* loaded from: classes2.dex */
public abstract class BaseBlurredDialog extends Dialog implements DialogInterface.OnDismissListener {
    private BitmapDrawable background;

    protected abstract int getLayoutId();

    public BaseBlurredDialog(Context context) {
        super(context);
        setOnDismissListener(this);
        setOwnerActivity((Activity) context);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        if (getWindow() != null) {
            getWindow().setFlags(16777216, 16777216);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        getWindow().setLayout(-1, -1);
        View activityRootView = DialogUtil.getActivityRootView(getOwnerActivity());
        if (activityRootView == null) {
            return;
        }
        if (activityRootView.getWidth() == 0) {
            getWindow().setBackgroundDrawable(null);
            return;
        }
        Window window = getWindow();
        if (window != null) {
            try {
                BitmapDrawable createBlurredBackground = DialogUtil.createBlurredBackground(getOwnerActivity());
                this.background = createBlurredBackground;
                window.setBackgroundDrawable(createBlurredBackground);
            } catch (Exception unused) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        BitmapDrawable bitmapDrawable = this.background;
        if (bitmapDrawable != null) {
            bitmapDrawable.getBitmap().recycle();
            this.background = null;
        }
    }
}
