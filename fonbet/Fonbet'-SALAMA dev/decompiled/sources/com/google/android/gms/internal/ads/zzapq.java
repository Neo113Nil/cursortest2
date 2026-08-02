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
public class zzapq implements zzaou {
    protected final zzaps zza;
    private final zzapp zzb;

    public zzapq(zzapp zzappVar) {
        zzaps zzapsVar = new zzaps(4096);
        this.zzb = zzappVar;
        this.zza = zzapsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    @Override // com.google.android.gms.internal.ads.zzaou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaox zza(zzapb zzapbVar) {
        zzapz zzapzVar;
        byte[] bArr;
        zzaqd zzaqdVar;
        zzaqd zzaqdVar2;
        int zzb;
        String str;
        zzapk zzapkVar;
        String str2;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                zzaok zzd = zzapbVar.zzd();
                if (zzd == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = zzd.zzb;
                    if (str3 != null) {
                        hashMap.put("If-None-Match", str3);
                    }
                    long j = zzd.zzd;
                    if (j > 0) {
                        hashMap.put("If-Modified-Since", zzapy.zzc(j));
                    }
                    map = hashMap;
                }
                zzapzVar = this.zzb.zza(zzapbVar, map);
                try {
                    int zzb2 = zzapzVar.zzb();
                    List zzd2 = zzapzVar.zzd();
                    if (zzb2 == 304) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        zzaok zzd3 = zzapbVar.zzd();
                        if (zzd3 == null) {
                            return new zzaox(304, (byte[]) null, true, elapsedRealtime2, zzd2);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!zzd2.isEmpty()) {
                            Iterator it = zzd2.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzaot) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(zzd2);
                        List list = zzd3.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzaot zzaotVar : zzd3.zzh) {
                                    if (!treeSet.contains(zzaotVar.zza())) {
                                        arrayList.add(zzaotVar);
                                    }
                                }
                            }
                        } else if (!zzd3.zzg.isEmpty()) {
                            for (Map.Entry entry : zzd3.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzaot((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzaox(304, zzd3.zza, true, elapsedRealtime2, (List) arrayList);
                    }
                    InputStream zzc = zzapzVar.zzc();
                    if (zzc != null) {
                        int zza = zzapzVar.zza();
                        zzaps zzapsVar = this.zza;
                        zzaqf zzaqfVar = new zzaqf(zzapsVar, zza);
                        try {
                            bArr3 = zzapsVar.zzb(1024);
                            while (true) {
                                try {
                                    int read = zzc.read(bArr3);
                                    if (read == -1) {
                                        break;
                                    }
                                    zzaqfVar.write(bArr3, 0, read);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        zzc.close();
                                        break;
                                    } catch (IOException unused) {
                                        zzapn.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzapsVar.zza(bArr3);
                                    zzaqfVar.close();
                                    throw th;
                                }
                            }
                            bArr2 = zzaqfVar.toByteArray();
                            try {
                                zzc.close();
                            } catch (IOException unused2) {
                                zzapn.zzd("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzapsVar.zza(bArr3);
                            zzaqfVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArr3 = null;
                        }
                    } else {
                        bArr2 = new byte[0];
                    }
                    try {
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (zzapn.zzb || elapsedRealtime3 > 3000) {
                            zzapn.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzapbVar, Long.valueOf(elapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(zzb2), Integer.valueOf(zzapbVar.zzy().zza()));
                        }
                        if (zzb2 < 200 || zzb2 > 299) {
                            throw new IOException();
                        }
                        return new zzaox(zzb2, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzd2);
                    } catch (IOException e7) {
                        e = e7;
                        bArr = bArr2;
                        if (!(e instanceof SocketTimeoutException)) {
                        }
                        zzaqdVar2 = zzaqdVar;
                        zzaop zzy = zzapbVar.zzy();
                        zzb = zzapbVar.zzb();
                        try {
                            zzapkVar = zzaqdVar2.zzb;
                            zzy.zzc(zzapkVar);
                            str2 = zzaqdVar2.zza;
                            zzapbVar.zzm(str2 + "-retry [timeout=" + zzb + "]");
                        } catch (zzapk e8) {
                            str = zzaqdVar2.zza;
                            zzapbVar.zzm(str + "-timeout-giveup [timeout=" + zzb + "]");
                            throw e8;
                        }
                    }
                } catch (IOException e9) {
                    e = e9;
                    bArr = null;
                    if (!(e instanceof SocketTimeoutException)) {
                        zzaqdVar = new zzaqd("socket", new zzapj(), null);
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzapbVar.zzk())), e);
                        }
                        if (zzapzVar == null) {
                            throw new zzaoy(e);
                        }
                        int zzb3 = zzapzVar.zzb();
                        zzapn.zzb("Unexpected response code %d for %s", Integer.valueOf(zzb3), zzapbVar.zzk());
                        if (bArr != null) {
                            zzaox zzaoxVar = new zzaox(zzb3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzapzVar.zzd());
                            if (zzb3 != 401 && zzb3 != 403) {
                                if (zzb3 < 400 || zzb3 > 499) {
                                    throw new zzapi(zzaoxVar);
                                }
                                throw new zzaoo(zzaoxVar);
                            }
                            zzaqdVar = new zzaqd("auth", new zzaoj(zzaoxVar), null);
                        } else {
                            zzaqdVar = new zzaqd("network", new zzaow(), null);
                        }
                    }
                    zzaqdVar2 = zzaqdVar;
                    zzaop zzy2 = zzapbVar.zzy();
                    zzb = zzapbVar.zzb();
                    zzapkVar = zzaqdVar2.zzb;
                    zzy2.zzc(zzapkVar);
                    str2 = zzaqdVar2.zza;
                    zzapbVar.zzm(str2 + "-retry [timeout=" + zzb + "]");
                }
            } catch (IOException e10) {
                e = e10;
                zzapzVar = null;
            }
            str2 = zzaqdVar2.zza;
            zzapbVar.zzm(str2 + "-retry [timeout=" + zzb + "]");
        }
    }
}
