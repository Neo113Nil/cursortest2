package com.amazon.device.iap.internal.a;

/* compiled from: SandboxImplementationRegistry.java */
/* loaded from: classes2.dex */
public final class d implements com.amazon.device.iap.internal.b {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.Class, java.lang.Class> f3464a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f3464a = hashMap;
        hashMap.put(com.amazon.device.iap.internal.c.class, com.amazon.device.iap.internal.a.c.class);
        hashMap.put(com.amazon.device.iap.internal.a.class, com.amazon.device.iap.internal.a.a.class);
    }

    @Override // com.amazon.device.iap.internal.b
    public <T> java.lang.Class<T> a(java.lang.Class<T> cls) {
        return f3464a.get(cls);
    }
}
