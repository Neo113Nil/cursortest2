package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Nb {

    /* renamed from: a, reason: collision with root package name */
    private String f7810a;

    public Nb(String str) {
        this.f7810a = str;
    }

    private C4710w8 a() throws Exception {
        C4710w8 c4710w8 = new C4710w8(this.f7810a, "metadata.json");
        if (!c4710w8.exists()) {
            a(c4710w8);
        }
        return c4710w8;
    }

    synchronized JSONObject b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }

    private void a(C4710w8 c4710w8) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), c4710w8.getPath());
    }

    synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject b;
        b = b();
        JSONObject optJSONObject = b.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            b.putOpt(str, jSONObject);
        }
        return a(b);
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject b;
        b = b();
        b.put(str, jSONObject);
        return a(b);
    }

    synchronized boolean a(String str) throws Exception {
        JSONObject b = b();
        if (!b.has(str)) {
            return true;
        }
        b.remove(str);
        return a(b);
    }

    boolean a(ArrayList<C4710w8> arrayList) throws Exception {
        Iterator<C4710w8> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }
}
