package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzjl implements zzjm {
    private int zzst = 0;
    private List<byte[]> zzss = new ArrayList();

    zzjl() {
    }

    @Override // com.google.android.gms.internal.firebase_database.zzjm
    public final boolean zzb(byte[] bArr) {
        this.zzss.add(bArr);
        this.zzst += bArr.length;
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzjm
    public final zzjz zzgh() {
        byte[] bArr = new byte[this.zzst];
        int i = 0;
        for (int i2 = 0; i2 < this.zzss.size(); i2++) {
            byte[] bArr2 = this.zzss.get(i2);
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            i += bArr2.length;
        }
        return new zzjz(bArr);
    }
}
