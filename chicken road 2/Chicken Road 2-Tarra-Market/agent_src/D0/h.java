package D0;

import a.AbstractC0009a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class h implements i, k {

    /* renamed from: a, reason: collision with root package name */
    public static final h f165a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final h f166b = new h();

    @Override // D0.k
    public ByteBuffer a(Y.e eVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) eVar.f523b);
            jSONObject.put("args", AbstractC0009a.J(eVar.f524c));
            Object J2 = AbstractC0009a.J(jSONObject);
            if (J2 instanceof String) {
                o oVar = o.f170b;
                String quote = JSONObject.quote((String) J2);
                oVar.getClass();
                return o.b(quote);
            }
            o oVar2 = o.f170b;
            String obj = J2.toString();
            oVar2.getClass();
            return o.b(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // D0.k
    public ByteBuffer b(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC0009a.J(obj));
        if (put == null) {
            return null;
        }
        Object J2 = AbstractC0009a.J(put);
        if (J2 instanceof String) {
            o oVar = o.f170b;
            String quote = JSONObject.quote((String) J2);
            oVar.getClass();
            return o.b(quote);
        }
        o oVar2 = o.f170b;
        String obj2 = J2.toString();
        oVar2.getClass();
        return o.b(obj2);
    }

    @Override // D0.k
    public Y.e c(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    o.f170b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
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
                return new Y.e((String) obj2, obj, 9, false);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // D0.k
    public Object d(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    o.f170b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
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
                    throw new g((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }

    @Override // D0.i
    public Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            o.f170b.getClass();
            JSONTokener jSONTokener = new JSONTokener(o.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // D0.k
    public ByteBuffer e(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC0009a.J(str)).put(JSONObject.NULL).put(AbstractC0009a.J(str2));
        if (put == null) {
            return null;
        }
        Object J2 = AbstractC0009a.J(put);
        if (J2 instanceof String) {
            o oVar = o.f170b;
            String quote = JSONObject.quote((String) J2);
            oVar.getClass();
            return o.b(quote);
        }
        o oVar2 = o.f170b;
        String obj = J2.toString();
        oVar2.getClass();
        return o.b(obj);
    }

    @Override // D0.i
    public ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object J2 = AbstractC0009a.J(obj);
        if (J2 instanceof String) {
            o oVar = o.f170b;
            String quote = JSONObject.quote((String) J2);
            oVar.getClass();
            return o.b(quote);
        }
        o oVar2 = o.f170b;
        String obj2 = J2.toString();
        oVar2.getClass();
        return o.b(obj2);
    }

    @Override // D0.k
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC0009a.J(str2)).put(AbstractC0009a.J(obj));
        if (put == null) {
            return null;
        }
        Object J2 = AbstractC0009a.J(put);
        if (J2 instanceof String) {
            o oVar = o.f170b;
            String quote = JSONObject.quote((String) J2);
            oVar.getClass();
            return o.b(quote);
        }
        o oVar2 = o.f170b;
        String obj2 = J2.toString();
        oVar2.getClass();
        return o.b(obj2);
    }
}
