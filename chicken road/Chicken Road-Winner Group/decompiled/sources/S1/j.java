package S1;

import T1.s;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1428a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1429b;

    /* renamed from: c, reason: collision with root package name */
    public final T1.o f1430c;

    /* renamed from: d, reason: collision with root package name */
    public i f1431d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1432e;
    public boolean f;

    public j(K1.b bVar, boolean z3) {
        T1.o oVar = new T1.o(bVar, "flutter/restoration", s.f1473b);
        this.f1432e = false;
        this.f = false;
        b0.i iVar = new b0.i(18, this);
        this.f1430c = oVar;
        this.f1428a = z3;
        oVar.b(iVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
