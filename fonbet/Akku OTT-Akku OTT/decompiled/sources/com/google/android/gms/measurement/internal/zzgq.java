package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.C0873o;
import com.google.android.gms.common.internal.C0878u;
import com.google.android.gms.common.internal.C0880w;
import com.google.android.gms.common.internal.InterfaceC0879v;
import com.google.android.gms.common.internal.service.d;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzgq {
    private static zzgq zza;
    private final zzic zzb;
    private final InterfaceC0879v zzc;
    private final AtomicLong zzd = new AtomicLong(-1);

    private zzgq(Context context, zzic zzicVar) {
        this.zzc = new d(context, d.a, new C0880w("measurement:api"), g.a.c);
        this.zzb = zzicVar;
    }

    public static zzgq zza(zzic zzicVar) {
        if (zza == null) {
            zza = new zzgq(zzicVar.zzaY(), zzicVar);
        }
        return zza;
    }

    public final synchronized void zzb(int i, int i2, long j, long j2, int i3) {
        final long elapsedRealtime = this.zzb.zzaZ().elapsedRealtime();
        AtomicLong atomicLong = this.zzd;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((d) this.zzc).a(new C0878u(0, Arrays.asList(new C0873o(36301, i2, 0, j, j2, null, null, 0, i3)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgp
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                zzgq.this.zzc(elapsedRealtime, exc);
            }
        });
    }

    public final /* synthetic */ void zzc(long j, Exception exc) {
        this.zzd.set(j);
    }
}
