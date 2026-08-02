package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzvl {
    private static final com.google.android.libraries.places.internal.zzvn zza = zzb(com.google.android.libraries.places.internal.zzvn.zzd);

    private static com.google.android.libraries.places.internal.zzvn zzb(java.lang.String[] strArr) {
        com.google.android.libraries.places.internal.zzvt zzvtVar;
        try {
            zzvtVar = com.google.android.libraries.places.internal.zzvu.zza;
        } catch (java.lang.NoClassDefFoundError unused) {
            zzvtVar = null;
        }
        if (zzvtVar != null) {
            return zzvtVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            try {
                return (com.google.android.libraries.places.internal.zzvn) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof java.lang.reflect.InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new java.lang.IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
