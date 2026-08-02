package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.Timeline;
import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.common.collect.I;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ServerSideAdInsertionMediaSource) this.b).lambda$setAdPlaybackStates$0((I) this.c, (Timeline) this.d);
                break;
            default:
                QueryInterceptorDatabase.query$lambda$9((QueryInterceptorDatabase) this.b, (SupportSQLiteQuery) this.c, (QueryInterceptorProgram) this.d);
                break;
        }
    }
}
