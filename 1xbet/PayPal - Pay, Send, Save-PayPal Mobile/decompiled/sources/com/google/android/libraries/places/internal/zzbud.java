package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbud {
    @javax.annotation.Nullable
    public static java.util.List zza(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.util.List) {
            return (java.util.List) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    @javax.annotation.Nullable
    public static java.util.List zzb(java.util.Map map, java.lang.String str) {
        java.util.List zza = zza(map, str);
        if (zza == null) {
            return null;
        }
        zzj(zza);
        return zza;
    }

    @javax.annotation.Nullable
    public static java.util.List zzc(java.util.Map map, java.lang.String str) {
        java.util.List zza = zza(map, str);
        if (zza == null) {
            return null;
        }
        for (int i = 0; i < zza.size(); i++) {
            if (!(zza.get(i) instanceof java.lang.String)) {
                throw new java.lang.ClassCastException(java.lang.String.format(java.util.Locale.US, "value '%s' for idx %d in '%s' is not string", zza.get(i), java.lang.Integer.valueOf(i), zza));
            }
        }
        return zza;
    }

    @javax.annotation.Nullable
    public static java.util.Map zzd(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    @javax.annotation.Nullable
    public static java.lang.Double zze(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (!(obj instanceof java.lang.String)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
        } catch (java.lang.NumberFormatException unused) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    @javax.annotation.Nullable
    public static java.lang.Integer zzf(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (!(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        java.lang.Double d = (java.lang.Double) obj;
        int intValue = d.intValue();
        if (intValue == d.doubleValue()) {
            return java.lang.Integer.valueOf(intValue);
        }
        throw new java.lang.ClassCastException("Number expected to be integer: ".concat(java.lang.String.valueOf(d)));
    }

    @javax.annotation.Nullable
    public static java.lang.String zzg(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static java.lang.Long zzh(java.util.Map map, java.lang.String str) {
        boolean z;
        java.lang.String str2;
        int i;
        java.lang.String zzg = zzg(map, str);
        if (zzg == null) {
            return null;
        }
        try {
            if (zzg.isEmpty() || zzg.charAt(zzg.length() - 1) != 's') {
                throw new java.text.ParseException("Invalid duration string: ".concat(zzg), 0);
            }
            if (zzg.charAt(0) == '-') {
                zzg = zzg.substring(1);
                z = true;
            } else {
                z = false;
            }
            java.lang.String substring = zzg.substring(0, zzg.length() - 1);
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str2 = "";
            }
            long parseLong = java.lang.Long.parseLong(substring);
            if (str2.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (int i2 = 0; i2 < 9; i2++) {
                    i *= 10;
                    if (i2 < str2.length()) {
                        if (str2.charAt(i2) < '0' || str2.charAt(i2) > '9') {
                            throw new java.text.ParseException("Invalid nanoseconds.", 0);
                        }
                        i += str2.charAt(i2) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                }
            }
            if (parseLong < 0) {
                throw new java.text.ParseException("Invalid duration string: ".concat(java.lang.String.valueOf(zzg)), 0);
            }
            if (z) {
                parseLong = -parseLong;
                i = -i;
            }
            if (i <= -1000000000 || i >= 1000000000) {
                try {
                    parseLong = com.google.common.math.LongMath.checkedAdd(parseLong, i / 1000000000);
                    i %= 1000000000;
                } catch (java.lang.IllegalArgumentException unused) {
                    throw new java.text.ParseException("Duration value is out of range.", 0);
                }
            }
            if (parseLong > 0 && i < 0) {
                i += 1000000000;
                parseLong--;
            }
            if (parseLong < 0 && i > 0) {
                i -= 1000000000;
                parseLong++;
            }
            if (parseLong < -315576000000L || parseLong > 315576000000L) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", java.lang.Long.valueOf(parseLong), java.lang.Integer.valueOf(i)));
            }
            long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(parseLong);
            long j = i;
            long j2 = nanos + j;
            if (!(((nanos ^ j2) >= 0) | ((nanos ^ j) < 0))) {
                j2 = ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return java.lang.Long.valueOf(j2);
        } catch (java.text.ParseException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @javax.annotation.Nullable
    public static java.lang.Boolean zzi(java.util.Map map, java.lang.String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        throw new java.lang.ClassCastException(java.lang.String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static java.util.List zzj(java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof java.util.Map)) {
                throw new java.lang.ClassCastException(java.lang.String.format(java.util.Locale.US, "value %s for idx %d in %s is not object", list.get(i), java.lang.Integer.valueOf(i), list));
            }
        }
        return list;
    }
}
