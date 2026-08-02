package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzum implements com.google.android.libraries.places.internal.zztu {
    private static final java.util.Set zza = new java.util.HashSet(java.util.Arrays.asList(java.lang.Boolean.class, java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Float.class, java.lang.Double.class));
    private final java.lang.StringBuilder zzd;
    private boolean zze = false;
    private final java.lang.String zzb = "[CONTEXT ";
    private final java.lang.String zzc = " ]";

    private static int zzc(java.lang.String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zztu
    public final void zza(java.lang.String str, java.lang.Object obj) {
        if (this.zze) {
            this.zzd.append(' ');
        } else {
            java.lang.StringBuilder sb = this.zzd;
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE) != -1) ? '\n' : ' ');
            }
            sb.append(this.zzb);
            this.zze = true;
        }
        java.lang.StringBuilder sb2 = this.zzd;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (zza.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        java.lang.String obj2 = obj.toString();
        int i = 0;
        while (true) {
            int zzc = zzc(obj2, i);
            if (zzc == -1) {
                sb2.append((java.lang.CharSequence) obj2, i, obj2.length());
                sb2.append('\"');
                return;
            }
            sb2.append((java.lang.CharSequence) obj2, i, zzc);
            i = zzc + 1;
            char charAt = obj2.charAt(zzc);
            if (charAt == '\t') {
                charAt = 't';
            } else if (charAt == '\n') {
                charAt = 'n';
            } else if (charAt == '\r') {
                charAt = 'r';
            } else if (charAt != '\"' && charAt != '\\') {
                sb2.append((char) 65533);
            }
            sb2.append("\\");
            sb2.append(charAt);
        }
    }

    public final void zzb() {
        if (this.zze) {
            this.zzd.append(this.zzc);
        }
    }

    public zzum(java.lang.String str, java.lang.String str2, java.lang.StringBuilder sb) {
        this.zzd = sb;
    }
}
