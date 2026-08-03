package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkc extends com.google.android.gms.internal.measurement.zzkl {
    zzkc(com.google.android.gms.internal.measurement.zzkf zzkfVar, java.lang.String str, java.lang.Boolean bool, boolean z) {
        super(zzkfVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    @javax.annotation.Nullable
    final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.google.android.gms.internal.measurement.zzjg.zzc.matcher(str).matches()) {
                return true;
            }
            if (com.google.android.gms.internal.measurement.zzjg.zzd.matcher(str).matches()) {
                return false;
            }
        }
        java.lang.String str2 = this.zzb;
        java.lang.String obj2 = obj.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + 28 + obj2.length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(obj2);
        android.util.Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
