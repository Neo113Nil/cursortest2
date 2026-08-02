package com.google.android.gms.internal.stable;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zze {

    public static class zza implements BaseColumns {
        private static HashMap<Uri, zzh> zzagq = new HashMap<>();

        private static zzh zza(ContentResolver contentResolver, Uri uri) {
            zzh zzhVar = zzagq.get(uri);
            if (zzhVar == null) {
                zzh zzhVar2 = new zzh();
                zzagq.put(uri, zzhVar2);
                contentResolver.registerContentObserver(uri, true, new zzf(null, zzhVar2));
                return zzhVar2;
            }
            if (!zzhVar.zzagu.getAndSet(false)) {
                return zzhVar;
            }
            synchronized (zzhVar) {
                zzhVar.zzags.clear();
                zzhVar.zzagt = new Object();
            }
            return zzhVar;
        }

        protected static String zza(ContentResolver contentResolver, Uri uri, String str) {
            zzh zza;
            String str2;
            synchronized (zza.class) {
                zza = zza(contentResolver, uri);
            }
            synchronized (zza) {
                Object obj = zza.zzagt;
                if (zza.zzags.containsKey(str)) {
                    return zza.zzags.get(str);
                }
                Cursor cursor = null;
                try {
                    try {
                        Cursor query = contentResolver.query(uri, new String[]{FirebaseAnalytics.Param.VALUE}, "name=?", new String[]{str}, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    String string = query.getString(0);
                                    zza(zza, obj, str, string);
                                    if (query != null) {
                                        query.close();
                                    }
                                    return string;
                                }
                            } catch (SQLException e) {
                                e = e;
                                cursor = query;
                                str2 = null;
                                Log.e("GoogleSettings", "Can't get key " + str + " from " + uri, e);
                                if (cursor == null) {
                                    return str2;
                                }
                                cursor.close();
                                return str2;
                            } catch (Throwable th) {
                                th = th;
                                cursor = query;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        zza(zza, obj, str, null);
                        if (query != null) {
                            query.close();
                        }
                        return null;
                    } catch (SQLException e2) {
                        e = e2;
                        str2 = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        private static void zza(zzh zzhVar, Object obj, String str, String str2) {
            synchronized (zzhVar) {
                if (obj == zzhVar.zzagt) {
                    zzhVar.zzags.put(str, str2);
                }
            }
        }
    }
}
