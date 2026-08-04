package p155w1;

import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1040u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f17882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f17883d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17885b;

    public final String a() {
        Object obj = this.f17885b;
        if (obj == null) {
            return null;
        }
        if (this.f17884a != 2) {
            return (String) obj;
        }
        if (f17882c == null) {
            f17882c = Locale.getDefault().toString();
            f17883d = Locale.getDefault().getLanguage();
        }
        JSONObject jSONObject = (JSONObject) obj;
        String strOptString = jSONObject.optString(f17882c, null);
        if (strOptString == null) {
            strOptString = jSONObject.optString(f17883d, null);
        }
        return strOptString == null ? jSONObject.optString("default") : strOptString;
    }
}
