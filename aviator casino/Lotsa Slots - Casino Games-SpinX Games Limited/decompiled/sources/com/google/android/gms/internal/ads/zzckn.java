package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzckn implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.webkit.JsResult zza;

    zzckn(android.webkit.JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.cancel();
    }
}
