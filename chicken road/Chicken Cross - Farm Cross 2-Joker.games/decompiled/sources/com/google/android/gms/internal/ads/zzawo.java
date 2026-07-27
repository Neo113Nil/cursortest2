package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzawo {
    public final ArrayDeque zza = new ArrayDeque();

    public zzawo(int i) {
    }

    public final void zza(long j, long j2, long j3) throws zzawm {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        zzawl zzawlVar = new zzawl(j, j2, j3);
        ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= ((i8 % 452867621) ^ i9)) {
            throw new zzawm();
        }
        arrayDeque.push(zzawlVar);
    }

    public final zzawl zzb() throws zzawn {
        return (zzawl) Optional.ofNullable((zzawl) this.zza.peek()).orElseThrow(zzawk.zza);
    }
}
