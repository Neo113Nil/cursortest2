package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public class zzdq extends com.google.android.gms.internal.play_games_inputmapping.zzdo {
    private static final java.lang.String zza;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L4;
     */
    static {
        java.lang.String str;
        try {
            str = java.lang.System.getProperty("line.separator");
        } catch (java.lang.SecurityException unused) {
        }
        str = "\n";
        zza = str;
    }

    static int zzc(java.lang.String str, int i) throws com.google.android.gms.internal.play_games_inputmapping.zzdp {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw com.google.android.gms.internal.play_games_inputmapping.zzdp.zzc("trailing unquoted '%' character", str, i);
                }
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdo
    public final void zzb(java.lang.StringBuilder sb, java.lang.String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((java.lang.CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((java.lang.CharSequence) str, i3, i);
                    sb.append(zza);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((java.lang.CharSequence) str, i3, i2);
        }
    }
}
