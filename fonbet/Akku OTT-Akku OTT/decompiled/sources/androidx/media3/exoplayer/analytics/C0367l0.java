package androidx.media3.exoplayer.analytics;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.datatransport.runtime.firebase.transport.c;
import com.google.android.datatransport.runtime.scheduling.persistence.m;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: androidx.media3.exoplayer.analytics.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0367l0 implements ListenerSet.Event, m.a, ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0367l0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.m.a
    public Object apply(Object obj) {
        com.google.android.datatransport.runtime.scheduling.persistence.m mVar = (com.google.android.datatransport.runtime.scheduling.persistence.m) this.b;
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        mVar.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
        while (rawQuery.moveToNext()) {
            try {
                mVar.s(rawQuery.getInt(0), c.a.MAX_RETRIES_REACHED, rawQuery.getString(1));
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        rawQuery.close();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onMediaMetadataChanged((AnalyticsListener.EventTime) this.b, (MediaMetadata) this.c);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlaylistMetadataChanged((AnalyticsListener.EventTime) this.b, (com.google.android.exoplayer2.MediaMetadata) this.c);
                break;
        }
    }
}
