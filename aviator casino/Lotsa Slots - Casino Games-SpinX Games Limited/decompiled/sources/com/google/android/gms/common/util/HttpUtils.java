package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class HttpUtils {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    public static java.util.Map<java.lang.String, java.lang.String> parse(java.net.URI uri, java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> emptyMap = java.util.Collections.emptyMap();
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new java.util.HashMap<>();
            com.google.android.gms.internal.common.zzw zza2 = com.google.android.gms.internal.common.zzw.zza(com.google.android.gms.internal.common.zzp.zzb(com.ironsource.B5.U));
            java.util.Iterator it = com.google.android.gms.internal.common.zzw.zza(com.google.android.gms.internal.common.zzp.zzb(kotlin.text.Typography.amp)).zzb().zzc(rawQuery).iterator();
            while (it.hasNext()) {
                java.util.List zzd = zza2.zzd((java.lang.String) it.next());
                if (zzd.isEmpty() || zzd.size() > 2) {
                    throw new java.lang.IllegalArgumentException("bad parameter");
                }
                emptyMap.put(zza((java.lang.String) zzd.get(0), str), zzd.size() == 2 ? zza((java.lang.String) zzd.get(1), str) : null);
            }
        }
        return emptyMap;
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = com.google.android.exoplayer2.C.ISO88591_NAME;
        }
        try {
            return java.net.URLDecoder.decode(str, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
