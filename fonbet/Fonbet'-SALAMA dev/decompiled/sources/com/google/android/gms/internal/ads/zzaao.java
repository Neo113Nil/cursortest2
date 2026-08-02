package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzaao implements zzbi {
    private final zzbz zza;

    public zzaao(zzbz zzbzVar) {
        this.zza = zzbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbi
    public final zzbj zza(Context context, zzk zzkVar, zzn zznVar, zzcb zzcbVar, Executor executor, zzbx zzbxVar, List list, long j) {
        try {
            try {
                return ((zzbi) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzbz.class).newInstance(this.zza)).zza(context, zzkVar, zznVar, zzcbVar, executor, zzbxVar, list, 0L);
            } catch (Exception e7) {
                e = e7;
                if (e instanceof zzby) {
                    throw ((zzby) e);
                }
                throw new zzby(e, -9223372036854775807L);
            }
        } catch (Exception e8) {
            e = e8;
        }
    }
}
