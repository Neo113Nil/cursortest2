package p155w1;

import D1.a;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975c2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f17666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975c2(int i7, String str, String str2) {
        super(2, (byte) 0);
        this.f17664c = i7;
        switch (i7) {
            case 1:
                super(2, (byte) 0);
                this.f17665d = str == null ? "" : str;
                this.f17666e = str2 == null ? "" : str2;
                break;
            default:
                this.f17665d = str == null ? "" : str;
                this.f17666e = str2 == null ? "" : str2;
                break;
        }
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        switch (this.f17664c) {
            case 0:
                JSONObject jSONObjectA = super.a();
                String str = this.f17665d;
                if (!TextUtils.isEmpty(str)) {
                    jSONObjectA.put("fl.language", str);
                }
                String str2 = (String) this.f17666e;
                if (!TextUtils.isEmpty(str2)) {
                    jSONObjectA.put("fl.country", str2);
                }
                return jSONObjectA;
            case 1:
                JSONObject jSONObjectA2 = super.a();
                jSONObjectA2.put("fl.session.deeplink", (String) this.f17666e);
                jSONObjectA2.put("fl.session.origin.name", this.f17665d);
                return jSONObjectA2;
            default:
                JSONObject jSONObjectA3 = super.a();
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((ArrayList) this.f17666e).iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObjectA3.put("fl.launch.options.key", this.f17665d);
                jSONObjectA3.put("fl.launch.options.values", jSONArray);
                return jSONObjectA3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975c2(String str, ArrayList arrayList) {
        super(2, (byte) 0);
        this.f17664c = 2;
        this.f17665d = str;
        this.f17666e = arrayList;
    }
}
