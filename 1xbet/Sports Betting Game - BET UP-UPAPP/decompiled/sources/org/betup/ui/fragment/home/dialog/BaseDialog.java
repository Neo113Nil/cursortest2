package org.betup.ui.fragment.home.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public class BaseDialog extends Dialog {
    public BaseDialog(Context context) {
        super(context);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
    }

    public void resizeDialog() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
    }
}
