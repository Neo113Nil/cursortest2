package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgha {
    private java.security.MessageDigest zza;
    private final com.google.android.gms.internal.ads.zzgqh zzb;
    private final java.lang.Object zzc = new java.lang.Object();
    private boolean zzd = false;
    private java.security.SecureRandom zze;

    public zzgha(com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zzb = zzgqhVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new java.security.SecureRandom());
    }

    final synchronized void zzb(java.security.SecureRandom secureRandom) {
        com.google.android.gms.internal.ads.zzgqf zza = this.zzb.zza(202);
        try {
            try {
                try {
                    zza.zza();
                    this.zze = secureRandom;
                    this.zza = java.security.MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (java.lang.Throwable th) {
                    zza.zzb(th);
                    throw th;
                }
            } catch (java.security.NoSuchAlgorithmException e) {
                zza.zzb(e);
            }
            zza.zzc();
        } catch (java.lang.Throwable th2) {
            zza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    final byte[] zzd(byte[] bArr, java.lang.String str, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        com.google.android.gms.internal.ads.zzgtj.zza(length <= i);
        java.nio.ByteBuffer put = java.nio.ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.zze.nextBytes(bArr2);
            bArr = java.util.Arrays.copyOf(bArr, length + i2);
            java.lang.System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] array = put.put(bArr).array();
        if (z) {
            array = java.nio.ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        com.google.android.gms.internal.ads.zzghd[] zzghdVarArr = new com.google.android.gms.internal.ads.zzghq().zzcK;
        int length2 = zzghdVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzghdVarArr[i3].zza(array, bArr3);
        }
        if (!com.google.android.gms.internal.ads.zzgua.zzc(str)) {
            new com.google.android.gms.internal.ads.zzghc(str.length() > 32 ? str.substring(0, 32).getBytes(java.nio.charset.StandardCharsets.UTF_8) : str.getBytes(java.nio.charset.StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] digest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            digest = this.zza.digest();
        }
        return digest;
    }

    public final com.google.android.gms.internal.ads.zzaze zzf(byte[] bArr, java.lang.String str) {
        com.google.android.gms.internal.ads.zzaze zza = com.google.android.gms.internal.ads.zzazf.zza();
        byte[] zze = zze(bArr);
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        zza.zzb(com.google.android.gms.internal.ads.zzida.zzt(zze, 0, zze.length));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(java.util.Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zza.zza(com.google.android.gms.internal.ads.zzida.zzt(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zza;
    }

    public final java.lang.String zzg(int i, java.lang.String str) {
        com.google.android.gms.internal.ads.zzaxm zzj = com.google.android.gms.internal.ads.zzaym.zzj();
        zzj.zzl(i);
        return android.util.Base64.encodeToString(zzd(((com.google.android.gms.internal.ads.zzaym) zzj.zzbu()).zzaN(), str, true), 11);
    }
}
