package p155w1;

import D1.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f17622A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f17623B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f17624C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f17625D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f17629f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f17630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f17631y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f17632z;

    public Z1(String str, int i7, int i8, HashMap map, HashMap map2, boolean z4, boolean z7, String str2, long j, long j3, long j7) {
        super(2, (byte) 0);
        this.f1675b = 2;
        this.f17626c = str;
        this.f17627d = i7;
        this.f17628e = i8;
        this.f17629f = map;
        this.f17630x = map2;
        this.f17631y = z4;
        this.f17632z = z7;
        this.f17622A = str2;
        this.f17623B = j;
        this.f17624C = j3;
        this.f17625D = j7;
    }

    public static HashMap t(ArrayList arrayList, HashMap map) {
        String strN;
        String strN2;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (arrayList.contains(entry.getKey())) {
                strN = AbstractC0997i0.n((String) entry.getKey());
                strN2 = (String) entry.getValue();
            } else {
                strN = AbstractC0997i0.n((String) entry.getKey());
                strN2 = AbstractC0997i0.n((String) entry.getValue());
            }
            if (!TextUtils.isEmpty(strN)) {
                map2.put(strN, strN2);
            }
        }
        return map2;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.event.name", this.f17626c);
        jSONObjectA.put("fl.event.id", this.f17627d);
        int i7 = 1;
        switch (this.f17628e) {
            case 1:
                i7 = 0;
                break;
            case 2:
            case 6:
            case 7:
                break;
            case 3:
                i7 = 8;
                break;
            case 4:
                i7 = 9;
                break;
            case 5:
                i7 = 10;
                break;
            default:
                throw null;
        }
        jSONObjectA.put("fl.event.type", i7);
        jSONObjectA.put("fl.event.timed", this.f17631y);
        jSONObjectA.put("fl.timed.event.starting", this.f17632z);
        long j = this.f17625D;
        if (j > 0) {
            jSONObjectA.put("fl.timed.event.duration", j);
        }
        jSONObjectA.put("fl.event.timestamp", this.f17623B);
        jSONObjectA.put("fl.event.uptime", this.f17624C);
        jSONObjectA.put("fl.event.user.parameters", AbstractC0998i1.d(this.f17629f));
        jSONObjectA.put("fl.event.flurry.parameters", AbstractC0998i1.d(this.f17630x));
        return jSONObjectA;
    }

    public Z1(String str, int i7, int i8, HashMap map, HashMap map2, ArrayList arrayList, boolean z4, boolean z7, String str2, long j, long j3) {
        this(AbstractC0997i0.n(AbstractC0997i0.c(str)), i7, i8, t(arrayList, map), map2 != null ? t(arrayList, map2) : new HashMap(), z4, z7, str2, j, j3, 0L);
    }
}
