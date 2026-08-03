package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzflc {
    private final com.google.android.gms.internal.ads.zzbap zza;

    public zzflc(com.google.android.gms.internal.ads.zzbap zzbapVar) {
        this.zza = zzbapVar;
    }

    public final android.net.Uri zza(android.net.Uri uri, android.content.Context context, android.view.View view, android.app.Activity activity) throws com.google.android.gms.internal.ads.zzbaq {
        try {
            return zzb(uri, this.zza.zzb().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new com.google.android.gms.internal.ads.zzbaq("Provided Uri is not in a valid state");
        }
    }

    private static final android.net.Uri zzb(android.net.Uri uri, java.lang.String str) throws com.google.android.gms.internal.ads.zzbaq {
        if (uri != null) {
            try {
                try {
                    java.lang.String host = uri.getHost();
                    java.lang.String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new com.google.android.gms.internal.ads.zzbaq("Parameter already exists: dc_ms");
                            }
                            java.lang.String uri2 = uri.toString();
                            int indexOf = uri2.indexOf(";adurl");
                            if (indexOf != -1) {
                                int i = indexOf + 1;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(uri2.substring(0, i));
                                sb.append("dc_ms=");
                                sb.append(str);
                                sb.append(";");
                                sb.append((java.lang.CharSequence) uri2, i, uri2.length());
                                return android.net.Uri.parse(sb.toString());
                            }
                            java.lang.String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new java.lang.UnsupportedOperationException();
                            }
                            int indexOf2 = uri2.indexOf(encodedPath);
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                            sb2.append(";dc_ms=");
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((java.lang.CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                            return android.net.Uri.parse(sb2.toString());
                        }
                    }
                } catch (java.lang.UnsupportedOperationException unused) {
                    throw new com.google.android.gms.internal.ads.zzbaq("Provided Uri is not in a valid state");
                }
            } catch (java.lang.NullPointerException unused2) {
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new com.google.android.gms.internal.ads.zzbaq("Query parameter already exists: ms");
        }
        if (uri == null) {
            throw new java.lang.UnsupportedOperationException();
        }
        java.lang.String uri3 = uri.toString();
        int indexOf3 = uri3.indexOf("&adurl");
        if (indexOf3 == -1) {
            indexOf3 = uri3.indexOf("?adurl");
        }
        if (indexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i2 = indexOf3 + 1;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(uri3.substring(0, i2));
        sb3.append("ms=");
        sb3.append(str);
        sb3.append(com.ironsource.X3.j.c);
        sb3.append((java.lang.CharSequence) uri3, i2, uri3.length());
        return android.net.Uri.parse(sb3.toString());
    }
}
