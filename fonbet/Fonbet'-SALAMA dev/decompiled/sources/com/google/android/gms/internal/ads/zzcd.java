package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcd {
    private final zzfwh zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzcd(zzfwh zzfwhVar) {
        this.zza = zzfwhVar;
        zzce zzceVar = zzce.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z4;
        do {
            int i7 = 0;
            z4 = false;
            while (i7 <= zzi()) {
                if (!this.zzc[i7].hasRemaining()) {
                    zzcg zzcgVar = (zzcg) this.zzb.get(i7);
                    if (!zzcgVar.zzh()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.zzc[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcg.zza;
                        long remaining = byteBuffer2.remaining();
                        zzcgVar.zze(byteBuffer2);
                        this.zzc[i7] = zzcgVar.zzb();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z7 = true;
                        if (remaining2 <= 0 && !this.zzc[i7].hasRemaining()) {
                            z7 = false;
                        }
                        z4 |= z7;
                    } else if (!this.zzc[i7].hasRemaining() && i7 < zzi()) {
                        ((zzcg) this.zzb.get(i7 + 1)).zzd();
                    }
                }
                i7++;
            }
        } while (z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcd)) {
            return false;
        }
        zzcd zzcdVar = (zzcd) obj;
        if (this.zza.size() != zzcdVar.zza.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            if (this.zza.get(i7) != zzcdVar.zza.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzce zza(zzce zzceVar) {
        if (zzceVar.equals(zzce.zza)) {
            throw new zzcf("Unhandled input format:", zzceVar);
        }
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            zzcg zzcgVar = (zzcg) this.zza.get(i7);
            zzce zza = zzcgVar.zza(zzceVar);
            if (zzcgVar.zzg()) {
                zzcv.zzf(!zza.equals(zzce.zza));
                zzceVar = zza;
            }
        }
        return zzceVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzcg.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzcg.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = false;
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            zzcg zzcgVar = (zzcg) this.zza.get(i7);
            zzcgVar.zzc();
            if (zzcgVar.zzg()) {
                this.zzb.add(zzcgVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i8 = 0; i8 <= zzi(); i8++) {
            this.zzc[i8] = ((zzcg) this.zzb.get(i8)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcg) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzd) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            zzcg zzcgVar = (zzcg) this.zza.get(i7);
            zzcgVar.zzc();
            zzcgVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzce zzceVar = zzce.zza;
        this.zzd = false;
    }

    public final boolean zzg() {
        return this.zzd && ((zzcg) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
