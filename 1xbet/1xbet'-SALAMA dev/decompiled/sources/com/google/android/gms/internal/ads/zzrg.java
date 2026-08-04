package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class zzrg extends zzch {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i7, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i7) * 4.656612875245797E-10d));
        if (iFloatToIntBits == zzd) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzj;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        int i8 = this.zzb.zzd;
        if (i8 == 21) {
            byteBufferZzj = zzj((i7 / 3) * 4);
            while (iPosition < iLimit) {
                zzo(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferZzj);
                iPosition += 3;
            }
        } else if (i8 == 22) {
            byteBufferZzj = zzj(i7);
            while (iPosition < iLimit) {
                int i9 = byteBuffer.get(iPosition) & 255;
                int i10 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                zzo(i9 | i10 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferZzj);
                iPosition += 4;
            }
        } else if (i8 == 1342177280) {
            byteBufferZzj = zzj((i7 / 3) * 4);
            while (iPosition < iLimit) {
                zzo(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferZzj);
                iPosition += 3;
            }
        } else {
            if (i8 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferZzj = zzj(i7);
            while (iPosition < iLimit) {
                int i11 = byteBuffer.get(iPosition + 3) & 255;
                int i12 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                zzo(i11 | i12 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferZzj);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzce zzi(zzce zzceVar) throws zzcf {
        int i7 = zzceVar.zzd;
        int i8 = zzen.zza;
        if (i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736) {
            return new zzce(zzceVar.zzb, zzceVar.zzc, 4);
        }
        if (i7 == 4) {
            return zzce.zza;
        }
        throw new zzcf("Unhandled input format:", zzceVar);
    }
}
