package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzaz implements com.google.android.gms.internal.play_games_inputmapping.zzaq {
    private static final java.util.Set zza = new java.util.HashSet(java.util.Arrays.asList(java.lang.Boolean.class, java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Float.class, java.lang.Double.class));
    private final java.lang.StringBuilder zzd;
    private boolean zze = false;
    private final java.lang.String zzb = "[CONTEXT ";
    private final java.lang.String zzc = " ]";

    public zzaz(java.lang.String str, java.lang.String str2, java.lang.StringBuilder sb) {
        this.zzd = sb;
    }

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

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaq
    public final void zza(java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (this.zze) {
            this.zzd.append(' ');
        } else {
            if (this.zzd.length() > 0) {
                java.lang.StringBuilder sb = this.zzd;
                sb.append((sb.length() > 1000 || this.zzd.indexOf("\n") != -1) ? '\n' : ' ');
            }
            this.zzd.append(this.zzb);
            this.zze = true;
        }
        java.lang.StringBuilder sb2 = this.zzd;
        sb2.append(str);
        sb2.append(com.ironsource.B5.U);
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
}
