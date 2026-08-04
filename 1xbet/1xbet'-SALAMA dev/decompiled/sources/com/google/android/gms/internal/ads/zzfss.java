package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzfss implements zzfti {
    public static zzfss zzc(char c3) {
        return new zzfsp(c3);
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c3);
}
