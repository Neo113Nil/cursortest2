package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfhl {
    public static void zza(java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        java.lang.Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfhkVar.zza(obj);
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        } catch (java.lang.NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
