package com.ironsource;

/* renamed from: com.ironsource.t8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3291t8 implements com.ironsource.InterfaceC3165m7 {

    /* renamed from: a, reason: collision with root package name */
    private static java.util.Map<java.lang.String, java.lang.Object> f6732a = new java.util.HashMap();

    /* renamed from: com.ironsource.t8$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f6733a;
        java.lang.String b;
        java.lang.String c;
        android.content.Context d;
        java.lang.String e;
        java.lang.String f;

        com.ironsource.C3291t8.a a(java.lang.String str) {
            this.b = str;
            return this;
        }

        com.ironsource.C3291t8.a b(java.lang.String str) {
            this.f = str;
            return this;
        }

        com.ironsource.C3291t8.a c(java.lang.String str) {
            this.c = str;
            return this;
        }

        com.ironsource.C3291t8.a d(java.lang.String str) {
            this.f6733a = str;
            return this;
        }

        com.ironsource.C3291t8.a e(java.lang.String str) {
            this.e = str;
            return this;
        }

        com.ironsource.C3291t8.a a(android.content.Context context) {
            this.d = context;
            return this;
        }

        public com.ironsource.C3291t8 a() {
            return new com.ironsource.C3291t8(this);
        }
    }

    private C3291t8(com.ironsource.C3291t8.a aVar) {
        a(aVar);
        a(aVar.d);
    }

    private void a(android.content.Context context) {
        f6732a.put(com.ironsource.B5.e, com.ironsource.U3.b(context));
        f6732a.put(com.ironsource.B5.f, com.ironsource.U3.d(context));
    }

    public static void b(java.lang.String str) {
        f6732a.put(com.ironsource.B5.f, com.ironsource.sdk.utils.SDKUtils.encodeString(str));
    }

    private void a(com.ironsource.C3291t8.a aVar) {
        android.content.Context context = aVar.d;
        com.ironsource.X4 b = com.ironsource.X4.b(context);
        f6732a.put(com.ironsource.B5.j, com.ironsource.sdk.utils.SDKUtils.encodeString(b.e()));
        f6732a.put(com.ironsource.B5.k, com.ironsource.sdk.utils.SDKUtils.encodeString(b.f()));
        f6732a.put(com.ironsource.B5.l, java.lang.Integer.valueOf(b.a()));
        f6732a.put(com.ironsource.B5.m, com.ironsource.sdk.utils.SDKUtils.encodeString(b.d()));
        f6732a.put(com.ironsource.B5.n, com.ironsource.sdk.utils.SDKUtils.encodeString(b.c()));
        f6732a.put(com.ironsource.B5.d, com.ironsource.sdk.utils.SDKUtils.encodeString(context.getPackageName()));
        f6732a.put(com.ironsource.B5.g, com.ironsource.sdk.utils.SDKUtils.encodeString(aVar.b));
        f6732a.put("sessionid", com.ironsource.sdk.utils.SDKUtils.encodeString(aVar.f6733a));
        f6732a.put(com.ironsource.B5.b, com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.sdk.utils.SDKUtils.getSDKVersion()));
        f6732a.put(com.ironsource.B5.o, com.ironsource.B5.t);
        f6732a.put("origin", com.ironsource.B5.q);
        if (!android.text.TextUtils.isEmpty(aVar.e)) {
            f6732a.put(com.ironsource.B5.i, com.ironsource.sdk.utils.SDKUtils.encodeString(aVar.e));
        }
        if (android.text.TextUtils.isEmpty(aVar.f)) {
            return;
        }
        f6732a.put(com.ironsource.B5.K, aVar.f);
    }

    @Override // com.ironsource.InterfaceC3165m7
    public java.util.Map<java.lang.String, java.lang.Object> a() {
        return f6732a;
    }

    public static void a(java.lang.String str) {
        f6732a.put(com.ironsource.B5.e, com.ironsource.sdk.utils.SDKUtils.encodeString(str));
    }
}
