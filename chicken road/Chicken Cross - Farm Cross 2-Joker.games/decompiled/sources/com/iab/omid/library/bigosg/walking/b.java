package com.iab.omid.library.bigosg.walking;

import com.iab.omid.library.bigosg.walking.a.b;
import com.iab.omid.library.bigosg.walking.a.d;
import com.iab.omid.library.bigosg.walking.a.e;
import com.iab.omid.library.bigosg.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements b.InterfaceC0268b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f6119a;
    private final com.iab.omid.library.bigosg.walking.a.c b;

    public b(com.iab.omid.library.bigosg.walking.a.c cVar) {
        this.b = cVar;
    }

    public void a() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0268b
    public JSONObject b() {
        return this.f6119a;
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0268b
    public void a(JSONObject jSONObject) {
        this.f6119a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }
}
