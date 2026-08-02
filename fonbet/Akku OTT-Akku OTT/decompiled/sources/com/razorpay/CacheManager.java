package com.razorpay;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes4.dex */
class CacheManager {
    static File cacheDir;

    public static void expireKey(String str) {
        put(str, "", -1L);
    }

    public static String get(String str) {
        if (str.equalsIgnoreCase("rzp_payment_preferences")) {
            File file = new File(cacheDir.getPath(), str);
            if (!file.exists()) {
                Logger.e("Error fetching cache entry.");
                return null;
            }
            try {
                if (!file.getAbsolutePath().equalsIgnoreCase(file.getPath() + DomExceptionUtils.SEPARATOR + str)) {
                    return null;
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                CacheEntry cacheEntry = (CacheEntry) objectInputStream.readObject();
                fileInputStream.close();
                objectInputStream.close();
                if (l$1_I$l$(cacheEntry.expiryTime)) {
                    purge(str);
                    return null;
                }
                Logger.d(str.concat(" fetched successfully from cache"));
                Logger.d(cacheEntry.data);
                return cacheEntry.data;
            } catch (Exception e) {
                AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
                Logger.e("Error fetching cache entry", e);
            }
        }
        return null;
    }

    public static boolean hasExpired(String str) {
        if (str.equalsIgnoreCase("rzp_payment_preferences")) {
            File file = new File(cacheDir.getPath(), str);
            if (!file.exists()) {
                return true;
            }
            try {
                if (!file.getAbsolutePath().equalsIgnoreCase(file.getPath() + DomExceptionUtils.SEPARATOR + str)) {
                    return true;
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                CacheEntry cacheEntry = (CacheEntry) objectInputStream.readObject();
                fileInputStream.close();
                objectInputStream.close();
                if (l$1_I$l$(cacheEntry.expiryTime)) {
                    Logger.d("Cache has expired for key ".concat(str));
                    return true;
                }
                Logger.d("Cache has NOT expired for key ".concat(str));
                return false;
            } catch (Exception e) {
                AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
                Logger.e("Error fetching cache entry", e);
            }
        }
        return true;
    }

    public static void init(Context context) {
        cacheDir = context.getCacheDir();
    }

    private static boolean l$1_I$l$(long j) {
        return j <= 0 || System.currentTimeMillis() > j;
    }

    public static void purge(String str) {
        if (str.equalsIgnoreCase("rzp_payment_preferences")) {
            new File(cacheDir.getPath(), str).delete();
        }
    }

    public static void put(String str, String str2, long j) {
        if (str.equalsIgnoreCase("rzp_payment_preferences")) {
            File file = new File(cacheDir.getPath(), str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
                    Logger.e("Could not store string in cache", e);
                }
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                CacheEntry cacheEntry = new CacheEntry(str2, j + System.currentTimeMillis());
                objectOutputStream.writeObject(cacheEntry);
                objectOutputStream.close();
                fileOutputStream.close();
                Logger.d(String.format("%s stored successfully in cache with expiry time of %d", str, Long.valueOf(cacheEntry.expiryTime)));
                Logger.d("Cache value: " + str2);
            } catch (Exception e2) {
                AnalyticsUtil.reportError(e2.getMessage(), "S1", e2.getMessage());
                Logger.e("Could not store string in cache", e2);
            }
        }
    }
}
