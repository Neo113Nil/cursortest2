package com.iab.omid.library.bigosg.c;

import android.view.View;
import com.iab.omid.library.bigosg.c.a;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f6104a;

    public c(a aVar) {
        this.f6104a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.bigosg.b.a a2 = com.iab.omid.library.bigosg.b.a.a();
        if (a2 != null) {
            Collection<com.iab.omid.library.bigosg.adsession.a> c = a2.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            Iterator<com.iab.omid.library.bigosg.adsession.a> it = c.iterator();
            while (it.hasNext()) {
                View d = it.next().d();
                if (d != null && f.c(d) && (rootView = d.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a3 = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > a3) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.bigosg.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.bigosg.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.bigosg.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0266a interfaceC0266a, boolean z) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0266a.a(it.next(), this.f6104a, jSONObject);
        }
    }
}
