package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import j6.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p044f6.i;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzea implements zzdv {
    private final C zza;
    private final zzem zzb;
    private final zzge zzc;
    private final Map zzd;

    public zzea(C c3, zzem zzemVar, zzge zzgeVar, Map map) {
        this.zza = c3;
        this.zzb = zzemVar;
        this.zzc = zzgeVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzea zzeaVar, zzrs zzrsVar, zzek zzekVar) throws zzby {
        zzgz zzgzVarZzb = zzgz.zzb();
        int iZza = zzekVar.zza();
        zzfe zzfeVar = (zzfe) zzeaVar.zzd.get(Integer.valueOf(zzrsVar.zzf()));
        if (zzfeVar == null) {
            throw new zzby(5, 2, null);
        }
        int iZzg = zzrsVar.zzg();
        zzrr[] zzrrVarArr = (zzrr[]) zzrsVar.zzj().toArray(new zzrr[0]);
        zzfeVar.zza(iZzg, zzekVar, (zzrr[]) Arrays.copyOf(zzrrVarArr, zzrrVarArr.length));
        if (iZza == zzekVar.zza()) {
            zzekVar.zzg(zzekVar.zza() + 1);
        }
        zzgzVarZzb.zzf();
        long jZza = zzgzVarZzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbq.zza;
        int iZzk = zzrsVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbq.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzek zzekVar, d dVar) throws Throwable {
        Object objE = E.e(new zzdx(zzekVar, list, this, null), dVar);
        return objE == a.f14648a ? objE : i.f13014a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzek zzekVar, d dVar) throws Throwable {
        Object objE = E.e(new zzdy(exc, zzekVar, this, null), dVar);
        return objE == a.f14648a ? objE : i.f13014a;
    }

    @Override // com.google.android.recaptcha.internal.zzdv
    public final void zza(String str) {
        E.p(this.zza, new zzdz(new zzek(this.zzb), this, str, null));
    }
}
