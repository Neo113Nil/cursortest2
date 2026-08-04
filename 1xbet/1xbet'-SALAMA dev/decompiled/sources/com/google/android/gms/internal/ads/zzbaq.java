package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC0806b;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzbaq implements InterfaceC0806b {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbai zza;
    final /* synthetic */ zzbzf zzb;
    final /* synthetic */ zzbas zzc;

    public zzbaq(zzbas zzbasVar, zzbai zzbaiVar, zzbzf zzbzfVar) {
        this.zza = zzbaiVar;
        this.zzb = zzbzfVar;
        this.zzc = zzbasVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            try {
                zzbas zzbasVar = this.zzc;
                if (zzbasVar.zzb) {
                    return;
                }
                zzbasVar.zzb = true;
                final zzbah zzbahVar = this.zzc.zza;
                if (zzbahVar == null) {
                    return;
                }
                zzgbn zzgbnVar = zzbza.zza;
                final zzbai zzbaiVar = this.zza;
                final zzbzf zzbzfVar = this.zzb;
                final I3.b bVarZza = zzgbnVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzban
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbaq zzbaqVar = this.zza;
                        zzbah zzbahVar2 = zzbahVar;
                        zzbzf zzbzfVar2 = zzbzfVar;
                        try {
                            zzbak zzbakVarZzq = zzbahVar2.zzq();
                            boolean zZzp = zzbahVar2.zzp();
                            zzbai zzbaiVar2 = zzbaiVar;
                            zzbaf zzbafVarZzg = zZzp ? zzbakVarZzq.zzg(zzbaiVar2) : zzbakVarZzq.zzf(zzbaiVar2);
                            if (!zzbafVarZzg.zze()) {
                                zzbzfVar2.zzd(new RuntimeException("No entry contents."));
                                zzbas.zze(zzbaqVar.zzc);
                                return;
                            }
                            zzbap zzbapVar = new zzbap(zzbaqVar, zzbafVarZzg.zzc(), 1);
                            int i7 = zzbapVar.read();
                            if (i7 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbapVar.unread(i7);
                            zzbzfVar2.zzc(zzbau.zzb(zzbapVar, zzbafVarZzg.zzd(), zzbafVarZzg.zzg(), zzbafVarZzg.zza(), zzbafVarZzg.zzf()));
                        } catch (RemoteException e7) {
                            e = e7;
                            int i8 = J.f3546b;
                            j.e("Unable to obtain a cache service instance.", e);
                            zzbzfVar2.zzd(e);
                            zzbas.zze(zzbaqVar.zzc);
                        } catch (IOException e8) {
                            e = e8;
                            int i9 = J.f3546b;
                            j.e("Unable to obtain a cache service instance.", e);
                            zzbzfVar2.zzd(e);
                            zzbas.zze(zzbaqVar.zzc);
                        }
                    }
                });
                final zzbzf zzbzfVar2 = this.zzb;
                zzbzfVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbao
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzbzfVar2.isCancelled()) {
                            bVarZza.cancel(true);
                        }
                    }
                }, zzbza.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnectionSuspended(int i7) {
    }
}
