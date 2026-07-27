package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcdd;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcdi;
import com.google.android.gms.internal.ads.zzcdo;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfm extends zzccz {
    private static void zzt(final zzcdh zzcdhVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcdh zzcdhVar2 = zzcdh.this;
                if (zzcdhVar2 != null) {
                    try {
                        zzcdhVar2.zzf(1);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zza(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzb(zzm zzmVar, zzcdh zzcdhVar) throws RemoteException {
        zzt(zzcdhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzc(zzm zzmVar, zzcdh zzcdhVar) throws RemoteException {
        zzt(zzcdhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzd(zzcdd zzcddVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zze(zzdn zzdnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final Bundle zzf() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzg(zzcdo zzcdoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final boolean zzh() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzi() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzj(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final zzccx zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final zzdx zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzn(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzo(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final long zzp() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzq(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzr(zzcdi zzcdiVar) throws RemoteException {
    }
}
