package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.annotation.GuardedBy;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzwu {
    private static final ConcurrentHashMap<Uri, zzwu> zzbox = new ConcurrentHashMap<>();
    private static final String[] zzbpe = {"key", FirebaseAnalytics.Param.VALUE};
    private final Uri uri;
    private final ContentResolver zzboy;
    private volatile Map<String, String> zzbpb;
    private final Object zzbpa = new Object();
    private final Object zzbpc = new Object();

    @GuardedBy("listenersLock")
    private final List<zzww> zzbpd = new ArrayList();
    private final ContentObserver zzboz = new zzwv(this, null);

    private zzwu(ContentResolver contentResolver, Uri uri) {
        this.zzboy = contentResolver;
        this.uri = uri;
    }

    public static zzwu zza(ContentResolver contentResolver, Uri uri) {
        zzwu zzwuVar = zzbox.get(uri);
        if (zzwuVar != null) {
            return zzwuVar;
        }
        zzwu zzwuVar2 = new zzwu(contentResolver, uri);
        zzwu putIfAbsent = zzbox.putIfAbsent(uri, zzwuVar2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        zzwuVar2.zzboy.registerContentObserver(zzwuVar2.uri, false, zzwuVar2.zzboz);
        return zzwuVar2;
    }

    private final Map<String, String> zzsj() {
        try {
            HashMap hashMap = new HashMap();
            Cursor query = this.zzboy.query(this.uri, zzbpe, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        hashMap.put(query.getString(0), query.getString(1));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void zzsk() {
        synchronized (this.zzbpc) {
            Iterator<zzww> it = this.zzbpd.iterator();
            while (it.hasNext()) {
                it.next().zzsl();
            }
        }
    }

    public final Map<String, String> zzsh() {
        Map<String, String> zzsj = zzwx.zzd("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? zzsj() : this.zzbpb;
        if (zzsj == null) {
            synchronized (this.zzbpa) {
                zzsj = this.zzbpb;
                if (zzsj == null) {
                    zzsj = zzsj();
                    this.zzbpb = zzsj;
                }
            }
        }
        return zzsj != null ? zzsj : Collections.emptyMap();
    }

    public final void zzsi() {
        synchronized (this.zzbpa) {
            this.zzbpb = null;
        }
    }
}
