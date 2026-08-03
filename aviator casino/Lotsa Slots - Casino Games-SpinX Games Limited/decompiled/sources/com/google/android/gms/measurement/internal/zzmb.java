package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmb implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zze;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzf;

    zzmb(com.google.android.gms.measurement.internal.zznk zznkVar, java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z;
        this.zze = zzcuVar;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzf = zznkVar;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00b2: MOVE (r0 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:44:0x00b1 */
    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle;
        android.os.RemoteException e;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3 = new android.os.Bundle();
        try {
            try {
                com.google.android.gms.measurement.internal.zznk zznkVar = this.zzf;
                com.google.android.gms.measurement.internal.zzga zzZ = zznkVar.zzZ();
                if (zzZ == null) {
                    com.google.android.gms.measurement.internal.zzib zzibVar = zznkVar.zzu;
                    zzibVar.zzaV().zzb().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    zzibVar.zzk().zzaq(this.zze, bundle3);
                    return;
                }
                com.google.android.gms.measurement.internal.zzr zzrVar = this.zzc;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                java.util.List<com.google.android.gms.measurement.internal.zzpk> zzp = zzZ.zzp(this.zza, this.zzb, this.zzd, zzrVar);
                int i = com.google.android.gms.measurement.internal.zzpo.zza;
                bundle = new android.os.Bundle();
                if (zzp != null) {
                    for (com.google.android.gms.measurement.internal.zzpk zzpkVar : zzp) {
                        java.lang.String str = zzpkVar.zze;
                        if (str != null) {
                            bundle.putString(zzpkVar.zzb, str);
                        } else {
                            java.lang.Long l = zzpkVar.zzd;
                            if (l != null) {
                                bundle.putLong(zzpkVar.zzb, l.longValue());
                            } else {
                                java.lang.Double d = zzpkVar.zzg;
                                if (d != null) {
                                    bundle.putDouble(zzpkVar.zzb, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    zznkVar.zzV();
                    com.google.android.gms.measurement.internal.zzib zzibVar2 = zznkVar.zzu;
                    zzibVar2.zzk().zzaq(this.zze, bundle);
                } catch (android.os.RemoteException e2) {
                    e = e2;
                    this.zzf.zzu.zzaV().zzb().zzc("Failed to get user properties; remote exception", this.zza, e);
                    com.google.android.gms.measurement.internal.zznk zznkVar2 = this.zzf;
                    zznkVar2.zzu.zzk().zzaq(this.zze, bundle);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                bundle3 = bundle2;
                com.google.android.gms.measurement.internal.zznk zznkVar3 = this.zzf;
                zznkVar3.zzu.zzk().zzaq(this.zze, bundle3);
                throw th;
            }
        } catch (android.os.RemoteException e3) {
            bundle = bundle3;
            e = e3;
        } catch (java.lang.Throwable th2) {
            th = th2;
            com.google.android.gms.measurement.internal.zznk zznkVar32 = this.zzf;
            zznkVar32.zzu.zzk().zzaq(this.zze, bundle3);
            throw th;
        }
    }
}
