package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaw implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzaw(zzax zzaxVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        Objects.requireNonNull(zzaxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        AlertDialog.Builder zzN = zzs.zzN(context);
        zzN.setMessage(this.zzb);
        if (this.zzc) {
            zzN.setTitle(k.c);
        } else {
            zzN.setTitle("Info");
        }
        if (this.zzd) {
            zzN.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzN.setPositiveButton("Learn More", new zzav(this, context));
            zzN.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzN.create().show();
    }
}
