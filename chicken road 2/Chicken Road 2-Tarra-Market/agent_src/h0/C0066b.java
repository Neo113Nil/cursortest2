package h0;

import C0.p;
import Y.e;
import a.AbstractC0009a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066b extends AbstractC0009a {

    /* renamed from: j, reason: collision with root package name */
    public final C0.a f1215j;

    /* renamed from: k, reason: collision with root package name */
    public final e f1216k;

    public C0066b(e eVar, p pVar) {
        super(17);
        this.f1216k = eVar;
        this.f1215j = new C0.a(29, pVar);
    }

    @Override // a.AbstractC0009a
    public final Object l(String str) {
        return this.f1216k.n(str);
    }

    @Override // a.AbstractC0009a
    public final String m() {
        return (String) this.f1216k.f523b;
    }

    @Override // a.AbstractC0009a
    public final c o() {
        return this.f1215j;
    }

    @Override // a.AbstractC0009a
    public final boolean q() {
        Object obj = this.f1216k.f524c;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey("transactionId");
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has("transactionId");
        }
        throw new ClassCastException();
    }
}
