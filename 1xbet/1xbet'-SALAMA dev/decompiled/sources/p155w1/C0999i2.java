package p155w1;

import D1.a;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0999i2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0999i2(String str, int i7) {
        super(2, (byte) 0);
        this.f17750c = i7;
        switch (i7) {
            case 1:
                super(2, (byte) 0);
                this.f17751d = str == null ? "" : str;
                break;
            default:
                this.f17751d = str == null ? "" : str;
                break;
        }
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        switch (this.f17750c) {
            case 0:
                JSONObject jSONObjectA = super.a();
                String str = this.f17751d;
                if (!TextUtils.isEmpty(str)) {
                    jSONObjectA.put("fl.timezone.value", str);
                }
                return jSONObjectA;
            default:
                JSONObject jSONObjectA2 = super.a();
                String str2 = this.f17751d;
                if (!TextUtils.isEmpty(str2)) {
                    jSONObjectA2.put("fl.demo.userid", str2);
                }
                return jSONObjectA2;
        }
    }
}
