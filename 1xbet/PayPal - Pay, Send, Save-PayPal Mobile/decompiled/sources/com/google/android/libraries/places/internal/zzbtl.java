package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtl implements java.lang.Runnable {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbua zzb;

    zzbtl(com.google.android.libraries.places.internal.zzbua zzbuaVar, java.util.List list) {
        this.zza = list;
        java.util.Objects.requireNonNull(zzbuaVar);
        this.zzb = zzbuaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0076  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.google.android.libraries.places.internal.zzbwd zzC;
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zzb;
        com.google.android.libraries.places.internal.zzbtu zzr = zzbuaVar.zzr();
        java.util.List list = this.zza;
        java.net.SocketAddress zze = zzbuaVar.zzr().zze();
        zzr.zzg(list);
        zzbuaVar.zzs(list);
        com.google.android.libraries.places.internal.zzbjn zzc = zzbuaVar.zzE().zzc();
        com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.READY;
        if ((zzc == zzbjnVar || zzbuaVar.zzE().zzc() == com.google.android.libraries.places.internal.zzbjn.CONNECTING) && !zzbuaVar.zzr().zzh(zze)) {
            if (zzbuaVar.zzE().zzc() == zzbjnVar) {
                zzC = zzbuaVar.zzC();
                zzbuaVar.zzD(null);
                zzbuaVar.zzr().zzd();
                zzbuaVar.zzh(com.google.android.libraries.places.internal.zzbjn.IDLE);
                if (zzC == null) {
                    if (zzbuaVar.zzu() != null) {
                        zzbuaVar.zzw().zzd(com.google.android.libraries.places.internal.zzbnp.zzi.zze("InternalSubchannel closed transport early due to address change"));
                        zzbuaVar.zzu().zza();
                        zzbuaVar.zzv(null);
                        zzbuaVar.zzx(null);
                    }
                    zzbuaVar.zzx(zzC);
                    zzbuaVar.zzv(zzbuaVar.zzq().zzd(new com.google.android.libraries.places.internal.zzbtk(this), 5L, java.util.concurrent.TimeUnit.SECONDS, zzbuaVar.zzm()));
                    return;
                }
                return;
            }
            zzbuaVar.zzA().zzd(com.google.android.libraries.places.internal.zzbnp.zzi.zze("InternalSubchannel closed pending transport due to address change"));
            zzbuaVar.zzB(null);
            zzbuaVar.zzr().zzd();
            zzbuaVar.zzf();
        }
        zzC = null;
        if (zzC == null) {
        }
    }
}
