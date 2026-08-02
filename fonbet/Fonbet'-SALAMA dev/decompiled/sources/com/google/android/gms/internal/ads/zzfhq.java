package com.google.android.gms.internal.ads;

import F2.C0254t;
import J2.i;
import J2.m;
import J2.n;
import J2.q;
import android.net.Uri;
import e1.k;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfhq {
    private final q zza;
    private final n zzb;
    private final zzgbo zzc;
    private final zzfhr zzd;

    public zzfhq(q qVar, n nVar, zzgbo zzgboVar, zzfhr zzfhrVar) {
        this.zza = qVar;
        this.zzb = nVar;
        this.zzc = zzgboVar;
        this.zzd = zzfhrVar;
    }

    public static I3.b zzc(zzfhq zzfhqVar, int i7, long j, String str, m mVar) {
        if (mVar != m.f3829c) {
            return zzgbc.zzh(mVar);
        }
        q qVar = zzfhqVar.zza;
        long j3 = ((i) qVar).f3823b;
        if (i7 != 1) {
            j3 = (long) (((i) qVar).f3824c * j);
        }
        return zzfhqVar.zze(str, j3, i7 + 1);
    }

    private final I3.b zze(final String str, final long j, final int i7) {
        final String str2;
        q qVar = this.zza;
        if (i7 > ((i) qVar).f3822a) {
            zzfhr zzfhrVar = this.zzd;
            if (zzfhrVar == null || !((i) qVar).f3825d) {
                return zzgbc.zzh(m.f3829c);
            }
            zzfhrVar.zza(str, "", 2);
            return zzgbc.zzh(m.f3830d);
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziC)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i7));
            str2 = k.f(String.valueOf(clearQuery.build()), "&", encodedQuery);
        } else {
            str2 = str;
        }
        zzgaj zzgajVar = new zzgaj() { // from class: com.google.android.gms.internal.ads.zzfhp
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzfhq.zzc(zzfhq.this, i7, j, str, (m) obj);
            }
        };
        return j == 0 ? zzgbc.zzn(this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfho
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m zza;
                zza = zzfhq.this.zzb.zza(str2);
                return zza;
            }
        }), zzgajVar, this.zzc) : zzgbc.zzn(this.zzc.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfhn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m zza;
                zza = zzfhq.this.zzb.zza(str2);
                return zza;
            }
        }, j, TimeUnit.MILLISECONDS), zzgajVar, this.zzc);
    }

    public final I3.b zzd(String str) {
        try {
            return zze(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgbc.zzh(m.f3828b);
        }
    }
}
