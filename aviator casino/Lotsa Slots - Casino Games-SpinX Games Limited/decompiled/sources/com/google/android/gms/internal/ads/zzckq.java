package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzckq implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.webkit.JsPromptResult zza;

    zzckq(android.webkit.JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.cancel();
    }
}
