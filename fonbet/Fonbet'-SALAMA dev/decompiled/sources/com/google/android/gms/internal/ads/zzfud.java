package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class zzfud {
    public static zzftz zza(zzftz zzftzVar) {
        return ((zzftzVar instanceof zzfuc) || (zzftzVar instanceof zzfua)) ? zzftzVar : zzftzVar instanceof Serializable ? new zzfua(zzftzVar) : new zzfuc(zzftzVar);
    }
}
