package i1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final o f1430a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1431b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1432c;

    /* renamed from: d, reason: collision with root package name */
    public final H0.b f1433d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f1434e;

    /* renamed from: f, reason: collision with root package name */
    public volatile c f1435f;

    public w(v vVar) {
        this.f1430a = vVar.f1425a;
        this.f1431b = vVar.f1426b;
        l lVar = vVar.f1427c;
        lVar.getClass();
        this.f1432c = new m(lVar);
        this.f1433d = vVar.f1428d;
        byte[] bArr = j1.d.f6053a;
        Map map = vVar.f1429e;
        this.f1434e = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final v a() {
        v vVar = new v();
        vVar.f1429e = Collections.emptyMap();
        vVar.f1425a = this.f1430a;
        vVar.f1426b = this.f1431b;
        vVar.f1428d = this.f1433d;
        Map map = this.f1434e;
        vVar.f1429e = map.isEmpty() ? Collections.emptyMap() : new LinkedHashMap(map);
        vVar.f1427c = this.f1432c.c();
        return vVar;
    }

    public final String toString() {
        return "Request{method=" + this.f1431b + ", url=" + this.f1430a + ", tags=" + this.f1434e + '}';
    }
}
