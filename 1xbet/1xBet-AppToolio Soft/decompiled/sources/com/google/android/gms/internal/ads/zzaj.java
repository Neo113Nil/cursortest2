package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class zzaj implements zzm {
    private static final boolean DEBUG = zzaf.DEBUG;

    @Deprecated
    private final zzar zzbo;
    private final zzai zzbp;
    private final zzak zzbq;

    public zzaj(zzai zzaiVar) {
        this(zzaiVar, new zzak(4096));
    }

    private zzaj(zzai zzaiVar, zzak zzakVar) {
        this.zzbp = zzaiVar;
        this.zzbo = zzaiVar;
        this.zzbq = zzakVar;
    }

    @Deprecated
    public zzaj(zzar zzarVar) {
        this(zzarVar, new zzak(4096));
    }

    @Deprecated
    private zzaj(zzar zzarVar, zzak zzakVar) {
        this.zzbo = zzarVar;
        this.zzbp = new zzah(zzarVar);
        this.zzbq = zzakVar;
    }

    private static void zza(String str, zzr<?> zzrVar, zzae zzaeVar) throws zzae {
        zzab zzj = zzrVar.zzj();
        int zzi = zzrVar.zzi();
        try {
            zzj.zza(zzaeVar);
            zzrVar.zzb(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzi)));
        } catch (zzae e) {
            zzrVar.zzb(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzi)));
            throw e;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final byte[] zza(InputStream inputStream, int i) throws IOException, zzac {
        zzau zzauVar = new zzau(this.zzbq, i);
        try {
            if (inputStream == null) {
                throw new zzac();
            }
            byte[] zzb = this.zzbq.zzb(1024);
            while (true) {
                int read = inputStream.read(zzb);
                if (read == -1) {
                    break;
                }
                zzauVar.write(zzb, 0, read);
            }
            byte[] byteArray = zzauVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    zzaf.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzbq.zza(zzb);
            zzauVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzaf.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzbq.zza(null);
            zzauVar.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fe A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzp zzc(zzr<?> zzrVar) throws zzae {
        String str;
        zzae zzadVar;
        List<zzl> list;
        zzaq zzaqVar;
        byte[] bArr;
        Map<String, String> map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List<zzl> emptyList = Collections.emptyList();
            try {
                try {
                    zzc zzf = zzrVar.zzf();
                    if (zzf == null) {
                        map = Collections.emptyMap();
                    } else {
                        HashMap hashMap = new HashMap();
                        if (zzf.zza != null) {
                            hashMap.put("If-None-Match", zzf.zza);
                        }
                        if (zzf.zzc > 0) {
                            hashMap.put("If-Modified-Since", zzap.zzb(zzf.zzc));
                        }
                        map = hashMap;
                    }
                    zzaqVar = this.zzbp.zza(zzrVar, map);
                } catch (IOException e) {
                    e = e;
                    list = emptyList;
                    zzaqVar = null;
                }
                try {
                    int statusCode = zzaqVar.getStatusCode();
                    List<zzl> zzq = zzaqVar.zzq();
                    if (statusCode == 304) {
                        zzc zzf2 = zzrVar.zzf();
                        if (zzf2 == null) {
                            return new zzp(304, (byte[]) null, true, SystemClock.elapsedRealtime() - elapsedRealtime, zzq);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!zzq.isEmpty()) {
                            Iterator<zzl> it = zzq.iterator();
                            while (it.hasNext()) {
                                treeSet.add(it.next().getName());
                            }
                        }
                        ArrayList arrayList = new ArrayList(zzq);
                        if (zzf2.zzg != null) {
                            if (!zzf2.zzg.isEmpty()) {
                                for (zzl zzlVar : zzf2.zzg) {
                                    if (!treeSet.contains(zzlVar.getName())) {
                                        arrayList.add(zzlVar);
                                    }
                                }
                            }
                        } else if (!zzf2.zzf.isEmpty()) {
                            for (Map.Entry<String, String> entry : zzf2.zzf.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzl(entry.getKey(), entry.getValue()));
                                }
                            }
                        }
                        return new zzp(304, zzf2.data, true, SystemClock.elapsedRealtime() - elapsedRealtime, (List<zzl>) arrayList);
                    }
                    InputStream content = zzaqVar.getContent();
                    byte[] zza = content != null ? zza(content, zzaqVar.getContentLength()) : new byte[0];
                    try {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (DEBUG || elapsedRealtime2 > 3000) {
                            Object[] objArr = new Object[5];
                            objArr[0] = zzrVar;
                            objArr[1] = Long.valueOf(elapsedRealtime2);
                            objArr[2] = zza != null ? Integer.valueOf(zza.length) : "null";
                            objArr[3] = Integer.valueOf(statusCode);
                            objArr[4] = Integer.valueOf(zzrVar.zzj().zzd());
                            zzaf.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                        }
                        if (statusCode < 200 || statusCode > 299) {
                            throw new IOException();
                        }
                        return new zzp(statusCode, zza, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzq);
                    } catch (IOException e2) {
                        e = e2;
                        list = zzq;
                        bArr = zza;
                        if (zzaqVar != null) {
                            throw new zzq(e);
                        }
                        int statusCode2 = zzaqVar.getStatusCode();
                        zzaf.e("Unexpected response code %d for %s", Integer.valueOf(statusCode2), zzrVar.getUrl());
                        if (bArr != null) {
                            zzp zzpVar = new zzp(statusCode2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, list);
                            if (statusCode2 != 401 && statusCode2 != 403) {
                                if (statusCode2 >= 400 && statusCode2 <= 499) {
                                    throw new zzg(zzpVar);
                                }
                                if (statusCode2 < 500 || statusCode2 > 599) {
                                    throw new zzac(zzpVar);
                                }
                                throw new zzac(zzpVar);
                            }
                            zza("auth", zzrVar, new zza(zzpVar));
                        } else {
                            str = "network";
                            zzadVar = new zzo();
                            zza(str, zzrVar, zzadVar);
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    list = emptyList;
                    bArr = null;
                    if (zzaqVar != null) {
                    }
                }
            } catch (MalformedURLException e4) {
                String valueOf = String.valueOf(zzrVar.getUrl());
                throw new RuntimeException(valueOf.length() != 0 ? "Bad URL ".concat(valueOf) : new String("Bad URL "), e4);
            } catch (SocketTimeoutException unused) {
                str = "socket";
                zzadVar = new zzad();
                zza(str, zzrVar, zzadVar);
            }
        }
    }
}
