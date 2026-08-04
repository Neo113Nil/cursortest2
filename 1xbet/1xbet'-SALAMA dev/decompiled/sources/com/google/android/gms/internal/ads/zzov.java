package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class zzov extends ContentObserver {
    final /* synthetic */ zzoy zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzov(zzoy zzoyVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzoyVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        zzoy zzoyVar = this.zza;
        this.zza.zzj(zzot.zzc(zzoyVar.zza, zzoyVar.zzh, zzoyVar.zzg));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
