package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class U1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U1(int i7) {
        super(2, (byte) 0);
        this.f17562c = i7;
    }

    @Override // D1.a
    public JSONObject a() throws JSONException {
        switch (this.f17562c) {
            case 1:
                JSONObject jSONObjectA = super.a();
                jSONObjectA.put("fl.background.enabled", true);
                jSONObjectA.put("fl.sdk.version.code", "14040000");
                return jSONObjectA;
            default:
                return super.a();
        }
    }
}
