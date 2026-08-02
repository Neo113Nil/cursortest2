package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;

/* loaded from: classes.dex */
public interface zzja extends Comparable<zzja>, Iterable<zziz> {
    public static final zzif zzsi = new zzjb();

    int getChildCount();

    Object getValue();

    Object getValue(boolean z);

    boolean isEmpty();

    Iterator<zziz> reverseIterator();

    String zza(zzjc zzjcVar);

    zzja zzam(zzch zzchVar);

    zzja zze(zzid zzidVar, zzja zzjaVar);

    zzja zzf(zzja zzjaVar);

    String zzfj();

    boolean zzfk();

    zzja zzfl();

    boolean zzk(zzid zzidVar);

    zzid zzl(zzid zzidVar);

    zzja zzl(zzch zzchVar, zzja zzjaVar);

    zzja zzm(zzid zzidVar);
}
