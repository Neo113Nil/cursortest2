package w1;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: w1.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1708i2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17744c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708i2(String str, int i7) {
        super(2, (byte) 0);
        this.f17744c = i7;
        switch (i7) {
            case 1:
                super(2, (byte) 0);
                this.f17745d = str == null ? "" : str;
                break;
            default:
                this.f17745d = str == null ? "" : str;
                break;
        }
    }

    @Override // D1.a
    public final JSONObject a() {
        switch (this.f17744c) {
            case 0:
                JSONObject a2 = super.a();
                String str = this.f17745d;
                if (!TextUtils.isEmpty(str)) {
                    a2.put("fl.timezone.value", str);
                }
                return a2;
            default:
                JSONObject a4 = super.a();
                String str2 = this.f17745d;
                if (!TextUtils.isEmpty(str2)) {
                    a4.put("fl.demo.userid", str2);
                }
                return a4;
        }
    }
}
