package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4642sc implements InterfaceC4574of<JSONObject>, InterfaceC4538mf<C4607qc> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C4435h1> f8526a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4290a7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC4556nf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C4435h1> entry : this.f8526a.entrySet()) {
            String key = entry.getKey();
            JSONArray a2 = entry.getValue().a(mode);
            if (a2.length() > 0) {
                jSONObject.put(key, a2);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC4538mf
    public void a(C4607qc record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String c = record.c();
        Map<String, C4435h1> map = this.f8526a;
        C4435h1 c4435h1 = map.get(c);
        if (c4435h1 == null) {
            c4435h1 = new C4435h1();
            map.put(c, c4435h1);
        }
        c4435h1.a(record.a(new C4624rc()));
    }
}
