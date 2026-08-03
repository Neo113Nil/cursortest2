package com.ironsource;

/* loaded from: classes5.dex */
public class U4 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.ironsource.T4> f5997a = new java.util.LinkedHashMap();
    private final java.util.Map<java.lang.String, com.ironsource.T4> b = new java.util.LinkedHashMap();
    private final java.util.Map<java.lang.String, com.ironsource.T4> c = new java.util.LinkedHashMap();

    private java.util.Map<java.lang.String, com.ironsource.T4> b(com.ironsource.C3202o8.e eVar) {
        if (eVar.name().equalsIgnoreCase(com.ironsource.C3202o8.e.RewardedVideo.name())) {
            return this.f5997a;
        }
        if (eVar.name().equalsIgnoreCase(com.ironsource.C3202o8.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(com.ironsource.C3202o8.e.Banner.name())) {
            return this.c;
        }
        return null;
    }

    public java.util.Collection<com.ironsource.T4> a(com.ironsource.C3202o8.e eVar) {
        java.util.Map<java.lang.String, com.ironsource.T4> b = b(eVar);
        return b != null ? b.values() : new java.util.ArrayList();
    }

    public com.ironsource.T4 a(com.ironsource.C3202o8.e eVar, java.lang.String str) {
        java.util.Map<java.lang.String, com.ironsource.T4> b;
        if (android.text.TextUtils.isEmpty(str) || (b = b(eVar)) == null) {
            return null;
        }
        return b.get(str);
    }

    public void b(com.ironsource.C3202o8.e eVar, java.lang.String str) {
        java.util.Map<java.lang.String, com.ironsource.T4> b;
        com.ironsource.T4 remove;
        if (android.text.TextUtils.isEmpty(str) || (b = b(eVar)) == null || (remove = b.remove(str)) == null) {
            return;
        }
        remove.a();
    }

    private void a(com.ironsource.C3202o8.e eVar, java.lang.String str, com.ironsource.T4 t4) {
        java.util.Map<java.lang.String, com.ironsource.T4> b;
        if (android.text.TextUtils.isEmpty(str) || t4 == null || (b = b(eVar)) == null) {
            return;
        }
        b.put(str, t4);
    }

    public com.ironsource.T4 a(com.ironsource.C3202o8.e eVar, com.ironsource.J9 j9) {
        com.ironsource.T4 t4 = new com.ironsource.T4(j9);
        a(eVar, j9.e(), t4);
        return t4;
    }

    public com.ironsource.T4 a(com.ironsource.C3202o8.e eVar, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.Gc gc) {
        com.ironsource.T4 t4 = new com.ironsource.T4(str, str, map, gc);
        a(eVar, str, t4);
        return t4;
    }
}
