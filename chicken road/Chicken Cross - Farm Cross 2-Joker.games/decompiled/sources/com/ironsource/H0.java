package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class H0 implements InterfaceC4574of<JSONObject>, InterfaceC4538mf<F0> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C4642sc> f7651a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4290a7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC4556nf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C4642sc> entry : this.f7651a.entrySet()) {
            String key = entry.getKey();
            JSONObject a2 = entry.getValue().a(mode);
            if (a2.length() > 0) {
                jSONObject.put(StringsKt.substringAfterLast$default(key, "_", (String) null, 2, (Object) null), a2);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC4538mf
    public void a(F0 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String d = record.d();
        Map<String, C4642sc> map = this.f7651a;
        C4642sc c4642sc = map.get(d);
        if (c4642sc == null) {
            c4642sc = new C4642sc();
            map.put(d, c4642sc);
        }
        c4642sc.a(record.a(new G0()));
    }
}
