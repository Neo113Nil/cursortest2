package com.ironsource;

/* loaded from: classes5.dex */
public class J5 {
    private static final java.lang.String e = "EventsTracker";

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.InterfaceC3165m7 f5767a;
    private com.ironsource.D5 b;
    private com.ironsource.F7 c;
    private java.util.concurrent.ExecutorService d;

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f5768a;

        a(java.lang.String str) {
            this.f5768a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.ironsource.Pd pd = new com.ironsource.Pd();
                java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> d = com.ironsource.J5.this.b.d();
                if ("POST".equals(com.ironsource.J5.this.b.e())) {
                    pd = com.ironsource.C2969b8.b(com.ironsource.J5.this.b.b(), this.f5768a, d);
                } else if ("GET".equals(com.ironsource.J5.this.b.e())) {
                    pd = com.ironsource.C2969b8.a(com.ironsource.J5.this.b.b(), this.f5768a, d);
                }
                com.ironsource.J5.this.a("response status code: " + pd.f5925a);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
            }
        }
    }

    public J5(com.ironsource.D5 d5, com.ironsource.InterfaceC3165m7 interfaceC3165m7) {
        if (d5 == null) {
            throw new java.security.InvalidParameterException("Null configuration not supported ");
        }
        if (d5.c() == null) {
            throw new java.security.InvalidParameterException("Null formatter not supported ");
        }
        this.b = d5;
        this.f5767a = interfaceC3165m7;
        this.c = d5.c();
        this.d = java.util.concurrent.Executors.newSingleThreadExecutor();
    }

    private void b(java.lang.String str) {
        this.d.submit(new com.ironsource.J5.a(str));
    }

    public void a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        a(java.lang.String.format(java.util.Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("eventname", str);
            a(hashMap, this.f5767a.a());
            a(hashMap, map);
            b(this.c.a(hashMap));
        }
    }

    private void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        try {
            map.putAll(map2);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str) {
        if (this.b.f()) {
            android.util.Log.d(e, str);
        }
    }
}
