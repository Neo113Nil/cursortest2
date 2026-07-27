package H2;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1145a = new j();

    @Override // H2.p
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(e5.g.B(obj));
        if (put == null) {
            return null;
        }
        Object B5 = e5.g.B(put);
        if (B5 instanceof String) {
            t tVar = t.f1154b;
            String quote = JSONObject.quote((String) B5);
            tVar.getClass();
            return t.b(quote);
        }
        t tVar2 = t.f1154b;
        String obj2 = B5.toString();
        tVar2.getClass();
        return t.b(obj2);
    }

    @Override // H2.p
    public ByteBuffer b(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(e5.g.B(str)).put(JSONObject.NULL).put(e5.g.B(str2));
        if (put == null) {
            return null;
        }
        Object B5 = e5.g.B(put);
        if (B5 instanceof String) {
            t tVar = t.f1154b;
            String quote = JSONObject.quote((String) B5);
            tVar.getClass();
            return t.b(quote);
        }
        t tVar2 = t.f1154b;
        String obj = B5.toString();
        tVar2.getClass();
        return t.b(obj);
    }

    @Override // H2.p
    public ByteBuffer c(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(e5.g.B(str2)).put(e5.g.B(obj));
        if (put == null) {
            return null;
        }
        Object B5 = e5.g.B(put);
        if (B5 instanceof String) {
            t tVar = t.f1154b;
            String quote = JSONObject.quote((String) B5);
            tVar.getClass();
            return t.b(quote);
        }
        t tVar2 = t.f1154b;
        String obj2 = B5.toString();
        tVar2.getClass();
        return t.b(obj2);
    }

    @Override // H2.p
    public l d(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    t.f1154b.getClass();
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
        } catch (JSONException e6) {
            throw new IllegalArgumentException("Invalid JSON", e6);
        }
    }

    @Override // H2.p
    public Object e(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    t.f1154b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(t.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e3) {
                    throw new IllegalArgumentException("Invalid JSON", e3);
                }
            } catch (JSONException e6) {
                throw new IllegalArgumentException("Invalid JSON", e6);
            }
        }
        if (nextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) nextValue;
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
    }

    @Override // H2.p
    public ByteBuffer f(l lVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", lVar.f1146a);
            jSONObject.put("args", e5.g.B(lVar.f1147b));
            Object B5 = e5.g.B(jSONObject);
            if (B5 instanceof String) {
                t tVar = t.f1154b;
                String quote = JSONObject.quote((String) B5);
                tVar.getClass();
                return t.b(quote);
            }
            t tVar2 = t.f1154b;
            String obj = B5.toString();
            tVar2.getClass();
            return t.b(obj);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
