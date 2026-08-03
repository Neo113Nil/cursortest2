package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdps extends com.google.android.gms.ads.internal.client.zzdz {
    private final java.lang.Object zza = new java.lang.Object();

    @javax.annotation.Nullable
    private final com.google.android.gms.ads.internal.client.zzea zzb;

    @javax.annotation.Nullable
    private final com.google.android.gms.internal.ads.zzbvr zzc;

    public zzdps(@javax.annotation.Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzbvr zzbvrVar) {
        this.zzb = zzeaVar;
        this.zzc = zzbvrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zzc;
        if (zzbvrVar != null) {
            return zzbvrVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zzc;
        if (zzbvrVar != null) {
            return zzbvrVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(@javax.annotation.Nullable com.google.android.gms.ads.internal.client.zzed zzedVar) throws android.os.RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar != null) {
                zzeaVar.zzl(zzedVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    @javax.annotation.Nullable
    public final com.google.android.gms.ads.internal.client.zzed zzo() throws android.os.RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return null;
            }
            return zzeaVar.zzo();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() throws android.os.RemoteException {
        throw new android.os.RemoteException();
    }
}
