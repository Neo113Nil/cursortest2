package io.appmetrica.analytics.idsync.impl;

import e2.AbstractC0294i;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final String f5561a = "request_state";

    /* renamed from: b, reason: collision with root package name */
    public final String f5562b = "type";

    /* renamed from: c, reason: collision with root package name */
    public final String f5563c = "last_attempt";

    /* renamed from: d, reason: collision with root package name */
    public final String f5564d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [e2.o] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(List<z> list) {
        ?? r22;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f5561a;
        if (list != null) {
            r22 = new ArrayList(AbstractC0294i.U(list));
            for (z zVar : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.f5562b, zVar.f5632a);
                    jSONObject.put(this.f5563c, zVar.f5633b);
                    jSONObject.put(this.f5564d, u.a(zVar.f5634c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                r22.add(jSONObject);
            }
        } else {
            r22 = e2.o.f4877a;
        }
        jSONObject2.put(str, new JSONArray((Collection) r22));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<z> toModel(String str) {
        JSONArray optJSONArray;
        z zVar;
        int i3;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (optJSONArray = new JSONObject(str).optJSONArray(this.f5561a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                if (optJSONObject != null) {
                    try {
                        String string = optJSONObject.getString(this.f5562b);
                        long j3 = optJSONObject.getLong(this.f5563c);
                        String string2 = optJSONObject.getString(this.f5564d);
                        int[] b3 = v.b(4);
                        int length2 = b3.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length2) {
                                i3 = 0;
                                break;
                            }
                            i3 = b3[i5];
                            if (kotlin.jvm.internal.j.a(u.a(i3), string2)) {
                                break;
                            }
                            i5++;
                        }
                        if (i3 == 0) {
                            i3 = 1;
                        }
                        zVar = new z(string, j3, i3);
                    } catch (Throwable unused) {
                        zVar = null;
                    }
                    if (zVar != null) {
                        arrayList.add(zVar);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return e2.o.f4877a;
        }
    }
}
