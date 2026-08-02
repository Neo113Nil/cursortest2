package com.plaid.internal;

/* renamed from: com.plaid.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0450a4<K, V> implements com.plaid.internal.InterfaceC0688y<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.LruCache<K, V> f5994a = new android.util.LruCache<>(10);

    @Override // com.plaid.internal.InterfaceC0688y
    public final void a(java.lang.String str, java.lang.Object obj) {
        this.f5994a.put(str, obj);
    }

    @Override // com.plaid.internal.InterfaceC0688y
    public final void clear() {
        this.f5994a.evictAll();
    }

    @Override // com.plaid.internal.InterfaceC0688y
    public final java.lang.Object a(java.lang.String str) {
        return this.f5994a.get(str);
    }
}
