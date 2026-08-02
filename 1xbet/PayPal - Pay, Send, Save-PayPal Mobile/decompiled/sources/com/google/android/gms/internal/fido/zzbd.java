package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzbd {
    private final java.lang.String zza = ",\n  ";

    static final java.lang.CharSequence zzd(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof java.lang.CharSequence ? (java.lang.CharSequence) obj : obj.toString();
    }

    public final java.lang.StringBuilder zzc(java.lang.StringBuilder sb, java.util.Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(zzd(it.next()));
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) this.zza);
                    sb.append(zzd(it.next()));
                }
            }
            return sb;
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static com.google.android.gms.internal.fido.zzbd zza(java.lang.String str) {
        return new com.google.android.gms.internal.fido.zzbd(",\n  ");
    }

    private zzbd(java.lang.String str) {
    }
}
