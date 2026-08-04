package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class zzqc extends zzch {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzj = zzj(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i7 : iArr) {
                byteBufferZzj.putShort(byteBuffer.getShort(i7 + i7 + iPosition));
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzce zzi(zzce zzceVar) throws zzcf {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzce.zza;
        }
        if (zzceVar.zzd != 2) {
            throw new zzcf("Unhandled input format:", zzceVar);
        }
        boolean z4 = zzceVar.zzc != iArr.length;
        int i7 = 0;
        while (true) {
            int length = iArr.length;
            if (i7 >= length) {
                return z4 ? new zzce(zzceVar.zzb, length, 2) : zzce.zza;
            }
            int i8 = iArr[i7];
            if (i8 >= zzceVar.zzc) {
                throw new zzcf("Unhandled input format:", zzceVar);
            }
            z4 |= i8 != i7;
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
