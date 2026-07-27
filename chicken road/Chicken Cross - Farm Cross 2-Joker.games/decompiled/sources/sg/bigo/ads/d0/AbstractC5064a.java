package sg.bigo.ads.d0;

import android.content.ContentValues;
import java.util.ArrayList;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5051b;

/* renamed from: sg.bigo.ads.d0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5064a {
    public static void a(ArrayList arrayList) {
        arrayList.size();
        StringBuilder sb = new StringBuilder("_id in (");
        int i = 0;
        while (i < arrayList.size()) {
            sb.append(i == 0 ? "?" : ",?");
            i++;
        }
        sb.append(")");
        AbstractC5025b.a("tb_event", sb.toString(), (String[]) arrayList.toArray(new String[0]));
    }

    public static long a(C5051b c5051b) {
        c5051b.toString();
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_action", c5051b.b);
        contentValues.put("event_info", c5051b.c);
        contentValues.put("states", Integer.valueOf(c5051b.d));
        contentValues.put("ext", c5051b.e);
        long j = c5051b.f;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        contentValues.put("ctime", Long.valueOf(j));
        long j2 = c5051b.g;
        if (j2 == 0) {
            j2 = System.currentTimeMillis();
        }
        contentValues.put("mtime", Long.valueOf(j2));
        return AbstractC5025b.a("tb_event", contentValues);
    }
}
