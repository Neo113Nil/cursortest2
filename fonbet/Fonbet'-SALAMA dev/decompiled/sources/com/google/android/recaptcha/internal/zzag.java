package com.google.android.recaptcha.internal;

import D6.C;
import D6.E;
import a.AbstractC0603a;
import android.content.Context;
import f6.C1116i;
import i6.InterfaceC1287d;
import j6.a;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
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
        zzhz zzg = zzhz.zzg();
        byte[] zzl = zzivVar.zzl();
        byte[] zzd = zzhr.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zziv zzk = zziv.zzk(zzd, 0, zzd.length);
        zzhz zzh = zzhz.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
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
    public final Object zzc(String str, InterfaceC1287d interfaceC1287d) {
        return E.e(new zzae(this, str, null), interfaceC1287d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r13.zze(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.recaptcha.internal.zzaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzps zzpsVar, InterfaceC1287d interfaceC1287d) {
        zzaf zzafVar;
        int i7;
        zzag zzagVar;
        zzdf zzdfVar;
        if (interfaceC1287d instanceof zzaf) {
            zzafVar = (zzaf) interfaceC1287d;
            int i8 = zzafVar.zzd;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzd = i8 - Integer.MIN_VALUE;
                Object obj = zzafVar.zzb;
                a aVar = a.f14642a;
                i7 = zzafVar.zzd;
                C1116i c1116i = C1116i.f13008a;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    zzdf zzc = zzab.zzc(this);
                    if (this.zze != 3 || zzpsVar.zzf() == 0) {
                        this.zzc = false;
                        zzc.zzb(new zzbj(zzbh.zzb, zzbg.zzac, null));
                        return c1116i;
                    }
                    this.zzd = zzi(zzpsVar.zzg());
                    zzap zzapVar = this.zzb;
                    long zzf = zzpsVar.zzf();
                    zzafVar.zza = this;
                    zzafVar.zze = zzc;
                    zzafVar.zzd = 1;
                    if (zzapVar.zzd(zzf, zzafVar) != aVar) {
                        zzagVar = this;
                        zzdfVar = zzc;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzdfVar = (zzdf) zzafVar.zza;
                    AbstractC0603a.p0(obj);
                    zzdfVar.zza();
                    return c1116i;
                }
                zzdfVar = zzafVar.zze;
                zzagVar = (zzag) zzafVar.zza;
                AbstractC0603a.p0(obj);
                zzap zzapVar2 = zzagVar.zzb;
                zzafVar.zza = zzdfVar;
                zzafVar.zze = null;
                zzafVar.zzd = 2;
            }
        }
        zzafVar = new zzaf(this, interfaceC1287d);
        Object obj2 = zzafVar.zzb;
        a aVar2 = a.f14642a;
        i7 = zzafVar.zzd;
        C1116i c1116i2 = C1116i.f13008a;
        if (i7 != 0) {
        }
        zzap zzapVar22 = zzagVar.zzb;
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
