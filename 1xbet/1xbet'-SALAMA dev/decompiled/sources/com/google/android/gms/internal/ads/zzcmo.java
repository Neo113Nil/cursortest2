package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.sentry.protocol.SentryStackFrame;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcmo implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzcmo(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        VersionInfoParcel versionInfoParcelZza = ((zzcgw) this.zza).zza();
        JSONObject jSONObject = (JSONObject) this.zzb.zzb();
        String str = (String) this.zzc.zzb();
        boolean zEquals = SentryStackFrame.JsonKeys.NATIVE.equals(str);
        P p5 = o.f1952C.f1957c;
        return new zzaxt(UUID.randomUUID().toString(), versionInfoParcelZza, str, jSONObject, false, zEquals);
    }
}
