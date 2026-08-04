package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzfno {
    private final zzaxm zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfno(zzaxm zzaxmVar, File file, File file2, File file3) {
        this.zza = zzaxmVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzaxm zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j) {
        return this.zza.zzb() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] zze() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzA;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzgvy zzgvyVar = zzgvy.zzb;
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i7 = 0;
                        while (i7 < iMin) {
                            int i8 = fileInputStream.read(bArr, i7, iMin - i7);
                            if (i8 == -1) {
                                break;
                            }
                            i7 += i8;
                        }
                        zzgvy zzgvyVarZzv = i7 == 0 ? null : zzgvy.zzv(bArr, 0, i7);
                        if (zzgvyVarZzv == null) {
                            break;
                        }
                        arrayList.add(zzgvyVarZzv);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrZzA = zzgvy.zzu(arrayList).zzA();
                    c.d(fileInputStream);
                } catch (IOException unused) {
                    c.d(fileInputStream);
                    bArrZzA = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    c.d(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.zze = bArrZzA;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}
