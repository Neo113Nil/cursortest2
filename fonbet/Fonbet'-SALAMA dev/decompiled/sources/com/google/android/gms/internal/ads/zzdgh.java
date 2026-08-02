package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.sentry.protocol.SentryStackFrame;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdgh implements zzheg {
    private final zzhep zza;

    public zzdgh(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        VersionInfoParcel zza = ((zzcgw) this.zza).zza();
        P p5 = o.f1952C.f1957c;
        return new zzaxt(UUID.randomUUID().toString(), zza, SentryStackFrame.JsonKeys.NATIVE, new JSONObject(), false, true);
    }
}
