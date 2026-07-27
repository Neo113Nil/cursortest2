package io.appmetrica.analytics.impl;

import e2.AbstractC0294i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ad {

    /* renamed from: a, reason: collision with root package name */
    public final List f5697a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5698b;

    public Ad(List list, long j3) {
        this.f5697a = list;
        this.f5698b = j3;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C0571id> list = this.f5697a;
            ArrayList arrayList = new ArrayList(AbstractC0294i.U(list));
            for (C0571id c0571id : list) {
                c0571id.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c0571id.f7541a);
                    jSONObject.put("loaded", c0571id.f7542b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f5698b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad = (Ad) obj;
        return kotlin.jvm.internal.j.a(this.f5697a, ad.f5697a) && this.f5698b == ad.f5698b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5698b) + (this.f5697a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f5697a + ", lastSendTime=" + this.f5698b + ')';
    }
}
