package j5;

import A5.o;
import A5.r;
import java.util.Map;
import org.json.JSONObject;
import p3.f;
import w1.C1719l1;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: d, reason: collision with root package name */
    public final C1719l1 f14639d;

    /* renamed from: e, reason: collision with root package name */
    public final o f14640e;

    public b(o oVar, r rVar) {
        super(27);
        this.f14640e = oVar;
        this.f14639d = new C1719l1(rVar);
    }

    @Override // p3.f
    public final Object I(String str) {
        return this.f14640e.a(str);
    }

    @Override // p3.f
    public final String K() {
        return this.f14640e.f676a;
    }

    @Override // p3.f
    public final c M() {
        return this.f14639d;
    }

    @Override // p3.f
    public final boolean Q() {
        Object obj = this.f14640e.f677b;
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
