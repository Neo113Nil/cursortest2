package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzhdy {
    public static zzhdy zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzhdt(cls.getSimpleName()) : new zzhdv(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
