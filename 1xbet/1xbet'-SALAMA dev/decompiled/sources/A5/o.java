package A5;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f677b;

    public o(String str, Object obj) {
        this.f676a = str;
        this.f677b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f677b;
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
