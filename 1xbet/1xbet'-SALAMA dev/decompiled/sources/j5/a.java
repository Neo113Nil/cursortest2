package j5;

import io.sentry.protocol.Request;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p113p3.f;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f14642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F0 f14643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14644f;

    public a(Map map, boolean z4) {
        super(27);
        this.f14643e = new F0(15, false);
        this.f14642d = map;
        this.f14644f = z4;
    }

    @Override // p113p3.f
    public final Object I(String str) {
        return this.f14642d.get(str);
    }

    @Override // p113p3.f
    public final String K() {
        return (String) this.f14642d.get(Request.JsonKeys.METHOD);
    }

    @Override // p113p3.f
    public final boolean L() {
        return this.f14644f;
    }

    @Override // p113p3.f
    public final c M() {
        return this.f14643e;
    }

    @Override // p113p3.f
    public final boolean Q() {
        return this.f14642d.containsKey("transactionId");
    }

    public final void m0(ArrayList arrayList) {
        if (this.f14644f) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        F0 f7 = this.f14643e;
        map2.put("code", (String) f7.f17381d);
        map2.put("message", (String) f7.f17382e);
        map2.put("data", (HashMap) f7.f17380c);
        map.put("error", map2);
        arrayList.add(map);
    }

    public final void n0(ArrayList arrayList) {
        if (this.f14644f) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", (Serializable) this.f14643e.f17379b);
        arrayList.add(map);
    }
}
