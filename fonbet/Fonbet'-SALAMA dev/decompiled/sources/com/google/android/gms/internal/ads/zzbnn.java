package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbnn {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbnk zza = new zzbnm();
    public static final zzbni zzb = new zzbni() { // from class: com.google.android.gms.internal.ads.zzbnl
        @Override // com.google.android.gms.internal.ads.zzbni
        public final Object zza(JSONObject jSONObject) {
            return zzbnn.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
