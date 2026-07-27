package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public interface zzagh {
    boolean zza(zzagi zzagiVar) throws IOException;

    default List zzb() {
        return zzgxm.zzi();
    }

    void zzc(zzagk zzagkVar);

    int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException;

    void zze(long j, long j2);

    void zzf();

    @SideEffectFree
    default zzagh zzg() {
        return this;
    }
}
