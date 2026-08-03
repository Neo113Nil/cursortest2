package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcex {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzcfi zzb;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.Object zzd = new java.lang.Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final java.util.LinkedList zzc = new java.util.LinkedList();

    zzcex(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzcfi zzcfiVar, java.lang.String str, java.lang.String str2) {
        this.zza = clock;
        this.zzb = zzcfiVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        synchronized (this.zzd) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            this.zzj = elapsedRealtime;
            this.zzb.zzf(zzmVar, elapsedRealtime);
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            this.zzb.zzg();
        }
    }

    public final void zzc() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzd(long j) {
        synchronized (this.zzd) {
            this.zzk = j;
            if (j != -1) {
                this.zzb.zzb(this);
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && this.zzg == -1) {
                this.zzg = this.zza.elapsedRealtime();
                this.zzb.zzb(this);
            }
            this.zzb.zze();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                com.google.android.gms.internal.ads.zzcew zzcewVar = new com.google.android.gms.internal.ads.zzcew(this);
                zzcewVar.zzc();
                this.zzc.add(zzcewVar);
                this.zzi++;
                com.google.android.gms.internal.ads.zzcfi zzcfiVar = this.zzb;
                zzcfiVar.zzd();
                zzcfiVar.zzb(this);
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                java.util.LinkedList linkedList = this.zzc;
                if (!linkedList.isEmpty()) {
                    com.google.android.gms.internal.ads.zzcew zzcewVar = (com.google.android.gms.internal.ads.zzcew) linkedList.getLast();
                    if (zzcewVar.zza() == -1) {
                        zzcewVar.zzb();
                        this.zzb.zzb(this);
                    }
                }
            }
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                this.zzh = this.zza.elapsedRealtime();
            }
        }
    }

    public final android.os.Bundle zzi() {
        android.os.Bundle bundle;
        synchronized (this.zzd) {
            bundle = new android.os.Bundle();
            bundle.putString("seq_num", this.zze);
            bundle.putString("slotid", this.zzf);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzj);
            bundle.putLong("tresponse", this.zzk);
            bundle.putLong("timp", this.zzg);
            bundle.putLong("tload", this.zzh);
            bundle.putLong("pcc", this.zzi);
            bundle.putLong("tfetch", -1L);
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            java.util.Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.google.android.gms.internal.ads.zzcew) it.next()).zzd());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final java.lang.String zzj() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.common.util.Clock zzk() {
        return this.zza;
    }
}
