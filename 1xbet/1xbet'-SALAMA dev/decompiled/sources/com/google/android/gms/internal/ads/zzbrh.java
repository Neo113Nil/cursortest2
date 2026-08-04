package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class zzbrh implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrj zza;

    public zzbrh(zzbrj zzbrjVar) {
        this.zza = zzbrjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        zzbrj zzbrjVar = this.zza;
        Intent intentZzb = zzbrjVar.zzb();
        P p5 = o.f1952C.f1957c;
        P.p(zzbrjVar.zzb, intentZzb);
    }
}
