package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ReplaceTempDaoMiddle.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f9289a;
    private k b;

    /* compiled from: ReplaceTempDaoMiddle.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9290a;
        final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a b;

        a(boolean z, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f9290a = z;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f9290a || b.this.b == null) {
                return;
            }
            for (String str : this.b.a()) {
                b.this.b.a(str, b.this.f9289a.a(str));
            }
        }
    }

    /* compiled from: ReplaceTempDaoMiddle.java */
    /* renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    private static class C1374b {

        /* renamed from: a, reason: collision with root package name */
        private static b f9291a = new b(null);
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f9289a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k a2 = k.a(g.a(c.n().d()));
            this.b = a2;
            a(a2.d(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                this.f9289a.a(next, optJSONObject);
                aVar.a(next, optJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f9289a.a());
    }

    public static b a() {
        return C1374b.f9291a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject a2 = this.f9289a.a(str);
        if (a2 != null || (kVar = this.b) == null) {
            return a2;
        }
        JSONObject b = kVar.b(str);
        if (b != null) {
            this.f9289a.a(str, b);
        }
        return b;
    }
}
