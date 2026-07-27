package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.c5;
import com.applovin.impl.n5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.p;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class c extends n5 {
    private final b g;
    private final p h;
    private AtomicBoolean i;
    private boolean j;

    c(b bVar, l lVar) {
        super("PersistentPostbackQueueSaveTask", lVar);
        this.i = new AtomicBoolean();
        this.j = false;
        this.g = bVar;
        this.h = lVar.Q();
    }

    public List a(int i) {
        ArrayList arrayList = new ArrayList();
        n I = this.f4351a.I();
        if (!I.b("persistent_postback_cache.json", l.p())) {
            p.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File a2 = I.a("persistent_postback_cache.json", l.p());
        String f = I.f(a2);
        if (TextUtils.isEmpty(f)) {
            p.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONObject(f).getJSONArray("pb");
            if (p.a()) {
                this.h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f4351a.a(c5.Q2);
            for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i2), this.f4351a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        p.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th) {
                    p.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f4351a.E().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (p.a()) {
                this.h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                p.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
                try {
                    this.f4351a.E().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                    if (((Boolean) this.f4351a.a(c5.O0)).booleanValue()) {
                        I.a(a2, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    if (z && ((Boolean) this.f4351a.a(c5.O0)).booleanValue()) {
                        I.a(a2, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        this.j = arrayList.isEmpty();
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.g.d());
    }

    private void a(List list) {
        if (!(this.j && list.isEmpty()) && this.i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    p.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f4351a.E().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                n I = this.f4351a.I();
                if (I.a((InputStream) byteArrayInputStream, I.a("persistent_postback_cache.json", l.p()), true)) {
                    if (p.a()) {
                        this.h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (p.a()) {
                    this.h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                p.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f4351a.E().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.i.set(false);
        }
    }
}
