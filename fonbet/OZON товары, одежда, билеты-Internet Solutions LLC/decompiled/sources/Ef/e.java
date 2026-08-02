package Ef;

import Hf.z;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final z f7871a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7872b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7873c;

    /* renamed from: d, reason: collision with root package name */
    public final e f7874d;

    /* renamed from: e, reason: collision with root package name */
    public final f f7875e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7876f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7877g = false;

    private e(z zVar, int i11, e eVar, f fVar, boolean z11) {
        this.f7871a = zVar;
        this.f7872b = i11;
        this.f7873c = z11;
        this.f7874d = eVar;
        this.f7875e = fVar;
    }

    public static e a(z zVar, int i11, e eVar, f fVar) {
        return new e(zVar, i11, eVar, fVar, true);
    }

    public static e b(z zVar, int i11, e eVar, f fVar) {
        return new e(zVar, i11, eVar, fVar, false);
    }
}
