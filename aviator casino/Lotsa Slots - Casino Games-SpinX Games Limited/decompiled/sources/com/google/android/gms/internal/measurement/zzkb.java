package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkb extends com.google.android.gms.internal.measurement.zzkl {
    zzkb(com.google.android.gms.internal.measurement.zzkf zzkfVar, java.lang.String str, java.lang.Long l, boolean z) {
        super(zzkfVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    @javax.annotation.Nullable
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        java.lang.String str = this.zzb;
        java.lang.String obj2 = obj.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 25 + obj2.length());
        sb.append("Invalid long value for ");
        sb.append(str);
        sb.append(": ");
        sb.append(obj2);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
