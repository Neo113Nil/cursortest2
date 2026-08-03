package com.ironsource;

/* loaded from: classes5.dex */
public class I5 implements java.lang.Runnable {
    private static final java.lang.String e = "Content-Type";
    private static final java.lang.String f = "application/json";

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.C7 f5753a;
    java.lang.String b;
    java.lang.String c;
    java.util.ArrayList<com.ironsource.C3360x5> d;

    public I5(com.ironsource.C7 c7, java.lang.String str, java.lang.String str2, java.util.ArrayList<com.ironsource.C3360x5> arrayList) {
        this.f5753a = c7;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.ironsource.C7.a a2;
        com.ironsource.C7.a aVar = new com.ironsource.C7.a(this.d);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new android.util.Pair("Content-Type", "application/json"));
            com.ironsource.Pd b = com.ironsource.C2969b8.b(this.c, this.b, arrayList);
            a2 = aVar.a(b.a()).a(b.f5925a);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
            a2 = aVar.a(e2 instanceof com.ironsource.Ec).a(e2);
        }
        com.ironsource.C7 c7 = this.f5753a;
        if (c7 != null) {
            c7.a(a2);
        }
    }
}
