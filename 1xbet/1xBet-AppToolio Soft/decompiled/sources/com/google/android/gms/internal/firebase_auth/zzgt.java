package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzgt {
    protected volatile int zzya = -1;

    public static final void zza(zzgt zzgtVar, byte[] bArr, int i, int i2) {
        try {
            zzgl zzj = zzgl.zzj(bArr, 0, i2);
            zzgtVar.zza(zzj);
            zzj.zzgm();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final <T extends zzgt> T zzb(T t, byte[] bArr, int i, int i2) throws zzgs {
        try {
            zzgk zzi = zzgk.zzi(bArr, 0, i2);
            t.zza(zzi);
            zzi.zzm(0);
            return t;
        } catch (zzgs e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public String toString() {
        return zzgu.zzc(this);
    }

    public abstract zzgt zza(zzgk zzgkVar) throws IOException;

    public void zza(zzgl zzglVar) throws IOException {
    }

    protected int zzb() {
        return 0;
    }

    public final int zzdq() {
        int zzb = zzb();
        this.zzya = zzb;
        return zzb;
    }

    @Override // 
    /* renamed from: zzgn, reason: merged with bridge method [inline-methods] */
    public zzgt clone() throws CloneNotSupportedException {
        return (zzgt) super.clone();
    }
}
