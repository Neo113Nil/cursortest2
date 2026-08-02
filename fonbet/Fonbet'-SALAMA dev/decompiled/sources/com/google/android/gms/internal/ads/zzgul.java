package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgul {
    public static final zzgul zza = new zzgul(new zzgum());
    public static final zzgul zzb = new zzgul(new zzguq());
    private final zzguj zzc;

    static {
        new zzgul(new zzgus());
        new zzgul(new zzgur());
        new zzgul(new zzgun());
        new zzgul(new zzgup());
        new zzgul(new zzguo());
    }

    public zzgul(zzgut zzgutVar) {
        this.zzc = !zzgjz.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgug(zzgutVar, null) : new zzguh(zzgutVar, null) : new zzgui(zzgutVar, null);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) {
        return this.zzc.zza(str);
    }
}
