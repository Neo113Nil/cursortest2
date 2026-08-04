package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class zzbro implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrp zza;

    public zzbro(zzbrp zzbrpVar) {
        this.zza = zzbrpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.zza.zzh("User canceled the download.");
    }
}
