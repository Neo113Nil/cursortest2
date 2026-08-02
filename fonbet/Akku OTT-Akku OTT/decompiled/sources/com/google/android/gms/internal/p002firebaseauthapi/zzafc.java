package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C0868j;
import com.google.android.gms.common.internal.C0872n;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.IOUtils;
import defpackage.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class zzafc {
    private final int zza;

    private zzafc(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzt.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(zza.get(1)) * 1000) + (Integer.parseInt(zza.get(0)) * 1000000) + Integer.parseInt(zza.get(2));
        } catch (IllegalArgumentException e) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            String.format("Version code parsing failed for: %s with exception %s.", str, e);
            return -1;
        }
    }

    public final String zzb() {
        return g.a("X", Integer.toString(this.zza));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafc zza() {
        String str;
        InputStream inputStream;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C0872n c0872n = C0872n.c;
        c0872n.getClass();
        C0868j c0868j = C0872n.b;
        C0875q.e("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = c0872n.a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str3 = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream2 = null;
            r8 = null;
            r8 = null;
            r8 = null;
            String str7 = null;
            inputStream2 = null;
            try {
                try {
                    inputStream = C0872n.class.getResourceAsStream("/firebase-auth.properties");
                } catch (IOException unused) {
                    str = null;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (inputStream != null) {
                    properties.load(inputStream);
                    str7 = properties.getProperty("version", null);
                    String str8 = "firebase-auth version is " + str7;
                    if (Log.isLoggable(c0868j.a, 2) && (str6 = c0868j.b) != null) {
                        str6.concat(str8);
                    }
                } else if (Log.isLoggable(c0868j.a, 5) && (str5 = c0868j.b) != null) {
                    str5.concat("Failed to get app version for libraryName: firebase-auth");
                }
            } catch (IOException unused2) {
                str = str7;
                inputStream2 = inputStream;
                if (Log.isLoggable(c0868j.a, 6) && (str2 = c0868j.b) != null) {
                    str2.concat("Failed to get app version for libraryName: firebase-auth");
                }
                inputStream = inputStream2;
                str7 = str;
                if (inputStream != null) {
                }
                if (str7 != null) {
                }
                concurrentHashMap.put("firebase-auth", str3);
                if (!TextUtils.isEmpty(str3)) {
                }
                str3 = "-1";
                return new zzafc(str3);
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    IOUtils.closeQuietly(inputStream2);
                }
                throw th;
            }
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
            if (str7 != null) {
                if (Log.isLoggable(c0868j.a, 3) && (str4 = c0868j.b) != null) {
                    str4.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str3 = "UNKNOWN";
            } else {
                str3 = str7;
            }
            concurrentHashMap.put("firebase-auth", str3);
        }
        if (!TextUtils.isEmpty(str3) || str3.equals("UNKNOWN")) {
            str3 = "-1";
        }
        return new zzafc(str3);
    }
}
