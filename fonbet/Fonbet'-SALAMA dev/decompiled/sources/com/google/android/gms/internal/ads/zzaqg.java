package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public class zzaqg extends zzapb {
    private final Object zza;
    private final zzapg zzb;

    public zzaqg(int i7, String str, zzapg zzapgVar, zzapf zzapfVar) {
        super(i7, str, zzapfVar);
        this.zza = new Object();
        this.zzb = zzapgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final zzaph zzh(zzaox zzaoxVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaoxVar.zzb;
            Map map = zzaoxVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i7 = 1;
                while (true) {
                    if (i7 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i7].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i7++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaoxVar.zzb);
        }
        return zzaph.zzb(str, zzapy.zzb(zzaoxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzapg zzapgVar;
        synchronized (this.zza) {
            zzapgVar = this.zzb;
        }
        zzapgVar.zza(str);
    }
}
