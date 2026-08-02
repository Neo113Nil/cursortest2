package A5;

import Y4.D;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes2.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final l f674a = new l();

    @Override // A5.n
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object e02 = D.e0(obj);
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

    @Override // A5.n
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            z.f691b.getClass();
            JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }
}
