package A5;

import Y4.D;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f674a = new l();

    @Override // A5.n
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objE0 = D.e0(obj);
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

    @Override // A5.n
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            z.f691b.getClass();
            JSONTokener jSONTokener = new JSONTokener(z.c(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }
}
