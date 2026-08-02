package com.google.android.recaptcha.internal;

import android.os.Build;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class zzn implements zzy {
    private final zzek zza;

    public zzn(zzek zzekVar) {
        this.zza = zzekVar;
    }

    private static final zzth zzg(String str) {
        zztg zzf = zzth.zzf();
        zzf.zzw(str);
        return (zzth) zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, Continuation continuation) {
        String joinToString$default;
        zzen zzb = zzz.zzb(this, str);
        zztf zzf = zzti.zzf();
        zzth zzg = zzg(Build.MANUFACTURER);
        zzth zzg2 = zzg(Build.MODEL);
        zzth zzg3 = zzg(Build.DEVICE);
        zzth zzg4 = zzg(Build.HARDWARE);
        zzth zzg5 = zzg(Build.FINGERPRINT);
        zzth zzg6 = zzg(Build.PRODUCT);
        zzth zzg7 = zzg(Build.BOARD);
        zzth zzg8 = zzg(Build.BRAND);
        joinToString$default = ArraysKt___ArraysKt.joinToString$default(Build.SUPPORTED_ABIS, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
        zzth zzg9 = zzg(joinToString$default);
        long j = Build.TIME;
        zztg zzf2 = zzth.zzf();
        zzf2.zzv(j);
        zzf.zze(CollectionsKt.listOf((Object[]) new zzth[]{zzg, zzg2, zzg3, zzg4, zzg5, zzg6, zzg7, zzg8, zzg9, (zzth) zzf2.zzk(), zzg(Build.ID), zzg(Build.BOOTLOADER), zzg(Build.DISPLAY), zzg(Build.TYPE), zzg(Build.TAGS)}));
        zzb.zza();
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, Continuation continuation) {
        zzz.zzc(this).zza();
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return true;
    }
}
