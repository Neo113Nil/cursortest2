package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzckm implements android.content.DialogInterface.OnCancelListener {
    final /* synthetic */ android.webkit.JsResult zza;

    zzckm(android.webkit.JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
