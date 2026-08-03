package a1;

/* loaded from: classes.dex */
public final class h implements a1.j {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.h f1947a = new a1.h();

    @Override // a1.j
    public final java.lang.Object decodeMessage(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            a1.p.f1952b.getClass();
            org.json.JSONTokener jSONTokener = new org.json.JSONTokener(a1.p.a(byteBuffer));
            java.lang.Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new java.lang.IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (org.json.JSONException e2) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // a1.j
    public final java.nio.ByteBuffer encodeMessage(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        java.lang.Object G = u0.AbstractC0995a.G(obj);
        if (G instanceof java.lang.String) {
            a1.p pVar = a1.p.f1952b;
            java.lang.String quote = org.json.JSONObject.quote((java.lang.String) G);
            pVar.getClass();
            return a1.p.b(quote);
        }
        a1.p pVar2 = a1.p.f1952b;
        java.lang.String obj2 = G.toString();
        pVar2.getClass();
        return a1.p.b(obj2);
    }
}
