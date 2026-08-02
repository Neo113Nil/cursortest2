package w1;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w1.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1684c2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17658c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17659d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f17660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1684c2(int i7, String str, String str2) {
        super(2, (byte) 0);
        this.f17658c = i7;
        switch (i7) {
            case 1:
                super(2, (byte) 0);
                this.f17659d = str == null ? "" : str;
                this.f17660e = str2 == null ? "" : str2;
                break;
            default:
                this.f17659d = str == null ? "" : str;
                this.f17660e = str2 == null ? "" : str2;
                break;
        }
    }

    @Override // D1.a
    public final JSONObject a() {
        switch (this.f17658c) {
            case 0:
                JSONObject a2 = super.a();
                String str = this.f17659d;
                if (!TextUtils.isEmpty(str)) {
                    a2.put("fl.language", str);
                }
                String str2 = (String) this.f17660e;
                if (!TextUtils.isEmpty(str2)) {
                    a2.put("fl.country", str2);
                }
                return a2;
            case 1:
                JSONObject a4 = super.a();
                a4.put("fl.session.deeplink", (String) this.f17660e);
                a4.put("fl.session.origin.name", this.f17659d);
                return a4;
            default:
                JSONObject a7 = super.a();
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((ArrayList) this.f17660e).iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                a7.put("fl.launch.options.key", this.f17659d);
                a7.put("fl.launch.options.values", jSONArray);
                return a7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1684c2(String str, ArrayList arrayList) {
        super(2, (byte) 0);
        this.f17658c = 2;
        this.f17659d = str;
        this.f17660e = arrayList;
    }
}
