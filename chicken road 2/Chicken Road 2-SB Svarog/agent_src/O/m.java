package O;

import F.t;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f327a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f328b;

    /* renamed from: c, reason: collision with root package name */
    public final E.b f329c;

    /* renamed from: d, reason: collision with root package name */
    public l f330d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f331e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f332f;

    public m(H.b bVar, boolean z2) {
        E.b bVar2 = new E.b(bVar, "flutter/restoration", P.n.f369a);
        this.f331e = false;
        this.f332f = false;
        t tVar = new t(16, this);
        this.f329c = bVar2;
        this.f327a = z2;
        bVar2.h(tVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
