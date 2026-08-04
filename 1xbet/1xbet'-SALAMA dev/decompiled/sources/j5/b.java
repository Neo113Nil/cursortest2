package j5;

import A5.o;
import A5.r;
import java.util.Map;
import org.json.JSONObject;
import p113p3.f;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1010l1 f14645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f14646e;

    public b(o oVar, r rVar) {
        super(27);
        this.f14646e = oVar;
        this.f14645d = new C1010l1(rVar);
    }

    @Override // p113p3.f
    public final Object I(String str) {
        return this.f14646e.a(str);
    }

    @Override // p113p3.f
    public final String K() {
        return this.f14646e.f676a;
    }

    @Override // p113p3.f
    public final c M() {
        return this.f14645d;
    }

    @Override // p113p3.f
    public final boolean Q() {
        Object obj = this.f14646e.f677b;
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
