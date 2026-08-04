package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdvm implements zzheg {
    private final zzhep zza;

    public zzdvm(zzhep zzhepVar) {
        this.zza = zzhepVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        String strValueOf;
        zzfba zzfbaVarZza = ((zzcuh) this.zza).zza();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhi)).booleanValue()) {
            String str = zzfbaVarZza.zzd.f10753O;
            if (!TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        if (zzfbaVarZza.zzd.f10748J != null) {
                            try {
                                strValueOf = new JSONObject(zzfbaVarZza.zzd.f10748J.f10718a).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(C0252s.f2717f.f2722e.nextInt() & f.API_PRIORITY_OTHER);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(C0252s.f2717f.f2722e.nextInt() & f.API_PRIORITY_OTHER);
                        }
                    }
                } catch (JSONException unused2) {
                }
            } else if (zzfbaVarZza.zzd.f10748J != null) {
                strValueOf = new JSONObject(zzfbaVarZza.zzd.f10748J.f10718a).getString("request_id");
                if (TextUtils.isEmpty(strValueOf)) {
                    strValueOf = String.valueOf(C0252s.f2717f.f2722e.nextInt() & f.API_PRIORITY_OTHER);
                }
            } else {
                strValueOf = String.valueOf(C0252s.f2717f.f2722e.nextInt() & f.API_PRIORITY_OTHER);
            }
        } else {
            strValueOf = String.valueOf(C0252s.f2717f.f2722e.nextInt() & f.API_PRIORITY_OTHER);
        }
        zzheo.zzb(strValueOf);
        return strValueOf;
    }
}
