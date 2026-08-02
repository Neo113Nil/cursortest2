package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import m3.c;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zze() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzgvy zzgvyVar = zzgvy.zzb;
                    ArrayList arrayList = new ArrayList();
                    int i7 = 256;
                    while (true) {
                        byte[] bArr3 = new byte[i7];
                        int i8 = 0;
                        while (i8 < i7) {
                            int read = fileInputStream.read(bArr3, i8, i7 - i8);
                            if (read == -1) {
                                break;
                            }
                            i8 += read;
                        }
                        zzgvy zzv = i8 == 0 ? null : zzgvy.zzv(bArr3, 0, i8);
                        if (zzv == null) {
                            break;
                        }
                        arrayList.add(zzv);
                        i7 = Math.min(i7 + i7, 8192);
                    }
                    bArr2 = zzgvy.zzu(arrayList).zzA();
                    c.d(fileInputStream);
                } catch (IOException unused) {
                    c.d(fileInputStream);
                    bArr2 = null;
                    this.zze = bArr2;
                    bArr = this.zze;
                    if (bArr != null) {
                    }
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
            this.zze = bArr2;
        }
        bArr = this.zze;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
