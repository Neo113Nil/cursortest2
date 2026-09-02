package P;

import a.AbstractC0018a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class h implements i, k {

    /* renamed from: a, reason: collision with root package name */
    public static final h f364a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final h f365b = new h();

    @Override // P.i
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            o.f371b.getClass();
            JSONTokener jSONTokener = new JSONTokener(o.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // P.i
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object F2 = AbstractC0018a.F(obj);
        if (F2 instanceof String) {
            o oVar = o.f371b;
            String quote = JSONObject.quote((String) F2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f371b;
        String obj2 = F2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }

    @Override // P.k
    public ByteBuffer c(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC0018a.F(obj));
        if (put == null) {
            return null;
        }
        Object F2 = AbstractC0018a.F(put);
        if (F2 instanceof String) {
            o oVar = o.f371b;
            String quote = JSONObject.quote((String) F2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f371b;
        String obj2 = F2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }

    @Override // P.k
    public C.a d(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    o.f371b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(o.c(byteBuffer));
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
                return new C.a(12, (String) obj2, obj);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // P.k
    public Object e(ByteBuffer byteBuffer) {
        try {
            try {
                o.f371b.getClass();
                JSONTokener jSONTokener = new JSONTokener(o.c(byteBuffer));
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
                            throw new g((String) obj2, (String) opt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            } catch (JSONException e2) {
                throw new IllegalArgumentException("Invalid JSON", e2);
            }
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // P.k
    public ByteBuffer f(C.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) aVar.f4c);
            jSONObject.put("args", AbstractC0018a.F(aVar.f5d));
            Object F2 = AbstractC0018a.F(jSONObject);
            if (F2 instanceof String) {
                o oVar = o.f371b;
                String quote = JSONObject.quote((String) F2);
                oVar.getClass();
                return o.d(quote);
            }
            o oVar2 = o.f371b;
            String obj = F2.toString();
            oVar2.getClass();
            return o.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // P.k
    public ByteBuffer g(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC0018a.F(str)).put(JSONObject.NULL).put(AbstractC0018a.F(str2));
        if (put == null) {
            return null;
        }
        Object F2 = AbstractC0018a.F(put);
        if (F2 instanceof String) {
            o oVar = o.f371b;
            String quote = JSONObject.quote((String) F2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f371b;
        String obj = F2.toString();
        oVar2.getClass();
        return o.d(obj);
    }

    @Override // P.k
    public ByteBuffer h(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC0018a.F(str2)).put(AbstractC0018a.F(obj));
        if (put == null) {
            return null;
        }
        Object F2 = AbstractC0018a.F(put);
        if (F2 instanceof String) {
            o oVar = o.f371b;
            String quote = JSONObject.quote((String) F2);
            oVar.getClass();
            return o.d(quote);
        }
        o oVar2 = o.f371b;
        String obj2 = F2.toString();
        oVar2.getClass();
        return o.d(obj2);
    }
}
