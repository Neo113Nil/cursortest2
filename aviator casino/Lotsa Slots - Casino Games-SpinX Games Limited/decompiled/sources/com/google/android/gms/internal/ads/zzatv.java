package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzatv {
    protected static final java.util.Comparator zza = new com.google.android.gms.internal.ads.zzatu();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzc = new java.util.ArrayList(64);
    private int zzd = 0;

    public zzatv(int i) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] bArr = (byte[]) this.zzb.remove(0);
            this.zzc.remove(bArr);
            this.zzd -= bArr.length;
        }
    }

    public final synchronized byte[] zza(int i) {
        int i2 = 0;
        while (true) {
            java.util.List list = this.zzc;
            if (i2 >= list.size()) {
                return new byte[i];
            }
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.zzd -= length;
                list.remove(i2);
                this.zzb.remove(bArr);
                return bArr;
            }
            i2++;
        }
    }

    public final synchronized void zzb(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.zzb.add(bArr);
                java.util.List list = this.zzc;
                int binarySearch = java.util.Collections.binarySearch(list, bArr, zza);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                list.add(binarySearch, bArr);
                this.zzd += length;
                zzc();
            }
        }
    }
}
