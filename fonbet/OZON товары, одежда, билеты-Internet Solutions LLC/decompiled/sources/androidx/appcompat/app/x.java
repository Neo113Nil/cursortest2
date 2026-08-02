package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;

/* loaded from: classes.dex */
public class x extends DialogInterfaceOnCancelListenerC5390k {
    public x() {
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new w(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public void setupDialog(@NonNull Dialog dialog, int i11) {
        if (!(dialog instanceof w)) {
            super.setupDialog(dialog, i11);
            return;
        }
        w wVar = (w) dialog;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        wVar.supportRequestWindowFeature(1);
    }

    public x(int i11) {
        super(i11);
    }
}
