package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkd extends com.google.android.gms.internal.measurement.zzkl {
    zzkd(com.google.android.gms.internal.measurement.zzkf zzkfVar, java.lang.String str, java.lang.Double d, boolean z) {
        super(zzkfVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    @javax.annotation.Nullable
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        java.lang.String str = this.zzb;
        java.lang.String obj2 = obj.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 27 + obj2.length());
        sb.append("Invalid double value for ");
        sb.append(str);
        sb.append(": ");
        sb.append(obj2);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
