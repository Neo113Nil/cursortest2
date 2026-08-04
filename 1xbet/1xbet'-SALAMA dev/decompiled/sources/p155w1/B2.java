package p155w1;

import D1.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class B2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f17301f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f17302x;

    public B2(int i7, long j, String str, List list, int i8) {
        super(2, (byte) 0);
        this.f17298c = i7;
        this.f17299d = j;
        this.f17300e = str;
        this.f17301f = list;
        this.f17302x = i8;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        int i7;
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.user.property.id", this.f17298c);
        jSONObjectA.put("fl.user.property.uptime", this.f17299d);
        jSONObjectA.put("fl.user.property.key", this.f17300e);
        JSONArray jSONArray = new JSONArray();
        List list = this.f17301f;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        jSONObjectA.put("fl.user.property.values", jSONArray);
        switch (this.f17302x) {
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
        jSONObjectA.put("fl.user.property.call.type", i7);
        return jSONObjectA;
    }
}
