package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import com.vungle.ads.internal.protos.Sdk;
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

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzauh implements zzatl {
    protected final zzauj zza;
    private final zzaug zzb;

    public zzauh(zzaug zzaugVar) {
        zzauj zzaujVar = new zzauj(4096);
        this.zzb = zzaugVar;
        this.zza = zzaujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public zzato zza(zzats zzatsVar) throws zzaub {
        byte[] bArr;
        zzaub zzatnVar;
        String str;
        int zzo;
        Map map;
        int zza;
        List zzb;
        byte[] bArr2;
        zzauj zzaujVar;
        zzauu zzauuVar;
        byte[] bArr3;
        byte[] byteArray;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            zzauq zzauqVar = null;
            try {
                zzatb zzk = zzatsVar.zzk();
                if (zzk == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = zzk.zzb;
                    if (str2 != null) {
                        hashMap.put(HttpHeaders.IF_NONE_MATCH, str2);
                    }
                    long j = zzk.zzd;
                    if (j > 0) {
                        hashMap.put(HttpHeaders.IF_MODIFIED_SINCE, zzaup.zzc(j));
                    }
                    map = hashMap;
                }
                zzauq zza2 = this.zzb.zza(zzatsVar, map);
                try {
                    zza = zza2.zza();
                    zzb = zza2.zzb();
                    if (zza == 304) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        zzatb zzk2 = zzatsVar.zzk();
                        if (zzk2 == null) {
                            return new zzato(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, (byte[]) null, true, elapsedRealtime2, zzb);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!zzb.isEmpty()) {
                            Iterator it = zzb.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzatk) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(zzb);
                        List list = zzk2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzatk zzatkVar : zzk2.zzh) {
                                    if (!treeSet.contains(zzatkVar.zza())) {
                                        arrayList.add(zzatkVar);
                                    }
                                }
                            }
                        } else if (!zzk2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzk2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzatk((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzato(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, zzk2.zza, true, elapsedRealtime2, (List) arrayList);
                    }
                    InputStream zzd = zza2.zzd();
                    if (zzd == null) {
                        bArr2 = new byte[0];
                        break;
                    }
                    int zzc = zza2.zzc();
                    zzaujVar = this.zza;
                    zzauuVar = new zzauu(zzaujVar, zzc);
                    try {
                        bArr3 = zzaujVar.zza(1024);
                        while (true) {
                            try {
                                int read = zzd.read(bArr3);
                                if (read == -1) {
                                    break;
                                }
                                zzauuVar.write(bArr3, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    zzd.close();
                                    break;
                                } catch (IOException unused) {
                                    zzaue.zza("Error occurred when closing InputStream", new Object[0]);
                                }
                                zzaujVar.zzb(bArr3);
                                zzauuVar.close();
                                throw th;
                            }
                        }
                        byteArray = zzauuVar.toByteArray();
                        try {
                            zzd.close();
                            break;
                        } catch (IOException unused2) {
                            zzaue.zza("Error occurred when closing InputStream", new Object[0]);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bArr3 = null;
                    }
                } catch (IOException e) {
                    e = e;
                    bArr = null;
                    zzauqVar = zza2;
                    if (e instanceof SocketTimeoutException) {
                        zzatnVar = new zzaua();
                        str = "socket";
                    } else {
                        if (e instanceof MalformedURLException) {
                            String zzh = zzatsVar.zzh();
                            String.valueOf(zzh);
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzh)), e);
                        }
                        if (zzauqVar == null) {
                            throw new zzatp(e);
                        }
                        int zza3 = zzauqVar.zza();
                        zzaue.zzc("Unexpected response code %d for %s", Integer.valueOf(zza3), zzatsVar.zzh());
                        if (bArr != null) {
                            zzato zzatoVar = new zzato(zza3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzauqVar.zzb());
                            if (zza3 != 401 && zza3 != 403) {
                                if (zza3 < 400 || zza3 > 499) {
                                    throw new zzatz(zzatoVar);
                                }
                                throw new zzatf(zzatoVar);
                            }
                            zzatnVar = new zzata(zzatoVar);
                            str = "auth";
                        } else {
                            zzatnVar = new zzatn();
                            str = "network";
                        }
                    }
                    zzatg zzy = zzatsVar.zzy();
                    zzo = zzatsVar.zzo();
                    try {
                        zzy.zzc(zzatnVar);
                        zzatsVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
                    } catch (zzaub e2) {
                        zzatsVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzo)));
                        throw e2;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                bArr = null;
            }
            zzatsVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
        }
        zzaujVar.zzb(bArr3);
        zzauuVar.close();
        bArr2 = byteArray;
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (zzaue.zzb || elapsedRealtime3 > 3000) {
            zzaue.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzatsVar, Long.valueOf(elapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(zza), Integer.valueOf(zzatsVar.zzy().zzb()));
        }
        if (zza < 200 || zza > 299) {
            throw new IOException();
        }
        return new zzato(zza, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzb);
    }
}
