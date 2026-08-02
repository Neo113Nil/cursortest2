package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaps {
    protected static final Comparator zza = new zzapr();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList(64);
    private int zzd = 0;

    public zzaps(int i7) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] bArr = (byte[]) this.zzb.remove(0);
            this.zzc.remove(bArr);
            this.zzd -= bArr.length;
        }
    }

    public final synchronized void zza(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.zzb.add(bArr);
                int binarySearch = Collections.binarySearch(this.zzc, bArr, zza);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.zzc.add(binarySearch, bArr);
                this.zzd += length;
                zzc();
            }
        }
    }

    public final synchronized byte[] zzb(int i7) {
        for (int i8 = 0; i8 < this.zzc.size(); i8++) {
            byte[] bArr = (byte[]) this.zzc.get(i8);
            int length = bArr.length;
            if (length >= i7) {
                this.zzd -= length;
                this.zzc.remove(i8);
                this.zzb.remove(bArr);
                return bArr;
            }
        }
        return new byte[i7];
    }
}
