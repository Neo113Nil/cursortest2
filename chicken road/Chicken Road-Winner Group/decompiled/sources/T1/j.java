package T1;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1467a = new j();

    @Override // T1.p
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(X0.a.N(obj));
        if (put == null) {
            return null;
        }
        Object N2 = X0.a.N(put);
        if (N2 instanceof String) {
            t tVar = t.f1476b;
            String quote = JSONObject.quote((String) N2);
            tVar.getClass();
            return t.b(quote);
        }
        t tVar2 = t.f1476b;
        String obj2 = N2.toString();
        tVar2.getClass();
        return t.b(obj2);
    }

    @Override // T1.p
    public ByteBuffer b(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(X0.a.N(str)).put(JSONObject.NULL).put(X0.a.N(str2));
        if (put == null) {
            return null;
        }
        Object N2 = X0.a.N(put);
        if (N2 instanceof String) {
            t tVar = t.f1476b;
            String quote = JSONObject.quote((String) N2);
            tVar.getClass();
            return t.b(quote);
        }
        t tVar2 = t.f1476b;
        String obj = N2.toString();
        tVar2.getClass();
        return t.b(obj);
    }

    @Override // T1.p
    public ByteBuffer c(l lVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", lVar.f1468a);
            jSONObject.put("args", X0.a.N(lVar.f1469b));
            Object N2 = X0.a.N(jSONObject);
            if (N2 instanceof String) {
                t tVar = t.f1476b;
                String quote = JSONObject.quote((String) N2);
                tVar.getClass();
                return t.b(quote);
            }
            t tVar2 = t.f1476b;
            String obj = N2.toString();
            tVar2.getClass();
            return t.b(obj);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // T1.p
    public ByteBuffer d(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(X0.a.N(str2)).put(X0.a.N(obj));
        if (put == null) {
            return null;
        }
        Object N2 = X0.a.N(put);
        if (N2 instanceof String) {
            t tVar = t.f1476b;
            String quote = JSONObject.quote((String) N2);
            tVar.getClass();
            return t.b(quote);
        }
        t tVar2 = t.f1476b;
        String obj2 = N2.toString();
        tVar2.getClass();
        return t.b(obj2);
    }

    @Override // T1.p
    public l e(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    t.f1476b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(t.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e3) {
                    throw new IllegalArgumentException("Invalid JSON", e3);
                }
            }
            if (nextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) nextValue;
                Object obj2 = jSONObject.get("method");
                Object opt = jSONObject.opt("args");
                if (opt != JSONObject.NULL) {
                    obj = opt;
                }
                if (obj2 instanceof String) {
                    return new l(obj, (String) obj2);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // T1.p
    public Object f(ByteBuffer byteBuffer) {
        try {
            try {
                t.f1476b.getClass();
                JSONTokener jSONTokener = new JSONTokener(t.a(byteBuffer));
                Object nextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (nextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) nextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object opt = jSONArray.opt(0);
                        if (opt == JSONObject.NULL) {
                            return null;
                        }
                        return opt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object opt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (opt2 == obj3) {
                            opt2 = null;
                        }
                        Object opt3 = jSONArray.opt(2);
                        if (opt3 != obj3) {
                            obj = opt3;
                        }
                        if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                            throw new h((String) obj2, (String) opt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }
}
