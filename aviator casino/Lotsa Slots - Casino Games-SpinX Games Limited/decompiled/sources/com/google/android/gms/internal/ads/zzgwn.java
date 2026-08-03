package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgwn {
    private final java.lang.Object zza;
    private final java.lang.Object zzb;
    private final java.lang.Object zzc;

    zzgwn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final java.lang.IllegalArgumentException zza() {
        java.lang.Object obj = this.zzc;
        java.lang.Object obj2 = this.zzb;
        java.lang.Object obj3 = this.zza;
        java.lang.String valueOf = java.lang.String.valueOf(obj3);
        java.lang.String valueOf2 = java.lang.String.valueOf(obj2);
        java.lang.String valueOf3 = java.lang.String.valueOf(obj3);
        java.lang.String valueOf4 = java.lang.String.valueOf(obj);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(valueOf2).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 33 + length2 + 5 + java.lang.String.valueOf(valueOf3).length() + 1 + java.lang.String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append(com.ironsource.X3.j.b);
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append(com.ironsource.X3.j.b);
        sb.append(valueOf4);
        return new java.lang.IllegalArgumentException(sb.toString());
    }
}
