package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzck {
    private final com.google.android.gms.internal.ads.zzgwm zza;
    private final java.util.List zzb = new java.util.ArrayList();
    private java.nio.ByteBuffer[] zzc = new java.nio.ByteBuffer[0];
    private boolean zzd;

    public zzck(com.google.android.gms.internal.ads.zzgwm zzgwmVar) {
        this.zza = zzgwmVar;
        com.google.android.gms.internal.ads.zzcl zzclVar = com.google.android.gms.internal.ads.zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(java.nio.ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= zzj()) {
                if (!this.zzc[i].hasRemaining()) {
                    java.util.List list = this.zzb;
                    com.google.android.gms.internal.ads.zzco zzcoVar = (com.google.android.gms.internal.ads.zzco) list.get(i);
                    if (!zzcoVar.zzg()) {
                        java.nio.ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : com.google.android.gms.internal.ads.zzco.zza;
                        long remaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i] = zzcoVar.zzf();
                        boolean z2 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzj()) {
                        ((com.google.android.gms.internal.ads.zzco) list.get(i + 1)).zze();
                    }
                }
                i++;
            }
        } while (z);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzck)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
        int size = zzgwmVar.size();
        com.google.android.gms.internal.ads.zzgwm zzgwmVar2 = ((com.google.android.gms.internal.ads.zzck) obj).zza;
        if (size != zzgwmVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzgwmVar.size(); i++) {
            if (zzgwmVar.get(i) != zzgwmVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final com.google.android.gms.internal.ads.zzcl zza(com.google.android.gms.internal.ads.zzcl zzclVar) throws com.google.android.gms.internal.ads.zzcn {
        if (zzclVar.equals(com.google.android.gms.internal.ads.zzcl.zza)) {
            throw new com.google.android.gms.internal.ads.zzcn("Unhandled input format:", zzclVar);
        }
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
            if (i >= zzgwmVar.size()) {
                return zzclVar;
            }
            com.google.android.gms.internal.ads.zzco zzcoVar = (com.google.android.gms.internal.ads.zzco) zzgwmVar.get(i);
            com.google.android.gms.internal.ads.zzcl zzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                com.google.android.gms.internal.ads.zzgtj.zzi(!zzb.equals(r0));
                zzclVar = zzb;
            }
            i++;
        }
    }

    public final void zzb(com.google.android.gms.internal.ads.zzcm zzcmVar) {
        java.util.List list = this.zzb;
        list.clear();
        this.zzd = false;
        long j = zzcmVar.zzb;
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
            if (i >= zzgwmVar.size()) {
                break;
            }
            com.google.android.gms.internal.ads.zzco zzcoVar = (com.google.android.gms.internal.ads.zzco) zzgwmVar.get(i);
            zzcoVar.zzi(new com.google.android.gms.internal.ads.zzcm(j));
            if (zzcoVar.zzc()) {
                j = zzcoVar.zza(j);
                com.google.android.gms.internal.ads.zzgtj.zzi(j >= 0);
                list.add(zzcoVar);
            }
            i++;
        }
        this.zzc = new java.nio.ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= zzj(); i2++) {
            this.zzc[i2] = ((com.google.android.gms.internal.ads.zzco) list.get(i2)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(java.nio.ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final java.nio.ByteBuffer zze() {
        if (!zzc()) {
            return com.google.android.gms.internal.ads.zzco.zza;
        }
        java.nio.ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(com.google.android.gms.internal.ads.zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((com.google.android.gms.internal.ads.zzco) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((com.google.android.gms.internal.ads.zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
            if (i >= zzgwmVar.size()) {
                this.zzb.clear();
                this.zzc = new java.nio.ByteBuffer[0];
                com.google.android.gms.internal.ads.zzcl zzclVar = com.google.android.gms.internal.ads.zzcl.zza;
                this.zzd = false;
                return;
            }
            com.google.android.gms.internal.ads.zzco zzcoVar = (com.google.android.gms.internal.ads.zzco) zzgwmVar.get(i);
            zzcoVar.zzi(com.google.android.gms.internal.ads.zzcm.zza);
            zzcoVar.zzj();
            i++;
        }
    }
}
