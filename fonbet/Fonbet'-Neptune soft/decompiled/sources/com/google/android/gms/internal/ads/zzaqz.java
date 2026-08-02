package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzaqz implements zzapn {
    private final zzaqy zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqz(zzaqy zzaqyVar, int i) {
        this.zzc = zzaqyVar;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    static String zzh(zzaqx zzaqxVar) throws IOException {
        return new String(zzm(zzaqxVar, zzf(zzaqxVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzaqx zzaqxVar, long j) throws IOException {
        long zza = zzaqxVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaqxVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + zza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqw zzaqwVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzaqwVar.zza - ((zzaqw) map.get(str)).zza;
        } else {
            this.zzb += zzaqwVar.zza;
        }
        map.put(str, zzaqwVar);
    }

    private final void zzp(String str) {
        zzaqw zzaqwVar = (zzaqw) this.zza.remove(str);
        if (zzaqwVar != null) {
            this.zzb -= zzaqwVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final synchronized zzapm zza(String str) {
        zzaqw zzaqwVar = (zzaqw) this.zza.get(str);
        if (zzaqwVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzaqx zzaqxVar = new zzaqx(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                String str2 = zzaqw.zza(zzaqxVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzaqp.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, str2);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzaqxVar, zzaqxVar.zza());
                zzapm zzapmVar = new zzapm();
                zzapmVar.zza = zzm;
                zzapmVar.zzb = zzaqwVar.zzc;
                zzapmVar.zzc = zzaqwVar.zzd;
                zzapmVar.zzd = zzaqwVar.zze;
                zzapmVar.zze = zzaqwVar.zzf;
                zzapmVar.zzf = zzaqwVar.zzg;
                List<zzapv> list = zzaqwVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzapv zzapvVar : list) {
                    treeMap.put(zzapvVar.zza(), zzapvVar.zzb());
                }
                zzapmVar.zzg = treeMap;
                zzapmVar.zzh = Collections.unmodifiableList(list);
                return zzapmVar;
            } finally {
                zzaqxVar.close();
            }
        } catch (IOException e) {
            zzaqp.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final synchronized void zzb() {
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzaqx zzaqxVar = new zzaqx(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaqw zza2 = zzaqw.zza(zzaqxVar);
                            zza2.zza = length;
                            zzo(zza2.zzb, zza2);
                            zzaqxVar.close();
                        } catch (Throwable th) {
                            zzaqxVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzaqp.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final synchronized void zzc(String str, boolean z) {
        zzapm zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final synchronized void zzd(String str, zzapm zzapmVar) {
        int i;
        int i2;
        long j;
        char c;
        float f;
        long j2 = this.zzb;
        int length = zzapmVar.zza.length;
        long j3 = j2 + length;
        int i3 = this.zzd;
        float f2 = 0.9f;
        if (j3 <= i3 || length <= i3 * 0.9f) {
            File zzg = zzg(str);
            int i4 = 0;
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzaqw zzaqwVar = new zzaqw(str, zzapmVar);
                try {
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaqwVar.zzb);
                        String str2 = zzaqwVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzaqwVar.zzd);
                        zzk(bufferedOutputStream, zzaqwVar.zze);
                        zzk(bufferedOutputStream, zzaqwVar.zzf);
                        zzk(bufferedOutputStream, zzaqwVar.zzg);
                        List<zzapv> list = zzaqwVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzapv zzapvVar : list) {
                                zzl(bufferedOutputStream, zzapvVar.zza());
                                zzl(bufferedOutputStream, zzapvVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzapmVar.zza);
                        bufferedOutputStream.close();
                        zzaqwVar.zza = zzg.length();
                        zzo(str, zzaqwVar);
                        long j4 = this.zzb;
                        int i5 = this.zzd;
                        if (j4 >= i5) {
                            boolean z = zzaqp.zzb;
                            if (z) {
                                zzaqp.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j5 = this.zzb;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i6 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = i4;
                                    j = j5;
                                    c = 1;
                                    break;
                                }
                                zzaqw zzaqwVar2 = (zzaqw) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaqwVar2.zzb;
                                if (zzg(str3).delete()) {
                                    i2 = i4;
                                    j = j5;
                                    f = f2;
                                    c = 1;
                                    this.zzb -= zzaqwVar2.zza;
                                } else {
                                    f = f2;
                                    i2 = i4;
                                    j = j5;
                                    c = 1;
                                    String zzq = zzq(str3);
                                    Object[] objArr = new Object[2];
                                    objArr[i2] = str3;
                                    objArr[1] = zzq;
                                    zzaqp.zza("Could not delete cache entry for key=%s, filename=%s", objArr);
                                }
                                it.remove();
                                i6++;
                                if (this.zzb < i5 * f) {
                                    break;
                                }
                                j5 = j;
                                i4 = i2;
                                f2 = f;
                            }
                            if (z) {
                                Integer valueOf = Integer.valueOf(i6);
                                Long valueOf2 = Long.valueOf(this.zzb - j);
                                Long valueOf3 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
                                Object[] objArr2 = new Object[3];
                                objArr2[i2] = valueOf;
                                objArr2[c] = valueOf2;
                                objArr2[2] = valueOf3;
                                zzaqp.zzd("pruned %d files, %d bytes, %d ms", objArr2);
                            }
                        }
                    } catch (IOException e) {
                        zzaqp.zza("%s", e.toString());
                        bufferedOutputStream.close();
                        zzaqp.zza("Failed to write header for %s", zzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!zzg.delete()) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i] = zzg.getAbsolutePath();
                        zzaqp.zza("Could not clean up file %s", objArr3);
                    }
                    if (!this.zzc.zza().exists()) {
                        zzaqp.zza("Re-initializing cache after external clearing.", new Object[i]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzb();
                    }
                }
            } catch (IOException unused2) {
                i = i4;
            }
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
        zzaqp.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaqz(File file, int i) {
        this.zzc = new zzaqv(this, file);
    }
}
