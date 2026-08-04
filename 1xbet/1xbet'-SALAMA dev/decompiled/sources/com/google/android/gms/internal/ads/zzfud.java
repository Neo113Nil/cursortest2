package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfud {
    public static zzftz zza(zzftz zzftzVar) {
        if ((zzftzVar instanceof zzfuc) || (zzftzVar instanceof zzfua)) {
            return zzftzVar;
        }
        return zzftzVar instanceof Serializable ? new zzfua(zzftzVar) : new zzfuc(zzftzVar);
    }
}
