package G2;

import H2.s;
import java.util.HashMap;
import y2.C1557b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f970a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f971b;

    /* renamed from: c, reason: collision with root package name */
    public final H2.o f972c;

    /* renamed from: d, reason: collision with root package name */
    public i f973d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f974e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f975f;

    public j(C1557b c1557b, boolean z) {
        H2.o oVar = new H2.o(c1557b, "flutter/restoration", s.f1151b);
        this.f974e = false;
        this.f975f = false;
        B1.g gVar = new B1.g(13, this);
        this.f972c = oVar;
        this.f970a = z;
        oVar.b(gVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
