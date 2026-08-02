package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzt {
    static java.util.Set zza(java.util.Map map) {
        java.util.Set zzc = zzc(map, "retryableStatusCodes");
        com.google.common.base.Verify.verify(zzc != null, "%s is required in retry policy", "retryableStatusCodes");
        com.google.common.base.Verify.verify(true ^ zzc.contains(com.google.android.libraries.places.internal.zzbnm.OK), "%s must not contain OK", "retryableStatusCodes");
        return zzc;
    }

    static java.util.Set zzb(java.util.Map map) {
        java.util.Set zzc = zzc(map, "nonFatalStatusCodes");
        if (zzc == null) {
            return java.util.Collections.unmodifiableSet(java.util.EnumSet.noneOf(com.google.android.libraries.places.internal.zzbnm.class));
        }
        com.google.common.base.Verify.verify(!zzc.contains(com.google.android.libraries.places.internal.zzbnm.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return zzc;
    }

    private static java.util.Set zzc(java.util.Map map, java.lang.String str) {
        com.google.android.libraries.places.internal.zzbnm zzbnmVar;
        java.util.List zza = com.google.android.libraries.places.internal.zzbud.zza(map, str);
        if (zza == null) {
            return null;
        }
        java.util.EnumSet noneOf = java.util.EnumSet.noneOf(com.google.android.libraries.places.internal.zzbnm.class);
        for (java.lang.Object obj : zza) {
            if (obj instanceof java.lang.Double) {
                java.lang.Double d = (java.lang.Double) obj;
                int intValue = d.intValue();
                com.google.common.base.Verify.verify(((double) intValue) == d.doubleValue(), "Status code %s is not integral", obj);
                zzbnmVar = com.google.android.libraries.places.internal.zzbnp.zza(intValue).zzg();
                com.google.common.base.Verify.verify(zzbnmVar.zza() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof java.lang.String)) {
                    java.lang.String valueOf = java.lang.String.valueOf(obj);
                    java.lang.String valueOf2 = java.lang.String.valueOf(obj.getClass());
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 65 + java.lang.String.valueOf(valueOf2).length());
                    sb.append("Can not convert status code ");
                    sb.append(valueOf);
                    sb.append(" to Status.Code, because its type is ");
                    sb.append(valueOf2);
                    throw new com.google.common.base.VerifyException(sb.toString());
                }
                try {
                    zzbnmVar = (com.google.android.libraries.places.internal.zzbnm) java.lang.Enum.valueOf(com.google.android.libraries.places.internal.zzbnm.class, (java.lang.String) obj);
                } catch (java.lang.IllegalArgumentException e) {
                    java.lang.String valueOf3 = java.lang.String.valueOf(obj);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf3).length() + 25);
                    sb2.append("Status code ");
                    sb2.append(valueOf3);
                    sb2.append(" is not valid");
                    throw new com.google.common.base.VerifyException(sb2.toString(), e);
                }
            }
            noneOf.add(zzbnmVar);
        }
        return java.util.Collections.unmodifiableSet(noneOf);
    }

    private zzbzt() {
    }
}
