package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzck {
    private final zzgxm zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzgxm zzgxmVar) {
        this.zza = zzgxmVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= zzj()) {
                if (!this.zzc[i].hasRemaining()) {
                    List list = this.zzb;
                    zzcp zzcpVar = (zzcp) list.get(i);
                    if (!zzcpVar.zzg()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcp.zza;
                        long remaining = byteBuffer2.remaining();
                        zzcpVar.zzd(byteBuffer2);
                        this.zzc[i] = zzcpVar.zzf();
                        boolean z2 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzj()) {
                        ((zzcp) list.get(i + 1)).zze();
                    }
                }
                i++;
            }
        } while (z);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgxm zzgxmVar = this.zza;
        int size = zzgxmVar.size();
        zzgxm zzgxmVar2 = ((zzck) obj).zza;
        if (size != zzgxmVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzgxmVar.size(); i++) {
            if (zzgxmVar.get(i) != zzgxmVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzco {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i >= zzgxmVar.size()) {
                return zzclVar;
            }
            zzcp zzcpVar = (zzcp) zzgxmVar.get(i);
            zzcl zzb = zzcpVar.zzb(zzclVar);
            if (zzcpVar.zzc()) {
                zzguk.zzi(!zzb.equals(r0));
                zzclVar = zzb;
            }
            i++;
        }
    }

    public final void zzb(zzcn zzcnVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        int i = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i >= zzgxmVar.size()) {
                break;
            }
            zzcp zzcpVar = (zzcp) zzgxmVar.get(i);
            zzcpVar.zzi(zzcnVar);
            if (zzcpVar.zzc()) {
                zzcm zzcmVar = new zzcm(zzcnVar, null);
                zzcmVar.zza(zzcpVar.zza(zzcnVar.zzb));
                zzcnVar = zzcmVar.zzd();
                list.add(zzcpVar);
            }
            i++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= zzj(); i2++) {
            this.zzc[i2] = ((zzcp) list.get(i2)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzcp.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzcp.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcp) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzcp) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i >= zzgxmVar.size()) {
                this.zzb.clear();
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            }
            zzcp zzcpVar = (zzcp) zzgxmVar.get(i);
            zzcpVar.zzi(zzcn.zza);
            zzcpVar.zzj();
            i++;
        }
    }
}
