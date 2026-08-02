package w1;

import java.util.Locale;
import org.json.JSONObject;

/* renamed from: w1.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1749u0 {

    /* renamed from: c, reason: collision with root package name */
    public static String f17876c;

    /* renamed from: d, reason: collision with root package name */
    public static String f17877d;

    /* renamed from: a, reason: collision with root package name */
    public int f17878a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17879b;

    public final String a() {
        Object obj = this.f17879b;
        if (obj == null) {
            return null;
        }
        if (this.f17878a != 2) {
            return (String) obj;
        }
        if (f17876c == null) {
            f17876c = Locale.getDefault().toString();
            f17877d = Locale.getDefault().getLanguage();
        }
        JSONObject jSONObject = (JSONObject) obj;
        String optString = jSONObject.optString(f17876c, null);
        if (optString == null) {
            optString = jSONObject.optString(f17877d, null);
        }
        return optString == null ? jSONObject.optString("default") : optString;
    }
}
