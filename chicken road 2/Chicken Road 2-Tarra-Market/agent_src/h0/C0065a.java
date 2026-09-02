package h0;

import C0.t;
import a.AbstractC0009a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065a extends AbstractC0009a {

    /* renamed from: j, reason: collision with root package name */
    public final Map f1212j;

    /* renamed from: k, reason: collision with root package name */
    public final t f1213k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1214l;

    public C0065a(Map map, boolean z2) {
        super(17);
        this.f1213k = new t();
        this.f1212j = map;
        this.f1214l = z2;
    }

    public final void L(ArrayList arrayList) {
        if (this.f1214l) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        t tVar = this.f1213k;
        hashMap2.put("code", (String) tVar.f116a);
        hashMap2.put("message", (String) tVar.f117b);
        hashMap2.put("data", (HashMap) tVar.f119d);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    public final void M(ArrayList arrayList) {
        if (this.f1214l) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", (Serializable) this.f1213k.f118c);
        arrayList.add(hashMap);
    }

    @Override // a.AbstractC0009a
    public final Object l(String str) {
        return this.f1212j.get(str);
    }

    @Override // a.AbstractC0009a
    public final String m() {
        return (String) this.f1212j.get("method");
    }

    @Override // a.AbstractC0009a
    public final boolean n() {
        return this.f1214l;
    }

    @Override // a.AbstractC0009a
    public final c o() {
        return this.f1213k;
    }

    @Override // a.AbstractC0009a
    public final boolean q() {
        return this.f1212j.containsKey("transactionId");
    }
}
