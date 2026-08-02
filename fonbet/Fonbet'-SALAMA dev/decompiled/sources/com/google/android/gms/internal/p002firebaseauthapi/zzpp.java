package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzpp extends RuntimeException {
    public zzpp(String str) {
        super(str);
    }

    public static <T> T zza(zzpo<T> zzpoVar) {
        try {
            return zzpoVar.zza();
        } catch (Exception e7) {
            throw new zzpp(e7);
        }
    }

    private zzpp(Throwable th) {
        super(th);
    }

    public zzpp(String str, Throwable th) {
        super(str, th);
    }
}
