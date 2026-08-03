package com.iab.omid.library.unity3d.processor;

/* loaded from: classes5.dex */
public class d implements com.iab.omid.library.unity3d.processor.a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f4509a = new int[2];

    private void a(android.view.ViewGroup viewGroup, org.json.JSONObject jSONObject, com.iab.omid.library.unity3d.processor.a.InterfaceC0106a interfaceC0106a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC0106a.a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    private void b(android.view.ViewGroup viewGroup, org.json.JSONObject jSONObject, com.iab.omid.library.unity3d.processor.a.InterfaceC0106a interfaceC0106a, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(java.lang.Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                hashMap.put(java.lang.Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(hashMap.keySet());
        java.util.Collections.sort(arrayList2);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = ((java.util.ArrayList) hashMap.get((java.lang.Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0106a.a((android.view.View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public org.json.JSONObject a(android.view.View view) {
        if (view == null) {
            return com.iab.omid.library.unity3d.utils.c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f4509a);
        int[] iArr = this.f4509a;
        return com.iab.omid.library.unity3d.utils.c.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.unity3d.processor.a
    public void a(android.view.View view, org.json.JSONObject jSONObject, com.iab.omid.library.unity3d.processor.a.InterfaceC0106a interfaceC0106a, boolean z, boolean z2) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (z) {
                b(viewGroup, jSONObject, interfaceC0106a, z2);
            } else {
                a(viewGroup, jSONObject, interfaceC0106a, z2);
            }
        }
    }
}
