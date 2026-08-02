package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import e1.k;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class zzapx implements zzaol {
    private final zzapw zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzapx(zzapw zzapwVar, int i7) {
        this.zzc = zzapwVar;
    }

    public static int zze(InputStream inputStream) {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzapv zzapvVar) {
        return new String(zzm(zzapvVar, zzf(zzapvVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i7) {
        outputStream.write(i7 & 255);
        outputStream.write((i7 >> 8) & 255);
        outputStream.write((i7 >> 16) & 255);
        outputStream.write((i7 >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j) {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzapv zzapvVar, long j) {
        long zza = zzapvVar.zza();
        if (j >= 0 && j <= zza) {
            int i7 = (int) j;
            if (i7 == j) {
                byte[] bArr = new byte[i7];
                new DataInputStream(zzapvVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder j3 = k.j("streamToBytes length=", ", maxLength=", j);
        j3.append(zza);
        throw new IOException(j3.toString());
    }

    private static int zzn(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzapu zzapuVar) {
        if (this.zza.containsKey(str)) {
            this.zzb = (zzapuVar.zza - ((zzapu) this.zza.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzapuVar.zza;
        }
        this.zza.put(str, zzapuVar);
    }

    private final void zzp(String str) {
        zzapu zzapuVar = (zzapu) this.zza.remove(str);
        if (zzapuVar != null) {
            this.zzb -= zzapuVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final synchronized zzaok zza(String str) {
        zzapu zzapuVar = (zzapu) this.zza.get(str);
        if (zzapuVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzapv zzapvVar = new zzapv(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzapu zza = zzapu.zza(zzapvVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzapn.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzapvVar, zzapvVar.zza());
                zzaok zzaokVar = new zzaok();
                zzaokVar.zza = zzm;
                zzaokVar.zzb = zzapuVar.zzc;
                zzaokVar.zzc = zzapuVar.zzd;
                zzaokVar.zzd = zzapuVar.zze;
                zzaokVar.zze = zzapuVar.zzf;
                zzaokVar.zzf = zzapuVar.zzg;
                List<zzaot> list = zzapuVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaot zzaotVar : list) {
                    treeMap.put(zzaotVar.zza(), zzaotVar.zzb());
                }
                zzaokVar.zzg = treeMap;
                zzaokVar.zzh = Collections.unmodifiableList(zzapuVar.zzh);
                return zzaokVar;
            } finally {
                zzapvVar.close();
            }
        } catch (IOException e7) {
            zzapn.zza("%s: %s", zzg.getAbsolutePath(), e7.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final synchronized void zzb() {
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzapv zzapvVar = new zzapv(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzapu zza2 = zzapu.zza(zzapvVar);
                            zza2.zza = length;
                            zzo(zza2.zzb, zza2);
                            zzapvVar.close();
                        } catch (Throwable th) {
                            zzapvVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzapn.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final synchronized void zzc(String str, boolean z4) {
        zzaok zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final synchronized void zzd(String str, zzaok zzaokVar) {
        try {
            long j = this.zzb;
            int length = zzaokVar.zza.length;
            long j3 = j + length;
            int i7 = this.zzd;
            if (j3 <= i7 || length <= i7 * 0.9f) {
                File zzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                    zzapu zzapuVar = new zzapu(str, zzaokVar);
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzapuVar.zzb);
                        String str2 = zzapuVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzapuVar.zzd);
                        zzk(bufferedOutputStream, zzapuVar.zze);
                        zzk(bufferedOutputStream, zzapuVar.zzf);
                        zzk(bufferedOutputStream, zzapuVar.zzg);
                        List<zzaot> list = zzapuVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzaot zzaotVar : list) {
                                zzl(bufferedOutputStream, zzaotVar.zza());
                                zzl(bufferedOutputStream, zzaotVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaokVar.zza);
                        bufferedOutputStream.close();
                        zzapuVar.zza = zzg.length();
                        zzo(str, zzapuVar);
                        if (this.zzb >= this.zzd) {
                            if (zzapn.zzb) {
                                zzapn.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j7 = this.zzb;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i8 = 0;
                            while (it.hasNext()) {
                                zzapu zzapuVar2 = (zzapu) ((Map.Entry) it.next()).getValue();
                                if (zzg(zzapuVar2.zzb).delete()) {
                                    this.zzb -= zzapuVar2.zza;
                                } else {
                                    String str3 = zzapuVar2.zzb;
                                    zzapn.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i8++;
                                if (this.zzb < this.zzd * 0.9f) {
                                    break;
                                }
                            }
                            if (zzapn.zzb) {
                                zzapn.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i8), Long.valueOf(this.zzb - j7), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e7) {
                        zzapn.zza("%s", e7.toString());
                        bufferedOutputStream.close();
                        zzapn.zza("Failed to write header for %s", zzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!zzg.delete()) {
                        zzapn.zza("Could not clean up file %s", zzg.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzapn.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (delete) {
            return;
        }
        zzapn.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzapx(File file, int i7) {
        this.zzc = new zzapt(this, file);
    }
}
