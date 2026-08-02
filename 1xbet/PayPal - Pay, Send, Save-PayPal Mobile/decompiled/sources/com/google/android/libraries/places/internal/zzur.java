package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzur {
    static final java.util.Locale zza = java.util.Locale.ROOT;

    public static java.lang.String zza(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (obj.getClass().isArray()) {
                return obj instanceof int[] ? java.util.Arrays.toString((int[]) obj) : obj instanceof long[] ? java.util.Arrays.toString((long[]) obj) : obj instanceof byte[] ? java.util.Arrays.toString((byte[]) obj) : obj instanceof char[] ? java.util.Arrays.toString((char[]) obj) : obj instanceof short[] ? java.util.Arrays.toString((short[]) obj) : obj instanceof float[] ? java.util.Arrays.toString((float[]) obj) : obj instanceof double[] ? java.util.Arrays.toString((double[]) obj) : obj instanceof boolean[] ? java.util.Arrays.toString((boolean[]) obj) : java.util.Arrays.toString((java.lang.Object[]) obj);
            }
            java.lang.String obj2 = obj.toString();
            return obj2 != null ? obj2 : zzf(obj, "toString() returned null");
        } catch (java.lang.RuntimeException e) {
            return zze(obj, e);
        }
    }

    public static void zzb(java.util.Formattable formattable, java.lang.StringBuilder sb, com.google.android.libraries.places.internal.zzuk zzukVar) {
        int zzj = zzukVar.zzj();
        int i = zzj & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
        if (i != 0) {
            i = ((zzj & 32) != 0 ? 1 : 0) | ((zzj & 128) != 0 ? 2 : 0) | ((zzj & 2) != 0 ? 4 : 0);
        }
        int length = sb.length();
        java.util.Formatter formatter = new java.util.Formatter(sb, zza);
        try {
            formattable.formatTo(formatter, i, zzukVar.zzf(), zzukVar.zzg());
        } catch (java.lang.RuntimeException e) {
            sb.setLength(length);
            try {
                formatter.out().append(zze(formattable, e));
            } catch (java.io.IOException unused) {
            }
        }
    }

    static void zzc(java.lang.StringBuilder sb, java.lang.Number number, com.google.android.libraries.places.internal.zzuk zzukVar) {
        boolean zzk = zzukVar.zzk();
        long longValue = number.longValue();
        if (number instanceof java.lang.Long) {
            zzd(sb, longValue, zzk);
            return;
        }
        if (number instanceof java.lang.Integer) {
            zzd(sb, longValue & 4294967295L, zzk);
            return;
        }
        if (number instanceof java.lang.Byte) {
            zzd(sb, longValue & 255, zzk);
            return;
        }
        if (number instanceof java.lang.Short) {
            zzd(sb, longValue & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX, zzk);
        } else {
            if (!(number instanceof java.math.BigInteger)) {
                throw new java.lang.IllegalStateException("unsupported number type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(number.getClass()))));
            }
            java.lang.String bigInteger = ((java.math.BigInteger) number).toString(16);
            if (zzk) {
                bigInteger = bigInteger.toUpperCase(zza);
            }
            sb.append(bigInteger);
        }
    }

    private static void zzd(java.lang.StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        java.lang.String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - java.lang.Long.numberOfLeadingZeros(j)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    private static java.lang.String zze(java.lang.Object obj, java.lang.RuntimeException runtimeException) {
        java.lang.String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (java.lang.RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        return zzf(obj, simpleName);
    }

    private static java.lang.String zzf(java.lang.Object obj, java.lang.String str) {
        java.lang.String name2 = obj.getClass().getName();
        int identityHashCode = java.lang.System.identityHashCode(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 2 + java.lang.String.valueOf(identityHashCode).length() + 2 + java.lang.String.valueOf(str).length() + 1);
        sb.append("{");
        sb.append(name2);
        sb.append("@");
        sb.append(identityHashCode);
        sb.append(": ");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
