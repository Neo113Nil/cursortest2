package Z6;

import Z6.r;
import android.database.Cursor;

/* loaded from: classes9.dex */
public final /* synthetic */ class o implements r.a {
    @Override // Z6.r.a
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).getCount() > 0);
    }
}
