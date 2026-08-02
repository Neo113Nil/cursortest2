package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC0850b;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzbaq implements InterfaceC0850b {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbai zza;
    final /* synthetic */ zzbzf zzb;
    final /* synthetic */ zzbas zzc;

    public zzbaq(zzbas zzbasVar, zzbai zzbaiVar, zzbzf zzbzfVar) {
        this.zza = zzbaiVar;
        this.zzb = zzbzfVar;
        this.zzc = zzbasVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z4;
        final zzbah zzbahVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            try {
                zzbas zzbasVar = this.zzc;
                z4 = zzbasVar.zzb;
                if (z4) {
                    return;
                }
                zzbasVar.zzb = true;
                zzbahVar = this.zzc.zza;
                if (zzbahVar == null) {
                    return;
                }
                zzgbn zzgbnVar = zzbza.zza;
                final zzbai zzbaiVar = this.zza;
                final zzbzf zzbzfVar = this.zzb;
                final I3.b zza = zzgbnVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzban
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbaq zzbaqVar = zzbaq.this;
                        zzbah zzbahVar2 = zzbahVar;
                        zzbzf zzbzfVar2 = zzbzfVar;
                        try {
                            zzbak zzq = zzbahVar2.zzq();
                            boolean zzp = zzbahVar2.zzp();
                            zzbai zzbaiVar2 = zzbaiVar;
                            zzbaf zzg = zzp ? zzq.zzg(zzbaiVar2) : zzq.zzf(zzbaiVar2);
                            if (!zzg.zze()) {
                                zzbzfVar2.zzd(new RuntimeException("No entry contents."));
                                zzbas.zze(zzbaqVar.zzc);
                                return;
                            }
                            zzbap zzbapVar = new zzbap(zzbaqVar, zzg.zzc(), 1);
                            int read = zzbapVar.read();
                            if (read == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbapVar.unread(read);
                            zzbzfVar2.zzc(zzbau.zzb(zzbapVar, zzg.zzd(), zzg.zzg(), zzg.zza(), zzg.zzf()));
                        } catch (RemoteException e7) {
                            e = e7;
                            int i7 = J.f3546b;
                            j.e("Unable to obtain a cache service instance.", e);
                            zzbzfVar2.zzd(e);
                            zzbas.zze(zzbaqVar.zzc);
                        } catch (IOException e8) {
                            e = e8;
                            int i72 = J.f3546b;
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
                        if (zzbzf.this.isCancelled()) {
                            zza.cancel(true);
                        }
                    }
                }, zzbza.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnectionSuspended(int i7) {
    }
}
