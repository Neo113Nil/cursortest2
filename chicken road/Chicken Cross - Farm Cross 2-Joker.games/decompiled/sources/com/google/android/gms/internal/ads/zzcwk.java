package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzcwk {
    private final zzcyj zza;
    private final View zzb;
    private final zzfle zzc;
    private final zzclm zzd;

    public zzcwk(View view, zzclm zzclmVar, zzcyj zzcyjVar, zzfle zzfleVar) {
        this.zzb = view;
        this.zzd = zzclmVar;
        this.zza = zzcyjVar;
        this.zzc = zzfleVar;
    }

    public final zzclm zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcyj zzc() {
        return this.zza;
    }

    public final zzfle zzd() {
        return this.zzc;
    }

    public zzdfb zze(Set set) {
        return new zzdfb(set);
    }
}
