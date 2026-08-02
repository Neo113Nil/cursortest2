package Z6;

import S6.r;
import Z6.r;
import android.database.Cursor;
import android.util.Base64;
import c7.C5758a;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final /* synthetic */ class l implements r.a {
    @Override // Z6.r.a
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            r.a a11 = S6.r.a();
            a11.b(cursor.getString(1));
            a11.d(C5758a.b(cursor.getInt(2)));
            String string = cursor.getString(3);
            a11.c(string == null ? null : Base64.decode(string, 0));
            arrayList.add(a11.a());
        }
        return arrayList;
    }
}
