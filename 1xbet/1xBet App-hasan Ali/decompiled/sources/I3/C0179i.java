package I3;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: I3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179i implements F3.z {

    /* renamed from: m, reason: collision with root package name */
    public static final C0178h f2650m;

    /* renamed from: k, reason: collision with root package name */
    public final j3.i f2651k;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f2652l = new ConcurrentHashMap();

    static {
        int i = 0;
        f2650m = new C0178h(i);
        new C0178h(i);
    }

    public C0179i(j3.i iVar) {
        this.f2651k = iVar;
    }

    @Override // F3.z
    public final F3.y a(F3.m mVar, M3.a aVar) {
        G3.a aVar2 = (G3.a) aVar.f3616a.getAnnotation(G3.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f2651k, mVar, aVar, aVar2, true);
    }

    public final F3.y b(j3.i iVar, F3.m mVar, M3.a aVar, G3.a aVar2, boolean z3) {
        F3.y a5;
        F3.z zVar;
        Object k5 = iVar.r(new M3.a(aVar2.value())).k();
        boolean nullSafe = aVar2.nullSafe();
        if (k5 instanceof F3.y) {
            a5 = (F3.y) k5;
        } else {
            if (!(k5 instanceof F3.z)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + k5.getClass().getName() + " as a @JsonAdapter for " + H3.d.k(aVar.f3617b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            F3.z zVar2 = (F3.z) k5;
            if (z3 && (zVar = (F3.z) this.f2652l.putIfAbsent(aVar.f3616a, zVar2)) != null) {
                zVar2 = zVar;
            }
            a5 = zVar2.a(mVar, aVar);
        }
        return (a5 == null || !nullSafe) ? a5 : new F3.k(a5, 2);
    }
}
