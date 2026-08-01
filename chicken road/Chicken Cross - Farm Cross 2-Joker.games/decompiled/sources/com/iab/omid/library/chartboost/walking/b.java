package com.iab.omid.library.chartboost.walking;

import com.iab.omid.library.chartboost.walking.async.b;
import com.iab.omid.library.chartboost.walking.async.d;
import com.iab.omid.library.chartboost.walking.async.e;
import com.iab.omid.library.chartboost.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements b.InterfaceC0277b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f6193a;
    private final com.iab.omid.library.chartboost.walking.async.c b;

    public b(com.iab.omid.library.chartboost.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.chartboost.walking.async.b.InterfaceC0277b
    public JSONObject a() {
        return this.f6193a;
    }

    @Override // com.iab.omid.library.chartboost.walking.async.b.InterfaceC0277b
    public void a(JSONObject jSONObject) {
        this.f6193a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }
}
