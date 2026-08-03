package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgxf {
    static java.lang.Object zza(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        it.remove();
        return next;
    }

    static void zzb(java.util.Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
