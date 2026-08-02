package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;

/* loaded from: classes4.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, K k, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzg = zzkh.zzg();
        byte[] zzl = zzleVar.zzl();
        byte[] zzd = zzjz.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzk = zzle.zzk(zzd, 0, zzd.length);
        zzkh zzh = zzkh.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, Continuation continuation) {
        return L.c(new zzac(this, str, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r12.zze(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzse zzseVar, Continuation continuation) {
        zzad zzadVar;
        int i;
        zzae zzaeVar;
        zzen zzenVar;
        if (continuation instanceof zzad) {
            zzadVar = (zzad) continuation;
            int i2 = zzadVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzadVar.zzd = i2 - Integer.MIN_VALUE;
                Object obj = zzadVar.zzb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzadVar.zzd;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzen zzc = zzz.zzc(this);
                    if (this.zzf.zza(this.zzb) != 3 || zzseVar.zzf() == 0) {
                        this.zzd = false;
                        zzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
                        return Unit.INSTANCE;
                    }
                    this.zze = zzi(zzseVar.zzg());
                    zzan zzanVar = this.zzc;
                    long zzf = zzseVar.zzf();
                    zzadVar.zza = this;
                    zzadVar.zze = zzc;
                    zzadVar.zzd = 1;
                    if (zzanVar.zzd(zzf, zzadVar) != coroutine_suspended) {
                        zzaeVar = this;
                        zzenVar = zzc;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = (zzen) zzadVar.zza;
                    ResultKt.throwOnFailure(obj);
                    zzenVar.zza();
                    return Unit.INSTANCE;
                }
                zzenVar = zzadVar.zze;
                zzaeVar = (zzae) zzadVar.zza;
                ResultKt.throwOnFailure(obj);
                zzan zzanVar2 = zzaeVar.zzc;
                zzadVar.zza = zzenVar;
                zzadVar.zze = null;
                zzadVar.zzd = 2;
            }
        }
        zzadVar = new zzad(this, continuation);
        Object obj2 = zzadVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzadVar.zzd;
        if (i != 0) {
        }
        zzan zzanVar22 = zzaeVar.zzc;
        zzadVar.zza = zzenVar;
        zzadVar.zze = null;
        zzadVar.zzd = 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
