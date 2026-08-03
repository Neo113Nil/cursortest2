package com.iab.omid.library.unity3d.processor;

/* loaded from: classes5.dex */
public class c implements com.iab.omid.library.unity3d.processor.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.processor.a f4508a;

    public c(com.iab.omid.library.unity3d.processor.a aVar) {
        this.f4508a = aVar;
    }

    java.util.ArrayList<android.view.View> a() {
        android.view.View rootView;
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        com.iab.omid.library.unity3d.internal.c c = com.iab.omid.library.unity3d.internal.c.c();
        if (c != null) {
            java.util.Collection<com.iab.omid.library.unity3d.adsession.a> a2 = c.a();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap((a2.size() * 2) + 3);
            java.util.Iterator<com.iab.omid.library.unity3d.adsession.a> it = a2.iterator();
            while (it.hasNext()) {
                android.view.View c2 = it.next().c();
                if (c2 != null && com.iab.omid.library.unity3d.utils.h.e(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c3 = com.iab.omid.library.unity3d.utils.h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && com.iab.omid.library.unity3d.utils.h.c(arrayList.get(size - 1)) > c3) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public org.json.JSONObject a(android.view.View view) {
        org.json.JSONObject a2 = com.iab.omid.library.unity3d.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.unity3d.utils.c.a(a2, com.iab.omid.library.unity3d.utils.e.a());
        return a2;
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public void a(android.view.View view, org.json.JSONObject jSONObject, com.iab.omid.library.unity3d.processor.a.InterfaceC0106a interfaceC0106a, boolean z, boolean z2) {
        java.util.Iterator<android.view.View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0106a.a(it.next(), this.f4508a, jSONObject, z2);
        }
    }
}
