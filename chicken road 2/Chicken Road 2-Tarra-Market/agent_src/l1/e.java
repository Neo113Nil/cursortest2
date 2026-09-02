package l1;

import i1.A;
import i1.C0070a;
import i1.C0071b;
import i1.u;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C0070a f6105a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.plugin.editing.a f6106b;

    /* renamed from: c, reason: collision with root package name */
    public final C0071b f6107c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6108d;

    /* renamed from: e, reason: collision with root package name */
    public int f6109e;

    /* renamed from: f, reason: collision with root package name */
    public List f6110f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6111g = new ArrayList();

    public e(C0070a c0070a, io.flutter.plugin.editing.a aVar, u uVar, C0071b c0071b) {
        this.f6108d = Collections.emptyList();
        this.f6105a = c0070a;
        this.f6106b = aVar;
        this.f6107c = c0071b;
        List<Proxy> select = c0070a.f1285g.select(c0070a.f1279a.k());
        this.f6108d = (select == null || select.isEmpty()) ? j1.d.k(Proxy.NO_PROXY) : Collections.unmodifiableList(new ArrayList(select));
        this.f6109e = 0;
    }

    public final void a(A a2, IOException iOException) {
        C0070a c0070a;
        ProxySelector proxySelector;
        if (a2.f1270b.type() != Proxy.Type.DIRECT && (proxySelector = (c0070a = this.f6105a).f1285g) != null) {
            proxySelector.connectFailed(c0070a.f1279a.k(), a2.f1270b.address(), iOException);
        }
        io.flutter.plugin.editing.a aVar = this.f6106b;
        synchronized (aVar) {
            ((LinkedHashSet) aVar.f5792b).add(a2);
        }
    }
}
