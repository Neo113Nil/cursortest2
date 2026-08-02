package j5;

import io.sentry.protocol.Request;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p3.f;
import w1.F0;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: d, reason: collision with root package name */
    public final Map f14636d;

    /* renamed from: e, reason: collision with root package name */
    public final F0 f14637e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14638f;

    public a(Map map, boolean z4) {
        super(27);
        this.f14637e = new F0(15, false);
        this.f14636d = map;
        this.f14638f = z4;
    }

    @Override // p3.f
    public final Object I(String str) {
        return this.f14636d.get(str);
    }

    @Override // p3.f
    public final String K() {
        return (String) this.f14636d.get(Request.JsonKeys.METHOD);
    }

    @Override // p3.f
    public final boolean L() {
        return this.f14638f;
    }

    @Override // p3.f
    public final c M() {
        return this.f14637e;
    }

    @Override // p3.f
    public final boolean Q() {
        return this.f14636d.containsKey("transactionId");
    }

    public final void m0(ArrayList arrayList) {
        if (this.f14638f) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        F0 f02 = this.f14637e;
        hashMap2.put("code", (String) f02.f17375d);
        hashMap2.put("message", (String) f02.f17376e);
        hashMap2.put("data", (HashMap) f02.f17374c);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    public final void n0(ArrayList arrayList) {
        if (this.f14638f) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", (Serializable) this.f14637e.f17373b);
        arrayList.add(hashMap);
    }
}
