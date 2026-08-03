package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzckr implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.webkit.JsPromptResult zza;
    final /* synthetic */ android.widget.EditText zzb;

    zzckr(android.webkit.JsPromptResult jsPromptResult, android.widget.EditText editText) {
        this.zza = jsPromptResult;
        this.zzb = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.confirm(this.zzb.getText().toString());
    }
}
