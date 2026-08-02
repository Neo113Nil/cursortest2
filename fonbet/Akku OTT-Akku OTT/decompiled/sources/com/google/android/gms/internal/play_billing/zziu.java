package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
final class zziu {
    public static final /* synthetic */ int zza = 0;
    private static final zziu zzb = new zziu();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zziy zzc = new zzie();

    private zziu() {
    }

    public static zziu zza() {
        return zzb;
    }

    public final zzix zzb(Class cls) {
        zzhp.zzc(cls, "messageType");
        zzix zzixVar = (zzix) this.zzd.get(cls);
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zza2 = this.zzc.zza(cls);
        zzhp.zzc(cls, "messageType");
        zzix zzixVar2 = (zzix) this.zzd.putIfAbsent(cls, zza2);
        return zzixVar2 == null ? zza2 : zzixVar2;
    }
}
