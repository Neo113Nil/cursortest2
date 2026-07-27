package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzasg {
    public final int zza;
    public final long zzb;

    private zzasg(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzasg zza(zzagi zzagiVar, zzeu zzeuVar) throws IOException {
        zzagiVar.zzi(zzeuVar.zzi(), 0, 8);
        zzeuVar.zzh(0);
        return new zzasg(zzeuVar.zzB(), zzeuVar.zzA());
    }
}
