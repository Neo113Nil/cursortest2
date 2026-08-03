package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class YR implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ android.widget.EditText A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0959Pp A01;

    public YR(com.facebook.ads.redexgen.core.C0959Pp c0959Pp, android.widget.EditText editText) {
        this.A01 = c0959Pp;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        java.util.concurrent.Executor executor;
        executor = this.A01.A03;
        executor.execute(new com.facebook.ads.redexgen.core.Q1(this, dialogInterface));
    }
}
