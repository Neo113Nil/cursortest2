package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbyu implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyv zza;

    zzbyu(zzbyv zzbyvVar) {
        Objects.requireNonNull(zzbyvVar);
        this.zza = zzbyvVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
