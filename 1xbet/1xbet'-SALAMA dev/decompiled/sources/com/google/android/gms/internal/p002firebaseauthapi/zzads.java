package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C0815k;
import com.google.android.gms.common.internal.C0819o;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import p090m3.c;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzads {
    private final int zza;

    private zzads(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzx.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(listZza.get(1)) * zzbbd.zzq.zzf) + (Integer.parseInt(listZza.get(0)) * 1000000) + Integer.parseInt(listZza.get(2));
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

    public static zzads zza() throws Throwable {
        InputStream resourceAsStream;
        String str;
        String strConcat = "Failed to get app version for libraryName: firebase-auth";
        C0819o c0819o = C0819o.f11320c;
        c0819o.getClass();
        C0815k c0815k = C0819o.f11319b;
        D.f("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = c0819o.f11321a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            InputStream inputStream2 = null;
            try {
                try {
                    resourceAsStream = C0819o.class.getResourceAsStream("/firebase-auth.properties");
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty("version", null);
                            String strConcat2 = "firebase-auth version is " + property;
                            if (Log.isLoggable(c0815k.f11317b, 2)) {
                                String str2 = c0815k.f11318c;
                                if (str2 != null) {
                                    strConcat2 = str2.concat(strConcat2);
                                }
                                Log.v("LibraryVersion", strConcat2);
                            }
                        } else if (Log.isLoggable(c0815k.f11317b, 5)) {
                            String str3 = c0815k.f11318c;
                            Log.w("LibraryVersion", str3 == null ? "Failed to get app version for libraryName: firebase-auth" : str3.concat("Failed to get app version for libraryName: firebase-auth"));
                        }
                    } catch (IOException e7) {
                        e = e7;
                        inputStream = resourceAsStream;
                        if (Log.isLoggable(c0815k.f11317b, 6)) {
                            String str4 = c0815k.f11318c;
                            if (str4 != null) {
                                strConcat = str4.concat("Failed to get app version for libraryName: firebase-auth");
                            }
                            Log.e("LibraryVersion", strConcat, e);
                        }
                        resourceAsStream = inputStream;
                        property = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = resourceAsStream;
                        if (inputStream2 != null) {
                            c.d(inputStream2);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e8) {
                e = e8;
            }
            if (resourceAsStream != null) {
                c.d(resourceAsStream);
            }
            if (property == null) {
                if (Log.isLoggable(c0815k.f11317b, 3)) {
                    String str5 = c0815k.f11318c;
                    Log.d("LibraryVersion", str5 != null ? str5.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str = "UNKNOWN";
            } else {
                str = property;
            }
            concurrentHashMap.put("firebase-auth", str);
        }
        if (TextUtils.isEmpty(str) || str.equals("UNKNOWN")) {
            str = "-1";
        }
        return new zzads(str);
    }
}
