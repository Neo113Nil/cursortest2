package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zzsy extends com.google.android.libraries.places.internal.zztj implements com.google.android.libraries.places.internal.zzts {
    protected zzsy(java.util.logging.Level level, boolean z) {
        super(level, false);
    }

    @Override // com.google.android.libraries.places.internal.zztj
    protected final com.google.android.libraries.places.internal.zzwx zza() {
        return com.google.android.libraries.places.internal.zzwv.zza();
    }

    @Override // com.google.android.libraries.places.internal.zztj
    protected final boolean zzb(com.google.android.libraries.places.internal.zztn zztnVar) {
        com.google.android.libraries.places.internal.zzut zzl = zzl();
        int zza = zzl.zza();
        int i = 0;
        while (true) {
            if (i >= zza) {
                break;
            }
            if (zzl.zzb(i).zzd() != "eye3tag") {
                i++;
            } else if (zzl.zzd(com.google.android.libraries.places.internal.zzth.zza) == null) {
                com.google.android.libraries.places.internal.zztv zztvVar = com.google.android.libraries.places.internal.zzth.zzi;
                if (zzl.zzd(zztvVar) == null) {
                    zzm(zztvVar, com.google.android.libraries.places.internal.zzuf.SMALL);
                }
            }
        }
        return super.zzb(zztnVar);
    }
}
