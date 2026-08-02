package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzpl extends android.app.Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpl(android.content.Context context, int i) {
        super(context, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.app.Dialog
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.google.android.libraries.places.R.layout.no_gmm_or_browser_dialog);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        ((android.widget.Button) findViewById(com.google.android.libraries.places.R.id.no_browser_error_ok)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzpk
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view) {
                com.google.android.libraries.places.internal.zzpl.this.dismiss();
            }
        });
    }
}
