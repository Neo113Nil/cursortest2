package io.appmetrica.analytics.idsync.impl;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import g4.AbstractC0467l;
import g4.C0471p;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final String f6383a = "request_state";

    /* renamed from: b, reason: collision with root package name */
    public final String f6384b = WebViewManager.EVENT_TYPE_KEY;

    /* renamed from: c, reason: collision with root package name */
    public final String f6385c = "last_attempt";

    /* renamed from: d, reason: collision with root package name */
    public final String f6386d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [g4.p] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(List<z> list) {
        ?? r22;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f6383a;
        if (list != null) {
            r22 = new ArrayList(AbstractC0467l.D0(list, 10));
            for (z zVar : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.f6384b, zVar.f6459a);
                    jSONObject.put(this.f6385c, zVar.f6460b);
                    jSONObject.put(this.f6386d, u.a(zVar.f6461c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                r22.add(jSONObject);
            }
        } else {
            r22 = C0471p.f5750a;
        }
        jSONObject2.put(str, new JSONArray((Collection) r22));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<z> toModel(String str) {
        JSONArray optJSONArray;
        z zVar;
        int i2;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (optJSONArray = new JSONObject(str).optJSONArray(this.f6383a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    try {
                        String string = optJSONObject.getString(this.f6384b);
                        long j2 = optJSONObject.getLong(this.f6385c);
                        String string2 = optJSONObject.getString(this.f6386d);
                        int[] b6 = v.b(4);
                        int length2 = b6.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length2) {
                                i2 = 0;
                                break;
                            }
                            i2 = b6[i6];
                            if (kotlin.jvm.internal.i.a(u.a(i2), string2)) {
                                break;
                            }
                            i6++;
                        }
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        zVar = new z(string, j2, i2);
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
            return C0471p.f5750a;
        }
    }
}
