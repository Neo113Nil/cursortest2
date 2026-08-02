package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
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

    public static final /* synthetic */ void zzf(zzea zzeaVar, zzrs zzrsVar, zzek zzekVar) {
        zzgz zzb = zzgz.zzb();
        int zza = zzekVar.zza();
        zzfe zzfeVar = (zzfe) zzeaVar.zzd.get(Integer.valueOf(zzrsVar.zzf()));
        if (zzfeVar == null) {
            throw new zzby(5, 2, null);
        }
        int zzg = zzrsVar.zzg();
        zzrr[] zzrrVarArr = (zzrr[]) zzrsVar.zzj().toArray(new zzrr[0]);
        zzfeVar.zza(zzg, zzekVar, (zzrr[]) Arrays.copyOf(zzrrVarArr, zzrrVarArr.length));
        if (zza == zzekVar.zza()) {
            zzekVar.zzg(zzekVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbq.zza;
        int zzk = zzrsVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbq.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzek zzekVar, InterfaceC1287d interfaceC1287d) {
        Object e7 = E.e(new zzdx(zzekVar, list, this, null), interfaceC1287d);
        return e7 == a.f14642a ? e7 : C1116i.f13008a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzek zzekVar, InterfaceC1287d interfaceC1287d) {
        Object e7 = E.e(new zzdy(exc, zzekVar, this, null), interfaceC1287d);
        return e7 == a.f14642a ? e7 : C1116i.f13008a;
    }

    @Override // com.google.android.recaptcha.internal.zzdv
    public final void zza(String str) {
        E.p(this.zza, new zzdz(new zzek(this.zzb), this, str, null));
    }
}
