package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzff implements com.google.android.libraries.places.internal.zzbie {
    private final com.google.android.libraries.places.internal.zzbih zza;

    @Override // com.google.android.libraries.places.internal.zzcez
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.common.collect.ImmutableList zzb() {
        com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) ((com.google.android.libraries.places.internal.zzbik) this.zza).zzb());
        com.google.android.libraries.places.internal.zzbig.zza(copyOf);
        return copyOf;
    }

    public static com.google.android.libraries.places.internal.zzff zzc(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        return new com.google.android.libraries.places.internal.zzff(zzbihVar);
    }

    private zzff(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        this.zza = zzbihVar;
    }
}
