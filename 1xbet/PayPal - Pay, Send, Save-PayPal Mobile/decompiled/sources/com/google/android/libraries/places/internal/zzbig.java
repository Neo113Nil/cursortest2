package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbig {
    public static java.lang.Object zza(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void zzb(java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
