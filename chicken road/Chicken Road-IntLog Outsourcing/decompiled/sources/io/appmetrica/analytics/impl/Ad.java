package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import g4.AbstractC0467l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ad {

    /* renamed from: a, reason: collision with root package name */
    public final List f6528a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6529b;

    public Ad(List list, long j2) {
        this.f6528a = list;
        this.f6529b = j2;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C0720id> list = this.f6528a;
            ArrayList arrayList = new ArrayList(AbstractC0467l.D0(list, 10));
            for (C0720id c0720id : list) {
                c0720id.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c0720id.f8452a);
                    jSONObject.put("loaded", c0720id.f8453b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f6529b);
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
        return kotlin.jvm.internal.i.a(this.f6528a, ad.f6528a) && this.f6529b == ad.f6529b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6529b) + (this.f6528a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModulesStatus(modulesStatus=");
        sb.append(this.f6528a);
        sb.append(", lastSendTime=");
        return AbstractC0279e.g(sb, this.f6529b, ')');
    }
}
