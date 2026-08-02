package w1;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class B2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final int f17292c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17293d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17294e;

    /* renamed from: f, reason: collision with root package name */
    public final List f17295f;

    /* renamed from: x, reason: collision with root package name */
    public final int f17296x;

    public B2(int i7, long j, String str, List list, int i8) {
        super(2, (byte) 0);
        this.f17292c = i7;
        this.f17293d = j;
        this.f17294e = str;
        this.f17295f = list;
        this.f17296x = i8;
    }

    @Override // D1.a
    public final JSONObject a() {
        int i7;
        JSONObject a2 = super.a();
        a2.put("fl.user.property.id", this.f17292c);
        a2.put("fl.user.property.uptime", this.f17293d);
        a2.put("fl.user.property.key", this.f17294e);
        JSONArray jSONArray = new JSONArray();
        List list = this.f17295f;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        a2.put("fl.user.property.values", jSONArray);
        switch (this.f17296x) {
            case 1:
                i7 = 1;
                break;
            case 2:
                i7 = 2;
                break;
            case 3:
                i7 = 3;
                break;
            case 4:
                i7 = 4;
                break;
            case 5:
                i7 = 5;
                break;
            case 6:
                i7 = 6;
                break;
            case 7:
                i7 = 0;
                break;
            default:
                throw null;
        }
        a2.put("fl.user.property.call.type", i7);
        return a2;
    }
}
