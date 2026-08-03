package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvi {
    static void zza(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            java.lang.String valueOf = java.lang.String.valueOf(obj2);
            java.lang.String.valueOf(valueOf);
            throw new java.lang.NullPointerException("null key in entry: null=".concat(java.lang.String.valueOf(valueOf)));
        }
        if (obj2 != null) {
            return;
        }
        java.lang.String obj3 = obj.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj3.length() + 26);
        sb.append("null value in entry: ");
        sb.append(obj3);
        sb.append("=null");
        throw new java.lang.NullPointerException(sb.toString());
    }

    static int zzb(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 29 + java.lang.String.valueOf(i).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
