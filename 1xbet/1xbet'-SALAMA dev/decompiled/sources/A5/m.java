package A5;

import Y4.D;
import io.sentry.protocol.Request;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f675a = new m();

    @Override // A5.t
    public ByteBuffer a(o oVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Request.JsonKeys.METHOD, oVar.f676a);
            jSONObject.put("args", D.e0(oVar.f677b));
            Object objE0 = D.e0(jSONObject);
            if (objE0 instanceof String) {
                z zVar = z.f691b;
                String strQuote = JSONObject.quote((String) objE0);
                zVar.getClass();
                return z.d(strQuote);
            }
            z zVar2 = z.f691b;
            String string = objE0.toString();
            zVar2.getClass();
            return z.d(string);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // A5.t
    public o b(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                objNextValue = null;
            } else {
                try {
                    z.f691b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e7) {
                    throw new IllegalArgumentException("Invalid JSON", e7);
                }
            }
            if (objNextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objNextValue;
                Object obj2 = jSONObject.get(Request.JsonKeys.METHOD);
                Object objOpt = jSONObject.opt("args");
                if (objOpt != JSONObject.NULL) {
                    obj = objOpt;
                }
                if (obj2 instanceof String) {
                    return new o((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objNextValue);
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }

    @Override // A5.t
    public ByteBuffer c(Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(D.e0(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objE0 = D.e0(jSONArrayPut);
        if (objE0 instanceof String) {
            z zVar = z.f691b;
            String strQuote = JSONObject.quote((String) objE0);
            zVar.getClass();
            return z.d(strQuote);
        }
        z zVar2 = z.f691b;
        String string = objE0.toString();
        zVar2.getClass();
        return z.d(string);
    }

    @Override // A5.t
    public ByteBuffer d(String str, String str2) {
        JSONArray jSONArrayPut = new JSONArray().put("error").put(D.e0(str)).put(JSONObject.NULL).put(D.e0(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objE0 = D.e0(jSONArrayPut);
        if (objE0 instanceof String) {
            z zVar = z.f691b;
            String strQuote = JSONObject.quote((String) objE0);
            zVar.getClass();
            return z.d(strQuote);
        }
        z zVar2 = z.f691b;
        String string = objE0.toString();
        zVar2.getClass();
        return z.d(string);
    }

    @Override // A5.t
    public ByteBuffer e(String str, String str2, Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(D.e0(str2)).put(D.e0(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objE0 = D.e0(jSONArrayPut);
        if (objE0 instanceof String) {
            z zVar = z.f691b;
            String strQuote = JSONObject.quote((String) objE0);
            zVar.getClass();
            return z.d(strQuote);
        }
        z zVar2 = z.f691b;
        String string = objE0.toString();
        zVar2.getClass();
        return z.d(string);
    }

    @Override // A5.t
    public Object f(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        if (byteBuffer == null) {
            objNextValue = null;
        } else {
            try {
                try {
                    z.f691b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
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
        if (objNextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) objNextValue;
            if (jSONArray.length() == 1) {
                Object objOpt = jSONArray.opt(0);
                if (objOpt == JSONObject.NULL) {
                    return null;
                }
                return objOpt;
            }
            if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object objOpt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (objOpt2 == obj3) {
                    objOpt2 = null;
                }
                Object objOpt3 = jSONArray.opt(2);
                if (objOpt3 != obj3) {
                    obj = objOpt3;
                }
                if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                    throw new k((String) obj2, (String) objOpt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
    }
}
