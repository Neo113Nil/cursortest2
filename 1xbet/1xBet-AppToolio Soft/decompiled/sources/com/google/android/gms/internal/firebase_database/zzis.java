package com.google.android.gms.internal.firebase_database;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class zzis implements Comparator<zziz> {
    public final int zza(zziz zzizVar, zziz zzizVar2, boolean z) {
        return z ? compare(zzizVar2, zzizVar) : compare(zzizVar, zzizVar2);
    }

    public abstract zziz zzf(zzid zzidVar, zzja zzjaVar);

    public abstract zziz zzfw();

    public abstract String zzfx();

    public abstract boolean zzi(zzja zzjaVar);
}
