package com.google.android.gms.internal.ads;

import F2.C0252s;
import I2.J;
import Y4.D;
import android.os.Bundle;
import io.sentry.protocol.Device;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeul implements zzesg {
    private final Bundle zza;

    public zzeul(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                D.E0(D.E0(jSONObject, Device.TYPE), "play_store").put("parental_controls", C0252s.f2717f.f2718a.j(this.zza));
            } catch (JSONException unused) {
                J.k("Failed putting parental controls bundle.");
            }
        }
    }
}
