package A5;

import Y4.D;
import io.sentry.protocol.Request;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes2.dex */
public final class m implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final m f675a = new m();

    @Override // A5.t
    public ByteBuffer a(o oVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Request.JsonKeys.METHOD, oVar.f676a);
            jSONObject.put("args", D.e0(oVar.f677b));
            Object e02 = D.e0(jSONObject);
            if (e02 instanceof String) {
                z zVar = z.f691b;
                String quote = JSONObject.quote((String) e02);
                zVar.getClass();
                return z.d(quote);
            }
            z zVar2 = z.f691b;
            String obj = e02.toString();
            zVar2.getClass();
            return z.d(obj);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // A5.t
    public o b(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    z.f691b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e7) {
                    throw new IllegalArgumentException("Invalid JSON", e7);
                }
            }
            if (nextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) nextValue;
                Object obj2 = jSONObject.get(Request.JsonKeys.METHOD);
                Object opt = jSONObject.opt("args");
                if (opt != JSONObject.NULL) {
                    obj = opt;
                }
                if (obj2 instanceof String) {
                    return new o((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }

    @Override // A5.t
    public ByteBuffer c(Object obj) {
        JSONArray put = new JSONArray().put(D.e0(obj));
        if (put == null) {
            return null;
        }
        Object e02 = D.e0(put);
        if (e02 instanceof String) {
            z zVar = z.f691b;
            String quote = JSONObject.quote((String) e02);
            zVar.getClass();
            return z.d(quote);
        }
        z zVar2 = z.f691b;
        String obj2 = e02.toString();
        zVar2.getClass();
        return z.d(obj2);
    }

    @Override // A5.t
    public ByteBuffer d(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(D.e0(str)).put(JSONObject.NULL).put(D.e0(str2));
        if (put == null) {
            return null;
        }
        Object e02 = D.e0(put);
        if (e02 instanceof String) {
            z zVar = z.f691b;
            String quote = JSONObject.quote((String) e02);
            zVar.getClass();
            return z.d(quote);
        }
        z zVar2 = z.f691b;
        String obj = e02.toString();
        zVar2.getClass();
        return z.d(obj);
    }

    @Override // A5.t
    public ByteBuffer e(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(D.e0(str2)).put(D.e0(obj));
        if (put == null) {
            return null;
        }
        Object e02 = D.e0(put);
        if (e02 instanceof String) {
            z zVar = z.f691b;
            String quote = JSONObject.quote((String) e02);
            zVar.getClass();
            return z.d(quote);
        }
        z zVar2 = z.f691b;
        String obj2 = e02.toString();
        zVar2.getClass();
        return z.d(obj2);
    }

    @Override // A5.t
    public Object f(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    z.f691b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e7) {
                    throw new IllegalArgumentException("Invalid JSON", e7);
                }
            } catch (JSONException e8) {
                throw new IllegalArgumentException("Invalid JSON", e8);
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
                    throw new k((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }
}
