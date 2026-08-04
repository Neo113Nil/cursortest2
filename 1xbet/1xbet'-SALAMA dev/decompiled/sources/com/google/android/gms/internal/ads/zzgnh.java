package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgnh extends RuntimeException {
    public zzgnh(String str) {
        super(str);
    }

    public static Object zza(zzgng zzgngVar) {
        try {
            return zzgngVar.zza();
        } catch (Exception e7) {
            throw new zzgnh(e7);
        }
    }

    public zzgnh(String str, Throwable th) {
        super(str, th);
    }

    public zzgnh(Throwable th) {
        super(th);
    }
}
