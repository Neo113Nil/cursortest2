package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import android.content.Context;
import j6.a;
import java.nio.charset.StandardCharsets;
import p044f6.i;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzag implements zzaa {
    private final zzdc zza;
    private final zzap zzb;
    private boolean zzc = true;
    private String zzd = "";
    private final int zze;

    public zzag(zzdc zzdcVar, Context context, C c3, zzap zzapVar, int i7) {
        this.zza = zzdcVar;
        this.zzb = zzapVar;
        this.zze = i7;
    }

    private static final String zzi(zziv zzivVar) {
        zzhz zzhzVarZzg = zzhz.zzg();
        byte[] bArrZzl = zzivVar.zzl();
        byte[] bArrZzd = zzhr.zza().zza(zzhzVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zziv zzivVarZzk = zziv.zzk(bArrZzd, 0, bArrZzd.length);
        zzhz zzhzVarZzh = zzhz.zzh();
        byte[] bArrZzl2 = zzivVarZzk.zzl();
        return zzhzVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        return E.e(new zzae(this, str, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r13.zze(r0) == r1) goto L29;
     */
    @Override // com.google.android.recaptcha.internal.zzaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzps zzpsVar, d dVar) {
        zzaf zzafVar;
        zzag zzagVar;
        zzdf zzdfVar;
        if (dVar instanceof zzaf) {
            zzafVar = (zzaf) dVar;
            int i7 = zzafVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzafVar = new zzaf(this, dVar);
            }
        } else {
            zzafVar = new zzaf(this, dVar);
        }
        Object obj = zzafVar.zzb;
        a aVar = a.f14648a;
        int i8 = zzafVar.zzd;
        i iVar = i.f13014a;
        if (i8 != 0) {
            if (i8 == 1) {
                zzdfVar = zzafVar.zze;
                zzagVar = (zzag) zzafVar.zza;
                p003a.a.p0(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzdfVar = (zzdf) zzafVar.zza;
                p003a.a.p0(obj);
            }
            zzdfVar.zza();
            return iVar;
        }
        p003a.a.p0(obj);
        zzdf zzdfVarZzc = zzab.zzc(this);
        if (this.zze != 3 || zzpsVar.zzf() == 0) {
            this.zzc = false;
            zzdfVarZzc.zzb(new zzbj(zzbh.zzb, zzbg.zzac, null));
            return iVar;
        }
        this.zzd = zzi(zzpsVar.zzg());
        zzap zzapVar = this.zzb;
        long jZzf = zzpsVar.zzf();
        zzafVar.zza = this;
        zzafVar.zze = zzdfVarZzc;
        zzafVar.zzd = 1;
        if (zzapVar.zzd(jZzf, zzafVar) != aVar) {
            zzagVar = this;
            zzdfVar = zzdfVarZzc;
        }
        return aVar;
        zzap zzapVar2 = zzagVar.zzb;
        zzafVar.zza = zzdfVar;
        zzafVar.zze = null;
        zzafVar.zzd = 2;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
        this.zzd = zzi(zzqfVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
