package com.google.android.gms.internal.fido;

import androidx.browser.browseractions.a;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* loaded from: classes4.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzdk(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        StringBuilder d = a.d(name, DomExceptionUtils.SEPARATOR);
        d.append(this.zza);
        d.append("[");
        d.append(name2);
        d.append("]");
        return d.toString();
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z, boolean z2) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }
}
