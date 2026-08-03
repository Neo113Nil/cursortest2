package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes4.dex */
public final class zzw {
    private final com.google.android.gms.internal.common.zzp zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzu zzc;

    private zzw(com.google.android.gms.internal.common.zzu zzuVar, boolean z, com.google.android.gms.internal.common.zzp zzpVar, int i) {
        this.zzc = zzuVar;
        this.zzb = z;
        this.zza = zzpVar;
    }

    public static com.google.android.gms.internal.common.zzw zza(com.google.android.gms.internal.common.zzp zzpVar) {
        return new com.google.android.gms.internal.common.zzw(new com.google.android.gms.internal.common.zzu(zzpVar), false, com.google.android.gms.internal.common.zzo.zza, Integer.MAX_VALUE);
    }

    public final com.google.android.gms.internal.common.zzw zzb() {
        return new com.google.android.gms.internal.common.zzw(this.zzc, true, this.zza, Integer.MAX_VALUE);
    }

    public final java.lang.Iterable zzc(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.common.zzt(this, charSequence);
    }

    final /* synthetic */ java.util.Iterator zze(java.lang.CharSequence charSequence) {
        return this.zzc.zza(this, charSequence);
    }

    final /* synthetic */ com.google.android.gms.internal.common.zzp zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    public final java.util.List zzd(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator zza = this.zzc.zza(this, charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (zza.hasNext()) {
            arrayList.add((java.lang.String) zza.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
