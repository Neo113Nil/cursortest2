package I3;

/* loaded from: classes.dex */
public class P implements F3.z {
    @Override // F3.z
    public final F3.y a(F3.m mVar, M3.a aVar) {
        Class cls = aVar.f3616a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new C0190u(cls);
    }
}
