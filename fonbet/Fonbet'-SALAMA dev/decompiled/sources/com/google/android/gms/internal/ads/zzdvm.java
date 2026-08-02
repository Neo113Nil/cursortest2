package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdvm implements zzheg {
    private final zzhep zza;

    public zzdvm(zzhep zzhepVar) {
        this.zza = zzhepVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        String valueOf;
        zzfba zza = ((zzcuh) this.zza).zza();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhi)).booleanValue()) {
            String str = zza.zzd.f10753O;
            if (!TextUtils.isEmpty(str)) {
                try {
                    valueOf = new JSONObject(str).getString("request_id");
                } catch (JSONException unused) {
                }
            }
            if (zza.zzd.f10748J != null) {
                try {
                    valueOf = new JSONObject(zza.zzd.f10748J.f10718a).getString("request_id");
                } catch (JSONException unused2) {
                }
            }
        }
        valueOf = String.valueOf(C0252s.f2717f.f2722e.nextInt() & f.API_PRIORITY_OTHER);
        zzheo.zzb(valueOf);
        return valueOf;
    }
}
