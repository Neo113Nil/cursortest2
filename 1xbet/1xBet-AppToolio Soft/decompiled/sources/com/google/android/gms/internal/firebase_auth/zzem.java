package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzem<T> implements zzev<T> {
    private final zzeh zzto;
    private final boolean zztp;
    private final zzfp<?, ?> zzty;
    private final zzcp<?> zztz;

    private zzem(zzfp<?, ?> zzfpVar, zzcp<?> zzcpVar, zzeh zzehVar) {
        this.zzty = zzfpVar;
        this.zztp = zzcpVar.zze(zzehVar);
        this.zztz = zzcpVar;
        this.zzto = zzehVar;
    }

    static <T> zzem<T> zza(zzfp<?, ?> zzfpVar, zzcp<?> zzcpVar, zzeh zzehVar) {
        return new zzem<>(zzfpVar, zzcpVar, zzehVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final boolean equals(T t, T t2) {
        if (!this.zzty.zzr(t).equals(this.zzty.zzr(t2))) {
            return false;
        }
        if (this.zztp) {
            return this.zztz.zzc(t).equals(this.zztz.zzc(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final int hashCode(T t) {
        int hashCode = this.zzty.zzr(t).hashCode();
        return this.zztp ? (hashCode * 53) + this.zztz.zzc(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final T newInstance() {
        return (T) this.zzto.zzea().zzec();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final void zza(T t, zzeu zzeuVar, zzco zzcoVar) throws IOException {
        boolean z;
        zzfp<?, ?> zzfpVar = this.zzty;
        zzcp<?> zzcpVar = this.zztz;
        Object zzs = zzfpVar.zzs(t);
        zzcs<?> zzd = zzcpVar.zzd(t);
        do {
            try {
                if (zzeuVar.zzda() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzeuVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzbu zzbuVar = null;
                    while (zzeuVar.zzda() != Integer.MAX_VALUE) {
                        int tag2 = zzeuVar.getTag();
                        if (tag2 == 16) {
                            i = zzeuVar.zzcl();
                            obj = zzcpVar.zza(zzcoVar, this.zzto, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzcpVar.zza(zzeuVar, obj, zzcoVar, zzd);
                            } else {
                                zzbuVar = zzeuVar.zzck();
                            }
                        } else if (!zzeuVar.zzdb()) {
                            break;
                        }
                    }
                    if (zzeuVar.getTag() != 12) {
                        throw zzdh.zzeh();
                    }
                    if (zzbuVar != null) {
                        if (obj != null) {
                            zzcpVar.zza(zzbuVar, obj, zzcoVar, zzd);
                        } else {
                            zzfpVar.zza((zzfp<?, ?>) zzs, i, zzbuVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzcpVar.zza(zzcoVar, this.zzto, tag >>> 3);
                    if (zza != null) {
                        zzcpVar.zza(zzeuVar, zza, zzcoVar, zzd);
                    } else {
                        z = zzfpVar.zza((zzfp<?, ?>) zzs, zzeuVar);
                    }
                } else {
                    z = zzeuVar.zzdb();
                }
                z = true;
            } finally {
                zzfpVar.zzf(t, zzs);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final void zza(T t, zzgj zzgjVar) throws IOException {
        int zzds;
        Object value;
        Iterator<Map.Entry<?, Object>> it = this.zztz.zzc(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzcu zzcuVar = (zzcu) next.getKey();
            if (zzcuVar.zzdu() != zzgi.MESSAGE || zzcuVar.zzdv() || zzcuVar.zzdw()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzdm) {
                zzds = zzcuVar.zzds();
                value = ((zzdm) next).zzen().zzbo();
            } else {
                zzds = zzcuVar.zzds();
                value = next.getValue();
            }
            zzgjVar.zza(zzds, value);
        }
        zzfp<?, ?> zzfpVar = this.zzty;
        zzfpVar.zzc(zzfpVar.zzr(t), zzgjVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final void zzc(T t, T t2) {
        zzex.zza(this.zzty, t, t2);
        if (this.zztp) {
            zzex.zza(this.zztz, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final void zze(T t) {
        this.zzty.zze(t);
        this.zztz.zze(t);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final int zzo(T t) {
        zzfp<?, ?> zzfpVar = this.zzty;
        int zzt = zzfpVar.zzt(zzfpVar.zzr(t)) + 0;
        return this.zztp ? zzt + this.zztz.zzc(t).zzdr() : zzt;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final boolean zzp(T t) {
        return this.zztz.zzc(t).isInitialized();
    }
}
