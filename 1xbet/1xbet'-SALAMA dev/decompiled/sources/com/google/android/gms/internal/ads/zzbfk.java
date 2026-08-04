package com.google.android.gms.internal.ads;

import J2.j;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzbfk extends B2.a {
    private final zzbfj zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbfk(zzbfj zzbfjVar) {
        Drawable drawable;
        double dZzb;
        int iZzd;
        this.zza = zzbfjVar;
        Uri uriZze = null;
        try {
            p105o3.a aVarZzf = zzbfjVar.zzf();
            drawable = aVarZzf != null ? (Drawable) p105o3.b.t0(aVarZzf) : null;
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        this.zzb = drawable;
        try {
            uriZze = this.zza.zze();
        } catch (RemoteException e8) {
            j.e("", e8);
        }
        this.zzc = uriZze;
        try {
            dZzb = this.zza.zzb();
        } catch (RemoteException e9) {
            j.e("", e9);
            dZzb = 1.0d;
        }
        this.zzd = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.zza.zzd();
        } catch (RemoteException e10) {
            j.e("", e10);
            iZzd = -1;
        }
        this.zze = iZzd;
        try {
            iZzc = this.zza.zzc();
        } catch (RemoteException e11) {
            j.e("", e11);
        }
        this.zzf = iZzc;
    }

    @Override // B2.a
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // B2.a
    public final double getScale() {
        return this.zzd;
    }

    @Override // B2.a
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // B2.a
    public final int zza() {
        return this.zzf;
    }

    @Override // B2.a
    public final int zzb() {
        return this.zze;
    }
}
