package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zzauo {
    private static final String[] zza = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zzb = "ad.doubleclick.net";
    private final String[] zzc = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzauj zzd;

    @Deprecated
    public zzauo(zzauj zzaujVar) {
        this.zzd = zzaujVar;
    }

    private final Uri zzg(Uri uri, String str) throws zzaup {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.zzb) && uri.getPath().contains(";")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzaup("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i7 = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i7) + "dc_ms=" + str + ";" + string.substring(i7));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzaup("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i8 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i8) + "ms=" + str + "&" + string2.substring(i8));
        } catch (UnsupportedOperationException unused2) {
            throw new zzaup("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzaup {
        try {
            return zzg(uri, this.zzd.zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaup("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) {
        return zzg(uri, this.zzd.zzf(context));
    }

    @Deprecated
    public final zzauj zzc() {
        return this.zzd;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (zzf(uri)) {
            String[] strArr = zza;
            for (int i7 = 0; i7 < 3; i7++) {
                if (uri.getPath().endsWith(strArr[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.zzc;
            for (int i7 = 0; i7 < 3; i7++) {
                if (host.endsWith(strArr[i7])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
