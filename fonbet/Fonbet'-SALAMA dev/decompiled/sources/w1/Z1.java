package w1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Z1 extends D1.a {

    /* renamed from: A, reason: collision with root package name */
    public final String f17616A;

    /* renamed from: B, reason: collision with root package name */
    public final long f17617B;

    /* renamed from: C, reason: collision with root package name */
    public final long f17618C;

    /* renamed from: D, reason: collision with root package name */
    public long f17619D;

    /* renamed from: c, reason: collision with root package name */
    public final String f17620c;

    /* renamed from: d, reason: collision with root package name */
    public int f17621d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17622e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f17623f;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f17624x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17625y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f17626z;

    public Z1(String str, int i7, int i8, HashMap hashMap, HashMap hashMap2, boolean z4, boolean z7, String str2, long j, long j3, long j7) {
        super(2, (byte) 0);
        this.f1675b = 2;
        this.f17620c = str;
        this.f17621d = i7;
        this.f17622e = i8;
        this.f17623f = hashMap;
        this.f17624x = hashMap2;
        this.f17625y = z4;
        this.f17626z = z7;
        this.f17616A = str2;
        this.f17617B = j;
        this.f17618C = j3;
        this.f17619D = j7;
    }

    public static HashMap t(ArrayList arrayList, HashMap hashMap) {
        String n2;
        String str;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (arrayList.contains(entry.getKey())) {
                n2 = AbstractC1706i0.n((String) entry.getKey());
                str = (String) entry.getValue();
            } else {
                n2 = AbstractC1706i0.n((String) entry.getKey());
                str = AbstractC1706i0.n((String) entry.getValue());
            }
            if (!TextUtils.isEmpty(n2)) {
                hashMap2.put(n2, str);
            }
        }
        return hashMap2;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.event.name", this.f17620c);
        a2.put("fl.event.id", this.f17621d);
        int i7 = 1;
        switch (this.f17622e) {
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
        a2.put("fl.event.type", i7);
        a2.put("fl.event.timed", this.f17625y);
        a2.put("fl.timed.event.starting", this.f17626z);
        long j = this.f17619D;
        if (j > 0) {
            a2.put("fl.timed.event.duration", j);
        }
        a2.put("fl.event.timestamp", this.f17617B);
        a2.put("fl.event.uptime", this.f17618C);
        a2.put("fl.event.user.parameters", AbstractC1707i1.d(this.f17623f));
        a2.put("fl.event.flurry.parameters", AbstractC1707i1.d(this.f17624x));
        return a2;
    }

    public Z1(String str, int i7, int i8, HashMap hashMap, HashMap hashMap2, ArrayList arrayList, boolean z4, boolean z7, String str2, long j, long j3) {
        this(AbstractC1706i0.n(AbstractC1706i0.c(str)), i7, i8, t(arrayList, hashMap), hashMap2 != null ? t(arrayList, hashMap2) : new HashMap(), z4, z7, str2, j, j3, 0L);
    }
}
