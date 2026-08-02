package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzee {
    private static final com.google.android.gms.internal.fido.zzeg zza = zzb(com.google.android.gms.internal.fido.zzeg.zzd);

    private static com.google.android.gms.internal.fido.zzeg zzb(java.lang.String[] strArr) {
        com.google.android.gms.internal.fido.zzeg zzegVar;
        try {
            zzegVar = com.google.android.gms.internal.fido.zzeh.zza();
        } catch (java.lang.NoClassDefFoundError unused) {
            zzegVar = null;
        }
        if (zzegVar != null) {
            return zzegVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            try {
                return (com.google.android.gms.internal.fido.zzeg) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable th) {
                th = th;
                if (th instanceof java.lang.reflect.InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new java.lang.IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
