package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class zzbrl implements View.OnClickListener {
    final /* synthetic */ zzbrm zza;

    public zzbrl(zzbrm zzbrmVar) {
        this.zza = zzbrmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
