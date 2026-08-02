package w1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class U1 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U1(int i7) {
        super(2, (byte) 0);
        this.f17556c = i7;
    }

    @Override // D1.a
    public JSONObject a() {
        switch (this.f17556c) {
            case 1:
                JSONObject a2 = super.a();
                a2.put("fl.background.enabled", true);
                a2.put("fl.sdk.version.code", "14040000");
                return a2;
            default:
                return super.a();
        }
    }
}
