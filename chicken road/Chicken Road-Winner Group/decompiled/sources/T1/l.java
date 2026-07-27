package T1;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f1468a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1469b;

    public l(Object obj, String str) {
        this.f1468a = str;
        this.f1469b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f1469b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }
}
