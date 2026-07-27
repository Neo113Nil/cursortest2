package T1;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1466a = new i();

    @Override // T1.k
    public final Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            t.f1476b.getClass();
            JSONTokener jSONTokener = new JSONTokener(t.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // T1.k
    public final ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object N2 = X0.a.N(obj);
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
}
