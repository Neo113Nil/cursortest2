package w1;

import org.json.JSONObject;

/* renamed from: w1.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1680b2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17650c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1680b2(int i7, int i8) {
        super(2, (byte) 0);
        this.f17650c = i8;
        this.f17651d = i7;
    }

    @Override // D1.a
    public final JSONObject a() {
        switch (this.f17650c) {
            case 0:
                JSONObject a2 = super.a();
                int i7 = this.f17651d;
                if (i7 != Integer.MIN_VALUE) {
                    a2.put("fl.demo.gender", i7);
                }
                return a2;
            case 1:
                JSONObject a4 = super.a();
                a4.put("fl.error.count", this.f17651d);
                return a4;
            default:
                JSONObject a7 = super.a();
                a7.put("fl.app.orientation", this.f17651d);
                return a7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1680b2(int i7) {
        super(2, (byte) 0);
        this.f17650c = 2;
        this.f17651d = i7 < 0 ? 0 : i7;
    }
}
