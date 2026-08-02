package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class zzbri implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrj zza;

    public zzbri(zzbrj zzbrjVar) {
        this.zza = zzbrjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.zza.zzh("Operation denied by user.");
    }
}
