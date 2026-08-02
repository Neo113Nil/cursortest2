package androidx.media3.exoplayer.hls;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import com.google.android.datatransport.runtime.b;
import com.google.android.datatransport.runtime.scheduling.persistence.m;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Consumer, m.a, OnCompleteListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        HlsInterstitialsAdsLoader.lambda$stop$4((AdsMediaSource) this.a, (AdPlaybackState) this.b, (HlsInterstitialsAdsLoader.Listener) obj);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.m.a
    public Object apply(Object obj) {
        com.google.android.datatransport.runtime.scheduling.persistence.m mVar = (com.google.android.datatransport.runtime.scheduling.persistence.m) this.a;
        com.google.android.datatransport.runtime.d dVar = (com.google.android.datatransport.runtime.d) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        com.google.android.datatransport.runtime.scheduling.persistence.e eVar = mVar.d;
        ArrayList y = mVar.y(sQLiteDatabase, dVar, eVar.c());
        for (com.google.android.datatransport.e eVar2 : com.google.android.datatransport.e.values()) {
            if (eVar2 != dVar.c) {
                int c = eVar.c() - y.size();
                if (c <= 0) {
                    break;
                }
                y.addAll(mVar.y(sQLiteDatabase, dVar.d(eVar2), c));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < y.size(); i++) {
            sb.append(((com.google.android.datatransport.runtime.scheduling.persistence.g) y.get(i)).b());
            if (i < y.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new m.b(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = y.listIterator();
        while (listIterator.hasNext()) {
            com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(gVar.b()))) {
                b.a m = gVar.a().m();
                for (m.b bVar : (Set) hashMap.get(Long.valueOf(gVar.b()))) {
                    m.a(bVar.a, bVar.b);
                }
                listIterator.set(new com.google.android.datatransport.runtime.scheduling.persistence.b(gVar.b(), gVar.c(), m.b()));
            }
        }
        return y;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAnalyticsPlugin.logEvent$lambda$0((FlutterFirebaseAnalyticsPlugin) this.a, (Function1) this.b, task);
    }
}
