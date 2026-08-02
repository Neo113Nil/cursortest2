package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
final class zzke extends zzkm {
    public zzke(zzkg zzkgVar, String str, Double d, boolean z) {
        super(zzkgVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        new StringBuilder(this.zzb.length() + 27 + obj.toString().length());
        return null;
    }
}
