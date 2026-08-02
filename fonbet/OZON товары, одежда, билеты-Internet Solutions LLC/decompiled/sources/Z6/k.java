package Z6;

import Z6.r;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* loaded from: classes9.dex */
public final /* synthetic */ class k implements r.a {
    @Override // Z6.r.a
    public final Object apply(Object obj) {
        return (List) r.x(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new l());
    }
}
