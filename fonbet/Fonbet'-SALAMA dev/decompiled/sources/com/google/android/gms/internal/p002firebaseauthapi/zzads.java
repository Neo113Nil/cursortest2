package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C0859k;
import com.google.android.gms.common.internal.C0863o;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import m3.c;
import w1.L;

/* loaded from: classes.dex */
public final class zzads {
    private final int zza;

    private zzads(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzx.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(zza.get(1)) * zzbbd.zzq.zzf) + (Integer.parseInt(zza.get(0)) * 1000000) + Integer.parseInt(zza.get(2));
        } catch (IllegalArgumentException e7) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e7));
            return -1;
        }
    }

    public final String zzb() {
        return L.i("X", Integer.toString(this.zza));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzads zza() {
        String str;
        InputStream inputStream;
        String str2;
        String str3 = "Failed to get app version for libraryName: firebase-auth";
        C0863o c0863o = C0863o.f11320c;
        c0863o.getClass();
        C0859k c0859k = C0863o.f11319b;
        D.f("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = c0863o.f11321a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str2 = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream2 = null;
            r9 = null;
            String str4 = null;
            InputStream inputStream3 = null;
            try {
                try {
                    inputStream = C0863o.class.getResourceAsStream("/firebase-auth.properties");
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e7) {
                e = e7;
                str = null;
            }
            try {
                if (inputStream != null) {
                    properties.load(inputStream);
                    str4 = properties.getProperty("version", null);
                    String str5 = "firebase-auth version is " + str4;
                    if (Log.isLoggable(c0859k.f11317b, 2)) {
                        String str6 = c0859k.f11318c;
                        if (str6 != null) {
                            str5 = str6.concat(str5);
                        }
                        Log.v("LibraryVersion", str5);
                    }
                } else if (Log.isLoggable(c0859k.f11317b, 5)) {
                    String str7 = c0859k.f11318c;
                    Log.w("LibraryVersion", str7 == null ? "Failed to get app version for libraryName: firebase-auth" : str7.concat("Failed to get app version for libraryName: firebase-auth"));
                }
            } catch (IOException e8) {
                e = e8;
                str = null;
                inputStream2 = inputStream;
                if (Log.isLoggable(c0859k.f11317b, 6)) {
                    String str8 = c0859k.f11318c;
                    if (str8 != null) {
                        str3 = str8.concat("Failed to get app version for libraryName: firebase-auth");
                    }
                    Log.e("LibraryVersion", str3, e);
                }
                inputStream = inputStream2;
                str4 = str;
                if (inputStream != null) {
                }
                if (str4 != null) {
                }
                concurrentHashMap.put("firebase-auth", str2);
                if (!TextUtils.isEmpty(str2)) {
                }
                str2 = "-1";
                return new zzads(str2);
            } catch (Throwable th2) {
                th = th2;
                inputStream3 = inputStream;
                if (inputStream3 != null) {
                    c.d(inputStream3);
                }
                throw th;
            }
            if (inputStream != null) {
                c.d(inputStream);
            }
            if (str4 != null) {
                if (Log.isLoggable(c0859k.f11317b, 3)) {
                    String str9 = c0859k.f11318c;
                    Log.d("LibraryVersion", str9 != null ? str9.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str2 = "UNKNOWN";
            } else {
                str2 = str4;
            }
            concurrentHashMap.put("firebase-auth", str2);
        }
        if (!TextUtils.isEmpty(str2) || str2.equals("UNKNOWN")) {
            str2 = "-1";
        }
        return new zzads(str2);
    }
}
