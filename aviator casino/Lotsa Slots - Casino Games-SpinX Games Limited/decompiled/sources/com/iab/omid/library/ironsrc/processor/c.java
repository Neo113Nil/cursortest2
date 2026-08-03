package com.iab.omid.library.ironsrc.processor;

/* loaded from: classes5.dex */
public class c implements com.iab.omid.library.ironsrc.processor.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.processor.a f4474a;

    public c(com.iab.omid.library.ironsrc.processor.a aVar) {
        this.f4474a = aVar;
    }

    java.util.ArrayList<android.view.View> a() {
        android.view.View rootView;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        com.iab.omid.library.ironsrc.internal.c c = com.iab.omid.library.ironsrc.internal.c.c();
        if (c != null) {
            java.util.Collection<com.iab.omid.library.ironsrc.adsession.a> a2 = c.a();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap((a2.size() * 2) + 3);
            java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a2.iterator();
            while (it.hasNext()) {
                android.view.View c2 = it.next().c();
                if (c2 != null && com.iab.omid.library.ironsrc.utils.h.g(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float d = com.iab.omid.library.ironsrc.utils.h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && com.iab.omid.library.ironsrc.utils.h.d(arrayList.get(size - 1)) > d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public org.json.JSONObject a(android.view.View view) {
        org.json.JSONObject a2 = com.iab.omid.library.ironsrc.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.ironsrc.utils.c.a(a2, com.iab.omid.library.ironsrc.utils.e.a());
        return a2;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public void a(android.view.View view, org.json.JSONObject jSONObject, com.iab.omid.library.ironsrc.processor.a.InterfaceC0102a interfaceC0102a, boolean z, boolean z2) {
        java.util.Iterator<android.view.View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0102a.a(it.next(), this.f4474a, jSONObject, z2);
        }
    }
}
