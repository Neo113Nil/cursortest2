package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzre {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzcg.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j, int i7, int i8, boolean z4) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z4 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        byteBuffer.put(zzfzn.zza(i8));
    }

    public final void zza(zzhg zzhgVar, List list) {
        int length;
        ByteBuffer byteBuffer = zzhgVar.zzc;
        byteBuffer.getClass();
        if (byteBuffer.limit() - zzhgVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = zzhgVar.zzc;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i7 = iLimit - iPosition;
        int i8 = (i7 + 255) / 255;
        int i9 = i8 + 27 + i7;
        if (this.zzd == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i9 += length + 44;
        } else {
            length = 0;
        }
        if (this.zzc.capacity() < i9) {
            this.zzc = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer3 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                zzc(byteBuffer3, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer3.put(zzfzn.zza(length2));
                byteBuffer3.put(bArr);
                int i10 = length2 + 28;
                byteBuffer3.putInt(22, zzen.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset(), i10, 0));
                byteBuffer3.position(i10);
            } else {
                byteBuffer3.put(zza);
            }
            byteBuffer3.put(zzb);
        }
        int iZzc = this.zze + zzadq.zzc(byteBuffer2);
        this.zze = iZzc;
        zzc(byteBuffer3, iZzc, this.zzd, i8, false);
        for (int i11 = 0; i11 < i8; i11++) {
            if (i7 >= 255) {
                byteBuffer3.put((byte) -1);
                i7 -= 255;
            } else {
                byteBuffer3.put((byte) i7);
                i7 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer3.put(byteBuffer2.get(iPosition));
            iPosition++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.zzd == 2) {
            byteBuffer3.putInt(length + 66, zzen.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset() + length + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, zzen.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer3;
        zzhgVar.zzb();
        zzhgVar.zzj(this.zzc.remaining());
        zzhgVar.zzc.put(this.zzc);
        zzhgVar.zzk();
    }

    public final void zzb() {
        this.zzc = zzcg.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
