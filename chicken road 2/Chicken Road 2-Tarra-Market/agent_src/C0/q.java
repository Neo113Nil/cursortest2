package C0;

import java.util.HashMap;
import u0.C0840b;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f105a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f106b;

    /* renamed from: c, reason: collision with root package name */
    public final t f107c;

    /* renamed from: d, reason: collision with root package name */
    public p f108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f109e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f110f;

    public q(C0840b c0840b, boolean z2) {
        t tVar = new t(c0840b, "flutter/restoration", D0.n.f167b, null);
        this.f109e = false;
        this.f110f = false;
        a aVar = new a(12, this);
        this.f107c = tVar;
        this.f105a = z2;
        tVar.j(aVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
