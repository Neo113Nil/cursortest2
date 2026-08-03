package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhef {
    private static final java.util.concurrent.CopyOnWriteArrayList zza = new java.util.concurrent.CopyOnWriteArrayList();

    public static com.google.android.gms.internal.ads.zzhee zza(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Iterator it = zza.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzhee zzheeVar = (com.google.android.gms.internal.ads.zzhee) it.next();
            if (zzheeVar.zza()) {
                return zzheeVar;
            }
        }
        java.lang.String.valueOf(str);
        throw new java.security.GeneralSecurityException("No KMS client does support: ".concat(java.lang.String.valueOf(str)));
    }
}
