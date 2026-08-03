package com.iab.omid.library.inmobi.walking;

/* loaded from: classes5.dex */
public class b implements com.iab.omid.library.inmobi.walking.async.b.InterfaceC0101b {

    /* renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f4454a;
    private final com.iab.omid.library.inmobi.walking.async.c b;

    public b(com.iab.omid.library.inmobi.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0101b
    public org.json.JSONObject a() {
        return this.f4454a;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0101b
    public void a(org.json.JSONObject jSONObject) {
        this.f4454a = jSONObject;
    }

    public void a(org.json.JSONObject jSONObject, java.util.HashSet<java.lang.String> hashSet, long j) {
        this.b.b(new com.iab.omid.library.inmobi.walking.async.e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new com.iab.omid.library.inmobi.walking.async.d(this));
    }

    public void b(org.json.JSONObject jSONObject, java.util.HashSet<java.lang.String> hashSet, long j) {
        this.b.b(new com.iab.omid.library.inmobi.walking.async.f(this, hashSet, jSONObject, j));
    }
}
