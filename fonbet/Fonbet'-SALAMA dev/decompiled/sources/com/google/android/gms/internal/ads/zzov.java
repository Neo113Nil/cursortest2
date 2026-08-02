package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
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
        Context context;
        zze zzeVar;
        zzoz zzozVar;
        zzoy zzoyVar = this.zza;
        context = zzoyVar.zza;
        zzeVar = zzoyVar.zzh;
        zzozVar = zzoyVar.zzg;
        this.zza.zzj(zzot.zzc(context, zzeVar, zzozVar));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
