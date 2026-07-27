package H2;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1144a = new i();

    @Override // H2.k
    public final Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            t.f1154b.getClass();
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

    @Override // H2.k
    public final ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object B5 = e5.g.B(obj);
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
}
