package w1;

import org.json.JSONObject;

/* renamed from: w1.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1688d2 extends D1.a {

    /* renamed from: A, reason: collision with root package name */
    public final int f17676A;

    /* renamed from: c, reason: collision with root package name */
    public final int f17677c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17678d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17679e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17680f;

    /* renamed from: x, reason: collision with root package name */
    public final String f17681x;

    /* renamed from: y, reason: collision with root package name */
    public final String f17682y;

    /* renamed from: z, reason: collision with root package name */
    public final String f17683z;

    public C1688d2(int i7, String str, String str2, String str3, String str4, String str5, String str6, int i8) {
        super(2, (byte) 0);
        this.f1675b = 2;
        this.f17677c = i7 < 0 ? -1 : i7;
        this.f17678d = str;
        this.f17679e = str2;
        this.f17680f = str3;
        this.f17681x = str4;
        this.f17682y = str5;
        this.f17683z = str6;
        this.f17676A = i8;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.network.status", this.f17677c);
        String str = this.f17678d;
        if (str != null) {
            a2.put("fl.cellular.name", str);
            a2.put("fl.cellular.operator", this.f17679e);
            a2.put("fl.cellular.sim.operator", this.f17680f);
            a2.put("fl.cellular.sim.id", this.f17681x);
            a2.put("fl.cellular.sim.name", this.f17682y);
            a2.put("fl.cellular.band", this.f17683z);
            a2.put("fl.cellular.signal.strength", this.f17676A);
        }
        return a2;
    }
}
