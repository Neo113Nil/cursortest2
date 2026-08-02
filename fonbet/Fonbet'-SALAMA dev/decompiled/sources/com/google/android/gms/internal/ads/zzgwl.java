package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzgwl extends zzgvp {
    private static final Logger zza = Logger.getLogger(zzgwl.class.getName());
    private static final boolean zzb = zzhad.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgwm zze;

    private zzgwl() {
        throw null;
    }

    public static int zzA(zzgyr zzgyrVar, zzgzk zzgzkVar) {
        int zzaM = ((zzgvh) zzgyrVar).zzaM(zzgzkVar);
        return zzD(zzaM) + zzaM;
    }

    public static int zzB(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhai.zze(str);
        } catch (zzhah unused) {
            length = str.getBytes(zzgxt.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int zzE(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzy(int i7, zzgyr zzgyrVar, zzgzk zzgzkVar) {
        int zzD = zzD(i7 << 3);
        return ((zzgvh) zzgyrVar).zzaM(zzgzkVar) + zzD + zzD;
    }

    public static int zzz(zzgyr zzgyrVar) {
        int zzaY = zzgyrVar.zzaY();
        return zzD(zzaY) + zzaY;
    }

    public final void zzF() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzG(String str, zzhah zzhahVar) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhahVar);
        byte[] bytes = str.getBytes(zzgxt.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzgwi(e7);
        }
    }

    public abstract void zzK();

    public abstract void zzL(byte b7);

    public abstract void zzM(int i7, boolean z4);

    public abstract void zzN(int i7, zzgvy zzgvyVar);

    @Override // com.google.android.gms.internal.ads.zzgvp
    public abstract void zza(byte[] bArr, int i7, int i8);

    public abstract int zzb();

    public abstract void zzh(int i7, int i8);

    public abstract void zzi(int i7);

    public abstract void zzj(int i7, long j);

    public abstract void zzk(long j);

    public abstract void zzl(int i7, int i8);

    public abstract void zzm(int i7);

    public abstract void zzn(int i7, zzgyr zzgyrVar, zzgzk zzgzkVar);

    public abstract void zzo(int i7, zzgyr zzgyrVar);

    public abstract void zzp(int i7, zzgvy zzgvyVar);

    public abstract void zzq(int i7, String str);

    public abstract void zzs(int i7, int i8);

    public abstract void zzt(int i7, int i8);

    public abstract void zzu(int i7);

    public abstract void zzv(int i7, long j);

    public abstract void zzw(long j);

    public /* synthetic */ zzgwl(zzgwk zzgwkVar) {
    }
}
