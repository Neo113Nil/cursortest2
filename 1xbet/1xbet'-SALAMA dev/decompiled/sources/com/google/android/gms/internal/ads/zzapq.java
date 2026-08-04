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

/* JADX INFO: loaded from: classes.dex */
public class zzapq implements zzaou {
    protected final zzaps zza;
    private final zzapp zzb;

    public zzapq(zzapp zzappVar) {
        zzaps zzapsVar = new zzaps(4096);
        this.zzb = zzappVar;
        this.zza = zzapsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public zzaox zza(zzapb zzapbVar) throws Throwable {
        zzapz zzapzVarZza;
        byte[] bArr;
        zzaqd zzaqdVar;
        Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrZzb;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                zzaok zzaokVarZzd = zzapbVar.zzd();
                if (zzaokVarZzd == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str = zzaokVarZzd.zzb;
                    if (str != null) {
                        map.put("If-None-Match", str);
                    }
                    long j = zzaokVarZzd.zzd;
                    if (j > 0) {
                        map.put("If-Modified-Since", zzapy.zzc(j));
                    }
                    mapEmptyMap = map;
                }
                zzapzVarZza = this.zzb.zza(zzapbVar, mapEmptyMap);
                try {
                    int iZzb = zzapzVarZza.zzb();
                    List listZzd = zzapzVarZza.zzd();
                    if (iZzb == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzaok zzaokVarZzd2 = zzapbVar.zzd();
                        if (zzaokVarZzd2 == null) {
                            return new zzaox(304, (byte[]) null, true, jElapsedRealtime2, listZzd);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzd.isEmpty()) {
                            Iterator it = listZzd.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzaot) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzd);
                        List list = zzaokVarZzd2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzaot zzaotVar : zzaokVarZzd2.zzh) {
                                    if (!treeSet.contains(zzaotVar.zza())) {
                                        arrayList.add(zzaotVar);
                                    }
                                }
                            }
                        } else if (!zzaokVarZzd2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzaokVarZzd2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzaot((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzaox(304, zzaokVarZzd2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzc = zzapzVarZza.zzc();
                    if (inputStreamZzc != null) {
                        int iZza = zzapzVarZza.zza();
                        zzaps zzapsVar = this.zza;
                        zzaqf zzaqfVar = new zzaqf(zzapsVar, iZza);
                        try {
                            bArrZzb = zzapsVar.zzb(1024);
                            while (true) {
                                try {
                                    int i7 = inputStreamZzc.read(bArrZzb);
                                    if (i7 == -1) {
                                        break;
                                    }
                                    zzaqfVar.write(bArrZzb, 0, i7);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzc.close();
                                    } catch (IOException unused) {
                                        zzapn.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzapsVar.zza(bArrZzb);
                                    zzaqfVar.close();
                                    throw th;
                                }
                                e = e;
                                bArr = null;
                            }
                            byteArray = zzaqfVar.toByteArray();
                            try {
                                inputStreamZzc.close();
                            } catch (IOException unused2) {
                                zzapn.zzd("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzapsVar.zza(bArrZzb);
                            zzaqfVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArrZzb = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzapn.zzb || jElapsedRealtime3 > 3000) {
                            zzapn.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzapbVar, Long.valueOf(jElapsedRealtime3), byteArray != null ? Integer.valueOf(byteArray.length) : "null", Integer.valueOf(iZzb), Integer.valueOf(zzapbVar.zzy().zza()));
                        }
                        if (iZzb < 200 || iZzb > 299) {
                            throw new IOException();
                        }
                        return new zzaox(iZzb, byteArray, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzd);
                    } catch (IOException e7) {
                        e = e7;
                        bArr = byteArray;
                    }
                } catch (IOException e8) {
                    e = e8;
                    bArr = null;
                }
            } catch (IOException e9) {
                e = e9;
                zzapzVarZza = null;
            }
            if (e instanceof SocketTimeoutException) {
                zzaqdVar = new zzaqd("socket", new zzapj(), null);
            } else {
                if (e instanceof MalformedURLException) {
                    throw new RuntimeException("Bad URL ".concat(String.valueOf(zzapbVar.zzk())), e);
                }
                if (zzapzVarZza == null) {
                    throw new zzaoy(e);
                }
                int iZzb2 = zzapzVarZza.zzb();
                zzapn.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb2), zzapbVar.zzk());
                if (bArr != null) {
                    zzaox zzaoxVar = new zzaox(iZzb2, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzapzVarZza.zzd());
                    if (iZzb2 != 401 && iZzb2 != 403) {
                        if (iZzb2 < 400 || iZzb2 > 499) {
                            throw new zzapi(zzaoxVar);
                        }
                        throw new zzaoo(zzaoxVar);
                    }
                    zzaqdVar = new zzaqd("auth", new zzaoj(zzaoxVar), null);
                } else {
                    zzaqdVar = new zzaqd("network", new zzaow(), null);
                }
            }
            zzaqd zzaqdVar2 = zzaqdVar;
            zzaop zzaopVarZzy = zzapbVar.zzy();
            int iZzb3 = zzapbVar.zzb();
            try {
                zzaopVarZzy.zzc(zzaqdVar2.zzb);
                zzapbVar.zzm(zzaqdVar2.zza + "-retry [timeout=" + iZzb3 + "]");
            } catch (zzapk e10) {
                zzapbVar.zzm(zzaqdVar2.zza + "-timeout-giveup [timeout=" + iZzb3 + "]");
                throw e10;
            }
        }
    }
}
