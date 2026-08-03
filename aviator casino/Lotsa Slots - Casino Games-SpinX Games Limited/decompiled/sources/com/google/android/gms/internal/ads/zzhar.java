package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhar implements java.security.PrivilegedExceptionAction {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzhar zza = new com.google.android.gms.internal.ads.zzhar();

    private /* synthetic */ zzhar() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ java.lang.Object run() {
        int i = com.google.android.gms.internal.ads.zzhaq.zzd.zzg;
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        throw new java.lang.NoSuchFieldError("the Unsafe");
    }
}
