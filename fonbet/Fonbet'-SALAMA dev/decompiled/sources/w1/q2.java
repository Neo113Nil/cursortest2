package w1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17837c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(boolean z4, int i7) {
        super(2, (byte) 0);
        this.f17837c = i7;
        this.f17838d = z4;
    }

    @Override // D1.a
    public final JSONObject a() {
        switch (this.f17837c) {
            case 0:
                JSONObject a2 = super.a();
                a2.put("fl.ccpa.optout", this.f17838d);
                return a2;
            default:
                JSONObject a4 = super.a();
                a4.put("fl.report.previous.success", this.f17838d);
                return a4;
        }
    }
}
