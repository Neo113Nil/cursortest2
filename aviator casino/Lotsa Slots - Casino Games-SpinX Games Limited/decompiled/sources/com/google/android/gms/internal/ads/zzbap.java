package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbap {
    private static final java.lang.String[] zzc = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final java.lang.String zza = "ad.doubleclick.net";
    private final java.lang.String[] zzb = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final com.google.android.gms.internal.ads.zzbak zzd;

    @java.lang.Deprecated
    public zzbap(com.google.android.gms.internal.ads.zzbak zzbakVar) {
        this.zzd = zzbakVar;
    }

    private final android.net.Uri zzf(android.net.Uri uri, java.lang.String str) throws com.google.android.gms.internal.ads.zzbaq {
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.zza)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new com.google.android.gms.internal.ads.zzbaq("Parameter already exists: dc_ms");
                        }
                        java.lang.String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return android.net.Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                        }
                        java.lang.String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return android.net.Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                }
            } catch (java.lang.NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new com.google.android.gms.internal.ads.zzbaq("Query parameter already exists: ms");
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
            return android.net.Uri.parse(uri3.substring(0, i2) + "ms=" + str + com.ironsource.X3.j.c + uri3.substring(i2));
        } catch (java.lang.UnsupportedOperationException unused2) {
            throw new com.google.android.gms.internal.ads.zzbaq("Provided Uri is not in a valid state");
        }
    }

    public final boolean zza(android.net.Uri uri) {
        uri.getClass();
        try {
            java.lang.String host = uri.getHost();
            java.lang.String[] strArr = this.zzb;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return false;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzbak zzb() {
        return this.zzd;
    }

    @java.lang.Deprecated
    public final void zzc(android.view.MotionEvent motionEvent) {
        this.zzd.zzd(motionEvent);
    }

    @java.lang.Deprecated
    public final android.net.Uri zzd(android.net.Uri uri, android.content.Context context, android.view.View view, android.app.Activity activity) throws com.google.android.gms.internal.ads.zzbaq {
        try {
            return zzf(uri, this.zzd.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (java.lang.UnsupportedOperationException unused) {
            throw new com.google.android.gms.internal.ads.zzbaq("Provided Uri is not in a valid state");
        }
    }

    public final boolean zze(android.net.Uri uri) {
        if (zza(uri)) {
            java.lang.String[] strArr = zzc;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
