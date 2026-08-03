package com.iab.omid.library.fyber.walking;

/* loaded from: classes5.dex */
public class b implements com.iab.omid.library.fyber.walking.async.b.InterfaceC0096b {

    /* renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f4415a;
    private final com.iab.omid.library.fyber.walking.async.c b;

    public b(com.iab.omid.library.fyber.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0096b
    public org.json.JSONObject a() {
        return this.f4415a;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0096b
    public void a(org.json.JSONObject jSONObject) {
        this.f4415a = jSONObject;
    }

    public void a(org.json.JSONObject jSONObject, java.util.HashSet<java.lang.String> hashSet, long j) {
        this.b.b(new com.iab.omid.library.fyber.walking.async.e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new com.iab.omid.library.fyber.walking.async.d(this));
    }

    public void b(org.json.JSONObject jSONObject, java.util.HashSet<java.lang.String> hashSet, long j) {
        this.b.b(new com.iab.omid.library.fyber.walking.async.f(this, hashSet, jSONObject, j));
    }
}
