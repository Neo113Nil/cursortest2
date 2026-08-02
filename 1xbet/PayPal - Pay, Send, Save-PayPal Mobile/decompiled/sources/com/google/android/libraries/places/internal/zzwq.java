package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzwq extends com.google.android.libraries.places.internal.zzwr {
    private final com.google.android.libraries.places.internal.zzwp zza;

    private zzwq(com.google.android.libraries.places.internal.zzuk zzukVar, int i, com.google.android.libraries.places.internal.zzwp zzwpVar) {
        super(zzukVar, i);
        this.zza = zzwpVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        zzukVar.zzl(sb);
        sb.append(true != zzukVar.zzk() ? 't' : 'T');
        sb.append(zzwpVar.zzb());
    }

    public static com.google.android.libraries.places.internal.zzwr zza(com.google.android.libraries.places.internal.zzwp zzwpVar, com.google.android.libraries.places.internal.zzuk zzukVar, int i) {
        return new com.google.android.libraries.places.internal.zzwq(zzukVar, i, zzwpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzwr
    protected final void zzb(com.google.android.libraries.places.internal.zzws zzwsVar, java.lang.Object obj) {
        zzwsVar.zzd(obj, this.zza, zzd());
    }
}
