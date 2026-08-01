package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;

/* loaded from: assets/audience_network/classes2.dex */
public class YQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C2253Pp A00;

    public YQ(C2253Pp c2253Pp) {
        this.A00 = c2253Pp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
