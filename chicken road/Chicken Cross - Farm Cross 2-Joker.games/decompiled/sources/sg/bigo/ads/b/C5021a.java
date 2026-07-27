package sg.bigo.ads.b;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.c.AbstractC5045k;

/* renamed from: sg.bigo.ads.b.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5021a implements g {
    @Override // sg.bigo.ads.b.g
    public final Object a(Context context) {
        HashSet b = AbstractC5045k.b(context);
        JSONArray jSONArray = new JSONArray();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.o;
    }
}
