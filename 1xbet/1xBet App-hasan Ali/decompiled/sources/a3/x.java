package a3;

import A0.J0;
import c3.AbstractC0539a;
import com.google.android.gms.internal.ads.AbstractC1281m8;
import com.google.android.gms.internal.ads.G3;
import com.google.android.gms.internal.ads.S7;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x extends AbstractC0539a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6635c;

    public /* synthetic */ x(int i, Object obj, String str) {
        this.f6633a = i;
        this.f6634b = str;
        this.f6635c = obj;
    }

    @Override // c3.AbstractC0539a
    public final void a(String str) {
        String str2 = this.f6634b;
        Object obj = this.f6635c;
        int i = 0;
        switch (this.f6633a) {
            case 0:
                U2.j.i("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                C0457a c0457a = (C0457a) obj;
                String concat = ((Boolean) AbstractC1281m8.f14474a.s()).booleanValue() ? ",\"as\":".concat(c0457a.f6525k.a().toString()) : "";
                Locale locale = Locale.getDefault();
                G3 g32 = AbstractC1281m8.f14476c;
                String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) g32.s()).booleanValue() ? ((Long) AbstractC1281m8.f.s()).longValue() : 0L), concat);
                if (((Boolean) g32.s()).booleanValue()) {
                    try {
                        c0457a.f6523h.execute(new w(this, format, i));
                    } catch (RuntimeException e3) {
                        P2.o.f4767B.f4774g.h("TaggingLibraryJsInterface.getQueryInfo.onFailure", e3);
                    }
                } else {
                    c0457a.f6518b.evaluateJavascript(format, null);
                }
                if (((Boolean) AbstractC1281m8.f14474a.s()).booleanValue() && ((Boolean) AbstractC1281m8.f14475b.s()).booleanValue()) {
                    D d5 = c0457a.f6526l;
                    d5.getClass();
                    d5.f6477c.execute(new C(d5, i));
                    break;
                }
                break;
            default:
                U2.j.i("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    S7 s7 = (S7) obj;
                    s7.f11506g.j(s7.a(str2, str).toString());
                    break;
                } catch (JSONException e5) {
                    U2.j.g("Error creating PACT Error Response JSON: ", e5);
                }
        }
    }

    @Override // c3.AbstractC0539a
    public final void b(J0 j02) {
        String format;
        String str = this.f6634b;
        Object obj = this.f6635c;
        int i = 0;
        int i5 = 1;
        switch (this.f6633a) {
            case 0:
                C0457a c0457a = (C0457a) obj;
                A a5 = c0457a.f6525k;
                String str2 = ((H3.e) j02.f304k).f2317k;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str);
                    jSONObject.put("signal", str2);
                    jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1281m8.f14476c.s()).booleanValue() ? ((Long) AbstractC1281m8.f.s()).longValue() : 0L);
                    if (((Boolean) AbstractC1281m8.f14474a.s()).booleanValue()) {
                        jSONObject.put("as", a5.a());
                    }
                    format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    String concat = ((Boolean) AbstractC1281m8.f14474a.s()).booleanValue() ? ",\"as\":".concat(a5.a().toString()) : "";
                    format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str, ((H3.e) j02.f304k).f2317k, Long.valueOf(((Boolean) AbstractC1281m8.f14476c.s()).booleanValue() ? ((Long) AbstractC1281m8.f.s()).longValue() : 0L), concat);
                }
                if (((Boolean) AbstractC1281m8.f14476c.s()).booleanValue()) {
                    try {
                        c0457a.f6523h.execute(new w(this, format, i5));
                    } catch (RuntimeException e3) {
                        P2.o.f4767B.f4774g.h("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e3);
                    }
                } else {
                    c0457a.f6518b.evaluateJavascript(format, null);
                }
                if (((Boolean) AbstractC1281m8.f14474a.s()).booleanValue() && ((Boolean) AbstractC1281m8.f14475b.s()).booleanValue()) {
                    D d5 = c0457a.f6526l;
                    d5.getClass();
                    d5.f6477c.execute(new C(d5, i));
                    break;
                }
                break;
            default:
                try {
                    S7 s7 = (S7) obj;
                    s7.f11506g.j(s7.b(str, ((H3.e) j02.f304k).f2317k).toString());
                    break;
                } catch (JSONException e5) {
                    U2.j.g("Error creating PACT Signal Response JSON: ", e5);
                }
        }
    }
}
