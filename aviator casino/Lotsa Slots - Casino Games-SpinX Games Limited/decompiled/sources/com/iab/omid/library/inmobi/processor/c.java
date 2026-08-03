package com.iab.omid.library.inmobi.processor;

/* loaded from: classes5.dex */
public class c implements com.iab.omid.library.inmobi.processor.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.processor.a f4437a;

    public c(com.iab.omid.library.inmobi.processor.a aVar) {
        this.f4437a = aVar;
    }

    java.util.ArrayList<android.view.View> a() {
        android.view.View rootView;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        com.iab.omid.library.inmobi.internal.c c = com.iab.omid.library.inmobi.internal.c.c();
        if (c != null) {
            java.util.Collection<com.iab.omid.library.inmobi.adsession.a> a2 = c.a();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap((a2.size() * 2) + 3);
            java.util.Iterator<com.iab.omid.library.inmobi.adsession.a> it = a2.iterator();
            while (it.hasNext()) {
                android.view.View e = it.next().e();
                if (e != null && com.iab.omid.library.inmobi.utils.h.g(e) && (rootView = e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float d = com.iab.omid.library.inmobi.utils.h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && com.iab.omid.library.inmobi.utils.h.d(arrayList.get(size - 1)) > d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.inmobi.processor.a
    public org.json.JSONObject a(android.view.View view) {
        org.json.JSONObject a2 = com.iab.omid.library.inmobi.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.inmobi.utils.c.a(a2, com.iab.omid.library.inmobi.utils.e.a());
        return a2;
    }

    @Override // com.iab.omid.library.inmobi.processor.a
    public void a(android.view.View view, org.json.JSONObject jSONObject, com.iab.omid.library.inmobi.processor.a.InterfaceC0098a interfaceC0098a, boolean z, boolean z2) {
        java.util.Iterator<android.view.View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0098a.a(it.next(), this.f4437a, jSONObject, z2);
        }
    }
}
