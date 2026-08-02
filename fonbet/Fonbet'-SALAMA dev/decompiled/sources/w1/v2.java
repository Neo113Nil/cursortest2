package w1;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final String f17892c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f17893d;

    public v2(String str, Map map) {
        super(2, (byte) 0);
        this.f17892c = str;
        this.f17893d = map;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        JSONObject d7 = AbstractC1707i1.d(this.f17893d);
        a2.put("fl.origin.attribute.name", this.f17892c);
        a2.put("fl.origin.attribute.parameters", d7);
        return a2;
    }
}
